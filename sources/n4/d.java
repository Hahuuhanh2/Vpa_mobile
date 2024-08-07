package n4;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.i;
import java.util.Iterator;
import m9.b;

/* compiled from: LottieValueAnimator */
public final class d extends a implements Choreographer.FrameCallback {

    /* renamed from: c  reason: collision with root package name */
    public float f13502c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13503d = false;

    /* renamed from: e  reason: collision with root package name */
    public long f13504e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f13505f = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public int f13506n = 0;

    /* renamed from: o  reason: collision with root package name */
    public float f13507o = -2.14748365E9f;

    /* renamed from: p  reason: collision with root package name */
    public float f13508p = 2.14748365E9f;

    /* renamed from: q  reason: collision with root package name */
    public i f13509q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13510r = false;

    public final float c() {
        i iVar = this.f13509q;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f13508p;
        if (f10 == 2.14748365E9f) {
            return iVar.f4843l;
        }
        return f10;
    }

    public final void cancel() {
        Iterator it = this.f13499b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(f());
        g(true);
    }

    public final void doFrame(long j10) {
        boolean z10;
        float f10;
        float f11;
        if (this.f13510r) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        i iVar = this.f13509q;
        if (iVar != null && this.f13510r) {
            long j11 = this.f13504e;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / iVar.f4844m) / Math.abs(this.f13502c));
            float f12 = this.f13505f;
            if (f()) {
                abs = -abs;
            }
            float f13 = f12 + abs;
            this.f13505f = f13;
            float e10 = e();
            float c10 = c();
            PointF pointF = f.f13512a;
            if (f13 < e10 || f13 > c10) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z11 = !z10;
            this.f13505f = f.b(this.f13505f, e(), c());
            this.f13504e = j10;
            b();
            if (z11) {
                if (getRepeatCount() == -1 || this.f13506n < getRepeatCount()) {
                    Iterator it = this.f13499b.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f13506n++;
                    if (getRepeatMode() == 2) {
                        this.f13503d = !this.f13503d;
                        this.f13502c = -this.f13502c;
                    } else {
                        if (f()) {
                            f10 = c();
                        } else {
                            f10 = e();
                        }
                        this.f13505f = f10;
                    }
                    this.f13504e = j10;
                } else {
                    if (this.f13502c < 0.0f) {
                        f11 = e();
                    } else {
                        f11 = c();
                    }
                    this.f13505f = f11;
                    g(true);
                    a(f());
                }
            }
            if (this.f13509q != null) {
                float f14 = this.f13505f;
                if (f14 < this.f13507o || f14 > this.f13508p) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f13507o), Float.valueOf(this.f13508p), Float.valueOf(this.f13505f)}));
                }
            }
            b.v();
        }
    }

    public final float e() {
        i iVar = this.f13509q;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f13507o;
        if (f10 == -2.14748365E9f) {
            return iVar.f4842k;
        }
        return f10;
    }

    public final boolean f() {
        if (this.f13502c < 0.0f) {
            return true;
        }
        return false;
    }

    public final void g(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f13510r = false;
        }
    }

    public final float getAnimatedFraction() {
        float e10;
        float c10;
        float e11;
        if (this.f13509q == null) {
            return 0.0f;
        }
        if (f()) {
            e10 = c() - this.f13505f;
            c10 = c();
            e11 = e();
        } else {
            e10 = this.f13505f - e();
            c10 = c();
            e11 = e();
        }
        return e10 / (c10 - e11);
    }

    public final Object getAnimatedValue() {
        float f10;
        i iVar = this.f13509q;
        if (iVar == null) {
            f10 = 0.0f;
        } else {
            float f11 = this.f13505f;
            float f12 = iVar.f4842k;
            f10 = (f11 - f12) / (iVar.f4843l - f12);
        }
        return Float.valueOf(f10);
    }

    public final long getDuration() {
        i iVar = this.f13509q;
        if (iVar == null) {
            return 0;
        }
        return (long) iVar.b();
    }

    public final boolean isRunning() {
        return this.f13510r;
    }

    public final void j(float f10) {
        if (this.f13505f != f10) {
            this.f13505f = f.b(f10, e(), c());
            this.f13504e = 0;
            b();
        }
    }

    public final void k(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            i iVar = this.f13509q;
            if (iVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = iVar.f4842k;
            }
            if (iVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = iVar.f4843l;
            }
            float b10 = f.b(f10, f12, f13);
            float b11 = f.b(f11, f12, f13);
            if (b10 != this.f13507o || b11 != this.f13508p) {
                this.f13507o = b10;
                this.f13508p = b11;
                j((float) ((int) f.b(this.f13505f, b10, b11)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f10), Float.valueOf(f11)}));
    }

    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f13503d) {
            this.f13503d = false;
            this.f13502c = -this.f13502c;
        }
    }
}
