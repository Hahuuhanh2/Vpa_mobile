package al;

import android.support.v4.media.a;
import ek.i;

/* compiled from: CancellableContinuation.kt */
public final class u0 extends i {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f19095a;

    public u0(t0 t0Var) {
        this.f19095a = t0Var;
    }

    public final void h(Throwable th2) {
        this.f19095a.b();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h((Throwable) obj);
        return i.f20112a;
    }

    public final String toString() {
        StringBuilder q10 = a.q("DisposeOnCancel[");
        q10.append(this.f19095a);
        q10.append(']');
        return q10.toString();
    }
}
