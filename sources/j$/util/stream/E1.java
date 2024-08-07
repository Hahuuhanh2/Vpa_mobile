package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0372f;
import j$.util.function.K0;

final class E1 extends C0501v0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ C0372f f18599h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ BiConsumer f18600i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ K0 f18601j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Collector f18602k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    E1(int i10, C0372f fVar, BiConsumer biConsumer, K0 k02, Collector collector) {
        super(i10);
        this.f18599h = fVar;
        this.f18600i = biConsumer;
        this.f18601j = k02;
        this.f18602k = collector;
    }

    public final int N() {
        if (this.f18602k.characteristics().contains(C0453j.UNORDERED)) {
            return T2.f18703r;
        }
        return 0;
    }

    public final O1 s1() {
        return new F1(this.f18601j, this.f18600i, this.f18599h);
    }
}
