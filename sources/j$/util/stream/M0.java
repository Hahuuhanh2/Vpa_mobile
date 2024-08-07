package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

final class M0 extends P0 implements A0 {
    M0(A0 a02, A0 a03) {
        super(a02, a03);
    }

    /* renamed from: f */
    public final /* synthetic */ void e(Double[] dArr, int i10) {
        C0501v0.x0(this, dArr, i10);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.A0(this, consumer);
    }

    public final Object newArray(int i10) {
        return new double[i10];
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.D0(this, j10, j11);
    }

    public final L spliterator() {
        return new C0430d1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m29spliterator() {
        return new C0430d1(this);
    }
}
