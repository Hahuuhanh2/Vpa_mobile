package se;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.luck.picture.lib.magical.MagicalView;

/* compiled from: MagicalView */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MagicalView f14750a;

    public c(MagicalView magicalView) {
        this.f14750a = magicalView;
    }

    public final void onAnimationEnd(Animator animator) {
        MagicalView magicalView = this.f14750a;
        int i10 = MagicalView.E;
        magicalView.g();
    }
}
