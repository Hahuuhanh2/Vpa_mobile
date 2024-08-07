package j$.util.stream;

import j$.util.Optional;
import j$.util.function.C0372f;
import j$.util.function.Consumer;

final class D1 implements O1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18592a;

    /* renamed from: b  reason: collision with root package name */
    private Object f18593b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0372f f18594c;

    D1(C0372f fVar) {
        this.f18594c = fVar;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final void accept(Object obj) {
        if (this.f18592a) {
            this.f18592a = false;
        } else {
            obj = this.f18594c.apply(this.f18593b, obj);
        }
        this.f18593b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18592a = true;
        this.f18593b = null;
    }

    public final Object get() {
        return this.f18592a ? Optional.a() : Optional.d(this.f18593b);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        D1 d12 = (D1) o12;
        if (!d12.f18592a) {
            accept(d12.f18593b);
        }
    }
}
