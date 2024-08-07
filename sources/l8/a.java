package l8;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f12772a;

    public a(float f10) {
        this.f12772a = f10;
    }

    public final float a(RectF rectF) {
        return this.f12772a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f12772a == ((a) obj).f12772a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12772a)});
    }
}
