package l8;

import lb.b;

/* compiled from: CutCornerTreatment */
public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    public float f12776c = -1.0f;

    public e() {
        super(6);
    }

    public final void g(float f10, float f11, p pVar) {
        pVar.e(0.0f, f11 * f10, 180.0f, 90.0f);
        double d10 = (double) f11;
        double d11 = (double) f10;
        pVar.d((float) (Math.sin(Math.toRadians((double) 90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians((double) 0.0f)) * d10 * d11));
    }
}
