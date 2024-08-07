package j$.util.stream;

import j$.util.C0407m;
import j$.util.F;
import j$.util.Spliterator;
import j$.util.function.Consumer;

final class l3 extends o3 implements F {
    l3(F f10, long j10, long j11) {
        super(f10, j10, j11);
    }

    l3(F f10, long j10, long j11, long j12, long j13) {
        super(f10, j10, j11, j12, j13);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.m(this, consumer);
    }

    /* access modifiers changed from: protected */
    public final Spliterator f(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new l3((F) spliterator, j10, j11, j12, j13);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.g(this, consumer);
    }

    /* access modifiers changed from: protected */
    public final Object g() {
        return new k3(0);
    }
}
