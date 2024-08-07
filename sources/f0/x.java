package f0;

import c0.t;
import d.d;
import i0.f;
import i0.m;
import j7.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import z0.b;
import z0.c;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f9609a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f9610b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f9611c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f9612d = 5000;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f9613e = false;

    public /* synthetic */ x(ArrayList arrayList, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f9609a = arrayList;
        this.f9610b = scheduledExecutorService;
        this.f9611c = executor;
    }

    public final String e(b.a aVar) {
        List list = this.f9609a;
        ScheduledExecutorService scheduledExecutorService = this.f9610b;
        Executor executor = this.f9611c;
        long j10 = this.f9612d;
        boolean z10 = this.f9613e;
        m mVar = new m(new ArrayList(list), false, a.x());
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new t(executor, mVar, aVar, j10), j10, TimeUnit.MILLISECONDS);
        d dVar = new d(mVar, 11);
        c<Void> cVar = aVar.f17800c;
        if (cVar != null) {
            cVar.b(dVar, executor);
        }
        mVar.b(new f.b(mVar, new y(z10, aVar, schedule)), executor);
        return "surfaceList";
    }
}
