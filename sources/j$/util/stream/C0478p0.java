package j$.util.stream;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.C0383k0;
import j$.util.function.C0387m0;

/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
final class C0478p0 extends C0485r0 implements C0436e2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0489s0 f18856c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0387m0 f18857d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0478p0(C0387m0 m0Var, C0489s0 s0Var) {
        super(s0Var);
        this.f18856c = s0Var;
        this.f18857d = m0Var;
    }

    public final void accept(long j10) {
        if (!this.f18882a && ((C0383k0) this.f18857d).e(j10) == this.f18856c.f18889a) {
            this.f18882a = true;
            this.f18883b = this.f18856c.f18890b;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }
}
