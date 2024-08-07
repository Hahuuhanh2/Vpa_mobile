package p6;

import android.util.SparseArray;
import c6.d;
import java.util.HashMap;

/* compiled from: PriorityMapping */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<d> f14079a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<d, Integer> f14080b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f14080b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f14080b.put(d.VERY_LOW, 1);
        f14080b.put(d.HIGHEST, 2);
        for (d next : f14080b.keySet()) {
            f14079a.append(f14080b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f14080b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f14079a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m("Unknown Priority for value ", i10));
    }
}
