package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.internal.v;
import java.util.ArrayList;
import java.util.Collections;
import m9.b;
import o1.a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: j0  reason: collision with root package name */
    public static final int f5643j0 = R$style.Widget_MaterialComponents_Toolbar;

    /* renamed from: k0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f5644k0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: e0  reason: collision with root package name */
    public Integer f5645e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5646f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5647g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView.ScaleType f5648h0;

    /* renamed from: i0  reason: collision with root package name */
    public Boolean f5649i0;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f5648h0;
    }

    public Integer getNavigationIconTint() {
        return this.f5645e0;
    }

    public final void k(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof f;
        if (z10) {
            ((f) menu).y();
        }
        super.k(i10);
        if (z10) {
            ((f) menu).x();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.W(this);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f5646f0 || this.f5647g0) {
            ArrayList c10 = v.c(this, getTitle());
            if (c10.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(c10, v.f6505a);
            }
            ArrayList c11 = v.c(this, getSubtitle());
            if (c11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(c11, v.f6505a);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f5646f0 && textView != null) {
                    u(textView, pair);
                }
                if (this.f5647g0 && textView2 != null) {
                    u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f5649i0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f5648h0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        b.U(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f5649i0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f5649i0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f5648h0 != scaleType) {
            this.f5648h0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f5645e0 == null)) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f5645e0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f5645e0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f5647g0 != z10) {
            this.f5647g0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f5646f0 != z10) {
            this.f5646f0 = z10;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f5643j0
            android.content.Context r8 = p8.a.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R$styleable.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R$styleable.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = com.google.android.material.R$styleable.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f5646f0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f5647g0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialToolbar_logoScaleType
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = f5644k0
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f5648h0 = r10
        L_0x004a:
            int r10 = com.google.android.material.R$styleable.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f5649i0 = r10
        L_0x005c:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 != 0) goto L_0x006a
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            goto L_0x006e
        L_0x006a:
            android.content.res.ColorStateList r9 = b8.b.d(r9)
        L_0x006e:
            if (r9 == 0) goto L_0x0087
            l8.h r10 = new l8.h
            r10.<init>()
            r10.n(r9)
            r10.k(r8)
            java.util.WeakHashMap<android.view.View, w1.q0> r8 = w1.d0.f16298a
            float r8 = w1.d0.i.i(r7)
            r10.m(r8)
            w1.d0.d.q(r7, r10)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
