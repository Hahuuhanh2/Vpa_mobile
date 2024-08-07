package h5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import k5.d;
import o5.l;

/* compiled from: RequestTracker */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Set<d> f10576a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f10577b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f10578c;

    public final boolean a(d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f10576a.remove(dVar);
        if (!this.f10577b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public final void b() {
        Iterator it = l.e(this.f10576a).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!dVar.j() && !dVar.f()) {
                dVar.clear();
                if (!this.f10578c) {
                    dVar.i();
                } else {
                    this.f10577b.add(dVar);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f10576a.size() + ", isPaused=" + this.f10578c + "}";
    }
}
