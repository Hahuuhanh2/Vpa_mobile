package y3;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p3.j0;
import p3.v;

/* compiled from: CancelWorkRunnable */
public final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j0 f17391b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ UUID f17392c;

    public b(j0 j0Var, UUID uuid) {
        this.f17391b = j0Var;
        this.f17392c = uuid;
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        WorkDatabase workDatabase = this.f17391b.f13939c;
        workDatabase.c();
        try {
            d.a(this.f17391b, this.f17392c.toString());
            workDatabase.n();
            workDatabase.j();
            j0 j0Var = this.f17391b;
            v.b(j0Var.f13938b, j0Var.f13939c, j0Var.f13941e);
        } catch (Throwable th2) {
            workDatabase.j();
            throw th2;
        }
    }
}
