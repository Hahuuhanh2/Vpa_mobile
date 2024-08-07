package j$.util.concurrent;

import j$.util.C;
import j$.util.C0407m;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import java.util.Comparator;

final class y implements C {

    /* renamed from: a  reason: collision with root package name */
    long f18459a;

    /* renamed from: b  reason: collision with root package name */
    final long f18460b;

    /* renamed from: c  reason: collision with root package name */
    final double f18461c;

    /* renamed from: d  reason: collision with root package name */
    final double f18462d;

    y(long j10, long j11, double d10, double d11) {
        this.f18459a = j10;
        this.f18460b = j11;
        this.f18461c = d10;
        this.f18462d = d11;
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.l(this, consumer);
    }

    public final int characteristics() {
        return 17728;
    }

    /* renamed from: d */
    public final void forEachRemaining(C0388n nVar) {
        nVar.getClass();
        long j10 = this.f18459a;
        long j11 = this.f18460b;
        if (j10 < j11) {
            this.f18459a = j11;
            double d10 = this.f18461c;
            double d11 = this.f18462d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                nVar.accept(current.c(d10, d11));
                j10++;
            } while (j10 < j11);
        }
    }

    public final long estimateSize() {
        return this.f18460b - this.f18459a;
    }

    /* renamed from: f */
    public final y trySplit() {
        long j10 = this.f18459a;
        long j11 = (this.f18460b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f18459a = j11;
        return new y(j10, j11, this.f18461c, this.f18462d);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.f(this, consumer);
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

    /* renamed from: o */
    public final boolean tryAdvance(C0388n nVar) {
        nVar.getClass();
        long j10 = this.f18459a;
        if (j10 >= this.f18460b) {
            return false;
        }
        nVar.accept(ThreadLocalRandom.current().c(this.f18461c, this.f18462d));
        this.f18459a = j10 + 1;
        return true;
    }
}
