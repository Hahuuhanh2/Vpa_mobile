package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.s;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import l.a;
import l.e;
import w1.d0;
import w1.q0;
import w1.r0;
import w1.s0;

public final class AppCompatDelegateImpl extends f implements f.a, LayoutInflater.Factory2 {

    /* renamed from: p0  reason: collision with root package name */
    public static final v0.h<String, Integer> f353p0 = new v0.h<>();

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f354q0 = {16842836};

    /* renamed from: r0  reason: collision with root package name */
    public static final boolean f355r0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: s0  reason: collision with root package name */
    public static final boolean f356s0 = true;
    public o A;
    public l.a B;
    public ActionBarContextView C;
    public PopupWindow D;
    public i E;
    public q0 F = null;
    public boolean G = true;
    public boolean H;
    public ViewGroup I;
    public TextView J;
    public View K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public PanelFeatureState[] T;
    public PanelFeatureState U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public Configuration Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f357a0 = -100;

    /* renamed from: b0  reason: collision with root package name */
    public int f358b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f359c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f360d0;

    /* renamed from: e0  reason: collision with root package name */
    public m f361e0;

    /* renamed from: f0  reason: collision with root package name */
    public k f362f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f363g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f364h0;

    /* renamed from: i0  reason: collision with root package name */
    public final a f365i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    public boolean f366j0;

    /* renamed from: k0  reason: collision with root package name */
    public Rect f367k0;

    /* renamed from: l0  reason: collision with root package name */
    public Rect f368l0;

    /* renamed from: m0  reason: collision with root package name */
    public o f369m0;

    /* renamed from: n0  reason: collision with root package name */
    public OnBackInvokedDispatcher f370n0;

    /* renamed from: o0  reason: collision with root package name */
    public OnBackInvokedCallback f371o0;

    /* renamed from: q  reason: collision with root package name */
    public final Object f372q;

    /* renamed from: r  reason: collision with root package name */
    public final Context f373r;

    /* renamed from: s  reason: collision with root package name */
    public Window f374s;

    /* renamed from: t  reason: collision with root package name */
    public j f375t;

    /* renamed from: u  reason: collision with root package name */
    public final e f376u;

    /* renamed from: v  reason: collision with root package name */
    public ActionBar f377v;

    /* renamed from: w  reason: collision with root package name */
    public l.f f378w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f379x;

    /* renamed from: y  reason: collision with root package name */
    public v f380y;

    /* renamed from: z  reason: collision with root package name */
    public c f381z;

    public static final class PanelFeatureState {

        /* renamed from: a  reason: collision with root package name */
        public int f382a;

        /* renamed from: b  reason: collision with root package name */
        public int f383b;

        /* renamed from: c  reason: collision with root package name */
        public int f384c;

        /* renamed from: d  reason: collision with root package name */
        public int f385d;

        /* renamed from: e  reason: collision with root package name */
        public n f386e;

        /* renamed from: f  reason: collision with root package name */
        public View f387f;

        /* renamed from: g  reason: collision with root package name */
        public View f388g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f389h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f390i;

        /* renamed from: j  reason: collision with root package name */
        public l.c f391j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f392k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f393l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f394m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f395n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f396o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f397p;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            public int f398a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f399b;

            /* renamed from: c  reason: collision with root package name */
            public Bundle f400c;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                public final Object[] newArray(int i10) {
                    return new SavedState[i10];
                }

                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, (ClassLoader) null);
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f398a = parcel.readInt();
                boolean z10 = true;
                if (parcel.readInt() != 1) {
                    z10 = false;
                }
                savedState.f399b = z10;
                if (z10) {
                    savedState.f400c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f398a);
                parcel.writeInt(this.f399b ? 1 : 0);
                if (this.f399b) {
                    parcel.writeBundle(this.f400c);
                }
            }
        }

        public PanelFeatureState(int i10) {
            this.f382a = i10;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f364h0 & 1) != 0) {
                appCompatDelegateImpl.H(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f364h0 & 4096) != 0) {
                appCompatDelegateImpl2.H(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f363g0 = false;
            appCompatDelegateImpl3.f364h0 = 0;
        }
    }

    public interface b {
    }

    public final class c implements j.a {
        public c() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            AppCompatDelegateImpl.this.D(fVar);
        }

        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback N = AppCompatDelegateImpl.this.N();
            if (N == null) {
                return true;
            }
            N.onMenuOpened(108, fVar);
            return true;
        }
    }

    public class d implements a.C0154a {

        /* renamed from: a  reason: collision with root package name */
        public a.C0154a f403a;

        public class a extends s0 {
            public a() {
            }

            public final void a() {
                AppCompatDelegateImpl.this.C.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.D;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.C.getParent() instanceof View) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.h.c((View) AppCompatDelegateImpl.this.C.getParent());
                }
                AppCompatDelegateImpl.this.C.h();
                AppCompatDelegateImpl.this.F.d((r0) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.F = null;
                ViewGroup viewGroup = appCompatDelegateImpl2.I;
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                d0.h.c(viewGroup);
            }
        }

        public d(e.a aVar) {
            this.f403a = aVar;
        }

        public final void a(l.a aVar) {
            this.f403a.a(aVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.D != null) {
                appCompatDelegateImpl.f374s.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.E);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.C != null) {
                q0 q0Var = appCompatDelegateImpl2.F;
                if (q0Var != null) {
                    q0Var.b();
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                q0 a10 = d0.a(appCompatDelegateImpl3.C);
                a10.a(0.0f);
                appCompatDelegateImpl3.F = a10;
                AppCompatDelegateImpl.this.F.d(new a());
            }
            e eVar = AppCompatDelegateImpl.this.f376u;
            if (eVar != null) {
                eVar.v();
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl4.B = null;
            ViewGroup viewGroup = appCompatDelegateImpl4.I;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.h.c(viewGroup);
            AppCompatDelegateImpl.this.V();
        }

        public final boolean b(l.a aVar, MenuItem menuItem) {
            return this.f403a.b(aVar, menuItem);
        }

        public final boolean c(l.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.I;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.h.c(viewGroup);
            return this.f403a.c(aVar, fVar);
        }

        public final boolean d(l.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f403a.d(aVar, fVar);
        }
    }

    public static class e {
        public static void a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    public static class f {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class g {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static s1.j b(Configuration configuration) {
            return s1.j.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(s1.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.f14594a.a()));
        }

        public static void d(Configuration configuration, s1.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.f14594a.a()));
        }
    }

    public static class h {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode & 3;
            if (i10 != i11) {
                configuration3.colorMode |= i11;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode & 12;
            if (i12 != i13) {
                configuration3.colorMode |= i13;
            }
        }
    }

    public static class i {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            k kVar = new k(appCompatDelegateImpl);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, kVar);
            return kVar;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class j extends l.h {

        /* renamed from: b  reason: collision with root package name */
        public b f406b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f407c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f408d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f409e;

        public j(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public final void a(Window.Callback callback) {
            try {
                this.f407c = true;
                callback.onContentChanged();
                this.f407c = false;
            } catch (Throwable th2) {
                this.f407c = false;
                throw th2;
            }
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f408d) {
                return this.f12627a.dispatchKeyEvent(keyEvent);
            }
            if (AppCompatDelegateImpl.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            if (r6 != false) goto L_0x0048;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004d
                androidx.appcompat.app.AppCompatDelegateImpl r0 = androidx.appcompat.app.AppCompatDelegateImpl.this
                int r3 = r6.getKeyCode()
                r0.O()
                androidx.appcompat.app.ActionBar r4 = r0.f377v
                if (r4 == 0) goto L_0x001c
                boolean r3 = r4.i(r3, r6)
                if (r3 == 0) goto L_0x001c
                goto L_0x0048
            L_0x001c:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.U
                if (r3 == 0) goto L_0x0031
                int r4 = r6.getKeyCode()
                boolean r3 = r0.S(r3, r4, r6)
                if (r3 == 0) goto L_0x0031
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r0.U
                if (r6 == 0) goto L_0x0048
                r6.f393l = r2
                goto L_0x0048
            L_0x0031:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.U
                if (r3 != 0) goto L_0x004a
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.M(r1)
                r0.T(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.S(r3, r4, r6)
                r3.f392k = r1
                if (r6 == 0) goto L_0x004a
            L_0x0048:
                r6 = r2
                goto L_0x004b
            L_0x004a:
                r6 = r1
            L_0x004b:
                if (r6 == 0) goto L_0x004e
            L_0x004d:
                r1 = r2
            L_0x004e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.j.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public final void onContentChanged() {
            if (this.f407c) {
                this.f12627a.onContentChanged();
            }
        }

        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public final View onCreatePanelView(int i10) {
            View view;
            b bVar = this.f406b;
            if (bVar != null) {
                s.e eVar = (s.e) bVar;
                if (i10 == 0) {
                    view = new View(s.this.f473a.getContext());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i10);
        }

        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i10 == 108) {
                appCompatDelegateImpl.O();
                ActionBar actionBar = appCompatDelegateImpl.f377v;
                if (actionBar != null) {
                    actionBar.c(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f409e) {
                this.f12627a.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i10 == 108) {
                appCompatDelegateImpl.O();
                ActionBar actionBar = appCompatDelegateImpl.f377v;
                if (actionBar != null) {
                    actionBar.c(false);
                }
            } else if (i10 == 0) {
                PanelFeatureState M = appCompatDelegateImpl.M(i10);
                if (M.f394m) {
                    appCompatDelegateImpl.E(M, false);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
        }

        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f638x = true;
            }
            b bVar = this.f406b;
            if (bVar != null) {
                s.e eVar = (s.e) bVar;
                if (i10 == 0) {
                    s sVar = s.this;
                    if (!sVar.f476d) {
                        sVar.f473a.f1192m = true;
                        sVar.f476d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f638x = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = AppCompatDelegateImpl.this.M(0).f389h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0148, code lost:
            if (w1.d0.g.c(r0) != false) goto L_0x014c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) {
            /*
                r8 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = androidx.appcompat.app.AppCompatDelegateImpl.this
                boolean r1 = r0.G
                if (r1 == 0) goto L_0x01bb
                if (r10 == 0) goto L_0x000a
                goto L_0x01bb
            L_0x000a:
                l.e$a r10 = new l.e$a
                android.content.Context r0 = r0.f373r
                r10.<init>(r0, r9)
                androidx.appcompat.app.AppCompatDelegateImpl r9 = androidx.appcompat.app.AppCompatDelegateImpl.this
                l.a r0 = r9.B
                if (r0 == 0) goto L_0x001a
                r0.c()
            L_0x001a:
                androidx.appcompat.app.AppCompatDelegateImpl$d r0 = new androidx.appcompat.app.AppCompatDelegateImpl$d
                r0.<init>(r10)
                r9.O()
                androidx.appcompat.app.ActionBar r1 = r9.f377v
                if (r1 == 0) goto L_0x0035
                l.a r1 = r1.q(r0)
                r9.B = r1
                if (r1 == 0) goto L_0x0035
                androidx.appcompat.app.e r1 = r9.f376u
                if (r1 == 0) goto L_0x0035
                r1.z()
            L_0x0035:
                l.a r1 = r9.B
                r2 = 0
                if (r1 != 0) goto L_0x01af
                w1.q0 r1 = r9.F
                if (r1 == 0) goto L_0x0041
                r1.b()
            L_0x0041:
                l.a r1 = r9.B
                if (r1 == 0) goto L_0x0048
                r1.c()
            L_0x0048:
                androidx.appcompat.app.e r1 = r9.f376u
                if (r1 == 0) goto L_0x0053
                boolean r3 = r9.Y
                if (r3 != 0) goto L_0x0053
                r1.o()     // Catch:{ AbstractMethodError -> 0x0053 }
            L_0x0053:
                androidx.appcompat.widget.ActionBarContextView r1 = r9.C
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L_0x010b
                boolean r1 = r9.Q
                if (r1 == 0) goto L_0x00df
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                android.content.Context r5 = r9.f373r
                android.content.res.Resources$Theme r5 = r5.getTheme()
                int r6 = androidx.appcompat.R$attr.actionBarTheme
                r5.resolveAttribute(r6, r1, r3)
                int r6 = r1.resourceId
                if (r6 == 0) goto L_0x0092
                android.content.Context r6 = r9.f373r
                android.content.res.Resources r6 = r6.getResources()
                android.content.res.Resources$Theme r6 = r6.newTheme()
                r6.setTo(r5)
                int r5 = r1.resourceId
                r6.applyStyle(r5, r3)
                l.c r5 = new l.c
                android.content.Context r7 = r9.f373r
                r5.<init>((android.content.Context) r7, (int) r4)
                android.content.res.Resources$Theme r7 = r5.getTheme()
                r7.setTo(r6)
                goto L_0x0094
            L_0x0092:
                android.content.Context r5 = r9.f373r
            L_0x0094:
                androidx.appcompat.widget.ActionBarContextView r6 = new androidx.appcompat.widget.ActionBarContextView
                r6.<init>(r5)
                r9.C = r6
                android.widget.PopupWindow r6 = new android.widget.PopupWindow
                int r7 = androidx.appcompat.R$attr.actionModePopupWindowStyle
                r6.<init>(r5, r2, r7)
                r9.D = r6
                r7 = 2
                androidx.core.widget.j.d(r6, r7)
                android.widget.PopupWindow r6 = r9.D
                androidx.appcompat.widget.ActionBarContextView r7 = r9.C
                r6.setContentView(r7)
                android.widget.PopupWindow r6 = r9.D
                r7 = -1
                r6.setWidth(r7)
                android.content.res.Resources$Theme r6 = r5.getTheme()
                int r7 = androidx.appcompat.R$attr.actionBarSize
                r6.resolveAttribute(r7, r1, r3)
                int r1 = r1.data
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r5)
                androidx.appcompat.widget.ActionBarContextView r5 = r9.C
                r5.setContentHeight(r1)
                android.widget.PopupWindow r1 = r9.D
                r5 = -2
                r1.setHeight(r5)
                androidx.appcompat.app.i r1 = new androidx.appcompat.app.i
                r1.<init>(r9)
                r9.E = r1
                goto L_0x010b
            L_0x00df:
                android.view.ViewGroup r1 = r9.I
                int r5 = androidx.appcompat.R$id.action_mode_bar_stub
                android.view.View r1 = r1.findViewById(r5)
                androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
                if (r1 == 0) goto L_0x010b
                r9.O()
                androidx.appcompat.app.ActionBar r5 = r9.f377v
                if (r5 == 0) goto L_0x00f7
                android.content.Context r5 = r5.e()
                goto L_0x00f8
            L_0x00f7:
                r5 = r2
            L_0x00f8:
                if (r5 != 0) goto L_0x00fc
                android.content.Context r5 = r9.f373r
            L_0x00fc:
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
                r1.setLayoutInflater(r5)
                android.view.View r1 = r1.a()
                androidx.appcompat.widget.ActionBarContextView r1 = (androidx.appcompat.widget.ActionBarContextView) r1
                r9.C = r1
            L_0x010b:
                androidx.appcompat.widget.ActionBarContextView r1 = r9.C
                if (r1 == 0) goto L_0x019d
                w1.q0 r1 = r9.F
                if (r1 == 0) goto L_0x0116
                r1.b()
            L_0x0116:
                androidx.appcompat.widget.ActionBarContextView r1 = r9.C
                r1.h()
                l.d r1 = new l.d
                androidx.appcompat.widget.ActionBarContextView r5 = r9.C
                android.content.Context r5 = r5.getContext()
                androidx.appcompat.widget.ActionBarContextView r6 = r9.C
                r1.<init>(r5, r6, r0)
                androidx.appcompat.view.menu.f r5 = r1.f12576o
                boolean r0 = r0.d(r1, r5)
                if (r0 == 0) goto L_0x019b
                r1.i()
                androidx.appcompat.widget.ActionBarContextView r0 = r9.C
                r0.f(r1)
                r9.B = r1
                boolean r0 = r9.H
                if (r0 == 0) goto L_0x014b
                android.view.ViewGroup r0 = r9.I
                if (r0 == 0) goto L_0x014b
                java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
                boolean r0 = w1.d0.g.c(r0)
                if (r0 == 0) goto L_0x014b
                goto L_0x014c
            L_0x014b:
                r3 = r4
            L_0x014c:
                r0 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x016a
                androidx.appcompat.widget.ActionBarContextView r1 = r9.C
                r3 = 0
                r1.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r9.C
                w1.q0 r1 = w1.d0.a(r1)
                r1.a(r0)
                r9.F = r1
                androidx.appcompat.app.j r0 = new androidx.appcompat.app.j
                r0.<init>(r9)
                r1.d(r0)
                goto L_0x018b
            L_0x016a:
                androidx.appcompat.widget.ActionBarContextView r1 = r9.C
                r1.setAlpha(r0)
                androidx.appcompat.widget.ActionBarContextView r0 = r9.C
                r0.setVisibility(r4)
                androidx.appcompat.widget.ActionBarContextView r0 = r9.C
                android.view.ViewParent r0 = r0.getParent()
                boolean r0 = r0 instanceof android.view.View
                if (r0 == 0) goto L_0x018b
                androidx.appcompat.widget.ActionBarContextView r0 = r9.C
                android.view.ViewParent r0 = r0.getParent()
                android.view.View r0 = (android.view.View) r0
                java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
                w1.d0.h.c(r0)
            L_0x018b:
                android.widget.PopupWindow r0 = r9.D
                if (r0 == 0) goto L_0x019d
                android.view.Window r0 = r9.f374s
                android.view.View r0 = r0.getDecorView()
                androidx.appcompat.app.i r1 = r9.E
                r0.post(r1)
                goto L_0x019d
            L_0x019b:
                r9.B = r2
            L_0x019d:
                l.a r0 = r9.B
                if (r0 == 0) goto L_0x01a8
                androidx.appcompat.app.e r0 = r9.f376u
                if (r0 == 0) goto L_0x01a8
                r0.z()
            L_0x01a8:
                r9.V()
                l.a r0 = r9.B
                r9.B = r0
            L_0x01af:
                r9.V()
                l.a r9 = r9.B
                if (r9 == 0) goto L_0x01ba
                l.e r2 = r10.e(r9)
            L_0x01ba:
                return r2
            L_0x01bb:
                android.view.ActionMode r9 = super.onWindowStartingActionMode(r9, r10)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.j.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
        }
    }

    public class k extends l {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f411c;

        public k(Context context) {
            super();
            this.f411c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public final int c() {
            if (this.f411c.isPowerSaveMode()) {
                return 2;
            }
            return 1;
        }

        public final void d() {
            AppCompatDelegateImpl.this.z(true, true);
        }
    }

    public abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public a f413a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public final void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        public l() {
        }

        public final void a() {
            a aVar = this.f413a;
            if (aVar != null) {
                try {
                    AppCompatDelegateImpl.this.f373r.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f413a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f413a == null) {
                    this.f413a = new a();
                }
                AppCompatDelegateImpl.this.f373r.registerReceiver(this.f413a, b10);
            }
        }
    }

    public class m extends l {

        /* renamed from: c  reason: collision with root package name */
        public final u f416c;

        public m(u uVar) {
            super();
            this.f416c = uVar;
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c() {
            /*
                r24 = this;
                r0 = r24
                androidx.appcompat.app.u r1 = r0.f416c
                androidx.appcompat.app.u$a r2 = r1.f494c
                long r3 = r2.f496b
                long r5 = java.lang.System.currentTimeMillis()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 0
                r5 = 1
                if (r3 <= 0) goto L_0x0014
                r3 = r5
                goto L_0x0015
            L_0x0014:
                r3 = r4
            L_0x0015:
                if (r3 == 0) goto L_0x001b
                boolean r1 = r2.f495a
                goto L_0x00f2
            L_0x001b:
                android.content.Context r3 = r1.f492a
                java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = p3.l0.o(r3, r6)
                r6 = 0
                if (r3 != 0) goto L_0x0037
                java.lang.String r3 = "network"
                android.location.LocationManager r7 = r1.f493b     // Catch:{ Exception -> 0x0037 }
                boolean r7 = r7.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0037 }
                if (r7 == 0) goto L_0x0037
                android.location.LocationManager r7 = r1.f493b     // Catch:{ Exception -> 0x0037 }
                android.location.Location r3 = r7.getLastKnownLocation(r3)     // Catch:{ Exception -> 0x0037 }
                goto L_0x0038
            L_0x0037:
                r3 = r6
            L_0x0038:
                android.content.Context r7 = r1.f492a
                java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
                int r7 = p3.l0.o(r7, r8)
                if (r7 != 0) goto L_0x0052
                java.lang.String r7 = "gps"
                android.location.LocationManager r8 = r1.f493b     // Catch:{ Exception -> 0x0052 }
                boolean r8 = r8.isProviderEnabled(r7)     // Catch:{ Exception -> 0x0052 }
                if (r8 == 0) goto L_0x0052
                android.location.LocationManager r8 = r1.f493b     // Catch:{ Exception -> 0x0052 }
                android.location.Location r6 = r8.getLastKnownLocation(r7)     // Catch:{ Exception -> 0x0052 }
            L_0x0052:
                if (r6 == 0) goto L_0x0063
                if (r3 == 0) goto L_0x0063
                long r7 = r6.getTime()
                long r9 = r3.getTime()
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 <= 0) goto L_0x0066
                goto L_0x0065
            L_0x0063:
                if (r6 == 0) goto L_0x0066
            L_0x0065:
                r3 = r6
            L_0x0066:
                if (r3 == 0) goto L_0x00df
                androidx.appcompat.app.u$a r1 = r1.f494c
                long r13 = java.lang.System.currentTimeMillis()
                androidx.appcompat.app.t r6 = androidx.appcompat.app.t.f487d
                if (r6 != 0) goto L_0x0079
                androidx.appcompat.app.t r6 = new androidx.appcompat.app.t
                r6.<init>()
                androidx.appcompat.app.t.f487d = r6
            L_0x0079:
                androidx.appcompat.app.t r11 = androidx.appcompat.app.t.f487d
                r22 = 86400000(0x5265c00, double:4.2687272E-316)
                long r20 = r13 - r22
                double r16 = r3.getLatitude()
                double r18 = r3.getLongitude()
                r15 = r11
                r15.a(r16, r18, r20)
                double r7 = r3.getLatitude()
                double r9 = r3.getLongitude()
                r6 = r11
                r11 = r13
                r6.a(r7, r9, r11)
                int r6 = r15.f490c
                if (r6 != r5) goto L_0x009e
                r4 = r5
            L_0x009e:
                long r6 = r15.f489b
                long r8 = r15.f488a
                long r20 = r13 + r22
                double r16 = r3.getLatitude()
                double r18 = r3.getLongitude()
                r3 = r15
                r15.a(r16, r18, r20)
                long r10 = r3.f489b
                r15 = 0
                r17 = -1
                int r3 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
                if (r3 == 0) goto L_0x00d3
                int r3 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
                if (r3 != 0) goto L_0x00bf
                goto L_0x00d3
            L_0x00bf:
                int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r3 <= 0) goto L_0x00c5
                long r10 = r10 + r15
                goto L_0x00ce
            L_0x00c5:
                int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r3 <= 0) goto L_0x00cc
                long r10 = r8 + r15
                goto L_0x00ce
            L_0x00cc:
                long r10 = r6 + r15
            L_0x00ce:
                r6 = 60000(0xea60, double:2.9644E-319)
                long r10 = r10 + r6
                goto L_0x00d8
            L_0x00d3:
                r6 = 43200000(0x2932e00, double:2.1343636E-316)
                long r10 = r13 + r6
            L_0x00d8:
                r1.f495a = r4
                r1.f496b = r10
                boolean r1 = r2.f495a
                goto L_0x00f2
            L_0x00df:
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00f0
                r2 = 22
                if (r1 < r2) goto L_0x00f1
            L_0x00f0:
                r4 = r5
            L_0x00f1:
                r1 = r4
            L_0x00f2:
                if (r1 == 0) goto L_0x00f5
                r5 = 2
            L_0x00f5:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m.c():int");
        }

        public final void d() {
            AppCompatDelegateImpl.this.z(true, true);
        }
    }

    public class n extends ContentFrameLayout {
        public n(l.c cVar) {
            super(cVar);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.E(appCompatDelegateImpl.M(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(h.a.a(getContext(), i10));
        }
    }

    public final class o implements j.a {
        public o() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            boolean z11;
            int i10;
            PanelFeatureState panelFeatureState;
            androidx.appcompat.view.menu.f k10 = fVar.k();
            int i11 = 0;
            if (k10 != fVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                fVar = k10;
            }
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.T;
            if (panelFeatureStateArr != null) {
                i10 = panelFeatureStateArr.length;
            } else {
                i10 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    panelFeatureState = panelFeatureStateArr[i11];
                    if (panelFeatureState != null && panelFeatureState.f389h == fVar) {
                        break;
                    }
                    i11++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState == null) {
                return;
            }
            if (z11) {
                AppCompatDelegateImpl.this.C(panelFeatureState.f382a, panelFeatureState, k10);
                AppCompatDelegateImpl.this.E(panelFeatureState, true);
                return;
            }
            AppCompatDelegateImpl.this.E(panelFeatureState, z10);
        }

        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback N;
            if (fVar != fVar.k()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.N || (N = appCompatDelegateImpl.N()) == null || AppCompatDelegateImpl.this.Y) {
                return true;
            }
            N.onMenuOpened(108, fVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, e eVar, Object obj) {
        v0.h<String, Integer> hVar;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f373r = context;
        this.f376u = eVar;
        this.f372q = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f357a0 = ((AppCompatDelegateImpl) appCompatActivity.I()).f357a0;
            }
        }
        if (this.f357a0 == -100 && (orDefault = hVar.getOrDefault(this.f372q.getClass().getName(), null)) != null) {
            this.f357a0 = orDefault.intValue();
            (hVar = f353p0).remove(this.f372q.getClass().getName());
        }
        if (window != null) {
            A(window);
        }
        androidx.appcompat.widget.g.d();
    }

    public static s1.j B(Context context) {
        s1.j jVar;
        s1.j jVar2;
        Locale locale;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (jVar = f.f430c) == null) {
            return null;
        }
        s1.j L2 = L(context.getApplicationContext().getResources().getConfiguration());
        int i11 = 0;
        if (i10 >= 24) {
            if (jVar.d()) {
                jVar2 = s1.j.f14593b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (true) {
                    if (i11 >= L2.e() + jVar.e()) {
                        break;
                    }
                    if (i11 < jVar.e()) {
                        locale = jVar.c(i11);
                    } else {
                        locale = L2.c(i11 - jVar.e());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i11++;
                }
                jVar2 = s1.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (jVar.d()) {
            jVar2 = s1.j.f14593b;
        } else {
            jVar2 = s1.j.b(jVar.c(0).toString());
        }
        if (jVar2.d()) {
            return L2;
        }
        return jVar2;
    }

    public static Configuration F(Context context, int i10, s1.j jVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 == 2) {
            i11 = 32;
        } else if (z10) {
            i11 = 0;
        } else {
            i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                g.d(configuration2, jVar);
            } else {
                e.b(configuration2, jVar.c(0));
                e.a(configuration2, jVar.c(0));
            }
        }
        return configuration2;
    }

    public static s1.j L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return g.b(configuration);
        }
        return s1.j.b(f.a(configuration.locale));
    }

    public final void A(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f374s == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof j)) {
                j jVar = new j(callback);
                this.f375t = jVar;
                window.setCallback(jVar);
                Context context = this.f373r;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f354q0);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    androidx.appcompat.widget.g a10 = androidx.appcompat.widget.g.a();
                    synchronized (a10) {
                        drawable = a10.f1105a.g(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f374s = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f370n0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f371o0) == null)) {
                        i.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f371o0 = null;
                    }
                    Object obj = this.f372q;
                    if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                        this.f370n0 = null;
                    } else {
                        this.f370n0 = i.a((Activity) this.f372q);
                    }
                    V();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void C(int i10, PanelFeatureState panelFeatureState, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (panelFeatureState == null && i10 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.T;
                if (i10 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                }
            }
            if (panelFeatureState != null) {
                fVar = panelFeatureState.f389h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f394m) && !this.Y) {
            j jVar = this.f375t;
            Window.Callback callback = this.f374s.getCallback();
            jVar.getClass();
            try {
                jVar.f409e = true;
                callback.onPanelClosed(i10, fVar);
                jVar.f409e = false;
            } catch (Throwable th2) {
                jVar.f409e = false;
                throw th2;
            }
        }
    }

    public final void D(androidx.appcompat.view.menu.f fVar) {
        if (!this.S) {
            this.S = true;
            this.f380y.g();
            Window.Callback N2 = N();
            if (N2 != null && !this.Y) {
                N2.onPanelClosed(108, fVar);
            }
            this.S = false;
        }
    }

    public final void E(PanelFeatureState panelFeatureState, boolean z10) {
        n nVar;
        v vVar;
        if (!z10 || panelFeatureState.f382a != 0 || (vVar = this.f380y) == null || !vVar.a()) {
            WindowManager windowManager = (WindowManager) this.f373r.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f394m || (nVar = panelFeatureState.f386e) == null)) {
                windowManager.removeView(nVar);
                if (z10) {
                    C(panelFeatureState.f382a, panelFeatureState, (androidx.appcompat.view.menu.f) null);
                }
            }
            panelFeatureState.f392k = false;
            panelFeatureState.f393l = false;
            panelFeatureState.f394m = false;
            panelFeatureState.f387f = null;
            panelFeatureState.f395n = true;
            if (this.U == panelFeatureState) {
                this.U = null;
            }
            if (panelFeatureState.f382a == 0) {
                V();
                return;
            }
            return;
        }
        D(panelFeatureState.f389h);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f372q
            boolean r1 = r0 instanceof w1.f.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof androidx.appcompat.app.m
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f374s
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = w1.f.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            r3 = 0
            if (r0 != r1) goto L_0x003d
            androidx.appcompat.app.AppCompatDelegateImpl$j r0 = r6.f375t
            android.view.Window r4 = r6.f374s
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f408d = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f408d = r3
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f408d = r3
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            if (r4 != 0) goto L_0x0049
            r4 = r2
            goto L_0x004a
        L_0x0049:
            r4 = r3
        L_0x004a:
            r5 = 4
            if (r4 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0066
            if (r0 == r1) goto L_0x0053
            goto L_0x00fd
        L_0x0053:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x00fe
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.M(r3)
            boolean r1 = r0.f394m
            if (r1 != 0) goto L_0x00fe
            r6.T(r0, r7)
            goto L_0x00fe
        L_0x0066:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            r6.V = r2
            goto L_0x00fd
        L_0x0074:
            if (r0 == r5) goto L_0x00f6
            if (r0 == r1) goto L_0x007a
            goto L_0x00fd
        L_0x007a:
            l.a r0 = r6.B
            if (r0 == 0) goto L_0x0080
            goto L_0x00fe
        L_0x0080:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.M(r3)
            androidx.appcompat.widget.v r1 = r6.f380y
            if (r1 == 0) goto L_0x00ba
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00ba
            android.content.Context r1 = r6.f373r
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ba
            androidx.appcompat.widget.v r1 = r6.f380y
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00b3
            boolean r1 = r6.Y
            if (r1 != 0) goto L_0x00da
            boolean r7 = r6.T(r0, r7)
            if (r7 == 0) goto L_0x00da
            androidx.appcompat.widget.v r7 = r6.f380y
            boolean r7 = r7.e()
            goto L_0x00e0
        L_0x00b3:
            androidx.appcompat.widget.v r7 = r6.f380y
            boolean r7 = r7.d()
            goto L_0x00e0
        L_0x00ba:
            boolean r1 = r0.f394m
            if (r1 != 0) goto L_0x00dc
            boolean r4 = r0.f393l
            if (r4 == 0) goto L_0x00c3
            goto L_0x00dc
        L_0x00c3:
            boolean r1 = r0.f392k
            if (r1 == 0) goto L_0x00da
            boolean r1 = r0.f396o
            if (r1 == 0) goto L_0x00d2
            r0.f392k = r3
            boolean r1 = r6.T(r0, r7)
            goto L_0x00d3
        L_0x00d2:
            r1 = r2
        L_0x00d3:
            if (r1 == 0) goto L_0x00da
            r6.R(r0, r7)
            r7 = r2
            goto L_0x00e0
        L_0x00da:
            r7 = r3
            goto L_0x00e0
        L_0x00dc:
            r6.E(r0, r2)
            r7 = r1
        L_0x00e0:
            if (r7 == 0) goto L_0x00fe
            android.content.Context r7 = r6.f373r
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00fe
            r7.playSoundEffect(r3)
            goto L_0x00fe
        L_0x00f6:
            boolean r7 = r6.Q()
            if (r7 == 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r2 = r3
        L_0x00fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.G(android.view.KeyEvent):boolean");
    }

    public final void H(int i10) {
        PanelFeatureState M2 = M(i10);
        if (M2.f389h != null) {
            Bundle bundle = new Bundle();
            M2.f389h.u(bundle);
            if (bundle.size() > 0) {
                M2.f397p = bundle;
            }
            M2.f389h.y();
            M2.f389h.clear();
        }
        M2.f396o = true;
        M2.f395n = true;
        if ((i10 == 108 || i10 == 0) && this.f380y != null) {
            PanelFeatureState M3 = M(0);
            M3.f392k = false;
            T(M3, (KeyEvent) null);
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.H) {
            TypedArray obtainStyledAttributes = this.f373r.obtainStyledAttributes(R$styleable.AppCompatTheme);
            int i10 = R$styleable.AppCompatTheme_windowActionBar;
            if (obtainStyledAttributes.hasValue(i10)) {
                if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
                    s(1);
                } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                    s(108);
                }
                if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                    s(109);
                }
                if (obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                    s(10);
                }
                this.Q = obtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                J();
                this.f374s.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f373r);
                if (this.R) {
                    viewGroup = this.P ? (ViewGroup) from.inflate(R$layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R$layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.Q) {
                    viewGroup = (ViewGroup) from.inflate(R$layout.abc_dialog_title_material, (ViewGroup) null);
                    this.O = false;
                    this.N = false;
                } else if (this.N) {
                    TypedValue typedValue = new TypedValue();
                    this.f373r.getTheme().resolveAttribute(R$attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new l.c(this.f373r, typedValue.resourceId);
                    } else {
                        context = this.f373r;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R$layout.abc_screen_toolbar, (ViewGroup) null);
                    v vVar = (v) viewGroup.findViewById(R$id.decor_content_parent);
                    this.f380y = vVar;
                    vVar.setWindowCallback(N());
                    if (this.O) {
                        this.f380y.f(109);
                    }
                    if (this.L) {
                        this.f380y.f(2);
                    }
                    if (this.M) {
                        this.f380y.f(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    g gVar = new g(this);
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.i.u(viewGroup, gVar);
                    if (this.f380y == null) {
                        this.J = (TextView) viewGroup.findViewById(R$id.title);
                    }
                    Method method = u0.f1235a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R$id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f374s.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f374s.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new h(this));
                    this.I = viewGroup;
                    Object obj = this.f372q;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f379x;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        v vVar2 = this.f380y;
                        if (vVar2 != null) {
                            vVar2.setWindowTitle(charSequence);
                        } else {
                            ActionBar actionBar = this.f377v;
                            if (actionBar != null) {
                                actionBar.p(charSequence);
                            } else {
                                TextView textView = this.J;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.I.findViewById(16908290);
                    View decorView = this.f374s.getDecorView();
                    contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    TypedArray obtainStyledAttributes2 = this.f373r.obtainStyledAttributes(R$styleable.AppCompatTheme);
                    obtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    int i11 = R$styleable.AppCompatTheme_windowFixedWidthMajor;
                    if (obtainStyledAttributes2.hasValue(i11)) {
                        obtainStyledAttributes2.getValue(i11, contentFrameLayout2.getFixedWidthMajor());
                    }
                    int i12 = R$styleable.AppCompatTheme_windowFixedWidthMinor;
                    if (obtainStyledAttributes2.hasValue(i12)) {
                        obtainStyledAttributes2.getValue(i12, contentFrameLayout2.getFixedWidthMinor());
                    }
                    int i13 = R$styleable.AppCompatTheme_windowFixedHeightMajor;
                    if (obtainStyledAttributes2.hasValue(i13)) {
                        obtainStyledAttributes2.getValue(i13, contentFrameLayout2.getFixedHeightMajor());
                    }
                    int i14 = R$styleable.AppCompatTheme_windowFixedHeightMinor;
                    if (obtainStyledAttributes2.hasValue(i14)) {
                        obtainStyledAttributes2.getValue(i14, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.H = true;
                    PanelFeatureState M2 = M(0);
                    if (!this.Y && M2.f389h == null) {
                        this.f364h0 |= 4096;
                        if (!this.f363g0) {
                            View decorView2 = this.f374s.getDecorView();
                            a aVar = this.f365i0;
                            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                            d0.d.m(decorView2, aVar);
                            this.f363g0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder q10 = android.support.v4.media.a.q("AppCompat does not support the current theme features: { windowActionBar: ");
                q10.append(this.N);
                q10.append(", windowActionBarOverlay: ");
                q10.append(this.O);
                q10.append(", android:windowIsFloating: ");
                q10.append(this.Q);
                q10.append(", windowActionModeOverlay: ");
                q10.append(this.P);
                q10.append(", windowNoTitle: ");
                q10.append(this.R);
                q10.append(" }");
                throw new IllegalArgumentException(q10.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void J() {
        if (this.f374s == null) {
            Object obj = this.f372q;
            if (obj instanceof Activity) {
                A(((Activity) obj).getWindow());
            }
        }
        if (this.f374s == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final l K(Context context) {
        if (this.f361e0 == null) {
            if (u.f491d == null) {
                Context applicationContext = context.getApplicationContext();
                u.f491d = new u(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f361e0 = new m(u.f491d);
        }
        return this.f361e0;
    }

    public final PanelFeatureState M(int i10) {
        PanelFeatureState[] panelFeatureStateArr = this.T;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i10 + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.T = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i10);
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final Window.Callback N() {
        return this.f374s.getCallback();
    }

    public final void O() {
        I();
        if (this.N && this.f377v == null) {
            Object obj = this.f372q;
            if (obj instanceof Activity) {
                this.f377v = new v((Activity) this.f372q, this.O);
            } else if (obj instanceof Dialog) {
                this.f377v = new v((Dialog) this.f372q);
            }
            ActionBar actionBar = this.f377v;
            if (actionBar != null) {
                actionBar.m(this.f366j0);
            }
        }
    }

    public final int P(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        if (this.f362f0 == null) {
                            this.f362f0 = new k(context);
                        }
                        return this.f362f0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return K(context).c();
            }
        }
        return i10;
    }

    public final boolean Q() {
        boolean z10 = this.V;
        this.V = false;
        PanelFeatureState M2 = M(0);
        if (M2.f394m) {
            if (!z10) {
                E(M2, true);
            }
            return true;
        }
        l.a aVar = this.B;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        O();
        ActionBar actionBar = this.f377v;
        if (actionBar == null || !actionBar.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0154, code lost:
        if (r15 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0178, code lost:
        if (r15.f605n.getCount() > 0) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f394m
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r13.Y
            if (r0 == 0) goto L_0x000a
            goto L_0x01e3
        L_0x000a:
            int r0 = r14.f382a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f373r
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.N()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f382a
            androidx.appcompat.view.menu.f r4 = r14.f389h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.E(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f373r
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.T(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            androidx.appcompat.app.AppCompatDelegateImpl$n r15 = r14.f386e
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r5 = r14.f395n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.f388g
            if (r15 == 0) goto L_0x01b9
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01b9
            int r15 = r15.width
            if (r15 != r3) goto L_0x01b9
            r6 = r3
            goto L_0x01ba
        L_0x006b:
            if (r15 != 0) goto L_0x00e5
            r13.O()
            androidx.appcompat.app.ActionBar r15 = r13.f377v
            if (r15 == 0) goto L_0x0079
            android.content.Context r15 = r15.e()
            goto L_0x007a
        L_0x0079:
            r15 = 0
        L_0x007a:
            if (r15 != 0) goto L_0x007e
            android.content.Context r15 = r13.f373r
        L_0x007e:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            int r6 = androidx.appcompat.R$attr.actionBarPopupTheme
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x009e
            r5.applyStyle(r6, r2)
        L_0x009e:
            int r6 = androidx.appcompat.R$attr.panelMenuListTheme
            r5.resolveAttribute(r6, r3, r2)
            int r3 = r3.resourceId
            if (r3 == 0) goto L_0x00ab
            r5.applyStyle(r3, r2)
            goto L_0x00b0
        L_0x00ab:
            int r3 = androidx.appcompat.R$style.Theme_AppCompat_CompactMenu
            r5.applyStyle(r3, r2)
        L_0x00b0:
            l.c r3 = new l.c
            r3.<init>((android.content.Context) r15, (int) r1)
            android.content.res.Resources$Theme r15 = r3.getTheme()
            r15.setTo(r5)
            r14.f391j = r3
            int[] r15 = androidx.appcompat.R$styleable.AppCompatTheme
            android.content.res.TypedArray r15 = r3.obtainStyledAttributes(r15)
            int r3 = androidx.appcompat.R$styleable.AppCompatTheme_panelBackground
            int r3 = r15.getResourceId(r3, r1)
            r14.f383b = r3
            int r3 = androidx.appcompat.R$styleable.AppCompatTheme_android_windowAnimationStyle
            int r3 = r15.getResourceId(r3, r1)
            r14.f385d = r3
            r15.recycle()
            androidx.appcompat.app.AppCompatDelegateImpl$n r15 = new androidx.appcompat.app.AppCompatDelegateImpl$n
            l.c r3 = r14.f391j
            r15.<init>(r3)
            r14.f386e = r15
            r15 = 81
            r14.f384c = r15
            goto L_0x00f4
        L_0x00e5:
            boolean r3 = r14.f395n
            if (r3 == 0) goto L_0x00f4
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f4
            androidx.appcompat.app.AppCompatDelegateImpl$n r15 = r14.f386e
            r15.removeAllViews()
        L_0x00f4:
            android.view.View r15 = r14.f388g
            if (r15 == 0) goto L_0x00fb
            r14.f387f = r15
            goto L_0x0156
        L_0x00fb:
            androidx.appcompat.view.menu.f r15 = r14.f389h
            if (r15 != 0) goto L_0x0100
            goto L_0x0158
        L_0x0100:
            androidx.appcompat.app.AppCompatDelegateImpl$o r15 = r13.A
            if (r15 != 0) goto L_0x010b
            androidx.appcompat.app.AppCompatDelegateImpl$o r15 = new androidx.appcompat.app.AppCompatDelegateImpl$o
            r15.<init>()
            r13.A = r15
        L_0x010b:
            androidx.appcompat.app.AppCompatDelegateImpl$o r15 = r13.A
            androidx.appcompat.view.menu.d r3 = r14.f390i
            if (r3 != 0) goto L_0x0125
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            l.c r5 = r14.f391j
            int r6 = androidx.appcompat.R$layout.abc_list_menu_item_layout
            r3.<init>(r5, r6)
            r14.f390i = r3
            r3.f604f = r15
            androidx.appcompat.view.menu.f r15 = r14.f389h
            android.content.Context r5 = r15.f615a
            r15.b(r3, r5)
        L_0x0125:
            androidx.appcompat.view.menu.d r15 = r14.f390i
            androidx.appcompat.app.AppCompatDelegateImpl$n r3 = r14.f386e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.f602d
            if (r5 != 0) goto L_0x0150
            android.view.LayoutInflater r5 = r15.f600b
            int r6 = androidx.appcompat.R$layout.abc_expanded_menu_layout
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.f602d = r3
            androidx.appcompat.view.menu.d$a r3 = r15.f605n
            if (r3 != 0) goto L_0x0144
            androidx.appcompat.view.menu.d$a r3 = new androidx.appcompat.view.menu.d$a
            r3.<init>()
            r15.f605n = r3
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f602d
            androidx.appcompat.view.menu.d$a r5 = r15.f605n
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f602d
            r3.setOnItemClickListener(r15)
        L_0x0150:
            androidx.appcompat.view.menu.ExpandedMenuView r15 = r15.f602d
            r14.f387f = r15
            if (r15 == 0) goto L_0x0158
        L_0x0156:
            r15 = r2
            goto L_0x0159
        L_0x0158:
            r15 = r1
        L_0x0159:
            if (r15 == 0) goto L_0x01e1
            android.view.View r15 = r14.f387f
            if (r15 != 0) goto L_0x0160
            goto L_0x017c
        L_0x0160:
            android.view.View r15 = r14.f388g
            if (r15 == 0) goto L_0x0165
            goto L_0x017a
        L_0x0165:
            androidx.appcompat.view.menu.d r15 = r14.f390i
            androidx.appcompat.view.menu.d$a r3 = r15.f605n
            if (r3 != 0) goto L_0x0172
            androidx.appcompat.view.menu.d$a r3 = new androidx.appcompat.view.menu.d$a
            r3.<init>()
            r15.f605n = r3
        L_0x0172:
            androidx.appcompat.view.menu.d$a r15 = r15.f605n
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x017c
        L_0x017a:
            r15 = r2
            goto L_0x017d
        L_0x017c:
            r15 = r1
        L_0x017d:
            if (r15 != 0) goto L_0x0180
            goto L_0x01e1
        L_0x0180:
            android.view.View r15 = r14.f387f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x018d
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x018d:
            int r3 = r14.f383b
            androidx.appcompat.app.AppCompatDelegateImpl$n r5 = r14.f386e
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f387f
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01a5
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f387f
            r3.removeView(r5)
        L_0x01a5:
            androidx.appcompat.app.AppCompatDelegateImpl$n r3 = r14.f386e
            android.view.View r5 = r14.f387f
            r3.addView(r5, r15)
            android.view.View r15 = r14.f387f
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01b9
            android.view.View r15 = r14.f387f
            r15.requestFocus()
        L_0x01b9:
            r6 = r4
        L_0x01ba:
            r14.f393l = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f384c
            r15.gravity = r1
            int r1 = r14.f385d
            r15.windowAnimations = r1
            androidx.appcompat.app.AppCompatDelegateImpl$n r1 = r14.f386e
            r0.addView(r1, r15)
            r14.f394m = r2
            int r14 = r14.f382a
            if (r14 != 0) goto L_0x01e0
            r13.V()
        L_0x01e0:
            return
        L_0x01e1:
            r14.f395n = r2
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.R(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public final boolean S(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f392k || T(panelFeatureState, keyEvent)) && (fVar = panelFeatureState.f389h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean T(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z10;
        int i10;
        boolean z11;
        v vVar;
        v vVar2;
        v vVar3;
        Resources.Theme theme;
        v vVar4;
        if (this.Y) {
            return false;
        }
        if (panelFeatureState.f392k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.U;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            E(panelFeatureState2, false);
        }
        Window.Callback N2 = N();
        if (N2 != null) {
            panelFeatureState.f388g = N2.onCreatePanelView(panelFeatureState.f382a);
        }
        int i11 = panelFeatureState.f382a;
        if (i11 == 0 || i11 == 108) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (vVar4 = this.f380y) != null) {
            vVar4.setMenuPrepared();
        }
        if (panelFeatureState.f388g == null && (!z10 || !(this.f377v instanceof s))) {
            androidx.appcompat.view.menu.f fVar = panelFeatureState.f389h;
            if (fVar == null || panelFeatureState.f396o) {
                if (fVar == null) {
                    Context context = this.f373r;
                    int i12 = panelFeatureState.f382a;
                    if ((i12 == 0 || i12 == 108) && this.f380y != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R$attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            l.c cVar = new l.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f619e = this;
                    androidx.appcompat.view.menu.f fVar3 = panelFeatureState.f389h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(panelFeatureState.f390i);
                        }
                        panelFeatureState.f389h = fVar2;
                        androidx.appcompat.view.menu.d dVar = panelFeatureState.f390i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f615a);
                        }
                    }
                    if (panelFeatureState.f389h == null) {
                        return false;
                    }
                }
                if (z10 && (vVar3 = this.f380y) != null) {
                    if (this.f381z == null) {
                        this.f381z = new c();
                    }
                    vVar3.setMenu(panelFeatureState.f389h, this.f381z);
                }
                panelFeatureState.f389h.y();
                if (!N2.onCreatePanelMenu(panelFeatureState.f382a, panelFeatureState.f389h)) {
                    androidx.appcompat.view.menu.f fVar4 = panelFeatureState.f389h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(panelFeatureState.f390i);
                        }
                        panelFeatureState.f389h = null;
                    }
                    if (z10 && (vVar2 = this.f380y) != null) {
                        vVar2.setMenu((Menu) null, this.f381z);
                    }
                    return false;
                }
                panelFeatureState.f396o = false;
            }
            panelFeatureState.f389h.y();
            Bundle bundle = panelFeatureState.f397p;
            if (bundle != null) {
                panelFeatureState.f389h.s(bundle);
                panelFeatureState.f397p = null;
            }
            if (!N2.onPreparePanel(0, panelFeatureState.f388g, panelFeatureState.f389h)) {
                if (z10 && (vVar = this.f380y) != null) {
                    vVar.setMenu((Menu) null, this.f381z);
                }
                panelFeatureState.f389h.x();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            panelFeatureState.f389h.setQwertyMode(z11);
            panelFeatureState.f389h.x();
        }
        panelFeatureState.f392k = true;
        panelFeatureState.f393l = false;
        this.U = panelFeatureState;
        return true;
    }

    public final void U() {
        if (this.H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void V() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f370n0 != null && (M(0).f394m || this.B != null)) {
                z10 = true;
            }
            if (z10 && this.f371o0 == null) {
                this.f371o0 = i.b(this.f370n0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f371o0) != null) {
                i.c(this.f370n0, onBackInvokedCallback);
            }
        }
    }

    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i10;
        int i11;
        PanelFeatureState panelFeatureState;
        Window.Callback N2 = N();
        if (N2 != null && !this.Y) {
            androidx.appcompat.view.menu.f k10 = fVar.k();
            PanelFeatureState[] panelFeatureStateArr = this.T;
            if (panelFeatureStateArr != null) {
                i11 = panelFeatureStateArr.length;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
            while (true) {
                if (i10 < i11) {
                    panelFeatureState = panelFeatureStateArr[i10];
                    if (panelFeatureState != null && panelFeatureState.f389h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return N2.onMenuItemSelected(panelFeatureState.f382a, menuItem);
            }
        }
        return false;
    }

    public final void b(androidx.appcompat.view.menu.f fVar) {
        v vVar = this.f380y;
        if (vVar == null || !vVar.b() || (ViewConfiguration.get(this.f373r).hasPermanentMenuKey() && !this.f380y.c())) {
            PanelFeatureState M2 = M(0);
            M2.f395n = true;
            E(M2, false);
            R(M2, (KeyEvent) null);
            return;
        }
        Window.Callback N2 = N();
        if (this.f380y.a()) {
            this.f380y.d();
            if (!this.Y) {
                N2.onPanelClosed(108, M(0).f389h);
            }
        } else if (N2 != null && !this.Y) {
            if (this.f363g0 && (1 & this.f364h0) != 0) {
                this.f374s.getDecorView().removeCallbacks(this.f365i0);
                this.f365i0.run();
            }
            PanelFeatureState M3 = M(0);
            androidx.appcompat.view.menu.f fVar2 = M3.f389h;
            if (fVar2 != null && !M3.f396o && N2.onPreparePanel(0, M3.f388g, fVar2)) {
                N2.onMenuOpened(108, M3.f389h);
                this.f380y.e();
            }
        }
    }

    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        I();
        ((ViewGroup) this.I.findViewById(16908290)).addView(view, layoutParams);
        this.f375t.a(this.f374s.getCallback());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x01f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x0204 */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context d(android.content.Context r12) {
        /*
            r11 = this;
            r0 = 1
            r11.W = r0
            int r1 = r11.f357a0
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            int r1 = androidx.appcompat.app.f.f429b
        L_0x000c:
            int r1 = r11.P(r12, r1)
            boolean r2 = androidx.appcompat.app.f.k(r12)
            if (r2 == 0) goto L_0x0071
            boolean r2 = androidx.appcompat.app.f.k(r12)
            if (r2 != 0) goto L_0x001d
            goto L_0x0071
        L_0x001d:
            boolean r2 = s1.a.a()
            if (r2 == 0) goto L_0x0033
            boolean r2 = androidx.appcompat.app.f.f433f
            if (r2 != 0) goto L_0x0071
            androidx.appcompat.app.q$a r2 = androidx.appcompat.app.f.f428a
            d.d r3 = new d.d
            r4 = 2
            r3.<init>(r12, r4)
            r2.execute(r3)
            goto L_0x0071
        L_0x0033:
            java.lang.Object r2 = androidx.appcompat.app.f.f436p
            monitor-enter(r2)
            s1.j r3 = androidx.appcompat.app.f.f430c     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0057
            s1.j r3 = androidx.appcompat.app.f.f431d     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = androidx.appcompat.app.q.b(r12)     // Catch:{ all -> 0x006e }
            s1.j r3 = s1.j.b(r3)     // Catch:{ all -> 0x006e }
            androidx.appcompat.app.f.f431d = r3     // Catch:{ all -> 0x006e }
        L_0x0048:
            s1.j r3 = androidx.appcompat.app.f.f431d     // Catch:{ all -> 0x006e }
            boolean r3 = r3.d()     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x0052
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x0052:
            s1.j r3 = androidx.appcompat.app.f.f431d     // Catch:{ all -> 0x006e }
            androidx.appcompat.app.f.f430c = r3     // Catch:{ all -> 0x006e }
            goto L_0x006c
        L_0x0057:
            s1.j r4 = androidx.appcompat.app.f.f431d     // Catch:{ all -> 0x006e }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x006c
            s1.j r3 = androidx.appcompat.app.f.f430c     // Catch:{ all -> 0x006e }
            androidx.appcompat.app.f.f431d = r3     // Catch:{ all -> 0x006e }
            s1.l r3 = r3.f14594a     // Catch:{ all -> 0x006e }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x006e }
            androidx.appcompat.app.q.a(r12, r3)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            throw r12
        L_0x0071:
            s1.j r2 = B(r12)
            boolean r3 = f356s0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x008a
            boolean r3 = r12 instanceof android.view.ContextThemeWrapper
            if (r3 == 0) goto L_0x008a
            android.content.res.Configuration r3 = F(r12, r1, r2, r5, r4)
            r6 = r12
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch:{ IllegalStateException -> 0x008a }
            r6.applyOverrideConfiguration(r3)     // Catch:{ IllegalStateException -> 0x008a }
            return r12
        L_0x008a:
            boolean r3 = r12 instanceof l.c
            if (r3 == 0) goto L_0x0099
            android.content.res.Configuration r3 = F(r12, r1, r2, r5, r4)
            r6 = r12
            l.c r6 = (l.c) r6     // Catch:{ IllegalStateException -> 0x0099 }
            r6.a(r3)     // Catch:{ IllegalStateException -> 0x0099 }
            return r12
        L_0x0099:
            boolean r3 = f355r0
            if (r3 != 0) goto L_0x009e
            return r12
        L_0x009e:
            int r3 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r6 = new android.content.res.Configuration
            r6.<init>()
            r7 = -1
            r6.uiMode = r7
            r7 = 0
            r6.fontScale = r7
            android.content.Context r6 = r12.createConfigurationContext(r6)
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            android.content.res.Resources r8 = r12.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r9 = r8.uiMode
            r6.uiMode = r9
            boolean r9 = r6.equals(r8)
            if (r9 != 0) goto L_0x01ba
            android.content.res.Configuration r9 = new android.content.res.Configuration
            r9.<init>()
            r9.fontScale = r7
            int r7 = r6.diff(r8)
            if (r7 != 0) goto L_0x00d8
            goto L_0x01bb
        L_0x00d8:
            float r7 = r6.fontScale
            float r10 = r8.fontScale
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            r9.fontScale = r10
        L_0x00e2:
            int r7 = r6.mcc
            int r10 = r8.mcc
            if (r7 == r10) goto L_0x00ea
            r9.mcc = r10
        L_0x00ea:
            int r7 = r6.mnc
            int r10 = r8.mnc
            if (r7 == r10) goto L_0x00f2
            r9.mnc = r10
        L_0x00f2:
            r7 = 24
            if (r3 < r7) goto L_0x00fa
            androidx.appcompat.app.AppCompatDelegateImpl.g.a(r6, r8, r9)
            goto L_0x0108
        L_0x00fa:
            java.util.Locale r7 = r6.locale
            java.util.Locale r10 = r8.locale
            boolean r7 = v1.b.a(r7, r10)
            if (r7 != 0) goto L_0x0108
            java.util.Locale r7 = r8.locale
            r9.locale = r7
        L_0x0108:
            int r7 = r6.touchscreen
            int r10 = r8.touchscreen
            if (r7 == r10) goto L_0x0110
            r9.touchscreen = r10
        L_0x0110:
            int r7 = r6.keyboard
            int r10 = r8.keyboard
            if (r7 == r10) goto L_0x0118
            r9.keyboard = r10
        L_0x0118:
            int r7 = r6.keyboardHidden
            int r10 = r8.keyboardHidden
            if (r7 == r10) goto L_0x0120
            r9.keyboardHidden = r10
        L_0x0120:
            int r7 = r6.navigation
            int r10 = r8.navigation
            if (r7 == r10) goto L_0x0128
            r9.navigation = r10
        L_0x0128:
            int r7 = r6.navigationHidden
            int r10 = r8.navigationHidden
            if (r7 == r10) goto L_0x0130
            r9.navigationHidden = r10
        L_0x0130:
            int r7 = r6.orientation
            int r10 = r8.orientation
            if (r7 == r10) goto L_0x0138
            r9.orientation = r10
        L_0x0138:
            int r7 = r6.screenLayout
            r7 = r7 & 15
            int r10 = r8.screenLayout
            r10 = r10 & 15
            if (r7 == r10) goto L_0x0147
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0147:
            int r7 = r6.screenLayout
            r7 = r7 & 192(0xc0, float:2.69E-43)
            int r10 = r8.screenLayout
            r10 = r10 & 192(0xc0, float:2.69E-43)
            if (r7 == r10) goto L_0x0156
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0156:
            int r7 = r6.screenLayout
            r7 = r7 & 48
            int r10 = r8.screenLayout
            r10 = r10 & 48
            if (r7 == r10) goto L_0x0165
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0165:
            int r7 = r6.screenLayout
            r7 = r7 & 768(0x300, float:1.076E-42)
            int r10 = r8.screenLayout
            r10 = r10 & 768(0x300, float:1.076E-42)
            if (r7 == r10) goto L_0x0174
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0174:
            r7 = 26
            if (r3 < r7) goto L_0x017b
            androidx.appcompat.app.AppCompatDelegateImpl.h.a(r6, r8, r9)
        L_0x017b:
            int r3 = r6.uiMode
            r3 = r3 & 15
            int r7 = r8.uiMode
            r7 = r7 & 15
            if (r3 == r7) goto L_0x018a
            int r3 = r9.uiMode
            r3 = r3 | r7
            r9.uiMode = r3
        L_0x018a:
            int r3 = r6.uiMode
            r3 = r3 & 48
            int r7 = r8.uiMode
            r7 = r7 & 48
            if (r3 == r7) goto L_0x0199
            int r3 = r9.uiMode
            r3 = r3 | r7
            r9.uiMode = r3
        L_0x0199:
            int r3 = r6.screenWidthDp
            int r7 = r8.screenWidthDp
            if (r3 == r7) goto L_0x01a1
            r9.screenWidthDp = r7
        L_0x01a1:
            int r3 = r6.screenHeightDp
            int r7 = r8.screenHeightDp
            if (r3 == r7) goto L_0x01a9
            r9.screenHeightDp = r7
        L_0x01a9:
            int r3 = r6.smallestScreenWidthDp
            int r7 = r8.smallestScreenWidthDp
            if (r3 == r7) goto L_0x01b1
            r9.smallestScreenWidthDp = r7
        L_0x01b1:
            int r3 = r6.densityDpi
            int r6 = r8.densityDpi
            if (r3 == r6) goto L_0x01bb
            r9.densityDpi = r6
            goto L_0x01bb
        L_0x01ba:
            r9 = r5
        L_0x01bb:
            android.content.res.Configuration r1 = F(r12, r1, r2, r9, r0)
            l.c r2 = new l.c
            int r3 = androidx.appcompat.R$style.Theme_AppCompat_Empty
            r2.<init>((android.content.Context) r12, (int) r3)
            r2.a(r1)
            android.content.res.Resources$Theme r12 = r12.getTheme()     // Catch:{ NullPointerException -> 0x01d1 }
            if (r12 == 0) goto L_0x01d1
            r12 = r0
            goto L_0x01d2
        L_0x01d1:
            r12 = r4
        L_0x01d2:
            if (r12 == 0) goto L_0x020b
            android.content.res.Resources$Theme r12 = r2.getTheme()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 < r3) goto L_0x01e2
            m1.h.a(r12)
            goto L_0x020b
        L_0x01e2:
            java.lang.Object r1 = m1.g.f13072a
            monitor-enter(r1)
            boolean r3 = m1.g.f13074c     // Catch:{ all -> 0x0208 }
            if (r3 != 0) goto L_0x01fa
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x01f8 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01f8 }
            m1.g.f13073b = r3     // Catch:{ NoSuchMethodException -> 0x01f8 }
            r3.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01f8 }
        L_0x01f8:
            m1.g.f13074c = r0     // Catch:{ all -> 0x0208 }
        L_0x01fa:
            java.lang.reflect.Method r0 = m1.g.f13073b     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0206
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0204 }
            r0.invoke(r12, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0204 }
            goto L_0x0206
        L_0x0204:
            m1.g.f13073b = r5     // Catch:{ all -> 0x0208 }
        L_0x0206:
            monitor-exit(r1)     // Catch:{ all -> 0x0208 }
            goto L_0x020b
        L_0x0208:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0208 }
            throw r12
        L_0x020b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.d(android.content.Context):android.content.Context");
    }

    public final <T extends View> T e(int i10) {
        I();
        return this.f374s.findViewById(i10);
    }

    public final Context f() {
        return this.f373r;
    }

    public final MenuInflater g() {
        Context context;
        if (this.f378w == null) {
            O();
            ActionBar actionBar = this.f377v;
            if (actionBar != null) {
                context = actionBar.e();
            } else {
                context = this.f373r;
            }
            this.f378w = new l.f(context);
        }
        return this.f378w;
    }

    public final ActionBar h() {
        O();
        return this.f377v;
    }

    public final void i() {
        LayoutInflater from = LayoutInflater.from(this.f373r);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z10 = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    public final void j() {
        if (this.f377v != null) {
            O();
            if (!this.f377v.f()) {
                this.f364h0 |= 1;
                if (!this.f363g0) {
                    View decorView = this.f374s.getDecorView();
                    a aVar = this.f365i0;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.m(decorView, aVar);
                    this.f363g0 = true;
                }
            }
        }
    }

    public final void l(Configuration configuration) {
        if (this.N && this.H) {
            O();
            ActionBar actionBar = this.f377v;
            if (actionBar != null) {
                actionBar.g();
            }
        }
        androidx.appcompat.widget.g a10 = androidx.appcompat.widget.g.a();
        Context context = this.f373r;
        synchronized (a10) {
            androidx.appcompat.widget.d0 d0Var = a10.f1105a;
            synchronized (d0Var) {
                v0.e eVar = d0Var.f1079d.get(context);
                if (eVar != null) {
                    eVar.b();
                }
            }
        }
        this.Z = new Configuration(this.f373r.getResources().getConfiguration());
        z(false, false);
    }

    public final void m() {
        this.W = true;
        z(false, true);
        J();
        Object obj = this.f372q;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = i1.l.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f377v;
                if (actionBar == null) {
                    this.f366j0 = true;
                } else {
                    actionBar.m(true);
                }
            }
            synchronized (f.f435o) {
                f.r(this);
                f.f434n.add(new WeakReference(this));
            }
        }
        this.Z = new Configuration(this.f373r.getResources().getConfiguration());
        this.X = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f372q
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = androidx.appcompat.app.f.f435o
            monitor-enter(r0)
            androidx.appcompat.app.f.r(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f363g0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f374s
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.AppCompatDelegateImpl$a r1 = r3.f365i0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.Y = r0
            int r0 = r3.f357a0
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f372q
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            v0.h<java.lang.String, java.lang.Integer> r0 = f353p0
            java.lang.Object r1 = r3.f372q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f357a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            v0.h<java.lang.String, java.lang.Integer> r0 = f353p0
            java.lang.Object r1 = r3.f372q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            androidx.appcompat.app.ActionBar r0 = r3.f377v
            if (r0 == 0) goto L_0x0063
            r0.h()
        L_0x0063:
            androidx.appcompat.app.AppCompatDelegateImpl$m r0 = r3.f361e0
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            androidx.appcompat.app.AppCompatDelegateImpl$k r0 = r3.f362f0
            if (r0 == 0) goto L_0x0071
            r0.a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.n():void");
    }

    public final void o() {
        O();
        ActionBar actionBar = this.f377v;
        if (actionBar != null) {
            actionBar.o(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: androidx.appcompat.widget.AppCompatRatingBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: androidx.appcompat.widget.AppCompatCheckedTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: androidx.appcompat.widget.AppCompatTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: androidx.appcompat.widget.AppCompatImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: androidx.appcompat.widget.AppCompatSeekBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: androidx.appcompat.widget.AppCompatSpinner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: androidx.appcompat.widget.AppCompatRadioButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: androidx.appcompat.widget.AppCompatToggleButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: androidx.appcompat.widget.AppCompatImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: androidx.appcompat.widget.AppCompatAutoCompleteTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: androidx.appcompat.widget.AppCompatCheckBox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: androidx.appcompat.widget.AppCompatEditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: androidx.appcompat.widget.AppCompatButton} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r9v17, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            androidx.appcompat.app.o r8 = r7.f369m0
            r0 = 0
            if (r8 != 0) goto L_0x003f
            android.content.Context r8 = r7.f373r
            int[] r1 = androidx.appcompat.R$styleable.AppCompatTheme
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r1)
            int r1 = androidx.appcompat.R$styleable.AppCompatTheme_viewInflaterClass
            java.lang.String r8 = r8.getString(r1)
            if (r8 != 0) goto L_0x001d
            androidx.appcompat.app.o r8 = new androidx.appcompat.app.o
            r8.<init>()
            r7.f369m0 = r8
            goto L_0x003f
        L_0x001d:
            android.content.Context r1 = r7.f373r     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r8 = r1.loadClass(r8)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r1)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0038 }
            java.lang.Object r8 = r8.newInstance(r1)     // Catch:{ all -> 0x0038 }
            androidx.appcompat.app.o r8 = (androidx.appcompat.app.o) r8     // Catch:{ all -> 0x0038 }
            r7.f369m0 = r8     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            androidx.appcompat.app.o r8 = new androidx.appcompat.app.o
            r8.<init>()
            r7.f369m0 = r8
        L_0x003f:
            androidx.appcompat.app.o r8 = r7.f369m0
            int r1 = androidx.appcompat.widget.t0.f1234a
            r8.getClass()
            int[] r1 = androidx.appcompat.R$styleable.View
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r0, r0)
            int r2 = androidx.appcompat.R$styleable.View_theme
            int r2 = r1.getResourceId(r2, r0)
            r1.recycle()
            if (r2 == 0) goto L_0x0068
            boolean r1 = r10 instanceof l.c
            if (r1 == 0) goto L_0x0062
            r1 = r10
            l.c r1 = (l.c) r1
            int r1 = r1.f12566a
            if (r1 == r2) goto L_0x0068
        L_0x0062:
            l.c r1 = new l.c
            r1.<init>((android.content.Context) r10, (int) r2)
            goto L_0x0069
        L_0x0068:
            r1 = r10
        L_0x0069:
            r9.getClass()
            int r2 = r9.hashCode()
            r3 = 3
            r4 = -1
            r5 = 1
            switch(r2) {
                case -1946472170: goto L_0x0119;
                case -1455429095: goto L_0x010e;
                case -1346021293: goto L_0x0103;
                case -938935918: goto L_0x00f8;
                case -937446323: goto L_0x00ed;
                case -658531749: goto L_0x00e2;
                case -339785223: goto L_0x00d7;
                case 776382189: goto L_0x00cc;
                case 799298502: goto L_0x00be;
                case 1125864064: goto L_0x00b0;
                case 1413872058: goto L_0x00a2;
                case 1601505219: goto L_0x0094;
                case 1666676343: goto L_0x0086;
                case 2001146706: goto L_0x0078;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x0124
        L_0x0078:
            java.lang.String r2 = "Button"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0082
            goto L_0x0124
        L_0x0082:
            r2 = 13
            goto L_0x0125
        L_0x0086:
            java.lang.String r2 = "EditText"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0090
            goto L_0x0124
        L_0x0090:
            r2 = 12
            goto L_0x0125
        L_0x0094:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x009e
            goto L_0x0124
        L_0x009e:
            r2 = 11
            goto L_0x0125
        L_0x00a2:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00ac
            goto L_0x0124
        L_0x00ac:
            r2 = 10
            goto L_0x0125
        L_0x00b0:
            java.lang.String r2 = "ImageView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00ba
            goto L_0x0124
        L_0x00ba:
            r2 = 9
            goto L_0x0125
        L_0x00be:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00c8
            goto L_0x0124
        L_0x00c8:
            r2 = 8
            goto L_0x0125
        L_0x00cc:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00d5
            goto L_0x0124
        L_0x00d5:
            r2 = 7
            goto L_0x0125
        L_0x00d7:
            java.lang.String r2 = "Spinner"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00e0
            goto L_0x0124
        L_0x00e0:
            r2 = 6
            goto L_0x0125
        L_0x00e2:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00eb
            goto L_0x0124
        L_0x00eb:
            r2 = 5
            goto L_0x0125
        L_0x00ed:
            java.lang.String r2 = "ImageButton"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x00f6
            goto L_0x0124
        L_0x00f6:
            r2 = 4
            goto L_0x0125
        L_0x00f8:
            java.lang.String r2 = "TextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0101
            goto L_0x0124
        L_0x0101:
            r2 = r3
            goto L_0x0125
        L_0x0103:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x010c
            goto L_0x0124
        L_0x010c:
            r2 = 2
            goto L_0x0125
        L_0x010e:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            r2 = r5
            goto L_0x0125
        L_0x0119:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r2 = r0
            goto L_0x0125
        L_0x0124:
            r2 = r4
        L_0x0125:
            r6 = 0
            switch(r2) {
                case 0: goto L_0x0183;
                case 1: goto L_0x017d;
                case 2: goto L_0x0177;
                case 3: goto L_0x016f;
                case 4: goto L_0x0169;
                case 5: goto L_0x0163;
                case 6: goto L_0x015d;
                case 7: goto L_0x0155;
                case 8: goto L_0x014f;
                case 9: goto L_0x0149;
                case 10: goto L_0x0141;
                case 11: goto L_0x0139;
                case 12: goto L_0x0133;
                case 13: goto L_0x012b;
                default: goto L_0x0129;
            }
        L_0x0129:
            r2 = r6
            goto L_0x0188
        L_0x012b:
            androidx.appcompat.widget.AppCompatButton r2 = r8.b(r1, r11)
            r8.g(r2, r9)
            goto L_0x0188
        L_0x0133:
            androidx.appcompat.widget.AppCompatEditText r2 = new androidx.appcompat.widget.AppCompatEditText
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0139:
            androidx.appcompat.widget.AppCompatCheckBox r2 = r8.c(r1, r11)
            r8.g(r2, r9)
            goto L_0x0188
        L_0x0141:
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r2 = r8.a(r1, r11)
            r8.g(r2, r9)
            goto L_0x0188
        L_0x0149:
            androidx.appcompat.widget.AppCompatImageView r2 = new androidx.appcompat.widget.AppCompatImageView
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x014f:
            androidx.appcompat.widget.AppCompatToggleButton r2 = new androidx.appcompat.widget.AppCompatToggleButton
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0155:
            androidx.appcompat.widget.AppCompatRadioButton r2 = r8.d(r1, r11)
            r8.g(r2, r9)
            goto L_0x0188
        L_0x015d:
            androidx.appcompat.widget.AppCompatSpinner r2 = new androidx.appcompat.widget.AppCompatSpinner
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0163:
            androidx.appcompat.widget.AppCompatSeekBar r2 = new androidx.appcompat.widget.AppCompatSeekBar
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0169:
            androidx.appcompat.widget.AppCompatImageButton r2 = new androidx.appcompat.widget.AppCompatImageButton
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x016f:
            androidx.appcompat.widget.AppCompatTextView r2 = r8.e(r1, r11)
            r8.g(r2, r9)
            goto L_0x0188
        L_0x0177:
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r2 = new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x017d:
            androidx.appcompat.widget.AppCompatCheckedTextView r2 = new androidx.appcompat.widget.AppCompatCheckedTextView
            r2.<init>(r1, r11)
            goto L_0x0188
        L_0x0183:
            androidx.appcompat.widget.AppCompatRatingBar r2 = new androidx.appcompat.widget.AppCompatRatingBar
            r2.<init>(r1, r11)
        L_0x0188:
            if (r2 != 0) goto L_0x01e2
            if (r10 == r1) goto L_0x01e2
            java.lang.String r10 = "view"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x019a
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r6, r9)
        L_0x019a:
            java.lang.Object[] r10 = r8.f453a     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            r10[r0] = r1     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            r10[r5] = r11     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            r10 = 46
            int r10 = r9.indexOf(r10)     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            if (r4 != r10) goto L_0x01c7
            r10 = r0
        L_0x01a9:
            java.lang.String[] r2 = androidx.appcompat.app.o.f451g     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            if (r10 >= r3) goto L_0x01c0
            r2 = r2[r10]     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            android.view.View r2 = r8.f(r1, r9, r2)     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            if (r2 == 0) goto L_0x01bd
            java.lang.Object[] r8 = r8.f453a
            r8[r0] = r6
            r8[r5] = r6
            r6 = r2
            goto L_0x01e1
        L_0x01bd:
            int r10 = r10 + 1
            goto L_0x01a9
        L_0x01c0:
            java.lang.Object[] r8 = r8.f453a
            r8[r0] = r6
            r8[r5] = r6
            goto L_0x01e1
        L_0x01c7:
            android.view.View r9 = r8.f(r1, r9, r6)     // Catch:{ Exception -> 0x01db, all -> 0x01d3 }
            java.lang.Object[] r8 = r8.f453a
            r8[r0] = r6
            r8[r5] = r6
            r6 = r9
            goto L_0x01e1
        L_0x01d3:
            r9 = move-exception
            java.lang.Object[] r8 = r8.f453a
            r8[r0] = r6
            r8[r5] = r6
            throw r9
        L_0x01db:
            java.lang.Object[] r8 = r8.f453a
            r8[r0] = r6
            r8[r5] = r6
        L_0x01e1:
            r2 = r6
        L_0x01e2:
            if (r2 == 0) goto L_0x026f
            android.content.Context r8 = r2.getContext()
            boolean r9 = r8 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L_0x020c
            java.util.WeakHashMap<android.view.View, w1.q0> r9 = w1.d0.f16298a
            boolean r9 = w1.d0.c.a(r2)
            if (r9 != 0) goto L_0x01f5
            goto L_0x020c
        L_0x01f5:
            int[] r9 = androidx.appcompat.app.o.f447c
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r11, r9)
            java.lang.String r9 = r8.getString(r0)
            if (r9 == 0) goto L_0x0209
            androidx.appcompat.app.o$a r10 = new androidx.appcompat.app.o$a
            r10.<init>(r2, r9)
            r2.setOnClickListener(r10)
        L_0x0209:
            r8.recycle()
        L_0x020c:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 <= r9) goto L_0x0213
            goto L_0x026f
        L_0x0213:
            int[] r8 = androidx.appcompat.app.o.f448d
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r11, r8)
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L_0x0233
            boolean r9 = r8.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, w1.q0> r10 = w1.d0.f16298a
            w1.c0 r10 = new w1.c0
            int r3 = androidx.core.R$id.tag_accessibility_heading
            r10.<init>(r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10.e(r2, r9)
        L_0x0233:
            r8.recycle()
            int[] r8 = androidx.appcompat.app.o.f449e
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r11, r8)
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L_0x0249
            java.lang.String r9 = r8.getString(r0)
            w1.d0.p(r2, r9)
        L_0x0249:
            r8.recycle()
            int[] r8 = androidx.appcompat.app.o.f450f
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r11, r8)
            boolean r9 = r8.hasValue(r0)
            if (r9 == 0) goto L_0x026c
            boolean r9 = r8.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, w1.q0> r10 = w1.d0.f16298a
            w1.z r10 = new w1.z
            int r11 = androidx.core.R$id.tag_screen_reader_focusable
            r10.<init>(r11)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10.e(r2, r9)
        L_0x026c:
            r8.recycle()
        L_0x026f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p() {
        z(true, false);
    }

    public final void q() {
        O();
        ActionBar actionBar = this.f377v;
        if (actionBar != null) {
            actionBar.o(false);
        }
    }

    public final boolean s(int i10) {
        if (i10 == 8) {
            i10 = 108;
        } else if (i10 == 9) {
            i10 = 109;
        }
        if (this.R && i10 == 108) {
            return false;
        }
        if (this.N && i10 == 1) {
            this.N = false;
        }
        if (i10 == 1) {
            U();
            this.R = true;
            return true;
        } else if (i10 == 2) {
            U();
            this.L = true;
            return true;
        } else if (i10 == 5) {
            U();
            this.M = true;
            return true;
        } else if (i10 == 10) {
            U();
            this.P = true;
            return true;
        } else if (i10 == 108) {
            U();
            this.N = true;
            return true;
        } else if (i10 != 109) {
            return this.f374s.requestFeature(i10);
        } else {
            U();
            this.O = true;
            return true;
        }
    }

    public final void t(int i10) {
        I();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f373r).inflate(i10, viewGroup);
        this.f375t.a(this.f374s.getCallback());
    }

    public final void u(View view) {
        I();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f375t.a(this.f374s.getCallback());
    }

    public final void v(View view, ViewGroup.LayoutParams layoutParams) {
        I();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f375t.a(this.f374s.getCallback());
    }

    public final void w(Toolbar toolbar) {
        CharSequence charSequence;
        if (this.f372q instanceof Activity) {
            O();
            ActionBar actionBar = this.f377v;
            if (!(actionBar instanceof v)) {
                this.f378w = null;
                if (actionBar != null) {
                    actionBar.h();
                }
                this.f377v = null;
                if (toolbar != null) {
                    Object obj = this.f372q;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f379x;
                    }
                    s sVar = new s(toolbar, charSequence, this.f375t);
                    this.f377v = sVar;
                    this.f375t.f406b = sVar.f475c;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f375t.f406b = null;
                }
                j();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void x(int i10) {
        this.f358b0 = i10;
    }

    public final void y(CharSequence charSequence) {
        this.f379x = charSequence;
        v vVar = this.f380y;
        if (vVar != null) {
            vVar.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f377v;
        if (actionBar != null) {
            actionBar.p(charSequence);
            return;
        }
        TextView textView = this.J;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z(boolean r13, boolean r14) {
        /*
            r12 = this;
            boolean r0 = r12.Y
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r12.f357a0
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r0 = androidx.appcompat.app.f.f429b
        L_0x000f:
            android.content.Context r2 = r12.f373r
            int r2 = r12.P(r2, r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            r5 = 0
            if (r3 >= r4) goto L_0x0023
            android.content.Context r4 = r12.f373r
            s1.j r4 = B(r4)
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            if (r14 != 0) goto L_0x0036
            if (r4 == 0) goto L_0x0036
            android.content.Context r14 = r12.f373r
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            s1.j r4 = L(r14)
        L_0x0036:
            android.content.Context r14 = r12.f373r
            android.content.res.Configuration r14 = F(r14, r2, r4, r5, r1)
            android.content.Context r2 = r12.f373r
            boolean r6 = r12.f360d0
            r7 = 1
            r8 = 24
            if (r6 != 0) goto L_0x0078
            java.lang.Object r6 = r12.f372q
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0078
            android.content.pm.PackageManager r6 = r2.getPackageManager()
            if (r6 != 0) goto L_0x0053
            r2 = r1
            goto L_0x007c
        L_0x0053:
            r9 = 29
            if (r3 < r9) goto L_0x005a
            r3 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0060
        L_0x005a:
            if (r3 < r8) goto L_0x005f
            r3 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0060
        L_0x005f:
            r3 = r1
        L_0x0060:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.Object r10 = r12.f372q     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0076 }
            r9.<init>(r2, r10)     // Catch:{ NameNotFoundException -> 0x0076 }
            android.content.pm.ActivityInfo r2 = r6.getActivityInfo(r9, r3)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r2 == 0) goto L_0x0078
            int r2 = r2.configChanges     // Catch:{ NameNotFoundException -> 0x0076 }
            r12.f359c0 = r2     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x0078
        L_0x0076:
            r12.f359c0 = r1
        L_0x0078:
            r12.f360d0 = r7
            int r2 = r12.f359c0
        L_0x007c:
            android.content.res.Configuration r3 = r12.Z
            if (r3 != 0) goto L_0x008a
            android.content.Context r3 = r12.f373r
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L_0x008a:
            int r6 = r3.uiMode
            r6 = r6 & 48
            int r9 = r14.uiMode
            r9 = r9 & 48
            s1.j r3 = L(r3)
            if (r4 != 0) goto L_0x009a
            r14 = r5
            goto L_0x009e
        L_0x009a:
            s1.j r14 = L(r14)
        L_0x009e:
            if (r6 == r9) goto L_0x00a3
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x00a4
        L_0x00a3:
            r4 = r1
        L_0x00a4:
            if (r14 == 0) goto L_0x00b0
            boolean r3 = r3.equals(r14)
            if (r3 != 0) goto L_0x00b0
            r3 = r4 | 4
            r4 = r3 | 8192(0x2000, float:1.14794E-41)
        L_0x00b0:
            int r3 = ~r2
            r3 = r3 & r4
            r6 = 28
            if (r3 == 0) goto L_0x00f4
            if (r13 == 0) goto L_0x00f4
            boolean r13 = r12.W
            if (r13 == 0) goto L_0x00f4
            boolean r13 = f355r0
            if (r13 != 0) goto L_0x00c4
            boolean r13 = r12.X
            if (r13 == 0) goto L_0x00f4
        L_0x00c4:
            java.lang.Object r13 = r12.f372q
            boolean r3 = r13 instanceof android.app.Activity
            if (r3 == 0) goto L_0x00f4
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r13 = r13.isChild()
            if (r13 != 0) goto L_0x00f4
            java.lang.Object r13 = r12.f372q
            android.app.Activity r13 = (android.app.Activity) r13
            int r3 = i1.a.f10925a
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto L_0x00e0
            r13.recreate()
            goto L_0x00f2
        L_0x00e0:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r10 = r13.getMainLooper()
            r3.<init>(r10)
            d.i r10 = new d.i
            r11 = 6
            r10.<init>(r13, r11)
            r3.post(r10)
        L_0x00f2:
            r13 = r7
            goto L_0x00f5
        L_0x00f4:
            r13 = r1
        L_0x00f5:
            if (r13 != 0) goto L_0x01eb
            if (r4 == 0) goto L_0x01eb
            r13 = r4 & r2
            if (r13 != r4) goto L_0x00ff
            r13 = r7
            goto L_0x0100
        L_0x00ff:
            r13 = r1
        L_0x0100:
            android.content.Context r2 = r12.f373r
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r3 = new android.content.res.Configuration
            android.content.res.Configuration r10 = r2.getConfiguration()
            r3.<init>(r10)
            android.content.res.Configuration r10 = r2.getConfiguration()
            int r10 = r10.uiMode
            r10 = r10 & -49
            r9 = r9 | r10
            r3.uiMode = r9
            if (r14 == 0) goto L_0x0132
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r8) goto L_0x0124
            androidx.appcompat.app.AppCompatDelegateImpl.g.d(r3, r14)
            goto L_0x0132
        L_0x0124:
            java.util.Locale r9 = r14.c(r1)
            androidx.appcompat.app.AppCompatDelegateImpl.e.b(r3, r9)
            java.util.Locale r9 = r14.c(r1)
            androidx.appcompat.app.AppCompatDelegateImpl.e.a(r3, r9)
        L_0x0132:
            r2.updateConfiguration(r3, r5)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 >= r10) goto L_0x01a3
            if (r9 < r6) goto L_0x013e
            goto L_0x01a3
        L_0x013e:
            java.lang.String r6 = "mDrawableCache"
            if (r9 < r8) goto L_0x0184
            boolean r9 = androidx.appcompat.app.r.f472h
            if (r9 != 0) goto L_0x0155
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.String r10 = "mResourcesImpl"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ NoSuchFieldException -> 0x0153 }
            androidx.appcompat.app.r.f471g = r9     // Catch:{ NoSuchFieldException -> 0x0153 }
            r9.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x0153 }
        L_0x0153:
            androidx.appcompat.app.r.f472h = r7
        L_0x0155:
            java.lang.reflect.Field r9 = androidx.appcompat.app.r.f471g
            if (r9 != 0) goto L_0x015a
            goto L_0x01a3
        L_0x015a:
            java.lang.Object r2 = r9.get(r2)     // Catch:{ IllegalAccessException -> 0x015f }
            goto L_0x0160
        L_0x015f:
            r2 = r5
        L_0x0160:
            if (r2 != 0) goto L_0x0163
            goto L_0x01a3
        L_0x0163:
            boolean r9 = androidx.appcompat.app.r.f466b
            if (r9 != 0) goto L_0x0176
            java.lang.Class r9 = r2.getClass()     // Catch:{ NoSuchFieldException -> 0x0174 }
            java.lang.reflect.Field r6 = r9.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0174 }
            androidx.appcompat.app.r.f465a = r6     // Catch:{ NoSuchFieldException -> 0x0174 }
            r6.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x0174 }
        L_0x0174:
            androidx.appcompat.app.r.f466b = r7
        L_0x0176:
            java.lang.reflect.Field r6 = androidx.appcompat.app.r.f465a
            if (r6 == 0) goto L_0x017e
            java.lang.Object r5 = r6.get(r2)     // Catch:{ IllegalAccessException -> 0x017e }
        L_0x017e:
            if (r5 == 0) goto L_0x01a3
            androidx.appcompat.app.r.a(r5)
            goto L_0x01a3
        L_0x0184:
            boolean r9 = androidx.appcompat.app.r.f466b
            if (r9 != 0) goto L_0x0195
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.reflect.Field r6 = r9.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x0193 }
            androidx.appcompat.app.r.f465a = r6     // Catch:{ NoSuchFieldException -> 0x0193 }
            r6.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x0193 }
        L_0x0193:
            androidx.appcompat.app.r.f466b = r7
        L_0x0195:
            java.lang.reflect.Field r6 = androidx.appcompat.app.r.f465a
            if (r6 == 0) goto L_0x019d
            java.lang.Object r5 = r6.get(r2)     // Catch:{ IllegalAccessException -> 0x019d }
        L_0x019d:
            if (r5 != 0) goto L_0x01a0
            goto L_0x01a3
        L_0x01a0:
            androidx.appcompat.app.r.a(r5)
        L_0x01a3:
            int r2 = r12.f358b0
            if (r2 == 0) goto L_0x01b7
            android.content.Context r5 = r12.f373r
            r5.setTheme(r2)
            android.content.Context r2 = r12.f373r
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r5 = r12.f358b0
            r2.applyStyle(r5, r7)
        L_0x01b7:
            if (r13 == 0) goto L_0x01ec
            java.lang.Object r13 = r12.f372q
            boolean r2 = r13 instanceof android.app.Activity
            if (r2 == 0) goto L_0x01ec
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r2 = r13 instanceof r2.l
            if (r2 == 0) goto L_0x01df
            r2 = r13
            r2.l r2 = (r2.l) r2
            androidx.lifecycle.o r2 = r2.B()
            androidx.lifecycle.i$b r2 = r2.f2785d
            androidx.lifecycle.i$b r5 = androidx.lifecycle.i.b.CREATED
            int r2 = r2.compareTo(r5)
            if (r2 < 0) goto L_0x01d8
            r2 = r7
            goto L_0x01d9
        L_0x01d8:
            r2 = r1
        L_0x01d9:
            if (r2 == 0) goto L_0x01ec
            r13.onConfigurationChanged(r3)
            goto L_0x01ec
        L_0x01df:
            boolean r2 = r12.X
            if (r2 == 0) goto L_0x01ec
            boolean r2 = r12.Y
            if (r2 != 0) goto L_0x01ec
            r13.onConfigurationChanged(r3)
            goto L_0x01ec
        L_0x01eb:
            r7 = r13
        L_0x01ec:
            if (r7 == 0) goto L_0x0208
            java.lang.Object r13 = r12.f372q
            boolean r2 = r13 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto L_0x0208
            r2 = r4 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x01fd
            androidx.appcompat.app.AppCompatActivity r13 = (androidx.appcompat.app.AppCompatActivity) r13
            r13.getClass()
        L_0x01fd:
            r13 = r4 & 4
            if (r13 == 0) goto L_0x0208
            java.lang.Object r13 = r12.f372q
            androidx.appcompat.app.AppCompatActivity r13 = (androidx.appcompat.app.AppCompatActivity) r13
            r13.getClass()
        L_0x0208:
            if (r7 == 0) goto L_0x0229
            if (r14 == 0) goto L_0x0229
            android.content.Context r13 = r12.f373r
            android.content.res.Resources r13 = r13.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            s1.j r13 = L(r13)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r8) goto L_0x0222
            androidx.appcompat.app.AppCompatDelegateImpl.g.c(r13)
            goto L_0x0229
        L_0x0222:
            java.util.Locale r13 = r13.c(r1)
            java.util.Locale.setDefault(r13)
        L_0x0229:
            if (r0 != 0) goto L_0x0235
            android.content.Context r13 = r12.f373r
            androidx.appcompat.app.AppCompatDelegateImpl$l r13 = r12.K(r13)
            r13.e()
            goto L_0x023c
        L_0x0235:
            androidx.appcompat.app.AppCompatDelegateImpl$m r13 = r12.f361e0
            if (r13 == 0) goto L_0x023c
            r13.a()
        L_0x023c:
            r13 = 3
            if (r0 != r13) goto L_0x0252
            android.content.Context r13 = r12.f373r
            androidx.appcompat.app.AppCompatDelegateImpl$k r14 = r12.f362f0
            if (r14 != 0) goto L_0x024c
            androidx.appcompat.app.AppCompatDelegateImpl$k r14 = new androidx.appcompat.app.AppCompatDelegateImpl$k
            r14.<init>(r13)
            r12.f362f0 = r14
        L_0x024c:
            androidx.appcompat.app.AppCompatDelegateImpl$k r13 = r12.f362f0
            r13.e()
            goto L_0x0259
        L_0x0252:
            androidx.appcompat.app.AppCompatDelegateImpl$k r13 = r12.f362f0
            if (r13 == 0) goto L_0x0259
            r13.a()
        L_0x0259:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.z(boolean, boolean):boolean");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
