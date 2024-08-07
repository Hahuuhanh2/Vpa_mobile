package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.i;
import b0.e;
import b0.f;
import f0.k0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: OptionsBundle */
public class r implements i {
    public static final k0 F;
    public static final r G;
    public final TreeMap<i.a<?>, Map<i.b, Object>> E;

    static {
        k0 k0Var = new k0(0);
        F = k0Var;
        G = new r(new TreeMap(k0Var));
    }

    public r(TreeMap<i.a<?>, Map<i.b, Object>> treeMap) {
        this.E = treeMap;
    }

    public static r K(p pVar) {
        if (r.class.equals(pVar.getClass())) {
            return (r) pVar;
        }
        TreeMap treeMap = new TreeMap(F);
        r rVar = (r) pVar;
        for (i.a next : rVar.d()) {
            Set<i.b> w9 = rVar.w(next);
            ArrayMap arrayMap = new ArrayMap();
            for (i.b next2 : w9) {
                arrayMap.put(next2, rVar.n(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new r(treeMap);
    }

    public final <ValueT> ValueT a(i.a<ValueT> aVar) {
        Map map = this.E.get(aVar);
        if (map != null) {
            return map.get((i.b) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    public final boolean c(i.a<?> aVar) {
        return this.E.containsKey(aVar);
    }

    public final Set<i.a<?>> d() {
        return Collections.unmodifiableSet(this.E.keySet());
    }

    public final <ValueT> ValueT e(i.a<ValueT> aVar, ValueT valuet) {
        try {
            return a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    public final void f(e eVar) {
        for (Map.Entry next : this.E.tailMap(i.a.a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (((i.a) next.getKey()).b().startsWith("camera2.captureRequest.option.")) {
                i.a aVar = (i.a) next.getKey();
                i iVar = (i) eVar.f3873c;
                ((f.a) eVar.f3872b).f3874a.N(aVar, iVar.v(aVar), iVar.a(aVar));
            } else {
                return;
            }
        }
    }

    public final <ValueT> ValueT n(i.a<ValueT> aVar, i.b bVar) {
        Map map = this.E.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(bVar)) {
            return map.get(bVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + bVar);
        }
    }

    public final i.b v(i.a<?> aVar) {
        Map map = this.E.get(aVar);
        if (map != null) {
            return (i.b) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    public final Set<i.b> w(i.a<?> aVar) {
        Map map = this.E.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }
}
