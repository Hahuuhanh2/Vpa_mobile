package b1;

import java.util.Arrays;

/* compiled from: ArcCurveFit */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f3875a;

    /* renamed from: b  reason: collision with root package name */
    public C0041a[] f3876b;

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* compiled from: ArcCurveFit */
    public static class C0041a {

        /* renamed from: s  reason: collision with root package name */
        public static double[] f3877s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        public double[] f3878a;

        /* renamed from: b  reason: collision with root package name */
        public double f3879b;

        /* renamed from: c  reason: collision with root package name */
        public double f3880c;

        /* renamed from: d  reason: collision with root package name */
        public double f3881d;

        /* renamed from: e  reason: collision with root package name */
        public double f3882e;

        /* renamed from: f  reason: collision with root package name */
        public double f3883f;

        /* renamed from: g  reason: collision with root package name */
        public double f3884g;

        /* renamed from: h  reason: collision with root package name */
        public double f3885h;

        /* renamed from: i  reason: collision with root package name */
        public double f3886i;

        /* renamed from: j  reason: collision with root package name */
        public double f3887j;

        /* renamed from: k  reason: collision with root package name */
        public double f3888k;

        /* renamed from: l  reason: collision with root package name */
        public double f3889l;

        /* renamed from: m  reason: collision with root package name */
        public double f3890m;

        /* renamed from: n  reason: collision with root package name */
        public double f3891n;

        /* renamed from: o  reason: collision with root package name */
        public double f3892o;

        /* renamed from: p  reason: collision with root package name */
        public double f3893p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f3894q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f3895r = false;

        public C0041a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            int i11;
            double d16;
            int i12 = i10;
            double d17 = d10;
            double d18 = d11;
            double d19 = d12;
            double d20 = d13;
            double d21 = d14;
            double d22 = d15;
            boolean z10 = false;
            int i13 = 1;
            this.f3894q = i12 == 1 ? true : z10;
            this.f3880c = d17;
            this.f3881d = d18;
            this.f3886i = 1.0d / (d18 - d17);
            if (3 == i12) {
                this.f3895r = true;
            }
            double d23 = d21 - d19;
            double d24 = d22 - d20;
            if (this.f3895r || Math.abs(d23) < 0.001d || Math.abs(d24) < 0.001d) {
                this.f3895r = true;
                this.f3882e = d19;
                this.f3883f = d21;
                this.f3884g = d20;
                this.f3885h = d22;
                double hypot = Math.hypot(d24, d23);
                this.f3879b = hypot;
                this.f3891n = hypot * this.f3886i;
                double d25 = this.f3881d;
                double d26 = this.f3880c;
                this.f3889l = d23 / (d25 - d26);
                this.f3890m = d24 / (d25 - d26);
                return;
            }
            this.f3878a = new double[101];
            boolean z11 = this.f3894q;
            this.f3887j = ((double) (z11 ? -1 : i13)) * d23;
            if (z11) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            this.f3888k = d24 * ((double) i11);
            this.f3889l = z11 ? d21 : d19;
            if (z11) {
                d16 = d20;
            } else {
                d16 = d22;
            }
            this.f3890m = d16;
            double d27 = d20 - d22;
            int i14 = 0;
            double d28 = 0.0d;
            double d29 = 0.0d;
            double d30 = 0.0d;
            while (true) {
                double[] dArr = f3877s;
                if (i14 >= 91) {
                    break;
                }
                double[] dArr2 = dArr;
                double radians = Math.toRadians((((double) i14) * 90.0d) / ((double) 90));
                double sin = Math.sin(radians) * d23;
                double cos = Math.cos(radians) * d27;
                if (i14 > 0) {
                    d28 += Math.hypot(sin - d29, cos - d30);
                    dArr2[i14] = d28;
                }
                i14++;
                d30 = cos;
                d29 = sin;
            }
            this.f3879b = d28;
            int i15 = 0;
            while (true) {
                double[] dArr3 = f3877s;
                if (i15 >= 91) {
                    break;
                }
                dArr3[i15] = dArr3[i15] / d28;
                i15++;
            }
            int i16 = 0;
            while (true) {
                double[] dArr4 = this.f3878a;
                if (i16 < dArr4.length) {
                    double length = ((double) i16) / ((double) (dArr4.length - 1));
                    double[] dArr5 = f3877s;
                    int binarySearch = Arrays.binarySearch(dArr5, length);
                    if (binarySearch >= 0) {
                        this.f3878a[i16] = ((double) binarySearch) / ((double) 90);
                    } else if (binarySearch == -1) {
                        this.f3878a[i16] = 0.0d;
                    } else {
                        int i17 = -binarySearch;
                        int i18 = i17 - 2;
                        double d31 = dArr5[i18];
                        this.f3878a[i16] = (((length - d31) / (dArr5[i17 - 1] - d31)) + ((double) i18)) / ((double) 90);
                    }
                    i16++;
                } else {
                    this.f3891n = this.f3879b * this.f3886i;
                    return;
                }
            }
        }

        public final double a() {
            double d10 = this.f3887j * this.f3893p;
            double hypot = this.f3891n / Math.hypot(d10, (-this.f3888k) * this.f3892o);
            if (this.f3894q) {
                d10 = -d10;
            }
            return d10 * hypot;
        }

        public final double b() {
            double d10 = this.f3887j * this.f3893p;
            double d11 = (-this.f3888k) * this.f3892o;
            double hypot = this.f3891n / Math.hypot(d10, d11);
            if (this.f3894q) {
                return (-d11) * hypot;
            }
            return d11 * hypot;
        }

        public final double c(double d10) {
            double d11 = (d10 - this.f3880c) * this.f3886i;
            double d12 = this.f3882e;
            return ((this.f3883f - d12) * d11) + d12;
        }

        public final double d(double d10) {
            double d11 = (d10 - this.f3880c) * this.f3886i;
            double d12 = this.f3884g;
            return ((this.f3885h - d12) * d11) + d12;
        }

        public final double e() {
            return (this.f3887j * this.f3892o) + this.f3889l;
        }

        public final double f() {
            return (this.f3888k * this.f3893p) + this.f3890m;
        }

        public final void g(double d10) {
            double d11;
            if (this.f3894q) {
                d11 = this.f3881d - d10;
            } else {
                d11 = d10 - this.f3880c;
            }
            double d12 = d11 * this.f3886i;
            double d13 = 0.0d;
            if (d12 > 0.0d) {
                d13 = 1.0d;
                if (d12 < 1.0d) {
                    double[] dArr = this.f3878a;
                    double length = d12 * ((double) (dArr.length - 1));
                    int i10 = (int) length;
                    double d14 = dArr[i10];
                    d13 = ((dArr[i10 + 1] - d14) * (length - ((double) i10))) + d14;
                }
            }
            double d15 = d13 * 1.5707963267948966d;
            this.f3892o = Math.sin(d15);
            this.f3893p = Math.cos(d15);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5 == 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f3875a = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            b1.a$a[] r2 = new b1.a.C0041a[r2]
            r0.f3876b = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L_0x0014:
            b1.a$a[] r7 = r0.f3876b
            int r8 = r7.length
            if (r4 >= r8) goto L_0x004d
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L_0x002d
            if (r8 == r3) goto L_0x002a
            if (r8 == r10) goto L_0x0028
            if (r8 == r9) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            if (r5 != r3) goto L_0x002a
        L_0x0028:
            r5 = r10
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            r6 = r5
            goto L_0x002e
        L_0x002d:
            r6 = r9
        L_0x002e:
            b1.a$a r22 = new b1.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0014
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.a.<init>(int[], double[], double[][]):void");
    }

    public final double b(double d10) {
        C0041a[] aVarArr = this.f3876b;
        int i10 = 0;
        C0041a aVar = aVarArr[0];
        double d11 = aVar.f3880c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f3895r) {
                return (d12 * this.f3876b[0].f3889l) + aVar.c(d11);
            }
            aVar.g(d11);
            return (this.f3876b[0].a() * d12) + this.f3876b[0].e();
        } else if (d10 > aVarArr[aVarArr.length - 1].f3881d) {
            double d13 = aVarArr[aVarArr.length - 1].f3881d;
            int length = aVarArr.length - 1;
            return ((d10 - d13) * this.f3876b[length].f3889l) + aVarArr[length].c(d13);
        } else {
            while (true) {
                C0041a[] aVarArr2 = this.f3876b;
                if (i10 >= aVarArr2.length) {
                    return Double.NaN;
                }
                C0041a aVar2 = aVarArr2[i10];
                if (d10 > aVar2.f3881d) {
                    i10++;
                } else if (aVar2.f3895r) {
                    return aVar2.c(d10);
                } else {
                    aVar2.g(d10);
                    return this.f3876b[i10].e();
                }
            }
        }
    }

    public final void c(double d10, double[] dArr) {
        C0041a[] aVarArr = this.f3876b;
        C0041a aVar = aVarArr[0];
        double d11 = aVar.f3880c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f3895r) {
                double c10 = aVar.c(d11);
                C0041a aVar2 = this.f3876b[0];
                dArr[0] = (aVar2.f3889l * d12) + c10;
                dArr[1] = (d12 * this.f3876b[0].f3890m) + aVar2.d(d11);
                return;
            }
            aVar.g(d11);
            dArr[0] = (this.f3876b[0].a() * d12) + this.f3876b[0].e();
            dArr[1] = (this.f3876b[0].b() * d12) + this.f3876b[0].f();
        } else if (d10 > aVarArr[aVarArr.length - 1].f3881d) {
            double d13 = aVarArr[aVarArr.length - 1].f3881d;
            double d14 = d10 - d13;
            int length = aVarArr.length - 1;
            C0041a aVar3 = aVarArr[length];
            if (aVar3.f3895r) {
                double c11 = aVar3.c(d13);
                C0041a aVar4 = this.f3876b[length];
                dArr[0] = (aVar4.f3889l * d14) + c11;
                dArr[1] = (d14 * this.f3876b[length].f3890m) + aVar4.d(d13);
                return;
            }
            aVar3.g(d10);
            dArr[0] = (this.f3876b[length].a() * d14) + this.f3876b[length].e();
            dArr[1] = (this.f3876b[length].b() * d14) + this.f3876b[length].f();
        } else {
            int i10 = 0;
            while (true) {
                C0041a[] aVarArr2 = this.f3876b;
                if (i10 < aVarArr2.length) {
                    C0041a aVar5 = aVarArr2[i10];
                    if (d10 > aVar5.f3881d) {
                        i10++;
                    } else if (aVar5.f3895r) {
                        dArr[0] = aVar5.c(d10);
                        dArr[1] = this.f3876b[i10].d(d10);
                        return;
                    } else {
                        aVar5.g(d10);
                        dArr[0] = this.f3876b[i10].e();
                        dArr[1] = this.f3876b[i10].f();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void d(double d10, float[] fArr) {
        C0041a[] aVarArr = this.f3876b;
        C0041a aVar = aVarArr[0];
        double d11 = aVar.f3880c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (aVar.f3895r) {
                double c10 = aVar.c(d11);
                C0041a aVar2 = this.f3876b[0];
                fArr[0] = (float) ((aVar2.f3889l * d12) + c10);
                fArr[1] = (float) ((d12 * this.f3876b[0].f3890m) + aVar2.d(d11));
                return;
            }
            aVar.g(d11);
            fArr[0] = (float) ((this.f3876b[0].a() * d12) + this.f3876b[0].e());
            fArr[1] = (float) ((this.f3876b[0].b() * d12) + this.f3876b[0].f());
        } else if (d10 > aVarArr[aVarArr.length - 1].f3881d) {
            double d13 = aVarArr[aVarArr.length - 1].f3881d;
            double d14 = d10 - d13;
            int length = aVarArr.length - 1;
            C0041a aVar3 = aVarArr[length];
            if (aVar3.f3895r) {
                double c11 = aVar3.c(d13);
                C0041a aVar4 = this.f3876b[length];
                fArr[0] = (float) ((aVar4.f3889l * d14) + c11);
                fArr[1] = (float) ((d14 * this.f3876b[length].f3890m) + aVar4.d(d13));
                return;
            }
            aVar3.g(d10);
            fArr[0] = (float) this.f3876b[length].e();
            fArr[1] = (float) this.f3876b[length].f();
        } else {
            int i10 = 0;
            while (true) {
                C0041a[] aVarArr2 = this.f3876b;
                if (i10 < aVarArr2.length) {
                    C0041a aVar5 = aVarArr2[i10];
                    if (d10 > aVar5.f3881d) {
                        i10++;
                    } else if (aVar5.f3895r) {
                        fArr[0] = (float) aVar5.c(d10);
                        fArr[1] = (float) this.f3876b[i10].d(d10);
                        return;
                    } else {
                        aVar5.g(d10);
                        fArr[0] = (float) this.f3876b[i10].e();
                        fArr[1] = (float) this.f3876b[i10].f();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final double e(double d10) {
        C0041a[] aVarArr = this.f3876b;
        int i10 = 0;
        double d11 = aVarArr[0].f3880c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > aVarArr[aVarArr.length - 1].f3881d) {
            d10 = aVarArr[aVarArr.length - 1].f3881d;
        }
        while (true) {
            C0041a[] aVarArr2 = this.f3876b;
            if (i10 >= aVarArr2.length) {
                return Double.NaN;
            }
            C0041a aVar = aVarArr2[i10];
            if (d10 > aVar.f3881d) {
                i10++;
            } else if (aVar.f3895r) {
                return aVar.f3889l;
            } else {
                aVar.g(d10);
                return this.f3876b[i10].a();
            }
        }
    }

    public final void f(double d10, double[] dArr) {
        C0041a[] aVarArr = this.f3876b;
        double d11 = aVarArr[0].f3880c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f3881d) {
            d10 = aVarArr[aVarArr.length - 1].f3881d;
        }
        int i10 = 0;
        while (true) {
            C0041a[] aVarArr2 = this.f3876b;
            if (i10 < aVarArr2.length) {
                C0041a aVar = aVarArr2[i10];
                if (d10 > aVar.f3881d) {
                    i10++;
                } else if (aVar.f3895r) {
                    dArr[0] = aVar.f3889l;
                    dArr[1] = aVar.f3890m;
                    return;
                } else {
                    aVar.g(d10);
                    dArr[0] = this.f3876b[i10].a();
                    dArr[1] = this.f3876b[i10].b();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final double[] g() {
        return this.f3875a;
    }
}
