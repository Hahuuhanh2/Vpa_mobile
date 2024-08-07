package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.internal.x;
import j3.d;
import j3.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o1.a;

public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int F = R$style.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] G = {R$attr.state_indeterminate};
    public static final int[] H;
    public static final int[][] I;
    @SuppressLint({"DiscouragedApi"})
    public static final int J = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A;
    public CharSequence B;
    public CompoundButton.OnCheckedChangeListener C;
    public final d D;
    public final a E;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<c> f5987e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<b> f5988f;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f5989n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5990o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5991p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5992q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f5993r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f5994s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f5995t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5996u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f5997v;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f5998w;

    /* renamed from: x  reason: collision with root package name */
    public PorterDuff.Mode f5999x;

    /* renamed from: y  reason: collision with root package name */
    public int f6000y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f6001z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f6002a;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            String str;
            StringBuilder q10 = android.support.v4.media.a.q("MaterialCheckBox.SavedState{");
            q10.append(Integer.toHexString(System.identityHashCode(this)));
            q10.append(" CheckedState=");
            int i10 = this.f6002a;
            if (i10 == 1) {
                str = "checked";
            } else if (i10 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
            return android.support.v4.media.a.o(q10, str, "}");
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f6002a));
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6002a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class a extends j3.c {
        public a() {
        }

        public final void a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.f5997v;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        public final void b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f5997v;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(materialCheckBox.f6001z, colorStateList.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    static {
        int i10 = R$attr.state_error;
        H = new int[]{i10};
        I = new int[][]{new int[]{16842910, i10}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    private String getButtonStateDescription() {
        int i10 = this.f6000y;
        if (i10 == 1) {
            return getResources().getString(R$string.mtrl_checkbox_state_description_checked);
        }
        if (i10 == 0) {
            return getResources().getString(R$string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R$string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5989n == null) {
            int[][] iArr = I;
            int A2 = m9.b.A(R$attr.colorControlActivated, this);
            int A3 = m9.b.A(R$attr.colorError, this);
            int A4 = m9.b.A(R$attr.colorSurface, this);
            int A5 = m9.b.A(R$attr.colorOnSurface, this);
            this.f5989n = new ColorStateList(iArr, new int[]{m9.b.K(1.0f, A4, A3), m9.b.K(1.0f, A4, A2), m9.b.K(0.54f, A4, A5), m9.b.K(0.38f, A4, A5), m9.b.K(0.38f, A4, A5)});
        }
        return this.f5989n;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f5997v;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        d dVar;
        e eVar;
        this.f5994s = b8.b.b(this.f5994s, this.f5997v, androidx.core.widget.b.b(this));
        this.f5995t = b8.b.b(this.f5995t, this.f5998w, this.f5999x);
        if (this.f5996u) {
            d dVar2 = this.D;
            if (dVar2 != null) {
                a aVar = this.E;
                Drawable drawable = dVar2.f11569a;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f11553a == null) {
                        aVar.f11553a = new j3.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f11553a);
                }
                ArrayList<j3.c> arrayList = dVar2.f11558e;
                if (!(arrayList == null || aVar == null)) {
                    arrayList.remove(aVar);
                    if (dVar2.f11558e.size() == 0 && (eVar = dVar2.f11557d) != null) {
                        dVar2.f11555b.f11562b.removeListener(eVar);
                        dVar2.f11557d = null;
                    }
                }
                d dVar3 = this.D;
                a aVar2 = this.E;
                Drawable drawable2 = dVar3.f11569a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar2.f11553a == null) {
                        aVar2.f11553a = new j3.b(aVar2);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar2.f11553a);
                } else if (aVar2 != null) {
                    if (dVar3.f11558e == null) {
                        dVar3.f11558e = new ArrayList<>();
                    }
                    if (!dVar3.f11558e.contains(aVar2)) {
                        dVar3.f11558e.add(aVar2);
                        if (dVar3.f11557d == null) {
                            dVar3.f11557d = new e(dVar3);
                        }
                        dVar3.f11555b.f11562b.addListener(dVar3.f11557d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f5994s;
                if ((drawable3 instanceof AnimatedStateListDrawable) && (dVar = this.D) != null) {
                    int i10 = R$id.checked;
                    int i11 = R$id.unchecked;
                    ((AnimatedStateListDrawable) drawable3).addTransition(i10, i11, dVar, false);
                    ((AnimatedStateListDrawable) this.f5994s).addTransition(R$id.indeterminate, i11, this.D, false);
                }
            }
        }
        Drawable drawable4 = this.f5994s;
        if (!(drawable4 == null || (colorStateList2 = this.f5997v) == null)) {
            a.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f5995t;
        if (!(drawable5 == null || (colorStateList = this.f5998w) == null)) {
            a.b.h(drawable5, colorStateList);
        }
        super.setButtonDrawable(b8.b.a(this.f5994s, this.f5995t, -1, -1));
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.f5994s;
    }

    public Drawable getButtonIconDrawable() {
        return this.f5995t;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f5998w;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f5999x;
    }

    public ColorStateList getButtonTintList() {
        return this.f5997v;
    }

    public int getCheckedState() {
        return this.f6000y;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f5993r;
    }

    public final boolean isChecked() {
        if (this.f6000y == 1) {
            return true;
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5990o && this.f5997v == null && this.f5998w == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        if (this.f5992q) {
            View.mergeDrawableStates(onCreateDrawableState, H);
        }
        this.f6001z = b8.b.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (!this.f5991p || !TextUtils.isEmpty(getText()) || (a10 = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (x.g(this)) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f5992q) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f5993r);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f6002a);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6002a = getCheckedState();
        return savedState;
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(h.a.a(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f5995t = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(h.a.a(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f5998w != colorStateList) {
            this.f5998w = colorStateList;
            b();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f5999x != mode) {
            this.f5999x = mode;
            b();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f5997v != colorStateList) {
            this.f5997v = colorStateList;
            b();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f5991p = z10;
    }

    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f6000y != i10) {
            this.f6000y = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.B == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.A) {
                this.A = true;
                LinkedHashSet<b> linkedHashSet = this.f5988f;
                if (linkedHashSet != null) {
                    Iterator<b> it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                }
                if (!(this.f6000y == 2 || (onCheckedChangeListener = this.C) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.A = false;
            }
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f5993r = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.f5992q != z10) {
            this.f5992q = z10;
            refreshDrawableState();
            Iterator<c> it = this.f5987e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.C = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.B = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f5990o = z10;
        if (z10) {
            androidx.core.widget.b.c(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.b.c(this, (ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.checkboxStyle);
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f5994s = drawable;
        this.f5996u = false;
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065 A[Catch:{ IOException | XmlPullParserException -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077 A[Catch:{ IOException | XmlPullParserException -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r0 = F
            android.content.Context r12 = p8.a.a(r12, r13, r14, r0)
            r11.<init>(r12, r13, r14)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.f5987e = r12
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.f5988f = r12
            android.content.Context r12 = r11.getContext()
            int r0 = com.google.android.material.R$drawable.mtrl_checkbox_button_checked_unchecked
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            r3 = 0
            r4 = 1
            if (r1 < r2) goto L_0x004b
            j3.d r1 = new j3.d
            r1.<init>(r12)
            android.content.res.Resources r2 = r12.getResources()
            android.content.res.Resources$Theme r12 = r12.getTheme()
            java.lang.ThreadLocal<android.util.TypedValue> r5 = m1.e.f13062a
            android.graphics.drawable.Drawable r12 = m1.e.a.a(r2, r0, r12)
            r1.f11569a = r12
            j3.d$a r0 = r1.f11559f
            r12.setCallback(r0)
            j3.d$c r12 = new j3.d$c
            android.graphics.drawable.Drawable r0 = r1.f11569a
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r12.<init>(r0)
            goto L_0x0080
        L_0x004b:
            int r1 = j3.d.f11554n
            android.content.res.Resources r1 = r12.getResources()
            android.content.res.XmlResourceParser r0 = r1.getXml(r0)     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch:{ IOException | XmlPullParserException -> 0x007f }
        L_0x0059:
            int r2 = r0.next()     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            r5 = 2
            if (r2 == r5) goto L_0x0063
            if (r2 == r4) goto L_0x0063
            goto L_0x0059
        L_0x0063:
            if (r2 != r5) goto L_0x0077
            android.content.res.Resources r2 = r12.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            android.content.res.Resources$Theme r5 = r12.getTheme()     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            j3.d r6 = new j3.d     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            r6.<init>(r12)     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            r6.inflate(r2, r0, r1, r5)     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            r1 = r6
            goto L_0x0080
        L_0x0077:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x007f }
            throw r12     // Catch:{ IOException | XmlPullParserException -> 0x007f }
        L_0x007f:
            r1 = r3
        L_0x0080:
            r11.D = r1
            com.google.android.material.checkbox.MaterialCheckBox$a r12 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r12.<init>()
            r11.E = r12
            android.content.Context r12 = r11.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r11)
            r11.f5994s = r0
            android.content.res.ColorStateList r0 = r11.getSuperButtonTintList()
            r11.f5997v = r0
            r11.setSupportButtonTintList(r3)
            int[] r7 = com.google.android.material.R$styleable.MaterialCheckBox
            int r9 = F
            r0 = 0
            int[] r10 = new int[r0]
            r5 = r12
            r6 = r13
            r8 = r14
            androidx.appcompat.widget.n0 r13 = com.google.android.material.internal.u.e(r5, r6, r7, r8, r9, r10)
            int r14 = com.google.android.material.R$styleable.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r14 = r13.e(r14)
            r11.f5995t = r14
            android.graphics.drawable.Drawable r14 = r11.f5994s
            if (r14 == 0) goto L_0x00ee
            int r14 = com.google.android.material.R$attr.isMaterial3Theme
            boolean r14 = i8.b.b(r12, r14, r0)
            if (r14 == 0) goto L_0x00ee
            int r14 = com.google.android.material.R$styleable.MaterialCheckBox_android_button
            int r14 = r13.i(r14, r0)
            int r1 = com.google.android.material.R$styleable.MaterialCheckBox_buttonCompat
            int r1 = r13.i(r1, r0)
            int r2 = J
            if (r14 != r2) goto L_0x00d2
            if (r1 != 0) goto L_0x00d2
            r14 = r4
            goto L_0x00d3
        L_0x00d2:
            r14 = r0
        L_0x00d3:
            if (r14 == 0) goto L_0x00ee
            super.setButtonDrawable((android.graphics.drawable.Drawable) r3)
            int r14 = com.google.android.material.R$drawable.mtrl_checkbox_button
            android.graphics.drawable.Drawable r14 = h.a.a(r12, r14)
            r11.f5994s = r14
            r11.f5996u = r4
            android.graphics.drawable.Drawable r14 = r11.f5995t
            if (r14 != 0) goto L_0x00ee
            int r14 = com.google.android.material.R$drawable.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r14 = h.a.a(r12, r14)
            r11.f5995t = r14
        L_0x00ee:
            int r14 = com.google.android.material.R$styleable.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r12 = i8.c.b(r12, r13, r14)
            r11.f5998w = r12
            int r12 = com.google.android.material.R$styleable.MaterialCheckBox_buttonIconTintMode
            r14 = -1
            int r12 = r13.h(r12, r14)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r12 = com.google.android.material.internal.x.h(r12, r14)
            r11.f5999x = r12
            int r12 = com.google.android.material.R$styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r12 = r13.a(r12, r0)
            r11.f5990o = r12
            int r12 = com.google.android.material.R$styleable.MaterialCheckBox_centerIfNoTextEnabled
            boolean r12 = r13.a(r12, r4)
            r11.f5991p = r12
            int r12 = com.google.android.material.R$styleable.MaterialCheckBox_errorShown
            boolean r12 = r13.a(r12, r0)
            r11.f5992q = r12
            int r12 = com.google.android.material.R$styleable.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r12 = r13.k(r12)
            r11.f5993r = r12
            int r12 = com.google.android.material.R$styleable.MaterialCheckBox_checkedState
            boolean r14 = r13.l(r12)
            if (r14 == 0) goto L_0x0134
            int r12 = r13.h(r12, r0)
            r11.setCheckedState(r12)
        L_0x0134:
            r13.n()
            r11.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
