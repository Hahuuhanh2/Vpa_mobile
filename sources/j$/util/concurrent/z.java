package j$.util.concurrent;

import j$.util.C0407m;
import j$.util.F;
import j$.util.function.Consumer;
import j$.util.function.L;
import java.util.Comparator;

final class z implements F {

    /* renamed from: a  reason: collision with root package name */
    long f18463a;

    /* renamed from: b  reason: collision with root package name */
    final long f18464b;

    /* renamed from: c  reason: collision with root package name */
    final int f18465c;

    /* renamed from: d  reason: collision with root package name */
    final int f18466d;

    z(long j10, long j11, int i10, int i11) {
        this.f18463a = j10;
        this.f18464b = j11;
        this.f18465c = i10;
        this.f18466d = i11;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.m(this, consumer);
    }

    /* renamed from: c */
    public final void forEachRemaining(L l10) {
        l10.getClass();
        long j10 = this.f18463a;
        long j11 = this.f18464b;
        if (j10 < j11) {
            this.f18463a = j11;
            int i10 = this.f18465c;
            int i11 = this.f18466d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                l10.accept(current.d(i10, i11));
                j10++;
            } while (j10 < j11);
        }
    }

    public final int characteristics() {
        return 17728;
    }

    public final long estimateSize() {
        return this.f18464b - this.f18463a;
    }

    /* renamed from: f */
    public final z trySplit() {
        long j10 = this.f18463a;
        long j11 = (this.f18464b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f18463a = j11;
        return new z(j10, j11, this.f18465c, this.f18466d);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.g(this, consumer);
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

    /* renamed from: j */
    public final boolean tryAdvance(L l10) {
        l10.getClass();
        long j10 = this.f18463a;
        if (j10 >= this.f18464b) {
            return false;
        }
        l10.accept(ThreadLocalRandom.current().d(this.f18465c, this.f18466d));
        this.f18463a = j10 + 1;
        return true;
    }
}
