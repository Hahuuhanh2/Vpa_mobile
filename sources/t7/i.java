package t7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.media.a;
import v.v;

/* compiled from: MotionTiming */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public long f14899a;

    /* renamed from: b  reason: collision with root package name */
    public long f14900b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f14901c;

    /* renamed from: d  reason: collision with root package name */
    public int f14902d;

    /* renamed from: e  reason: collision with root package name */
    public int f14903e;

    public i(long j10) {
        this.f14901c = null;
        this.f14902d = 0;
        this.f14903e = 1;
        this.f14899a = j10;
        this.f14900b = 150;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f14899a);
        animator.setDuration(this.f14900b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f14902d);
            valueAnimator.setRepeatMode(this.f14903e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f14901c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return b.f14886b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f14899a == iVar.f14899a && this.f14900b == iVar.f14900b && this.f14902d == iVar.f14902d && this.f14903e == iVar.f14903e) {
            return b().getClass().equals(iVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14899a;
        long j11 = this.f14900b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f14902d) * 31) + this.f14903e;
    }

    public final String toString() {
        StringBuilder p10 = a.p(10);
        p10.append(i.class.getName());
        p10.append('{');
        p10.append(Integer.toHexString(System.identityHashCode(this)));
        p10.append(" delay: ");
        p10.append(this.f14899a);
        p10.append(" duration: ");
        p10.append(this.f14900b);
        p10.append(" interpolator: ");
        p10.append(b().getClass());
        p10.append(" repeatCount: ");
        p10.append(this.f14902d);
        p10.append(" repeatMode: ");
        return v.e(p10, this.f14903e, "}\n");
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f14902d = 0;
        this.f14903e = 1;
        this.f14899a = j10;
        this.f14900b = j11;
        this.f14901c = timeInterpolator;
    }
}
