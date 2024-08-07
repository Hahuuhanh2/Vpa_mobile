package v4;

import java.util.ArrayList;
import java.util.HashMap;
import v4.k;

/* compiled from: GroupedLinkedMap */
public final class f<K extends k, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f16035a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f16036b = new HashMap();

    /* compiled from: GroupedLinkedMap */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f16037a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f16038b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f16039c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f16040d;

        public a() {
            this((Object) null);
        }

        public a(K k10) {
            this.f16040d = this;
            this.f16039c = this;
            this.f16037a = k10;
        }
    }

    public final V a(K k10) {
        int i10;
        a<K, V> aVar = (a) this.f16036b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f16036b.put(k10, aVar);
        } else {
            k10.a();
        }
        a<K, V> aVar2 = aVar.f16040d;
        aVar2.f16039c = aVar.f16039c;
        aVar.f16039c.f16040d = aVar2;
        a<K, V> aVar3 = this.f16035a;
        aVar.f16040d = aVar3;
        a<K, V> aVar4 = aVar3.f16039c;
        aVar.f16039c = aVar4;
        aVar4.f16040d = aVar;
        aVar.f16040d.f16039c = aVar;
        ArrayList arrayList = aVar.f16038b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return aVar.f16038b.remove(i10 - 1);
        }
        return null;
    }

    public final void b(K k10, V v2) {
        a<K, V> aVar = (a) this.f16036b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            a<K, V> aVar2 = aVar.f16040d;
            aVar2.f16039c = aVar.f16039c;
            aVar.f16039c.f16040d = aVar2;
            a<K, V> aVar3 = this.f16035a;
            aVar.f16040d = aVar3.f16040d;
            aVar.f16039c = aVar3;
            aVar3.f16040d = aVar;
            aVar.f16040d.f16039c = aVar;
            this.f16036b.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f16038b == null) {
            aVar.f16038b = new ArrayList();
        }
        aVar.f16038b.add(v2);
    }

    public final V c() {
        int i10;
        a<K, V> aVar = this.f16035a.f16040d;
        while (true) {
            V v2 = null;
            if (aVar.equals(this.f16035a)) {
                return null;
            }
            ArrayList arrayList = aVar.f16038b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                v2 = aVar.f16038b.remove(i10 - 1);
            }
            if (v2 != null) {
                return v2;
            }
            a<K, V> aVar2 = aVar.f16040d;
            aVar2.f16039c = aVar.f16039c;
            aVar.f16039c.f16040d = aVar2;
            this.f16036b.remove(aVar.f16037a);
            ((k) aVar.f16037a).a();
            aVar = aVar.f16040d;
        }
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a<K, V> aVar = this.f16035a.f16039c; !aVar.equals(this.f16035a); aVar = aVar.f16039c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f16037a);
            sb2.append(':');
            ArrayList arrayList = aVar.f16038b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            sb2.append(i10);
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
