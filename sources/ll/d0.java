package ll;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import n0.l;
import sk.j;

/* compiled from: Timeout.kt */
public class d0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f20871d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f20872a;

    /* renamed from: b  reason: collision with root package name */
    public long f20873b;

    /* renamed from: c  reason: collision with root package name */
    public long f20874c;

    /* compiled from: Timeout.kt */
    public static final class a extends d0 {
        public final d0 d(long j10) {
            return this;
        }

        public final void f() {
        }

        public final d0 g(long j10, TimeUnit timeUnit) {
            j.f(timeUnit, "unit");
            return this;
        }
    }

    public d0 a() {
        this.f20872a = false;
        return this;
    }

    public d0 b() {
        this.f20874c = 0;
        return this;
    }

    public long c() {
        if (this.f20872a) {
            return this.f20873b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public d0 d(long j10) {
        this.f20872a = true;
        this.f20873b = j10;
        return this;
    }

    public boolean e() {
        return this.f20872a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f20872a && this.f20873b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public d0 g(long j10, TimeUnit timeUnit) {
        boolean z10;
        j.f(timeUnit, "unit");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f20874c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(l.i("timeout < 0: ", j10).toString());
    }
}
