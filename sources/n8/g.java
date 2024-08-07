package n8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f13529a;

    public g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f13529a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13529a.e();
    }
}
