package e4;

import android.graphics.PointF;
import i4.c;
import java.util.List;
import n4.f;
import o4.a;
import p3.l0;
import v.v;
import z.k;

/* compiled from: GradientColorKeyframeAnimation */
public final class e extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9116i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f9117j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i10, List list) {
        super(list);
        this.f9116i = i10;
        if (i10 != 1) {
            int i11 = 0;
            c cVar = (c) ((a) list.get(0)).f13704b;
            i11 = cVar != null ? cVar.f11079b.length : i11;
            this.f9117j = new c(new float[i11], new int[i11]);
            return;
        }
        super(list);
        this.f9117j = new PointF();
    }

    public final Object g(a aVar, float f10) {
        switch (this.f9116i) {
            case 0:
                c cVar = (c) this.f9117j;
                c cVar2 = (c) aVar.f13704b;
                c cVar3 = (c) aVar.f13705c;
                cVar.getClass();
                if (cVar2.f11079b.length == cVar3.f11079b.length) {
                    int i10 = 0;
                    while (true) {
                        int[] iArr = cVar2.f11079b;
                        if (i10 >= iArr.length) {
                            return (c) this.f9117j;
                        }
                        float[] fArr = cVar.f11078a;
                        float f11 = cVar2.f11078a[i10];
                        float f12 = cVar3.f11078a[i10];
                        PointF pointF = f.f13512a;
                        fArr[i10] = android.support.v4.media.a.e(f12, f11, f10, f11);
                        cVar.f11079b[i10] = l0.O(f10, iArr[i10], cVar3.f11079b[i10]);
                        i10++;
                    }
                } else {
                    StringBuilder q10 = android.support.v4.media.a.q("Cannot interpolate between gradients. Lengths vary (");
                    q10.append(cVar2.f11079b.length);
                    q10.append(" vs ");
                    throw new IllegalArgumentException(v.e(q10, cVar3.f11079b.length, ")"));
                }
            default:
                return l(aVar, f10, f10, f10);
        }
    }

    public final /* bridge */ /* synthetic */ Object h(a aVar, float f10, float f11, float f12) {
        switch (this.f9116i) {
            case 1:
                return l(aVar, f10, f11, f12);
            default:
                super.h(aVar, f10, f11, f12);
                throw null;
        }
    }

    public final PointF l(a aVar, float f10, float f11, float f12) {
        T t10;
        T t11 = aVar.f13704b;
        if (t11 == null || (t10 = aVar.f13705c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t11;
        PointF pointF2 = (PointF) t10;
        k kVar = this.f9098e;
        if (kVar != null) {
            PointF pointF3 = (PointF) kVar.c(aVar.f13709g, aVar.f13710h.floatValue(), pointF, pointF2, f10, e(), this.f9097d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        float f13 = pointF.x;
        float e10 = android.support.v4.media.a.e(pointF2.x, f13, f11, f13);
        float f14 = pointF.y;
        ((PointF) this.f9117j).set(e10, ((pointF2.y - f14) * f12) + f14);
        return (PointF) this.f9117j;
    }
}
