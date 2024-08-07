package oa;

import android.os.SystemClock;
import android.util.Log;
import c6.f;
import com.google.android.gms.tasks.TaskCompletionSource;
import ia.e0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ka.b0;
import pa.c;

/* compiled from: ReportQueue */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final double f13776a;

    /* renamed from: b  reason: collision with root package name */
    public final double f13777b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13778c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13779d = SystemClock.elapsedRealtime();

    /* renamed from: e  reason: collision with root package name */
    public final int f13780e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayBlockingQueue f13781f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadPoolExecutor f13782g;

    /* renamed from: h  reason: collision with root package name */
    public final f<b0> f13783h;

    /* renamed from: i  reason: collision with root package name */
    public final vl.d f13784i;

    /* renamed from: j  reason: collision with root package name */
    public int f13785j;

    /* renamed from: k  reason: collision with root package name */
    public long f13786k;

    /* compiled from: ReportQueue */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f13787a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<e0> f13788b;

        public a(e0 e0Var, TaskCompletionSource taskCompletionSource) {
            this.f13787a = e0Var;
            this.f13788b = taskCompletionSource;
        }

        public final void run() {
            d.this.b(this.f13787a, this.f13788b);
            ((AtomicInteger) d.this.f13784i.f23363c).set(0);
            d dVar = d.this;
            double min = Math.min(3600000.0d, Math.pow(dVar.f13777b, (double) dVar.a()) * (60000.0d / dVar.f13776a));
            String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(min / 1000.0d)});
            this.f13787a.c();
            boolean isLoggable = Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public d(f<b0> fVar, c cVar, vl.d dVar) {
        double d10 = cVar.f14114d;
        double d11 = cVar.f14115e;
        this.f13776a = d10;
        this.f13777b = d11;
        this.f13778c = ((long) cVar.f14116f) * 1000;
        this.f13783h = fVar;
        this.f13784i = dVar;
        int i10 = (int) d10;
        this.f13780e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f13781f = arrayBlockingQueue;
        this.f13782g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f13785j = 0;
        this.f13786k = 0;
    }

    public final int a() {
        boolean z10;
        int i10;
        if (this.f13786k == 0) {
            this.f13786k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f13786k) / this.f13778c);
        if (this.f13781f.size() == this.f13780e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = Math.min(100, this.f13785j + currentTimeMillis);
        } else {
            i10 = Math.max(0, this.f13785j - currentTimeMillis);
        }
        if (this.f13785j != i10) {
            this.f13785j = i10;
            this.f13786k = System.currentTimeMillis();
        }
        return i10;
    }

    public final void b(e0 e0Var, TaskCompletionSource<e0> taskCompletionSource) {
        boolean z10;
        e0Var.c();
        Log.isLoggable("FirebaseCrashlytics", 3);
        if (SystemClock.elapsedRealtime() - this.f13779d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13783h.b(new c6.a(e0Var.a(), c6.d.HIGHEST), new b(this, taskCompletionSource, z10, e0Var));
    }
}
