package gl;

import al.g0;
import android.support.v4.media.a;

/* compiled from: Tasks.kt */
public final class j extends g {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f20488c;

    public j(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f20488c = runnable;
    }

    public final void run() {
        try {
            this.f20488c.run();
        } finally {
            this.f20486b.a();
        }
    }

    public final String toString() {
        StringBuilder q10 = a.q("Task[");
        q10.append(this.f20488c.getClass().getSimpleName());
        q10.append('@');
        q10.append(g0.T(this.f20488c));
        q10.append(", ");
        q10.append(this.f20485a);
        q10.append(", ");
        q10.append(this.f20486b);
        q10.append(']');
        return q10.toString();
    }
}
