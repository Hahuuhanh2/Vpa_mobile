package w1;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import v1.b;

/* compiled from: DisplayCutoutCompat */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f16297a;

    /* compiled from: DisplayCutoutCompat */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public d(DisplayCutout displayCutout) {
        this.f16297a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return b.a(this.f16297a, ((d) obj).f16297a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f16297a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("DisplayCutoutCompat{");
        q10.append(this.f16297a);
        q10.append("}");
        return q10.toString();
    }
}
