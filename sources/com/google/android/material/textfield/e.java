package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.navigation.a;
import d.h;
import f8.j;
import t7.b;

/* compiled from: ClearTextEndIconDelegate */
public final class e extends m {

    /* renamed from: e  reason: collision with root package name */
    public final int f7021e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7022f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f7023g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f7024h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f7025i;

    /* renamed from: j  reason: collision with root package name */
    public final b f7026j = new b(this, 0);

    /* renamed from: k  reason: collision with root package name */
    public final com.google.android.material.datepicker.e f7027k = new com.google.android.material.datepicker.e(this, 1);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f7028l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f7029m;

    public e(l lVar) {
        super(lVar);
        Context context = lVar.getContext();
        int i10 = R$attr.motionDurationShort3;
        this.f7021e = j.c(context, i10, 100);
        this.f7022f = j.c(lVar.getContext(), i10, 150);
        this.f7023g = j.d(lVar.getContext(), R$attr.motionEasingLinearInterpolator, b.f14885a);
        this.f7024h = j.d(lVar.getContext(), R$attr.motionEasingEmphasizedInterpolator, b.f14888d);
    }

    public final void a() {
        if (this.f7075b.f7063w == null) {
            t(u());
        }
    }

    public final int c() {
        return R$string.clear_text_end_icon_content_description;
    }

    public final int d() {
        return R$drawable.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.f7027k;
    }

    public final View.OnClickListener f() {
        return this.f7026j;
    }

    public final View.OnFocusChangeListener g() {
        return this.f7027k;
    }

    public final void m(EditText editText) {
        this.f7025i = editText;
        this.f7074a.setEndIconVisible(u());
    }

    public final void p(boolean z10) {
        if (this.f7075b.f7063w != null) {
            t(z10);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f7024h);
        ofFloat.setDuration((long) this.f7022f);
        ofFloat.addUpdateListener(new a(this, 2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(this.f7023g);
        ofFloat2.setDuration((long) this.f7021e);
        ofFloat2.addUpdateListener(new a(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7028l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f7028l.addListener(new c(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(this.f7023g);
        ofFloat3.setDuration((long) this.f7021e);
        ofFloat3.addUpdateListener(new a(this));
        this.f7029m = ofFloat3;
        ofFloat3.addListener(new d(this));
    }

    public final void s() {
        EditText editText = this.f7025i;
        if (editText != null) {
            editText.post(new h(this, 22));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        if (this.f7075b.d() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f7028l.isRunning()) {
            this.f7029m.cancel();
            this.f7028l.start();
            if (z11) {
                this.f7028l.end();
            }
        } else if (!z10) {
            this.f7028l.cancel();
            this.f7029m.start();
            if (z11) {
                this.f7029m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f7025i;
        if (editText == null || ((!editText.hasFocus() && !this.f7077d.hasFocus()) || this.f7025i.getText().length() <= 0)) {
            return false;
        }
        return true;
    }
}
