package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

final class N0 extends P0 implements B0 {
    N0(B0 b02, B0 b03) {
        super(b02, b03);
    }

    /* renamed from: f */
    public final /* synthetic */ void e(Integer[] numArr, int i10) {
        C0501v0.y0(this, numArr, i10);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.B0(this, consumer);
    }

    public final Object newArray(int i10) {
        return new int[i10];
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.E0(this, j10, j11);
    }

    public final L spliterator() {
        return new C0435e1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m30spliterator() {
        return new C0435e1(this);
    }
}
