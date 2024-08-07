package j$.util.stream;

import j$.util.function.Predicate;

/* renamed from: j$.util.stream.n0  reason: case insensitive filesystem */
final class C0470n0 extends C0485r0 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0489s0 f18841c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predicate f18842d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0470n0(Predicate predicate, C0489s0 s0Var) {
        super(s0Var);
        this.f18841c = s0Var;
        this.f18842d = predicate;
    }

    public final void accept(Object obj) {
        if (!this.f18882a && this.f18842d.test(obj) == this.f18841c.f18889a) {
            this.f18882a = true;
            this.f18883b = this.f18841c.f18890b;
        }
    }
}
