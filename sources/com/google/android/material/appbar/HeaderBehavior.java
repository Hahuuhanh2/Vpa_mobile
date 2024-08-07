package com.google.android.material.appbar;

import al.g0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: c  reason: collision with root package name */
    public a f5629c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f5630d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5631e;

    /* renamed from: f  reason: collision with root package name */
    public int f5632f = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f5633n;

    /* renamed from: o  reason: collision with root package name */
    public int f5634o = -1;

    /* renamed from: p  reason: collision with root package name */
    public VelocityTracker f5635p;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final CoordinatorLayout f5636a;

        /* renamed from: b  reason: collision with root package name */
        public final V f5637b;

        public a(CoordinatorLayout coordinatorLayout, V v2) {
            this.f5636a = coordinatorLayout;
            this.f5637b = v2;
        }

        public final void run() {
            OverScroller overScroller;
            if (this.f5637b != null && (overScroller = HeaderBehavior.this.f5630d) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.E(this.f5636a, this.f5637b, headerBehavior.f5630d.getCurrY());
                    V v2 = this.f5637b;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.m(v2, this);
                    return;
                }
                HeaderBehavior.this.C(this.f5637b, this.f5636a);
            }
        }
    }

    public HeaderBehavior() {
    }

    public int A(V v2) {
        return v2.getHeight();
    }

    public int B() {
        return w();
    }

    public void C(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int D(CoordinatorLayout coordinatorLayout, V v2, int i10, int i11, int i12) {
        int G;
        int w9 = w();
        if (i11 == 0 || w9 < i11 || w9 > i12 || w9 == (G = g0.G(i10, i11, i12))) {
            return 0;
        }
        g gVar = this.f5650a;
        if (gVar != null) {
            gVar.b(G);
        } else {
            this.f5651b = G;
        }
        return w9 - G;
    }

    public final void E(CoordinatorLayout coordinatorLayout, View view, int i10) {
        D(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f5634o < 0) {
            this.f5634o = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f5631e) {
            int i10 = this.f5632f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f5633n) > this.f5634o) {
                this.f5633n = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f5632f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (!y(v2) || !coordinatorLayout.s(v2, x10, y11)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f5631e = z10;
            if (z10) {
                this.f5633n = y11;
                this.f5632f = motionEvent.getPointerId(0);
                if (this.f5635p == null) {
                    this.f5635p = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f5630d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f5630d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f5635p;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r3 = 0
            r4 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x0060
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00c3
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005d
        L_0x001c:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = r8
            goto L_0x0025
        L_0x0024:
            r0 = r9
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f5632f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f5633n = r0
            goto L_0x005d
        L_0x0036:
            int r0 = r6.f5632f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f5633n
            int r3 = r3 - r0
            r6.f5633n = r0
            int r4 = r6.z(r2)
            r5 = 0
            int r0 = r19.B()
            int r3 = r0 - r3
            r0 = r19
            r1 = r20
            r2 = r21
            r0.D(r1, r2, r3, r4, r5)
        L_0x005d:
            r0 = r9
            goto L_0x00d1
        L_0x0060:
            android.view.VelocityTracker r0 = r6.f5635p
            if (r0 == 0) goto L_0x00c3
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f5635p
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f5635p
            int r5 = r6.f5632f
            float r0 = r0.getYVelocity(r5)
            int r5 = r6.A(r2)
            int r5 = -r5
            r18 = 0
            com.google.android.material.appbar.HeaderBehavior$a r10 = r6.f5629c
            if (r10 == 0) goto L_0x0086
            r2.removeCallbacks(r10)
            r6.f5629c = r3
        L_0x0086:
            android.widget.OverScroller r10 = r6.f5630d
            if (r10 != 0) goto L_0x0095
            android.widget.OverScroller r10 = new android.widget.OverScroller
            android.content.Context r11 = r21.getContext()
            r10.<init>(r11)
            r6.f5630d = r10
        L_0x0095:
            android.widget.OverScroller r10 = r6.f5630d
            r11 = 0
            int r12 = r19.w()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r5
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f5630d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            com.google.android.material.appbar.HeaderBehavior$a r0 = new com.google.android.material.appbar.HeaderBehavior$a
            r0.<init>(r1, r2)
            r6.f5629c = r0
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            w1.d0.d.m(r2, r0)
            goto L_0x00c1
        L_0x00be:
            r6.C(r2, r1)
        L_0x00c1:
            r0 = r8
            goto L_0x00c4
        L_0x00c3:
            r0 = r9
        L_0x00c4:
            r6.f5631e = r9
            r6.f5632f = r4
            android.view.VelocityTracker r1 = r6.f5635p
            if (r1 == 0) goto L_0x00d1
            r1.recycle()
            r6.f5635p = r3
        L_0x00d1:
            android.view.VelocityTracker r1 = r6.f5635p
            if (r1 == 0) goto L_0x00d8
            r1.addMovement(r7)
        L_0x00d8:
            boolean r1 = r6.f5631e
            if (r1 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r8 = r9
        L_0x00e0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean y(V v2) {
        return false;
    }

    public int z(V v2) {
        return -v2.getHeight();
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
