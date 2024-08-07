package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.d;
import androidx.window.layout.t;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import ek.i;
import fk.r;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n3.f;
import sk.j;

/* compiled from: SidecarCompat.kt */
public final class SidecarCompat implements d {

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f3651a;

    /* renamed from: b  reason: collision with root package name */
    public final n f3652b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f3653c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f3654d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public b f3655e;

    /* compiled from: SidecarCompat.kt */
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a  reason: collision with root package name */
        public final n f3656a;

        /* renamed from: b  reason: collision with root package name */
        public final SidecarInterface.SidecarCallback f3657b;

        /* renamed from: c  reason: collision with root package name */
        public final ReentrantLock f3658c = new ReentrantLock();

        /* renamed from: d  reason: collision with root package name */
        public SidecarDeviceState f3659d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f3660e = new WeakHashMap<>();

        public DistinctSidecarElementCallback(n nVar, SidecarInterface.SidecarCallback sidecarCallback) {
            j.f(nVar, "sidecarAdapter");
            this.f3656a = nVar;
            this.f3657b = sidecarCallback;
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            j.f(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f3658c;
            reentrantLock.lock();
            try {
                n nVar = this.f3656a;
                SidecarDeviceState sidecarDeviceState2 = this.f3659d;
                nVar.getClass();
                if (!n.a(sidecarDeviceState2, sidecarDeviceState)) {
                    this.f3659d = sidecarDeviceState;
                    this.f3657b.onDeviceStateChanged(sidecarDeviceState);
                    i iVar = i.f20112a;
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            j.f(iBinder, "token");
            j.f(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f3658c) {
                this.f3656a.getClass();
                if (!n.d(this.f3660e.get(iBinder), sidecarWindowLayoutInfo)) {
                    SidecarWindowLayoutInfo put = this.f3660e.put(iBinder, sidecarWindowLayoutInfo);
                    this.f3657b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SidecarCompat f3661a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            j.f(sidecarCompat, "this$0");
            this.f3661a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface g2;
            j.f(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = this.f3661a.f3653c.values();
            SidecarCompat sidecarCompat = this.f3661a;
            for (Activity activity : values) {
                IBinder a10 = a.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(a10 == null || (g2 = sidecarCompat.g()) == null)) {
                    sidecarWindowLayoutInfo = g2.getWindowLayoutInfo(a10);
                }
                b d10 = sidecarCompat.f3655e;
                if (d10 != null) {
                    d10.a(activity, sidecarCompat.f3652b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            j.f(iBinder, "windowToken");
            j.f(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f3661a.f3653c.get(iBinder);
            if (activity != null) {
                n e10 = this.f3661a.f3652b;
                SidecarInterface g2 = this.f3661a.g();
                if (g2 == null) {
                    sidecarDeviceState = null;
                } else {
                    sidecarDeviceState = g2.getDeviceState();
                }
                if (sidecarDeviceState == null) {
                    sidecarDeviceState = new SidecarDeviceState();
                }
                z e11 = e10.e(sidecarWindowLayoutInfo, sidecarDeviceState);
                b d10 = this.f3661a.f3655e;
                if (d10 != null) {
                    d10.a(activity, e11);
                }
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class a {
        public static IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public static SidecarInterface b(Context context) {
            j.f(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public static f c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    f fVar = f.f13491f;
                    return f.a.a(apiVersion);
                }
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            }
            return null;
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final d.a f3662a;

        /* renamed from: b  reason: collision with root package name */
        public final ReentrantLock f3663b = new ReentrantLock();

        /* renamed from: c  reason: collision with root package name */
        public final WeakHashMap<Activity, z> f3664c = new WeakHashMap<>();

        public b(t.a aVar) {
            this.f3662a = aVar;
        }

        public final void a(Activity activity, z zVar) {
            j.f(activity, "activity");
            ReentrantLock reentrantLock = this.f3663b;
            reentrantLock.lock();
            try {
                if (!j.a(zVar, this.f3664c.get(activity))) {
                    z put = this.f3664c.put(activity, zVar);
                    reentrantLock.unlock();
                    this.f3662a.a(activity, zVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final SidecarCompat f3665a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<Activity> f3666b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            j.f(sidecarCompat, "sidecarCompat");
            j.f(activity, "activity");
            this.f3665a = sidecarCompat;
            this.f3666b = new WeakReference<>(activity);
        }

        public final void onViewAttachedToWindow(View view) {
            Window window;
            WindowManager.LayoutParams attributes;
            j.f(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f3666b.get();
            IBinder iBinder = null;
            if (!(activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null)) {
                iBinder = attributes.token;
            }
            if (activity != null && iBinder != null) {
                this.f3665a.i(iBinder, activity);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            j.f(view, "view");
        }
    }

    public SidecarCompat(Context context) {
        j.f(context, "context");
        SidecarInterface b10 = a.b(context);
        n nVar = new n(0);
        this.f3651a = b10;
        this.f3652b = nVar;
    }

    public final void a(Activity activity) {
        j.f(activity, "activity");
        IBinder a10 = a.a(activity);
        if (a10 != null) {
            i(a10, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
    }

    public final void b(t.a aVar) {
        this.f3655e = new b(aVar);
        SidecarInterface sidecarInterface = this.f3651a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f3652b, new TranslatingCallback(this)));
        }
    }

    public final void c(Activity activity) {
        boolean z10;
        SidecarInterface sidecarInterface;
        j.f(activity, "activity");
        IBinder a10 = a.a(activity);
        if (a10 != null) {
            SidecarInterface sidecarInterface2 = this.f3651a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(a10);
            }
            activity.unregisterComponentCallbacks((ComponentCallbacks) this.f3654d.get(activity));
            this.f3654d.remove(activity);
            if (this.f3653c.size() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3653c.remove(a10);
            if (z10 && (sidecarInterface = this.f3651a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final SidecarInterface g() {
        return this.f3651a;
    }

    public final z h(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        j.f(activity, "activity");
        IBinder a10 = a.a(activity);
        if (a10 == null) {
            return new z(r.f20213a);
        }
        SidecarInterface sidecarInterface = this.f3651a;
        SidecarDeviceState sidecarDeviceState = null;
        if (sidecarInterface == null) {
            sidecarWindowLayoutInfo = null;
        } else {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a10);
        }
        n nVar = this.f3652b;
        SidecarInterface sidecarInterface2 = this.f3651a;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return nVar.e(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        j.f(activity, "activity");
        this.f3653c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f3651a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f3653c.size() == 1 && (sidecarInterface = this.f3651a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f3655e;
        if (bVar != null) {
            bVar.a(activity, h(activity));
        }
        if (this.f3654d.get(activity) == null) {
            s sVar = new s(this, activity);
            this.f3654d.put(activity, sVar);
            activity.registerComponentCallbacks(sVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:58|59|60|61|69|70|71|72|73|(2:75|(2:77|97)(2:78|79))(2:80|81)) */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0112 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0080 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0152 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016a A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0176 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0182 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            androidx.window.sidecar.SidecarInterface r2 = r8.f3651a     // Catch:{ all -> 0x019a }
            r3 = 0
            if (r2 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0010
        L_0x000e:
            r2 = r3
            goto L_0x001c
        L_0x0010:
            java.lang.String r4 = "setSidecarCallback"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r6 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x001c:
            if (r2 != 0) goto L_0x0020
            r2 = r3
            goto L_0x0024
        L_0x0020:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x0024:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r4 = sk.j.a(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x018e
            androidx.window.sidecar.SidecarInterface r2 = r8.f3651a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            r2.getDeviceState()     // Catch:{ all -> 0x019a }
        L_0x0034:
            androidx.window.sidecar.SidecarInterface r2 = r8.f3651a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r2.onDeviceStateListenersChanged(r0)     // Catch:{ all -> 0x019a }
        L_0x003c:
            androidx.window.sidecar.SidecarInterface r2 = r8.f3651a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0049
        L_0x0047:
            r2 = r3
            goto L_0x0055
        L_0x0049:
            java.lang.String r4 = "getWindowLayoutInfo"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x0055:
            if (r2 != 0) goto L_0x0059
            r2 = r3
            goto L_0x005d
        L_0x0059:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x005d:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r4 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r4 = sk.j.a(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0182
            androidx.window.sidecar.SidecarInterface r2 = r8.f3651a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x006a
            goto L_0x0070
        L_0x006a:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0072
        L_0x0070:
            r2 = r3
            goto L_0x007e
        L_0x0072:
            java.lang.String r4 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x007e:
            if (r2 != 0) goto L_0x0082
            r2 = r3
            goto L_0x0086
        L_0x0082:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x0086:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r4 = sk.j.a(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0176
            androidx.window.sidecar.SidecarInterface r2 = r8.f3651a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x009b
        L_0x0099:
            r2 = r3
            goto L_0x00a7
        L_0x009b:
            java.lang.String r4 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x00a7:
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            java.lang.Class r3 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x00ae:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r2 = sk.j.a(r3, r2)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x016a
            androidx.window.sidecar.SidecarDeviceState r2 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            r3 = 3
            r2.posture = r3     // Catch:{ NoSuchFieldError -> 0x00bf }
            goto L_0x00f2
        L_0x00bf:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "setPosture"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x019a }
            r6[r1] = r7     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x019a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x019a }
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            r4.invoke(r2, r5)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "getPosture"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object r2 = r4.invoke(r2, r5)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x0162
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x019a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x019a }
            if (r2 != r3) goto L_0x015a
        L_0x00f2:
            androidx.window.sidecar.SidecarDisplayFeature r2 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            android.graphics.Rect r3 = r2.getRect()     // Catch:{ all -> 0x019a }
            java.lang.String r4 = "displayFeature.rect"
            sk.j.e(r3, r4)     // Catch:{ all -> 0x019a }
            r2.setRect(r3)     // Catch:{ all -> 0x019a }
            r2.getType()     // Catch:{ all -> 0x019a }
            r2.setType(r0)     // Catch:{ all -> 0x019a }
            androidx.window.sidecar.SidecarWindowLayoutInfo r3 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x019a }
            r3.<init>()     // Catch:{ all -> 0x019a }
            java.util.List r1 = r3.displayFeatures     // Catch:{ NoSuchFieldError -> 0x0112 }
            goto L_0x019b
        L_0x0112:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x019a }
            r4.<init>()     // Catch:{ all -> 0x019a }
            r4.add(r2)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "setDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r6[r1] = r7     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x019a }
            r5[r1] = r4     // Catch:{ all -> 0x019a }
            r2.invoke(r3, r5)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x0152
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x019a }
            boolean r2 = sk.j.a(r4, r2)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x014a
            goto L_0x019b
        L_0x014a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Invalid display feature getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0152:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x015a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Invalid device posture getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0162:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x016a:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r2 = sk.j.k(r3, r2)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0176:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = sk.j.k(r2, r3)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0182:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r2 = sk.j.k(r2, r3)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x018e:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r2 = sk.j.k(r2, r3)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r0 = r1
        L_0x019b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.j():boolean");
    }
}
