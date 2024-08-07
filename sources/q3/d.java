package q3;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import o3.n;
import p3.c;
import p3.h0;
import p3.i0;
import p3.w;
import sk.j;

/* compiled from: TimeLimiter.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final n f14313a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f14314b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14315c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14316d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f14317e = new LinkedHashMap();

    public d(c cVar, i0 i0Var) {
        j.f(cVar, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90);
        this.f14313a = cVar;
        this.f14314b = i0Var;
        this.f14315c = millis;
    }

    public final void a(w wVar) {
        Runnable runnable;
        j.f(wVar, "token");
        synchronized (this.f14316d) {
            runnable = (Runnable) this.f14317e.remove(wVar);
        }
        if (runnable != null) {
            this.f14313a.b(runnable);
        }
    }

    public final void b(w wVar) {
        v.n nVar = new v.n(21, this, wVar);
        synchronized (this.f14316d) {
            Runnable runnable = (Runnable) this.f14317e.put(wVar, nVar);
        }
        this.f14313a.a(nVar, this.f14315c);
    }
}
