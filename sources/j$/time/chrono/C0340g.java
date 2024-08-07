package j$.time.chrono;

import j$.time.b;
import j$.time.r;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g  reason: case insensitive filesystem */
abstract class C0340g implements ChronoLocalDate, Temporal, k, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    C0340g() {
    }

    static ChronoLocalDate R(o oVar, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        C0337d dVar = (C0337d) oVar;
        if (dVar.equals(chronoLocalDate.a())) {
            return chronoLocalDate;
        }
        StringBuilder b10 = b.b("Chronology mismatch, expected: ");
        b10.append(dVar.l());
        b10.append(", actual: ");
        b10.append(chronoLocalDate.a().l());
        throw new ClassCastException(b10.toString());
    }

    private long U(ChronoLocalDate chronoLocalDate) {
        if (a().w(a.MONTH_OF_YEAR).d() == 12) {
            a aVar = a.PROLEPTIC_MONTH;
            a aVar2 = a.DAY_OF_MONTH;
            return (((chronoLocalDate.h(aVar) * 32) + ((long) chronoLocalDate.m(aVar2))) - ((h(aVar) * 32) + ((long) n.a(this, aVar2)))) / 32;
        }
        throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
    }

    public ChronoLocalDate C(r rVar) {
        return R(a(), rVar.a(this));
    }

    /* renamed from: E */
    public ChronoLocalDate n(k kVar) {
        return R(a(), kVar.t(this));
    }

    public long I() {
        return h(a.EPOCH_DAY);
    }

    public C0341h J(j$.time.k kVar) {
        return C0343j.V(this, kVar);
    }

    public final /* synthetic */ Object K(p pVar) {
        return C0338e.l(this, pVar);
    }

    public p M() {
        return a().z(m(a.ERA));
    }

    public int Q() {
        return v() ? 366 : 365;
    }

    /* access modifiers changed from: package-private */
    public abstract ChronoLocalDate V(long j10);

    /* access modifiers changed from: package-private */
    public abstract ChronoLocalDate W(long j10);

    /* access modifiers changed from: package-private */
    public abstract ChronoLocalDate X(long j10);

    public ChronoLocalDate c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return R(a(), oVar.R(this, j10));
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", oVar));
    }

    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return C0338e.d(this, chronoLocalDate);
    }

    public ChronoLocalDate d(long j10, q qVar) {
        boolean z10 = qVar instanceof ChronoUnit;
        if (z10) {
            switch (C0339f.f18067a[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    return V(j10);
                case 2:
                    return V(j$.time.a.f(j10, (long) 7));
                case 3:
                    return W(j10);
                case 4:
                    return X(j10);
                case 5:
                    return X(j$.time.a.f(j10, (long) 10));
                case 6:
                    return X(j$.time.a.f(j10, (long) 100));
                case 7:
                    return X(j$.time.a.f(j10, (long) 1000));
                case 8:
                    a aVar = a.ERA;
                    return c(j$.time.a.d(h(aVar), j10), (o) aVar);
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        } else if (!z10) {
            return R(a(), qVar.m(this, j10));
        } else {
            throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public /* synthetic */ boolean e(o oVar) {
        return C0338e.j(this, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChronoLocalDate) {
            return C0338e.d(this, (ChronoLocalDate) obj) == 0;
        }
        return false;
    }

    public ChronoLocalDate g(long j10, ChronoUnit chronoUnit) {
        return R(a(), n.b(this, j10, chronoUnit));
    }

    public int hashCode() {
        long I = I();
        return ((int) (I ^ (I >>> 32))) ^ ((C0337d) a()).hashCode();
    }

    public long i(Temporal temporal, q qVar) {
        long j10;
        long j11;
        if (temporal != null) {
            ChronoLocalDate G = a().G(temporal);
            if (qVar instanceof ChronoUnit) {
                switch (C0339f.f18067a[((ChronoUnit) qVar).ordinal()]) {
                    case 1:
                        return G.I() - I();
                    case 2:
                        j10 = G.I() - I();
                        j11 = 7;
                        break;
                    case 3:
                        return U(G);
                    case 4:
                        j10 = U(G);
                        j11 = 12;
                        break;
                    case 5:
                        j10 = U(G);
                        j11 = 120;
                        break;
                    case 6:
                        j10 = U(G);
                        j11 = 1200;
                        break;
                    case 7:
                        j10 = U(G);
                        j11 = 12000;
                        break;
                    case 8:
                        a aVar = a.ERA;
                        return G.h(aVar) - h(aVar);
                    default:
                        throw new j$.time.temporal.r("Unsupported unit: " + qVar);
                }
                return j10 / j11;
            } else if (qVar != null) {
                return qVar.between(this, G);
            } else {
                throw new NullPointerException("unit");
            }
        } else {
            throw new NullPointerException("endExclusive");
        }
    }

    public final /* synthetic */ int m(o oVar) {
        return n.a(this, oVar);
    }

    public /* synthetic */ s o(o oVar) {
        return n.d(this, oVar);
    }

    public final /* synthetic */ Temporal t(Temporal temporal) {
        return C0338e.a(this, temporal);
    }

    public String toString() {
        long h10 = h(a.YEAR_OF_ERA);
        long h11 = h(a.MONTH_OF_YEAR);
        long h12 = h(a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(((C0337d) a()).l());
        sb2.append(" ");
        sb2.append(M());
        sb2.append(" ");
        sb2.append(h10);
        String str = "-0";
        sb2.append(h11 < 10 ? str : "-");
        sb2.append(h11);
        if (h12 >= 10) {
            str = "-";
        }
        sb2.append(str);
        sb2.append(h12);
        return sb2.toString();
    }

    public boolean v() {
        return a().S(h(a.YEAR));
    }
}
