package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.o;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.chip.a;
import com.google.android.material.internal.g;
import com.google.android.material.internal.r;
import i8.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import l8.m;
import l8.q;
import o1.a;
import t7.h;
import w1.d0;
import w1.q0;
import x1.f;

public class Chip extends AppCompatCheckBox implements a.C0063a, q, g<Chip> {
    public static final int E = R$style.Widget_MaterialComponents_Chip_Action;
    public static final Rect F = new Rect();
    public static final int[] G = {16842913};
    public static final int[] H = {16842911};
    public boolean A;
    public final Rect B;
    public final RectF C;
    public final a D;

    /* renamed from: e  reason: collision with root package name */
    public a f6004e;

    /* renamed from: f  reason: collision with root package name */
    public InsetDrawable f6005f;

    /* renamed from: n  reason: collision with root package name */
    public RippleDrawable f6006n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnClickListener f6007o;

    /* renamed from: p  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f6008p;

    /* renamed from: q  reason: collision with root package name */
    public g.a<Chip> f6009q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6010r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6011s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6012t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6013u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6014v;

    /* renamed from: w  reason: collision with root package name */
    public int f6015w;

    /* renamed from: x  reason: collision with root package name */
    public int f6016x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f6017y;

    /* renamed from: z  reason: collision with root package name */
    public final b f6018z;

    public class a extends o {
        public a() {
        }

        public final void D(int i10) {
        }

        public final void E(Typeface typeface, boolean z10) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            a aVar = chip.f6004e;
            if (aVar.L0) {
                charSequence = aVar.M;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends c2.a {
        public b(Chip chip) {
            super(chip);
        }

        public final int n(float f10, float f11) {
            Chip chip = Chip.this;
            int i10 = Chip.E;
            if (!chip.e() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) {
                return 0;
            }
            return 1;
        }

        public final void o(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Chip chip = Chip.this;
            int i10 = Chip.E;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                a aVar = chip2.f6004e;
                if (aVar != null && aVar.S) {
                    z10 = true;
                }
                if (z10 && chip2.f6007o != null) {
                    arrayList.add(1);
                }
            }
        }

        public final boolean s(int i10, int i11, Bundle bundle) {
            boolean z10 = false;
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f6007o;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z10 = true;
                    }
                    if (chip.A) {
                        chip.f6018z.x(1, 1);
                    }
                }
            }
            return z10;
        }

        public final void t(f fVar) {
            boolean z10;
            a aVar = Chip.this.f6004e;
            if (aVar == null || !aVar.Y) {
                z10 = false;
            } else {
                z10 = true;
            }
            fVar.f16862a.setCheckable(z10);
            fVar.f16862a.setClickable(Chip.this.isClickable());
            fVar.i(Chip.this.getAccessibilityClassName());
            fVar.n(Chip.this.getText());
        }

        public final void u(int i10, f fVar) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    fVar.k(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = R$string.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    fVar.k(context.getString(i11, objArr).trim());
                }
                fVar.f16862a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                fVar.b(f.a.f16867g);
                fVar.f16862a.setEnabled(Chip.this.isEnabled());
                return;
            }
            fVar.k(charSequence);
            fVar.f16862a.setBoundsInParent(Chip.F);
        }

        public final void v(int i10, boolean z10) {
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.f6013u = z10;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.C.setEmpty();
        if (e() && this.f6007o != null) {
            a aVar = this.f6004e;
            RectF rectF = this.C;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.c0()) {
                float f10 = aVar.f6043l0 + aVar.f6042k0 + aVar.W + aVar.f6041j0 + aVar.f6040i0;
                if (a.c.a(aVar) == 0) {
                    float f11 = (float) bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = (float) bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.C;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.B.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.B;
    }

    private d getTextAppearance() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6050s0.f6500g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f6012t != z10) {
            this.f6012t = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f6011s != z10) {
            this.f6011s = z10;
            refreshDrawableState();
        }
    }

    public final void a() {
        d(this.f6016x);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i10) {
        int i11;
        this.f6016x = i10;
        int i12 = 0;
        if (!this.f6014v) {
            InsetDrawable insetDrawable = this.f6005f;
            if (insetDrawable == null) {
                g();
            } else if (insetDrawable != null) {
                this.f6005f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                g();
            }
        } else {
            int max = Math.max(0, i10 - ((int) this.f6004e.H));
            int max2 = Math.max(0, i10 - this.f6004e.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i11 = max2 / 2;
                } else {
                    i11 = 0;
                }
                if (max > 0) {
                    i12 = max / 2;
                }
                int i13 = i12;
                if (this.f6005f != null) {
                    Rect rect = new Rect();
                    this.f6005f.getPadding(rect);
                    if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                        g();
                        return;
                    }
                }
                if (getMinHeight() != i10) {
                    setMinHeight(i10);
                }
                if (getMinWidth() != i10) {
                    setMinWidth(i10);
                }
                this.f6005f = new InsetDrawable(this.f6004e, i11, i13, i11, i13);
                g();
                return;
            }
            InsetDrawable insetDrawable2 = this.f6005f;
            if (insetDrawable2 == null) {
                g();
            } else if (insetDrawable2 != null) {
                this.f6005f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                g();
            }
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.A) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.f6018z.m(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.A) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f6018z;
        bVar.getClass();
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i12 = 0;
                                while (i10 < repeatCount && bVar.q(i11, (Rect) null)) {
                                    i10++;
                                    i12 = 1;
                                }
                                i10 = i12;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i13 = bVar.f4522l;
                    if (i13 != Integer.MIN_VALUE) {
                        bVar.s(i13, 16, (Bundle) null);
                    }
                    i10 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i10 = bVar.q(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i10 = bVar.q(1, (Rect) null);
            }
        }
        if (i10 == 0 || this.f6018z.f4522l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        a aVar = this.f6004e;
        boolean z10 = false;
        if (aVar != null && a.D(aVar.T)) {
            a aVar2 = this.f6004e;
            int isEnabled = isEnabled();
            if (this.f6013u) {
                isEnabled++;
            }
            if (this.f6012t) {
                isEnabled++;
            }
            if (this.f6011s) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f6013u) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f6012t) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f6011s) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(aVar2.G0, iArr)) {
                aVar2.G0 = iArr;
                if (aVar2.c0()) {
                    z10 = aVar2.F(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final boolean e() {
        Drawable drawable;
        a aVar = this.f6004e;
        if (aVar != null) {
            Drawable drawable2 = aVar.T;
            if (drawable2 != null) {
                drawable = o1.a.d(drawable2);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        boolean z10;
        if (e()) {
            a aVar = this.f6004e;
            if (aVar == null || !aVar.S) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && this.f6007o != null) {
                d0.o(this, this.f6018z);
                this.A = true;
                return;
            }
        }
        d0.o(this, (w1.a) null);
        this.A = false;
    }

    public final void g() {
        this.f6006n = new RippleDrawable(j8.a.c(this.f6004e.L), getBackgroundDrawable(), (Drawable) null);
        a aVar = this.f6004e;
        if (aVar.H0) {
            aVar.H0 = false;
            aVar.I0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f6006n;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(this, rippleDrawable);
        h();
    }

    public CharSequence getAccessibilityClassName() {
        boolean z10;
        if (!TextUtils.isEmpty(this.f6017y)) {
            return this.f6017y;
        }
        a aVar = this.f6004e;
        if (aVar == null || !aVar.Y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f6025o.f6386d) {
                return "android.widget.Button";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6005f;
        if (insetDrawable == null) {
            return this.f6004e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6032a0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6033b0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.G;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.B());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6004e;
    }

    public float getChipEndPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6043l0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f6004e;
        if (aVar == null || (drawable = aVar.O) == null) {
            return null;
        }
        return o1.a.d(drawable);
    }

    public float getChipIconSize() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.Q;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.P;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.H;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6036e0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.J;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.K;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        a aVar = this.f6004e;
        if (aVar == null || (drawable = aVar.T) == null) {
            return null;
        }
        return o1.a.d(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6042k0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.W;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6041j0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.K0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.A) {
            b bVar = this.f6018z;
            if (bVar.f4522l == 1 || bVar.f4521k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public h getHideMotionSpec() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6035d0;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6038g0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6037f0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.L;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.f6004e.f12778a.f12798a;
    }

    public h getShowMotionSpec() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6034c0;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6040i0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f6004e;
        if (aVar != null) {
            return aVar.f6039h0;
        }
        return 0.0f;
    }

    public final void h() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f6004e) != null) {
            int A2 = (int) (aVar.A() + aVar.f6043l0 + aVar.f6040i0);
            a aVar2 = this.f6004e;
            int z10 = (int) (aVar2.z() + aVar2.f6036e0 + aVar2.f6039h0);
            if (this.f6005f != null) {
                Rect rect = new Rect();
                this.f6005f.getPadding(rect);
                z10 += rect.left;
                A2 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.e.k(this, z10, paddingTop, A2, paddingBottom);
        }
    }

    public final void i() {
        TextPaint paint = getPaint();
        a aVar = this.f6004e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.D);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.b.X(this, this.f6004e);
    }

    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        a aVar = this.f6004e;
        if (aVar == null || !aVar.Y) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, H);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.A) {
            b bVar = this.f6018z;
            int i11 = bVar.f4522l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z10) {
                bVar.q(i10, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        boolean z11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        a aVar = this.f6004e;
        if (aVar == null || !aVar.Y) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i11 = -1;
            if (chipGroup.f6365c) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= chipGroup.getChildCount()) {
                        i13 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i12);
                    if (childAt instanceof Chip) {
                        if (chipGroup.getChildAt(i12).getVisibility() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    i12++;
                }
                i10 = i13;
            } else {
                i10 = -1;
            }
            Object tag = getTag(R$id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.g.a(i11, 1, i10, 1, false, isChecked()).f16881a);
        }
    }

    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f6015w != i10) {
            this.f6015w = i10;
            h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0049
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0044
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f6011s
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x004e
            r5.setCloseIconPressed(r3)
            goto L_0x004e
        L_0x002b:
            boolean r0 = r5.f6011s
            if (r0 == 0) goto L_0x0044
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f6007o
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            boolean r0 = r5.A
            if (r0 == 0) goto L_0x0042
            com.google.android.material.chip.Chip$b r0 = r5.f6018z
            r0.x(r2, r2)
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            r5.setCloseIconPressed(r3)
            goto L_0x0051
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r2)
        L_0x004e:
            r0 = r2
            goto L_0x0051
        L_0x0050:
            r0 = r3
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = r3
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f6017y = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6006n) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i10) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6006n) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.G(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.G(aVar.f6044m0.getResources().getBoolean(i10));
        }
    }

    public void setChecked(boolean z10) {
        a aVar = this.f6004e;
        if (aVar == null) {
            this.f6010r = z10;
        } else if (aVar.Y) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.H(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.H(h.a.a(aVar.f6044m0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.I(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.I(k1.a.getColorStateList(aVar.f6044m0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.J(aVar.f6044m0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f6004e;
        if (aVar != null && aVar.G != colorStateList) {
            aVar.G = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateList;
        a aVar = this.f6004e;
        if (aVar != null && aVar.G != (colorStateList = k1.a.getColorStateList(aVar.f6044m0, i10))) {
            aVar.G = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.K(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.K(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f6004e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.J0 = new WeakReference<>((Object) null);
            }
            this.f6004e = aVar;
            aVar.L0 = false;
            aVar.J0 = new WeakReference<>(this);
            d(this.f6016x);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null && aVar.f6043l0 != f10) {
            aVar.f6043l0 = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            float dimension = aVar.f6044m0.getResources().getDimension(i10);
            if (aVar.f6043l0 != dimension) {
                aVar.f6043l0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.L(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.L(h.a.a(aVar.f6044m0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.M(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.M(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.N(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.N(k1.a.getColorStateList(aVar.f6044m0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.O(aVar.f6044m0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f6004e;
        if (aVar != null && aVar.H != f10) {
            aVar.H = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            float dimension = aVar.f6044m0.getResources().getDimension(i10);
            if (aVar.H != dimension) {
                aVar.H = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null && aVar.f6036e0 != f10) {
            aVar.f6036e0 = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            float dimension = aVar.f6044m0.getResources().getDimension(i10);
            if (aVar.f6036e0 != dimension) {
                aVar.f6036e0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.P(k1.a.getColorStateList(aVar.f6044m0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.Q(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.Q(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.R(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f6004e;
        if (aVar != null && aVar.X != charSequence) {
            u1.a c10 = u1.a.c();
            aVar.X = c10.d(charSequence, c10.f15045c);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.S(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.R(h.a.a(aVar.f6044m0, i10));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.T(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.T(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.U(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.U(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.V(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.V(k1.a.getColorStateList(aVar.f6044m0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.m(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6004e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f6004e;
                if (aVar != null) {
                    aVar.K0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f6014v = z10;
        d(this.f6016x);
    }

    public void setGravity(int i10) {
        if (i10 == 8388627) {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.f6035d0 = hVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.f6035d0 = h.b(aVar.f6044m0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.X(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.X(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.Y(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.Y(aVar.f6044m0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(g.a<Chip> aVar) {
        this.f6009q = aVar;
    }

    public void setLayoutDirection(int i10) {
        if (this.f6004e != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.M0 = i10;
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6008p = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6007o = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.Z(colorStateList);
        }
        if (!this.f6004e.H0) {
            g();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.Z(k1.a.getColorStateList(aVar.f6044m0, i10));
            if (!this.f6004e.H0) {
                g();
            }
        }
    }

    public void setShapeAppearanceModel(m mVar) {
        this.f6004e.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(h hVar) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.f6034c0 = hVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.f6034c0 = h.b(aVar.f6044m0, i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        a aVar = this.f6004e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.L0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            a aVar2 = this.f6004e;
            if (aVar2 != null && !TextUtils.equals(aVar2.M, charSequence)) {
                aVar2.M = charSequence;
                aVar2.f6050s0.f6498e = true;
                aVar2.invalidateSelf();
                aVar2.E();
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.f6050s0.c(dVar, aVar.f6044m0);
        }
        i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null && aVar.f6040i0 != f10) {
            aVar.f6040i0 = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            float dimension = aVar.f6044m0.getResources().getDimension(i10);
            if (aVar.f6040i0 != dimension) {
                aVar.f6040i0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        a aVar = this.f6004e;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            r rVar = aVar.f6050s0;
            d dVar = rVar.f6500g;
            if (dVar != null) {
                dVar.f11206k = applyDimension;
                rVar.f6494a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f6004e;
        if (aVar != null && aVar.f6039h0 != f10) {
            aVar.f6039h0 = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            float dimension = aVar.f6044m0.getResources().getDimension(i10);
            if (aVar.f6039h0 != dimension) {
                aVar.f6039h0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.W(z10);
        }
        f();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = E
            r1 = r18
            android.content.Context r1 = p8.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.B = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.C = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.D = r1
            android.content.Context r10 = r17.getContext()
            r11 = 1
            r12 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            r7.getAttributeValue(r1, r2)
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03a3
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x039b
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0395
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x038f
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x0387
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0387
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0387
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0387
            java.lang.String r2 = "gravity"
            r7.getAttributeIntValue(r1, r2, r12)
        L_0x007f:
            com.google.android.material.chip.a r13 = new com.google.android.material.chip.a
            r13.<init>(r10, r7, r8)
            android.content.Context r1 = r13.f6044m0
            int[] r14 = com.google.android.material.R$styleable.Chip
            r15 = 0
            int[] r6 = new int[r15]
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.u.d(r1, r2, r3, r4, r5, r6)
            int r6 = com.google.android.material.R$styleable.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r6)
            r13.N0 = r2
            android.content.Context r2 = r13.f6044m0
            int r3 = com.google.android.material.R$styleable.Chip_chipSurfaceColor
            android.content.res.ColorStateList r2 = i8.c.a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.F
            if (r3 == r2) goto L_0x00b2
            r13.F = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00b2:
            android.content.Context r2 = r13.f6044m0
            int r3 = com.google.android.material.R$styleable.Chip_chipBackgroundColor
            android.content.res.ColorStateList r2 = i8.c.a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.G
            if (r3 == r2) goto L_0x00c7
            r13.G = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00c7:
            int r2 = com.google.android.material.R$styleable.Chip_chipMinHeight
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            float r4 = r13.H
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00dc
            r13.H = r2
            r13.invalidateSelf()
            r13.E()
        L_0x00dc:
            int r2 = com.google.android.material.R$styleable.Chip_chipCornerRadius
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00eb
            float r2 = r1.getDimension(r2, r3)
            r13.K(r2)
        L_0x00eb:
            android.content.Context r2 = r13.f6044m0
            int r4 = com.google.android.material.R$styleable.Chip_chipStrokeColor
            android.content.res.ColorStateList r2 = i8.c.a(r2, r1, r4)
            r13.P(r2)
            int r2 = com.google.android.material.R$styleable.Chip_chipStrokeWidth
            float r2 = r1.getDimension(r2, r3)
            r13.Q(r2)
            android.content.Context r2 = r13.f6044m0
            int r4 = com.google.android.material.R$styleable.Chip_rippleColor
            android.content.res.ColorStateList r2 = i8.c.a(r2, r1, r4)
            r13.Z(r2)
            int r2 = com.google.android.material.R$styleable.Chip_android_text
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0114
            java.lang.String r2 = ""
        L_0x0114:
            java.lang.CharSequence r4 = r13.M
            boolean r4 = android.text.TextUtils.equals(r4, r2)
            if (r4 != 0) goto L_0x0128
            r13.M = r2
            com.google.android.material.internal.r r2 = r13.f6050s0
            r2.f6498e = r11
            r13.invalidateSelf()
            r13.E()
        L_0x0128:
            android.content.Context r2 = r13.f6044m0
            int r4 = com.google.android.material.R$styleable.Chip_android_textAppearance
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x013e
            int r4 = r1.getResourceId(r4, r15)
            if (r4 == 0) goto L_0x013e
            i8.d r5 = new i8.d
            r5.<init>(r2, r4)
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            int r2 = com.google.android.material.R$styleable.Chip_android_textSize
            float r4 = r5.f11206k
            float r2 = r1.getDimension(r2, r4)
            r5.f11206k = r2
            com.google.android.material.internal.r r2 = r13.f6050s0
            android.content.Context r4 = r13.f6044m0
            r2.c(r5, r4)
            int r2 = com.google.android.material.R$styleable.Chip_android_ellipsize
            int r2 = r1.getInt(r2, r15)
            if (r2 == r11) goto L_0x0169
            r4 = 2
            if (r2 == r4) goto L_0x0164
            r4 = 3
            if (r2 == r4) goto L_0x015f
            goto L_0x016d
        L_0x015f:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r13.K0 = r2
            goto L_0x016d
        L_0x0164:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r13.K0 = r2
            goto L_0x016d
        L_0x0169:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r13.K0 = r2
        L_0x016d:
            int r2 = com.google.android.material.R$styleable.Chip_chipIconVisible
            boolean r2 = r1.getBoolean(r2, r15)
            r13.O(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0193
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x0193
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x0193
            int r4 = com.google.android.material.R$styleable.Chip_chipIconEnabled
            boolean r4 = r1.getBoolean(r4, r15)
            r13.O(r4)
        L_0x0193:
            android.content.Context r4 = r13.f6044m0
            int r5 = com.google.android.material.R$styleable.Chip_chipIcon
            android.graphics.drawable.Drawable r4 = i8.c.d(r4, r1, r5)
            r13.L(r4)
            int r4 = com.google.android.material.R$styleable.Chip_chipIconTint
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x01af
            android.content.Context r5 = r13.f6044m0
            android.content.res.ColorStateList r4 = i8.c.a(r5, r1, r4)
            r13.N(r4)
        L_0x01af:
            int r4 = com.google.android.material.R$styleable.Chip_chipIconSize
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getDimension(r4, r5)
            r13.M(r4)
            int r4 = com.google.android.material.R$styleable.Chip_closeIconVisible
            boolean r4 = r1.getBoolean(r4, r15)
            r13.W(r4)
            if (r7 == 0) goto L_0x01de
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01de
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01de
            int r4 = com.google.android.material.R$styleable.Chip_closeIconEnabled
            boolean r4 = r1.getBoolean(r4, r15)
            r13.W(r4)
        L_0x01de:
            android.content.Context r4 = r13.f6044m0
            int r5 = com.google.android.material.R$styleable.Chip_closeIcon
            android.graphics.drawable.Drawable r4 = i8.c.d(r4, r1, r5)
            r13.R(r4)
            android.content.Context r4 = r13.f6044m0
            int r5 = com.google.android.material.R$styleable.Chip_closeIconTint
            android.content.res.ColorStateList r4 = i8.c.a(r4, r1, r5)
            r13.V(r4)
            int r4 = com.google.android.material.R$styleable.Chip_closeIconSize
            float r4 = r1.getDimension(r4, r3)
            r13.T(r4)
            int r4 = com.google.android.material.R$styleable.Chip_android_checkable
            boolean r4 = r1.getBoolean(r4, r15)
            r13.G(r4)
            int r4 = com.google.android.material.R$styleable.Chip_checkedIconVisible
            boolean r4 = r1.getBoolean(r4, r15)
            r13.J(r4)
            if (r7 == 0) goto L_0x022a
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x022a
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x022a
            int r2 = com.google.android.material.R$styleable.Chip_checkedIconEnabled
            boolean r2 = r1.getBoolean(r2, r15)
            r13.J(r2)
        L_0x022a:
            android.content.Context r2 = r13.f6044m0
            int r4 = com.google.android.material.R$styleable.Chip_checkedIcon
            android.graphics.drawable.Drawable r2 = i8.c.d(r2, r1, r4)
            r13.H(r2)
            int r2 = com.google.android.material.R$styleable.Chip_checkedIconTint
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0246
            android.content.Context r4 = r13.f6044m0
            android.content.res.ColorStateList r2 = i8.c.a(r4, r1, r2)
            r13.I(r2)
        L_0x0246:
            android.content.Context r2 = r13.f6044m0
            int r4 = com.google.android.material.R$styleable.Chip_showMotionSpec
            t7.h r2 = t7.h.a(r2, r1, r4)
            r13.f6034c0 = r2
            android.content.Context r2 = r13.f6044m0
            int r4 = com.google.android.material.R$styleable.Chip_hideMotionSpec
            t7.h r2 = t7.h.a(r2, r1, r4)
            r13.f6035d0 = r2
            int r2 = com.google.android.material.R$styleable.Chip_chipStartPadding
            float r2 = r1.getDimension(r2, r3)
            float r4 = r13.f6036e0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x026e
            r13.f6036e0 = r2
            r13.invalidateSelf()
            r13.E()
        L_0x026e:
            int r2 = com.google.android.material.R$styleable.Chip_iconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.Y(r2)
            int r2 = com.google.android.material.R$styleable.Chip_iconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.X(r2)
            int r2 = com.google.android.material.R$styleable.Chip_textStartPadding
            float r2 = r1.getDimension(r2, r3)
            float r4 = r13.f6039h0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0294
            r13.f6039h0 = r2
            r13.invalidateSelf()
            r13.E()
        L_0x0294:
            int r2 = com.google.android.material.R$styleable.Chip_textEndPadding
            float r2 = r1.getDimension(r2, r3)
            float r4 = r13.f6040i0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x02a8
            r13.f6040i0 = r2
            r13.invalidateSelf()
            r13.E()
        L_0x02a8:
            int r2 = com.google.android.material.R$styleable.Chip_closeIconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.U(r2)
            int r2 = com.google.android.material.R$styleable.Chip_closeIconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.S(r2)
            int r2 = com.google.android.material.R$styleable.Chip_chipEndPadding
            float r2 = r1.getDimension(r2, r3)
            float r3 = r13.f6043l0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02ce
            r13.f6043l0 = r2
            r13.invalidateSelf()
            r13.E()
        L_0x02ce:
            int r2 = com.google.android.material.R$styleable.Chip_android_maxWidth
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r13.M0 = r2
            r1.recycle()
            int[] r5 = new int[r15]
            r1 = r10
            r2 = r19
            r3 = r14
            r4 = r20
            r16 = r5
            r5 = r9
            r12 = r6
            r6 = r16
            android.content.res.TypedArray r1 = com.google.android.material.internal.u.d(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R$styleable.Chip_ensureMinTouchTargetSize
            boolean r2 = r1.getBoolean(r2, r15)
            r0.f6014v = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = com.google.android.material.internal.x.c(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = com.google.android.material.R$styleable.Chip_chipMinTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f6016x = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            float r1 = w1.d0.i.i(r17)
            r13.m(r1)
            int[] r6 = new int[r15]
            r1 = r10
            r2 = r19
            r3 = r14
            android.content.res.TypedArray r1 = com.google.android.material.internal.u.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r12)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.f6018z = r1
            r17.f()
            if (r2 != 0) goto L_0x0348
            y7.b r1 = new y7.b
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0348:
            boolean r1 = r0.f6010r
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.M
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.K0
            r0.setEllipsize(r1)
            r17.i()
            com.google.android.material.chip.a r1 = r0.f6004e
            boolean r1 = r1.L0
            if (r1 != 0) goto L_0x0366
            r0.setLines(r11)
            r0.setHorizontallyScrolling(r11)
        L_0x0366:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.h()
            boolean r1 = r0.f6014v
            if (r1 == 0) goto L_0x0378
            int r1 = r0.f6016x
            r0.setMinHeight(r1)
        L_0x0378:
            int r1 = w1.d0.e.d(r17)
            r0.f6015w = r1
            y7.a r1 = new y7.a
            r1.<init>(r0, r15)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x0387:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x038f:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x0395:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x039b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03a3:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.J(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.O(z10);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.f6050s0.c(new d(aVar.f6044m0, i10), aVar.f6044m0);
        }
        i();
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f6004e;
        if (aVar != null) {
            aVar.f6050s0.c(new d(aVar.f6044m0, i10), aVar.f6044m0);
        }
        i();
    }
}
