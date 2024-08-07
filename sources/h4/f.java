package h4;

import android.graphics.PointF;
import e4.a;
import e4.d;
import e4.l;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue */
public final class f implements h<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f10548a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10549b;

    public f(b bVar, b bVar2) {
        this.f10548a = bVar;
        this.f10549b = bVar2;
    }

    public final a<PointF, PointF> a() {
        return new l((d) this.f10548a.a(), (d) this.f10549b.a());
    }

    public final List<o4.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public final boolean c() {
        if (!this.f10548a.c() || !this.f10549b.c()) {
            return false;
        }
        return true;
    }
}
