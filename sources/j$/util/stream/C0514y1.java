package j$.util.stream;

import j$.util.function.C0380j;
import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
final class C0514y1 implements O1, C0426c2 {

    /* renamed from: a  reason: collision with root package name */
    private double f18940a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f18941b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0380j f18942c;

    C0514y1(double d10, C0380j jVar) {
        this.f18941b = d10;
        this.f18942c = jVar;
    }

    public final void accept(double d10) {
        this.f18940a = this.f18942c.applyAsDouble(this.f18940a, d10);
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
        this.f18940a = this.f18941b;
    }

    public final Object get() {
        return Double.valueOf(this.f18940a);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        accept(((C0514y1) o12).f18940a);
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }
}
