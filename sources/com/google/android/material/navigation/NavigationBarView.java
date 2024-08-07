package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.n0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.u;
import java.util.WeakHashMap;
import l.f;
import l8.h;
import l8.m;
import o1.a;
import w1.d0;
import w1.q0;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final e f6578a;

    /* renamed from: b  reason: collision with root package name */
    public final NavigationBarMenuView f6579b;

    /* renamed from: c  reason: collision with root package name */
    public final NavigationBarPresenter f6580c;

    /* renamed from: d  reason: collision with root package name */
    public f f6581d;

    /* renamed from: e  reason: collision with root package name */
    public c f6582e;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f6583c;

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
            parcel.writeBundle(this.f6583c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6583c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public class a implements f.a {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00aa, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ab, code lost:
            if (r5 != false) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(androidx.appcompat.view.menu.f r4, android.view.MenuItem r5) {
            /*
                r3 = this;
                com.google.android.material.navigation.NavigationBarView r4 = com.google.android.material.navigation.NavigationBarView.this
                r4.getClass()
                r4 = 1
                com.google.android.material.navigation.NavigationBarView r0 = com.google.android.material.navigation.NavigationBarView.this
                com.google.android.material.navigation.NavigationBarView$c r0 = r0.f6582e
                r1 = 0
                if (r0 == 0) goto L_0x00ae
                c0.q0 r0 = (c0.q0) r0
                java.lang.Object r0 = r0.f4316b
                com.vpa.daugia.ui.MainActivity r0 = (com.vpa.daugia.ui.MainActivity) r0
                int r2 = com.vpa.daugia.ui.MainActivity.Z
                java.lang.String r2 = "this$0"
                sk.j.f(r0, r2)
                java.lang.String r2 = "item"
                sk.j.f(r5, r2)
                int r5 = r5.getItemId()
                switch(r5) {
                    case 2131362420: goto L_0x0098;
                    case 2131362421: goto L_0x0088;
                    case 2131362430: goto L_0x0078;
                    case 2131362431: goto L_0x0039;
                    case 2131362432: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                goto L_0x00aa
            L_0x0028:
                r5 = 2
                r0.R = r5
                d2.l r5 = r0.M()
                mg.g0 r5 = (mg.g0) r5
                androidx.viewpager2.widget.ViewPager2 r5 = r5.f21069x
                int r0 = r0.R
                r5.setCurrentItem(r0, r1)
                goto L_0x00a8
            L_0x0039:
                com.vpa.daugia.di.App$a r5 = com.vpa.daugia.di.App.f19364o
                com.vpa.daugia.di.App r5 = r5.a()
                boolean r5 = r5.a()
                if (r5 == 0) goto L_0x0056
                r5 = 4
                r0.R = r5
                d2.l r5 = r0.M()
                mg.g0 r5 = (mg.g0) r5
                androidx.viewpager2.widget.ViewPager2 r5 = r5.f21069x
                int r0 = r0.R
                r5.setCurrentItem(r0, r1)
                goto L_0x00a8
            L_0x0056:
                ph.b r5 = new ph.b
                r5.<init>(r0)
                r0.V = r5
                wi.f r2 = new wi.f
                r2.<init>(r0)
                r5.f22646o = r2
                ph.b r5 = r0.V
                if (r5 != 0) goto L_0x0069
                goto L_0x0070
            L_0x0069:
                wi.g r2 = new wi.g
                r2.<init>(r0)
                r5.f22645n = r2
            L_0x0070:
                ph.b r5 = r0.V
                if (r5 == 0) goto L_0x00aa
                r5.show()
                goto L_0x00aa
            L_0x0078:
                r0.R = r1
                d2.l r5 = r0.M()
                mg.g0 r5 = (mg.g0) r5
                androidx.viewpager2.widget.ViewPager2 r5 = r5.f21069x
                int r0 = r0.R
                r5.setCurrentItem(r0, r1)
                goto L_0x00a8
            L_0x0088:
                r0.R = r4
                d2.l r5 = r0.M()
                mg.g0 r5 = (mg.g0) r5
                androidx.viewpager2.widget.ViewPager2 r5 = r5.f21069x
                int r0 = r0.R
                r5.setCurrentItem(r0, r1)
                goto L_0x00a8
            L_0x0098:
                r5 = 3
                r0.R = r5
                d2.l r5 = r0.M()
                mg.g0 r5 = (mg.g0) r5
                androidx.viewpager2.widget.ViewPager2 r5 = r5.f21069x
                int r0 = r0.R
                r5.setCurrentItem(r0, r1)
            L_0x00a8:
                r5 = r4
                goto L_0x00ab
            L_0x00aa:
                r5 = r1
            L_0x00ab:
                if (r5 != 0) goto L_0x00ae
                goto L_0x00af
            L_0x00ae:
                r4 = r1
            L_0x00af:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarView.a.a(androidx.appcompat.view.menu.f, android.view.MenuItem):boolean");
        }

        public final void b(androidx.appcompat.view.menu.f fVar) {
        }
    }

    public interface b {
        void a();
    }

    public interface c {
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(p8.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f6580c = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = R$styleable.NavigationBarView;
        int i12 = R$styleable.NavigationBarView_itemTextAppearanceInactive;
        int i13 = R$styleable.NavigationBarView_itemTextAppearanceActive;
        n0 e10 = u.e(context2, attributeSet, iArr, i10, i11, i12, i13);
        e eVar = new e(context2, getClass(), getMaxItemCount());
        this.f6578a = eVar;
        NavigationBarMenuView a10 = a(context2);
        this.f6579b = a10;
        navigationBarPresenter.f6573a = a10;
        navigationBarPresenter.f6575c = 1;
        a10.setPresenter(navigationBarPresenter);
        eVar.b(navigationBarPresenter, eVar.f615a);
        getContext();
        navigationBarPresenter.f6573a.L = eVar;
        int i14 = R$styleable.NavigationBarView_itemIconTint;
        if (e10.l(i14)) {
            a10.setIconTintList(e10.b(i14));
        } else {
            a10.setIconTintList(a10.c(16842808));
        }
        setItemIconSize(e10.d(R$styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R$dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e10.l(i12)) {
            setItemTextAppearanceInactive(e10.i(i12, 0));
        }
        if (e10.l(i13)) {
            setItemTextAppearanceActive(e10.i(i13, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(e10.a(R$styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        int i15 = R$styleable.NavigationBarView_itemTextColor;
        if (e10.l(i15)) {
            setItemTextColor(e10.b(i15));
        }
        Drawable background = getBackground();
        ColorStateList d10 = b8.b.d(background);
        if (background == null || d10 != null) {
            h hVar = new h(new m(m.c(context2, attributeSet, i10, i11)));
            if (d10 != null) {
                hVar.n(d10);
            }
            hVar.k(context2);
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.q(this, hVar);
        }
        int i16 = R$styleable.NavigationBarView_itemPaddingTop;
        if (e10.l(i16)) {
            setItemPaddingTop(e10.d(i16, 0));
        }
        int i17 = R$styleable.NavigationBarView_itemPaddingBottom;
        if (e10.l(i17)) {
            setItemPaddingBottom(e10.d(i17, 0));
        }
        int i18 = R$styleable.NavigationBarView_activeIndicatorLabelPadding;
        if (e10.l(i18)) {
            setActiveIndicatorLabelPadding(e10.d(i18, 0));
        }
        int i19 = R$styleable.NavigationBarView_elevation;
        if (e10.l(i19)) {
            setElevation((float) e10.d(i19, 0));
        }
        a.b.h(getBackground().mutate(), i8.c.b(context2, e10, R$styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(e10.f1157b.getInteger(R$styleable.NavigationBarView_labelVisibilityMode, -1));
        int i20 = e10.i(R$styleable.NavigationBarView_itemBackground, 0);
        if (i20 != 0) {
            a10.setItemBackgroundRes(i20);
        } else {
            setItemRippleColor(i8.c.b(context2, e10, R$styleable.NavigationBarView_itemRippleColor));
        }
        int i21 = e10.i(R$styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (i21 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i21, R$styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(i8.c.a(context2, obtainStyledAttributes, R$styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(new m(m.a(context2, obtainStyledAttributes.getResourceId(R$styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0)));
            obtainStyledAttributes.recycle();
        }
        int i22 = R$styleable.NavigationBarView_menu;
        if (e10.l(i22)) {
            int i23 = e10.i(i22, 0);
            navigationBarPresenter.f6574b = true;
            getMenuInflater().inflate(i23, eVar);
            navigationBarPresenter.f6574b = false;
            navigationBarPresenter.d(true);
        }
        e10.n();
        addView(a10);
        eVar.f619e = new a();
    }

    private MenuInflater getMenuInflater() {
        if (this.f6581d == null) {
            this.f6581d = new l.f(getContext());
        }
        return this.f6581d;
    }

    public abstract NavigationBarMenuView a(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f6579b.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f6579b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f6579b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f6579b.getItemActiveIndicatorMarginHorizontal();
    }

    public m getItemActiveIndicatorShapeAppearance() {
        return this.f6579b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f6579b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f6579b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f6579b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f6579b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f6579b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f6579b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f6579b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f6579b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f6579b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f6579b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f6579b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f6579b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f6578a;
    }

    public k getMenuView() {
        return this.f6579b;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f6580c;
    }

    public int getSelectedItemId() {
        return this.f6579b.getSelectedItemId();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.b.W(this);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        this.f6578a.t(savedState.f6583c);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f6583c = bundle;
        this.f6578a.v(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f6579b.setActiveIndicatorLabelPadding(i10);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.b.U(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f6579b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f6579b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f6579b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f6579b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(m mVar) {
        this.f6579b.setItemActiveIndicatorShapeAppearance(mVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f6579b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f6579b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f6579b.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f6579b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f6579b.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i10, View.OnTouchListener onTouchListener) {
        this.f6579b.setItemOnTouchListener(i10, onTouchListener);
    }

    public void setItemPaddingBottom(int i10) {
        this.f6579b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f6579b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f6579b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f6579b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f6579b.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f6579b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f6579b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f6579b.getLabelVisibilityMode() != i10) {
            this.f6579b.setLabelVisibilityMode(i10);
            this.f6580c.d(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f6582e = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem findItem = this.f6578a.findItem(i10);
        if (findItem != null && !this.f6578a.q(findItem, this.f6580c, 0)) {
            findItem.setChecked(true);
        }
    }
}
