package qg;

import android.view.View;

/* compiled from: OnClickListener */
public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0304a f22750a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22751b;

    /* renamed from: qg.a$a  reason: collision with other inner class name */
    /* compiled from: OnClickListener */
    public interface C0304a {
        void e(int i10);
    }

    public a(C0304a aVar, int i10) {
        this.f22750a = aVar;
        this.f22751b = i10;
    }

    public final void onClick(View view) {
        this.f22750a.e(this.f22751b);
    }
}
