package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import m9.b;
import t7.i;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final i f7173c = new i(75);

    /* renamed from: d  reason: collision with root package name */
    public final i f7174d = new i(0);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7175a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7176b;

        public a(boolean z10, View view) {
            this.f7175a = z10;
            this.f7176b = view;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f7175a) {
                this.f7176b.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f7175a) {
                this.f7176b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public final boolean f(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public final AnimatorSet x(View view, View view2, boolean z10, boolean z11) {
        i iVar;
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z10) {
            iVar = this.f7173c;
        } else {
            iVar = this.f7174d;
        }
        if (z10) {
            if (!z11) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        iVar.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        b.R(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
