package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.a;
import j$.time.format.F;
import java.util.HashMap;

/* 'enum' modifier removed */
final class e extends g {
    e() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    public final long K(j jVar) {
        if (m(jVar)) {
            return (long) g.Y(LocalDate.V(jVar));
        }
        throw new r("Unsupported field: WeekOfWeekBasedYear");
    }

    public final Temporal R(Temporal temporal, long j10) {
        o().b(j10, this);
        return temporal.d(a.h(j10, K(temporal)), ChronoUnit.WEEKS);
    }

    public final boolean m(j jVar) {
        return jVar.e(a.EPOCH_DAY) && g.U(jVar);
    }

    public final s n(j jVar) {
        if (m(jVar)) {
            return g.X(LocalDate.V(jVar));
        }
        throw new r("Unsupported field: WeekOfWeekBasedYear");
    }

    public final s o() {
        return s.l(52, 53);
    }

    public final j t(HashMap hashMap, j jVar, F f10) {
        LocalDate localDate;
        long j10;
        LocalDate plusWeeks;
        long j11;
        HashMap hashMap2 = hashMap;
        F f11 = f10;
        g gVar = g.WEEK_BASED_YEAR;
        Long l10 = (Long) hashMap2.get(gVar);
        a aVar = a.DAY_OF_WEEK;
        Long l11 = (Long) hashMap2.get(aVar);
        if (l10 == null || l11 == null) {
            return null;
        }
        int a10 = gVar.o().a(l10.longValue(), gVar);
        long longValue = ((Long) hashMap2.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
        g.W(jVar);
        LocalDate f02 = LocalDate.f0(a10, 1, 4);
        if (f11 == F.LENIENT) {
            long longValue2 = l11.longValue();
            if (longValue2 > 7) {
                j11 = longValue2 - 1;
                plusWeeks = f02.plusWeeks(j11 / 7);
            } else {
                j10 = 1;
                if (longValue2 < 1) {
                    plusWeeks = f02.plusWeeks(a.h(longValue2, 7) / 7);
                    j11 = longValue2 + 6;
                }
                localDate = f02.plusWeeks(a.h(longValue, j10)).c(longValue2, aVar);
            }
            f02 = plusWeeks;
            j10 = 1;
            longValue2 = (j11 % 7) + 1;
            localDate = f02.plusWeeks(a.h(longValue, j10)).c(longValue2, aVar);
        } else {
            int U = aVar.U(l11.longValue());
            if (longValue < 1 || longValue > 52) {
                (f11 == F.STRICT ? g.X(f02) : o()).b(longValue, this);
            }
            localDate = f02.plusWeeks(longValue - 1).c((long) U, aVar);
        }
        hashMap2.remove(this);
        hashMap2.remove(gVar);
        hashMap2.remove(aVar);
        return localDate;
    }

    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}
