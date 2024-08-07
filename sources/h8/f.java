package h8;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import j3.c;

/* compiled from: CircularIndeterminateAnimatorDelegate */
public final class f extends m.b {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f10635l = {0, 1350, 2700, 4050};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f10636m = {667, 2017, 3367, 4717};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f10637n = {1000, 2350, 3700, 5050};

    /* renamed from: o  reason: collision with root package name */
    public static final a f10638o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f10639p = new b();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f10640d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f10641e;

    /* renamed from: f  reason: collision with root package name */
    public final q2.b f10642f;

    /* renamed from: g  reason: collision with root package name */
    public final CircularProgressIndicatorSpec f10643g;

    /* renamed from: h  reason: collision with root package name */
    public int f10644h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f10645i;

    /* renamed from: j  reason: collision with root package name */
    public float f10646j;

    /* renamed from: k  reason: collision with root package name */
    public c f10647k = null;

    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public class a extends Property<f, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((f) obj).f10645i);
        }

        public final void set(Object obj, Object obj2) {
            f fVar = (f) obj;
            float floatValue = ((Float) obj2).floatValue();
            fVar.f10645i = floatValue;
            int i10 = (int) (5400.0f * floatValue);
            float[] fArr = (float[]) fVar.f13021b;
            float f10 = floatValue * 1520.0f;
            fArr[0] = -20.0f + f10;
            fArr[1] = f10;
            for (int i11 = 0; i11 < 4; i11++) {
                float f11 = (float) 667;
                float[] fArr2 = (float[]) fVar.f13021b;
                fArr2[1] = (fVar.f10642f.getInterpolation(((float) (i10 - f.f10635l[i11])) / f11) * 250.0f) + fArr2[1];
                float f12 = ((float) (i10 - f.f10636m[i11])) / f11;
                float[] fArr3 = (float[]) fVar.f13021b;
                fArr3[0] = (fVar.f10642f.getInterpolation(f12) * 250.0f) + fArr3[0];
            }
            float[] fArr4 = (float[]) fVar.f13021b;
            float f13 = fArr4[0];
            float f14 = fArr4[1];
            float f15 = ((f14 - f13) * fVar.f10646j) + f13;
            fArr4[0] = f15;
            fArr4[0] = f15 / 360.0f;
            fArr4[1] = f14 / 360.0f;
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    break;
                }
                float f16 = ((float) (i10 - f.f10637n[i12])) / ((float) 333);
                if (f16 >= 0.0f && f16 <= 1.0f) {
                    int i13 = i12 + fVar.f10644h;
                    int[] iArr = fVar.f10643g.f10625c;
                    int length = i13 % iArr.length;
                    ((int[]) fVar.f13022c)[0] = t7.c.a(fVar.f10642f.getInterpolation(f16), Integer.valueOf(m9.b.m(iArr[length], ((l) fVar.f13020a).f10666q)), Integer.valueOf(m9.b.m(fVar.f10643g.f10625c[(length + 1) % iArr.length], ((l) fVar.f13020a).f10666q))).intValue();
                    break;
                }
                i12++;
            }
            ((l) fVar.f13020a).invalidateSelf();
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public class b extends Property<f, Float> {
        public b() {
            super(Float.class, "completeEndFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((f) obj).f10646j);
        }

        public final void set(Object obj, Object obj2) {
            ((f) obj).f10646j = ((Float) obj2).floatValue();
        }
    }

    public f(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f10643g = circularProgressIndicatorSpec;
        this.f10642f = new q2.b();
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.f10640d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void f() {
        k();
    }

    public final void g(BaseProgressIndicator.c cVar) {
        this.f10647k = cVar;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.f10641e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((l) this.f13020a).isVisible()) {
                this.f10641e.start();
            } else {
                c();
            }
        }
    }

    public final void i() {
        if (this.f10640d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10638o, new float[]{0.0f, 1.0f});
            this.f10640d = ofFloat;
            ofFloat.setDuration(5400);
            this.f10640d.setInterpolator((TimeInterpolator) null);
            this.f10640d.setRepeatCount(-1);
            this.f10640d.addListener(new d(this));
        }
        if (this.f10641e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10639p, new float[]{0.0f, 1.0f});
            this.f10641e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f10641e.setInterpolator(this.f10642f);
            this.f10641e.addListener(new e(this));
        }
        k();
        this.f10640d.start();
    }

    public final void j() {
        this.f10647k = null;
    }

    public final void k() {
        this.f10644h = 0;
        ((int[]) this.f13022c)[0] = m9.b.m(this.f10643g.f10625c[0], ((l) this.f13020a).f10666q);
        this.f10646j = 0.0f;
    }
}
