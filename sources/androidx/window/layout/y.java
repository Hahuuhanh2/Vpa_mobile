package androidx.window.layout;

import android.app.Activity;
import dl.t;
import ik.d;
import sk.j;

/* compiled from: WindowInfoTrackerImpl.kt */
public final class y implements w {

    /* renamed from: b  reason: collision with root package name */
    public final u f3721b;

    public y(a0 a0Var, u uVar) {
        j.f(a0Var, "windowMetricsCalculator");
        this.f3721b = uVar;
    }

    public final t a(Activity activity) {
        j.f(activity, "activity");
        return new t(new x(this, activity, (d<? super x>) null));
    }
}
