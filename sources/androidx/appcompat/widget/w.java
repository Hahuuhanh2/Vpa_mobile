package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import w1.q0;

/* compiled from: DecorToolbar */
public interface w {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    void g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    void j();

    void k(int i10);

    void l();

    q0 m(int i10, long j10);

    int n();

    void o();

    void p();

    void q(boolean z10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setMenu(Menu menu, j.a aVar);

    void setMenuPrepared();

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
