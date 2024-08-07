package c0;

import f0.f0;
import f0.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: CameraSelector */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final p f4311b;

    /* renamed from: c  reason: collision with root package name */
    public static final p f4312c;

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashSet<n> f4313a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new f0(0));
        f4311b = new p(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new f0(1));
        f4312c = new p(linkedHashSet2);
    }

    public p(LinkedHashSet<n> linkedHashSet) {
        this.f4313a = linkedHashSet;
    }

    public final LinkedHashSet<r> a(LinkedHashSet<r> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        List b10 = b(arrayList);
        LinkedHashSet<r> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<r> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            r next = it2.next();
            if (b10.contains(next.a())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public final List b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<n> it = this.f4313a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().b(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer c() {
        Iterator<n> it = this.f4313a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            n next = it.next();
            if (next instanceof f0) {
                Integer valueOf = Integer.valueOf(((f0) next).f9532b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final void d(LinkedHashSet linkedHashSet) {
        Iterator<r> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            r next = it.next();
            return;
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
