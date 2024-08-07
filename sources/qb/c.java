package qb;

import android.annotation.SuppressLint;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lb.a;
import sb.i;
import sb.j;
import tb.b;

/* compiled from: MemoryGaugeCollector */
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f14399f = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f14400a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f14401b;

    /* renamed from: c  reason: collision with root package name */
    public final Runtime f14402c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f14403d = null;

    /* renamed from: e  reason: collision with root package name */
    public long f14404e = -1;

    @SuppressLint({"ThreadPoolCreation"})
    public c() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f14400a = newSingleThreadScheduledExecutor;
        this.f14401b = new ConcurrentLinkedQueue<>();
        this.f14402c = runtime;
    }

    public final synchronized void a(long j10, Timer timer) {
        this.f14404e = j10;
        try {
            this.f14403d = this.f14400a.scheduleAtFixedRate(new mb.b(2, this, timer), 0, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = f14399f;
            e10.getMessage();
            aVar.f();
        }
        return;
    }

    public final b b(Timer timer) {
        if (timer == null) {
            return null;
        }
        long a10 = timer.a() + timer.f7662a;
        b.a I = b.I();
        I.s();
        b.G((b) I.f7906b, a10);
        int b10 = j.b(((this.f14402c.totalMemory() - this.f14402c.freeMemory()) * i.f14722d.f14724a) / i.f14721c.f14724a);
        I.s();
        b.H((b) I.f7906b, b10);
        return (b) I.q();
    }
}
