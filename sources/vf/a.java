package vf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import sf.b;

/* compiled from: BaseAnimation */
public abstract class a<T extends Animator> {

    /* renamed from: a  reason: collision with root package name */
    public long f23259a = 350;

    /* renamed from: b  reason: collision with root package name */
    public b.a f23260b;

    /* renamed from: c  reason: collision with root package name */
    public T f23261c;

    public a(b.a aVar) {
        this.f23260b = aVar;
        this.f23261c = a();
    }

    public abstract T a();

    public final void b(long j10) {
        this.f23259a = j10;
        T t10 = this.f23261c;
        if (t10 instanceof ValueAnimator) {
            t10.setDuration(j10);
        }
    }

    public final void c() {
        T t10 = this.f23261c;
        if (t10 != null && !t10.isRunning()) {
            this.f23261c.start();
        }
    }
}
