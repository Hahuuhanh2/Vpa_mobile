package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import x1.f;

public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: t  reason: collision with root package name */
    public static final int f5850t = R$style.Widget_Material3_BottomSheet_DragHandle;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityManager f5851d;

    /* renamed from: e  reason: collision with root package name */
    public BottomSheetBehavior<?> f5852e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5853f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5854n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5855o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5856p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5857q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5858r;

    /* renamed from: s  reason: collision with root package name */
    public final a f5859s;

    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        public final void b(View view) {
        }

        public final void c(int i10, View view) {
            BottomSheetDragHandleView bottomSheetDragHandleView = BottomSheetDragHandleView.this;
            int i11 = BottomSheetDragHandleView.f5850t;
            bottomSheetDragHandleView.d(i10);
        }
    }

    public class b extends w1.a {
        public b() {
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView bottomSheetDragHandleView = BottomSheetDragHandleView.this;
                int i10 = BottomSheetDragHandleView.f5850t;
                bottomSheetDragHandleView.c();
            }
        }
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f5852e;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f5812e0.remove(this.f5859s);
            this.f5852e.H((View) null);
        }
        this.f5852e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.H(this);
            d(this.f5852e.S);
            BottomSheetBehavior<?> bottomSheetBehavior3 = this.f5852e;
            a aVar = this.f5859s;
            if (!bottomSheetBehavior3.f5812e0.contains(aVar)) {
                bottomSheetBehavior3.f5812e0.add(aVar);
            }
        }
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r7 = this;
            boolean r0 = r7.f5854n
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r7.f5858r
            android.view.accessibility.AccessibilityManager r2 = r7.f5851d
            if (r2 != 0) goto L_0x000d
            goto L_0x001f
        L_0x000d:
            r2 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            java.util.List r3 = r2.getText()
            r3.add(r0)
            android.view.accessibility.AccessibilityManager r0 = r7.f5851d
            r0.sendAccessibilityEvent(r2)
        L_0x001f:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r7.f5852e
            boolean r2 = r0.f5805b
            r3 = 1
            if (r2 != 0) goto L_0x002a
            r0.getClass()
            r1 = r3
        L_0x002a:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r7.f5852e
            int r2 = r0.S
            r4 = 6
            r5 = 3
            r6 = 4
            if (r2 != r6) goto L_0x0036
            if (r1 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0036:
            if (r2 != r5) goto L_0x003d
            if (r1 == 0) goto L_0x003b
            goto L_0x0044
        L_0x003b:
            r4 = r6
            goto L_0x0044
        L_0x003d:
            boolean r1 = r7.f5855o
            if (r1 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r5 = r6
        L_0x0043:
            r4 = r5
        L_0x0044:
            r0.K(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.c():boolean");
    }

    public final void d(int i10) {
        String str;
        if (i10 == 4) {
            this.f5855o = true;
        } else if (i10 == 3) {
            this.f5855o = false;
        }
        f.a aVar = f.a.f16867g;
        if (this.f5855o) {
            str = this.f5856p;
        } else {
            str = this.f5857q;
        }
        d0.m(this, aVar, str, new ca.a(this, 11));
    }

    public final void e() {
        boolean z10;
        int i10 = 1;
        if (!this.f5853f || this.f5852e == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f5854n = z10;
        if (this.f5852e == null) {
            i10 = 2;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.s(this, i10);
        setClickable(this.f5854n);
    }

    public final void onAccessibilityStateChanged(boolean z10) {
        this.f5853f = z10;
        e();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r3 = this;
            super.onAttachedToWindow()
            r0 = r3
        L_0x0004:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L_0x0010
            android.view.View r0 = (android.view.View) r0
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 == 0) goto L_0x0026
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.e
            if (r2 == 0) goto L_0x0004
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.f2067a
            boolean r2 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r2 == 0) goto L_0x0004
            r2 = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
        L_0x0026:
            r3.setBottomSheetBehavior(r2)
            android.view.accessibility.AccessibilityManager r0 = r3.f5851d
            if (r0 == 0) goto L_0x0039
            r0.addAccessibilityStateChangeListener(r3)
            android.view.accessibility.AccessibilityManager r0 = r3.f5851d
            boolean r0 = r0.isEnabled()
            r3.onAccessibilityStateChanged(r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f5851d;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior((BottomSheetBehavior<?>) null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i10) {
        super(p8.a.a(context, attributeSet, i10, f5850t), attributeSet, i10);
        this.f5856p = getResources().getString(R$string.bottomsheet_action_expand);
        this.f5857q = getResources().getString(R$string.bottomsheet_action_collapse);
        this.f5858r = getResources().getString(R$string.bottomsheet_drag_handle_clicked);
        this.f5859s = new a();
        this.f5851d = (AccessibilityManager) getContext().getSystemService("accessibility");
        e();
        d0.o(this, new b());
    }
}
