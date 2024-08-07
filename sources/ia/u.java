package ia;

import ja.c;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController */
public final class u implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f11382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f11384c;

    public u(t tVar, long j10, String str) {
        this.f11384c = tVar;
        this.f11382a = j10;
        this.f11383b = str;
    }

    public final Object call() {
        boolean z10;
        f0 f0Var = this.f11384c.f11376n;
        if (f0Var == null || !f0Var.f11296e.get()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        c cVar = this.f11384c.f11371i;
        cVar.f11803b.c(this.f11382a, this.f11383b);
        return null;
    }
}
