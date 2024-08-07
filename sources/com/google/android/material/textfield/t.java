package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.n0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.x;
import i8.c;
import java.util.WeakHashMap;
import w1.d0;
import w1.g;
import w1.q0;

@SuppressLint({"ViewConstructor"})
/* compiled from: StartCompoundLayout */
public final class t extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f7113a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f7114b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f7115c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f7116d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f7117e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f7118f;

    /* renamed from: n  reason: collision with root package name */
    public int f7119n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView.ScaleType f7120o;

    /* renamed from: p  reason: collision with root package name */
    public View.OnLongClickListener f7121p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7122q;

    public t(TextInputLayout textInputLayout, n0 n0Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f7113a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.design_text_input_start_icon, this, false);
        this.f7116d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f7114b = appCompatTextView;
        if (c.e(getContext())) {
            g.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f7121p;
        CharSequence charSequence = null;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        n.d(checkableImageButton, onLongClickListener);
        this.f7121p = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        n.d(checkableImageButton, (View.OnLongClickListener) null);
        int i10 = R$styleable.TextInputLayout_startIconTint;
        if (n0Var.l(i10)) {
            this.f7117e = c.b(getContext(), n0Var, i10);
        }
        int i11 = R$styleable.TextInputLayout_startIconTintMode;
        if (n0Var.l(i11)) {
            this.f7118f = x.h(n0Var.h(i11, -1), (PorterDuff.Mode) null);
        }
        int i12 = R$styleable.TextInputLayout_startIconDrawable;
        if (n0Var.l(i12)) {
            b(n0Var.e(i12));
            int i13 = R$styleable.TextInputLayout_startIconContentDescription;
            if (n0Var.l(i13) && checkableImageButton.getContentDescription() != (k10 = n0Var.k(i13))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(n0Var.a(R$styleable.TextInputLayout_startIconCheckable, true));
        }
        int d10 = n0Var.d(R$styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f7119n) {
                this.f7119n = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            int i14 = R$styleable.TextInputLayout_startIconScaleType;
            if (n0Var.l(i14)) {
                ImageView.ScaleType b10 = n.b(n0Var.h(i14, -1));
                this.f7120o = b10;
                checkableImageButton.setScaleType(b10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R$id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.g.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(n0Var.i(R$styleable.TextInputLayout_prefixTextAppearance, 0));
            int i15 = R$styleable.TextInputLayout_prefixTextColor;
            if (n0Var.l(i15)) {
                appCompatTextView.setTextColor(n0Var.b(i15));
            }
            CharSequence k11 = n0Var.k(R$styleable.TextInputLayout_prefixText);
            this.f7115c = !TextUtils.isEmpty(k11) ? k11 : charSequence;
            appCompatTextView.setText(k11);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        boolean z10;
        int i10 = 0;
        if (this.f7116d.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = g.b((ViewGroup.MarginLayoutParams) this.f7116d.getLayoutParams()) + this.f7116d.getMeasuredWidth();
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        return d0.e.f(this.f7114b) + d0.e.f(this) + i10;
    }

    public final void b(Drawable drawable) {
        this.f7116d.setImageDrawable(drawable);
        if (drawable != null) {
            n.a(this.f7113a, this.f7116d, this.f7117e, this.f7118f);
            c(true);
            n.c(this.f7113a, this.f7116d, this.f7117e);
            return;
        }
        c(false);
        CheckableImageButton checkableImageButton = this.f7116d;
        View.OnLongClickListener onLongClickListener = this.f7121p;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        n.d(checkableImageButton, onLongClickListener);
        this.f7121p = null;
        CheckableImageButton checkableImageButton2 = this.f7116d;
        checkableImageButton2.setOnLongClickListener((View.OnLongClickListener) null);
        n.d(checkableImageButton2, (View.OnLongClickListener) null);
        if (this.f7116d.getContentDescription() != null) {
            this.f7116d.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        int i10 = 0;
        if (this.f7116d.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            CheckableImageButton checkableImageButton = this.f7116d;
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            d();
            e();
        }
    }

    public final void d() {
        boolean z10;
        EditText editText = this.f7113a.f6971d;
        if (editText != null) {
            int i10 = 0;
            if (this.f7116d.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                i10 = d0.e.f(editText);
            }
            AppCompatTextView appCompatTextView = this.f7114b;
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.e.k(appCompatTextView, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i10;
        boolean z10;
        int i11 = 8;
        if (this.f7115c == null || this.f7122q) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f7116d.getVisibility() == 0 || i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f7114b.setVisibility(i10);
        this.f7113a.q();
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
