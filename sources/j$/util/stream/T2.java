package j$.util.stream;

import j$.util.C0407m;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

enum T2 {
    DISTINCT(0, r2),
    SORTED(1, r7),
    ORDERED(2, r8),
    SIZED(3, r13),
    SHORT_CIRCUIT(12, r14);
    

    /* renamed from: f  reason: collision with root package name */
    static final int f18691f = 0;

    /* renamed from: g  reason: collision with root package name */
    static final int f18692g = 0;

    /* renamed from: h  reason: collision with root package name */
    static final int f18693h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static final int f18694i = 0;

    /* renamed from: j  reason: collision with root package name */
    private static final int f18695j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static final int f18696k = 0;

    /* renamed from: l  reason: collision with root package name */
    static final int f18697l = 0;

    /* renamed from: m  reason: collision with root package name */
    static final int f18698m = 0;

    /* renamed from: n  reason: collision with root package name */
    static final int f18699n = 0;

    /* renamed from: o  reason: collision with root package name */
    static final int f18700o = 0;

    /* renamed from: p  reason: collision with root package name */
    static final int f18701p = 0;

    /* renamed from: q  reason: collision with root package name */
    static final int f18702q = 0;

    /* renamed from: r  reason: collision with root package name */
    static final int f18703r = 0;

    /* renamed from: s  reason: collision with root package name */
    static final int f18704s = 0;

    /* renamed from: t  reason: collision with root package name */
    static final int f18705t = 0;

    /* renamed from: u  reason: collision with root package name */
    static final int f18706u = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Map f18708a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18709b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18710c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18711d;

    /* renamed from: e  reason: collision with root package name */
    private final int f18712e;

    static {
        S2 s22;
        S2 s23;
        S2 s24;
        int i10;
        S2 s25;
        S2 s26;
        f18691f = n(s22);
        f18692g = n(s23);
        f18693h = n(s24);
        n(s25);
        n(s26);
        int i11 = 0;
        for (T2 t22 : values()) {
            i11 |= t22.f18712e;
        }
        f18694i = i11;
        int i12 = f18692g;
        f18695j = i12;
        int i13 = i12 << 1;
        f18696k = i13;
        f18697l = i12 | i13;
        T2 t23 = DISTINCT;
        f18698m = t23.f18710c;
        f18699n = t23.f18711d;
        T2 t24 = SORTED;
        f18700o = t24.f18710c;
        f18701p = t24.f18711d;
        T2 t25 = ORDERED;
        f18702q = t25.f18710c;
        f18703r = t25.f18711d;
        T2 t26 = SIZED;
        f18704s = t26.f18710c;
        f18705t = t26.f18711d;
        f18706u = SHORT_CIRCUIT.f18710c;
    }

    private T2(int i10, R2 r22) {
        for (S2 q10 : S2.values()) {
            C0407m.q(r22.f18684a, q10, 0);
        }
        this.f18708a = r22.f18684a;
        int i11 = i10 * 2;
        this.f18709b = i11;
        this.f18710c = 1 << i11;
        this.f18711d = 2 << i11;
        this.f18712e = 3 << i11;
    }

    private static R2 R(S2 s22) {
        R2 r22 = new R2(new EnumMap(S2.class));
        r22.a(s22);
        return r22;
    }

    static int U(int i10) {
        return i10 & ((~i10) >> 1) & f18695j;
    }

    static int m(int i10, int i11) {
        return i10 | (i11 & (i10 == 0 ? f18694i : ~(((f18695j & i10) << 1) | i10 | ((f18696k & i10) >> 1))));
    }

    private static int n(S2 s22) {
        int i10 = 0;
        for (T2 t22 : values()) {
            i10 |= ((Integer) t22.f18708a.get(s22)).intValue() << t22.f18709b;
        }
        return i10;
    }

    static int o(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        return ((characteristics & 4) == 0 || spliterator.getComparator() == null) ? f18691f & characteristics : f18691f & characteristics & -5;
    }

    /* access modifiers changed from: package-private */
    public final boolean K(int i10) {
        int i11 = this.f18712e;
        return (i10 & i11) == i11;
    }

    /* access modifiers changed from: package-private */
    public final boolean t(int i10) {
        return (i10 & this.f18712e) == this.f18710c;
    }
}
