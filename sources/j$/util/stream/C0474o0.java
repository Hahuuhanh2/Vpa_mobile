package j$.util.stream;

import j$.util.function.I;
import j$.util.function.L;
import j$.util.function.N;
import j$.util.function.P;

/* renamed from: j$.util.stream.o0  reason: case insensitive filesystem */
final class C0474o0 extends C0485r0 implements C0431d2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0489s0 f18849c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ P f18850d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0474o0(P p10, C0489s0 s0Var) {
        super(s0Var);
        this.f18849c = s0Var;
        this.f18850d = p10;
    }

    public final void accept(int i10) {
        if (!this.f18882a && ((N) this.f18850d).e(i10) == this.f18849c.f18889a) {
            this.f18882a = true;
            this.f18883b = this.f18849c.f18890b;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        g((Integer) obj);
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
