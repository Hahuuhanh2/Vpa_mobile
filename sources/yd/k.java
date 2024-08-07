package yd;

import android.graphics.Rect;
import xd.n;

/* compiled from: FitXYStrategy */
public final class k extends n {
    public final float a(n nVar, n nVar2) {
        int i10;
        int i11 = nVar.f17310a;
        if (i11 <= 0 || (i10 = nVar.f17311b) <= 0) {
            return 0.0f;
        }
        int i12 = nVar2.f17310a;
        float f10 = (((float) i11) * 1.0f) / ((float) i12);
        if (f10 < 1.0f) {
            f10 = 1.0f / f10;
        }
        int i13 = nVar2.f17311b;
        float f11 = (((float) i10) * 1.0f) / ((float) i13);
        if (f11 < 1.0f) {
            f11 = 1.0f / f11;
        }
        float f12 = (1.0f / f10) / f11;
        float f13 = ((((float) i11) * 1.0f) / ((float) i10)) / ((((float) i12) * 1.0f) / ((float) i13));
        if (f13 < 1.0f) {
            f13 = 1.0f / f13;
        }
        return (((1.0f / f13) / f13) / f13) * f12;
    }

    public final Rect b(n nVar, n nVar2) {
        return new Rect(0, 0, nVar2.f17310a, nVar2.f17311b);
    }
}
