package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import i3.m;
import i3.p;
import i3.q;
import i3.r;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ChangeBounds extends Transition {
    public static final String[] G = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b H = new b(PointF.class);
    public static final c I = new c(PointF.class);
    public static final d J = new d(PointF.class);
    public static final e K = new e(PointF.class);
    public static final f L = new f(PointF.class);
    public static i3.j M = new i3.j();
    public boolean F = false;

    public class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3393a = new Rect();

        public a(Class cls) {
            super(cls, "boundsOrigin");
        }

        public final Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f3393a);
            Rect rect = this.f3393a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f3393a);
            this.f3393a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f3393a);
        }
    }

    public class b extends Property<j, PointF> {
        public b(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            j jVar = (j) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            j jVar = (j) obj;
            PointF pointF = (PointF) obj2;
            jVar.getClass();
            jVar.f3403a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            jVar.f3404b = round;
            int i10 = jVar.f3408f + 1;
            jVar.f3408f = i10;
            if (i10 == jVar.f3409g) {
                r.a(jVar.f3407e, jVar.f3403a, round, jVar.f3405c, jVar.f3406d);
                jVar.f3408f = 0;
                jVar.f3409g = 0;
            }
        }
    }

    public class c extends Property<j, PointF> {
        public c(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            j jVar = (j) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            j jVar = (j) obj;
            PointF pointF = (PointF) obj2;
            jVar.getClass();
            jVar.f3405c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            jVar.f3406d = round;
            int i10 = jVar.f3409g + 1;
            jVar.f3409g = i10;
            if (jVar.f3408f == i10) {
                r.a(jVar.f3407e, jVar.f3403a, jVar.f3404b, jVar.f3405c, round);
                jVar.f3408f = 0;
                jVar.f3409g = 0;
            }
        }
    }

    public class d extends Property<View, PointF> {
        public d(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            r.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            r.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class f extends Property<View, PointF> {
        public f(Class cls) {
            super(cls, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            r.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private j mViewBounds;

        public g(j jVar) {
            this.mViewBounds = jVar;
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3394a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3395b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Rect f3396c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f3397d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f3398e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f3399f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f3400g;

        public h(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f3395b = view;
            this.f3396c = rect;
            this.f3397d = i10;
            this.f3398e = i11;
            this.f3399f = i12;
            this.f3400g = i13;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f3394a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f3394a) {
                View view = this.f3395b;
                Rect rect = this.f3396c;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.f.c(view, rect);
                r.a(this.f3395b, this.f3397d, this.f3398e, this.f3399f, this.f3400g);
            }
        }
    }

    public class i extends g {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3401a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3402b;

        public i(ViewGroup viewGroup) {
            this.f3402b = viewGroup;
        }

        public final void a() {
            q.a(this.f3402b, false);
        }

        public final void c() {
            q.a(this.f3402b, false);
            this.f3401a = true;
        }

        public final void d(Transition transition) {
            if (!this.f3401a) {
                q.a(this.f3402b, false);
            }
            transition.z(this);
        }

        public final void e() {
            q.a(this.f3402b, true);
        }
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public int f3403a;

        /* renamed from: b  reason: collision with root package name */
        public int f3404b;

        /* renamed from: c  reason: collision with root package name */
        public int f3405c;

        /* renamed from: d  reason: collision with root package name */
        public int f3406d;

        /* renamed from: e  reason: collision with root package name */
        public View f3407e;

        /* renamed from: f  reason: collision with root package name */
        public int f3408f;

        /* renamed from: g  reason: collision with root package name */
        public int f3409g;

        public j(View view) {
            this.f3407e = view;
        }
    }

    static {
        new a(PointF.class);
    }

    public ChangeBounds() {
    }

    public final void L(p pVar) {
        View view = pVar.f11063b;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            pVar.f11062a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            pVar.f11062a.put("android:changeBounds:parent", pVar.f11063b.getParent());
            if (this.F) {
                pVar.f11062a.put("android:changeBounds:clip", d0.f.a(view));
            }
        }
    }

    public final void e(p pVar) {
        L(pVar);
    }

    public final void j(p pVar) {
        L(pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator n(android.view.ViewGroup r20, i3.p r21, i3.p r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            if (r1 == 0) goto L_0x01c2
            if (r2 != 0) goto L_0x000c
            goto L_0x01c2
        L_0x000c:
            java.util.HashMap r4 = r1.f11062a
            java.util.HashMap r5 = r2.f11062a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x01c0
            if (r5 != 0) goto L_0x0024
            goto L_0x01c0
        L_0x0024:
            android.view.View r4 = r2.f11063b
            java.util.HashMap r5 = r1.f11062a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.HashMap r7 = r2.f11062a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r9 = r6.left
            int r8 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r13 = r6.bottom
            int r6 = r11 - r7
            int r14 = r5 - r8
            int r15 = r12 - r9
            int r3 = r13 - r10
            java.util.HashMap r1 = r1.f11062a
            r16 = r4
            java.lang.String r4 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r4)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.HashMap r2 = r2.f11062a
            java.lang.Object r2 = r2.get(r4)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            if (r6 == 0) goto L_0x0068
            if (r14 != 0) goto L_0x006c
        L_0x0068:
            if (r15 == 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
        L_0x006c:
            if (r7 != r9) goto L_0x0074
            if (r8 == r10) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            r17 = 0
            goto L_0x0076
        L_0x0074:
            r17 = 1
        L_0x0076:
            if (r11 != r12) goto L_0x007a
            if (r5 == r13) goto L_0x007f
        L_0x007a:
            int r17 = r17 + 1
            goto L_0x007f
        L_0x007d:
            r17 = 0
        L_0x007f:
            if (r1 == 0) goto L_0x0087
            boolean r18 = r1.equals(r2)
            if (r18 == 0) goto L_0x008b
        L_0x0087:
            if (r1 != 0) goto L_0x008d
            if (r2 == 0) goto L_0x008d
        L_0x008b:
            int r17 = r17 + 1
        L_0x008d:
            r4 = r17
            if (r4 <= 0) goto L_0x01be
            r17 = r2
            boolean r2 = r0.F
            r18 = r1
            r1 = 2
            if (r2 != 0) goto L_0x0122
            r2 = r16
            i3.r.a(r2, r7, r8, r11, r5)
            if (r4 != r1) goto L_0x00f7
            if (r6 != r15) goto L_0x00b7
            if (r14 != r3) goto L_0x00b7
            androidx.transition.PathMotion r1 = r0.B
            float r3 = (float) r7
            float r4 = (float) r8
            float r5 = (float) r9
            float r6 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r4, r5, r6)
            androidx.transition.ChangeBounds$f r3 = L
            r4 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r4, r1)
            goto L_0x011f
        L_0x00b7:
            androidx.transition.ChangeBounds$j r3 = new androidx.transition.ChangeBounds$j
            r3.<init>(r2)
            androidx.transition.PathMotion r4 = r0.B
            float r6 = (float) r7
            float r7 = (float) r8
            float r8 = (float) r9
            float r9 = (float) r10
            android.graphics.Path r4 = r4.a(r6, r7, r8, r9)
            androidx.transition.ChangeBounds$b r6 = H
            r7 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r3, r6, r7, r4)
            androidx.transition.PathMotion r6 = r0.B
            float r8 = (float) r11
            float r5 = (float) r5
            float r9 = (float) r12
            float r10 = (float) r13
            android.graphics.Path r5 = r6.a(r8, r5, r9, r10)
            androidx.transition.ChangeBounds$c r6 = I
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r7, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r7 = 0
            r1[r7] = r4
            r4 = 1
            r1[r4] = r5
            r6.playTogether(r1)
            androidx.transition.ChangeBounds$g r1 = new androidx.transition.ChangeBounds$g
            r1.<init>(r3)
            r6.addListener(r1)
            r1 = r6
            goto L_0x011f
        L_0x00f7:
            if (r7 != r9) goto L_0x010e
            if (r8 == r10) goto L_0x00fc
            goto L_0x010e
        L_0x00fc:
            androidx.transition.PathMotion r1 = r0.B
            float r3 = (float) r11
            float r4 = (float) r5
            float r5 = (float) r12
            float r6 = (float) r13
            android.graphics.Path r1 = r1.a(r3, r4, r5, r6)
            androidx.transition.ChangeBounds$d r3 = J
            r4 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r4, r1)
            goto L_0x011f
        L_0x010e:
            r4 = 0
            androidx.transition.PathMotion r1 = r0.B
            float r3 = (float) r7
            float r5 = (float) r8
            float r6 = (float) r9
            float r7 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r6, r7)
            androidx.transition.ChangeBounds$e r3 = K
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r4, r1)
        L_0x011f:
            r4 = 1
            goto L_0x01a4
        L_0x0122:
            r2 = r16
            int r4 = java.lang.Math.max(r6, r15)
            int r5 = java.lang.Math.max(r14, r3)
            int r4 = r4 + r7
            int r5 = r5 + r8
            i3.r.a(r2, r7, r8, r4, r5)
            if (r7 != r9) goto L_0x0138
            if (r8 == r10) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r4 = 0
            goto L_0x0149
        L_0x0138:
            androidx.transition.PathMotion r4 = r0.B
            float r5 = (float) r7
            float r7 = (float) r8
            float r8 = (float) r9
            float r11 = (float) r10
            android.graphics.Path r4 = r4.a(r5, r7, r8, r11)
            androidx.transition.ChangeBounds$f r5 = L
            r7 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r2, r5, r7, r4)
        L_0x0149:
            if (r18 != 0) goto L_0x0152
            android.graphics.Rect r5 = new android.graphics.Rect
            r7 = 0
            r5.<init>(r7, r7, r6, r14)
            goto L_0x0155
        L_0x0152:
            r7 = 0
            r5 = r18
        L_0x0155:
            if (r17 != 0) goto L_0x015d
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r7, r7, r15, r3)
            goto L_0x015f
        L_0x015d:
            r6 = r17
        L_0x015f:
            boolean r3 = r5.equals(r6)
            if (r3 != 0) goto L_0x0188
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            w1.d0.f.c(r2, r5)
            i3.j r3 = M
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r7] = r5
            r5 = 1
            r8[r5] = r6
            java.lang.String r5 = "clipBounds"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r2, r5, r3, r8)
            androidx.transition.ChangeBounds$h r5 = new androidx.transition.ChangeBounds$h
            r6 = r5
            r7 = r2
            r8 = r17
            r11 = r12
            r12 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.addListener(r5)
            goto L_0x0189
        L_0x0188:
            r3 = 0
        L_0x0189:
            boolean r5 = androidx.transition.i.f3497a
            if (r4 != 0) goto L_0x018f
            r1 = r3
            goto L_0x011f
        L_0x018f:
            if (r3 != 0) goto L_0x0193
            r1 = r4
            goto L_0x011f
        L_0x0193:
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r6 = 0
            r1[r6] = r4
            r4 = 1
            r1[r4] = r3
            r5.playTogether(r1)
            r1 = r5
        L_0x01a4:
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x01bd
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            i3.q.a(r2, r4)
            androidx.transition.ChangeBounds$i r3 = new androidx.transition.ChangeBounds$i
            r3.<init>(r2)
            r0.a(r3)
        L_0x01bd:
            return r1
        L_0x01be:
            r1 = 0
            return r1
        L_0x01c0:
            r1 = 0
            return r1
        L_0x01c2:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeBounds.n(android.view.ViewGroup, i3.p, i3.p):android.animation.Animator");
    }

    public final String[] s() {
        return G;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z10 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11051b);
        z10 = m1.i.e((XmlResourceParser) attributeSet, "resizeClip") ? obtainStyledAttributes.getBoolean(0, false) : z10;
        obtainStyledAttributes.recycle();
        this.F = z10;
    }
}
