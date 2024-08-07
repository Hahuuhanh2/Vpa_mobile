package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import i3.m;
import i3.p;
import i3.r;
import java.util.WeakHashMap;
import m1.i;
import org.xmlpull.v1.XmlPullParser;
import w1.d0;
import w1.q0;

public class ChangeTransform extends Transition {
    public static final String[] I = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final a J = new a();
    public static final b K = new b(PointF.class);
    public static final boolean L = true;
    public boolean F;
    public boolean G;
    public Matrix H;

    public class a extends Property<d, float[]> {
        public a() {
            super(float[].class, "nonTranslations");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            d dVar = (d) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            d dVar = (d) obj;
            float[] fArr = (float[]) obj2;
            System.arraycopy(fArr, 0, dVar.f3416c, 0, fArr.length);
            dVar.a();
        }
    }

    public class b extends Property<d, PointF> {
        public b(Class cls) {
            super(cls, "translations");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            d dVar = (d) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            d dVar = (d) obj;
            PointF pointF = (PointF) obj2;
            dVar.getClass();
            dVar.f3417d = pointF.x;
            dVar.f3418e = pointF.y;
            dVar.a();
        }
    }

    public static class c extends g {

        /* renamed from: a  reason: collision with root package name */
        public View f3412a;

        /* renamed from: b  reason: collision with root package name */
        public i3.e f3413b;

        public c(View view, i3.e eVar) {
            this.f3412a = view;
            this.f3413b = eVar;
        }

        public final void a() {
            this.f3413b.setVisibility(4);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(androidx.transition.Transition r8) {
            /*
                r7 = this;
                r8.z(r7)
                android.view.View r8 = r7.f3412a
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                r2 = 0
                if (r0 != r1) goto L_0x004c
                boolean r0 = k4.d.f11971n
                r1 = 0
                r3 = 1
                if (r0 != 0) goto L_0x0035
                boolean r0 = k4.d.f11967c     // Catch:{ NoSuchMethodException -> 0x0033 }
                if (r0 != 0) goto L_0x0020
                java.lang.String r0 = "android.view.GhostView"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x001e }
                k4.d.f11966b = r0     // Catch:{ ClassNotFoundException -> 0x001e }
            L_0x001e:
                k4.d.f11967c = r3     // Catch:{ NoSuchMethodException -> 0x0033 }
            L_0x0020:
                java.lang.Class r0 = k4.d.f11966b     // Catch:{ NoSuchMethodException -> 0x0033 }
                java.lang.String r4 = "removeGhost"
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0033 }
                java.lang.Class<android.view.View> r6 = android.view.View.class
                r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x0033 }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0033 }
                k4.d.f11970f = r0     // Catch:{ NoSuchMethodException -> 0x0033 }
                r0.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x0033 }
            L_0x0033:
                k4.d.f11971n = r3
            L_0x0035:
                java.lang.reflect.Method r0 = k4.d.f11970f
                if (r0 == 0) goto L_0x0069
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0041 }
                r3[r1] = r8     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0041 }
                r0.invoke(r2, r3)     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0041 }
                goto L_0x0069
            L_0x0041:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.Throwable r8 = r8.getCause()
                r0.<init>(r8)
                throw r0
            L_0x004c:
                int r0 = i3.g.f11038n
                int r0 = androidx.transition.R$id.ghost_view
                java.lang.Object r8 = r8.getTag(r0)
                i3.g r8 = (i3.g) r8
                if (r8 == 0) goto L_0x0069
                int r0 = r8.f11042d
                int r0 = r0 + -1
                r8.f11042d = r0
                if (r0 > 0) goto L_0x0069
                android.view.ViewParent r0 = r8.getParent()
                i3.f r0 = (i3.f) r0
                r0.removeView(r8)
            L_0x0069:
                android.view.View r8 = r7.f3412a
                int r0 = androidx.transition.R$id.transition_transform
                r8.setTag(r0, r2)
                android.view.View r8 = r7.f3412a
                int r0 = androidx.transition.R$id.parent_matrix
                r8.setTag(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.c.d(androidx.transition.Transition):void");
        }

        public final void e() {
            this.f3413b.setVisibility(0);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f3414a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final View f3415b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f3416c;

        /* renamed from: d  reason: collision with root package name */
        public float f3417d;

        /* renamed from: e  reason: collision with root package name */
        public float f3418e;

        public d(View view, float[] fArr) {
            this.f3415b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f3416c = fArr2;
            this.f3417d = fArr2[2];
            this.f3418e = fArr2[5];
            a();
        }

        public final void a() {
            float[] fArr = this.f3416c;
            fArr[2] = this.f3417d;
            fArr[5] = this.f3418e;
            this.f3414a.setValues(fArr);
            r.f11068a.J0(this.f3415b, this.f3414a);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final float f3419a;

        /* renamed from: b  reason: collision with root package name */
        public final float f3420b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3421c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3422d;

        /* renamed from: e  reason: collision with root package name */
        public final float f3423e;

        /* renamed from: f  reason: collision with root package name */
        public final float f3424f;

        /* renamed from: g  reason: collision with root package name */
        public final float f3425g;

        /* renamed from: h  reason: collision with root package name */
        public final float f3426h;

        public e(View view) {
            this.f3419a = view.getTranslationX();
            this.f3420b = view.getTranslationY();
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            this.f3421c = d0.i.l(view);
            this.f3422d = view.getScaleX();
            this.f3423e = view.getScaleY();
            this.f3424f = view.getRotationX();
            this.f3425g = view.getRotationY();
            this.f3426h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (eVar.f3419a == this.f3419a && eVar.f3420b == this.f3420b && eVar.f3421c == this.f3421c && eVar.f3422d == this.f3422d && eVar.f3423e == this.f3423e && eVar.f3424f == this.f3424f && eVar.f3425g == this.f3425g && eVar.f3426h == this.f3426h) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            float f10 = this.f3419a;
            int i17 = 0;
            if (f10 != 0.0f) {
                i10 = Float.floatToIntBits(f10);
            } else {
                i10 = 0;
            }
            int i18 = i10 * 31;
            float f11 = this.f3420b;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 31;
            float f12 = this.f3421c;
            if (f12 != 0.0f) {
                i12 = Float.floatToIntBits(f12);
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 31;
            float f13 = this.f3422d;
            if (f13 != 0.0f) {
                i13 = Float.floatToIntBits(f13);
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 31;
            float f14 = this.f3423e;
            if (f14 != 0.0f) {
                i14 = Float.floatToIntBits(f14);
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 31;
            float f15 = this.f3424f;
            if (f15 != 0.0f) {
                i15 = Float.floatToIntBits(f15);
            } else {
                i15 = 0;
            }
            int i23 = (i22 + i15) * 31;
            float f16 = this.f3425g;
            if (f16 != 0.0f) {
                i16 = Float.floatToIntBits(f16);
            } else {
                i16 = 0;
            }
            int i24 = (i23 + i16) * 31;
            float f17 = this.f3426h;
            if (f17 != 0.0f) {
                i17 = Float.floatToIntBits(f17);
            }
            return i24 + i17;
        }
    }

    public ChangeTransform() {
        throw null;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z10;
        boolean z11 = true;
        this.F = true;
        this.G = true;
        this.H = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f11054e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (!i.e(xmlPullParser, "reparentWithOverlay")) {
            z10 = true;
        } else {
            z10 = obtainStyledAttributes.getBoolean(1, true);
        }
        this.F = z10;
        this.G = i.e(xmlPullParser, "reparent") ? obtainStyledAttributes.getBoolean(0, true) : z11;
        obtainStyledAttributes.recycle();
    }

    public final void L(p pVar) {
        Matrix matrix;
        View view = pVar.f11063b;
        if (view.getVisibility() != 8) {
            pVar.f11062a.put("android:changeTransform:parent", view.getParent());
            pVar.f11062a.put("android:changeTransform:transforms", new e(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            pVar.f11062a.put("android:changeTransform:matrix", matrix);
            if (this.G) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                r.f11068a.K0(viewGroup, matrix3);
                matrix3.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                pVar.f11062a.put("android:changeTransform:parentMatrix", matrix3);
                pVar.f11062a.put("android:changeTransform:intermediateMatrix", view.getTag(R$id.transition_transform));
                pVar.f11062a.put("android:changeTransform:intermediateParentMatrix", view.getTag(R$id.parent_matrix));
            }
        }
    }

    public final void e(p pVar) {
        L(pVar);
    }

    public final void j(p pVar) {
        L(pVar);
        if (!L) {
            ((ViewGroup) pVar.f11063b.getParent()).startViewTransition(pVar.f11063b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r7v4, types: [k4.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03b2, code lost:
        if (r3.size() == r5) goto L_0x03c0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator n(android.view.ViewGroup r25, i3.p r26, i3.p r27) {
        /*
            r24 = this;
            r8 = r24
            r0 = r25
            r9 = r26
            r10 = r27
            if (r9 == 0) goto L_0x045d
            if (r10 == 0) goto L_0x045d
            java.util.HashMap r1 = r9.f11062a
            java.lang.String r12 = "android:changeTransform:parent"
            boolean r1 = r1.containsKey(r12)
            if (r1 == 0) goto L_0x045d
            java.util.HashMap r1 = r10.f11062a
            boolean r1 = r1.containsKey(r12)
            if (r1 != 0) goto L_0x0020
            goto L_0x045d
        L_0x0020:
            java.util.HashMap r1 = r9.f11062a
            java.lang.Object r1 = r1.get(r12)
            r13 = r1
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            java.util.HashMap r1 = r10.f11062a
            java.lang.Object r1 = r1.get(r12)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r8.G
            r15 = 1
            if (r2 == 0) goto L_0x0058
            boolean r2 = r8.w(r13)
            if (r2 == 0) goto L_0x004e
            boolean r2 = r8.w(r1)
            if (r2 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            i3.p r2 = r8.q(r13, r15)
            if (r2 == 0) goto L_0x0052
            android.view.View r2 = r2.f11063b
            if (r1 != r2) goto L_0x0052
            goto L_0x0050
        L_0x004e:
            if (r13 != r1) goto L_0x0052
        L_0x0050:
            r1 = r15
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 != 0) goto L_0x0058
            r16 = r15
            goto L_0x005a
        L_0x0058:
            r16 = 0
        L_0x005a:
            java.util.HashMap r1 = r9.f11062a
            java.lang.String r2 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r2 = "android:changeTransform:matrix"
            if (r1 == 0) goto L_0x006d
            java.util.HashMap r3 = r9.f11062a
            r3.put(r2, r1)
        L_0x006d:
            java.util.HashMap r1 = r9.f11062a
            java.lang.String r3 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r1.get(r3)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r7 = "android:changeTransform:parentMatrix"
            if (r1 == 0) goto L_0x0080
            java.util.HashMap r3 = r9.f11062a
            r3.put(r7, r1)
        L_0x0080:
            if (r16 == 0) goto L_0x00bb
            java.util.HashMap r1 = r10.f11062a
            java.lang.Object r1 = r1.get(r7)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            android.view.View r3 = r10.f11063b
            int r4 = androidx.transition.R$id.parent_matrix
            r3.setTag(r4, r1)
            android.graphics.Matrix r3 = r8.H
            r3.reset()
            r1.invert(r3)
            java.util.HashMap r1 = r9.f11062a
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x00ad
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            java.util.HashMap r4 = r9.f11062a
            r4.put(r2, r1)
        L_0x00ad:
            java.util.HashMap r4 = r9.f11062a
            java.lang.Object r4 = r4.get(r7)
            android.graphics.Matrix r4 = (android.graphics.Matrix) r4
            r1.postConcat(r4)
            r1.postConcat(r3)
        L_0x00bb:
            java.util.HashMap r1 = r9.f11062a
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.util.HashMap r3 = r10.f11062a
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r1 != 0) goto L_0x00cf
            i3.i$a r1 = i3.i.f11047a
        L_0x00cf:
            if (r2 != 0) goto L_0x00d3
            i3.i$a r2 = i3.i.f11047a
        L_0x00d3:
            r4 = r2
            boolean r2 = r1.equals(r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r2 == 0) goto L_0x00e3
            r11 = r7
            r21 = r13
            r6 = 0
            goto L_0x0176
        L_0x00e3:
            java.util.HashMap r2 = r10.f11062a
            java.lang.String r11 = "android:changeTransform:transforms"
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            androidx.transition.ChangeTransform$e r11 = (androidx.transition.ChangeTransform.e) r11
            android.view.View r2 = r10.f11063b
            r2.setTranslationX(r5)
            r2.setTranslationY(r5)
            java.util.WeakHashMap<android.view.View, w1.q0> r18 = w1.d0.f16298a
            w1.d0.i.w(r2, r5)
            r2.setScaleX(r6)
            r2.setScaleY(r6)
            r2.setRotationX(r5)
            r2.setRotationY(r5)
            r2.setRotation(r5)
            r5 = 9
            float[] r6 = new float[r5]
            r1.getValues(r6)
            float[] r1 = new float[r5]
            r4.getValues(r1)
            androidx.transition.ChangeTransform$d r15 = new androidx.transition.ChangeTransform$d
            r15.<init>(r2, r6)
            androidx.transition.ChangeTransform$a r14 = J
            i3.c r3 = new i3.c
            float[] r5 = new float[r5]
            r3.<init>(r5)
            r21 = r2
            r5 = 2
            float[][] r2 = new float[r5][]
            r20 = 0
            r2[r20] = r6
            r19 = 1
            r2[r19] = r1
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofObject(r14, r3, r2)
            androidx.transition.PathMotion r3 = r8.B
            r14 = r6[r5]
            r22 = 5
            r6 = r6[r22]
            r23 = r7
            r7 = r1[r5]
            r1 = r1[r22]
            android.graphics.Path r1 = r3.a(r14, r6, r7, r1)
            androidx.transition.ChangeTransform$b r3 = K
            r6 = 0
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r3, r6, r1)
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r5]
            r6 = 0
            r3[r6] = r2
            r2 = 1
            r3[r2] = r1
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r15, r3)
            androidx.transition.a r7 = new androidx.transition.a
            r1 = r7
            r6 = r21
            r2 = r24
            r3 = r16
            r21 = r13
            r13 = r5
            r5 = r6
            r6 = r11
            r13 = r7
            r11 = r23
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.addListener(r13)
            r14.addPauseListener(r13)
            r6 = r14
        L_0x0176:
            if (r16 == 0) goto L_0x044f
            if (r6 == 0) goto L_0x044f
            boolean r1 = r8.F
            if (r1 == 0) goto L_0x044f
            android.view.View r1 = r10.f11063b
            java.util.HashMap r2 = r10.f11062a
            java.lang.Object r2 = r2.get(r11)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r2)
            i3.w r2 = i3.r.f11068a
            r2.L0(r0, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r2 != r4) goto L_0x01ff
            boolean r2 = k4.d.f11969e
            r4 = 3
            if (r2 != 0) goto L_0x01ce
            boolean r2 = k4.d.f11967c     // Catch:{ NoSuchMethodException -> 0x01ca }
            if (r2 != 0) goto L_0x01ac
            java.lang.String r2 = "android.view.GhostView"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x01a9 }
            k4.d.f11966b = r2     // Catch:{ ClassNotFoundException -> 0x01a9 }
        L_0x01a9:
            r2 = 1
            k4.d.f11967c = r2     // Catch:{ NoSuchMethodException -> 0x01ca }
        L_0x01ac:
            java.lang.Class r2 = k4.d.f11966b     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.String r5 = "addGhost"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.Class<android.view.View> r11 = android.view.View.class
            r13 = 0
            r7[r13] = r11     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.Class<android.view.ViewGroup> r11 = android.view.ViewGroup.class
            r13 = 1
            r7[r13] = r11     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.Class<android.graphics.Matrix> r11 = android.graphics.Matrix.class
            r14 = 2
            r7[r14] = r11     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r7)     // Catch:{ NoSuchMethodException -> 0x01ca }
            k4.d.f11968d = r2     // Catch:{ NoSuchMethodException -> 0x01ca }
            r2.setAccessible(r13)     // Catch:{ NoSuchMethodException -> 0x01ca }
        L_0x01ca:
            r2 = 1
            k4.d.f11969e = r2
            goto L_0x01cf
        L_0x01ce:
            r2 = 1
        L_0x01cf:
            java.lang.reflect.Method r5 = k4.d.f11968d
            if (r5 == 0) goto L_0x01f6
            k4.d r7 = new k4.d     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r11 = 0
            r4[r11] = r1     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r4[r2] = r0     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r0 = 2
            r4[r0] = r3     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r0 = 0
            java.lang.Object r2 = r5.invoke(r0, r4)     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            android.view.View r2 = (android.view.View) r2     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r7.<init>((java.lang.Object) r2)     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r11 = r7
            goto L_0x01f7
        L_0x01eb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
        L_0x01f6:
            r11 = 0
        L_0x01f7:
            r21 = r1
            r22 = r6
            r23 = r12
            goto L_0x040d
        L_0x01ff:
            int r2 = i3.g.f11038n
            android.view.ViewParent r2 = r1.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0447
            int r2 = i3.f.f11035c
            int r2 = androidx.transition.R$id.ghost_view_holder
            java.lang.Object r2 = r0.getTag(r2)
            i3.f r2 = (i3.f) r2
            int r4 = androidx.transition.R$id.ghost_view
            java.lang.Object r4 = r1.getTag(r4)
            i3.g r4 = (i3.g) r4
            if (r4 == 0) goto L_0x022c
            android.view.ViewParent r5 = r4.getParent()
            i3.f r5 = (i3.f) r5
            if (r5 == r2) goto L_0x022c
            int r7 = r4.f11042d
            r5.removeView(r4)
            r11 = 0
            goto L_0x022e
        L_0x022c:
            r11 = r4
            r7 = 0
        L_0x022e:
            if (r11 != 0) goto L_0x03ff
            i3.g r4 = new i3.g
            r4.<init>(r1)
            r4.f11043e = r3
            if (r2 != 0) goto L_0x023f
            i3.f r2 = new i3.f
            r2.<init>(r0)
            goto L_0x025f
        L_0x023f:
            boolean r3 = r2.f11037b
            if (r3 == 0) goto L_0x03f7
            android.view.ViewGroup r3 = r2.f11036a
            z.d r5 = new z.d
            r5.<init>((android.view.ViewGroup) r3)
            java.lang.Object r3 = r5.f17746a
            android.view.ViewGroupOverlay r3 = (android.view.ViewGroupOverlay) r3
            r3.remove(r2)
            android.view.ViewGroup r3 = r2.f11036a
            z.d r5 = new z.d
            r5.<init>((android.view.ViewGroup) r3)
            java.lang.Object r3 = r5.f17746a
            android.view.ViewGroupOverlay r3 = (android.view.ViewGroupOverlay) r3
            r3.add(r2)
        L_0x025f:
            i3.g.a(r0, r2)
            i3.g.a(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r3 = r4.f11041c
            i3.f.a(r3, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r2.getChildCount()
            r11 = 1
            int r5 = r5 - r11
            r11 = 0
        L_0x027b:
            if (r11 > r5) goto L_0x03dd
            int r13 = r11 + r5
            r14 = 2
            int r13 = r13 / r14
            android.view.View r14 = r2.getChildAt(r13)
            i3.g r14 = (i3.g) r14
            android.view.View r14 = r14.f11041c
            i3.f.a(r14, r3)
            boolean r14 = r0.isEmpty()
            if (r14 != 0) goto L_0x03b8
            boolean r14 = r3.isEmpty()
            if (r14 != 0) goto L_0x03b8
            r14 = 0
            java.lang.Object r15 = r0.get(r14)
            r16 = r5
            java.lang.Object r5 = r3.get(r14)
            if (r15 == r5) goto L_0x02a8
            r25 = r0
            goto L_0x02eb
        L_0x02a8:
            int r5 = r0.size()
            int r14 = r3.size()
            int r5 = java.lang.Math.min(r5, r14)
            r14 = 1
        L_0x02b5:
            if (r14 >= r5) goto L_0x03a3
            java.lang.Object r15 = r0.get(r14)
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r17 = r3.get(r14)
            r25 = r0
            r0 = r17
            android.view.View r0 = (android.view.View) r0
            if (r15 == r0) goto L_0x038e
            android.view.ViewParent r5 = r15.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r14 = r5.getChildCount()
            float r17 = r15.getZ()
            float r21 = r0.getZ()
            int r17 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r17 == 0) goto L_0x0301
            float r5 = r15.getZ()
            float r0 = r0.getZ()
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f6
        L_0x02eb:
            r21 = r1
        L_0x02ed:
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            goto L_0x03c0
        L_0x02f6:
            r21 = r1
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            goto L_0x03b5
        L_0x0301:
            r8 = 0
        L_0x0302:
            if (r8 >= r14) goto L_0x02eb
            r17 = r14
            int r14 = android.os.Build.VERSION.SDK_INT
            r22 = r6
            r6 = 29
            if (r14 < r6) goto L_0x031b
            int r6 = r5.getChildDrawingOrder(r8)
            r21 = r1
            r1 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            goto L_0x0376
        L_0x031b:
            boolean r6 = i3.q.f11067c
            if (r6 != 0) goto L_0x0347
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r14 = "getChildDrawingOrder"
            r21 = r1
            r10 = 2
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0341 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0341 }
            r20 = 0
            r1[r20] = r10     // Catch:{ NoSuchMethodException -> 0x0341 }
            r23 = r12
            r12 = 1
            r1[r12] = r10     // Catch:{ NoSuchMethodException -> 0x033d }
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r14, r1)     // Catch:{ NoSuchMethodException -> 0x033d }
            i3.q.f11066b = r1     // Catch:{ NoSuchMethodException -> 0x033d }
            r1.setAccessible(r12)     // Catch:{ NoSuchMethodException -> 0x033d }
            goto L_0x0343
        L_0x033d:
            r1 = r12
            goto L_0x0344
        L_0x033f:
            r21 = r1
        L_0x0341:
            r23 = r12
        L_0x0343:
            r1 = 1
        L_0x0344:
            i3.q.f11067c = r1
            goto L_0x034b
        L_0x0347:
            r21 = r1
            r23 = r12
        L_0x034b:
            java.lang.reflect.Method r1 = i3.q.f11066b
            if (r1 == 0) goto L_0x0373
            r6 = 2
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0370 }
            int r12 = r5.getChildCount()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0370 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0370 }
            r20 = 0
            r10[r20] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0375 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0375 }
            r14 = 1
            r10[r14] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0375 }
            java.lang.Object r1 = r1.invoke(r5, r10)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0375 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0375 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0375 }
            goto L_0x0376
        L_0x0370:
            r20 = 0
            goto L_0x0375
        L_0x0373:
            r6 = 2
            goto L_0x0370
        L_0x0375:
            r1 = r8
        L_0x0376:
            android.view.View r1 = r5.getChildAt(r1)
            if (r1 != r15) goto L_0x037d
            goto L_0x03b5
        L_0x037d:
            if (r1 != r0) goto L_0x0380
            goto L_0x03c0
        L_0x0380:
            int r8 = r8 + 1
            r10 = r27
            r14 = r17
            r1 = r21
            r6 = r22
            r12 = r23
            goto L_0x0302
        L_0x038e:
            r21 = r1
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            int r14 = r14 + 1
            r8 = r24
            r0 = r25
            r10 = r27
            r6 = r22
            goto L_0x02b5
        L_0x03a3:
            r25 = r0
            r21 = r1
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            int r0 = r3.size()
            if (r0 != r5) goto L_0x03b5
            goto L_0x03c0
        L_0x03b5:
            r0 = r20
            goto L_0x03c1
        L_0x03b8:
            r25 = r0
            r21 = r1
            r16 = r5
            goto L_0x02ed
        L_0x03c0:
            r0 = 1
        L_0x03c1:
            if (r0 == 0) goto L_0x03c9
            int r13 = r13 + 1
            r11 = r13
            r5 = r16
            goto L_0x03cc
        L_0x03c9:
            int r13 = r13 + -1
            r5 = r13
        L_0x03cc:
            r3.clear()
            r8 = r24
            r0 = r25
            r10 = r27
            r1 = r21
            r6 = r22
            r12 = r23
            goto L_0x027b
        L_0x03dd:
            r21 = r1
            r22 = r6
            r23 = r12
            if (r11 < 0) goto L_0x03f0
            int r0 = r2.getChildCount()
            if (r11 < r0) goto L_0x03ec
            goto L_0x03f0
        L_0x03ec:
            r2.addView(r4, r11)
            goto L_0x03f3
        L_0x03f0:
            r2.addView(r4)
        L_0x03f3:
            r4.f11042d = r7
            r11 = r4
            goto L_0x0407
        L_0x03f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This GhostViewHolder is detached!"
            r0.<init>(r1)
            throw r0
        L_0x03ff:
            r21 = r1
            r22 = r6
            r23 = r12
            r11.f11043e = r3
        L_0x0407:
            int r0 = r11.f11042d
            r1 = 1
            int r0 = r0 + r1
            r11.f11042d = r0
        L_0x040d:
            if (r11 != 0) goto L_0x0410
            goto L_0x045c
        L_0x0410:
            java.util.HashMap r0 = r9.f11062a
            r1 = r23
            java.lang.Object r0 = r0.get(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r9.f11063b
            r11.b(r0, r1)
            r0 = r24
        L_0x0421:
            androidx.transition.TransitionSet r1 = r0.f3439p
            if (r1 == 0) goto L_0x0427
            r0 = r1
            goto L_0x0421
        L_0x0427:
            androidx.transition.ChangeTransform$c r1 = new androidx.transition.ChangeTransform$c
            r2 = r21
            r1.<init>(r2, r11)
            r0.a(r1)
            boolean r0 = L
            if (r0 == 0) goto L_0x045c
            android.view.View r0 = r9.f11063b
            r1 = r27
            android.view.View r1 = r1.f11063b
            if (r0 == r1) goto L_0x0441
            r1 = 0
            i3.r.b(r0, r1)
        L_0x0441:
            r0 = 1065353216(0x3f800000, float:1.0)
            i3.r.b(r2, r0)
            goto L_0x045c
        L_0x0447:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Ghosted views must be parented by a ViewGroup"
            r0.<init>(r1)
            throw r0
        L_0x044f:
            r22 = r6
            boolean r0 = L
            if (r0 != 0) goto L_0x045c
            android.view.View r0 = r9.f11063b
            r1 = r21
            r1.endViewTransition(r0)
        L_0x045c:
            return r22
        L_0x045d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.n(android.view.ViewGroup, i3.p, i3.p):android.animation.Animator");
    }

    public final String[] s() {
        return I;
    }
}
