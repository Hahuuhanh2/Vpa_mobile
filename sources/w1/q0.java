package w1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f16349a;

    /* compiled from: ViewPropertyAnimatorCompat */
    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public q0(View view) {
        this.f16349a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f16349a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f16349a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f16349a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(r0 r0Var) {
        View view = this.f16349a.get();
        if (view == null) {
            return;
        }
        if (r0Var != null) {
            view.animate().setListener(new p0(r0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f10) {
        View view = this.f16349a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
