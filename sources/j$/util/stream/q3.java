package j$.util.stream;

import j$.util.Spliterator;

abstract class q3 {

    /* renamed from: a  reason: collision with root package name */
    final long f18875a;

    /* renamed from: b  reason: collision with root package name */
    final long f18876b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f18877c;

    /* renamed from: d  reason: collision with root package name */
    long f18878d;

    /* renamed from: e  reason: collision with root package name */
    long f18879e;

    q3(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        this.f18877c = spliterator;
        this.f18875a = j10;
        this.f18876b = j11;
        this.f18878d = j12;
        this.f18879e = j13;
    }

    public final int characteristics() {
        return this.f18877c.characteristics();
    }

    public final long estimateSize() {
        long j10 = this.f18875a;
        long j11 = this.f18879e;
        if (j10 < j11) {
            return j11 - Math.max(j10, this.f18878d);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public abstract Spliterator f(Spliterator spliterator, long j10, long j11, long j12, long j13);

    public final Spliterator trySplit() {
        long j10 = this.f18875a;
        long j11 = this.f18879e;
        if (j10 >= j11 || this.f18878d >= j11) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f18877c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f18878d;
            long min = Math.min(estimateSize, this.f18876b);
            long j12 = this.f18875a;
            if (j12 >= min) {
                this.f18878d = min;
            } else {
                long j13 = this.f18876b;
                if (min >= j13) {
                    this.f18877c = trySplit;
                    this.f18879e = min;
                } else {
                    long j14 = this.f18878d;
                    if (j14 < j12 || estimateSize > j13) {
                        this.f18878d = min;
                        return f(trySplit, j12, j13, j14, min);
                    }
                    this.f18878d = min;
                    return trySplit;
                }
            }
        }
    }
}
