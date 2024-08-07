package q;

import androidx.biometric.R$string;
import d.i;
import java.util.concurrent.Executor;
import q.l;
import q.n;
import r2.p;
import r2.q;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14184a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f14185b;

    public /* synthetic */ f(j jVar, int i10) {
        this.f14184a = i10;
        this.f14185b = jVar;
    }

    public final void b(Object obj) {
        switch (this.f14184a) {
            case 0:
                j jVar = this.f14185b;
                l.b bVar = (l.b) obj;
                int i10 = j.f14193g0;
                if (bVar != null) {
                    jVar.q0(bVar);
                    n nVar = jVar.f14194e0;
                    if (nVar.f14239s == null) {
                        nVar.f14239s = new p<>();
                    }
                    n.j(nVar.f14239s, null);
                    return;
                }
                jVar.getClass();
                return;
            default:
                j jVar2 = this.f14185b;
                int i11 = j.f14193g0;
                jVar2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    if (jVar2.m0()) {
                        jVar2.r0(jVar2.x(R$string.fingerprint_not_recognized));
                    }
                    n nVar2 = jVar2.f14194e0;
                    if (nVar2.f14234n) {
                        Executor executor = nVar2.f14224d;
                        if (executor == null) {
                            executor = new n.b();
                        }
                        executor.execute(new i(jVar2, 2));
                    }
                    n nVar3 = jVar2.f14194e0;
                    if (nVar3.f14242v == null) {
                        nVar3.f14242v = new p<>();
                    }
                    n.j(nVar3.f14242v, Boolean.FALSE);
                    return;
                }
                return;
        }
    }
}
