package k6;

import dk.a;
import h6.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import l6.c;
import l6.e;
import o6.b;

/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class d implements b<e> {

    /* renamed from: a  reason: collision with root package name */
    public final a<o6.a> f12044a = b.a.f13758a;

    public final Object get() {
        o6.a aVar = this.f12044a.get();
        HashMap hashMap = new HashMap();
        c6.d dVar = c6.d.DEFAULT;
        c.a aVar2 = new c.a();
        Set<e.b> emptySet = Collections.emptySet();
        if (emptySet != null) {
            aVar2.f12721c = emptySet;
            aVar2.f12719a = 30000L;
            aVar2.f12720b = 86400000L;
            hashMap.put(dVar, aVar2.a());
            c6.d dVar2 = c6.d.HIGHEST;
            c.a aVar3 = new c.a();
            Set<e.b> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                aVar3.f12721c = emptySet2;
                aVar3.f12719a = 1000L;
                aVar3.f12720b = 86400000L;
                hashMap.put(dVar2, aVar3.a());
                c6.d dVar3 = c6.d.VERY_LOW;
                c.a aVar4 = new c.a();
                Set<e.b> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    aVar4.f12721c = emptySet3;
                    aVar4.f12719a = 86400000L;
                    aVar4.f12720b = 86400000L;
                    Set<e.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new e.b[]{e.b.DEVICE_IDLE})));
                    if (unmodifiableSet != null) {
                        aVar4.f12721c = unmodifiableSet;
                        hashMap.put(dVar3, aVar4.a());
                        if (aVar == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= c6.d.values().length) {
                            new HashMap();
                            return new l6.b(aVar, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}
