package androidx.lifecycle;

import a3.c;
import a3.e;
import androidx.lifecycle.i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import r2.v;
import r2.w;
import r2.x;
import sk.j;

/* compiled from: LegacySavedStateHandleController.kt */
public final class g {

    /* compiled from: LegacySavedStateHandleController.kt */
    public static final class a implements c.a {
        public final void a(e eVar) {
            j.f(eVar, "owner");
            if (eVar instanceof x) {
                w n10 = ((x) eVar).n();
                c q10 = eVar.q();
                n10.getClass();
                Iterator it = new HashSet(n10.f14500a.keySet()).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    j.f(str, "key");
                    v vVar = (v) n10.f14500a.get(str);
                    j.c(vVar);
                    g.a(vVar, q10, eVar.B());
                }
                if (!new HashSet(n10.f14500a.keySet()).isEmpty()) {
                    q10.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    public static final void a(v vVar, c cVar, i iVar) {
        Object obj;
        j.f(cVar, "registry");
        j.f(iVar, "lifecycle");
        HashMap hashMap = vVar.f14497a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = vVar.f14497a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        x xVar = (x) obj;
        if (xVar != null && !xVar.f2838c) {
            xVar.a(iVar, cVar);
            b(iVar, cVar);
        }
    }

    public static void b(i iVar, c cVar) {
        boolean z10;
        i.b b10 = iVar.b();
        if (b10 != i.b.INITIALIZED) {
            if (b10.compareTo(i.b.STARTED) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                iVar.a(new h(iVar, cVar));
                return;
            }
        }
        cVar.d();
    }
}
