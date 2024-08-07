package j$.time.temporal;

import j$.time.b;
import j$.time.e;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    static final m f18268a = new m(1);

    /* renamed from: b  reason: collision with root package name */
    static final m f18269b = new m(2);

    /* renamed from: c  reason: collision with root package name */
    static final m f18270c = new m(3);

    /* renamed from: d  reason: collision with root package name */
    static final m f18271d = new m(4);

    /* renamed from: e  reason: collision with root package name */
    static final m f18272e = new m(5);

    /* renamed from: f  reason: collision with root package name */
    static final m f18273f = new m(6);

    /* renamed from: g  reason: collision with root package name */
    static final m f18274g = new m(7);

    public static int a(j jVar, o oVar) {
        s o10 = jVar.o(oVar);
        if (o10.h()) {
            long h10 = jVar.h(oVar);
            if (o10.i(h10)) {
                return (int) h10;
            }
            throw new e("Invalid value for " + oVar + " (valid values " + o10 + "): " + h10);
        }
        throw new r("Invalid field " + oVar + " for get() method, use getLong() instead");
    }

    public static Temporal b(Temporal temporal, long j10, ChronoUnit chronoUnit) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            temporal = temporal.d(Long.MAX_VALUE, chronoUnit);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return temporal.d(j11, chronoUnit);
    }

    public static Object c(j jVar, p pVar) {
        if (pVar == f18268a || pVar == f18269b || pVar == f18270c) {
            return null;
        }
        return pVar.h(jVar);
    }

    public static s d(j jVar, o oVar) {
        if (oVar instanceof a) {
            if (jVar.e(oVar)) {
                return oVar.o();
            }
            throw new r(b.a("Unsupported field: ", oVar));
        } else if (oVar != null) {
            return oVar.n(jVar);
        } else {
            throw new NullPointerException("field");
        }
    }

    public static m e() {
        return f18269b;
    }

    public static m f() {
        return f18273f;
    }

    public static m g() {
        return f18274g;
    }

    public static /* synthetic */ int h(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return 0;
        }
        return (((i10 ^ 7) >> 31) | 1) > 0 ? i11 : i11 + 7;
    }

    public static m i() {
        return f18271d;
    }

    public static m j() {
        return f18270c;
    }

    public static m k() {
        return f18272e;
    }

    public static m l() {
        return f18268a;
    }
}
