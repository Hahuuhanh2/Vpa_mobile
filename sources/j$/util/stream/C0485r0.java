package j$.util.stream;

import j$.util.function.Consumer;

/* renamed from: j$.util.stream.r0  reason: case insensitive filesystem */
abstract class C0485r0 implements C0440f2 {

    /* renamed from: a  reason: collision with root package name */
    boolean f18882a;

    /* renamed from: b  reason: collision with root package name */
    boolean f18883b;

    C0485r0(C0489s0 s0Var) {
        this.f18883b = !s0Var.f18890b;
    }

    public /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final /* synthetic */ void f(long j10) {
    }

    public final boolean h() {
        return this.f18882a;
    }
}
