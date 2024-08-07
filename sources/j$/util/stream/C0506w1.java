package j$.util.stream;

import j$.util.function.C0369d0;
import j$.util.function.C0372f;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import j$.util.function.F0;
import j$.util.function.K0;

/* renamed from: j$.util.stream.w1  reason: case insensitive filesystem */
final class C0506w1 extends P1 implements O1, C0436e2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ K0 f18925b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ F0 f18926c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0372f f18927d;

    C0506w1(K0 k02, F0 f02, C0372f fVar) {
        this.f18925b = k02;
        this.f18926c = f02;
        this.f18927d = fVar;
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
        this.f18926c.accept(this.f18674a, j10);
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
        this.f18674a = this.f18925b.get();
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final void k(O1 o12) {
        this.f18674a = this.f18927d.apply(this.f18674a, ((C0506w1) o12).f18674a);
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }
}
