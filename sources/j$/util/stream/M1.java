package j$.util.stream;

import j$.util.function.C0367c0;
import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

final class M1 implements O1, C0436e2 {

    /* renamed from: a  reason: collision with root package name */
    private long f18657a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f18658b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0367c0 f18659c;

    M1(long j10, C0367c0 c0Var) {
        this.f18658b = j10;
        this.f18659c = c0Var;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final void accept(long j10) {
        this.f18657a = this.f18659c.applyAsLong(this.f18657a, j10);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18657a = this.f18658b;
    }

    public final Object get() {
        return Long.valueOf(this.f18657a);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final void k(O1 o12) {
        accept(((M1) o12).f18657a);
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }
}
