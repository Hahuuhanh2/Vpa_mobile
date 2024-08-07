package qb;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tb.e;
import v.f;

/* compiled from: CpuGaugeCollector */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final lb.a f14388g = lb.a.d();

    /* renamed from: h  reason: collision with root package name */
    public static final long f14389h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<e> f14390a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f14391b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c  reason: collision with root package name */
    public final String f14392c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14393d;

    /* renamed from: e  reason: collision with root package name */
    public ScheduledFuture f14394e = null;

    /* renamed from: f  reason: collision with root package name */
    public long f14395f = -1;

    @SuppressLint({"ThreadPoolCreation"})
    public a() {
        int myPid = Process.myPid();
        StringBuilder q10 = android.support.v4.media.a.q("/proc/");
        q10.append(Integer.toString(myPid));
        q10.append("/stat");
        this.f14392c = q10.toString();
        this.f14393d = Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public final synchronized void a(long j10, Timer timer) {
        this.f14395f = j10;
        try {
            this.f14394e = this.f14391b.scheduleAtFixedRate(new f(25, this, timer), 0, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            lb.a aVar = f14388g;
            e10.getMessage();
            aVar.f();
        }
        return;
    }

    public final e b(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f14392c));
            long a10 = timer.a() + timer.f7662a;
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            long parseLong3 = Long.parseLong(split[14]);
            long parseLong4 = Long.parseLong(split[16]);
            e.a J = e.J();
            J.s();
            e.G((e) J.f7906b, a10);
            double d10 = ((double) (parseLong3 + parseLong4)) / ((double) this.f14393d);
            long j10 = f14389h;
            long round = Math.round(d10 * ((double) j10));
            J.s();
            e.I((e) J.f7906b, round);
            long round2 = Math.round((((double) (parseLong + parseLong2)) / ((double) this.f14393d)) * ((double) j10));
            J.s();
            e.H((e) J.f7906b, round2);
            e eVar = (e) J.q();
            bufferedReader.close();
            return eVar;
        } catch (IOException e10) {
            lb.a aVar = f14388g;
            e10.getMessage();
            aVar.f();
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e11) {
            lb.a aVar2 = f14388g;
            e11.getMessage();
            aVar2.f();
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
