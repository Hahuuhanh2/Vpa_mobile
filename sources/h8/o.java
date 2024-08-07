package h8;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import m.b;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
public final class o extends b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f10676j = new a();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f10677d;

    /* renamed from: e  reason: collision with root package name */
    public q2.b f10678e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearProgressIndicatorSpec f10679f;

    /* renamed from: g  reason: collision with root package name */
    public int f10680g = 1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10681h;

    /* renamed from: i  reason: collision with root package name */
    public float f10682i;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    public class a extends Property<o, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((o) obj).f10682i);
        }

        public final void set(Object obj, Object obj2) {
            o oVar = (o) obj;
            float floatValue = ((Float) obj2).floatValue();
            oVar.f10682i = floatValue;
            float[] fArr = (float[]) oVar.f13021b;
            fArr[0] = 0.0f;
            float f10 = ((float) (((int) (floatValue * 333.0f)) - 0)) / ((float) 667);
            float interpolation = oVar.f10678e.getInterpolation(f10);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = (float[]) oVar.f13021b;
            float interpolation2 = oVar.f10678e.getInterpolation(f10 + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = (float[]) oVar.f13021b;
            fArr3[5] = 1.0f;
            if (oVar.f10681h && fArr3[3] < 1.0f) {
                int[] iArr = (int[]) oVar.f13022c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = m9.b.m(oVar.f10679f.f10625c[oVar.f10680g], ((l) oVar.f13020a).f10666q);
                oVar.f10681h = false;
            }
            ((l) oVar.f13020a).invalidateSelf();
        }
    }

    public o(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f10679f = linearProgressIndicatorSpec;
        this.f10678e = new q2.b();
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.f10677d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void f() {
        k();
    }

    public final void g(BaseProgressIndicator.c cVar) {
    }

    public final void h() {
    }

    public final void i() {
        if (this.f10677d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10676j, new float[]{0.0f, 1.0f});
            this.f10677d = ofFloat;
            ofFloat.setDuration(333);
            this.f10677d.setInterpolator((TimeInterpolator) null);
            this.f10677d.setRepeatCount(-1);
            this.f10677d.addListener(new n(this));
        }
        k();
        this.f10677d.start();
    }

    public final void j() {
    }

    public final void k() {
        this.f10681h = true;
        this.f10680g = 1;
        Arrays.fill((int[]) this.f13022c, m9.b.m(this.f10679f.f10625c[0], ((l) this.f13020a).f10666q));
    }
}
