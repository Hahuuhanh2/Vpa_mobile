package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0;
import j$.util.function.C0372f;
import j$.util.function.F0;
import j$.util.function.K0;
import j$.util.function.z0;

/* renamed from: j$.util.stream.v1  reason: case insensitive filesystem */
final class C0502v1 extends C0501v0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f18917h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f18918i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Object f18919j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Object f18920k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0502v1(int i10, Object obj, Object obj2, Object obj3, int i11) {
        super(i10);
        this.f18917h = i11;
        this.f18918i = obj;
        this.f18920k = obj2;
        this.f18919j = obj3;
    }

    public final O1 s1() {
        switch (this.f18917h) {
            case 0:
                return new C0506w1((K0) this.f18919j, (F0) this.f18920k, (C0372f) this.f18918i);
            case 1:
                return new B1((K0) this.f18919j, (z0) this.f18920k, (C0372f) this.f18918i);
            case 2:
                return new C1(this.f18919j, (BiFunction) this.f18920k, (C0372f) this.f18918i);
            case 3:
                return new G1((K0) this.f18919j, (BiConsumer) this.f18920k, (BiConsumer) this.f18918i);
            default:
                return new K1((K0) this.f18919j, (C0) this.f18920k, (C0372f) this.f18918i);
        }
    }
}
