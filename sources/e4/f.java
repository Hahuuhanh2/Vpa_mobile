package e4;

import android.graphics.PointF;
import java.util.List;
import o4.a;
import z.k;

/* compiled from: IntegerKeyframeAnimation */
public final class f extends g<Integer> {
    public f(List<a<Integer>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Integer.valueOf(l(aVar, f10));
    }

    public final int l(a<Integer> aVar, float f10) {
        if (aVar.f13704b == null || aVar.f13705c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        k kVar = this.f9098e;
        if (kVar != null) {
            Integer num = (Integer) kVar.c(aVar.f13709g, aVar.f13710h.floatValue(), (Integer) aVar.f13704b, (Integer) aVar.f13705c, f10, e(), this.f9097d);
            if (num != null) {
                return num.intValue();
            }
        }
        if (aVar.f13713k == 784923401) {
            aVar.f13713k = ((Integer) aVar.f13704b).intValue();
        }
        int i10 = aVar.f13713k;
        if (aVar.f13714l == 784923401) {
            aVar.f13714l = ((Integer) aVar.f13705c).intValue();
        }
        int i11 = aVar.f13714l;
        PointF pointF = n4.f.f13512a;
        return (int) ((f10 * ((float) (i11 - i10))) + ((float) i10));
    }
}
