package al;

import android.support.v4.media.a;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Executors.kt */
public final class s0 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    public final Future<?> f19086a;

    public s0(ScheduledFuture scheduledFuture) {
        this.f19086a = scheduledFuture;
    }

    public final void b() {
        this.f19086a.cancel(false);
    }

    public final String toString() {
        StringBuilder q10 = a.q("DisposableFutureHandle[");
        q10.append(this.f19086a);
        q10.append(']');
        return q10.toString();
    }
}
