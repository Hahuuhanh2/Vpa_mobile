package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import b8.b;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import n1.d;
import o1.a;

public class MaterialSwitch extends SwitchCompat {

    /* renamed from: q0  reason: collision with root package name */
    public static final int f6516q0 = R$style.Widget_Material3_CompoundButton_MaterialSwitch;

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f6517r0 = {R$attr.state_with_icon};

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f6518d0;

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f6519e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f6520f0;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f6521g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f6522h0;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f6523i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f6524j0;

    /* renamed from: k0  reason: collision with root package name */
    public PorterDuff.Mode f6525k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f6526l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f6527m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuff.Mode f6528n0;

    /* renamed from: o0  reason: collision with root package name */
    public int[] f6529o0;

    /* renamed from: p0  reason: collision with root package name */
    public int[] f6530p0;

    public MaterialSwitch(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void h(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f10) {
        if (drawable != null && colorStateList != null) {
            a.b.g(drawable, d.b(f10, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
        }
    }

    public final void f() {
        this.f6518d0 = b.b(this.f6518d0, this.f6523i0, getThumbTintMode());
        this.f6519e0 = b.b(this.f6519e0, this.f6524j0, this.f6525k0);
        i();
        Drawable drawable = this.f6518d0;
        Drawable drawable2 = this.f6519e0;
        int i10 = this.f6520f0;
        super.setThumbDrawable(b.a(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    public final void g() {
        this.f6521g0 = b.b(this.f6521g0, this.f6526l0, getTrackTintMode());
        this.f6522h0 = b.b(this.f6522h0, this.f6527m0, this.f6528n0);
        i();
        Drawable drawable = this.f6521g0;
        if (drawable != null && this.f6522h0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f6521g0, this.f6522h0});
        } else if (drawable == null) {
            drawable = this.f6522h0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    public Drawable getThumbDrawable() {
        return this.f6518d0;
    }

    public Drawable getThumbIconDrawable() {
        return this.f6519e0;
    }

    public int getThumbIconSize() {
        return this.f6520f0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f6524j0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f6525k0;
    }

    public ColorStateList getThumbTintList() {
        return this.f6523i0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f6522h0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f6527m0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f6528n0;
    }

    public Drawable getTrackDrawable() {
        return this.f6521g0;
    }

    public ColorStateList getTrackTintList() {
        return this.f6526l0;
    }

    public final void i() {
        if (this.f6523i0 != null || this.f6524j0 != null || this.f6526l0 != null || this.f6527m0 != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.f6523i0;
            if (colorStateList != null) {
                h(this.f6518d0, colorStateList, this.f6529o0, this.f6530p0, thumbPosition);
            }
            ColorStateList colorStateList2 = this.f6524j0;
            if (colorStateList2 != null) {
                h(this.f6519e0, colorStateList2, this.f6529o0, this.f6530p0, thumbPosition);
            }
            ColorStateList colorStateList3 = this.f6526l0;
            if (colorStateList3 != null) {
                h(this.f6521g0, colorStateList3, this.f6529o0, this.f6530p0, thumbPosition);
            }
            ColorStateList colorStateList4 = this.f6527m0;
            if (colorStateList4 != null) {
                h(this.f6522h0, colorStateList4, this.f6529o0, this.f6530p0, thumbPosition);
            }
        }
    }

    public final void invalidate() {
        i();
        super.invalidate();
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f6519e0 != null) {
            View.mergeDrawableStates(onCreateDrawableState, f6517r0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i11 = 0;
        for (int i12 : onCreateDrawableState) {
            if (i12 != 16842912) {
                iArr[i11] = i12;
                i11++;
            }
        }
        this.f6529o0 = iArr;
        this.f6530p0 = b.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f6518d0 = drawable;
        f();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f6519e0 = drawable;
        f();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(h.a.a(getContext(), i10));
    }

    public void setThumbIconSize(int i10) {
        if (this.f6520f0 != i10) {
            this.f6520f0 = i10;
            f();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f6524j0 = colorStateList;
        f();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f6525k0 = mode;
        f();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f6523i0 = colorStateList;
        f();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        f();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f6522h0 = drawable;
        g();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(h.a.a(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f6527m0 = colorStateList;
        g();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f6528n0 = mode;
        g();
    }

    public void setTrackDrawable(Drawable drawable) {
        this.f6521g0 = drawable;
        g();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f6526l0 = colorStateList;
        g();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        g();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialSwitchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialSwitch(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f6516q0
            android.content.Context r8 = p8.a.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            r8 = -1
            r7.f6520f0 = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r1 = super.getThumbDrawable()
            r7.f6518d0 = r1
            android.content.res.ColorStateList r1 = super.getThumbTintList()
            r7.f6523i0 = r1
            r1 = 0
            super.setThumbTintList(r1)
            android.graphics.drawable.Drawable r2 = super.getTrackDrawable()
            r7.f6521g0 = r2
            android.content.res.ColorStateList r2 = super.getTrackTintList()
            r7.f6526l0 = r2
            super.setTrackTintList(r1)
            int[] r2 = com.google.android.material.R$styleable.MaterialSwitch
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            androidx.appcompat.widget.n0 r9 = com.google.android.material.internal.u.e(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R$styleable.MaterialSwitch_thumbIcon
            android.graphics.drawable.Drawable r10 = r9.e(r10)
            r7.f6519e0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialSwitch_thumbIconSize
            int r10 = r9.d(r10, r8)
            r7.f6520f0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialSwitch_thumbIconTint
            android.content.res.ColorStateList r10 = r9.b(r10)
            r7.f6524j0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialSwitch_thumbIconTintMode
            int r10 = r9.h(r10, r8)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = com.google.android.material.internal.x.h(r10, r0)
            r7.f6525k0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialSwitch_trackDecoration
            android.graphics.drawable.Drawable r10 = r9.e(r10)
            r7.f6522h0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialSwitch_trackDecorationTint
            android.content.res.ColorStateList r10 = r9.b(r10)
            r7.f6527m0 = r10
            int r10 = com.google.android.material.R$styleable.MaterialSwitch_trackDecorationTintMode
            int r8 = r9.h(r10, r8)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.x.h(r8, r10)
            r7.f6528n0 = r8
            r9.n()
            r7.setEnforceSwitchWidth(r6)
            r7.f()
            r7.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
