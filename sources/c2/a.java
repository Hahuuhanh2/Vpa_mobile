package c2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c2.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import x1.f;
import x1.g;
import x1.i;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends w1.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f4511n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final C0046a f4512o = new C0046a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f4513p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4514d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f4515e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f4516f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4517g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f4518h;

    /* renamed from: i  reason: collision with root package name */
    public final View f4519i;

    /* renamed from: j  reason: collision with root package name */
    public c f4520j;

    /* renamed from: k  reason: collision with root package name */
    public int f4521k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f4522l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f4523m = Integer.MIN_VALUE;

    /* renamed from: c2.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    public class C0046a implements b.a<f> {
    }

    /* compiled from: ExploreByTouchHelper */
    public class b {
    }

    /* compiled from: ExploreByTouchHelper */
    public class c extends g {
        public c() {
        }

        public final f a(int i10) {
            return new f(AccessibilityNodeInfo.obtain(a.this.r(i10).f16862a));
        }

        public final f b(int i10) {
            int i11;
            if (i10 == 2) {
                i11 = a.this.f4521k;
            } else {
                i11 = a.this.f4522l;
            }
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i11);
        }

        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            if (i10 != -1) {
                boolean z10 = true;
                if (i11 == 1) {
                    return aVar.w(i10);
                }
                if (i11 == 2) {
                    return aVar.j(i10);
                }
                if (i11 != 64) {
                    if (i11 != 128) {
                        return aVar.s(i10, i11, bundle);
                    }
                    if (aVar.f4521k == i10) {
                        aVar.f4521k = Integer.MIN_VALUE;
                        aVar.f4519i.invalidate();
                        aVar.x(i10, 65536);
                        return z10;
                    }
                } else if (aVar.f4518h.isEnabled() && aVar.f4518h.isTouchExplorationEnabled() && (i12 = aVar.f4521k) != i10) {
                    if (i12 != Integer.MIN_VALUE) {
                        aVar.f4521k = Integer.MIN_VALUE;
                        aVar.f4519i.invalidate();
                        aVar.x(i12, 65536);
                    }
                    aVar.f4521k = i10;
                    aVar.f4519i.invalidate();
                    aVar.x(i10, 32768);
                    return z10;
                }
                z10 = false;
                return z10;
            }
            View view = aVar.f4519i;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return d0.d.j(view, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f4519i = view;
            this.f4518h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.d.c(view) == 0) {
                d0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final g b(View view) {
        if (this.f4520j == null) {
            this.f4520j = new c();
        }
        return this.f4520j;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final void d(View view, f fVar) {
        this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
        t(fVar);
    }

    public final boolean j(int i10) {
        if (this.f4522l != i10) {
            return false;
        }
        this.f4522l = Integer.MIN_VALUE;
        v(i10, false);
        x(i10, 8);
        return true;
    }

    public final AccessibilityEvent k(int i10, int i11) {
        if (i10 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            f r10 = r(i10);
            obtain.getText().add(r10.g());
            obtain.setContentDescription(r10.f16862a.getContentDescription());
            obtain.setScrollable(r10.f16862a.isScrollable());
            obtain.setPassword(r10.f16862a.isPassword());
            obtain.setEnabled(r10.f16862a.isEnabled());
            obtain.setChecked(r10.f16862a.isChecked());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(r10.f16862a.getClassName());
                i.a(obtain, this.f4519i, i10);
                obtain.setPackageName(this.f4519i.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i11);
        this.f4519i.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final f l(int i10) {
        boolean z10;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        fVar.i("android.view.View");
        Rect rect = f4511n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f4519i;
        fVar.f16863b = -1;
        obtain.setParent(view);
        u(i10, fVar);
        if (fVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        fVar.f(this.f4515e);
        if (!this.f4515e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.f4519i.getContext().getPackageName());
                View view2 = this.f4519i;
                fVar.f16864c = i10;
                obtain.setSource(view2, i10);
                boolean z11 = false;
                if (this.f4521k == i10) {
                    obtain.setAccessibilityFocused(true);
                    fVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    fVar.a(64);
                }
                if (this.f4522l == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    fVar.a(2);
                } else if (obtain.isFocusable()) {
                    fVar.a(1);
                }
                obtain.setFocused(z10);
                this.f4519i.getLocationOnScreen(this.f4517g);
                obtain.getBoundsInScreen(this.f4514d);
                if (this.f4514d.equals(rect)) {
                    fVar.f(this.f4514d);
                    if (fVar.f16863b != -1) {
                        f fVar2 = new f(AccessibilityNodeInfo.obtain());
                        for (int i11 = fVar.f16863b; i11 != -1; i11 = fVar2.f16863b) {
                            View view3 = this.f4519i;
                            fVar2.f16863b = -1;
                            fVar2.f16862a.setParent(view3, -1);
                            fVar2.f16862a.setBoundsInParent(f4511n);
                            u(i11, fVar2);
                            fVar2.f(this.f4515e);
                            Rect rect2 = this.f4514d;
                            Rect rect3 = this.f4515e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                    }
                    this.f4514d.offset(this.f4517g[0] - this.f4519i.getScrollX(), this.f4517g[1] - this.f4519i.getScrollY());
                }
                if (this.f4519i.getLocalVisibleRect(this.f4516f)) {
                    this.f4516f.offset(this.f4517g[0] - this.f4519i.getScrollX(), this.f4517g[1] - this.f4519i.getScrollY());
                    if (this.f4514d.intersect(this.f4516f)) {
                        fVar.f16862a.setBoundsInScreen(this.f4514d);
                        Rect rect4 = this.f4514d;
                        if (rect4 != null && !rect4.isEmpty() && this.f4519i.getWindowVisibility() == 0) {
                            ViewParent parent = this.f4519i.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z11 = true;
                                }
                            }
                        }
                        if (z11) {
                            fVar.f16862a.setVisibleToUser(true);
                        }
                    }
                }
                return fVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        int i10;
        if (!this.f4518h.isEnabled() || !this.f4518h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int n10 = n(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f4523m;
            if (i11 != n10) {
                this.f4523m = n10;
                x(n10, 128);
                x(i11, 256);
            }
            if (n10 != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || (i10 = this.f4523m) == Integer.MIN_VALUE) {
            return false;
        } else {
            if (i10 != Integer.MIN_VALUE) {
                this.f4523m = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, 128);
                x(i10, 256);
            }
            return true;
        }
    }

    public abstract int n(float f10, float f11);

    public abstract void o(ArrayList arrayList);

    public final void p(int i10) {
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.f4518h.isEnabled() && (parent = this.f4519i.getParent()) != null) {
            AccessibilityEvent k10 = k(i10, 2048);
            x1.b.b(k10, 0);
            parent.requestSendAccessibilityEvent(this.f4519i, k10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: x1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: x1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: x1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: x1.f} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013d, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x013f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0149 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.o(r3)
            v0.i r4 = new v0.i
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            x1.f r7 = r0.l(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.e(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f4522l
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r3 != r6) goto L_0x0042
            r3 = r7
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r4.c(r3, r7)
            x1.f r3 = (x1.f) r3
        L_0x0048:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0150
            if (r1 == r8) goto L_0x0150
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0068
            if (r1 == r12) goto L_0x0068
            if (r1 == r11) goto L_0x0068
            if (r1 != r8) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0068:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f4522l
            java.lang.String r7 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r6) goto L_0x007b
            x1.f r2 = r0.r(r15)
            r2.f(r14)
            goto L_0x00a8
        L_0x007b:
            if (r2 == 0) goto L_0x0081
            r14.set(r2)
            goto L_0x00a8
        L_0x0081:
            android.view.View r2 = r0.f4519i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a5
            if (r1 == r12) goto L_0x00a1
            if (r1 == r11) goto L_0x009d
            if (r1 != r8) goto L_0x0097
            r14.set(r5, r9, r15, r9)
            goto L_0x00a8
        L_0x0097:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x009d:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a8
        L_0x00a1:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a8
        L_0x00a5:
            r14.set(r15, r5, r15, r2)
        L_0x00a8:
            c2.a$b r2 = f4513p
            c2.a$a r15 = f4512o
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r14)
            if (r1 == r13) goto L_0x00dc
            if (r1 == r12) goto L_0x00d3
            if (r1 == r11) goto L_0x00c9
            if (r1 != r8) goto L_0x00c3
            int r7 = r14.height()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00c3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x00c9:
            int r7 = r14.width()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r7, r5)
            goto L_0x00e4
        L_0x00d3:
            int r7 = r14.height()
            int r7 = r7 + r10
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00dc:
            int r7 = r14.width()
            int r7 = r7 + r10
            r6.offset(r7, r5)
        L_0x00e4:
            r2.getClass()
            int r2 = r4.f16011c
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r8 = r5
            r16 = 0
        L_0x00f1:
            if (r8 >= r2) goto L_0x014c
            java.lang.Object[] r11 = r4.f16010b
            r11 = r11[r8]
            x1.f r11 = (x1.f) r11
            if (r11 != r3) goto L_0x00fc
            goto L_0x0149
        L_0x00fc:
            r15.getClass()
            r11.f(r7)
            boolean r12 = c2.b.c(r1, r14, r7)
            if (r12 != 0) goto L_0x0109
            goto L_0x0141
        L_0x0109:
            boolean r12 = c2.b.c(r1, r14, r6)
            if (r12 != 0) goto L_0x0110
            goto L_0x013f
        L_0x0110:
            boolean r12 = c2.b.a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0117
            goto L_0x013f
        L_0x0117:
            boolean r12 = c2.b.a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x011e
            goto L_0x0141
        L_0x011e:
            int r12 = c2.b.d(r1, r14, r7)
            int r13 = c2.b.e(r1, r14, r7)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = c2.b.d(r1, r14, r6)
            int r17 = c2.b.e(r1, r14, r6)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x0141
        L_0x013f:
            r12 = r10
            goto L_0x0142
        L_0x0141:
            r12 = r5
        L_0x0142:
            if (r12 == 0) goto L_0x0149
            r6.set(r7)
            r16 = r11
        L_0x0149:
            int r8 = r8 + 1
            goto L_0x00f1
        L_0x014c:
            r1 = r16
            goto L_0x01bb
        L_0x0150:
            android.view.View r2 = r0.f4519i
            java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
            int r2 = w1.d0.e.d(r2)
            if (r2 != r10) goto L_0x015c
            r2 = r10
            goto L_0x015d
        L_0x015c:
            r2 = r5
        L_0x015d:
            c2.a$b r6 = f4513p
            c2.a$a r7 = f4512o
            r6.getClass()
            int r6 = r4.f16011c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = r5
        L_0x016c:
            if (r12 >= r6) goto L_0x017a
            java.lang.Object[] r13 = r4.f16010b
            r13 = r13[r12]
            x1.f r13 = (x1.f) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x016c
        L_0x017a:
            c2.b$b r6 = new c2.b$b
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x01a2
            if (r1 != r8) goto L_0x019a
            int r1 = r11.size()
            if (r3 != 0) goto L_0x018e
            r2 = r9
            goto L_0x0192
        L_0x018e:
            int r2 = r11.lastIndexOf(r3)
        L_0x0192:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01b5
            java.lang.Object r7 = r11.get(r2)
            goto L_0x01b6
        L_0x019a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01a9
            goto L_0x01ad
        L_0x01a9:
            int r1 = r11.indexOf(r3)
        L_0x01ad:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x01b5
            java.lang.Object r7 = r11.get(r1)
            goto L_0x01b6
        L_0x01b5:
            r7 = 0
        L_0x01b6:
            r16 = r7
            x1.f r16 = (x1.f) r16
            goto L_0x014c
        L_0x01bb:
            if (r1 != 0) goto L_0x01c0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01d3
        L_0x01c0:
            int r2 = r4.f16011c
            if (r5 >= r2) goto L_0x01cf
            java.lang.Object[] r2 = r4.f16010b
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01cc
            r9 = r5
            goto L_0x01cf
        L_0x01cc:
            int r5 = r5 + 1
            goto L_0x01c0
        L_0x01cf:
            int[] r1 = r4.f16009a
            r6 = r1[r9]
        L_0x01d3:
            boolean r1 = r0.w(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a.q(int, android.graphics.Rect):boolean");
    }

    public final f r(int i10) {
        if (i10 != -1) {
            return l(i10);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f4519i);
        f fVar = new f(obtain);
        View view = this.f4519i;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                fVar.f16862a.addChild(this.f4519i, ((Integer) arrayList.get(i11)).intValue());
            }
            return fVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean s(int i10, int i11, Bundle bundle);

    public void t(f fVar) {
    }

    public abstract void u(int i10, f fVar);

    public void v(int i10, boolean z10) {
    }

    public final boolean w(int i10) {
        int i11;
        if ((!this.f4519i.isFocused() && !this.f4519i.requestFocus()) || (i11 = this.f4522l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f4522l = i10;
        v(i10, true);
        x(i10, 8);
        return true;
    }

    public final void x(int i10, int i11) {
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.f4518h.isEnabled() && (parent = this.f4519i.getParent()) != null) {
            parent.requestSendAccessibilityEvent(this.f4519i, k(i10, i11));
        }
    }
}
