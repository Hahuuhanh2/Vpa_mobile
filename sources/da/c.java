package da;

import da.g;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v.i;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements g.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f8834b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f8835c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f8836d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f8837e;

    public /* synthetic */ c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f8833a = fVar;
        this.f8834b = runnable;
        this.f8835c = j10;
        this.f8836d = j11;
        this.f8837e = timeUnit;
    }

    public final ScheduledFuture a(g.a aVar) {
        f fVar = this.f8833a;
        Runnable runnable = this.f8834b;
        return fVar.f8847b.scheduleWithFixedDelay(new i(5, fVar, runnable, aVar), this.f8835c, this.f8836d, this.f8837e);
    }
}
