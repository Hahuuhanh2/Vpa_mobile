package e8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.R$color;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.g;
import java.util.ArrayList;
import l8.h;
import l8.m;

/* compiled from: FloatingActionButtonImplLollipop */
public final class f extends g {
    public StateListAnimator N;

    /* compiled from: FloatingActionButtonImplLollipop */
    public static class a extends h {
        public a(m mVar) {
            super(mVar);
        }

        public final boolean isStateful() {
            return true;
        }
    }

    public f(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    public final float e() {
        return this.f6314v.getElevation();
    }

    public final void f(Rect rect) {
        boolean z10;
        if (FloatingActionButton.this.f6267s) {
            super.f(rect);
            return;
        }
        if (!this.f6298f || this.f6314v.getSizeDimension() >= this.f6303k) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int sizeDimension = (this.f6303k - this.f6314v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        h s10 = s();
        this.f6294b = s10;
        s10.setTintList(colorStateList);
        if (mode != null) {
            this.f6294b.setTintMode(mode);
        }
        this.f6294b.k(this.f6314v.getContext());
        if (i10 > 0) {
            Context context = this.f6314v.getContext();
            m mVar = this.f6293a;
            mVar.getClass();
            b bVar = new b(mVar);
            int color = k1.a.getColor(context, R$color.design_fab_stroke_top_outer_color);
            int color2 = k1.a.getColor(context, R$color.design_fab_stroke_top_inner_color);
            int color3 = k1.a.getColor(context, R$color.design_fab_stroke_end_inner_color);
            int color4 = k1.a.getColor(context, R$color.design_fab_stroke_end_outer_color);
            bVar.f9253i = color;
            bVar.f9254j = color2;
            bVar.f9255k = color3;
            bVar.f9256l = color4;
            float f10 = (float) i10;
            if (bVar.f9252h != f10) {
                bVar.f9252h = f10;
                bVar.f9246b.setStrokeWidth(f10 * 1.3333f);
                bVar.f9258n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList != null) {
                bVar.f9257m = colorStateList.getColorForState(bVar.getState(), bVar.f9257m);
            }
            bVar.f9260p = colorStateList;
            bVar.f9258n = true;
            bVar.invalidateSelf();
            this.f6296d = bVar;
            b bVar2 = this.f6296d;
            bVar2.getClass();
            h hVar = this.f6294b;
            hVar.getClass();
            drawable = new LayerDrawable(new Drawable[]{bVar2, hVar});
        } else {
            this.f6296d = null;
            drawable = this.f6294b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(j8.a.c(colorStateList2), drawable, (Drawable) null);
        this.f6295c = rippleDrawable;
        this.f6297e = rippleDrawable;
    }

    public final void h() {
    }

    public final void i() {
        q();
    }

    public final void j(int[] iArr) {
    }

    public final void k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (this.f6314v.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(g.H, r(f10, f12));
            stateListAnimator.addState(g.I, r(f10, f11));
            stateListAnimator.addState(g.J, r(f10, f11));
            stateListAnimator.addState(g.K, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f6314v, "elevation", new float[]{f10}).setDuration(0));
            if (i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f6314v;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f6314v, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(g.C);
            stateListAnimator.addState(g.L, animatorSet);
            stateListAnimator.addState(g.M, r(0.0f, 0.0f));
            this.N = stateListAnimator;
            this.f6314v.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f6295c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(j8.a.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    public final boolean o() {
        boolean z10;
        if (!FloatingActionButton.this.f6267s) {
            if (!this.f6298f || this.f6314v.getSizeDimension() >= this.f6303k) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }

    public final void p() {
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f6314v, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f6314v, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(g.C);
        return animatorSet;
    }

    public final h s() {
        m mVar = this.f6293a;
        mVar.getClass();
        return new a(mVar);
    }
}
