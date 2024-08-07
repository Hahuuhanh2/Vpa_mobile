package w1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import v0.h;

/* compiled from: WindowInsetsControllerCompat */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f16423a;

    /* compiled from: WindowInsetsControllerCompat */
    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f16424a;

        /* renamed from: b  reason: collision with root package name */
        public final w f16425b;

        public a(Window window, w wVar) {
            this.f16424a = window;
            this.f16425b = wVar;
        }

        public final void a() {
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((8 & i10) != 0) {
                    if (i10 == 1) {
                        f(4);
                    } else if (i10 == 2) {
                        f(2);
                    } else if (i10 == 8) {
                        this.f16425b.f16386a.a();
                    }
                }
            }
        }

        public final void e() {
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((8 & i10) != 0) {
                    if (i10 == 1) {
                        g(4);
                        this.f16424a.clearFlags(1024);
                    } else if (i10 == 2) {
                        g(2);
                    } else if (i10 == 8) {
                        this.f16425b.f16386a.b();
                    }
                }
            }
        }

        public final void f(int i10) {
            View decorView = this.f16424a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public final void g(int i10) {
            View decorView = this.f16424a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class b extends a {
        public b(Window window, w wVar) {
            super(window, wVar);
        }

        public final boolean b() {
            if ((this.f16424a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        public final void d(boolean z10) {
            if (z10) {
                this.f16424a.clearFlags(67108864);
                this.f16424a.addFlags(Integer.MIN_VALUE);
                f(8192);
                return;
            }
            g(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class c extends b {
        public c(Window window, w wVar) {
            super(window, wVar);
        }

        public final void c(boolean z10) {
            if (z10) {
                this.f16424a.clearFlags(134217728);
                this.f16424a.addFlags(Integer.MIN_VALUE);
                f(16);
                return;
            }
            g(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f16426a;

        /* renamed from: b  reason: collision with root package name */
        public final w f16427b;

        /* renamed from: c  reason: collision with root package name */
        public Window f16428c;

        public d(WindowInsetsController windowInsetsController, w wVar) {
            new h();
            this.f16426a = windowInsetsController;
            this.f16427b = wVar;
        }

        public final void a() {
            this.f16427b.f16386a.a();
            this.f16426a.hide(0);
        }

        public final boolean b() {
            if ((this.f16426a.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
            return false;
        }

        public final void c(boolean z10) {
            if (z10) {
                Window window = this.f16428c;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f16426a.setSystemBarsAppearance(16, 16);
                return;
            }
            Window window2 = this.f16428c;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
            }
            this.f16426a.setSystemBarsAppearance(0, 16);
        }

        public final void d(boolean z10) {
            if (z10) {
                Window window = this.f16428c;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                this.f16426a.setSystemBarsAppearance(8, 8);
                return;
            }
            Window window2 = this.f16428c;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
            }
            this.f16426a.setSystemBarsAppearance(0, 8);
        }

        public final void e() {
            this.f16427b.f16386a.b();
            this.f16426a.show(0);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    public static class e {
        public void a() {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
        }

        public void d(boolean z10) {
            throw null;
        }

        public void e() {
            throw null;
        }
    }

    @Deprecated
    public x0(WindowInsetsController windowInsetsController) {
        this.f16423a = new d(windowInsetsController, new w(windowInsetsController));
    }

    public x0(Window window, View view) {
        w wVar = new w(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d dVar = new d(window.getInsetsController(), wVar);
            dVar.f16428c = window;
            this.f16423a = dVar;
        } else if (i10 >= 26) {
            this.f16423a = new c(window, wVar);
        } else {
            this.f16423a = new b(window, wVar);
        }
    }
}
