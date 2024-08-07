package j$.util.stream;

import j$.util.C0403i;
import j$.util.function.C0380j;
import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

final class A1 implements O1, C0426c2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18575a;

    /* renamed from: b  reason: collision with root package name */
    private double f18576b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0380j f18577c;

    A1(C0380j jVar) {
        this.f18577c = jVar;
    }

    public final void accept(double d10) {
        if (this.f18575a) {
            this.f18575a = false;
        } else {
            d10 = this.f18577c.applyAsDouble(this.f18576b, d10);
        }
        this.f18576b = d10;
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
        this.f18575a = true;
        this.f18576b = 0.0d;
    }

    public final Object get() {
        return this.f18575a ? C0403i.a() : C0403i.d(this.f18576b);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        A1 a12 = (A1) o12;
        if (!a12.f18575a) {
            accept(a12.f18576b);
        }
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }
}
