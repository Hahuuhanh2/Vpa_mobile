package n8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f13523a;

    public a(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f13523a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13523a.d();
    }
}
