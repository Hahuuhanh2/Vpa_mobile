package androidx.lifecycle;

import al.i1;
import androidx.lifecycle.i;
import java.util.concurrent.CancellationException;
import r2.d;
import r2.f;

/* compiled from: LifecycleController.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i f2774a;

    /* renamed from: b  reason: collision with root package name */
    public final i.b f2775b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2776c;

    /* renamed from: d  reason: collision with root package name */
    public final f f2777d;

    public j(i iVar, i.b bVar, d dVar, i1 i1Var) {
        sk.j.f(iVar, "lifecycle");
        sk.j.f(bVar, "minState");
        sk.j.f(dVar, "dispatchQueue");
        this.f2774a = iVar;
        this.f2775b = bVar;
        this.f2776c = dVar;
        f fVar = new f(this, i1Var);
        this.f2777d = fVar;
        if (iVar.b() == i.b.DESTROYED) {
            i1Var.cancel((CancellationException) null);
            a();
            return;
        }
        iVar.a(fVar);
    }

    public final void a() {
        this.f2774a.c(this.f2777d);
        d dVar = this.f2776c;
        dVar.f14468b = true;
        dVar.a();
    }
}
