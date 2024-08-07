package j$.util.stream;

import j$.util.C0407m;
import j$.util.I;
import j$.util.Spliterator;
import j$.util.function.Consumer;

final class n3 extends o3 implements I {
    n3(I i10, long j10, long j11) {
        super(i10, j10, j11);
    }

    n3(I i10, long j10, long j11, long j12, long j13) {
        super(i10, j10, j11, j12, j13);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.n(this, consumer);
    }

    /* access modifiers changed from: protected */
    public final Spliterator f(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new n3((I) spliterator, j10, j11, j12, j13);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.h(this, consumer);
    }

    /* access modifiers changed from: protected */
    public final Object g() {
        return new m3(0);
    }
}
