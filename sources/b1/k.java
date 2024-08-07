package b1;

/* compiled from: SpringStopEngine */
public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public double f3944a = 0.5d;

    /* renamed from: b  reason: collision with root package name */
    public double f3945b;

    /* renamed from: c  reason: collision with root package name */
    public double f3946c;

    /* renamed from: d  reason: collision with root package name */
    public float f3947d;

    /* renamed from: e  reason: collision with root package name */
    public float f3948e;

    /* renamed from: f  reason: collision with root package name */
    public float f3949f;

    /* renamed from: g  reason: collision with root package name */
    public float f3950g;

    /* renamed from: h  reason: collision with root package name */
    public float f3951h;

    /* renamed from: i  reason: collision with root package name */
    public int f3952i = 0;

    public final boolean a() {
        double d10 = ((double) this.f3948e) - this.f3946c;
        double d11 = this.f3945b;
        double d12 = (double) this.f3949f;
        if (Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f3950g))) / d11) <= ((double) this.f3951h)) {
            return true;
        }
        return false;
    }

    public final float b() {
        return 0.0f;
    }

    public final float getInterpolation(float f10) {
        k kVar = this;
        float f11 = f10;
        double d10 = (double) (f11 - kVar.f3947d);
        double d11 = kVar.f3945b;
        double d12 = kVar.f3944a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) kVar.f3950g)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) sqrt);
        int i10 = 0;
        while (i10 < sqrt) {
            double d14 = (double) kVar.f3948e;
            double d15 = kVar.f3946c;
            int i11 = sqrt;
            int i12 = i10;
            double d16 = (double) kVar.f3949f;
            double d17 = (double) kVar.f3950g;
            double d18 = ((((((-d11) * (d14 - d15)) - (d16 * d12)) / d17) * d13) / 2.0d) + d16;
            double d19 = ((((-((((d13 * d18) / 2.0d) + d14) - d15)) * d11) - (d18 * d12)) / d17) * d13;
            float f12 = (float) (d16 + d19);
            this.f3949f = f12;
            float f13 = (float) ((((d19 / 2.0d) + d16) * d13) + d14);
            this.f3948e = f13;
            int i13 = this.f3952i;
            if (i13 > 0) {
                if (f13 < 0.0f && (i13 & 1) == 1) {
                    this.f3948e = -f13;
                    this.f3949f = -f12;
                }
                float f14 = this.f3948e;
                if (f14 > 1.0f && (i13 & 2) == 2) {
                    this.f3948e = 2.0f - f14;
                    this.f3949f = -this.f3949f;
                }
            }
            f11 = f10;
            sqrt = i11;
            i10 = i12 + 1;
            kVar = this;
        }
        k kVar2 = kVar;
        kVar2.f3947d = f11;
        return kVar2.f3948e;
    }
}
