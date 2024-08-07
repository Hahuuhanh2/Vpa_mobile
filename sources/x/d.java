package x;

import al.g0;
import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.x;
import java.util.Collections;
import java.util.Set;
import x.b;

/* compiled from: DynamicRangesCompatBaseImpl */
public final class d implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16824a = new b(new d());

    /* renamed from: b  reason: collision with root package name */
    public static final Set<x> f16825b = Collections.singleton(x.f4367d);

    public final DynamicRangeProfiles a() {
        return null;
    }

    public final Set<x> b() {
        return f16825b;
    }

    public final Set<x> c(x xVar) {
        boolean equals = x.f4367d.equals(xVar);
        g0.y("DynamicRange is not supported: " + xVar, equals);
        return f16825b;
    }
}
