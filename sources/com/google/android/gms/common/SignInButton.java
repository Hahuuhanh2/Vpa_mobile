package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.base.R$color;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.base.R$styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.dynamic.RemoteCreator;
import h7.d;
import o1.a;
import y6.c0;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public int f5332a;

    /* renamed from: b  reason: collision with root package name */
    public int f5333b;

    /* renamed from: c  reason: collision with root package name */
    public View f5334c;

    /* renamed from: d  reason: collision with root package name */
    public View.OnClickListener f5335d;

    public SignInButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f5335d;
        if (onClickListener != null && view == this.f5334c) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i10) {
        setStyle(this.f5332a, i10);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f5334c.setEnabled(z10);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5335d = onClickListener;
        View view = this.f5334c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        setStyle(this.f5332a, this.f5333b);
    }

    public void setSize(int i10) {
        setStyle(i10, this.f5333b);
    }

    public void setStyle(int i10, int i11) {
        this.f5332a = i10;
        this.f5333b = i11;
        Context context = getContext();
        View view = this.f5334c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f5334c = c0.c(context, this.f5332a, this.f5333b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i12 = this.f5332a;
            int i13 = this.f5333b;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            Resources resources = context.getResources();
            zaaa.setTypeface(Typeface.DEFAULT_BOLD);
            zaaa.setTextSize(14.0f);
            int i14 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaaa.setMinHeight(i14);
            zaaa.setMinWidth(i14);
            int i15 = R$drawable.common_google_signin_btn_icon_dark;
            int i16 = R$drawable.common_google_signin_btn_icon_light;
            int a10 = zaaa.a(i13, i15, i16, i16);
            int i17 = R$drawable.common_google_signin_btn_text_dark;
            int i18 = R$drawable.common_google_signin_btn_text_light;
            int a11 = zaaa.a(i13, i17, i18, i18);
            if (i12 == 0 || i12 == 1) {
                a10 = a11;
            } else if (i12 != 2) {
                throw new IllegalStateException(a.m("Unknown button size: ", i12));
            }
            Drawable drawable = resources.getDrawable(a10);
            a.b.h(drawable, resources.getColorStateList(R$color.common_google_signin_btn_tint));
            a.b.i(drawable, PorterDuff.Mode.SRC_ATOP);
            zaaa.setBackgroundDrawable(drawable);
            int i19 = R$color.common_google_signin_btn_text_dark;
            int i20 = R$color.common_google_signin_btn_text_light;
            ColorStateList colorStateList = resources.getColorStateList(zaaa.a(i13, i19, i20, i20));
            j.f(colorStateList);
            zaaa.setTextColor(colorStateList);
            if (i12 == 0) {
                zaaa.setText(resources.getString(R$string.common_signin_button_text));
            } else if (i12 == 1) {
                zaaa.setText(resources.getString(R$string.common_signin_button_text_long));
            } else if (i12 == 2) {
                zaaa.setText((CharSequence) null);
            } else {
                throw new IllegalStateException(android.support.v4.media.a.m("Unknown button size: ", i12));
            }
            zaaa.setTransformationMethod((TransformationMethod) null);
            if (d.b(zaaa.getContext())) {
                zaaa.setGravity(19);
            }
            this.f5334c = zaaa;
        }
        addView(this.f5334c);
        this.f5334c.setEnabled(isEnabled());
        this.f5334c.setOnClickListener(this);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5335d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SignInButton, 0, 0);
        try {
            this.f5332a = obtainStyledAttributes.getInt(R$styleable.SignInButton_buttonSize, 0);
            this.f5333b = obtainStyledAttributes.getInt(R$styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.f5332a, this.f5333b);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Deprecated
    public void setStyle(int i10, int i11, Scope[] scopeArr) {
        setStyle(i10, i11);
    }
}
