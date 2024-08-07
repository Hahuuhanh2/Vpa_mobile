package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import f8.j;
import i8.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t7.b;
import w1.d0;
import w1.q0;

/* compiled from: IndicatorViewController */
public final class q {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f7084a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7085b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7086c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f7087d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f7088e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f7089f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f7090g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f7091h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f7092i;

    /* renamed from: j  reason: collision with root package name */
    public int f7093j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f7094k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f7095l;

    /* renamed from: m  reason: collision with root package name */
    public final float f7096m;

    /* renamed from: n  reason: collision with root package name */
    public int f7097n;

    /* renamed from: o  reason: collision with root package name */
    public int f7098o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f7099p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7100q;

    /* renamed from: r  reason: collision with root package name */
    public AppCompatTextView f7101r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f7102s;

    /* renamed from: t  reason: collision with root package name */
    public int f7103t;

    /* renamed from: u  reason: collision with root package name */
    public int f7104u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f7105v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f7106w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7107x;

    /* renamed from: y  reason: collision with root package name */
    public AppCompatTextView f7108y;

    /* renamed from: z  reason: collision with root package name */
    public int f7109z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7090g = context;
        this.f7091h = textInputLayout;
        this.f7096m = (float) context.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
        int i10 = R$attr.motionDurationShort4;
        this.f7084a = j.c(context, i10, 217);
        this.f7085b = j.c(context, R$attr.motionDurationMedium4, 167);
        this.f7086c = j.c(context, i10, 167);
        int i11 = R$attr.motionEasingEmphasizedDecelerateInterpolator;
        this.f7087d = j.d(context, i11, b.f14888d);
        LinearInterpolator linearInterpolator = b.f14885a;
        this.f7088e = j.d(context, i11, linearInterpolator);
        this.f7089f = j.d(context, R$attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        boolean z10;
        if (this.f7092i == null && this.f7094k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f7090g);
            this.f7092i = linearLayout;
            linearLayout.setOrientation(0);
            this.f7091h.addView(this.f7092i, -1, -2);
            this.f7094k = new FrameLayout(this.f7090g);
            this.f7092i.addView(this.f7094k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f7091h.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f7094k.setVisibility(0);
            this.f7094k.addView(textView);
        } else {
            this.f7092i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7092i.setVisibility(0);
        this.f7093j++;
    }

    public final void b() {
        boolean z10;
        if (this.f7092i == null || this.f7091h.getEditText() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            EditText editText = this.f7091h.getEditText();
            boolean e10 = c.e(this.f7090g);
            LinearLayout linearLayout = this.f7092i;
            int i10 = R$dimen.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            int f10 = d0.e.f(editText);
            if (e10) {
                f10 = this.f7090g.getResources().getDimensionPixelSize(i10);
            }
            int i11 = R$dimen.material_helper_text_font_1_3_padding_top;
            int dimensionPixelSize = this.f7090g.getResources().getDimensionPixelSize(R$dimen.material_helper_text_default_padding_top);
            if (e10) {
                dimensionPixelSize = this.f7090g.getResources().getDimensionPixelSize(i11);
            }
            int e11 = d0.e.e(editText);
            if (e10) {
                e11 = this.f7090g.getResources().getDimensionPixelSize(i10);
            }
            d0.e.k(linearLayout, f10, dimensionPixelSize, e11, 0);
        }
    }

    public final void c() {
        Animator animator = this.f7095l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        float f10;
        int i13;
        TimeInterpolator timeInterpolator;
        boolean z13;
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i12 == i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f10});
                if (z12) {
                    i13 = this.f7085b;
                } else {
                    i13 = this.f7086c;
                }
                ofFloat.setDuration((long) i13);
                if (z12) {
                    timeInterpolator = this.f7088e;
                } else {
                    timeInterpolator = this.f7089f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 != i12 || i11 == 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    ofFloat.setStartDelay((long) this.f7086c);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f7096m, 0.0f});
                    ofFloat2.setDuration((long) this.f7084a);
                    ofFloat2.setInterpolator(this.f7087d);
                    ofFloat2.setStartDelay((long) this.f7086c);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f7101r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f7108y;
    }

    public final void f() {
        this.f7099p = null;
        c();
        if (this.f7097n == 1) {
            if (!this.f7107x || TextUtils.isEmpty(this.f7106w)) {
                this.f7098o = 0;
            } else {
                this.f7098o = 2;
            }
        }
        i(h(this.f7101r, ""), this.f7097n, this.f7098o);
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f7092i;
        if (linearLayout != null) {
            boolean z10 = true;
            if (!(i10 == 0 || i10 == 1)) {
                z10 = false;
            }
            if (!z10 || (frameLayout = this.f7094k) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i11 = this.f7093j - 1;
            this.f7093j = i11;
            LinearLayout linearLayout2 = this.f7092i;
            if (i11 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f7091h;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (!d0.g.c(textInputLayout) || !this.f7091h.isEnabled() || (this.f7098o == this.f7097n && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    public final void i(boolean z10, int i10, int i11) {
        TextView e10;
        TextView e11;
        boolean z11 = z10;
        int i12 = i10;
        int i13 = i11;
        if (i12 != i13) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f7095l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i14 = i10;
                int i15 = i11;
                d(arrayList2, this.f7107x, this.f7108y, 2, i14, i15);
                d(arrayList2, this.f7100q, this.f7101r, 1, i14, i15);
                m9.b.R(animatorSet, arrayList);
                animatorSet.addListener(new o(this, i11, e(i12), i10, e(i13)));
                animatorSet.start();
            } else if (i12 != i13) {
                if (!(i13 == 0 || (e11 = e(i13)) == null)) {
                    e11.setVisibility(0);
                    e11.setAlpha(1.0f);
                }
                if (!(i12 == 0 || (e10 = e(i12)) == null)) {
                    e10.setVisibility(4);
                    if (i12 == 1) {
                        e10.setText((CharSequence) null);
                    }
                }
                this.f7097n = i13;
            }
            this.f7091h.r();
            this.f7091h.u(z10, false);
            this.f7091h.x();
        }
    }
}
