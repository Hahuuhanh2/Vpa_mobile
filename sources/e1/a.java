package e1;

import b1.k;
import b1.m;
import b1.n;
import f1.o;

/* compiled from: StopLogic */
public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    public n f9072a;

    /* renamed from: b  reason: collision with root package name */
    public k f9073b;

    /* renamed from: c  reason: collision with root package name */
    public m f9074c;

    public a() {
        n nVar = new n();
        this.f9072a = nVar;
        this.f9074c = nVar;
    }

    public final float a() {
        return this.f9074c.b();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        n nVar = this.f9072a;
        this.f9074c = nVar;
        nVar.f3965l = f10;
        if (f10 > f11) {
            z10 = true;
        } else {
            z10 = false;
        }
        nVar.f3964k = z10;
        if (z10) {
            nVar.d(-f12, f10 - f11, f14, f15, f13);
            return;
        }
        nVar.d(f12, f11 - f10, f14, f15, f13);
    }

    public final float getInterpolation(float f10) {
        return this.f9074c.getInterpolation(f10);
    }
}
