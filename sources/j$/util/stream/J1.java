package j$.util.stream;

import j$.util.C0404j;
import j$.util.function.Consumer;
import j$.util.function.H;
import j$.util.function.I;
import j$.util.function.L;

final class J1 implements O1, C0431d2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18640a;

    /* renamed from: b  reason: collision with root package name */
    private int f18641b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ H f18642c;

    J1(H h10) {
        this.f18642c = h10;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final void accept(int i10) {
        if (this.f18640a) {
            this.f18640a = false;
        } else {
            i10 = this.f18642c.applyAsInt(this.f18641b, i10);
        }
        this.f18641b = i10;
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
        this.f18640a = true;
        this.f18641b = 0;
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public final Object get() {
        return this.f18640a ? C0404j.a() : C0404j.d(this.f18641b);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        J1 j12 = (J1) o12;
        if (!j12.f18640a) {
            accept(j12.f18641b);
        }
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
