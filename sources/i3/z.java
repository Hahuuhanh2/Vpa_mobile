package i3;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
public final class z implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f11072a;

    public z(View view) {
        this.f11072a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z) || !((z) obj).f11072a.equals(this.f11072a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11072a.hashCode();
    }
}
