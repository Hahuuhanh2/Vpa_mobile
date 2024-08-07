package j3;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: Animatable2Compat */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f11552a;

    public b(c cVar) {
        this.f11552a = cVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.f11552a.a(drawable);
    }

    public final void onAnimationStart(Drawable drawable) {
        this.f11552a.b(drawable);
    }
}
