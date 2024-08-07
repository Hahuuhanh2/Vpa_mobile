package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.d;
import b4.a;
import d.i;
import sk.j;
import t3.b;
import x3.s;
import z3.c;

/* compiled from: ConstraintTrackingWorker.kt */
public final class ConstraintTrackingWorker extends d implements t3.d {

    /* renamed from: e  reason: collision with root package name */
    public final WorkerParameters f3851e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3852f = new Object();

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f3853n;

    /* renamed from: o  reason: collision with root package name */
    public final c<d.a> f3854o = new c<>();

    /* renamed from: p  reason: collision with root package name */
    public d f3855p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.f(context, "appContext");
        j.f(workerParameters, "workerParameters");
        this.f3851e = workerParameters;
    }

    public final void b() {
        boolean z10;
        d dVar = this.f3855p;
        if (dVar != null) {
            int i10 = 0;
            if (dVar.f3758c != -256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (Build.VERSION.SDK_INT >= 31) {
                    i10 = this.f3758c;
                }
                dVar.d(i10);
            }
        }
    }

    public final c c() {
        this.f3757b.f3735c.execute(new i(this, 13));
        c<d.a> cVar = this.f3854o;
        j.e(cVar, "future");
        return cVar;
    }

    public final void e(s sVar, b bVar) {
        j.f(sVar, "workSpec");
        j.f(bVar, "state");
        o3.j a10 = o3.j.a();
        int i10 = a.f4000a;
        sVar.toString();
        a10.getClass();
        if (bVar instanceof b.C0193b) {
            synchronized (this.f3852f) {
                this.f3853n = true;
                ek.i iVar = ek.i.f20112a;
            }
        }
    }
}
