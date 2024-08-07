package j$.util.stream;

import j$.util.C;
import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.Consumer;

final class j3 extends o3 implements C {
    j3(C c10, long j10, long j11) {
        super(c10, j10, j11);
    }

    j3(C c10, long j10, long j11, long j12, long j13) {
        super(c10, j10, j11, j12, j13);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.l(this, consumer);
    }

    /* access modifiers changed from: protected */
    public final Spliterator f(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new j3((C) spliterator, j10, j11, j12, j13);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.f(this, consumer);
    }

    /* access modifiers changed from: protected */
    public final Object g() {
        return new i3(0);
    }
}
