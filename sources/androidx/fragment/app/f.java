package androidx.fragment.app;

import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.d;
import androidx.fragment.app.l0;
import c0.s0;
import java.util.Objects;
import sk.j;

/* compiled from: DefaultSpecialEffectsController.kt */
public final class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0.b f2614a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2615b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2616c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d.a f2617d;

    public f(View view, d.a aVar, d dVar, l0.b bVar) {
        this.f2614a = bVar;
        this.f2615b = dVar;
        this.f2616c = view;
        this.f2617d = aVar;
    }

    public final void onAnimationEnd(Animation animation) {
        j.f(animation, "animation");
        d dVar = this.f2615b;
        dVar.f2663a.post(new s0(3, dVar, this.f2616c, this.f2617d));
        if (FragmentManager.J(2)) {
            Objects.toString(this.f2614a);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        j.f(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        j.f(animation, "animation");
        if (FragmentManager.J(2)) {
            Objects.toString(this.f2614a);
        }
    }
}
