package d;

import android.os.Build;
import android.view.View;
import android.view.Window;
import sk.j;
import w1.u0;
import w1.w;
import w1.x0;

/* compiled from: EdgeToEdge.kt */
public final class l implements o {
    public void a(c0 c0Var, c0 c0Var2, Window window, View view, boolean z10, boolean z11) {
        int i10;
        x0.d dVar;
        j.f(c0Var, "statusBarStyle");
        j.f(c0Var2, "navigationBarStyle");
        j.f(window, "window");
        j.f(view, "view");
        u0.a(window, false);
        if (z10) {
            i10 = c0Var.f8424b;
        } else {
            i10 = c0Var.f8423a;
        }
        window.setStatusBarColor(i10);
        window.setNavigationBarColor(c0Var2.f8424b);
        w wVar = new w(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            x0.d dVar2 = new x0.d(window.getInsetsController(), wVar);
            dVar2.f16428c = window;
            dVar = dVar2;
        } else if (i11 >= 26) {
            dVar = new x0.c(window, wVar);
        } else {
            dVar = new x0.b(window, wVar);
        }
        dVar.d(!z10);
    }
}
