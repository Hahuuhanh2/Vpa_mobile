package n8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: BaseTransientBottomBar */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f13525a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f13525a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13525a.d();
    }

    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f13525a;
        h hVar = baseTransientBottomBar.f6819j;
        int i10 = baseTransientBottomBar.f6811b;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f6847a.setAlpha(1.0f);
        long j10 = (long) i10;
        long j11 = (long) 0;
        snackbarContentLayout.f6847a.animate().alpha(0.0f).setDuration(j10).setInterpolator(snackbarContentLayout.f6849c).setStartDelay(j11).start();
        if (snackbarContentLayout.f6848b.getVisibility() == 0) {
            snackbarContentLayout.f6848b.setAlpha(1.0f);
            snackbarContentLayout.f6848b.animate().alpha(0.0f).setDuration(j10).setInterpolator(snackbarContentLayout.f6849c).setStartDelay(j11).start();
        }
    }
}
