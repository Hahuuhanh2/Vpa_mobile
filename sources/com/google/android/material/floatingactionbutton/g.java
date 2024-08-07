package com.google.android.material.floatingactionbutton;

import al.g0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.o;
import f8.j;
import java.util.ArrayList;
import java.util.Iterator;
import l8.m;
import l8.q;
import o1.a;

/* compiled from: FloatingActionButtonImpl */
public class g {
    public static final q2.a C = t7.b.f14887c;
    public static final int D = R$attr.motionDurationLong2;
    public static final int E = R$attr.motionEasingEmphasizedInterpolator;
    public static final int F = R$attr.motionDurationMedium1;
    public static final int G = R$attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {16842919, 16842910};
    public static final int[] I = {16843623, 16842908, 16842910};
    public static final int[] J = {16842908, 16842910};
    public static final int[] K = {16843623, 16842910};
    public static final int[] L = {16842910};
    public static final int[] M = new int[0];
    public final Matrix A = new Matrix();
    public e8.e B;

    /* renamed from: a  reason: collision with root package name */
    public m f6293a;

    /* renamed from: b  reason: collision with root package name */
    public l8.h f6294b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f6295c;

    /* renamed from: d  reason: collision with root package name */
    public e8.b f6296d;

    /* renamed from: e  reason: collision with root package name */
    public LayerDrawable f6297e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6298f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6299g = true;

    /* renamed from: h  reason: collision with root package name */
    public float f6300h;

    /* renamed from: i  reason: collision with root package name */
    public float f6301i;

    /* renamed from: j  reason: collision with root package name */
    public float f6302j;

    /* renamed from: k  reason: collision with root package name */
    public int f6303k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f6304l;

    /* renamed from: m  reason: collision with root package name */
    public t7.h f6305m;

    /* renamed from: n  reason: collision with root package name */
    public t7.h f6306n;

    /* renamed from: o  reason: collision with root package name */
    public float f6307o;

    /* renamed from: p  reason: collision with root package name */
    public float f6308p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public int f6309q;

    /* renamed from: r  reason: collision with root package name */
    public int f6310r = 0;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f6311s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f6312t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<f> f6313u;

    /* renamed from: v  reason: collision with root package name */
    public final FloatingActionButton f6314v;

    /* renamed from: w  reason: collision with root package name */
    public final k8.b f6315w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f6316x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final RectF f6317y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f6318z = new RectF();

    /* compiled from: FloatingActionButtonImpl */
    public class a extends t7.g {
        public a() {
        }

        public final Object evaluate(float f10, Object obj, Object obj2) {
            g.this.f6308p = f10;
            ((Matrix) obj).getValues(this.f14894a);
            ((Matrix) obj2).getValues(this.f14895b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f14895b;
                float f11 = fArr[i10];
                float f12 = this.f14894a[i10];
                fArr[i10] = android.support.v4.media.a.e(f11, f12, f10, f12);
            }
            this.f14896c.setValues(this.f14895b);
            return this.f14896c;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f6320a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f6321b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f6322c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f6323d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f6324e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f6325f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f6326g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f6327h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f6320a = f10;
            this.f6321b = f11;
            this.f6322c = f12;
            this.f6323d = f13;
            this.f6324e = f14;
            this.f6325f = f15;
            this.f6326g = f16;
            this.f6327h = matrix;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            g.this.f6314v.setAlpha(t7.b.a(this.f6320a, this.f6321b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = g.this.f6314v;
            float f10 = this.f6322c;
            floatingActionButton.setScaleX(((this.f6323d - f10) * floatValue) + f10);
            FloatingActionButton floatingActionButton2 = g.this.f6314v;
            float f11 = this.f6324e;
            floatingActionButton2.setScaleY(((this.f6323d - f11) * floatValue) + f11);
            g gVar = g.this;
            float f12 = this.f6325f;
            float f13 = this.f6326g;
            gVar.f6308p = android.support.v4.media.a.e(f13, f12, floatValue, f12);
            gVar.a(android.support.v4.media.a.e(f13, f12, floatValue, f12), this.f6327h);
            g.this.f6314v.setImageMatrix(this.f6327h);
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class c extends i {
        public c(e8.f fVar) {
            super(fVar);
        }

        public final float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class d extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f6329e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e8.f fVar) {
            super(fVar);
            this.f6329e = fVar;
        }

        public final float a() {
            g gVar = this.f6329e;
            return gVar.f6300h + gVar.f6301i;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class e extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f6330e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(e8.f fVar) {
            super(fVar);
            this.f6330e = fVar;
        }

        public final float a() {
            g gVar = this.f6330e;
            return gVar.f6300h + gVar.f6302j;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public interface f {
        void a();

        void b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.g$g  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    public interface C0065g {
    }

    /* compiled from: FloatingActionButtonImpl */
    public class h extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f6331e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(e8.f fVar) {
            super(fVar);
            this.f6331e = fVar;
        }

        public final float a() {
            return this.f6331e.f6300h;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6332a;

        /* renamed from: b  reason: collision with root package name */
        public float f6333b;

        /* renamed from: c  reason: collision with root package name */
        public float f6334c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g f6335d;

        public i(e8.f fVar) {
            this.f6335d = fVar;
        }

        public abstract float a();

        public final void onAnimationEnd(Animator animator) {
            g gVar = this.f6335d;
            float f10 = (float) ((int) this.f6334c);
            l8.h hVar = gVar.f6294b;
            if (hVar != null) {
                hVar.m(f10);
            }
            this.f6332a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            if (!this.f6332a) {
                l8.h hVar = this.f6335d.f6294b;
                if (hVar == null) {
                    f10 = 0.0f;
                } else {
                    f10 = hVar.f12778a.f12811n;
                }
                this.f6333b = f10;
                this.f6334c = a();
                this.f6332a = true;
            }
            g gVar = this.f6335d;
            float f11 = this.f6333b;
            float animatedFraction = (float) ((int) ((valueAnimator.getAnimatedFraction() * (this.f6334c - f11)) + f11));
            l8.h hVar2 = gVar.f6294b;
            if (hVar2 != null) {
                hVar2.m(animatedFraction);
            }
        }
    }

    public g(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f6314v = floatingActionButton;
        this.f6315w = bVar;
        o oVar = new o();
        e8.f fVar = (e8.f) this;
        oVar.a(H, d(new e(fVar)));
        oVar.a(I, d(new d(fVar)));
        oVar.a(J, d(new d(fVar)));
        oVar.a(K, d(new d(fVar)));
        oVar.a(L, d(new h(fVar)));
        oVar.a(M, d(new c(fVar)));
        this.f6307o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f6314v.getDrawable();
        if (drawable != null && this.f6309q != 0) {
            RectF rectF = this.f6317y;
            RectF rectF2 = this.f6318z;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f6309q;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f6309q;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    public final AnimatorSet b(t7.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6314v, View.ALPHA, new float[]{f10});
        hVar.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6314v, View.SCALE_X, new float[]{f11});
        hVar.f("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new e8.d());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f6314v, View.SCALE_Y, new float[]{f11});
        hVar.f("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new e8.d());
        }
        arrayList.add(ofFloat3);
        a(f12, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f6314v, new t7.f(), new a(), new Matrix[]{new Matrix(this.A)});
        hVar.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        m9.b.R(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this.f6314v.getAlpha(), f10, this.f6314v.getScaleX(), f11, this.f6314v.getScaleY(), this.f6308p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        m9.b.R(animatorSet, arrayList);
        animatorSet.setDuration((long) j.c(this.f6314v.getContext(), i10, this.f6314v.getContext().getResources().getInteger(R$integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(j.d(this.f6314v.getContext(), i11, t7.b.f14886b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        float f10;
        int i10 = 0;
        if (this.f6298f) {
            i10 = Math.max((this.f6303k - this.f6314v.getSizeDimension()) / 2, 0);
        }
        if (this.f6299g) {
            f10 = e() + this.f6302j;
        } else {
            f10 = 0.0f;
        }
        int max = Math.max(i10, (int) Math.ceil((double) f10));
        int max2 = Math.max(i10, (int) Math.ceil((double) (f10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f10, float f11, float f12) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.f6313u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f6295c;
        if (drawable != null) {
            a.b.h(drawable, j8.a.c(colorStateList));
        }
    }

    public final void n(m mVar) {
        this.f6293a = mVar;
        l8.h hVar = this.f6294b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        Drawable drawable = this.f6295c;
        if (drawable instanceof q) {
            ((q) drawable).setShapeAppearanceModel(mVar);
        }
        e8.b bVar = this.f6296d;
        if (bVar != null) {
            bVar.f9259o = mVar;
            bVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.f6316x;
        f(rect);
        g0.D(this.f6297e, "Didn't initialize content background");
        if (o()) {
            g.super.setBackgroundDrawable(new InsetDrawable(this.f6297e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            k8.b bVar = this.f6315w;
            LayerDrawable layerDrawable = this.f6297e;
            FloatingActionButton.b bVar2 = (FloatingActionButton.b) bVar;
            if (layerDrawable != null) {
                g.super.setBackgroundDrawable(layerDrawable);
            } else {
                bVar2.getClass();
            }
        }
        k8.b bVar3 = this.f6315w;
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton.b bVar4 = (FloatingActionButton.b) bVar3;
        FloatingActionButton.this.f6268t.set(i10, i11, i12, i13);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i14 = floatingActionButton.f6265q;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
