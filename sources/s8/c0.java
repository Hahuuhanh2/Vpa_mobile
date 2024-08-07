package s8;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final /* synthetic */ class c0 implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f14664a;

    public /* synthetic */ c0(e eVar) {
        this.f14664a = eVar;
    }

    public final void binderDied() {
        e eVar = this.f14664a;
        eVar.f14670b.b("reportBinderDeath", new Object[0]);
        f0 f0Var = (f0) eVar.f14678j.get();
        if (f0Var != null) {
            eVar.f14670b.b("calling onBinderDied", new Object[0]);
            f0Var.a();
        } else {
            eVar.f14670b.b("%s : Binder has died.", eVar.f14671c);
            Iterator it = eVar.f14672d.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(new RemoteException(String.valueOf(eVar.f14671c).concat(" : Binder has died.")));
            }
            eVar.f14672d.clear();
        }
        synchronized (eVar.f14674f) {
            eVar.e();
        }
    }
}
