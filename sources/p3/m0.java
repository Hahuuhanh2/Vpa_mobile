package p3;

import o3.j;
import v8.a;
import z3.a;
import z3.c;

/* compiled from: WorkerWrapper */
public final class m0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f13970a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o0 f13971b;

    public m0(o0 o0Var, c cVar) {
        this.f13971b = o0Var;
        this.f13970a = cVar;
    }

    public final void run() {
        if (!(this.f13971b.f13992w.f17841a instanceof a.b)) {
            try {
                this.f13970a.get();
                j a10 = j.a();
                int i10 = o0.f13976y;
                String str = this.f13971b.f13979c.f17021c;
                a10.getClass();
                o0 o0Var = this.f13971b;
                o0Var.f13992w.k(o0Var.f13980d.c());
            } catch (Throwable th2) {
                this.f13971b.f13992w.j(th2);
            }
        }
    }
}
