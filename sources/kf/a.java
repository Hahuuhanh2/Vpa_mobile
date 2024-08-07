package kf;

import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import r2.k;

/* compiled from: AutoDisposable.kt */
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public sj.a f12546a;

    public final void a(o oVar) {
        oVar.a(this);
        this.f12546a = new sj.a();
    }

    @q(i.a.ON_DESTROY)
    public final void onDestroy() {
        sj.a aVar = this.f12546a;
        if (aVar != null) {
            aVar.b();
        }
    }
}
