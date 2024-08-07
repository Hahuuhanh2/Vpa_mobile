package d;

import android.window.BackEvent;
import sk.j;

/* compiled from: BackEventCompat.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8417a = new a();

    public final BackEvent a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    public final float b(BackEvent backEvent) {
        j.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        j.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        j.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        j.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
