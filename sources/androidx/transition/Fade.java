package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import i3.m;
import i3.p;
import i3.r;
import java.util.WeakHashMap;
import m1.i;
import w1.d0;
import w1.q0;

public class Fade extends Visibility {

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f3427a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3428b = false;

        public a(View view) {
            this.f3427a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            r.b(this.f3427a, 1.0f);
            if (this.f3428b) {
                this.f3427a.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            View view = this.f3427a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.d.h(view) && this.f3427a.getLayerType() == 0) {
                this.f3428b = true;
                this.f3427a.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade(int i10) {
        if ((i10 & -4) == 0) {
            this.F = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final Animator N(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        float f10;
        Float f11;
        float f12 = 0.0f;
        if (pVar == null || (f11 = (Float) pVar.f11062a.get("android:fade:transitionAlpha")) == null) {
            f10 = 0.0f;
        } else {
            f10 = f11.floatValue();
        }
        if (f10 != 1.0f) {
            f12 = f10;
        }
        return P(view, f12, 1.0f);
    }

    public final Animator O(ViewGroup viewGroup, View view, p pVar) {
        float f10;
        Float f11;
        r.f11068a.getClass();
        if (pVar == null || (f11 = (Float) pVar.f11062a.get("android:fade:transitionAlpha")) == null) {
            f10 = 1.0f;
        } else {
            f10 = f11.floatValue();
        }
        return P(view, f10, 0.0f);
    }

    public final ObjectAnimator P(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        r.b(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, r.f11069b, new float[]{f11});
        ofFloat.addListener(new a(view));
        a(new b(view));
        return ofFloat;
    }

    public final void j(p pVar) {
        L(pVar);
        pVar.f11062a.put("android:fade:transitionAlpha", Float.valueOf(r.f11068a.H0(pVar.f11063b)));
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11053d);
        int c10 = i.c(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.F);
        if ((c10 & -4) == 0) {
            this.F = c10;
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
