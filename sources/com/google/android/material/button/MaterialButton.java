package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.k;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l8.m;
import l8.q;
import o1.a;
import w1.d0;
import w1.q0;

public class MaterialButton extends AppCompatButton implements Checkable, q {
    public static final int A = R$style.Widget_MaterialComponents_Button;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f5879y = {16842911};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f5880z = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public final a f5881d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<a> f5882e;

    /* renamed from: f  reason: collision with root package name */
    public b f5883f;

    /* renamed from: n  reason: collision with root package name */
    public PorterDuff.Mode f5884n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f5885o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f5886p;

    /* renamed from: q  reason: collision with root package name */
    public String f5887q;

    /* renamed from: r  reason: collision with root package name */
    public int f5888r;

    /* renamed from: s  reason: collision with root package name */
    public int f5889s;

    /* renamed from: t  reason: collision with root package name */
    public int f5890t;

    /* renamed from: u  reason: collision with root package name */
    public int f5891u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5892v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5893w;

    /* renamed from: x  reason: collision with root package name */
    public int f5894x;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f5895c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f5895c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f5895c = parcel.readInt() != 1 ? false : true;
        }
    }

    public interface a {
        void a();
    }

    public interface b {
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil((double) f10);
    }

    public final boolean a() {
        a aVar = this.f5881d;
        if (aVar == null || aVar.f5929o) {
            return false;
        }
        return true;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10 = this.f5894x;
        boolean z12 = false;
        if (i10 == 1 || i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            k.b.e(this, this.f5886p, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            k.b.e(this, (Drawable) null, (Drawable) null, this.f5886p, (Drawable) null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z12 = true;
        }
        if (z12) {
            k.b.e(this, (Drawable) null, this.f5886p, (Drawable) null, (Drawable) null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = this.f5886p;
        boolean z14 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f5886p = mutate;
            a.b.h(mutate, this.f5885o);
            PorterDuff.Mode mode = this.f5884n;
            if (mode != null) {
                a.b.i(this.f5886p, mode);
            }
            int i10 = this.f5888r;
            if (i10 == 0) {
                i10 = this.f5886p.getIntrinsicWidth();
            }
            int i11 = this.f5888r;
            if (i11 == 0) {
                i11 = this.f5886p.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f5886p;
            int i12 = this.f5889s;
            int i13 = this.f5890t;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f5886p.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] a10 = k.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.f5894x;
        if (i14 == 1 || i14 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || drawable3 == this.f5886p) {
            if (i14 == 3 || i14 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 || drawable5 == this.f5886p) {
                if (i14 == 16 || i14 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 || drawable4 == this.f5886p) {
                    z14 = false;
                }
            }
        }
        if (z14) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f5886p != null && getLayout() != null) {
            int i12 = this.f5894x;
            boolean z13 = true;
            if (i12 == 1 || i12 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i12 == 3 || i12 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (!(i12 == 16 || i12 == 32)) {
                        z13 = false;
                    }
                    if (z13) {
                        this.f5889s = 0;
                        if (i12 == 16) {
                            this.f5890t = 0;
                            c(false);
                            return;
                        }
                        int i13 = this.f5888r;
                        if (i13 == 0) {
                            i13 = this.f5886p.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f5891u) - getPaddingBottom()) / 2);
                        if (this.f5890t != max) {
                            this.f5890t = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f5890t = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f5894x;
            if (i14 == 1 || i14 == 3 || ((i14 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i14 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.f5889s = 0;
                c(false);
                return;
            }
            int i15 = this.f5888r;
            if (i15 == 0) {
                i15 = this.f5886p.getIntrinsicWidth();
            }
            int textLayoutWidth = i10 - getTextLayoutWidth();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            int e10 = (((textLayoutWidth - d0.e.e(this)) - i15) - this.f5891u) - d0.e.f(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                e10 /= 2;
            }
            if (d0.e.d(this) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f5894x != 4) {
                z13 = false;
            }
            if (z11 != z13) {
                e10 = -e10;
            }
            if (this.f5889s != e10) {
                this.f5889s = e10;
                c(false);
            }
        }
    }

    public String getA11yClassName() {
        boolean z10;
        Class cls;
        if (!TextUtils.isEmpty(this.f5887q)) {
            return this.f5887q;
        }
        a aVar = this.f5881d;
        if (aVar == null || !aVar.f5931q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f5881d.f5921g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f5886p;
    }

    public int getIconGravity() {
        return this.f5894x;
    }

    public int getIconPadding() {
        return this.f5891u;
    }

    public int getIconSize() {
        return this.f5888r;
    }

    public ColorStateList getIconTint() {
        return this.f5885o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5884n;
    }

    public int getInsetBottom() {
        return this.f5881d.f5920f;
    }

    public int getInsetTop() {
        return this.f5881d.f5919e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f5881d.f5926l;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (a()) {
            return this.f5881d.f5916b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f5881d.f5925k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f5881d.f5922h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f5881d.f5924j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f5881d.f5923i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f5892v;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            m9.b.X(this, this.f5881d.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        a aVar = this.f5881d;
        if (aVar == null || !aVar.f5931q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f5879y);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5880z);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        a aVar = this.f5881d;
        if (aVar == null || !aVar.f5931q) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        setChecked(savedState.f5895c);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5895c = this.f5892v;
        return savedState;
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.f5881d.f5932r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f5886p != null) {
            if (this.f5886p.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f5887q = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (a()) {
            a aVar = this.f5881d;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            a aVar = this.f5881d;
            aVar.f5929o = true;
            aVar.f5915a.setSupportBackgroundTintList(aVar.f5924j);
            aVar.f5915a.setSupportBackgroundTintMode(aVar.f5923i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f5881d.f5931q = z10;
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        a aVar = this.f5881d;
        if (aVar == null || !aVar.f5931q) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && isEnabled() && this.f5892v != z10) {
            this.f5892v = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z12 = this.f5892v;
                if (!materialButtonToggleGroup.f5902f) {
                    materialButtonToggleGroup.b(getId(), z12);
                }
            }
            if (!this.f5893w) {
                this.f5893w = true;
                Iterator<a> it = this.f5882e.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.f5893w = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            a aVar = this.f5881d;
            if (!aVar.f5930p || aVar.f5921g != i10) {
                aVar.f5921g = i10;
                aVar.f5930p = true;
                aVar.c(aVar.f5916b.g((float) i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f5881d.b(false).m(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f5886p != drawable) {
            this.f5886p = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f5894x != i10) {
            this.f5894x = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f5891u != i10) {
            this.f5891u = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f5888r != i10) {
            this.f5888r = i10;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f5885o != colorStateList) {
            this.f5885o = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f5884n != mode) {
            this.f5884n = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(k1.a.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        a aVar = this.f5881d;
        aVar.d(aVar.f5919e, i10);
    }

    public void setInsetTop(int i10) {
        a aVar = this.f5881d;
        aVar.d(i10, aVar.f5920f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f5883f = bVar;
    }

    public void setPressed(boolean z10) {
        b bVar = this.f5883f;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            a aVar = this.f5881d;
            if (aVar.f5926l != colorStateList) {
                aVar.f5926l = colorStateList;
                if (aVar.f5915a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.f5915a.getBackground()).setColor(j8.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(k1.a.getColorStateList(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(m mVar) {
        if (a()) {
            this.f5881d.c(mVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            a aVar = this.f5881d;
            aVar.f5928n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            a aVar = this.f5881d;
            if (aVar.f5925k != colorStateList) {
                aVar.f5925k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(k1.a.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            a aVar = this.f5881d;
            if (aVar.f5922h != i10) {
                aVar.f5922h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            a aVar = this.f5881d;
            if (aVar.f5924j != colorStateList) {
                aVar.f5924j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f5924j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            a aVar = this.f5881d;
            if (aVar.f5923i != mode) {
                aVar.f5923i = mode;
                if (aVar.b(false) != null && aVar.f5923i != null) {
                    a.b.i(aVar.b(false), aVar.f5923i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f5881d.f5932r = z10;
    }

    public final void toggle() {
        setChecked(!this.f5892v);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = A
            android.content.Context r9 = p8.a.a(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f5882e = r9
            r9 = 0
            r8.f5892v = r9
            r8.f5893w = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.R$styleable.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f5891u = r1
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.x.h(r1, r3)
            r8.f5884n = r1
            android.content.Context r1 = r8.getContext()
            int r3 = com.google.android.material.R$styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = i8.c.a(r1, r0, r3)
            r8.f5885o = r1
            android.content.Context r1 = r8.getContext()
            int r3 = com.google.android.material.R$styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = i8.c.d(r1, r0, r3)
            r8.f5886p = r1
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconGravity
            r3 = 1
            int r1 = r0.getInteger(r1, r3)
            r8.f5894x = r1
            int r1 = com.google.android.material.R$styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f5888r = r1
            l8.m$a r10 = l8.m.c(r7, r10, r11, r6)
            l8.m r11 = new l8.m
            r11.<init>(r10)
            com.google.android.material.button.a r10 = new com.google.android.material.button.a
            r10.<init>(r8, r11)
            r8.f5881d = r10
            int r11 = com.google.android.material.R$styleable.MaterialButton_android_insetLeft
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f5917c = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_android_insetRight
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f5918d = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_android_insetTop
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f5919e = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_android_insetBottom
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f5920f = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_cornerRadius
            boolean r1 = r0.hasValue(r11)
            if (r1 == 0) goto L_0x00af
            int r11 = r0.getDimensionPixelSize(r11, r2)
            r10.f5921g = r11
            l8.m r1 = r10.f5916b
            float r11 = (float) r11
            l8.m r11 = r1.g(r11)
            r10.c(r11)
            r10.f5930p = r3
        L_0x00af:
            int r11 = com.google.android.material.R$styleable.MaterialButton_strokeWidth
            int r11 = r0.getDimensionPixelSize(r11, r9)
            r10.f5922h = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_backgroundTintMode
            int r11 = r0.getInt(r11, r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r11 = com.google.android.material.internal.x.h(r11, r1)
            r10.f5923i = r11
            android.content.Context r11 = r8.getContext()
            int r1 = com.google.android.material.R$styleable.MaterialButton_backgroundTint
            android.content.res.ColorStateList r11 = i8.c.a(r11, r0, r1)
            r10.f5924j = r11
            android.content.Context r11 = r8.getContext()
            int r1 = com.google.android.material.R$styleable.MaterialButton_strokeColor
            android.content.res.ColorStateList r11 = i8.c.a(r11, r0, r1)
            r10.f5925k = r11
            android.content.Context r11 = r8.getContext()
            int r1 = com.google.android.material.R$styleable.MaterialButton_rippleColor
            android.content.res.ColorStateList r11 = i8.c.a(r11, r0, r1)
            r10.f5926l = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_android_checkable
            boolean r11 = r0.getBoolean(r11, r9)
            r10.f5931q = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_elevation
            int r11 = r0.getDimensionPixelSize(r11, r9)
            r10.f5934t = r11
            int r11 = com.google.android.material.R$styleable.MaterialButton_toggleCheckedStateOnClick
            boolean r11 = r0.getBoolean(r11, r3)
            r10.f5932r = r11
            java.util.WeakHashMap<android.view.View, w1.q0> r11 = w1.d0.f16298a
            int r11 = w1.d0.e.f(r8)
            int r1 = r8.getPaddingTop()
            int r2 = w1.d0.e.e(r8)
            int r4 = r8.getPaddingBottom()
            int r5 = com.google.android.material.R$styleable.MaterialButton_android_background
            boolean r5 = r0.hasValue(r5)
            if (r5 == 0) goto L_0x0128
            r10.f5929o = r3
            android.content.res.ColorStateList r5 = r10.f5924j
            r8.setSupportBackgroundTintList(r5)
            android.graphics.PorterDuff$Mode r5 = r10.f5923i
            r8.setSupportBackgroundTintMode(r5)
            goto L_0x012b
        L_0x0128:
            r10.e()
        L_0x012b:
            int r5 = r10.f5917c
            int r11 = r11 + r5
            int r5 = r10.f5919e
            int r1 = r1 + r5
            int r5 = r10.f5918d
            int r2 = r2 + r5
            int r10 = r10.f5920f
            int r4 = r4 + r10
            w1.d0.e.k(r8, r11, r1, r2, r4)
            r0.recycle()
            int r10 = r8.f5891u
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f5886p
            if (r10 == 0) goto L_0x0147
            r9 = r3
        L_0x0147:
            r8.c(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
