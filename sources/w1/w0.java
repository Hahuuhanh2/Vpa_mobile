package w1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import w1.d;
import w1.d0;

/* compiled from: WindowInsetsCompat */
public final class w0 {

    /* renamed from: b  reason: collision with root package name */
    public static final w0 f16390b;

    /* renamed from: a  reason: collision with root package name */
    public final k f16391a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* compiled from: WindowInsetsCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f16392a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f16393b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f16394c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f16395d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f16392a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f16393b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f16394c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class d extends c {
        public d() {
        }

        public void c(int i10, n1.e eVar) {
            this.f16402c.setInsets(m.a(i10), eVar.d());
        }

        public d(w0 w0Var) {
            super(w0Var);
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final w0 f16403a;

        /* renamed from: b  reason: collision with root package name */
        public n1.e[] f16404b;

        public e() {
            this(new w0());
        }

        public final void a() {
            n1.e[] eVarArr = this.f16404b;
            if (eVarArr != null) {
                n1.e eVar = eVarArr[l.a(1)];
                n1.e eVar2 = this.f16404b[l.a(2)];
                if (eVar2 == null) {
                    eVar2 = this.f16403a.a(2);
                }
                if (eVar == null) {
                    eVar = this.f16403a.a(1);
                }
                g(n1.e.a(eVar, eVar2));
                n1.e eVar3 = this.f16404b[l.a(16)];
                if (eVar3 != null) {
                    f(eVar3);
                }
                n1.e eVar4 = this.f16404b[l.a(32)];
                if (eVar4 != null) {
                    d(eVar4);
                }
                n1.e eVar5 = this.f16404b[l.a(64)];
                if (eVar5 != null) {
                    h(eVar5);
                }
            }
        }

        public w0 b() {
            throw null;
        }

        public void c(int i10, n1.e eVar) {
            if (this.f16404b == null) {
                this.f16404b = new n1.e[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f16404b[l.a(i11)] = eVar;
                }
            }
        }

        public void d(n1.e eVar) {
        }

        public void e(n1.e eVar) {
            throw null;
        }

        public void f(n1.e eVar) {
        }

        public void g(n1.e eVar) {
            throw null;
        }

        public void h(n1.e eVar) {
        }

        public e(w0 w0Var) {
            this.f16403a = w0Var;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f16405h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f16406i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f16407j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f16408k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f16409l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f16410c;

        /* renamed from: d  reason: collision with root package name */
        public n1.e[] f16411d;

        /* renamed from: e  reason: collision with root package name */
        public n1.e f16412e = null;

        /* renamed from: f  reason: collision with root package name */
        public w0 f16413f;

        /* renamed from: g  reason: collision with root package name */
        public n1.e f16414g;

        public f(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var);
            this.f16410c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private n1.e r(int i10, boolean z10) {
            n1.e eVar = n1.e.f13426e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    eVar = n1.e.a(eVar, s(i11, z10));
                }
            }
            return eVar;
        }

        private n1.e t() {
            w0 w0Var = this.f16413f;
            if (w0Var != null) {
                return w0Var.f16391a.h();
            }
            return n1.e.f13426e;
        }

        private n1.e u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f16405h) {
                    v();
                }
                Method method = f16406i;
                if (!(method == null || f16407j == null || f16408k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f16408k.get(f16409l.get(invoke));
                        if (rect != null) {
                            return n1.e.b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        e10.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                f16406i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f16407j = cls;
                f16408k = cls.getDeclaredField("mVisibleInsets");
                f16409l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f16408k.setAccessible(true);
                f16409l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
            f16405h = true;
        }

        public void d(View view) {
            n1.e u10 = u(view);
            if (u10 == null) {
                u10 = n1.e.f13426e;
            }
            w(u10);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f16414g, ((f) obj).f16414g);
        }

        public n1.e f(int i10) {
            return r(i10, false);
        }

        public final n1.e j() {
            if (this.f16412e == null) {
                this.f16412e = n1.e.b(this.f16410c.getSystemWindowInsetLeft(), this.f16410c.getSystemWindowInsetTop(), this.f16410c.getSystemWindowInsetRight(), this.f16410c.getSystemWindowInsetBottom());
            }
            return this.f16412e;
        }

        public w0 l(int i10, int i11, int i12, int i13) {
            e eVar;
            w0 i14 = w0.i((View) null, this.f16410c);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                eVar = new d(i14);
            } else if (i15 >= 29) {
                eVar = new c(i14);
            } else {
                eVar = new b(i14);
            }
            eVar.g(w0.f(j(), i10, i11, i12, i13));
            eVar.e(w0.f(h(), i10, i11, i12, i13));
            return eVar.b();
        }

        public boolean n() {
            return this.f16410c.isRound();
        }

        public void o(n1.e[] eVarArr) {
            this.f16411d = eVarArr;
        }

        public void p(w0 w0Var) {
            this.f16413f = w0Var;
        }

        public n1.e s(int i10, boolean z10) {
            int i11;
            d dVar;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (i10 != 1) {
                n1.e eVar = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        n1.e[] eVarArr = this.f16411d;
                        if (eVarArr != null) {
                            eVar = eVarArr[l.a(8)];
                        }
                        if (eVar != null) {
                            return eVar;
                        }
                        n1.e j10 = j();
                        n1.e t10 = t();
                        int i16 = j10.f13430d;
                        if (i16 > t10.f13430d) {
                            return n1.e.b(0, 0, 0, i16);
                        }
                        n1.e eVar2 = this.f16414g;
                        if (eVar2 == null || eVar2.equals(n1.e.f13426e) || (i11 = this.f16414g.f13430d) <= t10.f13430d) {
                            return n1.e.f13426e;
                        }
                        return n1.e.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return i();
                    } else {
                        if (i10 == 32) {
                            return g();
                        }
                        if (i10 == 64) {
                            return k();
                        }
                        if (i10 != 128) {
                            return n1.e.f13426e;
                        }
                        w0 w0Var = this.f16413f;
                        if (w0Var != null) {
                            dVar = w0Var.f16391a.e();
                        } else {
                            dVar = e();
                        }
                        if (dVar == null) {
                            return n1.e.f13426e;
                        }
                        int i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 28) {
                            i12 = d.a.d(dVar.f16297a);
                        } else {
                            i12 = 0;
                        }
                        if (i17 >= 28) {
                            i13 = d.a.f(dVar.f16297a);
                        } else {
                            i13 = 0;
                        }
                        if (i17 >= 28) {
                            i14 = d.a.e(dVar.f16297a);
                        } else {
                            i14 = 0;
                        }
                        if (i17 >= 28) {
                            i15 = d.a.c(dVar.f16297a);
                        }
                        return n1.e.b(i12, i13, i14, i15);
                    }
                } else if (z10) {
                    n1.e t11 = t();
                    n1.e h10 = h();
                    return n1.e.b(Math.max(t11.f13427a, h10.f13427a), 0, Math.max(t11.f13429c, h10.f13429c), Math.max(t11.f13430d, h10.f13430d));
                } else {
                    n1.e j11 = j();
                    w0 w0Var2 = this.f16413f;
                    if (w0Var2 != null) {
                        eVar = w0Var2.f16391a.h();
                    }
                    int i18 = j11.f13430d;
                    if (eVar != null) {
                        i18 = Math.min(i18, eVar.f13430d);
                    }
                    return n1.e.b(j11.f13427a, 0, j11.f13429c, i18);
                }
            } else if (z10) {
                return n1.e.b(0, Math.max(t().f13428b, j().f13428b), 0, 0);
            } else {
                return n1.e.b(0, j().f13428b, 0, 0);
            }
        }

        public void w(n1.e eVar) {
            this.f16414g = eVar;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public n1.e f16415m = null;

        public g(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        public w0 b() {
            return w0.i((View) null, this.f16410c.consumeStableInsets());
        }

        public w0 c() {
            return w0.i((View) null, this.f16410c.consumeSystemWindowInsets());
        }

        public final n1.e h() {
            if (this.f16415m == null) {
                this.f16415m = n1.e.b(this.f16410c.getStableInsetLeft(), this.f16410c.getStableInsetTop(), this.f16410c.getStableInsetRight(), this.f16410c.getStableInsetBottom());
            }
            return this.f16415m;
        }

        public boolean m() {
            return this.f16410c.isConsumed();
        }

        public void q(n1.e eVar) {
            this.f16415m = eVar;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class h extends g {
        public h(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        public w0 a() {
            return w0.i((View) null, this.f16410c.consumeDisplayCutout());
        }

        public d e() {
            DisplayCutout b10 = this.f16410c.getDisplayCutout();
            if (b10 == null) {
                return null;
            }
            return new d(b10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (!Objects.equals(this.f16410c, hVar.f16410c) || !Objects.equals(this.f16414g, hVar.f16414g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f16410c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public n1.e f16416n = null;

        /* renamed from: o  reason: collision with root package name */
        public n1.e f16417o = null;

        /* renamed from: p  reason: collision with root package name */
        public n1.e f16418p = null;

        public i(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        public n1.e g() {
            if (this.f16417o == null) {
                this.f16417o = n1.e.c(this.f16410c.getMandatorySystemGestureInsets());
            }
            return this.f16417o;
        }

        public n1.e i() {
            if (this.f16416n == null) {
                this.f16416n = n1.e.c(this.f16410c.getSystemGestureInsets());
            }
            return this.f16416n;
        }

        public n1.e k() {
            if (this.f16418p == null) {
                this.f16418p = n1.e.c(this.f16410c.getTappableElementInsets());
            }
            return this.f16418p;
        }

        public w0 l(int i10, int i11, int i12, int i13) {
            return w0.i((View) null, this.f16410c.inset(i10, i11, i12, i13));
        }

        public void q(n1.e eVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final w0 f16419q = w0.i((View) null, WindowInsets.CONSUMED);

        public j(w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        public final void d(View view) {
        }

        public n1.e f(int i10) {
            return n1.e.c(this.f16410c.getInsets(m.a(i10)));
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final w0 f16420b;

        /* renamed from: a  reason: collision with root package name */
        public final w0 f16421a;

        static {
            e eVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                eVar = new d();
            } else if (i10 >= 29) {
                eVar = new c();
            } else {
                eVar = new b();
            }
            f16420b = eVar.b().f16391a.a().f16391a.b().f16391a.c();
        }

        public k(w0 w0Var) {
            this.f16421a = w0Var;
        }

        public w0 a() {
            return this.f16421a;
        }

        public w0 b() {
            return this.f16421a;
        }

        public w0 c() {
            return this.f16421a;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() != kVar.n() || m() != kVar.m() || !v1.b.a(j(), kVar.j()) || !v1.b.a(h(), kVar.h()) || !v1.b.a(e(), kVar.e())) {
                return false;
            }
            return true;
        }

        public n1.e f(int i10) {
            return n1.e.f13426e;
        }

        public n1.e g() {
            return j();
        }

        public n1.e h() {
            return n1.e.f13426e;
        }

        public int hashCode() {
            return v1.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public n1.e i() {
            return j();
        }

        public n1.e j() {
            return n1.e.f13426e;
        }

        public n1.e k() {
            return j();
        }

        public w0 l(int i10, int i11, int i12, int i13) {
            return f16420b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(n1.e[] eVarArr) {
        }

        public void p(w0 w0Var) {
        }

        public void q(n1.e eVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class l {
        public static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.m("type needs to be >= FIRST and <= LAST, type=", i10));
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class m {
        public static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets$Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets$Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets$Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets$Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets$Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets$Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets$Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f16390b = j.f16419q;
        } else {
            f16390b = k.f16420b;
        }
    }

    public w0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f16391a = new j(this, windowInsets);
        } else if (i10 >= 29) {
            this.f16391a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f16391a = new h(this, windowInsets);
        } else {
            this.f16391a = new g(this, windowInsets);
        }
    }

    public static n1.e f(n1.e eVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, eVar.f13427a - i10);
        int max2 = Math.max(0, eVar.f13428b - i11);
        int max3 = Math.max(0, eVar.f13429c - i12);
        int max4 = Math.max(0, eVar.f13430d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return eVar;
        }
        return n1.e.b(max, max2, max3, max4);
    }

    public static w0 i(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w0 w0Var = new w0(windowInsets);
        if (view != null) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.g.b(view)) {
                w0Var.f16391a.p(d0.j.a(view));
                w0Var.f16391a.d(view.getRootView());
            }
        }
        return w0Var;
    }

    public final n1.e a(int i10) {
        return this.f16391a.f(i10);
    }

    @Deprecated
    public final int b() {
        return this.f16391a.j().f13430d;
    }

    @Deprecated
    public final int c() {
        return this.f16391a.j().f13427a;
    }

    @Deprecated
    public final int d() {
        return this.f16391a.j().f13429c;
    }

    @Deprecated
    public final int e() {
        return this.f16391a.j().f13428b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return v1.b.a(this.f16391a, ((w0) obj).f16391a);
    }

    @Deprecated
    public final w0 g(int i10, int i11, int i12, int i13) {
        e eVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            eVar = new d(this);
        } else if (i14 >= 29) {
            eVar = new c(this);
        } else {
            eVar = new b(this);
        }
        eVar.g(n1.e.b(i10, i11, i12, i13));
        return eVar.b();
    }

    public final WindowInsets h() {
        k kVar = this.f16391a;
        if (kVar instanceof f) {
            return ((f) kVar).f16410c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f16391a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public static Field f16396e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f16397f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor<WindowInsets> f16398g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f16399h = false;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsets f16400c;

        /* renamed from: d  reason: collision with root package name */
        public n1.e f16401d;

        public b() {
            this.f16400c = i();
        }

        private static WindowInsets i() {
            if (!f16397f) {
                try {
                    f16396e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f16397f = true;
            }
            Field field = f16396e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f16399h) {
                try {
                    f16398g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f16399h = true;
            }
            Constructor<WindowInsets> constructor = f16398g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        public w0 b() {
            a();
            w0 i10 = w0.i((View) null, this.f16400c);
            i10.f16391a.o(this.f16404b);
            i10.f16391a.q(this.f16401d);
            return i10;
        }

        public void e(n1.e eVar) {
            this.f16401d = eVar;
        }

        public void g(n1.e eVar) {
            WindowInsets windowInsets = this.f16400c;
            if (windowInsets != null) {
                this.f16400c = windowInsets.replaceSystemWindowInsets(eVar.f13427a, eVar.f13428b, eVar.f13429c, eVar.f13430d);
            }
        }

        public b(w0 w0Var) {
            super(w0Var);
            this.f16400c = w0Var.h();
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class c extends e {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets$Builder f16402c;

        public c() {
            this.f16402c = new WindowInsets$Builder();
        }

        public w0 b() {
            a();
            w0 i10 = w0.i((View) null, this.f16402c.build());
            i10.f16391a.o(this.f16404b);
            return i10;
        }

        public void d(n1.e eVar) {
            this.f16402c.setMandatorySystemGestureInsets(eVar.d());
        }

        public void e(n1.e eVar) {
            this.f16402c.setStableInsets(eVar.d());
        }

        public void f(n1.e eVar) {
            this.f16402c.setSystemGestureInsets(eVar.d());
        }

        public void g(n1.e eVar) {
            this.f16402c.setSystemWindowInsets(eVar.d());
        }

        public void h(n1.e eVar) {
            this.f16402c.setTappableElementInsets(eVar.d());
        }

        public c(w0 w0Var) {
            super(w0Var);
            WindowInsets$Builder windowInsets$Builder;
            WindowInsets h10 = w0Var.h();
            if (h10 != null) {
                windowInsets$Builder = new WindowInsets$Builder(h10);
            } else {
                new WindowInsets$Builder
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r0v1 ? I:android.view.WindowInsets$Builder) =  call: android.view.WindowInsets$Builder.<init>():void type: CONSTRUCTOR in method: w1.w0.c.<init>(w1.w0):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v1 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 51 more
                    */
                /*
                    this = this;
                    r1.<init>(r2)
                    android.view.WindowInsets r2 = r2.h()
                    if (r2 == 0) goto L_0x000f
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>(r2)
                    goto L_0x0014
                L_0x000f:
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>()
                L_0x0014:
                    r1.f16402c = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: w1.w0.c.<init>(w1.w0):void");
            }
        }

        public w0() {
            this.f16391a = new k(this);
        }
    }
