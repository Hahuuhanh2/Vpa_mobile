package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

final class U0 extends Y0 implements A0 {
    U0() {
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final Object b() {
        return C0501v0.f18916g;
    }

    /* renamed from: f */
    public final /* synthetic */ void e(Double[] dArr, int i10) {
        C0501v0.x0(this, dArr, i10);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.A0(this, consumer);
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.D0(this, j10, j11);
    }

    public final L spliterator() {
        return Spliterators.b();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m35spliterator() {
        return Spliterators.b();
    }
}
