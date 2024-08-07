package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import t7.h;
import t7.i;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f7162c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f7163d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f7164e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f7165f = new int[2];

    /* renamed from: n  reason: collision with root package name */
    public float f7166n;

    /* renamed from: o  reason: collision with root package name */
    public float f7167o;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7168a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7169b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f7170c;

        public a(boolean z10, View view, View view2) {
            this.f7168a = z10;
            this.f7169b = view;
            this.f7170c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f7168a) {
                this.f7169b.setVisibility(4);
                this.f7170c.setAlpha(1.0f);
                this.f7170c.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f7168a) {
                this.f7169b.setVisibility(0);
                this.f7170c.setAlpha(0.0f);
                this.f7170c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public h f7171a;

        /* renamed from: b  reason: collision with root package name */
        public m9.b f7172b;
    }

    public FabTransformationBehavior() {
    }

    public static float B(b bVar, i iVar, float f10) {
        long j10 = iVar.f14899a;
        long j11 = iVar.f14900b;
        i f11 = bVar.f7171a.f("expansion");
        float interpolation = iVar.b().getInterpolation(((float) (((f11.f14899a + f11.f14900b) + 17) - j10)) / ((float) j11));
        LinearInterpolator linearInterpolator = t7.b.f14885a;
        return android.support.v4.media.a.e(0.0f, f10, interpolation, f10);
    }

    public static Pair y(float f10, float f11, boolean z10, b bVar) {
        i iVar;
        i iVar2;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVar2 = bVar.f7171a.f("translationXLinear");
            iVar = bVar.f7171a.f("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            iVar2 = bVar.f7171a.f("translationXCurveDownwards");
            iVar = bVar.f7171a.f("translationYCurveDownwards");
        } else {
            iVar2 = bVar.f7171a.f("translationXCurveUpwards");
            iVar = bVar.f7171a.f("translationYCurveUpwards");
        }
        return new Pair(iVar2, iVar);
    }

    public final float A(View view, View view2, m9.b bVar) {
        RectF rectF = this.f7163d;
        RectF rectF2 = this.f7164e;
        C(view, rectF);
        rectF.offset(this.f7166n, this.f7167o);
        C(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f7165f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public abstract b D(Context context, boolean z10);

    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public final void g(CoordinatorLayout.e eVar) {
        if (eVar.f2074h == 0) {
            eVar.f2074h = 80;
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03cc A[LOOP:1: B:100:0x03ca->B:101:0x03cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0348  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet x(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            android.content.Context r4 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.D(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r27.getTranslationX()
            r0.f7166n = r5
            float r5 = r27.getTranslationY()
            r0.f7167o = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, w1.q0> r7 = w1.d0.f16298a
            float r7 = w1.d0.i.i(r28)
            float r8 = w1.d0.i.i(r27)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r30 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            t7.h r11 = r4.f7171a
            java.lang.String r12 = "elevation"
            t7.i r11 = r11.f(r12)
            r11.a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f7163d
            m9.b r11 = r4.f7172b
            float r11 = r0.z(r1, r2, r11)
            m9.b r12 = r4.f7172b
            float r12 = r0.A(r1, r2, r12)
            android.util.Pair r13 = y(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            t7.i r14 = (t7.i) r14
            java.lang.Object r13 = r13.second
            t7.i r13 = (t7.i) r13
            if (r3 == 0) goto L_0x00c6
            if (r30 != 0) goto L_0x0088
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x0088:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = B(r4, r14, r11)
            float r12 = B(r4, r13, r12)
            android.graphics.Rect r15 = r0.f7162c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f7163d
            r8.set(r15)
            android.graphics.RectF r15 = r0.f7164e
            r0.C(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto L_0x00de
        L_0x00c6:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r9]
            float r11 = -r11
            r8[r10] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        L_0x00de:
            r14.a(r6)
            r13.a(r8)
            r5.add(r6)
            r5.add(r8)
            float r6 = r7.width()
            float r7 = r7.height()
            m9.b r8 = r4.f7172b
            float r8 = r0.z(r1, r2, r8)
            m9.b r11 = r4.f7172b
            float r11 = r0.A(r1, r2, r11)
            android.util.Pair r12 = y(r8, r11, r3, r4)
            java.lang.Object r13 = r12.first
            t7.i r13 = (t7.i) r13
            java.lang.Object r12 = r12.second
            t7.i r12 = (t7.i) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            float r8 = r0.f7166n
        L_0x0113:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            float r11 = r0.f7167o
        L_0x0122:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.a(r8)
            r12.a(r11)
            r5.add(r8)
            r5.add(r11)
            boolean r8 = r2 instanceof com.google.android.material.circularreveal.c
            if (r8 == 0) goto L_0x018c
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x013d
            goto L_0x018c
        L_0x013d:
            r11 = r2
            com.google.android.material.circularreveal.c r11 = (com.google.android.material.circularreveal.c) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x014a
            goto L_0x018c
        L_0x014a:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0161
            if (r30 != 0) goto L_0x0156
            r12.setAlpha(r13)
        L_0x0156:
            t7.e r13 = t7.e.f14892a
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x016b
        L_0x0161:
            t7.e r14 = t7.e.f14892a
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x016b:
            com.google.android.material.transformation.a r14 = new com.google.android.material.transformation.a
            r14.<init>(r2)
            r13.addUpdateListener(r14)
            t7.h r14 = r4.f7171a
            java.lang.String r15 = "iconFade"
            t7.i r14 = r14.f(r15)
            r14.a(r13)
            r5.add(r13)
            com.google.android.material.transformation.b r13 = new com.google.android.material.transformation.b
            r13.<init>(r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x018e
        L_0x018c:
            r11 = r16
        L_0x018e:
            if (r8 != 0) goto L_0x0198
            r0 = r2
            r25 = r4
            r18 = r8
            r2 = r11
            goto L_0x02e8
        L_0x0198:
            r12 = r2
            com.google.android.material.circularreveal.c r12 = (com.google.android.material.circularreveal.c) r12
            m9.b r13 = r4.f7172b
            android.graphics.RectF r14 = r0.f7163d
            android.graphics.RectF r15 = r0.f7164e
            r0.C(r1, r14)
            float r9 = r0.f7166n
            float r10 = r0.f7167o
            r14.offset(r9, r10)
            r0.C(r2, r15)
            float r9 = r0.z(r1, r2, r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            m9.b r10 = r4.f7172b
            android.graphics.RectF r13 = r0.f7163d
            android.graphics.RectF r14 = r0.f7164e
            r0.C(r1, r13)
            float r15 = r0.f7166n
            r18 = r8
            float r8 = r0.f7167o
            r13.offset(r15, r8)
            r0.C(r2, r14)
            float r8 = r0.A(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.f7162c
            boolean r14 = w1.d0.g.c(r10)
            if (r14 == 0) goto L_0x01fd
            int r14 = r10.getWidth()
            int r15 = r10.getHeight()
            r1 = 0
            r13.set(r1, r1, r14, r15)
            r10.k(r13)
        L_0x01fd:
            android.graphics.Rect r1 = r0.f7162c
            int r1 = r1.width()
            float r1 = (float) r1
            r10 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r10
            t7.h r10 = r4.f7171a
            java.lang.String r13 = "expansion"
            t7.i r10 = r10.f(r13)
            if (r3 == 0) goto L_0x0254
            if (r30 != 0) goto L_0x021b
            com.google.android.material.circularreveal.c$d r15 = new com.google.android.material.circularreveal.c$d
            r15.<init>(r9, r8, r1)
            r12.setRevealInfo(r15)
        L_0x021b:
            if (r30 == 0) goto L_0x0223
            com.google.android.material.circularreveal.c$d r1 = r12.getRevealInfo()
            float r1 = r1.f6073c
        L_0x0223:
            float r6 = m9.b.t(r9, r8, r6, r7)
            android.animation.AnimatorSet r6 = com.google.android.material.circularreveal.a.a(r12, r9, r8, r6)
            com.google.android.material.transformation.c r7 = new com.google.android.material.transformation.c
            r7.<init>(r12)
            r6.addListener(r7)
            long r13 = r10.f14899a
            int r7 = (int) r9
            int r8 = (int) r8
            r15 = r4
            r3 = 0
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x024b
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r1, r1)
            r1.setStartDelay(r3)
            r1.setDuration(r13)
            r5.add(r1)
        L_0x024b:
            r0 = r2
            r21 = r11
            r22 = r12
            r25 = r15
            goto L_0x02d6
        L_0x0254:
            r15 = r4
            com.google.android.material.circularreveal.c$d r3 = r12.getRevealInfo()
            float r3 = r3.f6073c
            android.animation.AnimatorSet r6 = com.google.android.material.circularreveal.a.a(r12, r9, r8, r1)
            long r13 = r10.f14899a
            int r4 = (int) r9
            int r7 = (int) r8
            r8 = 0
            int r19 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x0276
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r2, r4, r7, r3, r3)
            r3.setStartDelay(r8)
            r3.setDuration(r13)
            r5.add(r3)
        L_0x0276:
            long r13 = r10.f14899a
            long r8 = r10.f14900b
            r3 = r15
            t7.h r15 = r3.f7171a
            v0.h<java.lang.String, t7.i> r0 = r15.f14897a
            int r0 = r0.f16007c
            r19 = r6
            r21 = r11
            r22 = r12
            r6 = 0
            r11 = 0
        L_0x028a:
            if (r6 >= r0) goto L_0x02b2
            r20 = r0
            v0.h<java.lang.String, t7.i> r0 = r15.f14897a
            java.lang.Object r0 = r0.m(r6)
            t7.i r0 = (t7.i) r0
            r23 = r1
            long r1 = r0.f14899a
            r25 = r3
            r24 = r4
            long r3 = r0.f14900b
            long r1 = r1 + r3
            long r11 = java.lang.Math.max(r11, r1)
            int r6 = r6 + 1
            r2 = r28
            r0 = r20
            r1 = r23
            r4 = r24
            r3 = r25
            goto L_0x028a
        L_0x02b2:
            r23 = r1
            r25 = r3
            r24 = r4
            long r13 = r13 + r8
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d2
            r0 = r28
            r1 = r23
            r2 = r24
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r0, r2, r7, r1, r1)
            r1.setStartDelay(r13)
            long r11 = r11 - r13
            r1.setDuration(r11)
            r5.add(r1)
            goto L_0x02d4
        L_0x02d2:
            r0 = r28
        L_0x02d4:
            r6 = r19
        L_0x02d6:
            r10.a(r6)
            r5.add(r6)
            z7.a r1 = new z7.a
            r2 = r22
            r1.<init>(r2)
            r2 = r21
            r2.add(r1)
        L_0x02e8:
            if (r18 != 0) goto L_0x02ef
            r6 = r29
            r3 = r25
            goto L_0x0343
        L_0x02ef:
            r1 = r0
            com.google.android.material.circularreveal.c r1 = (com.google.android.material.circularreveal.c) r1
            java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
            android.content.res.ColorStateList r3 = w1.d0.i.g(r27)
            if (r3 == 0) goto L_0x0307
            int[] r4 = r27.getDrawableState()
            int r6 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r4, r6)
            goto L_0x0308
        L_0x0307:
            r3 = 0
        L_0x0308:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r6 = r29
            if (r6 == 0) goto L_0x0322
            if (r30 != 0) goto L_0x0315
            r1.setCircularRevealScrimColor(r3)
        L_0x0315:
            com.google.android.material.circularreveal.c$c r3 = com.google.android.material.circularreveal.c.C0064c.f6070a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r4
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r1, r3, r8)
            goto L_0x032e
        L_0x0322:
            r7 = 1
            r9 = 0
            com.google.android.material.circularreveal.c$c r4 = com.google.android.material.circularreveal.c.C0064c.f6070a
            int[] r8 = new int[r7]
            r8[r9] = r3
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r1, r4, r8)
        L_0x032e:
            t7.c r3 = t7.c.f14890a
            r1.setEvaluator(r3)
            r3 = r25
            t7.h r4 = r3.f7171a
            java.lang.String r7 = "color"
            t7.i r4 = r4.f(r7)
            r4.a(r1)
            r5.add(r1)
        L_0x0343:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 != 0) goto L_0x0348
            goto L_0x0379
        L_0x0348:
            int r4 = com.google.android.material.R$id.mtrl_child_content_container
            android.view.View r4 = r0.findViewById(r4)
            r7 = 0
            if (r4 == 0) goto L_0x0359
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0377
            r7 = r4
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0377
        L_0x0359:
            boolean r4 = r0 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r4 != 0) goto L_0x0368
            boolean r4 = r0 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r4 == 0) goto L_0x0362
            goto L_0x0368
        L_0x0362:
            if (r1 == 0) goto L_0x0377
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0377
        L_0x0368:
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4 = 0
            android.view.View r1 = r1.getChildAt(r4)
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0377
            r7 = r1
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L_0x0377:
            if (r7 != 0) goto L_0x037b
        L_0x0379:
            r9 = 0
            goto L_0x03b3
        L_0x037b:
            if (r6 == 0) goto L_0x0398
            if (r30 != 0) goto L_0x0389
            t7.d r1 = t7.d.f14891a
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1.set(r7, r4)
        L_0x0389:
            t7.d r1 = t7.d.f14891a
            r4 = 1
            float[] r4 = new float[r4]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r7, r1, r4)
            goto L_0x03a5
        L_0x0398:
            r4 = 1
            r9 = 0
            t7.d r1 = t7.d.f14891a
            float[] r4 = new float[r4]
            r8 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r7, r1, r4)
        L_0x03a5:
            t7.h r3 = r3.f7171a
            java.lang.String r4 = "contentFade"
            t7.i r3 = r3.f(r4)
            r3.a(r1)
            r5.add(r1)
        L_0x03b3:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            m9.b.R(r1, r5)
            com.google.android.material.transformation.FabTransformationBehavior$a r3 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r27
            r3.<init>(r6, r0, r4)
            r1.addListener(r3)
            int r0 = r2.size()
            r10 = r9
        L_0x03ca:
            if (r10 >= r0) goto L_0x03d8
            java.lang.Object r3 = r2.get(r10)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r1.addListener(r3)
            int r10 = r10 + 1
            goto L_0x03ca
        L_0x03d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.x(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float z(View view, View view2, m9.b bVar) {
        RectF rectF = this.f7163d;
        RectF rectF2 = this.f7164e;
        C(view, rectF);
        rectF.offset(this.f7166n, this.f7167o);
        C(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
