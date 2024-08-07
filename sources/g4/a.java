package g4;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* compiled from: CubicCurveData */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f10338a;

    /* renamed from: b  reason: collision with root package name */
    public final PointF f10339b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f10340c;

    public a() {
        this.f10338a = new PointF();
        this.f10339b = new PointF();
        this.f10340c = new PointF();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", new Object[]{Float.valueOf(this.f10340c.x), Float.valueOf(this.f10340c.y), Float.valueOf(this.f10338a.x), Float.valueOf(this.f10338a.y), Float.valueOf(this.f10339b.x), Float.valueOf(this.f10339b.y)});
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f10338a = pointF;
        this.f10339b = pointF2;
        this.f10340c = pointF3;
    }
}
