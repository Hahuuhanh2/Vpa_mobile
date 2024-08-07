package k2;

import k2.b;

/* compiled from: SpringForce */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public double f11943a;

    /* renamed from: b  reason: collision with root package name */
    public double f11944b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11945c;

    /* renamed from: d  reason: collision with root package name */
    public double f11946d;

    /* renamed from: e  reason: collision with root package name */
    public double f11947e;

    /* renamed from: f  reason: collision with root package name */
    public double f11948f;

    /* renamed from: g  reason: collision with root package name */
    public double f11949g;

    /* renamed from: h  reason: collision with root package name */
    public double f11950h;

    /* renamed from: i  reason: collision with root package name */
    public double f11951i;

    /* renamed from: j  reason: collision with root package name */
    public final b.g f11952j;

    public d() {
        this.f11943a = Math.sqrt(1500.0d);
        this.f11944b = 0.5d;
        this.f11945c = false;
        this.f11951i = Double.MAX_VALUE;
        this.f11952j = new b.g();
    }

    public final b.g a(double d10, double d11, long j10) {
        double d12;
        double d13;
        if (!this.f11945c) {
            if (this.f11951i != Double.MAX_VALUE) {
                double d14 = this.f11944b;
                if (d14 > 1.0d) {
                    double d15 = this.f11943a;
                    this.f11948f = (Math.sqrt((d14 * d14) - 1.0d) * d15) + ((-d14) * d15);
                    double d16 = this.f11944b;
                    double d17 = this.f11943a;
                    this.f11949g = ((-d16) * d17) - (Math.sqrt((d16 * d16) - 1.0d) * d17);
                } else if (d14 >= 0.0d && d14 < 1.0d) {
                    this.f11950h = Math.sqrt(1.0d - (d14 * d14)) * this.f11943a;
                }
                this.f11945c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d18 = ((double) j10) / 1000.0d;
        double d19 = d10 - this.f11951i;
        double d20 = this.f11944b;
        if (d20 > 1.0d) {
            double d21 = this.f11949g;
            double d22 = this.f11948f;
            double d23 = d19 - (((d21 * d19) - d11) / (d21 - d22));
            double d24 = ((d19 * d21) - d11) / (d21 - d22);
            d12 = (Math.pow(2.718281828459045d, this.f11948f * d18) * d24) + (Math.pow(2.718281828459045d, d21 * d18) * d23);
            double d25 = this.f11949g;
            double pow = Math.pow(2.718281828459045d, d25 * d18) * d23 * d25;
            double d26 = this.f11948f;
            d13 = (Math.pow(2.718281828459045d, d26 * d18) * d24 * d26) + pow;
        } else if (d20 == 1.0d) {
            double d27 = this.f11943a;
            double d28 = (d27 * d19) + d11;
            double d29 = (d28 * d18) + d19;
            double pow2 = Math.pow(2.718281828459045d, (-d27) * d18) * d29;
            double pow3 = Math.pow(2.718281828459045d, (-this.f11943a) * d18) * d29;
            double d30 = this.f11943a;
            d13 = (Math.pow(2.718281828459045d, (-d30) * d18) * d28) + (pow3 * (-d30));
            d12 = pow2;
        } else {
            double d31 = 1.0d / this.f11950h;
            double d32 = this.f11943a;
            double d33 = ((d20 * d32 * d19) + d11) * d31;
            double sin = ((Math.sin(this.f11950h * d18) * d33) + (Math.cos(this.f11950h * d18) * d19)) * Math.pow(2.718281828459045d, (-d20) * d32 * d18);
            double d34 = this.f11943a;
            double d35 = this.f11944b;
            double d36 = (-d34) * sin * d35;
            double pow4 = Math.pow(2.718281828459045d, (-d35) * d34 * d18);
            double d37 = this.f11950h;
            double d38 = sin;
            double d39 = (-d37) * d19;
            double d40 = this.f11950h;
            d13 = (((Math.cos(d40 * d18) * d33 * d40) + (Math.sin(d37 * d18) * d39)) * pow4) + d36;
            d12 = d38;
        }
        b.g gVar = this.f11952j;
        gVar.f11938a = (float) (d12 + this.f11951i);
        gVar.f11939b = (float) d13;
        return gVar;
    }

    public d(float f10) {
        this.f11943a = Math.sqrt(1500.0d);
        this.f11944b = 0.5d;
        this.f11945c = false;
        this.f11952j = new b.g();
        this.f11951i = (double) f10;
    }
}
