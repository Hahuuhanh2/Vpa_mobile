package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.transition.Transition;
import i3.p;

/* compiled from: TranslationAnimationCreator */
public final class j {

    /* compiled from: TranslationAnimationCreator */
    public static class a extends AnimatorListenerAdapter implements Transition.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f3503a;

        /* renamed from: b  reason: collision with root package name */
        public final View f3504b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3505c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3506d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f3507e;

        /* renamed from: f  reason: collision with root package name */
        public float f3508f;

        /* renamed from: g  reason: collision with root package name */
        public float f3509g;

        /* renamed from: h  reason: collision with root package name */
        public final float f3510h;

        /* renamed from: i  reason: collision with root package name */
        public final float f3511i;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f3504b = view;
            this.f3503a = view2;
            this.f3505c = i10 - Math.round(view.getTranslationX());
            this.f3506d = i11 - Math.round(view.getTranslationY());
            this.f3510h = f10;
            this.f3511i = f11;
            int i12 = R$id.transition_position;
            int[] iArr = (int[]) view2.getTag(i12);
            this.f3507e = iArr;
            if (iArr != null) {
                view2.setTag(i12, (Object) null);
            }
        }

        public final void a() {
        }

        public final void b(Transition transition) {
        }

        public final void c() {
        }

        public final void d(Transition transition) {
            this.f3504b.setTranslationX(this.f3510h);
            this.f3504b.setTranslationY(this.f3511i);
            transition.z(this);
        }

        public final void e() {
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f3507e == null) {
                this.f3507e = new int[2];
            }
            this.f3507e[0] = Math.round(this.f3504b.getTranslationX() + ((float) this.f3505c));
            this.f3507e[1] = Math.round(this.f3504b.getTranslationY() + ((float) this.f3506d));
            this.f3503a.setTag(R$id.transition_position, this.f3507e);
        }

        public final void onAnimationPause(Animator animator) {
            this.f3508f = this.f3504b.getTranslationX();
            this.f3509g = this.f3504b.getTranslationY();
            this.f3504b.setTranslationX(this.f3510h);
            this.f3504b.setTranslationY(this.f3511i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f3504b.setTranslationX(this.f3508f);
            this.f3504b.setTranslationY(this.f3509g);
        }
    }

    public static ObjectAnimator a(View view, p pVar, int i10, int i11, float f10, float f11, float f12, float f13, BaseInterpolator baseInterpolator, Transition transition) {
        float f14;
        float f15;
        View view2 = view;
        p pVar2 = pVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) pVar2.f11063b.getTag(R$id.transition_position);
        if (iArr != null) {
            f14 = ((float) (iArr[0] - i10)) + translationX;
            f15 = ((float) (iArr[1] - i11)) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int round = Math.round(f14 - translationX) + i10;
        int round2 = Math.round(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f14, f12}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f15, f13})});
        a aVar = new a(view, pVar2.f11063b, round, round2, translationX, translationY);
        transition.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }
}
