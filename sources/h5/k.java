package h5;

import al.g0;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w;
import b5.q;
import com.bumptech.glide.g;
import com.bumptech.glide.i;
import com.bumptech.glide.l;
import com.bumptech.glide.manager.RequestManagerFragment;
import h5.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: RequestManagerRetriever */
public final class k implements Handler.Callback {

    /* renamed from: j  reason: collision with root package name */
    public static final a f10566j = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile l f10567a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f10568b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f10569c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f10570d;

    /* renamed from: e  reason: collision with root package name */
    public final b f10571e;

    /* renamed from: f  reason: collision with root package name */
    public final v0.b<View, Fragment> f10572f = new v0.b<>();

    /* renamed from: g  reason: collision with root package name */
    public final v0.b<View, android.app.Fragment> f10573g = new v0.b<>();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f10574h = new Bundle();

    /* renamed from: i  reason: collision with root package name */
    public final g f10575i;

    /* compiled from: RequestManagerRetriever */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever */
    public interface b {
    }

    public k(b bVar, i iVar) {
        g gVar;
        this.f10571e = bVar == null ? f10566j : bVar;
        this.f10570d = new Handler(Looper.getMainLooper(), this);
        if (!q.f4049h || !q.f4048g) {
            gVar = new g0(6);
        } else {
            if (iVar.f4935a.containsKey(g.class)) {
                gVar = new f();
            } else {
                gVar = new g0(7);
            }
        }
        this.f10575i = gVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(List list, v0.b bVar) {
        View view;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                if (!(fragment == null || (view = fragment.L) == null)) {
                    bVar.put(view, fragment);
                    c(fragment.o().H(), bVar);
                }
            }
        }
    }

    @TargetApi(26)
    @Deprecated
    public final void b(FragmentManager fragmentManager, v0.b<View, android.app.Fragment> bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    bVar.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), bVar);
                }
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            this.f10574h.putInt("key", i10);
            android.app.Fragment fragment2 = null;
            try {
                fragment2 = fragmentManager.getFragment(this.f10574h, "key");
            } catch (Exception unused) {
            }
            if (fragment2 != null) {
                if (fragment2.getView() != null) {
                    bVar.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), bVar);
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public final l d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        RequestManagerFragment h10 = h(fragmentManager, fragment);
        l lVar = h10.f5008d;
        if (lVar != null) {
            return lVar;
        }
        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
        b bVar = this.f10571e;
        a aVar = h10.f5005a;
        RequestManagerFragment.a aVar2 = h10.f5006b;
        ((a) bVar).getClass();
        l lVar2 = new l(b10, aVar, aVar2, context);
        if (z10) {
            lVar2.b();
        }
        h10.f5008d = lVar2;
        return lVar2;
    }

    public final l e(Activity activity) {
        boolean z10;
        if (o5.l.h()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return g((FragmentActivity) activity);
        }
        if (!activity.isDestroyed()) {
            this.f10575i.h();
            FragmentManager fragmentManager = activity.getFragmentManager();
            Activity a10 = a(activity);
            if (a10 == null || !a10.isFinishing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            return d(activity, fragmentManager, (android.app.Fragment) null, z10);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final l f(Context context) {
        boolean z10;
        if (context != null) {
            char[] cArr = o5.l.f13754a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return g((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f10567a == null) {
                synchronized (this) {
                    if (this.f10567a == null) {
                        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f10571e;
                        a.a aVar = new a.a();
                        lb.b bVar2 = new lb.b(4);
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f10567a = new l(b10, aVar, bVar2, applicationContext);
                    }
                }
            }
            return this.f10567a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final l g(FragmentActivity fragmentActivity) {
        boolean z10;
        if (o5.l.h()) {
            return f(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            this.f10575i.h();
            w G = fragmentActivity.G();
            Activity a10 = a(fragmentActivity);
            if (a10 == null || !a10.isFinishing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            return j(fragmentActivity, G, (Fragment) null, z10);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final RequestManagerFragment h(FragmentManager fragmentManager, android.app.Fragment fragment) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) this.f10568b.get(fragmentManager);
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 == null) {
            requestManagerFragment2 = new RequestManagerFragment();
            requestManagerFragment2.f5010f = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                requestManagerFragment2.a(fragment.getActivity());
            }
            this.f10568b.put(fragmentManager, requestManagerFragment2);
            fragmentManager.beginTransaction().add(requestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f10570d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: androidx.fragment.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: android.app.FragmentManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            r14 = this;
            int r0 = r15.arg1
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            int r3 = r15.what
            r4 = 3
            java.lang.String r5 = " New: "
            java.lang.String r6 = "We've added two fragments with requests! Old: "
            java.lang.String r7 = "com.bumptech.glide.manager"
            r8 = 0
            r9 = 5
            java.lang.String r10 = "RMRetriever"
            if (r3 == r1) goto L_0x00a6
            r11 = 2
            if (r3 == r11) goto L_0x001e
            r1 = r2
            goto L_0x011f
        L_0x001e:
            java.lang.Object r15 = r15.obj
            androidx.fragment.app.FragmentManager r15 = (androidx.fragment.app.FragmentManager) r15
            java.util.HashMap r3 = r14.f10569c
            java.lang.Object r3 = r3.get(r15)
            h5.p r3 = (h5.p) r3
            androidx.fragment.app.Fragment r12 = r15.D(r7)
            h5.p r12 = (h5.p) r12
            if (r12 != r3) goto L_0x0033
            goto L_0x009b
        L_0x0033:
            if (r12 == 0) goto L_0x0055
            com.bumptech.glide.l r13 = r12.f10602i0
            if (r13 != 0) goto L_0x003a
            goto L_0x0055
        L_0x003a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r12)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0055:
            if (r0 != 0) goto L_0x008a
            boolean r0 = r15.H
            if (r0 == 0) goto L_0x005c
            goto L_0x008a
        L_0x005c:
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r15)
            r0.g(r2, r3, r7, r1)
            if (r12 == 0) goto L_0x0069
            r0.i(r12)
        L_0x0069:
            boolean r3 = r0.f2561g
            if (r3 != 0) goto L_0x0082
            r0.f2562h = r2
            androidx.fragment.app.FragmentManager r3 = r0.f2552q
            r3.z(r0, r1)
            android.os.Handler r0 = r14.f10570d
            android.os.Message r0 = r0.obtainMessage(r11, r1, r2, r15)
            r0.sendToTarget()
            android.util.Log.isLoggable(r10, r4)
            r0 = r2
            goto L_0x009c
        L_0x0082:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "This transaction is already being added to the back stack"
            r15.<init>(r0)
            throw r15
        L_0x008a:
            boolean r0 = r15.H
            if (r0 == 0) goto L_0x0092
            android.util.Log.isLoggable(r10, r9)
            goto L_0x0096
        L_0x0092:
            r0 = 6
            android.util.Log.isLoggable(r10, r0)
        L_0x0096:
            h5.a r0 = r3.f10598e0
            r0.b()
        L_0x009b:
            r0 = r1
        L_0x009c:
            if (r0 == 0) goto L_0x011f
            java.util.HashMap r0 = r14.f10569c
            java.lang.Object r0 = r0.remove(r15)
            goto L_0x011b
        L_0x00a6:
            java.lang.Object r15 = r15.obj
            android.app.FragmentManager r15 = (android.app.FragmentManager) r15
            java.util.HashMap r3 = r14.f10568b
            java.lang.Object r3 = r3.get(r15)
            com.bumptech.glide.manager.RequestManagerFragment r3 = (com.bumptech.glide.manager.RequestManagerFragment) r3
            android.app.Fragment r11 = r15.findFragmentByTag(r7)
            com.bumptech.glide.manager.RequestManagerFragment r11 = (com.bumptech.glide.manager.RequestManagerFragment) r11
            if (r11 != r3) goto L_0x00bb
            goto L_0x0112
        L_0x00bb:
            if (r11 == 0) goto L_0x00dd
            com.bumptech.glide.l r12 = r11.f5008d
            if (r12 != 0) goto L_0x00c2
            goto L_0x00dd
        L_0x00c2:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r11)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00dd:
            if (r0 != 0) goto L_0x0104
            boolean r0 = r15.isDestroyed()
            if (r0 == 0) goto L_0x00e6
            goto L_0x0104
        L_0x00e6:
            android.app.FragmentTransaction r0 = r15.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r3, r7)
            if (r11 == 0) goto L_0x00f3
            r0.remove(r11)
        L_0x00f3:
            r0.commitAllowingStateLoss()
            android.os.Handler r0 = r14.f10570d
            android.os.Message r0 = r0.obtainMessage(r1, r1, r2, r15)
            r0.sendToTarget()
            android.util.Log.isLoggable(r10, r4)
            r0 = r2
            goto L_0x0113
        L_0x0104:
            boolean r0 = android.util.Log.isLoggable(r10, r9)
            if (r0 == 0) goto L_0x010d
            r15.isDestroyed()
        L_0x010d:
            h5.a r0 = r3.f5005a
            r0.b()
        L_0x0112:
            r0 = r1
        L_0x0113:
            if (r0 == 0) goto L_0x011f
            java.util.HashMap r0 = r14.f10568b
            java.lang.Object r0 = r0.remove(r15)
        L_0x011b:
            r8 = r0
            r0 = r15
            r15 = r1
            goto L_0x0122
        L_0x011f:
            r15 = r1
            r1 = r2
            r0 = r8
        L_0x0122:
            boolean r2 = android.util.Log.isLoggable(r10, r9)
            if (r2 == 0) goto L_0x012f
            if (r1 == 0) goto L_0x012f
            if (r8 != 0) goto L_0x012f
            java.util.Objects.toString(r0)
        L_0x012f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.k.handleMessage(android.os.Message):boolean");
    }

    public final p i(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        p pVar = (p) this.f10569c.get(fragmentManager);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = (p) fragmentManager.D("com.bumptech.glide.manager");
        if (pVar2 == null) {
            pVar2 = new p();
            pVar2.f10603j0 = fragment;
            if (!(fragment == null || fragment.r() == null)) {
                Fragment fragment2 = fragment;
                while (true) {
                    Fragment fragment3 = fragment2.B;
                    if (fragment3 == null) {
                        break;
                    }
                    fragment2 = fragment3;
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.f2460y;
                if (fragmentManager2 != null) {
                    pVar2.i0(fragment.r(), fragmentManager2);
                }
            }
            this.f10569c.put(fragmentManager, pVar2);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.g(0, pVar2, "com.bumptech.glide.manager", 1);
            aVar.d();
            this.f10570d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return pVar2;
    }

    public final l j(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z10) {
        p i10 = i(fragmentManager, fragment);
        l lVar = i10.f10602i0;
        if (lVar != null) {
            return lVar;
        }
        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
        b bVar = this.f10571e;
        a aVar = i10.f10598e0;
        p.a aVar2 = i10.f10599f0;
        ((a) bVar).getClass();
        l lVar2 = new l(b10, aVar, aVar2, context);
        if (z10) {
            lVar2.b();
        }
        i10.f10602i0 = lVar2;
        return lVar2;
    }
}
