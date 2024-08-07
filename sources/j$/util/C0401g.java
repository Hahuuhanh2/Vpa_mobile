package j$.util;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.I;
import j$.util.function.L;

/* renamed from: j$.util.g  reason: case insensitive filesystem */
public final class C0401g implements C0375g0, L {
    private long count;
    private long max = Long.MIN_VALUE;
    private long min = Long.MAX_VALUE;
    private long sum;

    public final void a(C0401g gVar) {
        this.count += gVar.count;
        this.sum += gVar.sum;
        this.min = Math.min(this.min, gVar.min);
        this.max = Math.max(this.max, gVar.max);
    }

    public final void accept(int i10) {
        accept((long) i10);
    }

    public final void accept(long j10) {
        this.count++;
        this.sum += j10;
        this.min = Math.min(this.min, j10);
        this.max = Math.max(this.max, j10);
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0401g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? ((double) this.sum) / ((double) j10) : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
