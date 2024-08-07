package b1;

/* compiled from: CurveFit */
public abstract class b {

    /* compiled from: CurveFit */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public double f3896a;

        /* renamed from: b  reason: collision with root package name */
        public double[] f3897b;

        public a(double d10, double[] dArr) {
            this.f3896a = d10;
            this.f3897b = dArr;
        }

        public final double b(double d10) {
            return this.f3897b[0];
        }

        public final void c(double d10, double[] dArr) {
            double[] dArr2 = this.f3897b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        public final void d(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f3897b;
                if (i10 < dArr.length) {
                    fArr[i10] = (float) dArr[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }

        public final double e(double d10) {
            return 0.0d;
        }

        public final void f(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f3897b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        public final double[] g() {
            return new double[]{this.f3896a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 == 0) {
            return new g(dArr, dArr2);
        }
        if (i10 != 2) {
            return new f(dArr, dArr2);
        }
        return new a(dArr[0], dArr2[0]);
    }

    public abstract double b(double d10);

    public abstract void c(double d10, double[] dArr);

    public abstract void d(double d10, float[] fArr);

    public abstract double e(double d10);

    public abstract void f(double d10, double[] dArr);

    public abstract double[] g();
}
