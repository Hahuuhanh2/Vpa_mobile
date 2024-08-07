package j$.util.stream;

import j$.util.function.C0372f;
import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import j$.util.function.K0;
import j$.util.function.z0;

final class B1 extends P1 implements O1, C0426c2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ K0 f18580b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z0 f18581c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0372f f18582d;

    B1(K0 k02, z0 z0Var, C0372f fVar) {
        this.f18580b = k02;
        this.f18581c = z0Var;
        this.f18582d = fVar;
    }

    public final void accept(double d10) {
        this.f18581c.accept(this.f18674a, d10);
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18674a = this.f18580b.get();
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        this.f18674a = this.f18582d.apply(this.f18674a, ((B1) o12).f18674a);
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }
}
