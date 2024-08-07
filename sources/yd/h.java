package yd;

import android.graphics.Rect;
import xd.n;

/* compiled from: CenterCropStrategy */
public final class h extends n {
    public final float a(n nVar, n nVar2) {
        if (nVar.f17310a <= 0 || nVar.f17311b <= 0) {
            return 0.0f;
        }
        n b10 = nVar.b(nVar2);
        float f10 = (((float) b10.f17310a) * 1.0f) / ((float) nVar.f17310a);
        if (f10 > 1.0f) {
            f10 = (float) Math.pow((double) (1.0f / f10), 1.1d);
        }
        float f11 = ((((float) b10.f17311b) * 1.0f) / ((float) nVar2.f17311b)) + ((((float) b10.f17310a) * 1.0f) / ((float) nVar2.f17310a));
        return ((1.0f / f11) / f11) * f10;
    }

    public final Rect b(n nVar, n nVar2) {
        n b10 = nVar.b(nVar2);
        nVar.toString();
        b10.toString();
        nVar2.toString();
        int i10 = (b10.f17310a - nVar2.f17310a) / 2;
        int i11 = (b10.f17311b - nVar2.f17311b) / 2;
        return new Rect(-i10, -i11, b10.f17310a - i10, b10.f17311b - i11);
    }
}
