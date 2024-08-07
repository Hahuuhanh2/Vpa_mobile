package f2;

import ek.i;
import f2.p;
import java.util.concurrent.CancellationException;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: SingleProcessDataStore.kt */
public final class r extends k implements p<p.a<Object>, Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f9864a = new r();

    public r() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        p.a aVar = (p.a) obj;
        Throwable th2 = (Throwable) obj2;
        j.f(aVar, "msg");
        if (aVar instanceof p.a.b) {
            al.r<T> rVar = ((p.a.b) aVar).f9821b;
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            rVar.z(th2);
        }
        return i.f20112a;
    }
}
