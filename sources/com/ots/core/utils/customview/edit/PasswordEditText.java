package com.ots.core.utils.customview.edit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.ots.core.R$drawable;
import com.ots.core.R$font;
import k1.a;
import m1.e;
import sk.j;

/* compiled from: PasswordEditText.kt */
public final class PasswordEditText extends RegexEditText implements View.OnTouchListener, View.OnFocusChangeListener, TextWatcher {

    /* renamed from: o  reason: collision with root package name */
    public Drawable f8392o;

    /* renamed from: p  reason: collision with root package name */
    public final Drawable f8393p;

    /* renamed from: q  reason: collision with root package name */
    public final Drawable f8394q;

    /* renamed from: r  reason: collision with root package name */
    public View.OnTouchListener f8395r;

    /* renamed from: s  reason: collision with root package name */
    public View.OnFocusChangeListener f8396s;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PasswordEditText(Context context) {
        this(context, (AttributeSet) null, 6, 0);
        j.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasswordEditText(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 16842862 : 0);
    }

    private final void setDrawableVisible(boolean z10) {
        Drawable drawable;
        this.f8392o.setVisible(z10, false);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        j.e(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        Drawable drawable2 = compoundDrawablesRelative[0];
        Drawable drawable3 = compoundDrawablesRelative[1];
        if (z10) {
            drawable = this.f8392o;
        } else {
            drawable = null;
        }
        setCompoundDrawablesRelative(drawable2, drawable3, drawable, compoundDrawablesRelative[3]);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onFocusChange(View view, boolean z10) {
        setDrawableVisible(true);
        View.OnFocusChangeListener onFocusChangeListener = this.f8396s;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z10);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (isFocused() && charSequence != null) {
            setDrawableVisible(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if (r0 < (getWidth() - getPaddingEnd())) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r0 < (r5.f8392o.getIntrinsicWidth() + getPaddingStart())) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            sk.j.f(r6, r0)
            java.lang.String r0 = "event"
            sk.j.f(r7, r0)
            float r0 = r7.getX()
            int r0 = (int) r0
            int r1 = r5.getLayoutDirection()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002e
            if (r1 == r2) goto L_0x001a
            goto L_0x004d
        L_0x001a:
            int r1 = r5.getPaddingStart()
            if (r0 <= r1) goto L_0x004d
            int r1 = r5.getPaddingStart()
            android.graphics.drawable.Drawable r4 = r5.f8392o
            int r4 = r4.getIntrinsicWidth()
            int r4 = r4 + r1
            if (r0 >= r4) goto L_0x004d
            goto L_0x004b
        L_0x002e:
            int r1 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f8392o
            int r4 = r4.getIntrinsicWidth()
            int r1 = r1 - r4
            int r4 = r5.getPaddingEnd()
            int r1 = r1 - r4
            if (r0 <= r1) goto L_0x004d
            int r1 = r5.getWidth()
            int r4 = r5.getPaddingEnd()
            int r1 = r1 - r4
            if (r0 >= r1) goto L_0x004d
        L_0x004b:
            r0 = r2
            goto L_0x004e
        L_0x004d:
            r0 = r3
        L_0x004e:
            android.graphics.drawable.Drawable r1 = r5.f8392o
            boolean r1 = r1.isVisible()
            if (r1 == 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b6
            int r6 = r7.getAction()
            if (r6 != r2) goto L_0x00b5
            android.graphics.drawable.Drawable r6 = r5.f8392o
            android.graphics.drawable.Drawable r7 = r5.f8393p
            r0 = 3
            java.lang.String r1 = "getCompoundDrawablesRelative(...)"
            if (r6 != r7) goto L_0x0085
            android.graphics.drawable.Drawable r6 = r5.f8394q
            r5.f8392o = r6
            android.text.method.HideReturnsTransformationMethod r6 = android.text.method.HideReturnsTransformationMethod.getInstance()
            r5.setTransformationMethod(r6)
            android.graphics.drawable.Drawable[] r6 = r5.getCompoundDrawablesRelative()
            sk.j.e(r6, r1)
            r7 = r6[r3]
            r1 = r6[r2]
            android.graphics.drawable.Drawable r3 = r5.f8392o
            r6 = r6[r0]
            r5.setCompoundDrawablesRelative(r7, r1, r3, r6)
            goto L_0x00a4
        L_0x0085:
            android.graphics.drawable.Drawable r4 = r5.f8394q
            if (r6 != r4) goto L_0x00a4
            r5.f8392o = r7
            android.text.method.PasswordTransformationMethod r6 = android.text.method.PasswordTransformationMethod.getInstance()
            r5.setTransformationMethod(r6)
            android.graphics.drawable.Drawable[] r6 = r5.getCompoundDrawablesRelative()
            sk.j.e(r6, r1)
            r7 = r6[r3]
            r1 = r6[r2]
            android.graphics.drawable.Drawable r3 = r5.f8392o
            r6 = r6[r0]
            r5.setCompoundDrawablesRelative(r7, r1, r3, r6)
        L_0x00a4:
            android.text.Editable r6 = r5.getText()
            if (r6 == 0) goto L_0x00b5
            java.lang.String r6 = r6.toString()
            int r6 = r6.length()
            r5.setSelection(r6)
        L_0x00b5:
            return r2
        L_0x00b6:
            android.view.View$OnTouchListener r0 = r5.f8395r
            if (r0 == 0) goto L_0x00c1
            boolean r6 = r0.onTouch(r6, r7)
            if (r6 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r2 = r3
        L_0x00c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ots.core.utils.customview.edit.PasswordEditText.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f8396s = onFocusChangeListener;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f8395r = onTouchListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasswordEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        Drawable drawable = a.getDrawable(context, R$drawable.password_off_ic);
        j.c(drawable);
        this.f8393p = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Drawable drawable2 = a.getDrawable(context, R$drawable.password_on_ic);
        j.c(drawable2);
        this.f8394q = drawable2;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f8392o = drawable;
        setDrawableVisible(true);
        setInputType(128 | getInputType());
        if (getInputRegex() == null) {
            setInputRegex("\\S+");
        }
        super.setOnTouchListener(this);
        super.setOnFocusChangeListener(this);
        addTextChangedListener(this);
        setTypeface(e.a(context, R$font.sf_pro_display));
    }
}
