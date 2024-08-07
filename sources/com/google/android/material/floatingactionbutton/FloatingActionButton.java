package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.b;
import com.google.android.material.bottomappbar.d;
import com.google.android.material.bottomappbar.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.g;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import e8.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import l8.q;
import t7.j;
import w1.d0;
import w1.q0;

public class FloatingActionButton extends VisibilityAwareImageButton implements d8.a, q, CoordinatorLayout.b {

    /* renamed from: y  reason: collision with root package name */
    public static final int f6256y = R$style.Widget_Design_FloatingActionButton;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f6257b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f6258c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f6259d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f6260e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f6261f;

    /* renamed from: n  reason: collision with root package name */
    public int f6262n;

    /* renamed from: o  reason: collision with root package name */
    public int f6263o;

    /* renamed from: p  reason: collision with root package name */
    public int f6264p;

    /* renamed from: q  reason: collision with root package name */
    public int f6265q;

    /* renamed from: r  reason: collision with root package name */
    public int f6266r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6267s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f6268t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f6269u;

    /* renamed from: v  reason: collision with root package name */
    public final i f6270v;

    /* renamed from: w  reason: collision with root package name */
    public final d8.b f6271w;

    /* renamed from: x  reason: collision with root package name */
    public f f6272x;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class b implements k8.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements g.f {

        /* renamed from: a  reason: collision with root package name */
        public final j<T> f6276a;

        public c(BottomAppBar.b bVar) {
            this.f6276a = bVar;
        }

        public final void a() {
            j<T> jVar = this.f6276a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.b bVar = (BottomAppBar.b) jVar;
            bVar.getClass();
            if (BottomAppBar.this.f5755k0 == 1) {
                float translationX = floatingActionButton.getTranslationX();
                if (BottomAppBar.this.getTopEdgeTreatment().f5800e != translationX) {
                    BottomAppBar.this.getTopEdgeTreatment().f5800e = translationX;
                    BottomAppBar.this.f5750f0.invalidateSelf();
                }
                float f10 = 0.0f;
                float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                if (BottomAppBar.this.getTopEdgeTreatment().f5799d != max) {
                    e z10 = BottomAppBar.this.getTopEdgeTreatment();
                    if (max >= 0.0f) {
                        z10.f5799d = max;
                        BottomAppBar.this.f5750f0.invalidateSelf();
                    } else {
                        z10.getClass();
                        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                    }
                }
                h hVar = BottomAppBar.this.f5750f0;
                if (floatingActionButton.getVisibility() == 0) {
                    f10 = floatingActionButton.getScaleY();
                }
                hVar.o(f10);
            }
        }

        public final void b() {
            float f10;
            j<T> jVar = this.f6276a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.b bVar = (BottomAppBar.b) jVar;
            bVar.getClass();
            h hVar = BottomAppBar.this.f5750f0;
            if (floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f5755k0 == 1) {
                f10 = floatingActionButton.getScaleY();
            } else {
                f10 = 0.0f;
            }
            hVar.o(f10);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c) || !((c) obj).f6276a.equals(this.f6276a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f6276a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private g getImpl() {
        if (this.f6272x == null) {
            this.f6272x = new f(this, new b());
        }
        return this.f6272x;
    }

    public final boolean a() {
        return this.f6271w.f8770b;
    }

    public final void d(BottomAppBar.a aVar) {
        g impl = getImpl();
        if (impl.f6312t == null) {
            impl.f6312t = new ArrayList<>();
        }
        impl.f6312t.add(aVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(d dVar) {
        g impl = getImpl();
        if (impl.f6311s == null) {
            impl.f6311s = new ArrayList<>();
        }
        impl.f6311s.add(dVar);
    }

    public final void f(BottomAppBar.b bVar) {
        g impl = getImpl();
        c cVar = new c(bVar);
        if (impl.f6313u == null) {
            impl.f6313u = new ArrayList<>();
        }
        impl.f6313u.add(cVar);
    }

    public final int g(int i10) {
        int i11 = this.f6264p;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(R$dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R$dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return g(1);
        } else {
            return g(0);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f6257b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f6258c;
    }

    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f6301i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f6302j;
    }

    public Drawable getContentBackground() {
        return getImpl().f6297e;
    }

    public int getCustomSize() {
        return this.f6264p;
    }

    public int getExpandedComponentIdHint() {
        return this.f6271w.f8771c;
    }

    public t7.h getHideMotionSpec() {
        return getImpl().f6306n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f6261f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f6261f;
    }

    public m getShapeAppearanceModel() {
        m mVar = getImpl().f6293a;
        mVar.getClass();
        return mVar;
    }

    public t7.h getShowMotionSpec() {
        return getImpl().f6305m;
    }

    public int getSize() {
        return this.f6263o;
    }

    public int getSizeDimension() {
        return g(this.f6263o);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f6259d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f6260e;
    }

    public boolean getUseCompatPadding() {
        return this.f6267s;
    }

    public final void h(com.google.android.material.bottomappbar.b bVar, boolean z10) {
        d dVar;
        boolean z11;
        int i10;
        AnimatorSet animatorSet;
        g impl = getImpl();
        if (bVar == null) {
            dVar = null;
        } else {
            dVar = new d(this, bVar);
        }
        boolean z12 = true;
        if (impl.f6314v.getVisibility() != 0 ? impl.f6310r == 2 : impl.f6310r != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            Animator animator = impl.f6304l;
            if (animator != null) {
                animator.cancel();
            }
            FloatingActionButton floatingActionButton = impl.f6314v;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (!d0.g.c(floatingActionButton) || impl.f6314v.isInEditMode()) {
                z12 = false;
            }
            if (z12) {
                t7.h hVar = impl.f6306n;
                if (hVar != null) {
                    animatorSet = impl.b(hVar, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = impl.c(0.0f, 0.4f, 0.4f, g.F, g.G);
                }
                animatorSet.addListener(new e(impl, z10, dVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f6312t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            FloatingActionButton floatingActionButton2 = impl.f6314v;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton2.b(i10, z10);
            if (dVar != null) {
                dVar.f6284a.a(dVar.f6285b);
            }
        }
    }

    public final boolean i() {
        g impl = getImpl();
        if (impl.f6314v.getVisibility() == 0) {
            if (impl.f6310r != 1) {
                return false;
            }
        } else if (impl.f6310r == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        g impl = getImpl();
        if (impl.f6314v.getVisibility() != 0) {
            if (impl.f6310r != 2) {
                return false;
            }
        } else if (impl.f6310r == 1) {
            return false;
        }
        return true;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f6268t;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f6259d;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f6260e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(androidx.appcompat.widget.g.c(colorForState, mode));
        }
    }

    public final void m(b.a aVar, boolean z10) {
        d dVar;
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        float f10;
        float f11;
        g impl = getImpl();
        if (aVar == null) {
            dVar = null;
        } else {
            dVar = new d(this, aVar);
        }
        boolean z13 = true;
        if (impl.f6314v.getVisibility() == 0 ? impl.f6310r == 1 : impl.f6310r != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            Animator animator = impl.f6304l;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f6305m == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            FloatingActionButton floatingActionButton = impl.f6314v;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (!d0.g.c(floatingActionButton) || impl.f6314v.isInEditMode()) {
                z13 = false;
            }
            if (z13) {
                if (impl.f6314v.getVisibility() != 0) {
                    float f12 = 0.0f;
                    impl.f6314v.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton2 = impl.f6314v;
                    if (z12) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton2.setScaleY(f10);
                    FloatingActionButton floatingActionButton3 = impl.f6314v;
                    if (z12) {
                        f11 = 0.4f;
                    } else {
                        f11 = 0.0f;
                    }
                    floatingActionButton3.setScaleX(f11);
                    if (z12) {
                        f12 = 0.4f;
                    }
                    impl.f6308p = f12;
                    Matrix matrix = impl.A;
                    impl.a(f12, matrix);
                    impl.f6314v.setImageMatrix(matrix);
                }
                t7.h hVar = impl.f6305m;
                if (hVar != null) {
                    animatorSet = impl.b(hVar, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = impl.c(1.0f, 1.0f, 1.0f, g.D, g.E);
                }
                animatorSet.addListener(new f(impl, z10, dVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f6311s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl.f6314v.b(0, z10);
            impl.f6314v.setAlpha(1.0f);
            impl.f6314v.setScaleY(1.0f);
            impl.f6314v.setScaleX(1.0f);
            impl.f6308p = 1.0f;
            Matrix matrix2 = impl.A;
            impl.a(1.0f, matrix2);
            impl.f6314v.setImageMatrix(matrix2);
            if (dVar != null) {
                dVar.f6284a.b();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g impl = getImpl();
        h hVar = impl.f6294b;
        if (hVar != null) {
            m9.b.X(impl.f6314v, hVar);
        }
        if (!(impl instanceof f)) {
            ViewTreeObserver viewTreeObserver = impl.f6314v.getViewTreeObserver();
            if (impl.B == null) {
                impl.B = new e8.e(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.B);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f6314v.getViewTreeObserver();
        e8.e eVar = impl.B;
        if (eVar != null) {
            viewTreeObserver.removeOnPreDrawListener(eVar);
            impl.B = null;
        }
    }

    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f6265q = (sizeDimension - this.f6266r) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f6268t;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f2188a);
        d8.b bVar = this.f6271w;
        Bundle orDefault = extendableSavedState.f6866c.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        bVar.getClass();
        bVar.f8770b = orDefault.getBoolean("expanded", false);
        bVar.f8771c = orDefault.getInt("expandedComponentIdHint", 0);
        if (bVar.f8770b) {
            ViewParent parent = bVar.f8769a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).g(bVar.f8769a);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        v0.h<String, Bundle> hVar = extendableSavedState.f6866c;
        d8.b bVar = this.f6271w;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f8770b);
        bundle.putInt("expandedComponentIdHint", bVar.f8771c);
        hVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f6269u;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k(rect);
            f fVar = this.f6272x;
            if (fVar.f6298f) {
                i10 = Math.max((fVar.f6303k - fVar.f6314v.getSizeDimension()) / 2, 0);
            } else {
                i10 = 0;
            }
            int i11 = -i10;
            rect.inset(i11, i11);
            if (!this.f6269u.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i10) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i10) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f6257b != colorStateList) {
            this.f6257b = colorStateList;
            g impl = getImpl();
            h hVar = impl.f6294b;
            if (hVar != null) {
                hVar.setTintList(colorStateList);
            }
            e8.b bVar = impl.f6296d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f9257m = colorStateList.getColorForState(bVar.getState(), bVar.f9257m);
                }
                bVar.f9260p = colorStateList;
                bVar.f9258n = true;
                bVar.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f6258c != mode) {
            this.f6258c = mode;
            h hVar = getImpl().f6294b;
            if (hVar != null) {
                hVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        g impl = getImpl();
        if (impl.f6300h != f10) {
            impl.f6300h = f10;
            impl.k(f10, impl.f6301i, impl.f6302j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        g impl = getImpl();
        if (impl.f6301i != f10) {
            impl.f6301i = f10;
            impl.k(impl.f6300h, f10, impl.f6302j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        g impl = getImpl();
        if (impl.f6302j != f10) {
            impl.f6302j = f10;
            impl.k(impl.f6300h, impl.f6301i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.f6264p) {
            this.f6264p = i10;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h hVar = getImpl().f6294b;
        if (hVar != null) {
            hVar.m(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f6298f) {
            getImpl().f6298f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f6271w.f8771c = i10;
    }

    public void setHideMotionSpec(t7.h hVar) {
        getImpl().f6306n = hVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(t7.h.b(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            g impl = getImpl();
            float f10 = impl.f6308p;
            impl.f6308p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f6314v.setImageMatrix(matrix);
            if (this.f6259d != null) {
                l();
            }
        }
    }

    public void setImageResource(int i10) {
        this.f6270v.c(i10);
        l();
    }

    public void setMaxImageSize(int i10) {
        this.f6266r = i10;
        g impl = getImpl();
        if (impl.f6309q != i10) {
            impl.f6309q = i10;
            float f10 = impl.f6308p;
            impl.f6308p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f6314v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<g.f> arrayList = getImpl().f6313u;
        if (arrayList != null) {
            Iterator<g.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<g.f> arrayList = getImpl().f6313u;
        if (arrayList != null) {
            Iterator<g.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        g impl = getImpl();
        impl.f6299g = z10;
        impl.q();
    }

    public void setShapeAppearanceModel(m mVar) {
        getImpl().n(mVar);
    }

    public void setShowMotionSpec(t7.h hVar) {
        getImpl().f6305m = hVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(t7.h.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f6264p = 0;
        if (i10 != this.f6263o) {
            this.f6263o = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f6259d != colorStateList) {
            this.f6259d = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f6260e != mode) {
            this.f6260e = mode;
            l();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f6267s != z10) {
            this.f6267s = z10;
            getImpl().i();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f6273a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6274b;

        public BaseBehavior() {
            this.f6274b = true;
        }

        public final boolean e(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f6268t;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void g(CoordinatorLayout.e eVar) {
            if (eVar.f2074h == 0) {
                eVar.f2074h = 80;
            }
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.e) {
                    z10 = ((CoordinatorLayout.e) layoutParams).f2067a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    y(view2, floatingActionButton);
                }
            }
            return false;
        }

        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList o10 = coordinatorLayout.o(floatingActionButton);
            int size = o10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) o10.get(i13);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.e) {
                        z10 = ((CoordinatorLayout.e) layoutParams).f2067a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && y(view2, floatingActionButton)) {
                        break;
                    }
                } else if (x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.u(i10, floatingActionButton);
            Rect rect = floatingActionButton.f6268t;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin) {
                i11 = rect.right;
            } else if (floatingActionButton.getLeft() <= eVar.leftMargin) {
                i11 = -rect.left;
            } else {
                i11 = 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                i12 = rect.bottom;
            } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                i12 = -rect.top;
            }
            if (i12 != 0) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                floatingActionButton.offsetTopAndBottom(i12);
            }
            if (i11 == 0) {
                return true;
            }
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            floatingActionButton.offsetLeftAndRight(i11);
            return true;
        }

        public final boolean w(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            if (this.f6274b && eVar.f2072f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!w(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f6273a == null) {
                this.f6273a = new Rect();
            }
            Rect rect = this.f6273a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h((com.google.android.material.bottomappbar.b) null, false);
                return true;
            }
            floatingActionButton.m((b.a) null, false);
            return true;
        }

        public final boolean y(View view, FloatingActionButton floatingActionButton) {
            if (!w(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.h((com.google.android.material.bottomappbar.b) null, false);
                return true;
            }
            floatingActionButton.m((b.a) null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.f6274b = obtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f6261f != colorStateList) {
            this.f6261f = colorStateList;
            getImpl().m(this.f6261f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f6256y
            android.content.Context r11 = p8.a.a(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f6268t = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f6269u = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = com.google.android.material.R$styleable.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R$styleable.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = i8.c.a(r11, r0, r1)
            r10.f6257b = r1
            int r1 = com.google.android.material.R$styleable.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.x.h(r1, r3)
            r10.f6258c = r1
            int r1 = com.google.android.material.R$styleable.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = i8.c.a(r11, r0, r1)
            r10.f6261f = r1
            int r1 = com.google.android.material.R$styleable.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.f6263o = r1
            int r1 = com.google.android.material.R$styleable.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f6264p = r1
            int r1 = com.google.android.material.R$styleable.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f6262n = r1
            int r1 = com.google.android.material.R$styleable.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = com.google.android.material.R$styleable.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = com.google.android.material.R$styleable.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = com.google.android.material.R$styleable.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f6267s = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = com.google.android.material.R$dimen.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = com.google.android.material.R$styleable.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.setMaxImageSize(r5)
            int r5 = com.google.android.material.R$styleable.FloatingActionButton_showMotionSpec
            t7.h r5 = t7.h.a(r11, r0, r5)
            int r8 = com.google.android.material.R$styleable.FloatingActionButton_hideMotionSpec
            t7.h r8 = t7.h.a(r11, r0, r8)
            l8.k r9 = l8.m.f12824m
            l8.m$a r11 = l8.m.d(r11, r12, r13, r6, r9)
            l8.m r6 = new l8.m
            r6.<init>(r11)
            int r11 = com.google.android.material.R$styleable.FloatingActionButton_ensureMinTouchTargetSize
            boolean r11 = r0.getBoolean(r11, r7)
            int r7 = com.google.android.material.R$styleable.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.i r0 = new androidx.appcompat.widget.i
            r0.<init>(r10)
            r10.f6270v = r0
            r0.b(r12, r13)
            d8.b r12 = new d8.b
            r12.<init>(r10)
            r10.f6271w = r12
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            r12.n(r6)
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            android.content.res.ColorStateList r13 = r10.f6257b
            android.graphics.PorterDuff$Mode r0 = r10.f6258c
            android.content.res.ColorStateList r6 = r10.f6261f
            int r7 = r10.f6262n
            r12.g(r13, r0, r6, r7)
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            r12.f6303k = r4
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            float r13 = r12.f6300h
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 == 0) goto L_0x00f6
            r12.f6300h = r1
            float r13 = r12.f6301i
            float r0 = r12.f6302j
            r12.k(r1, r13, r0)
        L_0x00f6:
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            float r13 = r12.f6301i
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x0109
            r12.f6301i = r3
            float r13 = r12.f6300h
            float r0 = r12.f6302j
            r12.k(r13, r3, r0)
        L_0x0109:
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            float r13 = r12.f6302j
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x011c
            r12.f6302j = r2
            float r13 = r12.f6300h
            float r0 = r12.f6301i
            r12.k(r13, r0, r2)
        L_0x011c:
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            r12.f6305m = r5
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            r12.f6306n = r8
            com.google.android.material.floatingactionbutton.g r12 = r10.getImpl()
            r12.f6298f = r11
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
