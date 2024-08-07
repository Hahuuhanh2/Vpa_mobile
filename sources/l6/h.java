package l6;

import c0.s0;
import da.f;
import da.g;
import f6.s;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n6.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements a.C0164a, g.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f12736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12737b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f12738c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f12739d;

    public /* synthetic */ h(f fVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f12737b = fVar;
        this.f12738c = runnable;
        this.f12736a = j10;
        this.f12739d = timeUnit;
    }

    public /* synthetic */ h(j jVar, Iterable iterable, s sVar, long j10) {
        this.f12737b = jVar;
        this.f12738c = iterable;
        this.f12739d = sVar;
        this.f12736a = j10;
    }

    public final ScheduledFuture a(g.a aVar) {
        f fVar = (f) this.f12737b;
        return fVar.f8847b.schedule(new s0(5, fVar, (Runnable) this.f12738c, aVar), this.f12736a, (TimeUnit) this.f12739d);
    }

    public final Object d() {
        j jVar = (j) this.f12737b;
        long j10 = this.f12736a;
        jVar.f12745c.D0((Iterable) this.f12738c);
        jVar.f12745c.I0(jVar.f12749g.a() + j10, (s) this.f12739d);
        return null;
    }
}
