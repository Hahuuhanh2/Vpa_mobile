package j$.time.temporal;

import j$.time.LocalDate;

/* 'enum' modifier removed */
final class f extends g {
    f() {
        super("WEEK_BASED_YEAR", 3);
    }

    public final long K(j jVar) {
        if (m(jVar)) {
            return (long) g.b0(LocalDate.V(jVar));
        }
        throw new r("Unsupported field: WeekBasedYear");
    }

    public final Temporal R(Temporal temporal, long j10) {
        if (m(temporal)) {
            int a10 = o().a(j10, g.WEEK_BASED_YEAR);
            LocalDate V = LocalDate.V(temporal);
            a aVar = a.DAY_OF_WEEK;
            int m10 = V.m(aVar);
            int Y = g.Y(V);
            if (Y == 53 && g.c0(a10) == 52) {
                Y = 52;
            }
            LocalDate f02 = LocalDate.f0(a10, 1, 4);
            return temporal.n(f02.plusDays((long) (((Y - 1) * 7) + (m10 - f02.m(aVar)))));
        }
        throw new r("Unsupported field: WeekBasedYear");
    }

    public final boolean m(j jVar) {
        return jVar.e(a.EPOCH_DAY) && g.U(jVar);
    }

    public final s o() {
        return a.YEAR.o();
    }

    public final String toString() {
        return "WeekBasedYear";
    }
}
