package j$.util;

import j$.util.function.C0382k;
import j$.util.function.C0388n;

/* renamed from: j$.util.e  reason: case insensitive filesystem */
public final class C0360e implements C0388n {

    /* renamed from: a  reason: collision with root package name */
    private double f18472a;

    /* renamed from: b  reason: collision with root package name */
    private double f18473b;
    private long count;
    private double max = Double.NEGATIVE_INFINITY;
    private double min = Double.POSITIVE_INFINITY;
    private double sum;

    public final void a(C0360e eVar) {
        this.count += eVar.count;
        this.f18473b += eVar.f18473b;
        double d10 = eVar.sum - this.f18472a;
        double d11 = this.sum;
        double d12 = d11 + d10;
        double d13 = (d12 - d11) - d10;
        this.f18472a = d13;
        double d14 = eVar.f18472a - d13;
        double d15 = d12 + d14;
        this.f18472a = (d15 - d12) - d14;
        this.sum = d15;
        this.min = Math.min(this.min, eVar.min);
        this.max = Math.max(this.max, eVar.max);
    }

    public final void accept(double d10) {
        this.count++;
        this.f18473b += d10;
        double d11 = d10 - this.f18472a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f18472a = (d13 - d12) - d11;
        this.sum = d13;
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final String toString() {
        double d10;
        Object[] objArr = new Object[6];
        objArr[0] = C0360e.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d11 = this.sum + this.f18472a;
        if (Double.isNaN(d11) && Double.isInfinite(this.f18473b)) {
            d11 = this.f18473b;
        }
        objArr[2] = Double.valueOf(d11);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d12 = this.sum + this.f18472a;
            if (Double.isNaN(d12) && Double.isInfinite(this.f18473b)) {
                d12 = this.f18473b;
            }
            d10 = d12 / ((double) this.count);
        } else {
            d10 = 0.0d;
        }
        objArr[4] = Double.valueOf(d10);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
