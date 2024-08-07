package r8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* compiled from: ExpandableTransformationBehavior */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f14520a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f14520a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f14520a.f7161b = null;
    }
}
