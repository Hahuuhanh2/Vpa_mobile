package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import m9.b;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: n  reason: collision with root package name */
    public static final int f6639n = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f6640o = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f6641e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6642f;

    public MaterialRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6641e == null) {
            int A = b.A(R$attr.colorControlActivated, this);
            int A2 = b.A(R$attr.colorOnSurface, this);
            int A3 = b.A(R$attr.colorSurface, this);
            this.f6641e = new ColorStateList(f6640o, new int[]{b.K(1.0f, A3, A), b.K(0.54f, A3, A2), b.K(0.38f, A3, A2), b.K(0.38f, A3, A2)});
        }
        return this.f6641e;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6642f && androidx.core.widget.b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f6642f = z10;
        if (z10) {
            androidx.core.widget.b.c(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.b.c(this, (ColorStateList) null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.radioButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f6639n
            android.content.Context r8 = p8.a.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R$styleable.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R$styleable.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = i8.c.a(r8, r9, r10)
            androidx.core.widget.b.c(r7, r8)
        L_0x0028:
            int r8 = com.google.android.material.R$styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f6642f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
