package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$id;
import com.google.android.material.R$styleable;
import java.util.WeakHashMap;
import w1.d0;
import w1.g;
import w1.q0;

public class FlowLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f6363a;

    /* renamed from: b  reason: collision with root package name */
    public int f6364b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6365c;

    /* renamed from: d  reason: collision with root package name */
    public int f6366d;

    public FlowLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean a() {
        return this.f6365c;
    }

    public int getItemSpacing() {
        return this.f6364b;
    }

    public int getLineSpacing() {
        return this.f6363a;
    }

    public int getRowCount() {
        return this.f6366d;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getChildCount() == 0) {
            this.f6366d = 0;
            return;
        }
        this.f6366d = 1;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i14 = getPaddingRight();
        } else {
            i14 = getPaddingLeft();
        }
        if (z11) {
            i15 = getPaddingLeft();
        } else {
            i15 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i18 = (i12 - i10) - i15;
        int i19 = i14;
        int i20 = paddingTop;
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R$id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = g.c(marginLayoutParams);
                    i17 = g.b(marginLayoutParams);
                } else {
                    i17 = 0;
                    i16 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i19 + i16;
                if (!this.f6365c && measuredWidth > i18) {
                    i20 = this.f6363a + paddingTop;
                    this.f6366d++;
                    i19 = i14;
                }
                childAt.setTag(R$id.row_index_key, Integer.valueOf(this.f6366d - 1));
                int i22 = i19 + i16;
                int measuredWidth2 = childAt.getMeasuredWidth() + i22;
                int measuredHeight = childAt.getMeasuredHeight() + i20;
                if (z11) {
                    childAt.layout(i18 - measuredWidth2, i20, (i18 - i19) - i16, measuredHeight);
                } else {
                    childAt.layout(i22, i20, measuredWidth2, measuredHeight);
                }
                i19 += childAt.getMeasuredWidth() + i16 + i17 + this.f6364b;
                paddingTop = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i12 = size;
        } else {
            i12 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                int i19 = i11;
            } else {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin + 0;
                    i15 = marginLayoutParams.rightMargin + 0;
                } else {
                    i15 = 0;
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i14 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i16 = this.f6363a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i14 + i15 + this.f6364b + paddingLeft;
                if (i18 == getChildCount() - 1) {
                    i17 += i15;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i13 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i13 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i13) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f6364b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f6363a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f6365c = z10;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6365c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FlowLayout, 0, 0);
        this.f6363a = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_lineSpacing, 0);
        this.f6364b = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }
}
