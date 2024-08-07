package l8;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final d f12773a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12774b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f12773a;
            f10 += ((b) dVar).f12774b;
        }
        this.f12773a = dVar;
        this.f12774b = f10;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f12773a.a(rectF) + this.f12774b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f12773a.equals(bVar.f12773a) || this.f12774b != bVar.f12774b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12773a, Float.valueOf(this.f12774b)});
    }
}
