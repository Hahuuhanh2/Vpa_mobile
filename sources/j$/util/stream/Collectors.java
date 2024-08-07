package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public final class Collectors {

    /* renamed from: a  reason: collision with root package name */
    static final Set f18590a;

    static {
        C0453j jVar = C0453j.CONCURRENT;
        C0453j jVar2 = C0453j.UNORDERED;
        C0453j jVar3 = C0453j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(jVar, jVar2, jVar3));
        Collections.unmodifiableSet(EnumSet.of(jVar, jVar2));
        f18590a = Collections.unmodifiableSet(EnumSet.of(jVar3));
        Collections.unmodifiableSet(EnumSet.of(jVar2, jVar3));
        Collections.emptySet();
    }

    static void a(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0465m(new J0(16), new J0(17), new C0418b(2), f18590a);
    }
}
