package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c2.c;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import x1.f;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public c2.c f5733a;

    /* renamed from: b  reason: collision with root package name */
    public b f5734b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5735c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5736d;

    /* renamed from: e  reason: collision with root package name */
    public int f5737e = 2;

    /* renamed from: f  reason: collision with root package name */
    public float f5738f = 0.5f;

    /* renamed from: n  reason: collision with root package name */
    public float f5739n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f5740o = 0.5f;

    /* renamed from: p  reason: collision with root package name */
    public final a f5741p = new a();

    public class a extends c.C0048c {

        /* renamed from: a  reason: collision with root package name */
        public int f5742a;

        /* renamed from: b  reason: collision with root package name */
        public int f5743b = -1;

        public a() {
        }

        public final int a(View view, int i10) {
            boolean z10;
            int i11;
            int i12;
            int i13;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.e.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = SwipeDismissBehavior.this.f5737e;
            if (i14 != 0) {
                if (i14 != 1) {
                    i12 = this.f5742a - view.getWidth();
                    i11 = view.getWidth() + this.f5742a;
                } else if (z10) {
                    i12 = this.f5742a;
                    i13 = view.getWidth();
                } else {
                    i12 = this.f5742a - view.getWidth();
                    i11 = this.f5742a;
                }
                return Math.min(Math.max(i12, i10), i11);
            } else if (z10) {
                i12 = this.f5742a - view.getWidth();
                i11 = this.f5742a;
                return Math.min(Math.max(i12, i10), i11);
            } else {
                i12 = this.f5742a;
                i13 = view.getWidth();
            }
            i11 = i13 + i12;
            return Math.min(Math.max(i12, i10), i11);
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            return view.getWidth();
        }

        public final void g(int i10, View view) {
            this.f5743b = i10;
            this.f5742a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f5736d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f5736d = false;
            }
        }

        public final void h(int i10) {
            b bVar = SwipeDismissBehavior.this.f5734b;
            if (bVar != null) {
                e eVar = (e) bVar;
                if (i10 == 0) {
                    g b10 = g.b();
                    BaseTransientBottomBar.c cVar = eVar.f6855a.f6829t;
                    synchronized (b10.f6858a) {
                        if (b10.c(cVar)) {
                            g.c cVar2 = b10.f6860c;
                            if (cVar2.f6865c) {
                                cVar2.f6865c = false;
                                b10.d(cVar2);
                            }
                        }
                    }
                } else if (i10 == 1 || i10 == 2) {
                    g b11 = g.b();
                    BaseTransientBottomBar.c cVar3 = eVar.f6855a.f6829t;
                    synchronized (b11.f6858a) {
                        if (b11.c(cVar3)) {
                            g.c cVar4 = b11.f6860c;
                            if (!cVar4.f6865c) {
                                cVar4.f6865c = true;
                                b11.f6859b.removeCallbacksAndMessages(cVar4);
                            }
                        }
                    }
                }
            }
        }

        public final void i(View view, int i10, int i11) {
            float width = ((float) view.getWidth()) * SwipeDismissBehavior.this.f5739n;
            float width2 = ((float) view.getWidth()) * SwipeDismissBehavior.this.f5740o;
            float abs = (float) Math.abs(i10 - this.f5742a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f5742a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f5744c.f5738f)) goto L_0x0054;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f5743b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0039
                java.util.WeakHashMap<android.view.View, w1.q0> r4 = w1.d0.f16298a
                int r4 = w1.d0.e.d(r8)
                if (r4 != r2) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f5737e
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x0054
            L_0x0021:
                if (r5 != 0) goto L_0x002d
                if (r4 == 0) goto L_0x002a
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x002a:
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x002d:
                if (r5 != r2) goto L_0x0056
                if (r4 == 0) goto L_0x0034
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x0034:
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x0039:
                int r1 = r8.getLeft()
                int r4 = r7.f5742a
                int r1 = r1 - r4
                int r4 = r8.getWidth()
                float r4 = (float) r4
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r5 = r5.f5738f
                float r4 = r4 * r5
                int r4 = java.lang.Math.round(r4)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r4) goto L_0x0056
            L_0x0054:
                r1 = r2
                goto L_0x0057
            L_0x0056:
                r1 = r3
            L_0x0057:
                if (r1 == 0) goto L_0x006d
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 < 0) goto L_0x0068
                int r9 = r8.getLeft()
                int r0 = r7.f5742a
                if (r9 >= r0) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                int r0 = r0 + r10
                goto L_0x0070
            L_0x0068:
                int r9 = r7.f5742a
                int r0 = r9 - r10
                goto L_0x0070
            L_0x006d:
                int r0 = r7.f5742a
                r2 = r3
            L_0x0070:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                c2.c r9 = r9.f5733a
                int r10 = r8.getTop()
                boolean r9 = r9.s(r0, r10)
                if (r9 == 0) goto L_0x008b
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, w1.q0> r10 = w1.d0.f16298a
                w1.d0.d.m(r8, r9)
                goto L_0x0098
            L_0x008b:
                if (r2 == 0) goto L_0x0098
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f5734b
                if (r9 == 0) goto L_0x0098
                com.google.android.material.snackbar.e r9 = (com.google.android.material.snackbar.e) r9
                r9.a(r8)
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        public final boolean k(int i10, View view) {
            int i11 = this.f5743b;
            if ((i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.w(view)) {
                return true;
            }
            return false;
        }
    }

    public interface b {
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f5745a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5746b;

        public c(View view, boolean z10) {
            this.f5745a = view;
            this.f5746b = z10;
        }

        public final void run() {
            b bVar;
            c2.c cVar = SwipeDismissBehavior.this.f5733a;
            if (cVar != null && cVar.h()) {
                View view = this.f5745a;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.m(view, this);
            } else if (this.f5746b && (bVar = SwipeDismissBehavior.this.f5734b) != null) {
                ((e) bVar).a(this.f5745a);
            }
        }
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z10 = this.f5735c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.s(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5735c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5735c = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f5733a == null) {
            this.f5733a = new c2.c(coordinatorLayout.getContext(), coordinatorLayout, this.f5741p);
        }
        if (this.f5736d || !this.f5733a.t(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.d.c(v2) == 0) {
            d0.d.s(v2, 1);
            d0.l(1048576, v2);
            d0.i(0, v2);
            if (w(v2)) {
                d0.m(v2, f.a.f16872l, (String) null, new a(this));
            }
        }
        return false;
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (this.f5733a == null) {
            return false;
        }
        if (this.f5736d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5733a.m(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
