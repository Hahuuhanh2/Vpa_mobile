package j$.util.stream;

import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.C0394t;
import j$.util.function.r;

/* renamed from: j$.util.stream.q0  reason: case insensitive filesystem */
final class C0482q0 extends C0485r0 implements C0426c2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0489s0 f18865c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0394t f18866d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0482q0(C0394t tVar, C0489s0 s0Var) {
        super(s0Var);
        this.f18865c = s0Var;
        this.f18866d = tVar;
    }

    public final void accept(double d10) {
        if (!this.f18882a && ((r) this.f18866d).e(d10) == this.f18865c.f18889a) {
            this.f18882a = true;
            this.f18883b = this.f18865c.f18890b;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }
}
