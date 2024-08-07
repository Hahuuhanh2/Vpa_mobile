package he;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import fe.d;
import w1.d0;
import w1.q0;

/* compiled from: BaseAnimationAdapter */
public abstract class b extends RecyclerView.e<RecyclerView.a0> {

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.e<RecyclerView.a0> f10766d;

    /* renamed from: e  reason: collision with root package name */
    public int f10767e = 250;

    /* renamed from: f  reason: collision with root package name */
    public LinearInterpolator f10768f = new LinearInterpolator();

    /* renamed from: n  reason: collision with root package name */
    public int f10769n = -1;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10770o = true;

    public b(d dVar) {
        this.f10766d = dVar;
    }

    public final int c() {
        return this.f10766d.c();
    }

    public final long d(int i10) {
        return this.f10766d.d(i10);
    }

    public final int e(int i10) {
        return this.f10766d.e(i10);
    }

    public final void h(RecyclerView recyclerView) {
        this.f10766d.h(recyclerView);
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        RecyclerView recyclerView;
        RecyclerView.e<? extends RecyclerView.a0> adapter;
        int K;
        this.f10766d.i(a0Var, i10);
        int i11 = -1;
        if (!(a0Var.f3031s == null || (recyclerView = a0Var.f3030r) == null || (adapter = recyclerView.getAdapter()) == null || (K = a0Var.f3030r.K(a0Var)) == -1 || a0Var.f3031s != adapter)) {
            i11 = K;
        }
        if (!this.f10770o || i11 > this.f10769n) {
            for (Animator animator : t(a0Var.f3013a)) {
                animator.setDuration((long) this.f10767e).start();
                animator.setInterpolator(this.f10768f);
            }
            this.f10769n = i11;
            return;
        }
        View view = a0Var.f3013a;
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY((float) (view.getMeasuredHeight() / 2));
        view.setPivotX((float) (view.getMeasuredWidth() / 2));
        q0 a10 = d0.a(view);
        View view2 = a10.f16349a.get();
        if (view2 != null) {
            view2.animate().setInterpolator((TimeInterpolator) null);
        }
        View view3 = a10.f16349a.get();
        if (view3 != null) {
            view3.animate().setStartDelay(0);
        }
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        return this.f10766d.k(recyclerView, i10);
    }

    public final void l(RecyclerView recyclerView) {
        this.f10766d.l(recyclerView);
    }

    public final void n(RecyclerView.a0 a0Var) {
        this.f10766d.n(a0Var);
    }

    public final void o(RecyclerView.a0 a0Var) {
        this.f10766d.o(a0Var);
    }

    public final void p(RecyclerView.a0 a0Var) {
        this.f10766d.p(a0Var);
    }

    public final void q(RecyclerView.g gVar) {
        super.q(gVar);
        this.f10766d.q(gVar);
    }

    public final void s(RecyclerView.g gVar) {
        super.s(gVar);
        this.f10766d.s(gVar);
    }

    public abstract Animator[] t(View view);
}
