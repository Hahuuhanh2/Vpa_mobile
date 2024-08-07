package i4;

import android.graphics.PointF;
import g4.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11129a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f11130b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11131c;

    public l(PointF pointF, boolean z10, List<a> list) {
        this.f11130b = pointF;
        this.f11131c = z10;
        this.f11129a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f11130b == null) {
            this.f11130b = new PointF();
        }
        this.f11130b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ShapeData{numCurves=");
        q10.append(this.f11129a.size());
        q10.append("closed=");
        q10.append(this.f11131c);
        q10.append('}');
        return q10.toString();
    }

    public l() {
        this.f11129a = new ArrayList();
    }
}
