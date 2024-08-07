package l8;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: ClampedCornerSize */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f12775a;

    public c(float f10) {
        this.f12775a = f10;
    }

    public final float a(RectF rectF) {
        return Math.min(this.f12775a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.f12775a == ((c) obj).f12775a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12775a)});
    }
}
