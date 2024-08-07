package f2;

import cl.i;
import ek.i;
import rk.l;
import rk.p;
import sk.k;

/* compiled from: SimpleActor.kt */
public final class m extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l<Throwable, i> f9797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o<Object> f9798b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<Object, Throwable, i> f9799c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(q qVar, o oVar, r rVar) {
        super(1);
        this.f9797a = qVar;
        this.f9798b = oVar;
        this.f9799c = rVar;
    }

    public final Object invoke(Object obj) {
        i iVar;
        Throwable th2 = (Throwable) obj;
        this.f9797a.invoke(th2);
        this.f9798b.f9805c.c(th2);
        do {
            Object b10 = this.f9798b.f9805c.b();
            iVar = null;
            if (b10 instanceof i.b) {
                b10 = null;
            }
            if (b10 != null) {
                this.f9799c.invoke(b10, th2);
                iVar = ek.i.f20112a;
                continue;
            }
        } while (iVar != null);
        return ek.i.f20112a;
    }
}
