package androidx.lifecycle;

import androidx.lifecycle.f0;
import dj.c;
import dj.d;
import java.util.LinkedHashSet;
import ng.i;
import ng.r;
import p3.l0;
import r2.v;
import s2.b;

/* compiled from: AbstractSavedStateViewModelFactory.kt */
public abstract class a extends f0.d implements f0.b {
    public final <T extends v> T a(Class<T> cls) {
        if (cls.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final v b(Class cls, b bVar) {
        if (((String) bVar.f14601a.get(g0.f2763a)) != null) {
            y.a(bVar);
            d dVar = new d();
            i iVar = (i) ((c.a) this).f19949a;
            iVar.getClass();
            iVar.getClass();
            iVar.getClass();
            dk.a aVar = (dk.a) ((c.b) l0.X(c.b.class, new r(iVar.f21572a, iVar.f21573b))).a().get(cls.getName());
            if (aVar != null) {
                v vVar = (v) aVar.get();
                dj.b bVar2 = new dj.b(dVar);
                if (vVar.f14499c) {
                    v.a(bVar2);
                } else {
                    LinkedHashSet linkedHashSet = vVar.f14498b;
                    if (linkedHashSet != null) {
                        synchronized (linkedHashSet) {
                            vVar.f14498b.add(bVar2);
                        }
                    }
                }
                return vVar;
            }
            StringBuilder q10 = android.support.v4.media.a.q("Expected the @HiltViewModel-annotated class '");
            q10.append(cls.getName());
            q10.append("' to be available in the multi-binding of @HiltViewModelMap but none was found.");
            throw new IllegalStateException(q10.toString());
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final void c(v vVar) {
    }
}
