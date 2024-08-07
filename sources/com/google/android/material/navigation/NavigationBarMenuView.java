package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.transition.AutoTransition;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.internal.s;
import f8.j;
import java.util.HashSet;
import java.util.WeakHashMap;
import l8.m;
import t7.b;
import v1.e;
import w1.d0;
import w1.q0;
import x1.f;

public abstract class NavigationBarMenuView extends ViewGroup implements k {
    public static final int[] M = {16842912};
    public static final int[] N = {-16842910};
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public m H;
    public boolean I = false;
    public ColorStateList J;
    public NavigationBarPresenter K;
    public f L;

    /* renamed from: a  reason: collision with root package name */
    public final AutoTransition f6553a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6554b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6555c = new e(5);

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f6556d = new SparseArray<>(5);

    /* renamed from: e  reason: collision with root package name */
    public int f6557e;

    /* renamed from: f  reason: collision with root package name */
    public NavigationBarItemView[] f6558f;

    /* renamed from: n  reason: collision with root package name */
    public int f6559n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f6560o = 0;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f6561p;

    /* renamed from: q  reason: collision with root package name */
    public int f6562q;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f6563r;

    /* renamed from: s  reason: collision with root package name */
    public final ColorStateList f6564s = c(16842808);

    /* renamed from: t  reason: collision with root package name */
    public int f6565t;

    /* renamed from: u  reason: collision with root package name */
    public int f6566u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6567v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f6568w;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f6569x;

    /* renamed from: y  reason: collision with root package name */
    public int f6570y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseArray<com.google.android.material.badge.a> f6571z = new SparseArray<>(5);

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            h itemData = ((NavigationBarItemView) view).getItemData();
            NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
            if (!navigationBarMenuView.L.q(itemData, navigationBarMenuView.K, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        if (isInEditMode()) {
            this.f6553a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f6553a = autoTransition;
            autoTransition.O(0);
            autoTransition.D((long) j.c(getContext(), R$attr.motionDurationMedium4, getResources().getInteger(R$integer.material_motion_duration_long_1)));
            autoTransition.F(j.d(getContext(), R$attr.motionEasingStandard, b.f14886b));
            autoTransition.L(new s());
        }
        this.f6554b = new a();
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.s(this, 1);
    }

    public static boolean f(int i10, int i11) {
        return i10 != -1 ? i10 == 0 : i11 > 3;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f6555c.b();
        if (navigationBarItemView == null) {
            return e(getContext());
        }
        return navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        boolean z10;
        com.google.android.material.badge.a aVar;
        int id2 = navigationBarItemView.getId();
        if (id2 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aVar = this.f6571z.get(id2)) != null) {
            navigationBarItemView.setBadge(aVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        boolean z10;
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f6555c.a(navigationBarItemView);
                    ImageView imageView = navigationBarItemView.f6544u;
                    if (navigationBarItemView.M != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            com.google.android.material.badge.a aVar = navigationBarItemView.M;
                            if (aVar != null) {
                                if (aVar.d() != null) {
                                    aVar.d().setForeground((Drawable) null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        navigationBarItemView.M = null;
                    }
                    navigationBarItemView.A = null;
                    navigationBarItemView.G = 0.0f;
                    navigationBarItemView.f6531a = false;
                }
            }
        }
        if (this.L.size() == 0) {
            this.f6559n = 0;
            this.f6560o = 0;
            this.f6558f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            hashSet.add(Integer.valueOf(this.L.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f6571z.size(); i11++) {
            int keyAt = this.f6571z.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f6571z.delete(keyAt);
            }
        }
        this.f6558f = new NavigationBarItemView[this.L.size()];
        boolean f10 = f(this.f6557e, this.L.l().size());
        for (int i12 = 0; i12 < this.L.size(); i12++) {
            this.K.f6574b = true;
            this.L.getItem(i12).setCheckable(true);
            this.K.f6574b = false;
            NavigationBarItemView newItem = getNewItem();
            this.f6558f[i12] = newItem;
            newItem.setIconTintList(this.f6561p);
            newItem.setIconSize(this.f6562q);
            newItem.setTextColor(this.f6564s);
            newItem.setTextAppearanceInactive(this.f6565t);
            newItem.setTextAppearanceActive(this.f6566u);
            newItem.setTextAppearanceActiveBoldEnabled(this.f6567v);
            newItem.setTextColor(this.f6563r);
            int i13 = this.A;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.B;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            int i15 = this.C;
            if (i15 != -1) {
                newItem.setActiveIndicatorLabelPadding(i15);
            }
            newItem.setActiveIndicatorWidth(this.E);
            newItem.setActiveIndicatorHeight(this.F);
            newItem.setActiveIndicatorMarginHorizontal(this.G);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.I);
            newItem.setActiveIndicatorEnabled(this.D);
            Drawable drawable = this.f6568w;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f6570y);
            }
            newItem.setItemRippleColor(this.f6569x);
            newItem.setShifting(f10);
            newItem.setLabelVisibilityMode(this.f6557e);
            h hVar = (h) this.L.getItem(i12);
            newItem.c(hVar);
            newItem.setItemPosition(i12);
            int i16 = hVar.f642a;
            newItem.setOnTouchListener(this.f6556d.get(i16));
            newItem.setOnClickListener(this.f6554b);
            int i17 = this.f6559n;
            if (i17 != 0 && i16 == i17) {
                this.f6560o = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.L.size() - 1, this.f6560o);
        this.f6560o = min;
        this.L.getItem(min).setChecked(true);
    }

    public final void b(f fVar) {
        this.L = fVar;
    }

    public final ColorStateList c(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = k1.a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R$attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = N;
        return new ColorStateList(new int[][]{iArr, M, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final l8.h d() {
        if (this.H == null || this.J == null) {
            return null;
        }
        l8.h hVar = new l8.h(this.H);
        hVar.n(this.J);
        return hVar;
    }

    public abstract NavigationBarItemView e(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.C;
    }

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f6571z;
    }

    public ColorStateList getIconTintList() {
        return this.f6561p;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.J;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.D;
    }

    public int getItemActiveIndicatorHeight() {
        return this.F;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.G;
    }

    public m getItemActiveIndicatorShapeAppearance() {
        return this.H;
    }

    public int getItemActiveIndicatorWidth() {
        return this.E;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) {
            return this.f6568w;
        }
        return navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f6570y;
    }

    public int getItemIconSize() {
        return this.f6562q;
    }

    public int getItemPaddingBottom() {
        return this.B;
    }

    public int getItemPaddingTop() {
        return this.A;
    }

    public ColorStateList getItemRippleColor() {
        return this.f6569x;
    }

    public int getItemTextAppearanceActive() {
        return this.f6566u;
    }

    public int getItemTextAppearanceInactive() {
        return this.f6565t;
    }

    public ColorStateList getItemTextColor() {
        return this.f6563r;
    }

    public int getLabelVisibilityMode() {
        return this.f6557e;
    }

    public f getMenu() {
        return this.L;
    }

    public int getSelectedItemId() {
        return this.f6559n;
    }

    public int getSelectedItemPosition() {
        return this.f6560o;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.C0220f.a(1, this.L.l().size(), 1).f16880a);
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.C = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorLabelPadding : navigationBarItemViewArr) {
                activeIndicatorLabelPadding.setActiveIndicatorLabelPadding(i10);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f6561p = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconTintList : navigationBarItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.J = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.D = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorEnabled : navigationBarItemViewArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.F = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorHeight : navigationBarItemViewArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.G = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorMarginHorizontal : navigationBarItemViewArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.I = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorResizeable : navigationBarItemViewArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(m mVar) {
        this.H = mVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.E = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorWidth : navigationBarItemViewArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f6568w = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f6570y = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f6562q = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconSize : navigationBarItemViewArr) {
                iconSize.setIconSize(i10);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i10, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f6556d.remove(i10);
        } else {
            this.f6556d.put(i10, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().f642a == i10) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.B = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingBottom : navigationBarItemViewArr) {
                itemPaddingBottom.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.A = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingTop : navigationBarItemViewArr) {
                itemPaddingTop.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f6569x = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemRippleColor : navigationBarItemViewArr) {
                itemRippleColor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f6566u = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f6563r;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f6567v = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView textAppearanceActiveBoldEnabled : navigationBarItemViewArr) {
                textAppearanceActiveBoldEnabled.setTextAppearanceActiveBoldEnabled(z10);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f6565t = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f6563r;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f6563r = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f6558f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView textColor : navigationBarItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f6557e = i10;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.K = navigationBarPresenter;
    }
}
