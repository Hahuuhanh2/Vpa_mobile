package j$.util.stream;

import j$.util.C;
import j$.util.C0407m;
import j$.util.L;
import j$.util.Spliterators;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

final class H2 extends N2 implements C {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ I2 f18632g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    H2(I2 i22, int i10, int i11, int i12, int i13) {
        super(i22, i10, i11, i12, i13);
        this.f18632g = i22;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.l(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10, Object obj, Object obj2) {
        ((C0388n) obj2).accept(((double[]) obj)[i10]);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.f(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final L g(Object obj, int i10, int i11) {
        return Spliterators.j((double[]) obj, i10, i11 + i10);
    }

    /* access modifiers changed from: package-private */
    public final L h(int i10, int i11, int i12, int i13) {
        return new H2(this.f18632g, i10, i11, i12, i13);
    }
}
