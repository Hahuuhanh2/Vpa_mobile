package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.K0;

final class G1 extends P1 implements O1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ K0 f18615b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f18616c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BiConsumer f18617d;

    G1(K0 k02, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f18615b = k02;
        this.f18616c = biConsumer;
        this.f18617d = biConsumer2;
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
        this.f18616c.accept(this.f18674a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18674a = this.f18615b.get();
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        this.f18617d.accept(this.f18674a, ((G1) o12).f18674a);
    }
}
