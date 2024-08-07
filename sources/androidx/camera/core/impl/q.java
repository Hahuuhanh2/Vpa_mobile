package androidx.camera.core.impl;

import android.support.v4.media.a;
import android.util.ArrayMap;
import androidx.camera.core.impl.i;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: MutableOptionsBundle */
public final class q extends r implements p {
    public q(TreeMap<i.a<?>, Map<i.b, Object>> treeMap) {
        super(treeMap);
    }

    public static q L() {
        return new q(new TreeMap(r.F));
    }

    public static q M(i iVar) {
        TreeMap treeMap = new TreeMap(r.F);
        for (i.a next : iVar.d()) {
            Set<i.b> w9 = iVar.w(next);
            ArrayMap arrayMap = new ArrayMap();
            for (i.b next2 : w9) {
                arrayMap.put(next2, iVar.n(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new q(treeMap);
    }

    public final <ValueT> void N(i.a<ValueT> aVar, i.b bVar, ValueT valuet) {
        i.b bVar2;
        Map map = this.E.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.E.put(aVar, arrayMap);
            arrayMap.put(bVar, valuet);
            return;
        }
        i.b bVar3 = (i.b) Collections.min(map.keySet());
        if (!Objects.equals(map.get(bVar3), valuet)) {
            i.b bVar4 = i.b.ALWAYS_OVERRIDE;
            boolean z10 = true;
            if (!((bVar3 == bVar4 && bVar == bVar4) || (bVar3 == (bVar2 = i.b.REQUIRED) && bVar == bVar2))) {
                z10 = false;
            }
            if (z10) {
                StringBuilder q10 = a.q("Option values conflicts: ");
                q10.append(aVar.b());
                q10.append(", existing value (");
                q10.append(bVar3);
                q10.append(")=");
                q10.append(map.get(bVar3));
                q10.append(", conflicting (");
                q10.append(bVar);
                q10.append(")=");
                q10.append(valuet);
                throw new IllegalArgumentException(q10.toString());
            }
        }
        map.put(bVar, valuet);
    }

    public final <ValueT> void O(i.a<ValueT> aVar, ValueT valuet) {
        N(aVar, i.b.OPTIONAL, valuet);
    }
}
