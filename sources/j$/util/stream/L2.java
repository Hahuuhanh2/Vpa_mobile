package j$.util.stream;

import j$.util.C0407m;
import j$.util.I;
import j$.util.L;
import j$.util.Spliterators;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

final class L2 extends N2 implements I {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ M2 f18654g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    L2(M2 m22, int i10, int i11, int i12, int i13) {
        super(m22, i10, i11, i12, i13);
        this.f18654g = m22;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.n(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10, Object obj, Object obj2) {
        ((C0375g0) obj2).accept(((long[]) obj)[i10]);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.h(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final L g(Object obj, int i10, int i11) {
        return Spliterators.l((long[]) obj, i10, i11 + i10);
    }

    /* access modifiers changed from: package-private */
    public final L h(int i10, int i11, int i12, int i13) {
        return new L2(this.f18654g, i10, i11, i12, i13);
    }
}
