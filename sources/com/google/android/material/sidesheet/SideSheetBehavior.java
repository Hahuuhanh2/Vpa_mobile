package com.google.android.material.sidesheet;

import al.g0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import c2.c;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import f0.b0;
import f8.i;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import m8.d;
import m8.e;
import m8.g;
import v.v;
import w1.d0;
import w1.q0;
import x1.f;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements f8.b {
    public static final int E = R$string.side_sheet_accessibility_pane_title;
    public static final int F = R$style.Widget_Material3_SideSheet;
    public i A;
    public int B;
    public final LinkedHashSet C = new LinkedHashSet();
    public final a D = new a();

    /* renamed from: a  reason: collision with root package name */
    public d f6725a;

    /* renamed from: b  reason: collision with root package name */
    public h f6726b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f6727c;

    /* renamed from: d  reason: collision with root package name */
    public m f6728d;

    /* renamed from: e  reason: collision with root package name */
    public final SideSheetBehavior<V>.c f6729e = new c();

    /* renamed from: f  reason: collision with root package name */
    public float f6730f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6731n = true;

    /* renamed from: o  reason: collision with root package name */
    public int f6732o = 5;

    /* renamed from: p  reason: collision with root package name */
    public c2.c f6733p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6734q;

    /* renamed from: r  reason: collision with root package name */
    public float f6735r = 0.1f;

    /* renamed from: s  reason: collision with root package name */
    public int f6736s;

    /* renamed from: t  reason: collision with root package name */
    public int f6737t;

    /* renamed from: u  reason: collision with root package name */
    public int f6738u;

    /* renamed from: v  reason: collision with root package name */
    public int f6739v;

    /* renamed from: w  reason: collision with root package name */
    public WeakReference<V> f6740w;

    /* renamed from: x  reason: collision with root package name */
    public WeakReference<View> f6741x;

    /* renamed from: y  reason: collision with root package name */
    public int f6742y = -1;

    /* renamed from: z  reason: collision with root package name */
    public VelocityTracker f6743z;

    public class a extends c.C0048c {
        public a() {
        }

        public final int a(View view, int i10) {
            return g0.G(i10, SideSheetBehavior.this.f6725a.g(), SideSheetBehavior.this.f6725a.f());
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.f6736s + sideSheetBehavior.f6739v;
        }

        public final void h(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f6731n) {
                    sideSheetBehavior.y(1);
                }
            }
        }

        public final void i(View view, int i10, int i11) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            WeakReference<View> weakReference = SideSheetBehavior.this.f6741x;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                SideSheetBehavior.this.f6725a.p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (!sideSheetBehavior.C.isEmpty()) {
                sideSheetBehavior.f6725a.b(i10);
                for (m8.c b10 : sideSheetBehavior.C) {
                    b10.b();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            if (r5 == false) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
            if (java.lang.Math.abs(r5 - r0.f6725a.d()) < java.lang.Math.abs(r5 - r0.f6725a.e())) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
            if (r0.f6725a.l(r4) == false) goto L_0x0058;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r4, float r5, float r6) {
            /*
                r3 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                m8.d r1 = r0.f6725a
                boolean r1 = r1.k(r5)
                r2 = 1
                if (r1 == 0) goto L_0x000c
                goto L_0x0058
            L_0x000c:
                m8.d r1 = r0.f6725a
                boolean r1 = r1.n(r4, r5)
                if (r1 == 0) goto L_0x0025
                m8.d r1 = r0.f6725a
                boolean r5 = r1.m(r5, r6)
                if (r5 != 0) goto L_0x005a
                m8.d r5 = r0.f6725a
                boolean r5 = r5.l(r4)
                if (r5 == 0) goto L_0x0058
                goto L_0x005a
            L_0x0025:
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x003b
                float r5 = java.lang.Math.abs(r5)
                float r6 = java.lang.Math.abs(r6)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 <= 0) goto L_0x0038
                r5 = r2
                goto L_0x0039
            L_0x0038:
                r5 = 0
            L_0x0039:
                if (r5 != 0) goto L_0x005a
            L_0x003b:
                int r5 = r4.getLeft()
                m8.d r6 = r0.f6725a
                int r6 = r6.d()
                int r6 = r5 - r6
                int r6 = java.lang.Math.abs(r6)
                m8.d r0 = r0.f6725a
                int r0 = r0.e()
                int r5 = r5 - r0
                int r5 = java.lang.Math.abs(r5)
                if (r6 >= r5) goto L_0x005a
            L_0x0058:
                r5 = 3
                goto L_0x005b
            L_0x005a:
                r5 = 5
            L_0x005b:
                com.google.android.material.sidesheet.SideSheetBehavior r6 = com.google.android.material.sidesheet.SideSheetBehavior.this
                r6.getClass()
                r6.z(r4, r5, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.j(android.view.View, float, float):void");
        }

        public final boolean k(int i10, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f6732o == 1 || (weakReference = sideSheetBehavior.f6740w) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.y(5);
            WeakReference<V> weakReference = SideSheetBehavior.this.f6740w;
            if (weakReference != null && weakReference.get() != null) {
                ((View) SideSheetBehavior.this.f6740w.get()).requestLayout();
            }
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f6747a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6748b;

        /* renamed from: c  reason: collision with root package name */
        public final d.i f6749c = new d.i(this, 17);

        public c() {
        }

        public final void a(int i10) {
            WeakReference<V> weakReference = SideSheetBehavior.this.f6740w;
            if (weakReference != null && weakReference.get() != null) {
                this.f6747a = i10;
                if (!this.f6748b) {
                    d.i iVar = this.f6749c;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.m((View) SideSheetBehavior.this.f6740w.get(), iVar);
                    this.f6748b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
    }

    public final void A() {
        View view;
        WeakReference<V> weakReference = this.f6740w;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            d0.l(262144, view);
            d0.i(0, view);
            d0.l(1048576, view);
            d0.i(0, view);
            if (this.f6732o != 5) {
                d0.m(view, f.a.f16872l, (String) null, new g(this, 5));
            }
            if (this.f6732o != 3) {
                d0.m(view, f.a.f16870j, (String) null, new g(this, 3));
            }
        }
    }

    public final void a(d.b bVar) {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z10;
        i iVar = this.A;
        if (iVar != null) {
            d dVar = this.f6725a;
            int i10 = 5;
            if (!(dVar == null || dVar.j() == 0)) {
                i10 = 3;
            }
            d.b bVar2 = iVar.f10045f;
            iVar.f10045f = bVar;
            if (bVar2 != null) {
                if (bVar.f8421d == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                iVar.c(i10, bVar.f8420c, z10);
            }
            WeakReference<V> weakReference = this.f6740w;
            if (weakReference != null && weakReference.get() != null) {
                View view2 = (View) this.f6740w.get();
                WeakReference<View> weakReference2 = this.f6741x;
                if (weakReference2 != null) {
                    view = weakReference2.get();
                } else {
                    view = null;
                }
                if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                    float scaleX = view2.getScaleX();
                    this.f6725a.o(marginLayoutParams, (int) ((scaleX * ((float) this.f6736s)) + ((float) this.f6739v)));
                    view.requestLayout();
                }
            }
        }
    }

    public final void b() {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        i iVar = this.A;
        if (iVar != null) {
            d.b bVar = iVar.f10045f;
            e eVar = null;
            iVar.f10045f = null;
            int i10 = 5;
            if (bVar == null || Build.VERSION.SDK_INT < 34) {
                x(5);
                return;
            }
            d dVar = this.f6725a;
            if (!(dVar == null || dVar.j() == 0)) {
                i10 = 3;
            }
            b bVar2 = new b();
            WeakReference<View> weakReference = this.f6741x;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            if (!(view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null)) {
                eVar = new e(this, marginLayoutParams, this.f6725a.c(marginLayoutParams), view);
            }
            iVar.b(bVar, i10, bVar2, eVar);
        }
    }

    public final void c(d.b bVar) {
        i iVar = this.A;
        if (iVar != null) {
            iVar.f10045f = bVar;
        }
    }

    public final void d() {
        i iVar = this.A;
        if (iVar != null) {
            iVar.a();
        }
    }

    public final void g(CoordinatorLayout.e eVar) {
        this.f6740w = null;
        this.f6733p = null;
        this.A = null;
    }

    public final void j() {
        this.f6740w = null;
        this.f6733p = null;
        this.A = null;
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z10;
        c2.c cVar;
        VelocityTracker velocityTracker;
        if ((v2.isShown() || d0.e(v2) != null) && this.f6731n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f6734q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f6743z) != null) {
            velocityTracker.recycle();
            this.f6743z = null;
        }
        if (this.f6743z == null) {
            this.f6743z = VelocityTracker.obtain();
        }
        this.f6743z.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.B = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f6734q) {
            this.f6734q = false;
            return false;
        }
        if (this.f6734q || (cVar = this.f6733p) == null || !cVar.t(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        int i11;
        int i12;
        int i13;
        View findViewById;
        boolean z10;
        boolean z11;
        int i14;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.d.b(coordinatorLayout) && !d0.d.b(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int i15 = 0;
        if (this.f6740w == null) {
            this.f6740w = new WeakReference<>(v2);
            this.A = new i(v2);
            h hVar = this.f6726b;
            if (hVar != null) {
                d0.d.q(v2, hVar);
                h hVar2 = this.f6726b;
                float f10 = this.f6730f;
                if (f10 == -1.0f) {
                    f10 = d0.i.i(v2);
                }
                hVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.f6727c;
                if (colorStateList != null) {
                    d0.i.q(v2, colorStateList);
                }
            }
            if (this.f6732o == 5) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            if (v2.getVisibility() != i14) {
                v2.setVisibility(i14);
            }
            A();
            if (d0.d.c(v2) == 0) {
                d0.d.s(v2, 1);
            }
            if (d0.e(v2) == null) {
                d0.p(v2, v2.getResources().getString(E));
            }
        }
        if (Gravity.getAbsoluteGravity(((CoordinatorLayout.e) v2.getLayoutParams()).f2069c, i10) == 3) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        d dVar = this.f6725a;
        if (dVar == null || dVar.j() != i11) {
            if (i11 == 0) {
                this.f6725a = new m8.b(this);
                if (this.f6728d != null) {
                    CoordinatorLayout.e w9 = w();
                    if (w9 == null || w9.rightMargin <= 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        m mVar = this.f6728d;
                        mVar.getClass();
                        m.a aVar = new m.a(mVar);
                        aVar.f(0.0f);
                        aVar.d(0.0f);
                        m mVar2 = new m(aVar);
                        h hVar3 = this.f6726b;
                        if (hVar3 != null) {
                            hVar3.setShapeAppearanceModel(mVar2);
                        }
                    }
                }
            } else if (i11 == 1) {
                this.f6725a = new m8.a(this);
                if (this.f6728d != null) {
                    CoordinatorLayout.e w10 = w();
                    if (w10 == null || w10.leftMargin <= 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        m mVar3 = this.f6728d;
                        mVar3.getClass();
                        m.a aVar2 = new m.a(mVar3);
                        aVar2.e(0.0f);
                        aVar2.c(0.0f);
                        m mVar4 = new m(aVar2);
                        h hVar4 = this.f6726b;
                        if (hVar4 != null) {
                            hVar4.setShapeAppearanceModel(mVar4);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(v.e(b0.u("Invalid sheet edge position value: ", i11, ". Must be ", 0, " or "), 1, "."));
            }
        }
        if (this.f6733p == null) {
            this.f6733p = new c2.c(coordinatorLayout.getContext(), coordinatorLayout, this.D);
        }
        int h10 = this.f6725a.h(v2);
        coordinatorLayout.u(i10, v2);
        this.f6737t = coordinatorLayout.getWidth();
        this.f6738u = this.f6725a.i(coordinatorLayout);
        this.f6736s = v2.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        if (marginLayoutParams != null) {
            i12 = this.f6725a.a(marginLayoutParams);
        } else {
            i12 = 0;
        }
        this.f6739v = i12;
        int i16 = this.f6732o;
        if (i16 == 1 || i16 == 2) {
            i15 = h10 - this.f6725a.h(v2);
        } else if (i16 != 3) {
            if (i16 == 5) {
                i15 = this.f6725a.e();
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Unexpected value: ");
                q10.append(this.f6732o);
                throw new IllegalStateException(q10.toString());
            }
        }
        v2.offsetLeftAndRight(i15);
        if (!(this.f6741x != null || (i13 = this.f6742y) == -1 || (findViewById = coordinatorLayout.findViewById(i13)) == null)) {
            this.f6741x = new WeakReference<>(findViewById);
        }
        for (m8.c cVar : this.C) {
            if (cVar instanceof m8.h) {
                ((m8.h) cVar).getClass();
            }
        }
        return true;
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    public final void r(View view, Parcelable parcelable) {
        int i10 = ((SavedState) parcelable).f6744c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f6732o = i10;
    }

    public final Parcelable s(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        boolean z13 = false;
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f6732o;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        c2.c cVar = this.f6733p;
        if (cVar == null || (!this.f6731n && i10 != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            cVar.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f6743z) != null) {
            velocityTracker.recycle();
            this.f6743z = null;
        }
        if (this.f6743z == null) {
            this.f6743z = VelocityTracker.obtain();
        }
        this.f6743z.addMovement(motionEvent);
        c2.c cVar2 = this.f6733p;
        if (cVar2 == null || (!this.f6731n && this.f6732o != 1)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && actionMasked == 2 && !this.f6734q) {
            if (cVar2 == null || (!this.f6731n && this.f6732o != 1)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12 && Math.abs(((float) this.B) - motionEvent.getX()) > ((float) this.f6733p.f4531b)) {
                z13 = true;
            }
            if (z13) {
                this.f6733p.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v2);
            }
        }
        return !this.f6734q;
    }

    public final CoordinatorLayout.e w() {
        View view;
        WeakReference<V> weakReference = this.f6740w;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.e)) {
            return null;
        }
        return (CoordinatorLayout.e) view.getLayoutParams();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (w1.d0.g.b(r1) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L_0x0043
            r1 = 2
            if (r4 != r1) goto L_0x0007
            goto L_0x0043
        L_0x0007:
            java.lang.ref.WeakReference<V> r1 = r3.f6740w
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L_0x0012
            goto L_0x003f
        L_0x0012:
            java.lang.ref.WeakReference<V> r1 = r3.f6740w
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            m8.f r2 = new m8.f
            r2.<init>(r3, r4)
            android.view.ViewParent r4 = r1.getParent()
            if (r4 == 0) goto L_0x0034
            boolean r4 = r4.isLayoutRequested()
            if (r4 == 0) goto L_0x0034
            java.util.WeakHashMap<android.view.View, w1.q0> r4 = w1.d0.f16298a
            boolean r4 = w1.d0.g.b(r1)
            if (r4 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x003b
            r1.post(r2)
            goto L_0x0042
        L_0x003b:
            r2.run()
            goto L_0x0042
        L_0x003f:
            r3.y(r4)
        L_0x0042:
            return
        L_0x0043:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            if (r4 != r0) goto L_0x0050
            java.lang.String r4 = "DRAGGING"
            goto L_0x0052
        L_0x0050:
            java.lang.String r4 = "SETTLING"
        L_0x0052:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = android.support.v4.media.a.o(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.x(int):void");
    }

    public final void y(int i10) {
        View view;
        int i11;
        if (this.f6732o != i10) {
            this.f6732o = i10;
            WeakReference<V> weakReference = this.f6740w;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (this.f6732o == 5) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                if (view.getVisibility() != i11) {
                    view.setVisibility(i11);
                }
                for (m8.c a10 : this.C) {
                    a10.a();
                }
                A();
            }
        }
    }

    public final void z(View view, int i10, boolean z10) {
        int i11;
        boolean z11;
        if (i10 == 3) {
            i11 = this.f6725a.d();
        } else if (i10 == 5) {
            i11 = this.f6725a.e();
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.m("Invalid state to get outer edge offset: ", i10));
        }
        c2.c cVar = this.f6733p;
        if (cVar == null || (!z10 ? !cVar.u(view, i11, view.getTop()) : !cVar.s(i11, view.getTop()))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            y(2);
            this.f6729e.a(i10);
            return;
        }
        y(i10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f6744c;

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
            this.f6744c = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f6744c);
        }

        public SavedState(android.view.AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f6744c = sideSheetBehavior.f6732o;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SideSheetBehavior_Layout);
        int i10 = R$styleable.SideSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.f6727c = i8.c.a(context, obtainStyledAttributes, i10);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f6728d = new m(m.c(context, attributeSet, 0, F));
        }
        int i11 = R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (obtainStyledAttributes.hasValue(i11)) {
            int resourceId = obtainStyledAttributes.getResourceId(i11, -1);
            this.f6742y = resourceId;
            WeakReference<View> weakReference = this.f6741x;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f6741x = null;
            WeakReference<V> weakReference2 = this.f6740w;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    if (d0.g.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        if (this.f6728d != null) {
            h hVar = new h(this.f6728d);
            this.f6726b = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.f6727c;
            if (colorStateList != null) {
                this.f6726b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6726b.setTint(typedValue.data);
            }
        }
        this.f6730f = obtainStyledAttributes.getDimension(R$styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f6731n = obtainStyledAttributes.getBoolean(R$styleable.SideSheetBehavior_Layout_behavior_draggable, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
