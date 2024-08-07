package ca;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CycleDetector */
public final class l {

    /* compiled from: CycleDetector */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f4639a;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f4640b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f4641c = new HashSet();

        public a(b<?> bVar) {
            this.f4639a = bVar;
        }
    }

    /* compiled from: CycleDetector */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final r<?> f4642a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4643b;

        public b() {
            throw null;
        }

        public b(r rVar, boolean z10) {
            this.f4642a = rVar;
            this.f4643b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.f4642a.equals(this.f4642a) || bVar.f4643b != this.f4643b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((this.f4642a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f4643b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                b bVar = (b) it.next();
                a aVar = new a(bVar);
                Iterator<r<? super T>> it2 = bVar.f4608b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        r next = it2.next();
                        if (bVar.f4611e == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z13 = !z12;
                        b bVar2 = new b(next, z13);
                        if (!hashMap.containsKey(bVar2)) {
                            hashMap.put(bVar2, new HashSet());
                        }
                        Set set = (Set) hashMap.get(bVar2);
                        if (set.isEmpty() || z13) {
                            set.add(aVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                        }
                    }
                }
            } else {
                for (Set<a> it3 : hashMap.values()) {
                    for (a aVar2 : it3) {
                        for (m next2 : aVar2.f4639a.f4609c) {
                            if (next2.f4646c == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                r<?> rVar = next2.f4644a;
                                if (next2.f4645b == 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                Set<a> set2 = (Set) hashMap.get(new b(rVar, z11));
                                if (set2 != null) {
                                    for (a aVar3 : set2) {
                                        aVar2.f4640b.add(aVar3);
                                        aVar3.f4641c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a aVar4 = (a) it4.next();
                    if (aVar4.f4641c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar5 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i10++;
                    Iterator it5 = aVar5.f4640b.iterator();
                    while (it5.hasNext()) {
                        a aVar6 = (a) it5.next();
                        aVar6.f4641c.remove(aVar5);
                        if (aVar6.f4641c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i10 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        a aVar7 = (a) it6.next();
                        if (!aVar7.f4641c.isEmpty() && !aVar7.f4640b.isEmpty()) {
                            arrayList2.add(aVar7.f4639a);
                        }
                    }
                    throw new DependencyCycleException(arrayList2);
                }
                return;
            }
        }
    }
}
