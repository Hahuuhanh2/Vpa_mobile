package e4;

import g4.b;
import java.util.List;
import o4.a;
import z.k;

/* compiled from: TextKeyframeAnimation */
public final class n extends g<b> {
    public n(List<a<b>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        T t10;
        float f11;
        b bVar;
        k kVar = this.f9098e;
        if (kVar != null) {
            float f12 = aVar.f13709g;
            Float f13 = aVar.f13710h;
            if (f13 == null) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = f13.floatValue();
            }
            b bVar2 = (b) aVar.f13704b;
            T t11 = aVar.f13705c;
            if (t11 == null) {
                bVar = bVar2;
            } else {
                bVar = (b) t11;
            }
            return (b) kVar.c(f12, f11, bVar2, bVar, f10, d(), this.f9097d);
        } else if (f10 != 1.0f || (t10 = aVar.f13705c) == null) {
            return (b) aVar.f13704b;
        } else {
            return (b) t10;
        }
    }
}
