package v;

/* compiled from: ZoomStateImpl */
public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    public float f15700a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15701b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15702c;

    /* renamed from: d  reason: collision with root package name */
    public float f15703d;

    public h2(float f10, float f11) {
        this.f15701b = f10;
        this.f15702c = f11;
    }

    public final void a() {
        float f10 = this.f15701b;
        float f11 = 1.0f;
        int i10 = (1.0f > f10 ? 1 : (1.0f == f10 ? 0 : -1));
        if (i10 <= 0) {
            float f12 = this.f15702c;
            if (1.0f >= f12) {
                this.f15700a = 1.0f;
                if (f10 != f12) {
                    if (i10 != 0) {
                        if (1.0f != f12) {
                            float f13 = 1.0f / f12;
                            f11 = (1.0f - f13) / ((1.0f / f10) - f13);
                        }
                    }
                    this.f15703d = f11;
                    return;
                }
                f11 = 0.0f;
                this.f15703d = f11;
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + 1.0f + " is not within valid range [" + this.f15702c + " , " + this.f15701b + "]");
    }
}
