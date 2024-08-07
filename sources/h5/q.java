package h5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import l5.g;
import o5.l;

/* compiled from: TargetTracker */
public final class q implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Set<g<?>> f10605a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        Iterator it = l.e(this.f10605a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
    }

    public final void b() {
        Iterator it = l.e(this.f10605a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).b();
        }
    }

    public final void f() {
        Iterator it = l.e(this.f10605a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).f();
        }
    }
}
