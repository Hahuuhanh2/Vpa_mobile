package e4;

import android.graphics.PointF;
import java.util.List;
import n4.f;
import o4.a;
import z.k;

/* compiled from: FloatKeyframeAnimation */
public final class d extends g<Float> {
    public d(List<a<Float>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Float.valueOf(m(aVar, f10));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(a<Float> aVar, float f10) {
        if (aVar.f13704b == null || aVar.f13705c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        k kVar = this.f9098e;
        if (kVar != null) {
            Float f11 = (Float) kVar.c(aVar.f13709g, aVar.f13710h.floatValue(), (Float) aVar.f13704b, (Float) aVar.f13705c, f10, e(), this.f9097d);
            if (f11 != null) {
                return f11.floatValue();
            }
        }
        if (aVar.f13711i == -3987645.8f) {
            aVar.f13711i = ((Float) aVar.f13704b).floatValue();
        }
        float f12 = aVar.f13711i;
        if (aVar.f13712j == -3987645.8f) {
            aVar.f13712j = ((Float) aVar.f13705c).floatValue();
        }
        float f13 = aVar.f13712j;
        PointF pointF = f.f13512a;
        return android.support.v4.media.a.e(f13, f12, f10, f12);
    }
}
