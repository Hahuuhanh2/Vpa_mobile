package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$style;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.v;
import ea.c;
import java.util.WeakHashMap;
import l8.h;
import m9.b;
import o1.a;
import w1.d0;
import w1.q0;

public class SearchBar extends Toolbar {

    /* renamed from: t0  reason: collision with root package name */
    public static final int f6643t0 = R$style.Widget_Material3_SearchBar;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f6644e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f6645f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f6646g0;

    /* renamed from: h0  reason: collision with root package name */
    public final b f6647h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Drawable f6648i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f6649j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f6650k0;

    /* renamed from: l0  reason: collision with root package name */
    public View f6651l0;

    /* renamed from: m0  reason: collision with root package name */
    public Integer f6652m0;

    /* renamed from: n0  reason: collision with root package name */
    public Drawable f6653n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f6654o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6655p0;

    /* renamed from: q0  reason: collision with root package name */
    public h f6656q0;

    /* renamed from: r0  reason: collision with root package name */
    public final AccessibilityManager f6657r0;

    /* renamed from: s0  reason: collision with root package name */
    public final c f6658s0;

    public SearchBar(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setNavigationIconDecorative(boolean z10) {
        Drawable drawable;
        ImageButton b10 = v.b(this);
        if (b10 != null) {
            b10.setClickable(!z10);
            b10.setFocusable(!z10);
            Drawable background = b10.getBackground();
            if (background != null) {
                this.f6653n0 = background;
            }
            if (z10) {
                drawable = null;
            } else {
                drawable = this.f6653n0;
            }
            b10.setBackgroundDrawable(drawable);
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f6645f0 && this.f6651l0 == null && !(view instanceof ActionMenuView)) {
            this.f6651l0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return this.f6651l0;
    }

    public float getCompatElevation() {
        h hVar = this.f6656q0;
        if (hVar != null) {
            return hVar.f12778a.f12811n;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        return d0.i.i(this);
    }

    public float getCornerSize() {
        return this.f6656q0.j();
    }

    public int getDefaultMarginVerticalResource() {
        return R$dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R$drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.f6644e0.getHint();
    }

    public int getMenuResId() {
        return this.f6654o0;
    }

    public int getStrokeColor() {
        return this.f6656q0.f12778a.f12801d.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f6656q0.f12778a.f12808k;
    }

    public CharSequence getText() {
        return this.f6644e0.getText();
    }

    public TextView getTextView() {
        return this.f6644e0;
    }

    public final void k(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof f;
        if (z10) {
            ((f) menu).y();
        }
        super.k(i10);
        this.f6654o0 = i10;
        if (z10) {
            ((f) menu).x();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.X(this, this.f6656q0);
        if (this.f6646g0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i10 = marginLayoutParams.leftMargin;
            if (i10 == 0) {
                i10 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i10;
            int i11 = marginLayoutParams.topMargin;
            if (i11 == 0) {
                i11 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i11;
            int i12 = marginLayoutParams.rightMargin;
            if (i12 != 0) {
                dimensionPixelSize = i12;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i13 = marginLayoutParams.bottomMargin;
            if (i13 != 0) {
                dimensionPixelSize2 = i13;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        u();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i10 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f6651l0;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i14 = measuredWidth + measuredWidth2;
            int measuredHeight = this.f6651l0.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i15 = measuredHeight + measuredHeight2;
            View view2 = this.f6651l0;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.e.d(this) == 1) {
                view2.layout(getMeasuredWidth() - i14, measuredHeight2, getMeasuredWidth() - measuredWidth2, i15);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i14, i15);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        View view = this.f6651l0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        setText((CharSequence) savedState.f6659c);
    }

    public final Parcelable onSaveInstanceState() {
        String str;
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            str = null;
        } else {
            str = text.toString();
        }
        savedState.f6659c = str;
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.f6651l0;
        if (view2 != null) {
            removeView(view2);
            this.f6651l0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f6655p0 = z10;
        u();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h hVar = this.f6656q0;
        if (hVar != null) {
            hVar.m(f10);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f6644e0.setHint(charSequence);
    }

    public void setNavigationIcon(Drawable drawable) {
        int i10;
        int i11;
        if (this.f6649j0 && drawable != null) {
            Integer num = this.f6652m0;
            if (num != null) {
                i10 = num.intValue();
            } else {
                if (drawable == this.f6648i0) {
                    i11 = R$attr.colorOnSurfaceVariant;
                } else {
                    i11 = R$attr.colorOnSurface;
                }
                i10 = b.A(i11, this);
            }
            drawable = drawable.mutate();
            a.b.g(drawable, i10);
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z10;
        if (!this.f6650k0) {
            super.setNavigationOnClickListener(onClickListener);
            if (onClickListener == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            setNavigationIconDecorative(z10);
        }
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f6647h0.getClass();
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f6656q0.s(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f6656q0.t(f10);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f6644e0.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
    }

    public final void u() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f6655p0) {
                if (layoutParams.f5600a == 0) {
                    layoutParams.f5600a = 53;
                }
            } else if (layoutParams.f5600a == 53) {
                layoutParams.f5600a = 0;
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public String f6659c;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6659c = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeString(this.f6659c);
        }

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: n  reason: collision with root package name */
        public boolean f6660n = false;

        public ScrollingViewBehavior() {
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.f6660n && (view2 instanceof AppBarLayout)) {
                this.f6660n = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialSearchBarStyle);
    }

    public void setHint(int i10) {
        this.f6644e0.setHint(i10);
    }

    public void setText(int i10) {
        this.f6644e0.setText(i10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchBar(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f6643t0
            r1 = r17
            android.content.Context r1 = p8.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f6654o0 = r10
            ea.c r1 = new ea.c
            r2 = 16
            r1.<init>(r0, r2)
            r0.f6658s0 = r1
            android.content.Context r11 = r16.getContext()
            if (r7 != 0) goto L_0x0024
            goto L_0x0036
        L_0x0024:
            java.lang.String r1 = "http://schemas.android.com/apk/res-auto"
            java.lang.String r2 = "title"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0190
            java.lang.String r2 = "subtitle"
            java.lang.String r1 = r7.getAttributeValue(r1, r2)
            if (r1 != 0) goto L_0x0188
        L_0x0036:
            int r1 = r16.getDefaultNavigationIconResource()
            android.graphics.drawable.Drawable r12 = h.a.a(r11, r1)
            r0.f6648i0 = r12
            com.google.android.material.search.b r1 = new com.google.android.material.search.b
            r1.<init>()
            r0.f6647h0 = r1
            int[] r3 = com.google.android.material.R$styleable.SearchBar
            r13 = 0
            int[] r6 = new int[r13]
            r1 = r11
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.u.d(r1, r2, r3, r4, r5, r6)
            l8.m$a r2 = l8.m.c(r11, r7, r8, r9)
            l8.m r3 = new l8.m
            r3.<init>(r2)
            int r2 = com.google.android.material.R$styleable.SearchBar_backgroundTint
            int r2 = r1.getColor(r2, r13)
            int r4 = com.google.android.material.R$styleable.SearchBar_elevation
            r5 = 0
            float r4 = r1.getDimension(r4, r5)
            int r6 = com.google.android.material.R$styleable.SearchBar_defaultMarginsEnabled
            r7 = 1
            boolean r6 = r1.getBoolean(r6, r7)
            r0.f6646g0 = r6
            int r6 = com.google.android.material.R$styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r6 = r1.getBoolean(r6, r7)
            r0.f6655p0 = r6
            int r6 = com.google.android.material.R$styleable.SearchBar_hideNavigationIcon
            boolean r6 = r1.getBoolean(r6, r13)
            int r8 = com.google.android.material.R$styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r8 = r1.getBoolean(r8, r13)
            r0.f6650k0 = r8
            int r8 = com.google.android.material.R$styleable.SearchBar_tintNavigationIcon
            boolean r8 = r1.getBoolean(r8, r7)
            r0.f6649j0 = r8
            int r8 = com.google.android.material.R$styleable.SearchBar_navigationIconTint
            boolean r9 = r1.hasValue(r8)
            if (r9 == 0) goto L_0x00a5
            int r8 = r1.getColor(r8, r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.f6652m0 = r8
        L_0x00a5:
            int r8 = com.google.android.material.R$styleable.SearchBar_android_textAppearance
            int r8 = r1.getResourceId(r8, r10)
            int r9 = com.google.android.material.R$styleable.SearchBar_android_text
            java.lang.String r9 = r1.getString(r9)
            int r14 = com.google.android.material.R$styleable.SearchBar_android_hint
            java.lang.String r14 = r1.getString(r14)
            int r15 = com.google.android.material.R$styleable.SearchBar_strokeWidth
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.getDimension(r15, r5)
            int r15 = com.google.android.material.R$styleable.SearchBar_strokeColor
            int r13 = r1.getColor(r15, r13)
            r1.recycle()
            if (r6 != 0) goto L_0x00db
            android.graphics.drawable.Drawable r1 = r16.getNavigationIcon()
            if (r1 != 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            android.graphics.drawable.Drawable r12 = r16.getNavigationIcon()
        L_0x00d5:
            r0.setNavigationIcon(r12)
            r0.setNavigationIconDecorative(r7)
        L_0x00db:
            r0.setClickable(r7)
            r0.setFocusable(r7)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r11)
            int r6 = com.google.android.material.R$layout.mtrl_search_bar
            r1.inflate(r6, r0)
            r0.f6645f0 = r7
            int r1 = com.google.android.material.R$id.open_search_bar_text_view
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f6644e0 = r1
            java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
            w1.d0.i.s(r0, r4)
            if (r8 == r10) goto L_0x0100
            r1.setTextAppearance(r8)
        L_0x0100:
            r0.setText((java.lang.CharSequence) r9)
            r0.setHint((java.lang.CharSequence) r14)
            android.graphics.drawable.Drawable r6 = r16.getNavigationIcon()
            if (r6 != 0) goto L_0x011f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.content.res.Resources r6 = r16.getResources()
            int r8 = com.google.android.material.R$dimen.m3_searchbar_text_margin_start_no_navigation_icon
            int r6 = r6.getDimensionPixelSize(r8)
            w1.g.h(r1, r6)
        L_0x011f:
            l8.h r1 = new l8.h
            r1.<init>((l8.m) r3)
            r0.f6656q0 = r1
            android.content.Context r3 = r16.getContext()
            r1.k(r3)
            l8.h r1 = r0.f6656q0
            r1.m(r4)
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0143
            l8.h r1 = r0.f6656q0
            r1.t(r5)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r13)
            r1.s(r3)
        L_0x0143:
            int r1 = com.google.android.material.R$attr.colorControlHighlight
            int r1 = m9.b.A(r1, r0)
            l8.h r3 = r0.f6656q0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.n(r2)
            android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            l8.h r3 = r0.f6656q0
            r2.<init>(r1, r3, r3)
            w1.d0.d.q(r0, r2)
            android.content.Context r1 = r16.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r0.f6657r0 = r1
            if (r1 == 0) goto L_0x0187
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L_0x017f
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L_0x017f
            r0.setFocusableInTouchMode(r7)
        L_0x017f:
            com.google.android.material.search.a r1 = new com.google.android.material.search.a
            r1.<init>(r0)
            r0.addOnAttachStateChangeListener(r1)
        L_0x0187:
            return
        L_0x0188:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "SearchBar does not support subtitle. Use hint or text instead."
            r1.<init>(r2)
            throw r1
        L_0x0190:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "SearchBar does not support title. Use hint or text instead."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
