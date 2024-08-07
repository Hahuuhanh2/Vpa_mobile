package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.x;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: DynamicRangeConversions */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f16820a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f16821b;

    static {
        HashMap hashMap = new HashMap();
        f16820a = hashMap;
        HashMap hashMap2 = new HashMap();
        f16821b = hashMap2;
        x xVar = x.f4367d;
        hashMap.put(1L, xVar);
        hashMap2.put(xVar, Collections.singletonList(1L));
        hashMap.put(2L, x.f4368e);
        hashMap2.put((x) hashMap.get(2L), Collections.singletonList(2L));
        x xVar2 = x.f4369f;
        hashMap.put(4L, xVar2);
        hashMap2.put(xVar2, Collections.singletonList(4L));
        x xVar3 = x.f4370g;
        hashMap.put(8L, xVar3);
        hashMap2.put(xVar3, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(new Long[]{64L, 128L, 16L, 32L});
        for (Long put : asList) {
            f16820a.put(put, x.f4371h);
        }
        f16821b.put(x.f4371h, asList);
        List<Long> asList2 = Arrays.asList(new Long[]{1024L, 2048L, 256L, 512L});
        for (Long put2 : asList2) {
            f16820a.put(put2, x.f4372i);
        }
        f16821b.put(x.f4372i, asList2);
    }

    public static Long a(x xVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f16821b.get(xVar);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static x b(long j10) {
        return (x) f16820a.get(Long.valueOf(j10));
    }
}
