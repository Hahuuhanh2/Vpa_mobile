package b1;

/* compiled from: Schlick */
public final class i extends c {

    /* renamed from: d  reason: collision with root package name */
    public double f3937d;

    /* renamed from: e  reason: collision with root package name */
    public double f3938e;

    public i(String str) {
        this.f3900a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f3937d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i10 = indexOf2 + 1;
        this.f3938e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    public final double a(double d10) {
        double d11 = this.f3938e;
        if (d10 < d11) {
            return (d11 * d10) / (((d11 - d10) * this.f3937d) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d11)) / ((1.0d - d10) - ((d11 - d10) * this.f3937d));
    }

    public final double b(double d10) {
        double d11 = this.f3938e;
        if (d10 < d11) {
            double d12 = this.f3937d;
            double d13 = d12 * d11 * d11;
            double d14 = ((d11 - d10) * d12) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = this.f3937d;
        double d16 = d11 - 1.0d;
        double d17 = (((d11 - d10) * (-d15)) - d10) + 1.0d;
        return ((d16 * d15) * d16) / (d17 * d17);
    }
}
