package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

final class O0 extends P0 implements C0 {
    O0(C0 c02, C0 c03) {
        super(c02, c03);
    }

    /* renamed from: f */
    public final /* synthetic */ void e(Long[] lArr, int i10) {
        C0501v0.z0(this, lArr, i10);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.C0(this, consumer);
    }

    public final Object newArray(int i10) {
        return new long[i10];
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.F0(this, j10, j11);
    }

    public final L spliterator() {
        return new C0439f1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m31spliterator() {
        return new C0439f1(this);
    }
}
