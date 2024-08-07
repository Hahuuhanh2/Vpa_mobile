package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.a;
import j$.time.chrono.v;
import j$.time.format.F;
import java.util.HashMap;

/* 'enum' modifier removed */
final class c extends g {
    c() {
        super("DAY_OF_QUARTER", 0);
    }

    public final long K(j jVar) {
        if (m(jVar)) {
            return (long) (jVar.m(a.DAY_OF_YEAR) - g.f18257a[((jVar.m(a.MONTH_OF_YEAR) - 1) / 3) + (v.f18100d.S(jVar.h(a.YEAR)) ? 4 : 0)]);
        }
        throw new r("Unsupported field: DayOfQuarter");
    }

    public final Temporal R(Temporal temporal, long j10) {
        long K = K(temporal);
        o().b(j10, this);
        a aVar = a.DAY_OF_YEAR;
        return temporal.c((j10 - K) + temporal.h(aVar), aVar);
    }

    public final boolean m(j jVar) {
        return jVar.e(a.DAY_OF_YEAR) && jVar.e(a.MONTH_OF_YEAR) && jVar.e(a.YEAR) && g.U(jVar);
    }

    public final s n(j jVar) {
        if (m(jVar)) {
            long h10 = jVar.h(g.QUARTER_OF_YEAR);
            if (h10 != 1) {
                return h10 == 2 ? s.j(1, 91) : (h10 == 3 || h10 == 4) ? s.j(1, 92) : o();
            }
            return v.f18100d.S(jVar.h(a.YEAR)) ? s.j(1, 91) : s.j(1, 90);
        }
        throw new r("Unsupported field: DayOfQuarter");
    }

    public final s o() {
        return s.l(90, 92);
    }

    public final j t(HashMap hashMap, j jVar, F f10) {
        long j10;
        LocalDate localDate;
        HashMap hashMap2 = hashMap;
        F f11 = f10;
        a aVar = a.YEAR;
        Long l10 = (Long) hashMap2.get(aVar);
        g gVar = g.QUARTER_OF_YEAR;
        Long l11 = (Long) hashMap2.get(gVar);
        if (l10 == null || l11 == null) {
            return null;
        }
        int U = aVar.U(l10.longValue());
        long longValue = ((Long) hashMap2.get(g.DAY_OF_QUARTER)).longValue();
        g.W(jVar);
        if (f11 == F.LENIENT) {
            localDate = LocalDate.f0(U, 1, 1).k0(a.f(a.h(l11.longValue(), 1), (long) 3));
            j10 = a.h(longValue, 1);
        } else {
            LocalDate f02 = LocalDate.f0(U, ((gVar.o().a(l11.longValue(), gVar) - 1) * 3) + 1, 1);
            if (longValue < 1 || longValue > 90) {
                (f11 == F.STRICT ? n(f02) : o()).b(longValue, this);
            }
            j10 = longValue - 1;
            localDate = f02;
        }
        hashMap2.remove(this);
        hashMap2.remove(aVar);
        hashMap2.remove(gVar);
        return localDate.plusDays(j10);
    }

    public final String toString() {
        return "DayOfQuarter";
    }
}
