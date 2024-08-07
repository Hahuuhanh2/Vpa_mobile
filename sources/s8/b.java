package s8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class b extends b0 {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ IBinder f14659n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f14660o;

    public b(d dVar, IBinder iBinder) {
        this.f14660o = dVar;
        this.f14659n = iBinder;
    }

    public final void b() {
        e eVar = this.f14660o.f14665a;
        eVar.f14682n = (IInterface) this.f14660o.f14665a.f14677i.a(this.f14659n);
        eVar.f14670b.b("linkToDeath", new Object[0]);
        try {
            eVar.f14682n.asBinder().linkToDeath(eVar.f14679k, 0);
        } catch (RemoteException e10) {
            eVar.f14670b.a("linkToDeath failed", e10, new Object[0]);
        }
        e eVar2 = this.f14660o.f14665a;
        eVar2.f14675g = false;
        Iterator it = eVar2.f14672d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f14660o.f14665a.f14672d.clear();
    }
}
