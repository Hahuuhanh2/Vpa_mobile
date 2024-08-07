package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import java.util.WeakHashMap;
import k1.a;
import l8.h;
import w1.d0;
import w1.q0;

public class MaterialDivider extends View {

    /* renamed from: f  reason: collision with root package name */
    public static final int f6231f = R$style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a  reason: collision with root package name */
    public final h f6232a;

    /* renamed from: b  reason: collision with root package name */
    public int f6233b;

    /* renamed from: c  reason: collision with root package name */
    public int f6234c;

    /* renamed from: d  reason: collision with root package name */
    public int f6235d;

    /* renamed from: e  reason: collision with root package name */
    public int f6236e;

    public MaterialDivider(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getDividerColor() {
        return this.f6234c;
    }

    public int getDividerInsetEnd() {
        return this.f6236e;
    }

    public int getDividerInsetStart() {
        return this.f6235d;
    }

    public int getDividerThickness() {
        return this.f6233b;
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        super.onDraw(canvas);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        boolean z10 = true;
        if (d0.e.d(this) != 1) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f6236e;
        } else {
            i10 = this.f6235d;
        }
        if (z10) {
            i12 = getWidth();
            i11 = this.f6235d;
        } else {
            i12 = getWidth();
            i11 = this.f6236e;
        }
        this.f6232a.setBounds(i10, 0, i12 - i11, getBottom() - getTop());
        this.f6232a.draw(canvas);
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f6233b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f6234c != i10) {
            this.f6234c = i10;
            this.f6232a.n(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(a.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f6236e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f6235d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f6233b != i10) {
            this.f6233b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialDividerStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialDivider(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f6231f
            android.content.Context r8 = p8.a.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            l8.h r0 = new l8.h
            r0.<init>()
            r7.f6232a = r0
            int[] r2 = com.google.android.material.R$styleable.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R$styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.R$dimen.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.f6233b = r10
            int r10 = com.google.android.material.R$styleable.MaterialDivider_dividerInsetStart
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f6235d = r10
            int r10 = com.google.android.material.R$styleable.MaterialDivider_dividerInsetEnd
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f6236e = r10
            int r10 = com.google.android.material.R$styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = i8.c.a(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
