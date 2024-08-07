package j$.util.concurrent;

import j$.util.C0407m;
import j$.util.I;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import java.util.Comparator;

final class A implements I {

    /* renamed from: a  reason: collision with root package name */
    long f18389a;

    /* renamed from: b  reason: collision with root package name */
    final long f18390b;

    /* renamed from: c  reason: collision with root package name */
    final long f18391c;

    /* renamed from: d  reason: collision with root package name */
    final long f18392d;

    A(long j10, long j11, long j12, long j13) {
        this.f18389a = j10;
        this.f18390b = j11;
        this.f18391c = j12;
        this.f18392d = j13;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.n(this, consumer);
    }

    /* renamed from: b */
    public final void forEachRemaining(C0375g0 g0Var) {
        g0Var.getClass();
        long j10 = this.f18389a;
        long j11 = this.f18390b;
        if (j10 < j11) {
            this.f18389a = j11;
            long j12 = this.f18391c;
            long j13 = this.f18392d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                g0Var.accept(current.e(j12, j13));
                j10++;
            } while (j10 < j11);
        }
    }

    public final int characteristics() {
        return 17728;
    }

    /* renamed from: e */
    public final boolean tryAdvance(C0375g0 g0Var) {
        g0Var.getClass();
        long j10 = this.f18389a;
        if (j10 >= this.f18390b) {
            return false;
        }
        g0Var.accept(ThreadLocalRandom.current().e(this.f18391c, this.f18392d));
        this.f18389a = j10 + 1;
        return true;
    }

    public final long estimateSize() {
        return this.f18390b - this.f18389a;
    }

    /* renamed from: f */
    public final A trySplit() {
        long j10 = this.f18389a;
        long j11 = (this.f18390b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f18389a = j11;
        return new A(j10, j11, this.f18391c, this.f18392d);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.h(this, consumer);
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }
}
