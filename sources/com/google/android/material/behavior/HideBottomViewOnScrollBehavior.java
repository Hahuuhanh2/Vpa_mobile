package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import f8.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: q  reason: collision with root package name */
    public static final int f5720q = R$attr.motionDurationLong2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f5721r = R$attr.motionDurationMedium4;

    /* renamed from: s  reason: collision with root package name */
    public static final int f5722s = R$attr.motionEasingEmphasizedInterpolator;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<b> f5723a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public int f5724b;

    /* renamed from: c  reason: collision with root package name */
    public int f5725c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f5726d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f5727e;

    /* renamed from: f  reason: collision with root package name */
    public int f5728f = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f5729n = 2;

    /* renamed from: o  reason: collision with root package name */
    public int f5730o = 0;

    /* renamed from: p  reason: collision with root package name */
    public ViewPropertyAnimator f5731p;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f5731p = null;
        }
    }

    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        this.f5728f = v2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2.getLayoutParams()).bottomMargin;
        this.f5724b = j.c(v2.getContext(), f5720q, 225);
        this.f5725c = j.c(v2.getContext(), f5721r, 175);
        Context context = v2.getContext();
        int i11 = f5722s;
        this.f5726d = j.d(context, i11, t7.b.f14888d);
        this.f5727e = j.d(v2.getContext(), i11, t7.b.f14887c);
        return false;
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        boolean z10 = false;
        if (i10 > 0) {
            if (this.f5729n == 1) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator = this.f5731p;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f5729n = 1;
                Iterator<b> it = this.f5723a.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                w(view, this.f5728f + this.f5730o, (long) this.f5725c, this.f5727e);
            }
        } else if (i10 < 0) {
            if (this.f5729n == 2) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f5731p;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f5729n = 2;
                Iterator<b> it2 = this.f5723a.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                w(view, 0, (long) this.f5724b, this.f5726d);
            }
        }
    }

    public boolean t(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void w(V v2, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f5731p = v2.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
