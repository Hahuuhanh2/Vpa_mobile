package ea;

import ia.b0;
import ia.l;
import ia.m;
import ia.t;
import ia.v;

/* compiled from: FirebaseCrashlytics */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f9334a;

    public e(b0 b0Var) {
        this.f9334a = b0Var;
    }

    public final void a(Exception exc) {
        t tVar = this.f9334a.f11267g;
        Thread currentThread = Thread.currentThread();
        tVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = tVar.f11367e;
        v vVar = new v(tVar, currentTimeMillis, exc, currentThread);
        lVar.getClass();
        lVar.a(new m(vVar));
    }
}
