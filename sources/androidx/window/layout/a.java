package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import sk.j;

/* compiled from: ActivityCompatHelper.kt */
public final class a {
    public static Rect a(Activity activity) {
        j.f(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        j.e(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
