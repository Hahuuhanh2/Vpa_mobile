package e4;

import android.graphics.PointF;
import java.util.List;
import n4.f;
import o4.a;
import o4.c;
import z.k;

/* compiled from: ScaleKeyframeAnimation */
public final class j extends g<c> {

    /* renamed from: i  reason: collision with root package name */
    public final c f9124i = new c();

    public j(List<a<c>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        T t10;
        T t11 = aVar.f13704b;
        if (t11 == null || (t10 = aVar.f13705c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c cVar = (c) t11;
        c cVar2 = (c) t10;
        k kVar = this.f9098e;
        if (kVar != null) {
            c cVar3 = (c) kVar.c(aVar.f13709g, aVar.f13710h.floatValue(), cVar, cVar2, f10, e(), this.f9097d);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        c cVar4 = this.f9124i;
        float f11 = cVar.f13726a;
        float f12 = cVar2.f13726a;
        PointF pointF = f.f13512a;
        float e10 = android.support.v4.media.a.e(f12, f11, f10, f11);
        float f13 = cVar.f13727b;
        float e11 = android.support.v4.media.a.e(cVar2.f13727b, f13, f10, f13);
        cVar4.f13726a = e10;
        cVar4.f13727b = e11;
        return cVar4;
    }
}
