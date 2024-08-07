package da;

import da.g;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements g.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8829a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f8830b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f8831c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f8832d;

    public /* synthetic */ b(f fVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f8829a = fVar;
        this.f8830b = callable;
        this.f8831c = j10;
        this.f8832d = timeUnit;
    }

    public final ScheduledFuture a(g.a aVar) {
        f fVar = this.f8829a;
        Callable callable = this.f8830b;
        return fVar.f8847b.schedule(new e(fVar, callable, aVar), this.f8831c, this.f8832d);
    }
}
