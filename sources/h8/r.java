package h8;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.R$anim;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import j3.c;
import java.util.Arrays;
import m.b;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
public final class r extends b {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f10685l = {533, 567, 850, 750};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f10686m = {1267, 1000, 333, 0};

    /* renamed from: n  reason: collision with root package name */
    public static final a f10687n = new a();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f10688d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f10689e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator[] f10690f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearProgressIndicatorSpec f10691g;

    /* renamed from: h  reason: collision with root package name */
    public int f10692h = 0;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10693i;

    /* renamed from: j  reason: collision with root package name */
    public float f10694j;

    /* renamed from: k  reason: collision with root package name */
    public c f10695k = null;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    public class a extends Property<r, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((r) obj).f10694j);
        }

        public final void set(Object obj, Object obj2) {
            r rVar = (r) obj;
            float floatValue = ((Float) obj2).floatValue();
            rVar.f10694j = floatValue;
            int i10 = (int) (floatValue * 1800.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                ((float[]) rVar.f13021b)[i11] = Math.max(0.0f, Math.min(1.0f, rVar.f10690f[i11].getInterpolation(((float) (i10 - r.f10686m[i11])) / ((float) r.f10685l[i11]))));
            }
            if (rVar.f10693i) {
                Arrays.fill((int[]) rVar.f13022c, m9.b.m(rVar.f10691g.f10625c[rVar.f10692h], ((l) rVar.f13020a).f10666q));
                rVar.f10693i = false;
            }
            ((l) rVar.f13020a).invalidateSelf();
        }
    }

    public r(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f10691g = linearProgressIndicatorSpec;
        this.f10690f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.f10688d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void f() {
        k();
    }

    public final void g(BaseProgressIndicator.c cVar) {
        this.f10695k = cVar;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.f10689e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            c();
            if (((l) this.f13020a).isVisible()) {
                this.f10689e.setFloatValues(new float[]{this.f10694j, 1.0f});
                this.f10689e.setDuration((long) ((1.0f - this.f10694j) * 1800.0f));
                this.f10689e.start();
            }
        }
    }

    public final void i() {
        if (this.f10688d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10687n, new float[]{0.0f, 1.0f});
            this.f10688d = ofFloat;
            ofFloat.setDuration(1800);
            this.f10688d.setInterpolator((TimeInterpolator) null);
            this.f10688d.setRepeatCount(-1);
            this.f10688d.addListener(new p(this));
        }
        if (this.f10689e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10687n, new float[]{1.0f});
            this.f10689e = ofFloat2;
            ofFloat2.setDuration(1800);
            this.f10689e.setInterpolator((TimeInterpolator) null);
            this.f10689e.addListener(new q(this));
        }
        k();
        this.f10688d.start();
    }

    public final void j() {
        this.f10695k = null;
    }

    public final void k() {
        this.f10692h = 0;
        int m10 = m9.b.m(this.f10691g.f10625c[0], ((l) this.f13020a).f10666q);
        int[] iArr = (int[]) this.f13022c;
        iArr[0] = m10;
        iArr[1] = m10;
    }
}
