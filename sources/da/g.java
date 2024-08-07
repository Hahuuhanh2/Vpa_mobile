package da;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import z0.a;

@SuppressLint({"RestrictedApi"})
/* compiled from: DelegatingScheduledFuture */
public final class g<V> extends z0.a<V> implements ScheduledFuture<V> {

    /* renamed from: o  reason: collision with root package name */
    public final ScheduledFuture<?> f8848o;

    /* compiled from: DelegatingScheduledFuture */
    public class a implements b<V> {
        public a() {
        }
    }

    /* compiled from: DelegatingScheduledFuture */
    public interface b<T> {
    }

    /* compiled from: DelegatingScheduledFuture */
    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public g(c<V> cVar) {
        this.f8848o = cVar.a(new a());
    }

    public final int compareTo(Object obj) {
        return this.f8848o.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f8848o.getDelay(timeUnit);
    }

    public final void i() {
        boolean z10;
        ScheduledFuture<?> scheduledFuture = this.f8848o;
        Object obj = this.f17778a;
        if (!(obj instanceof a.b) || !((a.b) obj).f17783a) {
            z10 = false;
        } else {
            z10 = true;
        }
        scheduledFuture.cancel(z10);
    }
}
