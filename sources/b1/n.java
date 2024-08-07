package b1;

/* compiled from: StopLogicEngine */
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public float f3954a;

    /* renamed from: b  reason: collision with root package name */
    public float f3955b;

    /* renamed from: c  reason: collision with root package name */
    public float f3956c;

    /* renamed from: d  reason: collision with root package name */
    public float f3957d;

    /* renamed from: e  reason: collision with root package name */
    public float f3958e;

    /* renamed from: f  reason: collision with root package name */
    public float f3959f;

    /* renamed from: g  reason: collision with root package name */
    public float f3960g;

    /* renamed from: h  reason: collision with root package name */
    public float f3961h;

    /* renamed from: i  reason: collision with root package name */
    public float f3962i;

    /* renamed from: j  reason: collision with root package name */
    public int f3963j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3964k = false;

    /* renamed from: l  reason: collision with root package name */
    public float f3965l;

    /* renamed from: m  reason: collision with root package name */
    public float f3966m;

    public final boolean a() {
        if (b() >= 1.0E-5f || Math.abs(this.f3962i - this.f3966m) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public final float b() {
        if (this.f3964k) {
            return -c(this.f3966m);
        }
        return c(this.f3966m);
    }

    public final float c(float f10) {
        float f11;
        float f12;
        float f13 = this.f3957d;
        if (f10 <= f13) {
            f11 = this.f3954a;
            f12 = this.f3955b;
        } else {
            int i10 = this.f3963j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f3958e;
            if (f10 < f13) {
                f11 = this.f3955b;
                f12 = this.f3956c;
            } else if (i10 == 2) {
                return this.f3961h;
            } else {
                float f14 = f10 - f13;
                float f15 = this.f3959f;
                if (f14 >= f15) {
                    return this.f3962i;
                }
                float f16 = this.f3956c;
                return f16 - ((f14 * f16) / f15);
            }
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    public final void d(float f10, float f11, float f12, float f13, float f14) {
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f3954a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12));
            if (sqrt < f13) {
                this.f3963j = 2;
                this.f3954a = f10;
                this.f3955b = sqrt;
                this.f3956c = 0.0f;
                float f17 = (sqrt - f10) / f12;
                this.f3957d = f17;
                this.f3958e = sqrt / f12;
                this.f3960g = ((f10 + sqrt) * f17) / 2.0f;
                this.f3961h = f11;
                this.f3962i = f11;
                return;
            }
            this.f3963j = 3;
            this.f3954a = f10;
            this.f3955b = f13;
            this.f3956c = f13;
            float f18 = (f13 - f10) / f12;
            this.f3957d = f18;
            float f19 = f13 / f12;
            this.f3959f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f3958e = ((f11 - f20) - f21) / f13;
            this.f3960g = f20;
            this.f3961h = f11 - f21;
            this.f3962i = f11;
        } else if (f16 >= f11) {
            this.f3963j = 1;
            this.f3954a = f10;
            this.f3955b = 0.0f;
            this.f3960g = f11;
            this.f3957d = (2.0f * f11) / f10;
        } else {
            float f22 = f11 - f16;
            float f23 = f22 / f10;
            if (f23 + f15 < f14) {
                this.f3963j = 2;
                this.f3954a = f10;
                this.f3955b = f10;
                this.f3956c = 0.0f;
                this.f3960g = f22;
                this.f3961h = f11;
                this.f3957d = f23;
                this.f3958e = f15;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) (((f10 * f10) / 2.0f) + (f12 * f11)));
            float f24 = (sqrt2 - f10) / f12;
            this.f3957d = f24;
            float f25 = sqrt2 / f12;
            this.f3958e = f25;
            if (sqrt2 < f13) {
                this.f3963j = 2;
                this.f3954a = f10;
                this.f3955b = sqrt2;
                this.f3956c = 0.0f;
                this.f3957d = f24;
                this.f3958e = f25;
                this.f3960g = ((f10 + sqrt2) * f24) / 2.0f;
                this.f3961h = f11;
                return;
            }
            this.f3963j = 3;
            this.f3954a = f10;
            this.f3955b = f13;
            this.f3956c = f13;
            float f26 = (f13 - f10) / f12;
            this.f3957d = f26;
            float f27 = f13 / f12;
            this.f3959f = f27;
            float f28 = ((f10 + f13) * f26) / 2.0f;
            float f29 = (f27 * f13) / 2.0f;
            this.f3958e = ((f11 - f28) - f29) / f13;
            this.f3960g = f28;
            this.f3961h = f11 - f29;
            this.f3962i = f11;
        }
    }

    public final float getInterpolation(float f10) {
        float f11;
        float f12 = this.f3957d;
        if (f10 <= f12) {
            float f13 = this.f3954a;
            f11 = ((((this.f3955b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i10 = this.f3963j;
            if (i10 == 1) {
                f11 = this.f3960g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f3958e;
                if (f14 < f15) {
                    float f16 = this.f3960g;
                    float f17 = this.f3955b;
                    f11 = ((((this.f3956c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i10 == 2) {
                    f11 = this.f3961h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f3959f;
                    if (f18 <= f19) {
                        float f20 = this.f3961h;
                        float f21 = this.f3956c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f3962i;
                    }
                }
            }
        }
        this.f3966m = f10;
        if (this.f3964k) {
            return this.f3965l - f11;
        }
        return this.f3965l + f11;
    }
}
