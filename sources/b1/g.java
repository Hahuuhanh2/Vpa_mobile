package b1;

import java.lang.reflect.Array;

/* compiled from: MonotonicCurveFit */
public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    public double[] f3928a;

    /* renamed from: b  reason: collision with root package name */
    public double[][] f3929b;

    /* renamed from: c  reason: collision with root package name */
    public double[][] f3930c;

    /* renamed from: d  reason: collision with root package name */
    public double[] f3931d;

    public g(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        this.f3931d = new double[length2];
        int i10 = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i10;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        for (int i11 = 0; i11 < length2; i11++) {
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i12 + 1;
                double d10 = dArr3[i13] - dArr3[i12];
                double[] dArr7 = dArr5[i12];
                double d11 = (dArr4[i13][i11] - dArr4[i12][i11]) / d10;
                dArr7[i11] = d11;
                if (i12 == 0) {
                    dArr6[i12][i11] = d11;
                } else {
                    dArr6[i12][i11] = (dArr5[i12 - 1][i11] + d11) * 0.5d;
                }
                i12 = i13;
            }
            dArr6[i10][i11] = dArr5[length - 2][i11];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < length2; i15++) {
                double d12 = dArr5[i14][i15];
                if (d12 == 0.0d) {
                    dArr6[i14][i15] = 0.0d;
                    dArr6[i14 + 1][i15] = 0.0d;
                } else {
                    double d13 = dArr6[i14][i15] / d12;
                    int i16 = i14 + 1;
                    double d14 = dArr6[i16][i15] / d12;
                    double hypot = Math.hypot(d13, d14);
                    if (hypot > 9.0d) {
                        double d15 = 3.0d / hypot;
                        double[] dArr8 = dArr6[i14];
                        double[] dArr9 = dArr5[i14];
                        dArr8[i15] = d13 * d15 * dArr9[i15];
                        dArr6[i16][i15] = d15 * d14 * dArr9[i15];
                    }
                }
            }
        }
        this.f3928a = dArr3;
        this.f3929b = dArr4;
        this.f3930c = dArr6;
    }

    public static double h(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = 3.0d * d10;
        double d20 = d19 * d14 * d16;
        return (d10 * d14) + (((d20 + (((d19 * d15) * d16) + ((d18 + ((d17 * d13) + ((-6.0d * d16) * d13))) - (d17 * d12)))) - (((2.0d * d10) * d15) * d11)) - (((4.0d * d10) * d14) * d11));
    }

    public static double i(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d18 * d13;
        double d20 = d10 * d15;
        double d21 = d20 * d17;
        double d22 = d10 * d14;
        return (d22 * d11) + ((((d17 * d22) + (d21 + (((((d17 * 2.0d) * d12) + (d19 + ((-2.0d * d17) * d13))) - (d18 * d12)) + d12))) - (d20 * d16)) - (((2.0d * d10) * d14) * d16));
    }

    public final double b(double d10) {
        double d11;
        double d12;
        double e10;
        double[] dArr = this.f3928a;
        int length = dArr.length;
        double d13 = dArr[0];
        if (d10 <= d13) {
            d11 = this.f3929b[0][0];
            d12 = d10 - d13;
            e10 = e(d13);
        } else {
            int i10 = length - 1;
            double d14 = dArr[i10];
            if (d10 >= d14) {
                d11 = this.f3929b[i10][0];
                d12 = d10 - d14;
                e10 = e(d14);
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    double[] dArr2 = this.f3928a;
                    double d15 = dArr2[i11];
                    if (d10 == d15) {
                        return this.f3929b[i11][0];
                    }
                    int i12 = i11 + 1;
                    double d16 = dArr2[i12];
                    if (d10 < d16) {
                        double d17 = d16 - d15;
                        double d18 = (d10 - d15) / d17;
                        double[][] dArr3 = this.f3929b;
                        double d19 = dArr3[i11][0];
                        double d20 = dArr3[i12][0];
                        double[][] dArr4 = this.f3930c;
                        return i(d17, d18, d19, d20, dArr4[i11][0], dArr4[i12][0]);
                    }
                    i11 = i12;
                }
                return 0.0d;
            }
        }
        return (e10 * d12) + d11;
    }

    public final void c(double d10, double[] dArr) {
        double[] dArr2 = this.f3928a;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f3929b[0].length;
        double d11 = dArr2[0];
        if (d10 <= d11) {
            f(d11, this.f3931d);
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = ((d10 - this.f3928a[0]) * this.f3931d[i11]) + this.f3929b[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr2[i12];
        if (d10 >= d12) {
            f(d12, this.f3931d);
            while (i10 < length2) {
                dArr[i10] = ((d10 - this.f3928a[i12]) * this.f3931d[i10]) + this.f3929b[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d10 == this.f3928a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f3929b[i13][i14];
                }
            }
            double[] dArr3 = this.f3928a;
            int i15 = i13 + 1;
            double d13 = dArr3[i15];
            if (d10 < d13) {
                double d14 = dArr3[i13];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double[][] dArr4 = this.f3929b;
                    double d17 = dArr4[i13][i10];
                    double d18 = dArr4[i15][i10];
                    double[][] dArr5 = this.f3930c;
                    dArr[i10] = i(d15, d16, d17, d18, dArr5[i13][i10], dArr5[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    public final void d(double d10, float[] fArr) {
        double[] dArr = this.f3928a;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f3929b[0].length;
        double d11 = dArr[0];
        if (d10 <= d11) {
            f(d11, this.f3931d);
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) (((d10 - this.f3928a[0]) * this.f3931d[i11]) + this.f3929b[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr[i12];
        if (d10 >= d12) {
            f(d12, this.f3931d);
            while (i10 < length2) {
                fArr[i10] = (float) (((d10 - this.f3928a[i12]) * this.f3931d[i10]) + this.f3929b[i12][i10]);
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            if (d10 == this.f3928a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f3929b[i13][i14];
                }
            }
            double[] dArr2 = this.f3928a;
            int i15 = i13 + 1;
            double d13 = dArr2[i15];
            if (d10 < d13) {
                double d14 = dArr2[i13];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double[][] dArr3 = this.f3929b;
                    double d17 = dArr3[i13][i10];
                    double d18 = dArr3[i15][i10];
                    double[][] dArr4 = this.f3930c;
                    fArr[i10] = (float) i(d15, d16, d17, d18, dArr4[i13][i10], dArr4[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    public final double e(double d10) {
        double[] dArr = this.f3928a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            double[] dArr2 = this.f3928a;
            int i11 = i10 + 1;
            double d12 = dArr2[i11];
            if (d11 <= d12) {
                double d13 = dArr2[i10];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                double[][] dArr3 = this.f3929b;
                double d16 = dArr3[i10][0];
                double d17 = dArr3[i11][0];
                double[][] dArr4 = this.f3930c;
                return h(d14, d15, d16, d17, dArr4[i10][0], dArr4[i11][0]) / d14;
            }
            i10 = i11;
        }
        return 0.0d;
    }

    public final void f(double d10, double[] dArr) {
        double[] dArr2 = this.f3928a;
        int length = dArr2.length;
        int length2 = this.f3929b[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            double[] dArr3 = this.f3928a;
            int i11 = i10 + 1;
            double d12 = dArr3[i11];
            if (d11 <= d12) {
                double d13 = dArr3[i10];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i12 = 0; i12 < length2; i12++) {
                    double[][] dArr4 = this.f3929b;
                    double d16 = dArr4[i10][i12];
                    double d17 = dArr4[i11][i12];
                    double[][] dArr5 = this.f3930c;
                    dArr[i12] = h(d14, d15, d16, d17, dArr5[i10][i12], dArr5[i11][i12]) / d14;
                }
                return;
            }
            i10 = i11;
        }
    }

    public final double[] g() {
        return this.f3928a;
    }
}
