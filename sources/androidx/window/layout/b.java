package androidx.window.layout;

import android.view.DisplayCutout;

/* compiled from: DisplayCompatHelper.kt */
public final class b {
    public static int a(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int b(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
