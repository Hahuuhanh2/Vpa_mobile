package y3;

import androidx.work.impl.WorkDatabase;
import p3.j0;
import p3.v;

/* compiled from: CancelWorkRunnable */
public final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j0 f17393b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f17394c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f17395d = false;

    public c(j0 j0Var, String str) {
        this.f17393b = j0Var;
        this.f17394c = str;
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        WorkDatabase workDatabase = this.f17393b.f13939c;
        workDatabase.c();
        try {
            for (String a10 : workDatabase.u().q(this.f17394c)) {
                d.a(this.f17393b, a10);
            }
            workDatabase.n();
            workDatabase.j();
            if (this.f17395d) {
                j0 j0Var = this.f17393b;
                v.b(j0Var.f13938b, j0Var.f13939c, j0Var.f13941e);
            }
        } catch (Throwable th2) {
            workDatabase.j();
            throw th2;
        }
    }
}
