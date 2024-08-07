package e4;

import java.util.List;
import n4.f;
import o4.a;
import p3.l0;
import z.k;

/* compiled from: ColorKeyframeAnimation */
public final class b extends g<Integer> {
    public b(List<a<Integer>> list) {
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
        return l0.O(f.b(f10, 0.0f, 1.0f), ((Integer) aVar.f13704b).intValue(), ((Integer) aVar.f13705c).intValue());
    }
}
