package t1;

import m1.e;
import n1.h;
import p3.l0;

/* compiled from: CallbackWithHandler */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f14757a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14758b;

    public b(l0 l0Var, int i10) {
        this.f14757a = l0Var;
        this.f14758b = i10;
    }

    public final void run() {
        l0 l0Var = this.f14757a;
        int i10 = this.f14758b;
        e.C0160e eVar = ((h.a) l0Var).E;
        if (eVar != null) {
            eVar.c(i10);
        }
    }
}
