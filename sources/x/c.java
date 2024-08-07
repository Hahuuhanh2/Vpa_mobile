package x;

import al.g0;
import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.x;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x.b;

/* compiled from: DynamicRangesCompatApi33Impl */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final DynamicRangeProfiles f16823a;

    public c(Object obj) {
        this.f16823a = (DynamicRangeProfiles) obj;
    }

    public static Set<x> d(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        for (Long longValue : set) {
            long longValue2 = longValue.longValue();
            x b10 = a.b(longValue2);
            g0.D(b10, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue2);
            hashSet.add(b10);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final DynamicRangeProfiles a() {
        return this.f16823a;
    }

    public final Set<x> b() {
        return d(this.f16823a.getSupportedProfiles());
    }

    public final Set<x> c(x xVar) {
        boolean z10;
        Long a10 = a.a(xVar, this.f16823a);
        if (a10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y("DynamicRange is not supported: " + xVar, z10);
        return d(this.f16823a.getProfileCaptureRequestConstraints(a10.longValue()));
    }
}
