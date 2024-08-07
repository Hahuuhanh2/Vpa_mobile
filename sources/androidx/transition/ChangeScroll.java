package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import i3.p;

public class ChangeScroll extends Transition {
    public static final String[] F = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
        throw null;
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void L(p pVar) {
        pVar.f11062a.put("android:changeScroll:x", Integer.valueOf(pVar.f11063b.getScrollX()));
        pVar.f11062a.put("android:changeScroll:y", Integer.valueOf(pVar.f11063b.getScrollY()));
    }

    public final void e(p pVar) {
        L(pVar);
    }

    public final void j(p pVar) {
        L(pVar);
    }

    public final Animator n(ViewGroup viewGroup, p pVar, p pVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (pVar == null || pVar2 == null) {
            return null;
        }
        View view = pVar2.f11063b;
        int intValue = ((Integer) pVar.f11062a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) pVar2.f11062a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) pVar.f11062a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) pVar2.f11062a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        boolean z10 = i.f3497a;
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2});
        return animatorSet;
    }

    public final String[] s() {
        return F;
    }
}
