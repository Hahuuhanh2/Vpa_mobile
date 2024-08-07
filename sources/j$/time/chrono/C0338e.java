package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.r;

/* renamed from: j$.time.chrono.e  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0338e {
    public static Temporal a(ChronoLocalDate chronoLocalDate, Temporal temporal) {
        return temporal.c(chronoLocalDate.I(), a.EPOCH_DAY);
    }

    public static Temporal b(C0341h hVar, Temporal temporal) {
        return temporal.c(hVar.f().I(), a.EPOCH_DAY).c(hVar.b().k0(), a.NANO_OF_DAY);
    }

    public static Temporal c(p pVar, Temporal temporal) {
        return temporal.c((long) pVar.getValue(), a.ERA);
    }

    public static int d(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        int compare = Long.compare(chronoLocalDate.I(), chronoLocalDate2.I());
        if (compare != 0) {
            return compare;
        }
        return ((C0337d) chronoLocalDate.a()).compareTo(chronoLocalDate2.a());
    }

    public static int e(C0341h hVar, C0341h hVar2) {
        int compareTo = hVar.f().compareTo(hVar2.f());
        if (compareTo != 0) {
            return compareTo;
        }
        int R = hVar.b().compareTo(hVar2.b());
        if (R != 0) {
            return R;
        }
        return ((C0337d) hVar.a()).compareTo(hVar2.a());
    }

    public static int f(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.T(), chronoZonedDateTime2.T());
        if (compare != 0) {
            return compare;
        }
        int Y = chronoZonedDateTime.b().Y() - chronoZonedDateTime2.b().Y();
        if (Y != 0) {
            return Y;
        }
        int N = chronoZonedDateTime.u().N(chronoZonedDateTime2.u());
        if (N != 0) {
            return N;
        }
        int compareTo = chronoZonedDateTime.H().l().compareTo(chronoZonedDateTime2.H().l());
        if (compareTo != 0) {
            return compareTo;
        }
        return ((C0337d) chronoZonedDateTime.a()).compareTo(chronoZonedDateTime2.a());
    }

    public static int g(ChronoZonedDateTime chronoZonedDateTime, o oVar) {
        if (!(oVar instanceof a)) {
            return n.a(chronoZonedDateTime, oVar);
        }
        int i10 = C0345l.f18076a[((a) oVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? chronoZonedDateTime.u().m(oVar) : chronoZonedDateTime.j().b0();
        }
        throw new r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int h(p pVar, a aVar) {
        return aVar == a.ERA ? pVar.getValue() : n.a(pVar, aVar);
    }

    public static long i(p pVar, o oVar) {
        if (oVar == a.ERA) {
            return (long) pVar.getValue();
        }
        if (!(oVar instanceof a)) {
            return oVar.K(pVar);
        }
        throw new r(b.a("Unsupported field: ", oVar));
    }

    public static boolean j(ChronoLocalDate chronoLocalDate, o oVar) {
        return oVar instanceof a ? oVar.isDateBased() : oVar != null && oVar.m(chronoLocalDate);
    }

    public static boolean k(p pVar, o oVar) {
        return oVar instanceof a ? oVar == a.ERA : oVar != null && oVar.m(pVar);
    }

    public static Object l(ChronoLocalDate chronoLocalDate, p pVar) {
        if (pVar == n.l() || pVar == n.k() || pVar == n.i() || pVar == n.g()) {
            return null;
        }
        return pVar == n.e() ? chronoLocalDate.a() : pVar == n.j() ? ChronoUnit.DAYS : pVar.h(chronoLocalDate);
    }

    public static Object m(C0341h hVar, p pVar) {
        if (pVar == n.l() || pVar == n.k() || pVar == n.i()) {
            return null;
        }
        return pVar == n.g() ? hVar.b() : pVar == n.e() ? hVar.a() : pVar == n.j() ? ChronoUnit.NANOS : pVar.h(hVar);
    }

    public static Object n(ChronoZonedDateTime chronoZonedDateTime, p pVar) {
        return (pVar == n.k() || pVar == n.l()) ? chronoZonedDateTime.H() : pVar == n.i() ? chronoZonedDateTime.j() : pVar == n.g() ? chronoZonedDateTime.b() : pVar == n.e() ? chronoZonedDateTime.a() : pVar == n.j() ? ChronoUnit.NANOS : pVar.h(chronoZonedDateTime);
    }

    public static Object o(p pVar, p pVar2) {
        return pVar2 == n.j() ? ChronoUnit.ERAS : n.c(pVar, pVar2);
    }

    public static long p(C0341h hVar, ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((hVar.f().I() * 86400) + ((long) hVar.b().l0())) - ((long) zoneOffset.b0());
        }
        throw new NullPointerException("offset");
    }

    public static long q(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.f().I() * 86400) + ((long) chronoZonedDateTime.b().l0())) - ((long) chronoZonedDateTime.j().b0());
    }

    public static Instant r(C0341h hVar, ZoneOffset zoneOffset) {
        return Instant.Z(hVar.s(zoneOffset), (long) hVar.b().Y());
    }

    public static o s(j jVar) {
        if (jVar != null) {
            o oVar = (o) jVar.K(n.e());
            return oVar != null ? oVar : v.f18100d;
        }
        throw new NullPointerException("temporal");
    }
}
