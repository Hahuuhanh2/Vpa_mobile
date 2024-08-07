package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$animator;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l8.h;
import o1.a;
import t7.j;
import w1.d0;
import w1.q0;
import w1.v;
import w1.w0;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int C0 = R$style.Widget_MaterialComponents_BottomAppBar;
    public static final int D0 = R$attr.motionDurationLong2;
    public static final int E0 = R$attr.motionEasingEmphasizedInterpolator;
    public a A0;
    public b B0;

    /* renamed from: e0  reason: collision with root package name */
    public Integer f5749e0;

    /* renamed from: f0  reason: collision with root package name */
    public final h f5750f0;

    /* renamed from: g0  reason: collision with root package name */
    public Animator f5751g0;

    /* renamed from: h0  reason: collision with root package name */
    public Animator f5752h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f5753i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f5754j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f5755k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f5756l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f5757m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f5758n0;

    /* renamed from: o0  reason: collision with root package name */
    public final boolean f5759o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5760p0;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f5761q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f5762r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f5763s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f5764t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5765u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f5766v0;

    /* renamed from: w0  reason: collision with root package name */
    public Behavior f5767w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f5768x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f5769y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5770z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f5776c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5777d;

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

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f5776c);
            parcel.writeInt(this.f5777d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5776c = parcel.readInt();
            this.f5777d = parcel.readInt() != 0;
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (!bottomAppBar.f5765u0) {
                bottomAppBar.F(bottomAppBar.f5753i0, bottomAppBar.f5766v0);
            }
        }
    }

    public class b implements j<FloatingActionButton> {
        public b() {
        }
    }

    public class c implements x.b {
        public c() {
        }

        public final w0 a(View view, w0 w0Var, x.c cVar) {
            boolean z10;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f5761q0) {
                bottomAppBar.f5768x0 = w0Var.b();
            }
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            boolean z11 = true;
            boolean z12 = false;
            if (bottomAppBar2.f5762r0) {
                if (bottomAppBar2.f5770z0 != w0Var.c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                BottomAppBar.this.f5770z0 = w0Var.c();
            } else {
                z10 = false;
            }
            BottomAppBar bottomAppBar3 = BottomAppBar.this;
            if (bottomAppBar3.f5763s0) {
                if (bottomAppBar3.f5769y0 == w0Var.d()) {
                    z11 = false;
                }
                BottomAppBar.this.f5769y0 = w0Var.d();
                z12 = z11;
            }
            if (z10 || z12) {
                BottomAppBar bottomAppBar4 = BottomAppBar.this;
                Animator animator = bottomAppBar4.f5752h0;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar4.f5751g0;
                if (animator2 != null) {
                    animator2.cancel();
                }
                BottomAppBar.this.H();
                BottomAppBar.this.G();
            }
            return w0Var;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        public final void onAnimationEnd(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            int i10 = BottomAppBar.C0;
            bottomAppBar.getClass();
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            bottomAppBar2.f5765u0 = false;
            bottomAppBar2.f5752h0 = null;
        }

        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            int i10 = BottomAppBar.C0;
            bottomAppBar.getClass();
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f5782a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f5783b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f5784c;

        public e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f5782a = actionMenuView;
            this.f5783b = i10;
            this.f5784c = z10;
        }

        public final void run() {
            ActionMenuView actionMenuView = this.f5782a;
            actionMenuView.setTranslationX((float) BottomAppBar.this.C(actionMenuView, this.f5783b, this.f5784c));
        }
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null);
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f5768x0;
    }

    private int getFabAlignmentAnimationDuration() {
        return f8.j.c(getContext(), D0, 300);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return D(this.f5753i0);
    }

    private float getFabTranslationY() {
        if (this.f5755k0 == 1) {
            return -getTopEdgeTreatment().f5799d;
        }
        View B = B();
        int i10 = 0;
        if (B != null) {
            i10 = (-((getMeasuredHeight() + getBottomInset()) - B.getMeasuredHeight())) / 2;
        }
        return (float) i10;
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f5770z0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f5769y0;
    }

    /* access modifiers changed from: private */
    public e getTopEdgeTreatment() {
        return (e) this.f5750f0.f12778a.f12798a.f12833i;
    }

    public final FloatingActionButton A() {
        View B = B();
        if (B instanceof FloatingActionButton) {
            return (FloatingActionButton) B;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View B() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            h1.a r2 = r0.f2046b
            java.lang.Object r2 = r2.f10528b
            v0.h r2 = (v0.h) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = r0.f2048d
            r3.clear()
            if (r2 == 0) goto L_0x0028
            java.util.ArrayList r3 = r0.f2048d
            r3.addAll(r2)
        L_0x0028:
            java.util.ArrayList r0 = r0.f2048d
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x0042
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x002e
        L_0x0042:
            return r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.B():android.view.View");
    }

    public final int C(ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14 = 0;
        if (this.f5758n0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean g2 = x.g(this);
        if (g2) {
            i11 = getMeasuredWidth();
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (!(childAt.getLayoutParams() instanceof Toolbar.LayoutParams) || (((Toolbar.LayoutParams) childAt.getLayoutParams()).f309a & 8388615) != 8388611) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (g2) {
                    i11 = Math.min(i11, childAt.getLeft());
                } else {
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
        }
        if (g2) {
            i12 = actionMenuView.getRight();
        } else {
            i12 = actionMenuView.getLeft();
        }
        if (g2) {
            i13 = this.f5769y0;
        } else {
            i13 = -this.f5770z0;
        }
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.m3_bottomappbar_horizontal_padding);
            if (g2) {
                i14 = dimensionPixelOffset;
            } else {
                i14 = -dimensionPixelOffset;
            }
        }
        return i11 - ((i12 + i13) + i14);
    }

    public final float D(int i10) {
        int i11;
        int i12;
        boolean g2 = x.g(this);
        int i13 = 1;
        if (i10 != 1) {
            return 0.0f;
        }
        View B = B();
        if (g2) {
            i11 = this.f5770z0;
        } else {
            i11 = this.f5769y0;
        }
        if (this.f5757m0 == -1 || B == null) {
            i12 = this.f5756l0 + i11;
        } else {
            i12 = (B.getMeasuredWidth() / 2) + this.f5757m0 + i11;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - i12;
        if (g2) {
            i13 = -1;
        }
        return (float) (measuredWidth * i13);
    }

    public final boolean E() {
        FloatingActionButton A = A();
        if (A == null || !A.j()) {
            return false;
        }
        return true;
    }

    public final void F(int i10, boolean z10) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (!d0.g.c(this)) {
            this.f5765u0 = false;
            int i11 = this.f5764t0;
            if (i11 != 0) {
                this.f5764t0 = 0;
                getMenu().clear();
                k(i11);
                return;
            }
            return;
        }
        Animator animator = this.f5752h0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!E()) {
            i10 = 0;
            z10 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = (float) getFabAlignmentAnimationDuration();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - ((float) C(actionMenuView, i10, z10))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                ofFloat2.addListener(new c(this, actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f5752h0 = animatorSet2;
        animatorSet2.addListener(new d());
        this.f5752h0.start();
    }

    public final void G() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f5752h0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!E()) {
                J(actionMenuView, 0, false, false);
            } else {
                J(actionMenuView, this.f5753i0, this.f5766v0, false);
            }
        }
    }

    public final void H() {
        float f10;
        getTopEdgeTreatment().f5800e = getFabTranslationX();
        h hVar = this.f5750f0;
        if (!this.f5766v0 || !E() || this.f5755k0 != 1) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        hVar.o(f10);
        View B = B();
        if (B != null) {
            B.setTranslationY(getFabTranslationY());
            B.setTranslationX(getFabTranslationX());
        }
    }

    public final void I(int i10) {
        float f10 = (float) i10;
        if (f10 != getTopEdgeTreatment().f5798c) {
            getTopEdgeTreatment().f5798c = f10;
            this.f5750f0.invalidateSelf();
        }
    }

    public final void J(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f5750f0.f12778a.f12803f;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f5799d;
    }

    public int getFabAlignmentMode() {
        return this.f5753i0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f5757m0;
    }

    public int getFabAnchorMode() {
        return this.f5755k0;
    }

    public int getFabAnimationMode() {
        return this.f5754j0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f5797b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f5796a;
    }

    public boolean getHideOnScroll() {
        return this.f5760p0;
    }

    public int getMenuAlignmentMode() {
        return this.f5758n0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.b.X(this, this.f5750f0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f5752h0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f5751g0;
            if (animator2 != null) {
                animator2.cancel();
            }
            H();
            View B = B();
            if (B != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.g.c(B)) {
                    B.post(new v(1, B));
                }
            }
        }
        G();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        this.f5753i0 = savedState.f5776c;
        this.f5766v0 = savedState.f5777d;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        savedState.f5776c = this.f5753i0;
        savedState.f5777d = this.f5766v0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(this.f5750f0, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            e topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f5799d = f10;
                this.f5750f0.invalidateSelf();
                H();
                return;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f10) {
        this.f5750f0.m(f10);
        h hVar = this.f5750f0;
        int i10 = hVar.f12778a.f12814q - hVar.i();
        Behavior behavior = getBehavior();
        behavior.f5730o = i10;
        if (behavior.f5729n == 1) {
            setTranslationY((float) (behavior.f5728f + i10));
        }
    }

    public void setFabAlignmentMode(int i10) {
        setFabAlignmentModeAndReplaceMenu(i10, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i10, int i11) {
        this.f5764t0 = i11;
        this.f5765u0 = true;
        F(i10, this.f5766v0);
        if (this.f5753i0 != i10) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.g.c(this)) {
                Animator animator = this.f5751g0;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f5754j0 == 1) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(A(), "translationX", new float[]{D(i10)});
                    ofFloat.setDuration((long) getFabAlignmentAnimationDuration());
                    arrayList.add(ofFloat);
                } else {
                    FloatingActionButton A = A();
                    if (A != null && !A.i()) {
                        A.h(new b(this, i10), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(f8.j.d(getContext(), E0, t7.b.f14885a));
                this.f5751g0 = animatorSet;
                animatorSet.addListener(new a(this));
                this.f5751g0.start();
            }
        }
        this.f5753i0 = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f5757m0 != i10) {
            this.f5757m0 = i10;
            H();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f5755k0 = i10;
        H();
        View B = B();
        if (B != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) B.getLayoutParams();
            eVar.f2070d = 17;
            int i11 = this.f5755k0;
            if (i11 == 1) {
                eVar.f2070d = 49;
            }
            if (i11 == 0) {
                eVar.f2070d |= 80;
            }
            B.requestLayout();
            this.f5750f0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f5754j0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f5801f) {
            getTopEdgeTreatment().f5801f = f10;
            this.f5750f0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f5797b = f10;
            this.f5750f0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f5796a = f10;
            this.f5750f0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f5760p0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f5758n0 != i10) {
            this.f5758n0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                J(actionMenuView, this.f5753i0, E(), false);
            }
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f5749e0 == null)) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f5749e0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f5749e0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.bottomAppBarStyle);
    }

    public Behavior getBehavior() {
        if (this.f5767w0 == null) {
            this.f5767w0 = new Behavior();
        }
        return this.f5767w0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: t  reason: collision with root package name */
        public final Rect f5771t = new Rect();

        /* renamed from: u  reason: collision with root package name */
        public WeakReference<BottomAppBar> f5772u;

        /* renamed from: v  reason: collision with root package name */
        public int f5773v;

        /* renamed from: w  reason: collision with root package name */
        public final a f5774w = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = Behavior.this.f5772u.get();
                if (bottomAppBar == null || (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect = Behavior.this.f5771t;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.k(rect);
                    int height2 = Behavior.this.f5771t.height();
                    bottomAppBar.I(height2);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f12829e.a(new RectF(Behavior.this.f5771t)));
                    height = height2;
                }
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
                if (Behavior.this.f5773v == 0) {
                    if (bottomAppBar.f5755k0 == 1) {
                        eVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    eVar.leftMargin = bottomAppBar.getLeftInset();
                    eVar.rightMargin = bottomAppBar.getRightInset();
                    if (x.g(view)) {
                        eVar.leftMargin += bottomAppBar.f5756l0;
                    } else {
                        eVar.rightMargin += bottomAppBar.f5756l0;
                    }
                }
                int i18 = BottomAppBar.C0;
                bottomAppBar.H();
            }
        }

        public Behavior() {
        }

        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f5772u = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.C0;
            View B = bottomAppBar.B();
            if (B != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (!d0.g.c(B)) {
                    CoordinatorLayout.e eVar = (CoordinatorLayout.e) B.getLayoutParams();
                    eVar.f2070d = 17;
                    int i12 = bottomAppBar.f5755k0;
                    if (i12 == 1) {
                        eVar.f2070d = 49;
                    }
                    if (i12 == 0) {
                        eVar.f2070d |= 80;
                    }
                    this.f5773v = ((CoordinatorLayout.e) B.getLayoutParams()).bottomMargin;
                    if (B instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) B;
                        if (bottomAppBar.f5755k0 == 0 && bottomAppBar.f5759o0) {
                            d0.i.s(floatingActionButton, 0.0f);
                            floatingActionButton.setCompatElevation(0.0f);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R$animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R$animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d(bottomAppBar.A0);
                        floatingActionButton.e(new d(bottomAppBar));
                        floatingActionButton.f(bottomAppBar.B0);
                    }
                    B.addOnLayoutChangeListener(this.f5774w);
                    bottomAppBar.H();
                }
            }
            coordinatorLayout.u(i10, bottomAppBar);
            super.l(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll() || !super.t(coordinatorLayout, bottomAppBar, view2, view3, i10, i11)) {
                return false;
            }
            return true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = C0
            android.content.Context r13 = p8.a.a(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            l8.h r13 = new l8.h
            r13.<init>()
            r12.f5750f0 = r13
            r7 = 0
            r12.f5764t0 = r7
            r12.f5765u0 = r7
            r8 = 1
            r12.f5766v0 = r8
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r12.A0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r12.B0 = r0
            android.content.Context r9 = r12.getContext()
            int[] r2 = com.google.android.material.R$styleable.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r14
            r3 = r15
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R$styleable.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = i8.c.a(r9, r0, r1)
            int r2 = com.google.android.material.R$styleable.BottomAppBar_navigationIconTint
            boolean r3 = r0.hasValue(r2)
            r4 = -1
            if (r3 == 0) goto L_0x004c
            int r2 = r0.getColor(r2, r4)
            r12.setNavigationIconTint(r2)
        L_0x004c:
            int r2 = com.google.android.material.R$styleable.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = com.google.android.material.R$styleable.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r5 = com.google.android.material.R$styleable.BottomAppBar_fabCradleRoundedCornerRadius
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r10 = com.google.android.material.R$styleable.BottomAppBar_fabCradleVerticalOffset
            int r10 = r0.getDimensionPixelOffset(r10, r7)
            float r10 = (float) r10
            int r11 = com.google.android.material.R$styleable.BottomAppBar_fabAlignmentMode
            int r11 = r0.getInt(r11, r7)
            r12.f5753i0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_fabAnimationMode
            int r11 = r0.getInt(r11, r7)
            r12.f5754j0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_fabAnchorMode
            int r11 = r0.getInt(r11, r8)
            r12.f5755k0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_removeEmbeddedFabElevation
            boolean r11 = r0.getBoolean(r11, r8)
            r12.f5759o0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_menuAlignmentMode
            int r11 = r0.getInt(r11, r7)
            r12.f5758n0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_hideOnScroll
            boolean r11 = r0.getBoolean(r11, r7)
            r12.f5760p0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r11 = r0.getBoolean(r11, r7)
            r12.f5761q0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r11 = r0.getBoolean(r11, r7)
            r12.f5762r0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_paddingRightSystemWindowInsets
            boolean r11 = r0.getBoolean(r11, r7)
            r12.f5763s0 = r11
            int r11 = com.google.android.material.R$styleable.BottomAppBar_fabAlignmentModeEndMargin
            int r4 = r0.getDimensionPixelOffset(r11, r4)
            r12.f5757m0 = r4
            int r4 = com.google.android.material.R$styleable.BottomAppBar_addElevationShadow
            boolean r4 = r0.getBoolean(r4, r8)
            r0.recycle()
            android.content.res.Resources r0 = r12.getResources()
            int r11 = com.google.android.material.R$dimen.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r11)
            r12.f5756l0 = r0
            com.google.android.material.bottomappbar.e r0 = new com.google.android.material.bottomappbar.e
            r0.<init>(r3, r5, r10)
            l8.m$a r3 = new l8.m$a
            r3.<init>()
            r3.f12845i = r0
            l8.m r0 = new l8.m
            r0.<init>(r3)
            r13.setShapeAppearanceModel(r0)
            if (r4 == 0) goto L_0x00e7
            r0 = 2
            r13.r(r0)
            goto L_0x00f6
        L_0x00e7:
            r13.r(r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto L_0x00f6
            r12.setOutlineAmbientShadowColor(r7)
            r12.setOutlineSpotShadowColor(r7)
        L_0x00f6:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r13.p(r0)
            r13.k(r9)
            float r0 = (float) r2
            r12.setElevation(r0)
            o1.a.b.h(r13, r1)
            java.util.WeakHashMap<android.view.View, w1.q0> r0 = w1.d0.f16298a
            w1.d0.d.q(r12, r13)
            com.google.android.material.bottomappbar.BottomAppBar$c r13 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r13.<init>()
            android.content.Context r0 = r12.getContext()
            int[] r1 = com.google.android.material.R$styleable.Insets
            android.content.res.TypedArray r14 = r0.obtainStyledAttributes(r14, r1, r15, r6)
            int r15 = com.google.android.material.R$styleable.Insets_paddingBottomSystemWindowInsets
            boolean r15 = r14.getBoolean(r15, r7)
            int r0 = com.google.android.material.R$styleable.Insets_paddingLeftSystemWindowInsets
            boolean r0 = r14.getBoolean(r0, r7)
            int r1 = com.google.android.material.R$styleable.Insets_paddingRightSystemWindowInsets
            boolean r1 = r14.getBoolean(r1, r7)
            r14.recycle()
            com.google.android.material.internal.w r14 = new com.google.android.material.internal.w
            r14.<init>(r15, r0, r1, r13)
            com.google.android.material.internal.x.b(r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
