package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import b4.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p3.j0;
import sk.j;
import x3.n;
import x3.t;
import x3.w;

/* compiled from: DiagnosticsWorker.kt */
public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.f(context, "context");
        j.f(workerParameters, "parameters");
    }

    public final d.a.c f() {
        j0 b10 = j0.b(this.f3756a);
        j.e(b10, "getInstance(applicationContext)");
        WorkDatabase workDatabase = b10.f13939c;
        j.e(workDatabase, "workManager.workDatabase");
        t u10 = workDatabase.u();
        n s10 = workDatabase.s();
        w v2 = workDatabase.v();
        x3.j r10 = workDatabase.r();
        b10.f13938b.f3743c.getClass();
        ArrayList g2 = u10.g(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        ArrayList n10 = u10.n();
        ArrayList c10 = u10.c();
        if (!g2.isEmpty()) {
            o3.j a10 = o3.j.a();
            int i10 = b.f4001a;
            a10.getClass();
            o3.j a11 = o3.j.a();
            b.a(s10, v2, r10, g2);
            a11.getClass();
        }
        if (!n10.isEmpty()) {
            o3.j a12 = o3.j.a();
            int i11 = b.f4001a;
            a12.getClass();
            o3.j a13 = o3.j.a();
            b.a(s10, v2, r10, n10);
            a13.getClass();
        }
        if (!c10.isEmpty()) {
            o3.j a14 = o3.j.a();
            int i12 = b.f4001a;
            a14.getClass();
            o3.j a15 = o3.j.a();
            b.a(s10, v2, r10, c10);
            a15.getClass();
        }
        return new d.a.c();
    }
}
