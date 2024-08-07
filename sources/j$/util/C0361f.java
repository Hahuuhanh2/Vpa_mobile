package j$.util;

import j$.util.function.I;
import j$.util.function.L;

/* renamed from: j$.util.f  reason: case insensitive filesystem */
public final class C0361f implements L {
    private long count;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private long sum;

    public final void a(C0361f fVar) {
        this.count += fVar.count;
        this.sum += fVar.sum;
        this.min = Math.min(this.min, fVar.min);
        this.max = Math.max(this.max, fVar.max);
    }

    public final void accept(int i10) {
        this.count++;
        this.sum += (long) i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0361f.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? ((double) this.sum) / ((double) j10) : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
