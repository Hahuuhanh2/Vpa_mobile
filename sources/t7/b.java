package t7;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import q2.a;
import q2.c;

/* compiled from: AnimationUtils */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f14885a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final q2.b f14886b = new q2.b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f14887c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final c f14888d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f14889e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : android.support.v4.media.a.e(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }

    public static int b(float f10, int i10, int i11) {
        return Math.round(f10 * ((float) (i11 - i10))) + i10;
    }
}
