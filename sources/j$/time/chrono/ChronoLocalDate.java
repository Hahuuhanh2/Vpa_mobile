package j$.time.chrono;

import j$.time.r;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.k;
import j$.time.temporal.o;
import j$.time.temporal.q;

public interface ChronoLocalDate extends Temporal, k, Comparable<ChronoLocalDate> {
    ChronoLocalDate C(r rVar);

    ChronoLocalDate E(k kVar);

    long I();

    C0341h J(j$.time.k kVar);

    p M();

    int Q();

    o a();

    ChronoLocalDate c(long j10, o oVar);

    int compareTo(ChronoLocalDate chronoLocalDate);

    ChronoLocalDate d(long j10, q qVar);

    boolean e(o oVar);

    boolean equals(Object obj);

    ChronoLocalDate g(long j10, ChronoUnit chronoUnit);

    int hashCode();

    long i(Temporal temporal, q qVar);

    String toString();

    boolean v();
}
