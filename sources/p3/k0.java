package p3;

import a4.b;
import android.content.Context;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import q3.c;
import rk.t;
import sk.i;
import sk.j;
import v3.l;
import y3.m;

/* compiled from: WorkManagerImplExt.kt */
public final /* synthetic */ class k0 extends i implements t<Context, a, b, WorkDatabase, l, r, List<? extends t>> {

    /* renamed from: p  reason: collision with root package name */
    public static final k0 f13948p = new k0();

    public k0() {
        super(6, l0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    public final List e(Object obj, Object obj2, b bVar, WorkDatabase workDatabase, l lVar, r rVar) {
        Context context = (Context) obj;
        a aVar = (a) obj2;
        j.f(context, "p0");
        j.f(aVar, "p1");
        int i10 = v.f14027a;
        s3.b bVar2 = new s3.b(context, workDatabase, aVar);
        m.a(context, SystemJobService.class, true);
        o3.j.a().getClass();
        return j7.a.d0(bVar2, new c(context, aVar, lVar, rVar, new i0(rVar, bVar), bVar));
    }
}
