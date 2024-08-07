package com.google.android.material.appbar;

import al.g0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l8.h;
import o1.a;
import w1.d0;
import w1.l;
import w1.q;
import w1.q0;
import w1.w0;
import x1.f;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int G = R$style.Widget_Design_AppBarLayout;
    public final TimeInterpolator A;
    public int[] B;
    public Drawable C;
    public Integer D;
    public final float E;
    public Behavior F;

    /* renamed from: a  reason: collision with root package name */
    public int f5569a;

    /* renamed from: b  reason: collision with root package name */
    public int f5570b;

    /* renamed from: c  reason: collision with root package name */
    public int f5571c;

    /* renamed from: d  reason: collision with root package name */
    public int f5572d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5573e;

    /* renamed from: f  reason: collision with root package name */
    public int f5574f;

    /* renamed from: n  reason: collision with root package name */
    public w0 f5575n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f5576o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5577p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5578q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5579r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5580s;

    /* renamed from: t  reason: collision with root package name */
    public int f5581t;

    /* renamed from: u  reason: collision with root package name */
    public WeakReference<View> f5582u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f5583v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f5584w;

    /* renamed from: x  reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f5585x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f5586y;

    /* renamed from: z  reason: collision with root package name */
    public final long f5587z;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: q  reason: collision with root package name */
        public int f5588q;

        /* renamed from: r  reason: collision with root package name */
        public int f5589r;

        /* renamed from: s  reason: collision with root package name */
        public ValueAnimator f5590s;

        /* renamed from: t  reason: collision with root package name */
        public SavedState f5591t;

        /* renamed from: u  reason: collision with root package name */
        public WeakReference<View> f5592u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f5593v;

        public class a extends w1.a {
            public a() {
            }

            public final void d(View view, f fVar) {
                this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
                fVar.m(BaseBehavior.this.f5593v);
                fVar.i(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        public static View G(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof l) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void L(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                r0 = 1
                if (r5 == 0) goto L_0x005e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.f5600a
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005e
                java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
                int r3 = w1.d0.d.d(r5)
                if (r10 <= 0) goto L_0x004b
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x005e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
            L_0x005c:
                r9 = r0
                goto L_0x005f
            L_0x005e:
                r9 = r2
            L_0x005f:
                boolean r10 = r8.f5580s
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = G(r7)
                boolean r9 = r8.e(r9)
            L_0x006b:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto L_0x00b3
                if (r9 == 0) goto L_0x00da
                h1.a r9 = r7.f2046b
                java.lang.Object r9 = r9.f10528b
                v0.h r9 = (v0.h) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r10 = r7.f2048d
                r10.clear()
                if (r9 == 0) goto L_0x008b
                java.util.ArrayList r10 = r7.f2048d
                r10.addAll(r9)
            L_0x008b:
                java.util.ArrayList r7 = r7.f2048d
                int r9 = r7.size()
                r10 = r2
            L_0x0092:
                if (r10 >= r9) goto L_0x00b1
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$e r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r11.f2067a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x00ae
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f5642f
                if (r7 == 0) goto L_0x00b1
                r2 = r0
                goto L_0x00b1
            L_0x00ae:
                int r10 = r10 + 1
                goto L_0x0092
            L_0x00b1:
                if (r2 == 0) goto L_0x00da
            L_0x00b3:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto L_0x00c0
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            L_0x00c0:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto L_0x00cd
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            L_0x00cd:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto L_0x00da
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            L_0x00da:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.L(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final int A(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final int B() {
            return w() + this.f5588q;
        }

        public final void C(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            J(coordinatorLayout, appBarLayout);
            if (appBarLayout.f5580s) {
                appBarLayout.d(appBarLayout.e(G(coordinatorLayout)));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x013b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int D(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13, int r14, int r15) {
            /*
                r10 = this;
                com.google.android.material.appbar.AppBarLayout r12 = (com.google.android.material.appbar.AppBarLayout) r12
                int r0 = r10.B()
                r1 = 0
                if (r14 == 0) goto L_0x0141
                if (r0 < r14) goto L_0x0141
                if (r0 > r15) goto L_0x0141
                int r13 = al.g0.G(r13, r14, r15)
                if (r0 == r13) goto L_0x0143
                boolean r14 = r12.f5573e
                if (r14 == 0) goto L_0x0088
                int r14 = java.lang.Math.abs(r13)
                int r15 = r12.getChildCount()
                r2 = r1
            L_0x0020:
                if (r2 >= r15) goto L_0x0088
                android.view.View r3 = r12.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
                android.view.animation.Interpolator r5 = r4.f5602c
                int r6 = r3.getTop()
                if (r14 < r6) goto L_0x0085
                int r6 = r3.getBottom()
                if (r14 > r6) goto L_0x0085
                if (r5 == 0) goto L_0x0088
                int r15 = r4.f5600a
                r2 = r15 & 1
                if (r2 == 0) goto L_0x0059
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                int r2 = r2 + r1
                r15 = r15 & 2
                if (r15 == 0) goto L_0x005a
                java.util.WeakHashMap<android.view.View, w1.q0> r15 = w1.d0.f16298a
                int r15 = w1.d0.d.d(r3)
                int r2 = r2 - r15
                goto L_0x005a
            L_0x0059:
                r2 = r1
            L_0x005a:
                java.util.WeakHashMap<android.view.View, w1.q0> r15 = w1.d0.f16298a
                boolean r15 = w1.d0.d.b(r3)
                if (r15 == 0) goto L_0x0067
                int r15 = r12.getTopInset()
                int r2 = r2 - r15
            L_0x0067:
                if (r2 <= 0) goto L_0x0088
                int r15 = r3.getTop()
                int r14 = r14 - r15
                float r15 = (float) r2
                float r14 = (float) r14
                float r14 = r14 / r15
                float r14 = r5.getInterpolation(r14)
                float r14 = r14 * r15
                int r14 = java.lang.Math.round(r14)
                int r15 = java.lang.Integer.signum(r13)
                int r2 = r3.getTop()
                int r2 = r2 + r14
                int r2 = r2 * r15
                goto L_0x0089
            L_0x0085:
                int r2 = r2 + 1
                goto L_0x0020
            L_0x0088:
                r2 = r13
            L_0x0089:
                com.google.android.material.appbar.g r14 = r10.f5650a
                if (r14 == 0) goto L_0x0092
                boolean r14 = r14.b(r2)
                goto L_0x0095
            L_0x0092:
                r10.f5651b = r2
                r14 = r1
            L_0x0095:
                int r15 = r0 - r13
                int r2 = r13 - r2
                r10.f5588q = r2
                r2 = 1
                if (r14 == 0) goto L_0x0129
                r3 = r1
            L_0x009f:
                int r4 = r12.getChildCount()
                if (r3 >= r4) goto L_0x0129
                android.view.View r4 = r12.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
                com.google.android.material.appbar.AppBarLayout$d r5 = r4.f5601b
                if (r5 == 0) goto L_0x0125
                int r4 = r4.f5600a
                r4 = r4 & r2
                if (r4 == 0) goto L_0x0125
                android.view.View r4 = r12.getChildAt(r3)
                int r6 = r10.w()
                float r6 = (float) r6
                android.graphics.Rect r7 = r5.f5604a
                r4.getDrawingRect(r7)
                r12.offsetDescendantRectToMyCoords(r4, r7)
                int r8 = r12.getTopInset()
                int r8 = -r8
                r7.offset(r1, r8)
                android.graphics.Rect r7 = r5.f5604a
                int r7 = r7.top
                float r7 = (float) r7
                float r6 = java.lang.Math.abs(r6)
                float r7 = r7 - r6
                r6 = 0
                int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r8 > 0) goto L_0x011c
                android.graphics.Rect r8 = r5.f5604a
                int r8 = r8.height()
                float r8 = (float) r8
                float r8 = r7 / r8
                float r8 = java.lang.Math.abs(r8)
                r9 = 1065353216(0x3f800000, float:1.0)
                float r6 = al.g0.F(r8, r6, r9)
                float r7 = -r7
                float r6 = r9 - r6
                float r6 = r6 * r6
                float r9 = r9 - r6
                android.graphics.Rect r6 = r5.f5604a
                int r6 = r6.height()
                float r6 = (float) r6
                r8 = 1050253722(0x3e99999a, float:0.3)
                float r6 = r6 * r8
                float r6 = r6 * r9
                float r7 = r7 - r6
                r4.setTranslationY(r7)
                android.graphics.Rect r6 = r5.f5605b
                r4.getDrawingRect(r6)
                android.graphics.Rect r6 = r5.f5605b
                float r7 = -r7
                int r7 = (int) r7
                r6.offset(r1, r7)
                android.graphics.Rect r5 = r5.f5605b
                java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
                w1.d0.f.c(r4, r5)
                goto L_0x0125
            L_0x011c:
                r5 = 0
                java.util.WeakHashMap<android.view.View, w1.q0> r7 = w1.d0.f16298a
                w1.d0.f.c(r4, r5)
                r4.setTranslationY(r6)
            L_0x0125:
                int r3 = r3 + 1
                goto L_0x009f
            L_0x0129:
                if (r14 != 0) goto L_0x0132
                boolean r14 = r12.f5573e
                if (r14 == 0) goto L_0x0132
                r11.g(r12)
            L_0x0132:
                int r14 = r10.w()
                r12.c(r14)
                if (r13 >= r0) goto L_0x013c
                r2 = -1
            L_0x013c:
                L(r11, r12, r13, r2, r1)
                r1 = r15
                goto L_0x0143
            L_0x0141:
                r10.f5588q = r1
            L_0x0143:
                r10.K(r11, r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int i11;
            int abs = Math.abs(B() - i10);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i11 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i11 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int B = B();
            if (B == i10) {
                ValueAnimator valueAnimator = this.f5590s;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f5590s.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f5590s;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f5590s = valueAnimator3;
                valueAnimator3.setInterpolator(t7.b.f14889e);
                this.f5590s.addUpdateListener(new c(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f5590s.setDuration((long) Math.min(i11, 600));
            this.f5590s.setIntValues(new int[]{B, i10});
            this.f5590s.start();
        }

        public final void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    i12 = -appBarLayout.getTotalScrollRange();
                    i11 = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    i11 = 0;
                }
                int i13 = i12;
                int i14 = i11;
                if (i13 != i14) {
                    iArr[1] = D(coordinatorLayout, appBarLayout, B() - i10, i13, i14);
                }
            }
            if (appBarLayout.f5580s) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public final SavedState I(Parcelable parcelable, T t10) {
            boolean z10;
            boolean z11;
            int w9 = w();
            int childCount = t10.getChildCount();
            boolean z12 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + w9;
                if (childAt.getTop() + w9 > 0 || bottom < 0) {
                    i10++;
                } else {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f2187b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (w9 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    savedState.f5595d = z10;
                    if (z10 || (-w9) < t10.getTotalScrollRange()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    savedState.f5594c = z11;
                    savedState.f5596e = i10;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    if (bottom == t10.getTopInset() + d0.d.d(childAt)) {
                        z12 = true;
                    }
                    savedState.f5598n = z12;
                    savedState.f5597f = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return null;
        }

        public final void J(CoordinatorLayout coordinatorLayout, T t10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int B = B() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t10.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f5600a & 32) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i11 = -B;
                if (top <= i11 && bottom >= i11) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i12 = layoutParams2.f5600a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                        if (d0.d.b(t10) && d0.d.b(childAt2)) {
                            i13 -= t10.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                        i14 += d0.d.d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, q0> weakHashMap3 = d0.f16298a;
                            int d10 = d0.d.d(childAt2) + i14;
                            if (B < d10) {
                                i13 = d10;
                            } else {
                                i14 = d10;
                            }
                        }
                    }
                    if ((i12 & 32) != 32) {
                        z10 = false;
                    }
                    if (z10) {
                        i13 += layoutParams2.topMargin;
                        i14 -= layoutParams2.bottomMargin;
                    }
                    if (B < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    F(coordinatorLayout, t10, g0.G(i13 + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public final void K(CoordinatorLayout coordinatorLayout, T t10) {
            View view;
            boolean z10;
            boolean z11;
            boolean z12;
            d0.l(f.a.f16868h.a(), coordinatorLayout);
            boolean z13 = false;
            d0.i(0, coordinatorLayout);
            d0.l(f.a.f16869i.a(), coordinatorLayout);
            d0.i(0, coordinatorLayout);
            if (t10.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        view = null;
                        break;
                    }
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (((CoordinatorLayout.e) childAt.getLayoutParams()).f2067a instanceof ScrollingViewBehavior) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
                if (view != null) {
                    int childCount2 = t10.getChildCount();
                    int i11 = 0;
                    while (true) {
                        z10 = true;
                        if (i11 >= childCount2) {
                            z11 = false;
                            break;
                        } else if (((LayoutParams) t10.getChildAt(i11).getLayoutParams()).f5600a != 0) {
                            z11 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (z11) {
                        if (d0.d(coordinatorLayout) != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            d0.o(coordinatorLayout, new a());
                        }
                        if (B() != (-t10.getTotalScrollRange())) {
                            d0.m(coordinatorLayout, f.a.f16868h, (String) null, new e(t10, false));
                            z13 = true;
                        }
                        if (B() != 0) {
                            if (view.canScrollVertically(-1)) {
                                int i12 = -t10.getDownNestedPreScrollRange();
                                if (i12 != 0) {
                                    d0.m(coordinatorLayout, f.a.f16869i, (String) null, new d(this, coordinatorLayout, t10, view, i12));
                                }
                            } else {
                                d0.m(coordinatorLayout, f.a.f16869i, (String) null, new e(t10, true));
                            }
                            this.f5593v = z10;
                        }
                        z10 = z13;
                        this.f5593v = z10;
                    }
                }
            }
        }

        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            int i11;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f5591t;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    if ((pendingAction & 4) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((pendingAction & 2) != 0) {
                        int i12 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            F(coordinatorLayout, appBarLayout, i12);
                        } else {
                            E(coordinatorLayout, appBarLayout, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            F(coordinatorLayout, appBarLayout, 0);
                        } else {
                            E(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f5594c) {
                E(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f5595d) {
                E(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f5596e);
                int i13 = -childAt.getBottom();
                if (this.f5591t.f5598n) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    i11 = appBarLayout.getTopInset() + d0.d.d(childAt) + i13;
                } else {
                    i11 = Math.round(((float) childAt.getHeight()) * this.f5591t.f5597f) + i13;
                }
                E(coordinatorLayout, appBarLayout, i11);
            }
            appBarLayout.f5574f = 0;
            this.f5591t = null;
            int G = g0.G(w(), -appBarLayout.getTotalScrollRange(), 0);
            g gVar = this.f5650a;
            if (gVar != null) {
                gVar.b(G);
            } else {
                this.f5651b = G;
            }
            L(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.c(w());
            K(coordinatorLayout, appBarLayout);
            return true;
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.e) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.v(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            H(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = D(coordinatorLayout2, appBarLayout2, B() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                K(coordinatorLayout, appBarLayout);
            }
        }

        public final void r(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = this.f5591t;
                this.f5591t = (SavedState) parcelable;
                return;
            }
            this.f5591t = null;
        }

        public final Parcelable s(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState I = I(absSavedState, (AppBarLayout) view);
            if (I == null) {
                return absSavedState;
            }
            return I;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (r2 != false) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean t(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f5580s
                if (r5 != 0) goto L_0x002d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = r6
                goto L_0x0015
            L_0x0014:
                r5 = r0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = r6
                goto L_0x0029
            L_0x0028:
                r2 = r0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = r0
            L_0x002d:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f5590s
                if (r2 == 0) goto L_0x0036
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.f5592u = r2
                r1.f5589r = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.t(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f5589r == 0 || i10 == 1) {
                J(coordinatorLayout, appBarLayout);
                if (appBarLayout.f5580s) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f5592u = new WeakReference<>(view2);
        }

        public final boolean y(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f5592u;
            if (weakReference == null || ((view2 = weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) {
                return true;
            }
            return false;
        }

        public final int z(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            public boolean f5594c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f5595d;

            /* renamed from: e  reason: collision with root package name */
            public int f5596e;

            /* renamed from: f  reason: collision with root package name */
            public float f5597f;

            /* renamed from: n  reason: collision with root package name */
            public boolean f5598n;

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
                boolean z10 = true;
                this.f5594c = parcel.readByte() != 0;
                this.f5595d = parcel.readByte() != 0;
                this.f5596e = parcel.readInt();
                this.f5597f = parcel.readFloat();
                this.f5598n = parcel.readByte() == 0 ? false : z10;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f2188a, i10);
                parcel.writeByte(this.f5594c ? (byte) 1 : 0);
                parcel.writeByte(this.f5595d ? (byte) 1 : 0);
                parcel.writeInt(this.f5596e);
                parcel.writeFloat(this.f5597f);
                parcel.writeByte(this.f5598n ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public final int A(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i10;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) view2.getLayoutParams()).f2067a;
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f5588q + this.f5641e;
                if (this.f5642f == 0) {
                    i10 = 0;
                } else {
                    float z10 = z(view2);
                    int i11 = this.f5642f;
                    i10 = g0.G((int) (z10 * ((float) i11)), 0, i11);
                }
                int i12 = bottom - i10;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                view.offsetTopAndBottom(i12);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f5580s) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                d0.l(f.a.f16868h.a(), coordinatorLayout);
                d0.i(0, coordinatorLayout);
                d0.l(f.a.f16869i.a(), coordinatorLayout);
                d0.i(0, coordinatorLayout);
                d0.o(coordinatorLayout, (w1.a) null);
            }
        }

        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList o10 = coordinatorLayout.o(view);
            int size = o10.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) o10.get(i10);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i10++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f5639c;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayout.setExpanded(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public final AppBarLayout y(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final float z(View view) {
            int i10;
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).f2067a;
                if (behavior instanceof BaseBehavior) {
                    i10 = ((BaseBehavior) behavior).B();
                } else {
                    i10 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) i10) / ((float) i11)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.f5642f = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public class a implements q {
        public a() {
        }

        public final w0 g(View view, w0 w0Var) {
            w0 w0Var2;
            boolean z10;
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.d.b(appBarLayout)) {
                w0Var2 = w0Var;
            } else {
                w0Var2 = null;
            }
            if (!v1.b.a(appBarLayout.f5575n, w0Var2)) {
                appBarLayout.f5575n = w0Var2;
                if (appBarLayout.C == null || appBarLayout.getTopInset() <= 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                appBarLayout.setWillNotDraw(!z10);
                appBarLayout.requestLayout();
            }
            return w0Var;
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(int i10);
    }

    public static abstract class c {
    }

    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f5604a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f5605b = new Rect();
    }

    public interface e {
        void a();
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public static LayoutParams a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public final void b() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.F;
        if (behavior == null || this.f5570b == -1 || this.f5574f != 0) {
            savedState = null;
        } else {
            savedState = behavior.I(AbsSavedState.f2187b, this);
        }
        this.f5570b = -1;
        this.f5571c = -1;
        this.f5572d = -1;
        if (savedState != null) {
            Behavior behavior2 = this.F;
            if (behavior2.f5591t == null) {
                behavior2.f5591t = savedState;
            }
        }
    }

    public final void c(int i10) {
        this.f5569a = i10;
        if (!willNotDraw()) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
        ArrayList arrayList = this.f5576o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f5576o.get(i11);
                if (bVar != null) {
                    bVar.a(i10);
                }
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final boolean d(boolean z10) {
        float f10;
        float f11;
        if (!(!this.f5577p) || this.f5579r == z10) {
            return false;
        }
        this.f5579r = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof h)) {
            return true;
        }
        float f12 = 0.0f;
        if (this.f5583v) {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (z10) {
                f12 = 1.0f;
            }
            g(f11, f12);
            return true;
        } else if (!this.f5580s) {
            return true;
        } else {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = this.E;
            }
            if (z10) {
                f12 = this.E;
            }
            g(f10, f12);
            return true;
        }
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        if (this.C == null || getTopInset() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f5569a));
            this.C.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.f5582u == null && (i10 = this.f5581t) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f5581t);
            }
            if (view2 != null) {
                this.f5582u = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f5582u;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (!d0.d.b(childAt)) {
            return true;
        }
        return false;
    }

    public final void g(float f10, float f11) {
        ValueAnimator valueAnimator = this.f5584w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, f11});
        this.f5584w = ofFloat;
        ofFloat.setDuration(this.f5587z);
        this.f5584w.setInterpolator(this.A);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f5585x;
        if (animatorUpdateListener != null) {
            this.f5584w.addUpdateListener(animatorUpdateListener);
        }
        this.f5584w.start();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.F = behavior;
        return behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f5571c
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x0069
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x001d
            goto L_0x0066
        L_0x001d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f5600a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0063
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x003f
            java.util.WeakHashMap<android.view.View, w1.q0> r4 = w1.d0.f16298a
            int r4 = w1.d0.d.d(r3)
        L_0x003d:
            int r4 = r4 + r7
            goto L_0x004e
        L_0x003f:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x004c
            java.util.WeakHashMap<android.view.View, w1.q0> r4 = w1.d0.f16298a
            int r4 = w1.d0.d.d(r3)
            int r4 = r5 - r4
            goto L_0x003d
        L_0x004c:
            int r4 = r7 + r5
        L_0x004e:
            if (r0 != 0) goto L_0x0061
            java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
            boolean r3 = w1.d0.d.b(r3)
            if (r3 == 0) goto L_0x0061
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0061:
            int r2 = r2 + r4
            goto L_0x0066
        L_0x0063:
            if (r2 <= 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0069:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f5571c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f5572d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = layoutParams.topMargin + layoutParams.bottomMargin + childAt.getMeasuredHeight();
                int i13 = layoutParams.f5600a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    i12 -= d0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f5572d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f5581t;
    }

    public h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h) {
            return (h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int d10 = d0.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d10 = d0.d.d(getChildAt(childCount - 1));
            } else {
                d10 = 0;
            }
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f5574f;
    }

    public Drawable getStatusBarForeground() {
        return this.C;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        w0 w0Var = this.f5575n;
        if (w0Var != null) {
            return w0Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f5570b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.f5600a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int i14 = measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + i12;
                if (i11 == 0) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    if (d0.d.b(childAt)) {
                        i14 -= getTopInset();
                    }
                }
                i12 = i14;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                    i12 -= d0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f5570b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.b.W(this);
    }

    public final int[] onCreateDrawableState(int i10) {
        int i11;
        int i12;
        if (this.B == null) {
            this.B = new int[4];
        }
        int[] iArr = this.B;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f5578q;
        int i13 = R$attr.state_liftable;
        if (!z10) {
            i13 = -i13;
        }
        iArr[0] = i13;
        if (!z10 || !this.f5579r) {
            i11 = -R$attr.state_lifted;
        } else {
            i11 = R$attr.state_lifted;
        }
        iArr[1] = i11;
        int i14 = R$attr.state_collapsible;
        if (!z10) {
            i14 = -i14;
        }
        iArr[2] = i14;
        if (!z10 || !this.f5579r) {
            i12 = -R$attr.state_collapsed;
        } else {
            i12 = R$attr.state_collapsed;
        }
        iArr[3] = i12;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f5582u;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5582u = null;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        boolean z13 = true;
        if (d0.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.f5573e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i14).getLayoutParams()).f5602c != null) {
                this.f5573e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f5577p) {
            if (!this.f5580s) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount3) {
                        z11 = false;
                        break;
                    }
                    int i16 = ((LayoutParams) getChildAt(i15).getLayoutParams()).f5600a;
                    if ((i16 & 1) != 1 || (i16 & 10) == 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        z11 = true;
                        break;
                    }
                    i15++;
                }
                if (!z11) {
                    z13 = false;
                }
            }
            if (this.f5578q != z13) {
                this.f5578q = z13;
                refreshDrawableState();
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = g0.G(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.b.U(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        setExpanded(z10, d0.g.c(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f5580s = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f5581t = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.f5582u;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f5582u = null;
            return;
        }
        this.f5582u = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f5581t = i10;
        WeakReference<View> weakReference = this.f5582u;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5582u = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f5577p = z10;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2;
        boolean z10;
        Drawable drawable3 = this.C;
        if (drawable3 != drawable) {
            Integer num = null;
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.C = drawable2;
            if (drawable2 instanceof h) {
                num = Integer.valueOf(((h) drawable2).B);
            } else {
                ColorStateList d10 = b8.b.d(drawable2);
                if (d10 != null) {
                    num = Integer.valueOf(d10.getDefaultColor());
                }
            }
            this.D = num;
            Drawable drawable4 = this.C;
            boolean z11 = false;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.C.setState(getDrawableState());
                }
                Drawable drawable5 = this.C;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                a.c.b(drawable5, d0.e.d(this));
                Drawable drawable6 = this.C;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable6.setVisible(z10, false);
                this.C.setCallback(this);
            }
            if (this.C != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(h.a.a(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.a(this, f10);
    }

    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.C) {
            return true;
        }
        return false;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.appBarLayoutStyle);
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m1generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = G
            android.content.Context r13 = p8.a.a(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            r13 = -1
            r12.f5570b = r13
            r12.f5571c = r13
            r12.f5572d = r13
            r7 = 0
            r12.f5574f = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f5586y = r0
            android.content.Context r8 = r12.getContext()
            r9 = 1
            r12.setOrientation(r9)
            int r10 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r12.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x0031
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r12.setOutlineProvider(r0)
        L_0x0031:
            android.content.Context r11 = r12.getContext()
            int[] r2 = com.google.android.material.appbar.h.f5674a
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r14
            r3 = r15
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.hasValue(r7)     // Catch:{ all -> 0x015e }
            if (r1 == 0) goto L_0x0052
            int r1 = r0.getResourceId(r7, r7)     // Catch:{ all -> 0x015e }
            android.animation.StateListAnimator r1 = android.animation.AnimatorInflater.loadStateListAnimator(r11, r1)     // Catch:{ all -> 0x015e }
            r12.setStateListAnimator(r1)     // Catch:{ all -> 0x015e }
        L_0x0052:
            r0.recycle()
            int[] r2 = com.google.android.material.R$styleable.AppBarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r6
            android.content.res.TypedArray r14 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r15 = com.google.android.material.R$styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r15 = r14.getDrawable(r15)
            java.util.WeakHashMap<android.view.View, w1.q0> r0 = w1.d0.f16298a
            w1.d0.d.q(r12, r15)
            int r15 = com.google.android.material.R$styleable.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r3 = i8.c.a(r8, r14, r15)
            if (r3 == 0) goto L_0x0076
            r15 = r9
            goto L_0x0077
        L_0x0076:
            r15 = r7
        L_0x0077:
            r12.f5583v = r15
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            android.content.res.ColorStateList r2 = b8.b.d(r15)
            if (r2 == 0) goto L_0x00c6
            l8.h r15 = new l8.h
            r15.<init>()
            r15.n(r2)
            if (r3 == 0) goto L_0x00b9
            android.content.Context r0 = r12.getContext()
            int r1 = com.google.android.material.R$attr.colorSurface
            android.util.TypedValue r1 = i8.b.a(r0, r1)
            if (r1 == 0) goto L_0x00a9
            int r4 = r1.resourceId
            if (r4 == 0) goto L_0x00a2
            int r0 = k1.a.getColor(r0, r4)
            goto L_0x00a4
        L_0x00a2:
            int r0 = r1.data
        L_0x00a4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            r5 = r0
            com.google.android.material.appbar.a r6 = new com.google.android.material.appbar.a
            r0 = r6
            r1 = r12
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r12.f5585x = r6
            w1.d0.d.q(r12, r15)
            goto L_0x00c6
        L_0x00b9:
            r15.k(r8)
            com.google.android.material.appbar.b r0 = new com.google.android.material.appbar.b
            r0.<init>(r12, r15)
            r12.f5585x = r0
            w1.d0.d.q(r12, r15)
        L_0x00c6:
            int r15 = com.google.android.material.R$attr.motionDurationMedium2
            android.content.res.Resources r0 = r12.getResources()
            int r1 = com.google.android.material.R$integer.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            int r15 = f8.j.c(r8, r15, r0)
            long r0 = (long) r15
            r12.f5587z = r0
            int r15 = com.google.android.material.R$attr.motionEasingStandardInterpolator
            android.view.animation.LinearInterpolator r0 = t7.b.f14885a
            android.animation.TimeInterpolator r15 = f8.j.d(r8, r15, r0)
            r12.A = r15
            int r15 = com.google.android.material.R$styleable.AppBarLayout_expanded
            boolean r0 = r14.hasValue(r15)
            if (r0 == 0) goto L_0x00fb
            boolean r15 = r14.getBoolean(r15, r7)
            if (r15 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r9 = 2
        L_0x00f3:
            r15 = r9 | 0
            r15 = r15 | r7
            r12.f5574f = r15
            r12.requestLayout()
        L_0x00fb:
            int r15 = com.google.android.material.R$styleable.AppBarLayout_elevation
            boolean r0 = r14.hasValue(r15)
            if (r0 == 0) goto L_0x010b
            int r15 = r14.getDimensionPixelSize(r15, r7)
            float r15 = (float) r15
            com.google.android.material.appbar.h.a(r12, r15)
        L_0x010b:
            r15 = 26
            if (r10 < r15) goto L_0x012d
            int r15 = com.google.android.material.R$styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r14.hasValue(r15)
            if (r0 == 0) goto L_0x011e
            boolean r15 = r14.getBoolean(r15, r7)
            r12.setKeyboardNavigationCluster(r15)
        L_0x011e:
            int r15 = com.google.android.material.R$styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r14.hasValue(r15)
            if (r0 == 0) goto L_0x012d
            boolean r15 = r14.getBoolean(r15, r7)
            r12.setTouchscreenBlocksFocus(r15)
        L_0x012d:
            android.content.res.Resources r15 = r12.getResources()
            int r0 = com.google.android.material.R$dimen.design_appbar_elevation
            float r15 = r15.getDimension(r0)
            r12.E = r15
            int r15 = com.google.android.material.R$styleable.AppBarLayout_liftOnScroll
            boolean r15 = r14.getBoolean(r15, r7)
            r12.f5580s = r15
            int r15 = com.google.android.material.R$styleable.AppBarLayout_liftOnScrollTargetViewId
            int r13 = r14.getResourceId(r15, r13)
            r12.f5581t = r13
            int r13 = com.google.android.material.R$styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r13 = r14.getDrawable(r13)
            r12.setStatusBarForeground(r13)
            r14.recycle()
            com.google.android.material.appbar.AppBarLayout$a r13 = new com.google.android.material.appbar.AppBarLayout$a
            r13.<init>()
            w1.d0.i.u(r12, r13)
            return
        L_0x015e:
            r13 = move-exception
            r0.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m2generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setExpanded(boolean z10, boolean z11) {
        int i10 = z10 ? 1 : 2;
        int i11 = 0;
        if (z11) {
            i11 = 4;
        }
        this.f5574f = i10 | i11 | 8;
        requestLayout();
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f5600a = 1;

        /* renamed from: b  reason: collision with root package name */
        public d f5601b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f5602c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            d dVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
            this.f5600a = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1) {
                dVar = null;
            } else {
                dVar = new d();
            }
            this.f5601b = dVar;
            int i10 = R$styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f5602c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
