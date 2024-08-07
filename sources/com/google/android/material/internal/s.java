package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import i3.p;
import java.util.HashMap;

/* compiled from: TextScale */
public final class s extends Transition {

    /* compiled from: TextScale */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f6502a;

        public a(TextView textView) {
            this.f6502a = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f6502a.setScaleX(floatValue);
            this.f6502a.setScaleY(floatValue);
        }
    }

    public final void e(p pVar) {
        View view = pVar.f11063b;
        if (view instanceof TextView) {
            pVar.f11062a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public final void j(p pVar) {
        View view = pVar.f11063b;
        if (view instanceof TextView) {
            pVar.f11062a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public final Animator n(ViewGroup viewGroup, p pVar, p pVar2) {
        float f10;
        if (pVar == null || pVar2 == null || !(pVar.f11063b instanceof TextView)) {
            return null;
        }
        View view = pVar2.f11063b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = pVar.f11062a;
        HashMap hashMap2 = pVar2.f11062a;
        float f11 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f10 = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f10 = 1.0f;
        }
        if (hashMap2.get("android:textscale:scale") != null) {
            f11 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f10 == f11) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, f11});
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
