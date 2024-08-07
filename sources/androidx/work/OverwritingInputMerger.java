package androidx.work;

import androidx.work.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o3.f;
import sk.j;

/* compiled from: OverwritingInputMerger.kt */
public final class OverwritingInputMerger extends f {
    public final c a(ArrayList arrayList) {
        c.a aVar = new c.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((c) it.next()).f3754a);
            j.e(unmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(unmodifiableMap);
        }
        aVar.a(linkedHashMap);
        c cVar = new c(aVar.f3755a);
        c.b(cVar);
        return cVar;
    }
}
