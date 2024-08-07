package com.google.android.material.bottomsheet;

import al.g0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.R$id;
import androidx.customview.view.AbsSavedState;
import c2.c;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import v7.g;
import w1.a;
import w1.d0;
import w1.q0;
import w1.v0;
import x1.f;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements f8.b {

    /* renamed from: n0  reason: collision with root package name */
    public static final int f5802n0 = R$style.Widget_Design_BottomSheet_Modal;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public m F;
    public boolean G;
    public final BottomSheetBehavior<V>.e H = new e();
    public ValueAnimator I;
    public int J;
    public int K;
    public int L;
    public float M = 0.5f;
    public int N;
    public float O = -1.0f;
    public boolean P;
    public boolean Q;
    public boolean R = true;
    public int S = 4;
    public c2.c T;
    public boolean U;
    public int V;
    public boolean W;
    public float X = 0.1f;
    public int Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f5803a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public int f5804a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5805b = true;

    /* renamed from: b0  reason: collision with root package name */
    public WeakReference<V> f5806b0;

    /* renamed from: c  reason: collision with root package name */
    public float f5807c;

    /* renamed from: c0  reason: collision with root package name */
    public WeakReference<View> f5808c0;

    /* renamed from: d  reason: collision with root package name */
    public int f5809d;

    /* renamed from: d0  reason: collision with root package name */
    public WeakReference<View> f5810d0;

    /* renamed from: e  reason: collision with root package name */
    public int f5811e;

    /* renamed from: e0  reason: collision with root package name */
    public final ArrayList<d> f5812e0 = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5813f;

    /* renamed from: f0  reason: collision with root package name */
    public VelocityTracker f5814f0;

    /* renamed from: g0  reason: collision with root package name */
    public f8.e f5815g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f5816h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f5817i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f5818j0;

    /* renamed from: k0  reason: collision with root package name */
    public HashMap f5819k0;

    /* renamed from: l0  reason: collision with root package name */
    public final SparseIntArray f5820l0 = new SparseIntArray();

    /* renamed from: m0  reason: collision with root package name */
    public final c f5821m0 = new c();

    /* renamed from: n  reason: collision with root package name */
    public int f5822n;

    /* renamed from: o  reason: collision with root package name */
    public int f5823o;

    /* renamed from: p  reason: collision with root package name */
    public h f5824p;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f5825q;

    /* renamed from: r  reason: collision with root package name */
    public int f5826r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f5827s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f5828t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5829u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5830v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5831w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5832x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5833y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5834z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f5840a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f5841b;

        public a(View view, int i10) {
            this.f5840a = view;
            this.f5841b = i10;
        }

        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            View view = this.f5840a;
            int i10 = this.f5841b;
            int i11 = BottomSheetBehavior.f5802n0;
            bottomSheetBehavior.N(view, i10, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.L(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.f5806b0;
            if (weakReference != null && weakReference.get() != null) {
                ((View) BottomSheetBehavior.this.f5806b0.get()).requestLayout();
            }
        }
    }

    public class c extends c.C0048c {
        public c() {
        }

        public final int a(View view, int i10) {
            return view.getLeft();
        }

        public final int b(View view, int i10) {
            return g0.G(i10, BottomSheetBehavior.this.E(), d());
        }

        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i10 = BottomSheetBehavior.f5802n0;
            if (bottomSheetBehavior.P) {
                return bottomSheetBehavior.f5804a0;
            }
            return bottomSheetBehavior.N;
        }

        public final void h(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.R) {
                    bottomSheetBehavior.L(1);
                }
            }
        }

        public final void i(View view, int i10, int i11) {
            BottomSheetBehavior.this.A(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.f5844a.E()) < java.lang.Math.abs(r5.getTop() - r4.f5844a.L)) goto L_0x00e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
            if (java.lang.Math.abs(r6 - r7.K) < java.lang.Math.abs(r6 - r4.f5844a.N)) goto L_0x00e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
            if (r6 > r4.f5844a.L) goto L_0x0104;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                if (r1 >= 0) goto L_0x0022
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f5805b
                if (r6 == 0) goto L_0x000e
                goto L_0x00e6
            L_0x000e:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.L
                if (r6 <= r7) goto L_0x00e6
                goto L_0x0104
            L_0x0022:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r3 = r1.P
                if (r3 == 0) goto L_0x0083
                boolean r1 = r1.M(r5, r7)
                if (r1 == 0) goto L_0x0083
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0043
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.f5809d
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x0059
            L_0x0043:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r7.f5804a0
                int r7 = r7.E()
                int r7 = r7 + r0
                int r7 = r7 / 2
                if (r6 <= r7) goto L_0x0056
                r6 = r2
                goto L_0x0057
            L_0x0056:
                r6 = 0
            L_0x0057:
                if (r6 == 0) goto L_0x005c
            L_0x0059:
                r6 = 5
                goto L_0x0107
            L_0x005c:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f5805b
                if (r6 == 0) goto L_0x0064
                goto L_0x00e6
            L_0x0064:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.E()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.L
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x0104
                goto L_0x00e6
            L_0x0083:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00ba
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0094
                goto L_0x00ba
            L_0x0094:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f5805b
                if (r6 == 0) goto L_0x009b
                goto L_0x0106
            L_0x009b:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.L
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.N
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0106
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
                goto L_0x0104
            L_0x00ba:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r0 = r7.f5805b
                if (r0 == 0) goto L_0x00d8
                int r7 = r7.K
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.N
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0106
                goto L_0x00e6
            L_0x00d8:
                int r0 = r7.L
                if (r6 >= r0) goto L_0x00ee
                int r7 = r7.N
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00e8
            L_0x00e6:
                r6 = 3
                goto L_0x0107
            L_0x00e8:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
                goto L_0x0104
            L_0x00ee:
                int r7 = r6 - r0
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.N
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0106
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
            L_0x0104:
                r6 = 6
                goto L_0x0107
            L_0x0106:
                r6 = 4
            L_0x0107:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                r7.N(r5, r6, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.j(android.view.View, float, float):void");
        }

        public final boolean k(int i10, View view) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.S;
            if (i11 == 1 || bottomSheetBehavior.f5818j0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f5816h0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f5810d0;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f5806b0;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    public static abstract class d {
        public void a(View view) {
        }

        public abstract void b(View view);

        public abstract void c(int i10, View view);
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f5845a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5846b;

        /* renamed from: c  reason: collision with root package name */
        public final a f5847c = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                e eVar = e.this;
                eVar.f5846b = false;
                c2.c cVar = BottomSheetBehavior.this.T;
                if (cVar == null || !cVar.h()) {
                    e eVar2 = e.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.S == 2) {
                        bottomSheetBehavior.L(eVar2.f5845a);
                        return;
                    }
                    return;
                }
                e eVar3 = e.this;
                eVar3.a(eVar3.f5845a);
            }
        }

        public e() {
        }

        public final void a(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f5806b0;
            if (weakReference != null && weakReference.get() != null) {
                this.f5845a = i10;
                if (!this.f5846b) {
                    a aVar = this.f5847c;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.m((View) BottomSheetBehavior.this.f5806b0.get(), aVar);
                    this.f5846b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View B2 = B(viewGroup.getChildAt(i10));
                if (B2 != null) {
                    return B2;
                }
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> C(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) layoutParams).f2067a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void A(int i10) {
        View view = (View) this.f5806b0.get();
        if (view != null && !this.f5812e0.isEmpty()) {
            int i11 = this.N;
            if (i10 <= i11 && i11 != E()) {
                E();
            }
            for (int i12 = 0; i12 < this.f5812e0.size(); i12++) {
                this.f5812e0.get(i12).b(view);
            }
        }
    }

    public final int D(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final int E() {
        int i10;
        if (this.f5805b) {
            return this.K;
        }
        int i11 = this.J;
        if (this.f5833y) {
            i10 = 0;
        } else {
            i10 = this.D;
        }
        return Math.max(i11, i10);
    }

    public final int F(int i10) {
        if (i10 == 3) {
            return E();
        }
        if (i10 == 4) {
            return this.N;
        }
        if (i10 == 5) {
            return this.f5804a0;
        }
        if (i10 == 6) {
            return this.L;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m("Invalid state to get top offset: ", i10));
    }

    public final boolean G() {
        WeakReference<V> weakReference = this.f5806b0;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f5806b0.get()).getLocationOnScreen(iArr);
        if (iArr[1] == 0) {
            return true;
        }
        return false;
    }

    public final void H(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.f5808c0) == null) {
            this.f5808c0 = new WeakReference<>(view);
            O(1, view);
            return;
        }
        z(1, weakReference.get());
        this.f5808c0 = null;
    }

    public final void I(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (!z10 && this.S == 5) {
                K(4);
            }
            P();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f5813f
            if (r4 != 0) goto L_0x0015
            r3.f5813f = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f5813f
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f5811e
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x001f
        L_0x0017:
            r3.f5813f = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f5811e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.S()
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.J(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (w1.d0.g.b(r4) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L_0x005d
            r1 = 2
            if (r4 != r1) goto L_0x0007
            goto L_0x005d
        L_0x0007:
            boolean r1 = r3.P
            if (r1 != 0) goto L_0x000f
            r1 = 5
            if (r4 != r1) goto L_0x000f
            return
        L_0x000f:
            r1 = 6
            if (r4 != r1) goto L_0x0020
            boolean r1 = r3.f5805b
            if (r1 == 0) goto L_0x0020
            int r1 = r3.F(r4)
            int r2 = r3.K
            if (r1 > r2) goto L_0x0020
            r1 = 3
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            java.lang.ref.WeakReference<V> r2 = r3.f5806b0
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002c
            goto L_0x0059
        L_0x002c:
            java.lang.ref.WeakReference<V> r4 = r3.f5806b0
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L_0x004e
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x004e
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            boolean r1 = w1.d0.g.b(r4)
            if (r1 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x0055
            r4.post(r2)
            goto L_0x005c
        L_0x0055:
            r2.run()
            goto L_0x005c
        L_0x0059:
            r3.L(r4)
        L_0x005c:
            return
        L_0x005d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            if (r4 != r0) goto L_0x006a
            java.lang.String r4 = "DRAGGING"
            goto L_0x006c
        L_0x006a:
            java.lang.String r4 = "SETTLING"
        L_0x006c:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = android.support.v4.media.a.o(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.K(int):void");
    }

    public final void L(int i10) {
        View view;
        if (this.S != i10) {
            this.S = i10;
            WeakReference<V> weakReference = this.f5806b0;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 3) {
                    R(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    R(false);
                }
                Q(i10, true);
                for (int i11 = 0; i11 < this.f5812e0.size(); i11++) {
                    this.f5812e0.get(i11).c(i10, view);
                }
                P();
            }
        }
    }

    public final boolean M(View view, float f10) {
        if (this.Q) {
            return true;
        }
        if (view.getTop() < this.N) {
            return false;
        }
        int y10 = y();
        if (Math.abs(((f10 * this.X) + ((float) view.getTop())) - ((float) this.N)) / ((float) y10) > 0.5f) {
            return true;
        }
        return false;
    }

    public final void N(View view, int i10, boolean z10) {
        boolean z11;
        int F2 = F(i10);
        c2.c cVar = this.T;
        if (cVar == null || (!z10 ? !cVar.u(view, view.getLeft(), F2) : !cVar.s(view.getLeft(), F2))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            L(2);
            Q(i10, true);
            this.H.a(i10);
            return;
        }
        L(i10);
    }

    public final void O(int i10, View view) {
        int i11;
        boolean z10;
        w1.a aVar;
        View view2 = view;
        if (view2 != null) {
            z(i10, view);
            int i12 = 6;
            if (!this.f5805b && this.S != 6) {
                SparseIntArray sparseIntArray = this.f5820l0;
                String string = view.getResources().getString(R$string.bottomsheet_action_expand_halfway);
                v7.c cVar = new v7.c(this, 6);
                ArrayList f10 = d0.f(view);
                int i13 = 0;
                while (true) {
                    if (i13 >= f10.size()) {
                        int i14 = 0;
                        int i15 = -1;
                        while (true) {
                            int[] iArr = d0.f16301d;
                            if (i14 >= iArr.length || i15 != -1) {
                                i11 = i15;
                            } else {
                                int i16 = iArr[i14];
                                boolean z11 = true;
                                for (int i17 = 0; i17 < f10.size(); i17++) {
                                    if (((f.a) f10.get(i17)).a() != i16) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    z11 &= z10;
                                }
                                if (z11) {
                                    i15 = i16;
                                }
                                i14++;
                            }
                        }
                        i11 = i15;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f.a) f10.get(i13)).f16876a).getLabel())) {
                        i11 = ((f.a) f10.get(i13)).a();
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i11 != -1) {
                    f.a aVar2 = new f.a((Object) null, i11, string, cVar, (Class) null);
                    View.AccessibilityDelegate d10 = d0.d(view);
                    if (d10 == null) {
                        aVar = null;
                    } else if (d10 instanceof a.C0209a) {
                        aVar = ((a.C0209a) d10).f16282a;
                    } else {
                        aVar = new w1.a(d10);
                    }
                    if (aVar == null) {
                        aVar = new w1.a();
                    }
                    d0.o(view2, aVar);
                    d0.l(aVar2.a(), view2);
                    d0.f(view).add(aVar2);
                    d0.i(0, view2);
                }
                sparseIntArray.put(i10, i11);
            }
            if (this.P && this.S != 5) {
                d0.m(view2, f.a.f16872l, (String) null, new v7.c(this, 5));
            }
            int i18 = this.S;
            if (i18 == 3) {
                if (this.f5805b) {
                    i12 = 4;
                }
                d0.m(view2, f.a.f16871k, (String) null, new v7.c(this, i12));
            } else if (i18 == 4) {
                if (this.f5805b) {
                    i12 = 3;
                }
                d0.m(view2, f.a.f16870j, (String) null, new v7.c(this, i12));
            } else if (i18 == 6) {
                d0.m(view2, f.a.f16871k, (String) null, new v7.c(this, 4));
                d0.m(view2, f.a.f16870j, (String) null, new v7.c(this, 3));
            }
        }
    }

    public final void P() {
        WeakReference<V> weakReference = this.f5806b0;
        if (weakReference != null) {
            O(0, (View) weakReference.get());
        }
        WeakReference<View> weakReference2 = this.f5808c0;
        if (weakReference2 != null) {
            O(1, weakReference2.get());
        }
    }

    public final void Q(int i10, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        if (i10 != 2) {
            if (this.S != 3 || (!this.E && !G())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.G != z11 && this.f5824p != null) {
                this.G = z11;
                float f10 = 1.0f;
                if (!z10 || (valueAnimator = this.I) == null) {
                    ValueAnimator valueAnimator2 = this.I;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        this.I.cancel();
                    }
                    h hVar = this.f5824p;
                    if (this.G) {
                        f10 = x();
                    }
                    hVar.o(f10);
                } else if (valueAnimator.isRunning()) {
                    this.I.reverse();
                } else {
                    float f11 = this.f5824p.f12778a.f12807j;
                    if (z11) {
                        f10 = x();
                    }
                    this.I.setFloatValues(new float[]{f11, f10});
                    this.I.start();
                }
            }
        }
    }

    public final void R(boolean z10) {
        WeakReference<V> weakReference = this.f5806b0;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f5819k0 == null) {
                        this.f5819k0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    V childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.f5806b0.get() && z10) {
                        this.f5819k0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z10) {
                    this.f5819k0 = null;
                }
            }
        }
    }

    public final void S() {
        View view;
        if (this.f5806b0 != null) {
            w();
            if (this.S == 4 && (view = (View) this.f5806b0.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void a(d.b bVar) {
        f8.e eVar = this.f5815g0;
        if (eVar != null) {
            d.b bVar2 = eVar.f10045f;
            eVar.f10045f = bVar;
            if (bVar2 != null) {
                eVar.b(bVar.f8420c);
            }
        }
    }

    public final void b() {
        f8.e eVar = this.f5815g0;
        if (eVar != null) {
            d.b bVar = eVar.f10045f;
            eVar.f10045f = null;
            int i10 = 4;
            if (bVar == null || Build.VERSION.SDK_INT < 34) {
                if (this.P) {
                    i10 = 5;
                }
                K(i10);
            } else if (this.P) {
                b bVar2 = new b();
                float scaleY = eVar.f10041b.getScaleY() * ((float) eVar.f10041b.getHeight());
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eVar.f10041b, View.TRANSLATION_Y, new float[]{scaleY});
                ofFloat.setInterpolator(new q2.b());
                ofFloat.setDuration((long) t7.b.b(bVar.f8420c, eVar.f10042c, eVar.f10043d));
                ofFloat.addListener(new f8.d(eVar));
                ofFloat.addListener(bVar2);
                ofFloat.start();
            } else {
                AnimatorSet a10 = eVar.a();
                a10.setDuration((long) t7.b.b(bVar.f8420c, eVar.f10042c, eVar.f10043d));
                a10.start();
                K(4);
            }
        }
    }

    public final void c(d.b bVar) {
        f8.e eVar = this.f5815g0;
        if (eVar != null) {
            eVar.f10045f = bVar;
        }
    }

    public final void d() {
        f8.e eVar = this.f5815g0;
        if (eVar != null) {
            d.b bVar = eVar.f10045f;
            eVar.f10045f = null;
            if (bVar != null) {
                AnimatorSet a10 = eVar.a();
                a10.setDuration((long) eVar.f10044e);
                a10.start();
            }
        }
    }

    public final void g(CoordinatorLayout.e eVar) {
        this.f5806b0 = null;
        this.T = null;
        this.f5815g0 = null;
    }

    public final void j() {
        this.f5806b0 = null;
        this.T = null;
        this.f5815g0 = null;
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        int i10;
        c2.c cVar;
        boolean z10;
        View view;
        if (!v2.isShown() || !this.R) {
            this.U = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.f5816h0 = -1;
            this.f5817i0 = -1;
            VelocityTracker velocityTracker = this.f5814f0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5814f0 = null;
            }
        }
        if (this.f5814f0 == null) {
            this.f5814f0 = VelocityTracker.obtain();
        }
        this.f5814f0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f5817i0 = (int) motionEvent.getY();
            if (this.S != 2) {
                WeakReference<View> weakReference = this.f5810d0;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.s(view, x10, this.f5817i0)) {
                    this.f5816h0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5818j0 = true;
                }
            }
            if (this.f5816h0 != -1 || coordinatorLayout.s(v2, x10, this.f5817i0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.U = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5818j0 = false;
            this.f5816h0 = -1;
            if (this.U) {
                this.U = false;
                return false;
            }
        }
        if (!this.U && (cVar = this.T) != null && cVar.t(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f5810d0;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.U || this.S == 1 || coordinatorLayout.s(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.T == null || (i10 = this.f5817i0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.T.f4531b)) {
            return false;
        }
        return true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        boolean z10;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.d.b(coordinatorLayout) && !d0.d.b(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.f5806b0 == null) {
            this.f5822n = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 29 || this.f5829u || this.f5813f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f5830v || this.f5831w || this.f5832x || this.f5834z || this.A || this.B || z10) {
                x.b(v2, new v7.b(this, z10));
            }
            g gVar = new g(v2);
            if (i11 >= 30) {
                v2.setWindowInsetsAnimationCallback(new v0.d.a(gVar));
            } else {
                PathInterpolator pathInterpolator = v0.c.f16361e;
                Object tag = v2.getTag(R$id.tag_on_apply_window_listener);
                v0.c.a aVar = new v0.c.a(v2, gVar);
                v2.setTag(R$id.tag_window_insets_animation_callback, aVar);
                if (tag == null) {
                    v2.setOnApplyWindowInsetsListener(aVar);
                }
            }
            this.f5806b0 = new WeakReference<>(v2);
            this.f5815g0 = new f8.e(v2);
            h hVar = this.f5824p;
            if (hVar != null) {
                d0.d.q(v2, hVar);
                h hVar2 = this.f5824p;
                float f10 = this.O;
                if (f10 == -1.0f) {
                    f10 = d0.i.i(v2);
                }
                hVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.f5825q;
                if (colorStateList != null) {
                    d0.i.q(v2, colorStateList);
                }
            }
            P();
            if (d0.d.c(v2) == 0) {
                d0.d.s(v2, 1);
            }
        }
        if (this.T == null) {
            this.T = new c2.c(coordinatorLayout.getContext(), coordinatorLayout, this.f5821m0);
        }
        int top = v2.getTop();
        coordinatorLayout.u(i10, v2);
        this.Z = coordinatorLayout.getWidth();
        this.f5804a0 = coordinatorLayout.getHeight();
        int height = v2.getHeight();
        this.Y = height;
        int i12 = this.f5804a0;
        int i13 = i12 - height;
        int i14 = this.D;
        if (i13 < i14) {
            if (this.f5833y) {
                int i15 = this.f5827s;
                if (i15 != -1) {
                    i12 = Math.min(i12, i15);
                }
                this.Y = i12;
            } else {
                int i16 = i12 - i14;
                int i17 = this.f5827s;
                if (i17 != -1) {
                    i16 = Math.min(i16, i17);
                }
                this.Y = i16;
            }
        }
        this.K = Math.max(0, this.f5804a0 - this.Y);
        this.L = (int) ((1.0f - this.M) * ((float) this.f5804a0));
        w();
        int i18 = this.S;
        if (i18 == 3) {
            v2.offsetTopAndBottom(E());
        } else if (i18 == 6) {
            v2.offsetTopAndBottom(this.L);
        } else if (this.P && i18 == 5) {
            v2.offsetTopAndBottom(this.f5804a0);
        } else if (i18 == 4) {
            v2.offsetTopAndBottom(this.N);
        } else if (i18 == 1 || i18 == 2) {
            v2.offsetTopAndBottom(top - v2.getTop());
        }
        Q(this.S, false);
        this.f5810d0 = new WeakReference<>(B(v2));
        for (int i19 = 0; i19 < this.f5812e0.size(); i19++) {
            this.f5812e0.get(i19).a(v2);
        }
        return true;
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f5826r, marginLayoutParams.width), D(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f5827s, marginLayoutParams.height));
        return true;
    }

    public final boolean n(View view) {
        WeakReference<View> weakReference = this.f5810d0;
        if (weakReference == null || view != weakReference.get() || this.S == 3) {
            return false;
        }
        return true;
    }

    public final void o(CoordinatorLayout coordinatorLayout, V v2, View view, int i10, int i11, int[] iArr, int i12) {
        View view2;
        if (i12 != 1) {
            WeakReference<View> weakReference = this.f5810d0;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v2.getTop();
                int i13 = top - i11;
                if (i11 > 0) {
                    if (i13 < E()) {
                        int E2 = top - E();
                        iArr[1] = E2;
                        int i14 = -E2;
                        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                        v2.offsetTopAndBottom(i14);
                        L(3);
                    } else if (this.R) {
                        iArr[1] = i11;
                        WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                        v2.offsetTopAndBottom(-i11);
                        L(1);
                    } else {
                        return;
                    }
                } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                    int i15 = this.N;
                    if (i13 > i15 && !this.P) {
                        int i16 = top - i15;
                        iArr[1] = i16;
                        int i17 = -i16;
                        WeakHashMap<View, q0> weakHashMap3 = d0.f16298a;
                        v2.offsetTopAndBottom(i17);
                        L(4);
                    } else if (this.R) {
                        iArr[1] = i11;
                        WeakHashMap<View, q0> weakHashMap4 = d0.f16298a;
                        v2.offsetTopAndBottom(-i11);
                        L(1);
                    } else {
                        return;
                    }
                }
                A(v2.getTop());
                this.V = i11;
                this.W = true;
            }
        }
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    public final void r(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i10 = this.f5803a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f5811e = savedState.f5836d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f5805b = savedState.f5837e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.P = savedState.f5838f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.Q = savedState.f5839n;
            }
        }
        int i11 = savedState.f5835c;
        if (i11 == 1 || i11 == 2) {
            this.S = 4;
        } else {
            this.S = i11;
        }
    }

    public final Parcelable s(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean t(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i10, int i11) {
        this.V = 0;
        this.W = false;
        if ((i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5.getTop() <= r3.L) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r4 - r3.K) < java.lang.Math.abs(r4 - r3.N)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.N)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.N)) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (java.lang.Math.abs(r4 - r3.L) < java.lang.Math.abs(r4 - r3.N)) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.E()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.L(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f5810d0
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00b6
            boolean r4 = r3.W
            if (r4 != 0) goto L_0x001f
            goto L_0x00b6
        L_0x001f:
            int r4 = r3.V
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L_0x0035
            boolean r4 = r3.f5805b
            if (r4 == 0) goto L_0x002b
            goto L_0x00b0
        L_0x002b:
            int r4 = r5.getTop()
            int r6 = r3.L
            if (r4 <= r6) goto L_0x00b0
            goto L_0x00ad
        L_0x0035:
            boolean r4 = r3.P
            if (r4 == 0) goto L_0x0056
            android.view.VelocityTracker r4 = r3.f5814f0
            if (r4 != 0) goto L_0x003f
            r4 = 0
            goto L_0x004e
        L_0x003f:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f5807c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.f5814f0
            int r1 = r3.f5816h0
            float r4 = r4.getYVelocity(r1)
        L_0x004e:
            boolean r4 = r3.M(r5, r4)
            if (r4 == 0) goto L_0x0056
            r0 = 5
            goto L_0x00b0
        L_0x0056:
            int r4 = r3.V
            if (r4 != 0) goto L_0x0093
            int r4 = r5.getTop()
            boolean r1 = r3.f5805b
            if (r1 == 0) goto L_0x0074
            int r7 = r3.K
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.N
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto L_0x00af
            goto L_0x00b0
        L_0x0074:
            int r1 = r3.L
            if (r4 >= r1) goto L_0x0083
            int r6 = r3.N
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L_0x00ad
            goto L_0x00b0
        L_0x0083:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.N
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
            goto L_0x00ad
        L_0x0093:
            boolean r4 = r3.f5805b
            if (r4 == 0) goto L_0x0098
            goto L_0x00af
        L_0x0098:
            int r4 = r5.getTop()
            int r0 = r3.L
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.N
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
        L_0x00ad:
            r0 = r7
            goto L_0x00b0
        L_0x00af:
            r0 = r6
        L_0x00b0:
            r4 = 0
            r3.N(r5, r0, r4)
            r3.W = r4
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.S;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        c2.c cVar = this.T;
        if (cVar == null || (!this.R && i10 != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            cVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f5816h0 = -1;
            this.f5817i0 = -1;
            VelocityTracker velocityTracker = this.f5814f0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5814f0 = null;
            }
        }
        if (this.f5814f0 == null) {
            this.f5814f0 = VelocityTracker.obtain();
        }
        this.f5814f0.addMovement(motionEvent);
        if (this.T != null && (this.R || this.S == 1)) {
            z11 = true;
        }
        if (z11 && actionMasked == 2 && !this.U) {
            float abs = Math.abs(((float) this.f5817i0) - motionEvent.getY());
            c2.c cVar2 = this.T;
            if (abs > ((float) cVar2.f4531b)) {
                cVar2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v2);
            }
        }
        return !this.U;
    }

    public final void w() {
        int y10 = y();
        if (this.f5805b) {
            this.N = Math.max(this.f5804a0 - y10, this.K);
        } else {
            this.N = this.f5804a0 - y10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float x() {
        /*
            r5 = this;
            l8.h r0 = r5.f5824p
            r1 = 0
            if (r0 == 0) goto L_0x0070
            java.lang.ref.WeakReference<V> r0 = r5.f5806b0
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0070
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0070
            java.lang.ref.WeakReference<V> r0 = r5.f5806b0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.G()
            if (r2 == 0) goto L_0x0070
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0070
            l8.h r2 = r5.f5824p
            float r2 = r2.j()
            android.view.RoundedCorner r3 = r0.getRoundedCorner(0)
            if (r3 == 0) goto L_0x0044
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0044
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0044
            float r3 = r3 / r2
            goto L_0x0045
        L_0x0044:
            r3 = r1
        L_0x0045:
            l8.h r2 = r5.f5824p
            l8.h$b r4 = r2.f12778a
            l8.m r4 = r4.f12798a
            l8.d r4 = r4.f12830f
            android.graphics.RectF r2 = r2.h()
            float r2 = r4.a(r2)
            r4 = 1
            android.view.RoundedCorner r0 = r0.getRoundedCorner(r4)
            if (r0 == 0) goto L_0x006b
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x006b
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x006b
            float r1 = r0 / r2
        L_0x006b:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.x():float");
    }

    public final int y() {
        int i10;
        if (this.f5813f) {
            return Math.min(Math.max(this.f5822n, this.f5804a0 - ((this.Z * 9) / 16)), this.Y) + this.C;
        }
        if (this.f5829u || this.f5830v || (i10 = this.f5828t) <= 0) {
            return this.f5811e + this.C;
        }
        return Math.max(this.f5811e, i10 + this.f5823o);
    }

    public final void z(int i10, View view) {
        if (view != null) {
            d0.l(524288, view);
            d0.i(0, view);
            d0.l(262144, view);
            d0.i(0, view);
            d0.l(1048576, view);
            d0.i(0, view);
            int i11 = this.f5820l0.get(i10, -1);
            if (i11 != -1) {
                d0.l(i11, view);
                d0.i(0, view);
                this.f5820l0.delete(i10);
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f5835c;

        /* renamed from: d  reason: collision with root package name */
        public int f5836d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5837e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5838f;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5839n;

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
            this.f5835c = parcel.readInt();
            this.f5836d = parcel.readInt();
            boolean z10 = false;
            this.f5837e = parcel.readInt() == 1;
            this.f5838f = parcel.readInt() == 1;
            this.f5839n = parcel.readInt() == 1 ? true : z10;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f5835c);
            parcel.writeInt(this.f5836d);
            parcel.writeInt(this.f5837e ? 1 : 0);
            parcel.writeInt(this.f5838f ? 1 : 0);
            parcel.writeInt(this.f5839n ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f5835c = bottomSheetBehavior.S;
            this.f5836d = bottomSheetBehavior.f5811e;
            this.f5837e = bottomSheetBehavior.f5805b;
            this.f5838f = bottomSheetBehavior.P;
            this.f5839n = bottomSheetBehavior.Q;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f5823o = context.getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        int i11 = R$styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f5825q = i8.c.a(context, obtainStyledAttributes, i11);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.F = new m(m.c(context, attributeSet, R$attr.bottomSheetStyle, f5802n0));
        }
        if (this.F != null) {
            h hVar = new h(this.F);
            this.f5824p = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.f5825q;
            if (colorStateList != null) {
                this.f5824p.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f5824p.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x(), 1.0f});
        this.I = ofFloat;
        ofFloat.setDuration(500);
        this.I.addUpdateListener(new v7.a(this));
        this.O = obtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i12 = R$styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i12)) {
            this.f5826r = obtainStyledAttributes.getDimensionPixelSize(i12, -1);
        }
        int i13 = R$styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i13)) {
            this.f5827s = obtainStyledAttributes.getDimensionPixelSize(i13, -1);
        }
        int i14 = R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i14);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            J(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        } else {
            J(i10);
        }
        I(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f5829u = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z10 = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f5805b != z10) {
            this.f5805b = z10;
            if (this.f5806b0 != null) {
                w();
            }
            L((!this.f5805b || this.S != 6) ? this.S : 3);
            Q(this.S, true);
            P();
        }
        this.Q = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.R = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f5803a = obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f10 = obtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.M = f10;
        if (this.f5806b0 != null) {
            this.L = (int) ((1.0f - f10) * ((float) this.f5804a0));
        }
        int i15 = R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i15);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i15, 0);
            if (dimensionPixelOffset >= 0) {
                this.J = dimensionPixelOffset;
                Q(this.S, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i16 = peekValue2.data;
            if (i16 >= 0) {
                this.J = i16;
                Q(this.S, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f5809d = obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.f5830v = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f5831w = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f5832x = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f5833y = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f5834z = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.A = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.B = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.E = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.f5807c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
