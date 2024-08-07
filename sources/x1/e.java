package x1;

import android.view.accessibility.AccessibilityManager;

/* compiled from: AccessibilityManagerCompat */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f16860a;

    public e(d dVar) {
        this.f16860a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f16860a.equals(((e) obj).f16860a);
    }

    public final int hashCode() {
        return this.f16860a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z10) {
        this.f16860a.onTouchExplorationStateChanged(z10);
    }
}
