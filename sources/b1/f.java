package b1;

/* compiled from: LinearCurveFit */
public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public double[] f3925a;

    /* renamed from: b  reason: collision with root package name */
    public double[][] f3926b;

    /* renamed from: c  reason: collision with root package name */
    public double[] f3927c;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f3927c = new double[length2];
        this.f3925a = dArr;
        this.f3926b = dArr2;
        if (length2 > 2) {
            double d10 = 0.0d;
            int i10 = 0;
            while (i10 < dArr.length) {
                double d11 = dArr2[i10][0];
                if (i10 > 0) {
                    double d12 = d11 - d10;
                    Math.hypot(d12, d12);
                }
                i10++;
                d10 = d11;
            }
        }
    }

    public final double b(double d10) {
        double d11;
        double d12;
        double d13;
        double[] dArr = this.f3925a;
        int length = dArr.length;
        double d14 = dArr[0];
        if (d10 <= d14) {
            d13 = this.f3926b[0][0];
            d11 = d10 - d14;
            d12 = e(d14);
        } else {
            int i10 = length - 1;
            double d15 = dArr[i10];
            if (d10 >= d15) {
                d13 = this.f3926b[i10][0];
                d11 = d10 - d15;
                d12 = e(d15);
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    double[] dArr2 = this.f3925a;
                    double d16 = dArr2[i11];
                    if (d10 == d16) {
                        return this.f3926b[i11][0];
                    }
                    int i12 = i11 + 1;
                    double d17 = dArr2[i12];
                    if (d10 < d17) {
                        double d18 = (d10 - d16) / (d17 - d16);
                        double[][] dArr3 = this.f3926b;
                        return (dArr3[i12][0] * d18) + ((1.0d - d18) * dArr3[i11][0]);
                    }
                    i11 = i12;
                }
                return 0.0d;
            }
        }
        return (d12 * d11) + d13;
    }

    public final void c(double d10, double[] dArr) {
        double[] dArr2 = this.f3925a;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f3926b[0].length;
        double d11 = dArr2[0];
        if (d10 <= d11) {
            f(d11, this.f3927c);
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = ((d10 - this.f3925a[0]) * this.f3927c[i11]) + this.f3926b[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr2[i12];
        if (d10 >= d12) {
            f(d12, this.f3927c);
            while (i10 < length2) {
                dArr[i10] = ((d10 - this.f3925a[i12]) * this.f3927c[i10]) + this.f3926b[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d10 == this.f3925a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f3926b[i13][i14];
                }
            }
            double[] dArr3 = this.f3925a;
            int i15 = i13 + 1;
            double d13 = dArr3[i15];
            if (d10 < d13) {
                double d14 = dArr3[i13];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr4 = this.f3926b;
                    dArr[i10] = (dArr4[i15][i10] * d15) + ((1.0d - d15) * dArr4[i13][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    public final void d(double d10, float[] fArr) {
        double[] dArr = this.f3925a;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f3926b[0].length;
        double d11 = dArr[0];
        if (d10 <= d11) {
            f(d11, this.f3927c);
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) (((d10 - this.f3925a[0]) * this.f3927c[i11]) + this.f3926b[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr[i12];
        if (d10 >= d12) {
            f(d12, this.f3927c);
            while (i10 < length2) {
                fArr[i10] = (float) (((d10 - this.f3925a[i12]) * this.f3927c[i10]) + this.f3926b[i12][i10]);
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            if (d10 == this.f3925a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f3926b[i13][i14];
                }
            }
            double[] dArr2 = this.f3925a;
            int i15 = i13 + 1;
            double d13 = dArr2[i15];
            if (d10 < d13) {
                double d14 = dArr2[i13];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr3 = this.f3926b;
                    fArr[i10] = (float) ((dArr3[i15][i10] * d15) + ((1.0d - d15) * dArr3[i13][i10]));
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r9 >= r3) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double e(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.f3925a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x000c
        L_0x000a:
            r9 = r3
            goto L_0x0015
        L_0x000c:
            int r3 = r1 + -1
            r3 = r0[r3]
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            r0 = r2
        L_0x0016:
            int r3 = r1 + -1
            if (r0 >= r3) goto L_0x0036
            double[] r3 = r8.f3925a
            int r4 = r0 + 1
            r5 = r3[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0034
            r9 = r3[r0]
            double r5 = r5 - r9
            double[][] r9 = r8.f3926b
            r10 = r9[r0]
            r0 = r10[r2]
            r9 = r9[r4]
            r2 = r9[r2]
            double r2 = r2 - r0
            double r2 = r2 / r5
            return r2
        L_0x0034:
            r0 = r4
            goto L_0x0016
        L_0x0036:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.f.e(double):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r13 >= r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f3925a
            int r1 = r0.length
            double[][] r2 = r12.f3926b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0011
        L_0x000f:
            r13 = r4
            goto L_0x001a
        L_0x0011:
            int r4 = r1 + -1
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r0 = r3
        L_0x001b:
            int r4 = r1 + -1
            if (r0 >= r4) goto L_0x0041
            double[] r4 = r12.f3925a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x003f
            r13 = r4[r0]
            double r6 = r6 - r13
        L_0x002c:
            if (r3 >= r2) goto L_0x0041
            double[][] r13 = r12.f3926b
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L_0x002c
        L_0x003f:
            r0 = r5
            goto L_0x001b
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.f.f(double, double[]):void");
    }

    public final double[] g() {
        return this.f3925a;
    }
}
