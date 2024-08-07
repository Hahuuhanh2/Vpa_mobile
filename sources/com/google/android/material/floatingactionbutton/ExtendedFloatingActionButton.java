package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$animator;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final int Q = R$style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    public static final b R = new b();
    public static final c S = new c();
    public static final d T = new d();
    public static final e U = new e();
    public int B;
    public final f C;
    public final f D;
    public final h E;
    public final g F;
    public final int G;
    public int H;
    public int I;
    public final ExtendedFloatingActionButtonBehavior J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ColorStateList N;
    public int O;
    public int P;

    public class a implements i {
        public a() {
        }

        public final ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(c(), b());
        }

        public final int b() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public final int c() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }
    }

    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "width");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "height");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingStart");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return Float.valueOf((float) d0.e.f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.e.k(view, intValue, paddingTop, d0.e.e(view), view.getPaddingBottom());
        }
    }

    public class e extends Property<View, Float> {
        public e() {
            super(Float.class, "paddingEnd");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return Float.valueOf((float) d0.e.e((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.e.k(view, d0.e.f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    public class f extends e8.a {

        /* renamed from: g  reason: collision with root package name */
        public final i f6250g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f6251h;

        public f(lc.b bVar, i iVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, bVar);
            this.f6250g = iVar;
            this.f6251h = z10;
        }

        public final void a() {
            this.f9241d.f12907b = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.L = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f6250g.a().width;
                layoutParams.height = this.f6250g.a().height;
            }
        }

        public final void b() {
        }

        public final int d() {
            if (this.f6251h) {
                return R$animator.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return R$animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        public final void e() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.K = this.f6251h;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams != null) {
                if (!this.f6251h) {
                    ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                    extendedFloatingActionButton2.O = layoutParams.width;
                    extendedFloatingActionButton2.P = layoutParams.height;
                }
                layoutParams.width = this.f6250g.a().width;
                layoutParams.height = this.f6250g.a().height;
                ExtendedFloatingActionButton extendedFloatingActionButton3 = ExtendedFloatingActionButton.this;
                int paddingStart = this.f6250g.getPaddingStart();
                int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
                int paddingEnd = this.f6250g.getPaddingEnd();
                int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.e.k(extendedFloatingActionButton3, paddingStart, paddingTop, paddingEnd, paddingBottom);
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        public final boolean f() {
            boolean z10 = this.f6251h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (z10 == extendedFloatingActionButton.K || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return true;
            }
            return false;
        }

        public final AnimatorSet g() {
            float f10;
            t7.h hVar = this.f9243f;
            if (hVar == null) {
                if (this.f9242e == null) {
                    this.f9242e = t7.h.b(this.f9238a, d());
                }
                hVar = this.f9242e;
                hVar.getClass();
            }
            if (hVar.g("width")) {
                PropertyValuesHolder[] e10 = hVar.e("width");
                e10[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f6250g.c()});
                hVar.h("width", e10);
            }
            if (hVar.g("height")) {
                PropertyValuesHolder[] e11 = hVar.e("height");
                e11[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f6250g.b()});
                hVar.h("height", e11);
            }
            if (hVar.g("paddingStart")) {
                PropertyValuesHolder[] e12 = hVar.e("paddingStart");
                PropertyValuesHolder propertyValuesHolder = e12[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                propertyValuesHolder.setFloatValues(new float[]{(float) d0.e.f(extendedFloatingActionButton), (float) this.f6250g.getPaddingStart()});
                hVar.h("paddingStart", e12);
            }
            if (hVar.g("paddingEnd")) {
                PropertyValuesHolder[] e13 = hVar.e("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = e13[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                propertyValuesHolder2.setFloatValues(new float[]{(float) d0.e.e(extendedFloatingActionButton2), (float) this.f6250g.getPaddingEnd()});
                hVar.h("paddingEnd", e13);
            }
            if (hVar.g("labelOpacity")) {
                PropertyValuesHolder[] e14 = hVar.e("labelOpacity");
                boolean z10 = this.f6251h;
                float f11 = 0.0f;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                if (z10) {
                    f11 = 1.0f;
                }
                e14[0].setFloatValues(new float[]{f10, f11});
                hVar.h("labelOpacity", e14);
            }
            return h(hVar);
        }

        public final void onAnimationStart(Animator animator) {
            lc.b bVar = this.f9241d;
            Animator animator2 = (Animator) bVar.f12907b;
            if (animator2 != null) {
                animator2.cancel();
            }
            bVar.f12907b = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.K = this.f6251h;
            extendedFloatingActionButton.L = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    public class g extends e8.a {

        /* renamed from: g  reason: collision with root package name */
        public boolean f6253g;

        public g(lc.b bVar) {
            super(ExtendedFloatingActionButton.this, bVar);
        }

        public final void a() {
            this.f9241d.f12907b = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.B = 0;
            if (!this.f6253g) {
                extendedFloatingActionButton.setVisibility(8);
            }
        }

        public final void b() {
        }

        public final void c() {
            super.c();
            this.f6253g = true;
        }

        public final int d() {
            return R$animator.mtrl_extended_fab_hide_motion_spec;
        }

        public final void e() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        public final boolean f() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int i10 = ExtendedFloatingActionButton.Q;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.B != 1) {
                    return false;
                }
            } else if (extendedFloatingActionButton.B == 2) {
                return false;
            }
            return true;
        }

        public final void onAnimationStart(Animator animator) {
            lc.b bVar = this.f9241d;
            Animator animator2 = (Animator) bVar.f12907b;
            if (animator2 != null) {
                animator2.cancel();
            }
            bVar.f12907b = animator;
            this.f6253g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.B = 1;
        }
    }

    public class h extends e8.a {
        public h(lc.b bVar) {
            super(ExtendedFloatingActionButton.this, bVar);
        }

        public final void a() {
            this.f9241d.f12907b = null;
            ExtendedFloatingActionButton.this.B = 0;
        }

        public final void b() {
        }

        public final int d() {
            return R$animator.mtrl_extended_fab_show_motion_spec;
        }

        public final void e() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        public final boolean f() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int i10 = ExtendedFloatingActionButton.Q;
            if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.B != 2) {
                    return false;
                }
            } else if (extendedFloatingActionButton.B == 1) {
                return false;
            }
            return true;
        }

        public final void onAnimationStart(Animator animator) {
            lc.b bVar = this.f9241d;
            Animator animator2 = (Animator) bVar.f12907b;
            if (animator2 != null) {
                animator2.cancel();
            }
            bVar.f12907b = animator;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.B = 2;
        }
    }

    public interface i {
        ViewGroup.LayoutParams a();

        int b();

        int c();

        int getPaddingEnd();

        int getPaddingStart();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r5.M != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r5.isInEditMode() == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r5, int r6) {
        /*
            r0 = 1
            r1 = 2
            if (r6 == 0) goto L_0x0020
            if (r6 == r0) goto L_0x001d
            if (r6 == r1) goto L_0x001a
            r2 = 3
            if (r6 != r2) goto L_0x000e
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r2 = r5.D
            goto L_0x0022
        L_0x000e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown strategy type: "
            java.lang.String r6 = android.support.v4.media.a.m(r0, r6)
            r5.<init>(r6)
            throw r5
        L_0x001a:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r2 = r5.C
            goto L_0x0022
        L_0x001d:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g r2 = r5.F
            goto L_0x0022
        L_0x0020:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r2 = r5.E
        L_0x0022:
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x002a
            goto L_0x00a1
        L_0x002a:
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            boolean r3 = w1.d0.g.c(r5)
            r4 = 0
            if (r3 != 0) goto L_0x004b
            int r3 = r5.getVisibility()
            if (r3 == 0) goto L_0x003e
            int r3 = r5.B
            if (r3 != r1) goto L_0x0044
            goto L_0x0042
        L_0x003e:
            int r3 = r5.B
            if (r3 == r0) goto L_0x0044
        L_0x0042:
            r3 = r0
            goto L_0x0045
        L_0x0044:
            r3 = r4
        L_0x0045:
            if (r3 != 0) goto L_0x0052
            boolean r3 = r5.M
            if (r3 == 0) goto L_0x0052
        L_0x004b:
            boolean r3 = r5.isInEditMode()
            if (r3 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r0 = r4
        L_0x0053:
            if (r0 != 0) goto L_0x005c
            r2.e()
            r2.b()
            goto L_0x00a1
        L_0x005c:
            if (r6 != r1) goto L_0x0079
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            if (r6 == 0) goto L_0x006d
            int r0 = r6.width
            r5.O = r0
            int r6 = r6.height
            r5.P = r6
            goto L_0x0079
        L_0x006d:
            int r6 = r5.getWidth()
            r5.O = r6
            int r6 = r5.getHeight()
            r5.P = r6
        L_0x0079:
            r5.measure(r4, r4)
            android.animation.AnimatorSet r5 = r2.g()
            e8.c r6 = new e8.c
            r6.<init>(r2)
            r5.addListener(r6)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r6 = r2.f9240c
            java.util.Iterator r6 = r6.iterator()
        L_0x008e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r6.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r5.addListener(r0)
            goto L_0x008e
        L_0x009e:
            r5.start()
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, int):void");
    }

    public final void f(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.J;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.G;
        if (i10 >= 0) {
            return i10;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        return (Math.min(d0.e.f(this), d0.e.e(this)) * 2) + getIconSize();
    }

    public t7.h getExtendMotionSpec() {
        return this.D.f9243f;
    }

    public t7.h getHideMotionSpec() {
        return this.F.f9243f;
    }

    public t7.h getShowMotionSpec() {
        return this.E.f9243f;
    }

    public t7.h getShrinkMotionSpec() {
        return this.C.f9243f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.K = false;
            this.C.e();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.M = z10;
    }

    public void setExtendMotionSpec(t7.h hVar) {
        this.D.f9243f = hVar;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(t7.h.b(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        f fVar;
        if (this.K != z10) {
            if (z10) {
                fVar = this.D;
            } else {
                fVar = this.C;
            }
            if (!fVar.f()) {
                fVar.e();
            }
        }
    }

    public void setHideMotionSpec(t7.h hVar) {
        this.F.f9243f = hVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(t7.h.b(getContext(), i10));
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (this.K && !this.L) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            this.H = d0.e.f(this);
            this.I = d0.e.e(this);
        }
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (this.K && !this.L) {
            this.H = i10;
            this.I = i12;
        }
    }

    public void setShowMotionSpec(t7.h hVar) {
        this.E.f9243f = hVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(t7.h.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(t7.h hVar) {
        this.C.f9243f = hVar;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(t7.h.b(getContext(), i10));
    }

    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.N = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f6246a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6247b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6248c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f6247b = false;
            this.f6248c = true;
        }

        public final /* bridge */ /* synthetic */ boolean e(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public final void g(CoordinatorLayout.e eVar) {
            if (eVar.f2074h == 0) {
                eVar.f2074h = 80;
            }
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.e) {
                    z10 = ((CoordinatorLayout.e) layoutParams).f2067a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList o10 = coordinatorLayout.o(extendedFloatingActionButton);
            int size = o10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) o10.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.e) {
                        z10 = ((CoordinatorLayout.e) layoutParams).f2067a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.u(i10, extendedFloatingActionButton);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            int i10;
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams();
            int i11 = 0;
            if ((this.f6247b || this.f6248c) && eVar.f2072f == appBarLayout.getId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            if (this.f6246a == null) {
                this.f6246a = new Rect();
            }
            Rect rect = this.f6246a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f6248c) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
            } else {
                if (this.f6248c) {
                    i11 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams();
            int i10 = 0;
            if ((this.f6247b || this.f6248c) && eVar.f2072f == view.getId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            int i11 = 2;
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (!this.f6248c) {
                    i11 = 1;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
            } else {
                if (this.f6248c) {
                    i10 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f6247b = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f6248c = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.material.floatingactionbutton.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: com.google.android.material.floatingactionbutton.a} */
    /* JADX WARNING: type inference failed for: r8v1, types: [com.google.android.material.floatingactionbutton.c] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = Q
            r1 = r18
            android.content.Context r1 = p8.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.B = r10
            lc.b r1 = new lc.b
            r11 = 5
            r1.<init>((int) r11, (int) r10)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            r12.<init>(r1)
            r0.E = r12
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g
            r13.<init>(r1)
            r0.F = r13
            r14 = 1
            r0.K = r14
            r0.L = r10
            r0.M = r10
            android.content.Context r15 = r17.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r15, r7)
            r0.J = r1
            int[] r3 = com.google.android.material.R$styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r15
            r2 = r19
            r4 = r20
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.u.d(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R$styleable.ExtendedFloatingActionButton_showMotionSpec
            t7.h r2 = t7.h.a(r15, r1, r2)
            int r3 = com.google.android.material.R$styleable.ExtendedFloatingActionButton_hideMotionSpec
            t7.h r3 = t7.h.a(r15, r1, r3)
            int r4 = com.google.android.material.R$styleable.ExtendedFloatingActionButton_extendMotionSpec
            t7.h r4 = t7.h.a(r15, r1, r4)
            int r5 = com.google.android.material.R$styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            t7.h r5 = t7.h.a(r15, r1, r5)
            int r6 = com.google.android.material.R$styleable.ExtendedFloatingActionButton_collapsedSize
            r10 = -1
            int r6 = r1.getDimensionPixelSize(r6, r10)
            r0.G = r6
            int r6 = com.google.android.material.R$styleable.ExtendedFloatingActionButton_extendStrategy
            int r6 = r1.getInt(r6, r14)
            java.util.WeakHashMap<android.view.View, w1.q0> r10 = w1.d0.f16298a
            int r10 = w1.d0.e.f(r17)
            r0.H = r10
            int r10 = w1.d0.e.e(r17)
            r0.I = r10
            lc.b r10 = new lc.b
            r14 = 0
            r10.<init>((int) r11, (int) r14)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f
            com.google.android.material.floatingactionbutton.a r14 = new com.google.android.material.floatingactionbutton.a
            r14.<init>(r0)
            com.google.android.material.floatingactionbutton.b r7 = new com.google.android.material.floatingactionbutton.b
            r7.<init>(r0, r14)
            com.google.android.material.floatingactionbutton.c r8 = new com.google.android.material.floatingactionbutton.c
            r8.<init>(r0, r7, r14)
            r16 = r7
            r7 = 1
            if (r6 == r7) goto L_0x00a0
            r14 = 2
            if (r6 == r14) goto L_0x009e
            r14 = r8
            goto L_0x00a0
        L_0x009e:
            r14 = r16
        L_0x00a0:
            r11.<init>(r10, r14, r7)
            r0.D = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r6 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r7 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r7.<init>()
            r8 = 0
            r6.<init>(r10, r7, r8)
            r0.C = r6
            r12.f9243f = r2
            r13.f9243f = r3
            r11.f9243f = r4
            r6.f9243f = r5
            r1.recycle()
            l8.k r1 = l8.m.f12824m
            r2 = r19
            r3 = r20
            l8.m$a r1 = l8.m.d(r15, r2, r3, r9, r1)
            l8.m r2 = new l8.m
            r2.<init>(r1)
            r0.setShapeAppearanceModel(r2)
            android.content.res.ColorStateList r1 = r17.getTextColors()
            r0.N = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.N = getTextColors();
    }
}
