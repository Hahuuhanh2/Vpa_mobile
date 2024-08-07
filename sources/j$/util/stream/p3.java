package j$.util.stream;

import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

final class p3 extends q3 implements Spliterator {
    p3(Spliterator spliterator, long j10, long j11) {
        super(spliterator, j10, j11, 0, Math.min(spliterator.estimateSize(), j11));
    }

    private p3(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        super(spliterator, j10, j11, j12, j13);
    }

    public final boolean a(Consumer consumer) {
        long j10;
        consumer.getClass();
        if (this.f18875a >= this.f18879e) {
            return false;
        }
        while (true) {
            long j11 = this.f18875a;
            j10 = this.f18878d;
            if (j11 <= j10) {
                break;
            }
            this.f18877c.a(new J0(13));
            this.f18878d++;
        }
        if (j10 >= this.f18879e) {
            return false;
        }
        this.f18878d = j10 + 1;
        return this.f18877c.a(consumer);
    }

    /* access modifiers changed from: protected */
    public final Spliterator f(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new p3(spliterator, j10, j11, j12, j13);
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j10 = this.f18875a;
        long j11 = this.f18879e;
        if (j10 < j11) {
            long j12 = this.f18878d;
            if (j12 < j11) {
                if (j12 < j10 || this.f18877c.estimateSize() + j12 > this.f18876b) {
                    while (this.f18875a > this.f18878d) {
                        this.f18877c.a(new J0(12));
                        this.f18878d++;
                    }
                    while (this.f18878d < this.f18879e) {
                        this.f18877c.a(consumer);
                        this.f18878d++;
                    }
                    return;
                }
                this.f18877c.forEachRemaining(consumer);
                this.f18878d = this.f18879e;
            }
        }
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
