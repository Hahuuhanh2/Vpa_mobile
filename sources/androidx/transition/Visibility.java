package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import i3.m;
import i3.p;
import i3.q;
import i3.r;
import m1.i;

public abstract class Visibility extends Transition {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public int F = 3;

    public static class a extends AnimatorListenerAdapter implements Transition.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f3457a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3458b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f3459c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3460d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3461e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3462f = false;

        public a(View view, int i10) {
            this.f3457a = view;
            this.f3458b = i10;
            this.f3459c = (ViewGroup) view.getParent();
            this.f3460d = true;
            f(true);
        }

        public final void a() {
            f(false);
        }

        public final void b(Transition transition) {
        }

        public final void c() {
        }

        public final void d(Transition transition) {
            if (!this.f3462f) {
                r.c(this.f3458b, this.f3457a);
                ViewGroup viewGroup = this.f3459c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            transition.z(this);
        }

        public final void e() {
            f(true);
        }

        public final void f(boolean z10) {
            ViewGroup viewGroup;
            if (this.f3460d && this.f3461e != z10 && (viewGroup = this.f3459c) != null) {
                this.f3461e = z10;
                q.a(viewGroup, z10);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f3462f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f3462f) {
                r.c(this.f3458b, this.f3457a);
                ViewGroup viewGroup = this.f3459c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f3462f) {
                r.c(this.f3458b, this.f3457a);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f3462f) {
                r.c(0, this.f3457a);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3463a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3464b;

        /* renamed from: c  reason: collision with root package name */
        public int f3465c;

        /* renamed from: d  reason: collision with root package name */
        public int f3466d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f3467e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f3468f;
    }

    public Visibility() {
    }

    public static b M(p pVar, p pVar2) {
        b bVar = new b();
        bVar.f3463a = false;
        bVar.f3464b = false;
        if (pVar == null || !pVar.f11062a.containsKey("android:visibility:visibility")) {
            bVar.f3465c = -1;
            bVar.f3467e = null;
        } else {
            bVar.f3465c = ((Integer) pVar.f11062a.get("android:visibility:visibility")).intValue();
            bVar.f3467e = (ViewGroup) pVar.f11062a.get("android:visibility:parent");
        }
        if (pVar2 == null || !pVar2.f11062a.containsKey("android:visibility:visibility")) {
            bVar.f3466d = -1;
            bVar.f3468f = null;
        } else {
            bVar.f3466d = ((Integer) pVar2.f11062a.get("android:visibility:visibility")).intValue();
            bVar.f3468f = (ViewGroup) pVar2.f11062a.get("android:visibility:parent");
        }
        if (pVar != null && pVar2 != null) {
            int i10 = bVar.f3465c;
            int i11 = bVar.f3466d;
            if (i10 == i11 && bVar.f3467e == bVar.f3468f) {
                return bVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    bVar.f3464b = false;
                    bVar.f3463a = true;
                } else if (i11 == 0) {
                    bVar.f3464b = true;
                    bVar.f3463a = true;
                }
            } else if (bVar.f3468f == null) {
                bVar.f3464b = false;
                bVar.f3463a = true;
            } else if (bVar.f3467e == null) {
                bVar.f3464b = true;
                bVar.f3463a = true;
            }
        } else if (pVar == null && bVar.f3466d == 0) {
            bVar.f3464b = true;
            bVar.f3463a = true;
        } else if (pVar2 == null && bVar.f3465c == 0) {
            bVar.f3464b = false;
            bVar.f3463a = true;
        }
        return bVar;
    }

    public final void L(p pVar) {
        pVar.f11062a.put("android:visibility:visibility", Integer.valueOf(pVar.f11063b.getVisibility()));
        pVar.f11062a.put("android:visibility:parent", pVar.f11063b.getParent());
        int[] iArr = new int[2];
        pVar.f11063b.getLocationOnScreen(iArr);
        pVar.f11062a.put("android:visibility:screenLocation", iArr);
    }

    public Animator N(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        return null;
    }

    public Animator O(ViewGroup viewGroup, View view, p pVar) {
        return null;
    }

    public void e(p pVar) {
        L(pVar);
    }

    public void j(p pVar) {
        L(pVar);
    }

    /* JADX WARNING: type inference failed for: r16v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (M(q(r4, false), t(r4, false)).f3463a != false) goto L_0x0048;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator n(android.view.ViewGroup r21, i3.p r22, i3.p r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            androidx.transition.Visibility$b r4 = M(r22, r23)
            boolean r5 = r4.f3463a
            if (r5 == 0) goto L_0x0291
            android.view.ViewGroup r5 = r4.f3467e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f3468f
            if (r5 == 0) goto L_0x0291
        L_0x0018:
            boolean r5 = r4.f3464b
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x004a
            int r4 = r0.F
            r4 = r4 & r7
            if (r4 != r7) goto L_0x0048
            if (r3 != 0) goto L_0x0026
            goto L_0x0048
        L_0x0026:
            if (r2 != 0) goto L_0x0041
            android.view.View r4 = r3.f11063b
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            i3.p r5 = r0.q(r4, r8)
            i3.p r4 = r0.t(r4, r8)
            androidx.transition.Visibility$b r4 = M(r5, r4)
            boolean r4 = r4.f3463a
            if (r4 == 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            android.view.View r4 = r3.f11063b
            android.animation.Animator r6 = r0.N(r1, r4, r2, r3)
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            return r6
        L_0x004a:
            int r4 = r4.f3466d
            int r5 = r0.F
            r9 = 2
            r5 = r5 & r9
            if (r5 == r9) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            if (r2 != 0) goto L_0x0058
        L_0x0055:
            r2 = r0
            goto L_0x028f
        L_0x0058:
            android.view.View r5 = r2.f11063b
            if (r3 == 0) goto L_0x005f
            android.view.View r3 = r3.f11063b
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            int r10 = androidx.transition.R$id.save_overlay_view
            java.lang.Object r11 = r5.getTag(r10)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x0071
            r18 = r4
            r19 = r10
            r3 = 0
            goto L_0x0203
        L_0x0071:
            if (r3 == 0) goto L_0x0082
            android.view.ViewParent r11 = r3.getParent()
            if (r11 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            r11 = 4
            if (r4 != r11) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            if (r5 != r3) goto L_0x0088
        L_0x0080:
            r11 = r8
            goto L_0x008a
        L_0x0082:
            if (r3 == 0) goto L_0x0088
            r11 = r3
            r12 = r8
            r3 = 0
            goto L_0x008c
        L_0x0088:
            r11 = r7
            r3 = 0
        L_0x008a:
            r12 = r11
            r11 = 0
        L_0x008c:
            if (r12 == 0) goto L_0x01fa
            android.view.ViewParent r12 = r5.getParent()
            if (r12 != 0) goto L_0x009c
            r18 = r4
            r11 = r5
            r7 = r8
            r19 = r10
            goto L_0x0203
        L_0x009c:
            android.view.ViewParent r12 = r5.getParent()
            boolean r12 = r12 instanceof android.view.View
            if (r12 == 0) goto L_0x01fa
            android.view.ViewParent r12 = r5.getParent()
            android.view.View r12 = (android.view.View) r12
            i3.p r13 = r0.t(r12, r7)
            i3.p r14 = r0.q(r12, r7)
            androidx.transition.Visibility$b r13 = M(r13, r14)
            boolean r13 = r13.f3463a
            if (r13 != 0) goto L_0x01e3
            boolean r11 = androidx.transition.i.f3497a
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            int r13 = r12.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = r12.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r11.setTranslate(r13, r12)
            i3.w r12 = i3.r.f11068a
            r12.K0(r5, r11)
            r12.L0(r1, r11)
            android.graphics.RectF r12 = new android.graphics.RectF
            int r13 = r5.getWidth()
            float r13 = (float) r13
            int r14 = r5.getHeight()
            float r14 = (float) r14
            r15 = 0
            r12.<init>(r15, r15, r13, r14)
            r11.mapRect(r12)
            float r13 = r12.left
            int r13 = java.lang.Math.round(r13)
            float r14 = r12.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r12.right
            int r15 = java.lang.Math.round(r15)
            float r6 = r12.bottom
            int r6 = java.lang.Math.round(r6)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r8 = r5.getContext()
            r9.<init>(r8)
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.CENTER_CROP
            r9.setScaleType(r8)
            boolean r8 = androidx.transition.i.f3497a
            if (r8 == 0) goto L_0x011f
            boolean r8 = r5.isAttachedToWindow()
            r8 = r8 ^ r7
            boolean r16 = r21.isAttachedToWindow()
            goto L_0x0122
        L_0x011f:
            r8 = 0
            r16 = 0
        L_0x0122:
            boolean r17 = androidx.transition.i.f3498b
            if (r17 == 0) goto L_0x014b
            if (r8 == 0) goto L_0x014b
            if (r16 != 0) goto L_0x0133
            r23 = r3
            r18 = r4
            r19 = r10
            r0 = 0
            goto L_0x01c8
        L_0x0133:
            android.view.ViewParent r16 = r5.getParent()
            r7 = r16
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r16 = r7.indexOfChild(r5)
            r23 = r3
            android.view.ViewGroupOverlay r3 = r21.getOverlay()
            r3.add(r5)
            r3 = r16
            goto L_0x014f
        L_0x014b:
            r23 = r3
            r3 = 0
            r7 = 0
        L_0x014f:
            float r16 = r12.width()
            r18 = r4
            int r4 = java.lang.Math.round(r16)
            float r16 = r12.height()
            r19 = r10
            int r10 = java.lang.Math.round(r16)
            if (r4 <= 0) goto L_0x01b9
            if (r10 <= 0) goto L_0x01b9
            r16 = 1233125376(0x49800000, float:1048576.0)
            int r0 = r4 * r10
            float r0 = (float) r0
            float r0 = r16 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r2 = (float) r4
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r4 = (float) r10
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r10 = r12.left
            float r10 = -r10
            float r12 = r12.top
            float r12 = -r12
            r11.postTranslate(r10, r12)
            r11.postScale(r0, r0)
            boolean r0 = androidx.transition.i.f3499c
            if (r0 == 0) goto L_0x01a7
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r2, r4)
            r2.concat(r11)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x01ba
        L_0x01a7:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r4, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r11)
            r5.draw(r2)
            goto L_0x01ba
        L_0x01b9:
            r0 = 0
        L_0x01ba:
            if (r17 == 0) goto L_0x01c8
            if (r8 == 0) goto L_0x01c8
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.remove(r5)
            r7.addView(r5, r3)
        L_0x01c8:
            if (r0 == 0) goto L_0x01cd
            r9.setImageBitmap(r0)
        L_0x01cd:
            int r0 = r15 - r13
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r6 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r9.measure(r0, r2)
            r9.layout(r13, r14, r15, r6)
            r11 = r9
            goto L_0x0200
        L_0x01e3:
            r23 = r3
            r18 = r4
            r19 = r10
            int r0 = r12.getId()
            android.view.ViewParent r2 = r12.getParent()
            if (r2 != 0) goto L_0x0200
            r2 = -1
            if (r0 == r2) goto L_0x0200
            r1.findViewById(r0)
            goto L_0x0200
        L_0x01fa:
            r23 = r3
            r18 = r4
            r19 = r10
        L_0x0200:
            r3 = r23
            r7 = 0
        L_0x0203:
            if (r11 == 0) goto L_0x0266
            r0 = r22
            if (r7 != 0) goto L_0x0241
            java.util.HashMap r2 = r0.f11062a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r8 = 2
            int[] r8 = new int[r8]
            r1.getLocationOnScreen(r8)
            r3 = r8[r3]
            int r4 = r4 - r3
            int r3 = r11.getLeft()
            int r4 = r4 - r3
            r11.offsetLeftAndRight(r4)
            r3 = r8[r6]
            int r2 = r2 - r3
            int r3 = r11.getTop()
            int r2 = r2 - r3
            r11.offsetTopAndBottom(r2)
            z.d r2 = new z.d
            r2.<init>((android.view.ViewGroup) r1)
            java.lang.Object r2 = r2.f17746a
            android.view.ViewGroupOverlay r2 = (android.view.ViewGroupOverlay) r2
            r2.add(r11)
        L_0x0241:
            r2 = r20
            android.animation.Animator r6 = r2.O(r1, r11, r0)
            if (r7 != 0) goto L_0x0290
            if (r6 != 0) goto L_0x0258
            z.d r0 = new z.d
            r0.<init>((android.view.ViewGroup) r1)
            java.lang.Object r0 = r0.f17746a
            android.view.ViewGroupOverlay r0 = (android.view.ViewGroupOverlay) r0
            r0.remove(r11)
            goto L_0x0290
        L_0x0258:
            r0 = r19
            r5.setTag(r0, r11)
            androidx.transition.k r0 = new androidx.transition.k
            r0.<init>(r2, r1, r11, r5)
            r2.a(r0)
            goto L_0x0290
        L_0x0266:
            r2 = r20
            r0 = r22
            if (r3 == 0) goto L_0x028f
            int r4 = r3.getVisibility()
            r5 = 0
            i3.r.c(r5, r3)
            android.animation.Animator r6 = r2.O(r1, r3, r0)
            if (r6 == 0) goto L_0x028b
            androidx.transition.Visibility$a r0 = new androidx.transition.Visibility$a
            r1 = r18
            r0.<init>(r3, r1)
            r6.addListener(r0)
            r6.addPauseListener(r0)
            r2.a(r0)
            goto L_0x0290
        L_0x028b:
            i3.r.c(r4, r3)
            goto L_0x0290
        L_0x028f:
            r6 = 0
        L_0x0290:
            return r6
        L_0x0291:
            r2 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.n(android.view.ViewGroup, i3.p, i3.p):android.animation.Animator");
    }

    public final String[] s() {
        return G;
    }

    public final boolean u(p pVar, p pVar2) {
        if (pVar == null && pVar2 == null) {
            return false;
        }
        if (pVar != null && pVar2 != null && pVar2.f11062a.containsKey("android:visibility:visibility") != pVar.f11062a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b M = M(pVar, pVar2);
        if (!M.f3463a) {
            return false;
        }
        if (M.f3465c == 0 || M.f3466d == 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11052c);
        int c10 = i.c(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (c10 == 0) {
            return;
        }
        if ((c10 & -4) == 0) {
            this.F = c10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
