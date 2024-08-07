package j$.util.stream;

import j$.util.C0407m;
import j$.util.F;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.L;

final class J2 extends N2 implements F {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ K2 f18643g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    J2(K2 k22, int i10, int i11, int i12, int i13) {
        super(k22, i10, i11, i12, i13);
        this.f18643g = k22;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.m(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10, Object obj, Object obj2) {
        ((L) obj2).accept(((int[]) obj)[i10]);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.g(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final j$.util.L g(Object obj, int i10, int i11) {
        return Spliterators.k((int[]) obj, i10, i11 + i10);
    }

    /* access modifiers changed from: package-private */
    public final j$.util.L h(int i10, int i11, int i12, int i13) {
        return new J2(this.f18643g, i10, i11, i12, i13);
    }
}
