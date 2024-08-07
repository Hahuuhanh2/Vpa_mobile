package d;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import sk.j;

/* compiled from: EdgeToEdge.kt */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8439a = Color.argb(230, 255, 255, 255);

    /* renamed from: b  reason: collision with root package name */
    public static final int f8440b = Color.argb(128, 27, 27, 27);

    public static void a(ComponentActivity componentActivity) {
        o lVar;
        b0 b0Var = b0.f8422a;
        j.f(b0Var, "detectDarkMode");
        c0 c0Var = new c0(0, 0, b0Var);
        int i10 = f8439a;
        int i11 = f8440b;
        j.f(b0Var, "detectDarkMode");
        c0 c0Var2 = new c0(i10, i11, b0Var);
        j.f(componentActivity, "<this>");
        View decorView = componentActivity.getWindow().getDecorView();
        j.e(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        j.e(resources, "view.resources");
        boolean booleanValue = ((Boolean) b0Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        j.e(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) b0Var.invoke(resources2)).booleanValue();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            lVar = new n();
        } else if (i12 >= 26) {
            lVar = new m();
        } else {
            lVar = new l();
        }
        o oVar = lVar;
        Window window = componentActivity.getWindow();
        j.e(window, "window");
        oVar.a(c0Var, c0Var2, window, decorView, booleanValue, booleanValue2);
    }
}
