package f2;

import ek.i;
import rk.l;
import sk.k;

/* compiled from: SingleProcessDataStore.kt */
public final class q extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p<Object> f9863a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(p<Object> pVar) {
        super(1);
        this.f9863a = pVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            this.f9863a.f9816h.setValue(new i(th2));
        }
        Object obj2 = p.f9808l;
        p<Object> pVar = this.f9863a;
        synchronized (obj2) {
            p.f9807k.remove(pVar.d().getAbsolutePath());
        }
        return i.f20112a;
    }
}
