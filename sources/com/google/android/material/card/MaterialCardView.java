package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import l8.h;
import l8.m;
import l8.q;
import m9.b;
import o1.a;
import w7.c;

public class MaterialCardView extends CardView implements Checkable, q {

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f5935s = {16842911};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f5936t = {16842912};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f5937u = {R$attr.state_dragged};

    /* renamed from: v  reason: collision with root package name */
    public static final int f5938v = R$style.Widget_MaterialComponents_CardView;

    /* renamed from: o  reason: collision with root package name */
    public final c f5939o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5940p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5941q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5942r;

    public interface a {
        void a();
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f5939o.f16690c.getBounds());
        return rectF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r8.f5939o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L_0x002a
            w7.c r0 = r8.f5939o
            android.graphics.drawable.RippleDrawable r1 = r0.f16702o
            if (r1 == 0) goto L_0x002a
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.RippleDrawable r3 = r0.f16702o
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + -1
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.RippleDrawable r0 = r0.f16702o
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.f():void");
    }

    public final void g(int i10, int i11, int i12, int i13) {
        super.setContentPadding(i10, i11, i12, i13);
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f5939o.f16690c.f12778a.f12800c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f5939o.f16691d.f12778a.f12800c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f5939o.f16697j;
    }

    public int getCheckedIconGravity() {
        return this.f5939o.f16694g;
    }

    public int getCheckedIconMargin() {
        return this.f5939o.f16692e;
    }

    public int getCheckedIconSize() {
        return this.f5939o.f16693f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f5939o.f16699l;
    }

    public int getContentPaddingBottom() {
        return this.f5939o.f16689b.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f5939o.f16689b.left;
    }

    public int getContentPaddingRight() {
        return this.f5939o.f16689b.right;
    }

    public int getContentPaddingTop() {
        return this.f5939o.f16689b.top;
    }

    public float getProgress() {
        return this.f5939o.f16690c.f12778a.f12807j;
    }

    public float getRadius() {
        return this.f5939o.f16690c.j();
    }

    public ColorStateList getRippleColor() {
        return this.f5939o.f16698k;
    }

    public m getShapeAppearanceModel() {
        return this.f5939o.f16700m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f5939o.f16701n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f5939o.f16701n;
    }

    public int getStrokeWidth() {
        return this.f5939o.f16695h;
    }

    public final boolean isChecked() {
        return this.f5941q;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5939o.k();
        b.X(this, this.f5939o.f16690c);
    }

    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.f5939o;
        if (cVar == null || !cVar.f16706s) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f5935s);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5936t);
        }
        if (this.f5942r) {
            View.mergeDrawableStates(onCreateDrawableState, f5937u);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f5939o;
        if (cVar == null || !cVar.f16706s) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f5939o.e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f5940p) {
            c cVar = this.f5939o;
            if (!cVar.f16705r) {
                cVar.f16705r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i10) {
        c cVar = this.f5939o;
        cVar.f16690c.n(ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.f5939o;
        cVar.f16690c.m(cVar.f16688a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        h hVar = this.f5939o.f16691d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hVar.n(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f5939o.f16706s = z10;
    }

    public void setChecked(boolean z10) {
        if (this.f5941q != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f5939o.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.f5939o;
        if (cVar.f16694g != i10) {
            cVar.f16694g = i10;
            cVar.e(cVar.f16688a.getMeasuredWidth(), cVar.f16688a.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f5939o.f16692e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f5939o.f16692e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f5939o.g(h.a.a(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f5939o.f16693f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f5939o.f16693f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f5939o;
        cVar.f16699l = colorStateList;
        Drawable drawable = cVar.f16697j;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
        }
    }

    public void setClickable(boolean z10) {
        super.setClickable(z10);
        c cVar = this.f5939o;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        c cVar = this.f5939o;
        cVar.f16689b.set(i10, i11, i12, i13);
        cVar.l();
    }

    public void setDragged(boolean z10) {
        if (this.f5942r != z10) {
            this.f5942r = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f5939o.m();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f5939o.m();
        this.f5939o.l();
    }

    public void setProgress(float f10) {
        c cVar = this.f5939o;
        cVar.f16690c.o(f10);
        h hVar = cVar.f16691d;
        if (hVar != null) {
            hVar.o(f10);
        }
        h hVar2 = cVar.f16704q;
        if (hVar2 != null) {
            hVar2.o(f10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r3 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRadius(float r3) {
        /*
            r2 = this;
            super.setRadius(r3)
            w7.c r0 = r2.f5939o
            l8.m r1 = r0.f16700m
            l8.m r3 = r1.g(r3)
            r0.h(r3)
            android.graphics.drawable.Drawable r3 = r0.f16696i
            r3.invalidateSelf()
            boolean r3 = r0.i()
            if (r3 != 0) goto L_0x002e
            com.google.android.material.card.MaterialCardView r3 = r0.f16688a
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L_0x002b
            l8.h r3 = r0.f16690c
            boolean r3 = r3.l()
            if (r3 != 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0031
        L_0x002e:
            r0.l()
        L_0x0031:
            boolean r3 = r0.i()
            if (r3 == 0) goto L_0x003a
            r0.m()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f5939o;
        cVar.f16698k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f16702o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        c cVar = this.f5939o;
        ColorStateList colorStateList = k1.a.getColorStateList(getContext(), i10);
        cVar.f16698k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f16702o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setShapeAppearanceModel(m mVar) {
        setClipToOutline(mVar.f(getBoundsAsRectF()));
        this.f5939o.h(mVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        c cVar = this.f5939o;
        if (i10 != cVar.f16695h) {
            cVar.f16695h = i10;
            h hVar = cVar.f16691d;
            ColorStateList colorStateList = cVar.f16701n;
            hVar.t((float) i10);
            hVar.s(colorStateList);
        }
        invalidate();
    }

    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f5939o.m();
        this.f5939o.l();
    }

    public final void toggle() {
        boolean z10;
        c cVar = this.f5939o;
        if (cVar == null || !cVar.f16706s) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && isEnabled()) {
            this.f5941q = !this.f5941q;
            refreshDrawableState();
            f();
            this.f5939o.f(this.f5941q, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f5939o;
        if (cVar.f16701n != colorStateList) {
            cVar.f16701n = colorStateList;
            h hVar = cVar.f16691d;
            hVar.t((float) cVar.f16695h);
            hVar.s(colorStateList);
        }
        invalidate();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f5938v
            android.content.Context r7 = p8.a.a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            r7 = 0
            r6.f5941q = r7
            r6.f5942r = r7
            r0 = 1
            r6.f5940p = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R$styleable.MaterialCardView
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r0 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            w7.c r1 = new w7.c
            r1.<init>(r6, r8, r9)
            r6.f5939o = r1
            android.content.res.ColorStateList r8 = super.getCardBackgroundColor()
            l8.h r9 = r1.f16690c
            r9.n(r8)
            int r8 = super.getContentPaddingLeft()
            int r9 = super.getContentPaddingTop()
            int r2 = super.getContentPaddingRight()
            int r3 = super.getContentPaddingBottom()
            android.graphics.Rect r4 = r1.f16689b
            r4.set(r8, r9, r2, r3)
            r1.l()
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            android.content.Context r8 = r8.getContext()
            int r9 = com.google.android.material.R$styleable.MaterialCardView_strokeColor
            android.content.res.ColorStateList r8 = i8.c.a(r8, r0, r9)
            r1.f16701n = r8
            if (r8 != 0) goto L_0x005e
            r8 = -1
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r1.f16701n = r8
        L_0x005e:
            int r8 = com.google.android.material.R$styleable.MaterialCardView_strokeWidth
            int r8 = r0.getDimensionPixelSize(r8, r7)
            r1.f16695h = r8
            int r8 = com.google.android.material.R$styleable.MaterialCardView_android_checkable
            boolean r8 = r0.getBoolean(r8, r7)
            r1.f16706s = r8
            com.google.android.material.card.MaterialCardView r9 = r1.f16688a
            r9.setLongClickable(r8)
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            android.content.Context r8 = r8.getContext()
            int r9 = com.google.android.material.R$styleable.MaterialCardView_checkedIconTint
            android.content.res.ColorStateList r8 = i8.c.a(r8, r0, r9)
            r1.f16699l = r8
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            android.content.Context r8 = r8.getContext()
            int r9 = com.google.android.material.R$styleable.MaterialCardView_checkedIcon
            android.graphics.drawable.Drawable r8 = i8.c.d(r8, r0, r9)
            r1.g(r8)
            int r8 = com.google.android.material.R$styleable.MaterialCardView_checkedIconSize
            int r8 = r0.getDimensionPixelSize(r8, r7)
            r1.f16693f = r8
            int r8 = com.google.android.material.R$styleable.MaterialCardView_checkedIconMargin
            int r8 = r0.getDimensionPixelSize(r8, r7)
            r1.f16692e = r8
            int r8 = com.google.android.material.R$styleable.MaterialCardView_checkedIconGravity
            r9 = 8388661(0x800035, float:1.1755018E-38)
            int r8 = r0.getInteger(r8, r9)
            r1.f16694g = r8
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            android.content.Context r8 = r8.getContext()
            int r9 = com.google.android.material.R$styleable.MaterialCardView_rippleColor
            android.content.res.ColorStateList r8 = i8.c.a(r8, r0, r9)
            r1.f16698k = r8
            if (r8 != 0) goto L_0x00c9
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            int r9 = com.google.android.material.R$attr.colorControlHighlight
            int r8 = m9.b.A(r9, r8)
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r1.f16698k = r8
        L_0x00c9:
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            android.content.Context r8 = r8.getContext()
            int r9 = com.google.android.material.R$styleable.MaterialCardView_cardForegroundColor
            android.content.res.ColorStateList r8 = i8.c.a(r8, r0, r9)
            l8.h r9 = r1.f16691d
            if (r8 != 0) goto L_0x00dd
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r7)
        L_0x00dd:
            r9.n(r8)
            android.graphics.drawable.RippleDrawable r7 = r1.f16702o
            if (r7 == 0) goto L_0x00e9
            android.content.res.ColorStateList r8 = r1.f16698k
            r7.setColor(r8)
        L_0x00e9:
            l8.h r7 = r1.f16690c
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            float r8 = r8.getCardElevation()
            r7.m(r8)
            l8.h r7 = r1.f16691d
            int r8 = r1.f16695h
            float r8 = (float) r8
            android.content.res.ColorStateList r9 = r1.f16701n
            r7.t(r8)
            r7.s(r9)
            com.google.android.material.card.MaterialCardView r7 = r1.f16688a
            l8.h r8 = r1.f16690c
            w7.b r8 = r1.d(r8)
            r7.setBackgroundInternal(r8)
            boolean r7 = r1.j()
            if (r7 == 0) goto L_0x0117
            android.graphics.drawable.LayerDrawable r7 = r1.c()
            goto L_0x0119
        L_0x0117:
            l8.h r7 = r1.f16691d
        L_0x0119:
            r1.f16696i = r7
            com.google.android.material.card.MaterialCardView r8 = r1.f16688a
            w7.b r7 = r1.d(r7)
            r8.setForeground(r7)
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f5939o.f16690c.n(colorStateList);
    }
}
