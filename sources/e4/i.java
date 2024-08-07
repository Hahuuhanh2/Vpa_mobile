package e4;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import o4.a;
import z.k;

/* compiled from: PathKeyframeAnimation */
public final class i extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f9120i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final float[] f9121j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public final PathMeasure f9122k = new PathMeasure();

    /* renamed from: l  reason: collision with root package name */
    public h f9123l;

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        h hVar = (h) aVar;
        Path path = hVar.f9118q;
        if (path == null) {
            return (PointF) aVar.f13704b;
        }
        k kVar = this.f9098e;
        if (kVar != null) {
            PointF pointF = (PointF) kVar.c(hVar.f13709g, hVar.f13710h.floatValue(), (PointF) hVar.f13704b, (PointF) hVar.f13705c, e(), f10, this.f9097d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f9123l != hVar) {
            this.f9122k.setPath(path, false);
            this.f9123l = hVar;
        }
        PathMeasure pathMeasure = this.f9122k;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.f9121j, (float[]) null);
        PointF pointF2 = this.f9120i;
        float[] fArr = this.f9121j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f9120i;
    }
}
