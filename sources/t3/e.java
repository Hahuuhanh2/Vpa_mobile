package t3;

import fk.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rk.l;
import sk.j;
import sk.k;
import u3.b;
import u3.d;
import u3.f;
import u3.g;
import u3.h;
import u3.i;
import x3.s;

/* compiled from: WorkConstraintsTracker.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<d<?>> f14809a;

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a extends k implements l<d<?>, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14810a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            d dVar = (d) obj;
            j.f(dVar, "it");
            return dVar.getClass().getSimpleName();
        }
    }

    public e(v3.l lVar) {
        j.f(lVar, "trackers");
        this.f14809a = j7.a.d0(new u3.a(lVar.f16031a), new b(lVar.f16032b), new i(lVar.f16034d), new u3.e(lVar.f16033c), new h(lVar.f16033c), new g(lVar.f16033c), new f(lVar.f16033c));
    }

    public final boolean a(s sVar) {
        List<d<?>> list = this.f14809a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            d dVar = (d) next;
            dVar.getClass();
            if (!dVar.b(sVar) || !dVar.c(dVar.f15086a.a())) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            o3.j a10 = o3.j.a();
            int i10 = h.f14822a;
            p.Q0(arrayList, (String) null, (String) null, (String) null, a.f14810a, 31);
            a10.getClass();
        }
        return arrayList.isEmpty();
    }
}
