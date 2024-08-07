package j$.time.temporal;

/* 'enum' modifier removed */
final class d extends g {
    d() {
        super("QUARTER_OF_YEAR", 1);
    }

    public final long K(j jVar) {
        if (m(jVar)) {
            return (jVar.h(a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new r("Unsupported field: QuarterOfYear");
    }

    public final Temporal R(Temporal temporal, long j10) {
        long K = K(temporal);
        o().b(j10, this);
        a aVar = a.MONTH_OF_YEAR;
        return temporal.c(((j10 - K) * 3) + temporal.h(aVar), aVar);
    }

    public final boolean m(j jVar) {
        return jVar.e(a.MONTH_OF_YEAR) && g.U(jVar);
    }

    public final s o() {
        return s.j(1, 4);
    }

    public final String toString() {
        return "QuarterOfYear";
    }
}
