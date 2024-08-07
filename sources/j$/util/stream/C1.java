package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.C0372f;
import j$.util.function.Consumer;

final class C1 extends P1 implements O1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f18585b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiFunction f18586c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0372f f18587d;

    C1(Object obj, BiFunction biFunction, C0372f fVar) {
        this.f18585b = obj;
        this.f18586c = biFunction;
        this.f18587d = fVar;
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
        this.f18674a = this.f18586c.apply(this.f18674a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18674a = this.f18585b;
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        this.f18674a = this.f18587d.apply(this.f18674a, ((C1) o12).f18674a);
    }
}
