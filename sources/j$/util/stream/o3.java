package j$.util.stream;

import j$.util.C0407m;
import j$.util.L;
import java.util.Comparator;

abstract class o3 extends q3 implements L {
    o3(L l10, long j10, long j11) {
        super(l10, j10, j11, 0, Math.min(l10.estimateSize(), j11));
    }

    o3(L l10, long j10, long j11, long j12, long j13) {
        super(l10, j10, j11, j12, j13);
    }

    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        obj.getClass();
        long j10 = this.f18875a;
        long j11 = this.f18879e;
        if (j10 < j11) {
            long j12 = this.f18878d;
            if (j12 < j11) {
                if (j12 < j10 || ((L) this.f18877c).estimateSize() + j12 > this.f18876b) {
                    while (this.f18875a > this.f18878d) {
                        ((L) this.f18877c).tryAdvance(g());
                        this.f18878d++;
                    }
                    while (this.f18878d < this.f18879e) {
                        ((L) this.f18877c).tryAdvance(obj);
                        this.f18878d++;
                    }
                    return;
                }
                ((L) this.f18877c).forEachRemaining(obj);
                this.f18878d = this.f18879e;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object g();

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    /* renamed from: tryAdvance */
    public final boolean o(Object obj) {
        long j10;
        obj.getClass();
        if (this.f18875a >= this.f18879e) {
            return false;
        }
        while (true) {
            long j11 = this.f18875a;
            j10 = this.f18878d;
            if (j11 <= j10) {
                break;
            }
            ((L) this.f18877c).tryAdvance(g());
            this.f18878d++;
        }
        if (j10 >= this.f18879e) {
            return false;
        }
        this.f18878d = j10 + 1;
        return ((L) this.f18877c).tryAdvance(obj);
    }
}
