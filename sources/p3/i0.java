package p3;

import a4.b;
import androidx.work.WorkerParameters;
import sk.j;
import y3.q;
import y3.r;

/* compiled from: WorkLauncher.kt */
public final class i0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final r f13931a;

    /* renamed from: b  reason: collision with root package name */
    public final b f13932b;

    public i0(r rVar, b bVar) {
        j.f(rVar, "processor");
        j.f(bVar, "workTaskExecutor");
        this.f13931a = rVar;
        this.f13932b = bVar;
    }

    public final void a(w wVar, int i10) {
        j.f(wVar, "workSpecId");
        this.f13932b.d(new r(this.f13931a, wVar, false, i10));
    }

    public final void b(w wVar, int i10) {
        a(wVar, i10);
    }

    public final void c(w wVar) {
        this.f13932b.d(new q(this.f13931a, wVar, (WorkerParameters.a) null));
    }

    public final void d(w wVar) {
        j.f(wVar, "workSpecId");
        a(wVar, -512);
    }
}
