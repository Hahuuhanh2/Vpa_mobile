package ub;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher */
public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f15424a;

    /* renamed from: b  reason: collision with root package name */
    public final c f15425b;

    public b(Set<d> set, c cVar) {
        this.f15424a = b(set);
        this.f15425b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f15425b;
        synchronized (cVar.f15427a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f15427a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f15424a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15424a);
        sb2.append(' ');
        c cVar2 = this.f15425b;
        synchronized (cVar2.f15427a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar2.f15427a);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
