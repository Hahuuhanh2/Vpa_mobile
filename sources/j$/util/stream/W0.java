package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

final class W0 extends Y0 implements C0 {
    W0() {
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final Object b() {
        return C0501v0.f18915f;
    }

    /* renamed from: f */
    public final /* synthetic */ void e(Long[] lArr, int i10) {
        C0501v0.z0(this, lArr, i10);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.C0(this, consumer);
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.F0(this, j10, j11);
    }

    public final L spliterator() {
        return Spliterators.d();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m37spliterator() {
        return Spliterators.d();
    }
}
