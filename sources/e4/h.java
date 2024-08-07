package e4;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.i;
import n4.g;
import o4.a;

/* compiled from: PathKeyframe */
public final class h extends a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    public Path f9118q;

    /* renamed from: r  reason: collision with root package name */
    public final a<PointF> f9119r;

    public h(i iVar, a<PointF> aVar) {
        super(iVar, (PointF) aVar.f13704b, (PointF) aVar.f13705c, aVar.f13706d, aVar.f13707e, aVar.f13708f, aVar.f13709g, aVar.f13710h);
        this.f9119r = aVar;
        d();
    }

    public final void d() {
        boolean z10;
        T t10;
        T t11;
        T t12 = this.f13705c;
        if (t12 == null || (t11 = this.f13704b) == null || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        T t13 = this.f13704b;
        if (t13 != null && (t10 = this.f13705c) != null && !z10) {
            PointF pointF = (PointF) t13;
            PointF pointF2 = (PointF) t10;
            a<PointF> aVar = this.f9119r;
            PointF pointF3 = aVar.f13717o;
            PointF pointF4 = aVar.f13718p;
            g.a aVar2 = g.f13513a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                float f10 = pointF.x;
                float f11 = pointF2.x;
                float f12 = pointF2.y;
                path.cubicTo(pointF3.x + f10, pointF.y + pointF3.y, f11 + pointF4.x, f12 + pointF4.y, f11, f12);
            }
            this.f9118q = path;
        }
    }
}
