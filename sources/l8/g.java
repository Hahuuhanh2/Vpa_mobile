package l8;

/* compiled from: MarkerEdgeTreatment */
public final class g extends f {

    /* renamed from: a  reason: collision with root package name */
    public final float f12777a;

    public g(float f10) {
        this.f12777a = f10 - 0.001f;
    }

    public final void b(float f10, float f11, float f12, p pVar) {
        float sqrt = (float) ((Math.sqrt(2.0d) * ((double) this.f12777a)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f12777a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        pVar.e(f11 - sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f12777a)) - ((double) this.f12777a)))) + sqrt2, 270.0f, 0.0f);
        pVar.d(f11, (float) (-((Math.sqrt(2.0d) * ((double) this.f12777a)) - ((double) this.f12777a))));
        pVar.d(f11 + sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f12777a)) - ((double) this.f12777a)))) + sqrt2);
    }
}
