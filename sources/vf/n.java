package vf;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;
import sf.b;
import uf.h;

/* compiled from: WormAnimation */
public class n extends a<AnimatorSet> {

    /* renamed from: d  reason: collision with root package name */
    public int f23303d;

    /* renamed from: e  reason: collision with root package name */
    public int f23304e;

    /* renamed from: f  reason: collision with root package name */
    public int f23305f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23306g;

    /* renamed from: h  reason: collision with root package name */
    public h f23307h = new h();

    /* compiled from: WormAnimation */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f23308a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f23309b;

        public a(h hVar, boolean z10) {
            this.f23308a = hVar;
            this.f23309b = z10;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            n nVar = n.this;
            h hVar = this.f23308a;
            boolean z10 = this.f23309b;
            nVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (nVar.f23306g) {
                if (!z10) {
                    hVar.f23042b = intValue;
                } else {
                    hVar.f23041a = intValue;
                }
            } else if (!z10) {
                hVar.f23041a = intValue;
            } else {
                hVar.f23042b = intValue;
            }
            b.a aVar = nVar.f23260b;
            if (aVar != null) {
                ((com.smarteist.autoimageslider.IndicatorView.a) aVar).b(hVar);
            }
        }
    }

    /* compiled from: WormAnimation */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f23311a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23312b;

        /* renamed from: c  reason: collision with root package name */
        public final int f23313c;

        /* renamed from: d  reason: collision with root package name */
        public final int f23314d;

        public b(int i10, int i11, int i12, int i13) {
            this.f23311a = i10;
            this.f23312b = i11;
            this.f23313c = i12;
            this.f23314d = i13;
        }
    }

    public n(b.a aVar) {
        super(aVar);
    }

    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final b d(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f23303d;
            int i15 = this.f23305f;
            i13 = i14 + i15;
            int i16 = this.f23304e;
            i11 = i16 + i15;
            i10 = i14 - i15;
            i12 = i16 - i15;
        } else {
            int i17 = this.f23303d;
            int i18 = this.f23305f;
            i13 = i17 - i18;
            int i19 = this.f23304e;
            i11 = i19 - i18;
            i10 = i17 + i18;
            i12 = i19 + i18;
        }
        return new b(i13, i11, i10, i12);
    }

    public final ValueAnimator e(int i10, int i11, long j10, boolean z10, h hVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new a(hVar, z10));
        return ofInt;
    }

    public n f(float f10) {
        T t10 = this.f23261c;
        if (t10 == null) {
            return this;
        }
        long j10 = (long) (f10 * ((float) this.f23259a));
        Iterator<Animator> it = ((AnimatorSet) t10).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j10 <= duration) {
                duration = j10;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j10 -= duration;
        }
        return this;
    }
}
