package n8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: BaseTransientBottomBar */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f13524a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f13524a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13524a.e();
    }

    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f13524a;
        h hVar = baseTransientBottomBar.f6819j;
        int i10 = baseTransientBottomBar.f6812c;
        int i11 = baseTransientBottomBar.f6810a;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f6847a.setAlpha(0.0f);
        long j10 = (long) i11;
        long j11 = (long) (i10 - i11);
        snackbarContentLayout.f6847a.animate().alpha(1.0f).setDuration(j10).setInterpolator(snackbarContentLayout.f6849c).setStartDelay(j11).start();
        if (snackbarContentLayout.f6848b.getVisibility() == 0) {
            snackbarContentLayout.f6848b.setAlpha(0.0f);
            snackbarContentLayout.f6848b.animate().alpha(1.0f).setDuration(j10).setInterpolator(snackbarContentLayout.f6849c).setStartDelay(j11).start();
        }
    }
}
