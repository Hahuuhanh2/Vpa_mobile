package j$.util.stream;

import j$.util.function.C0;
import j$.util.function.C0372f;
import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.K0;
import j$.util.function.L;

final class K1 extends P1 implements O1, C0431d2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ K0 f18646b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0 f18647c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0372f f18648d;

    K1(K0 k02, C0 c02, C0372f fVar) {
        this.f18646b = k02;
        this.f18647c = c02;
        this.f18648d = fVar;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final void accept(int i10) {
        this.f18647c.accept(this.f18674a, i10);
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        g((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18674a = this.f18646b.get();
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        this.f18674a = this.f18648d.apply(this.f18674a, ((K1) o12).f18674a);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
