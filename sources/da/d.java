package da;

import da.g;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w.o;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements g.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8838a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f8839b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f8840c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f8841d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f8842e;

    public /* synthetic */ d(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f8838a = fVar;
        this.f8839b = runnable;
        this.f8840c = j10;
        this.f8841d = j11;
        this.f8842e = timeUnit;
    }

    public final ScheduledFuture a(g.a aVar) {
        f fVar = this.f8838a;
        Runnable runnable = this.f8839b;
        return fVar.f8847b.scheduleAtFixedRate(new o(6, fVar, runnable, aVar), this.f8840c, this.f8841d, this.f8842e);
    }
}
