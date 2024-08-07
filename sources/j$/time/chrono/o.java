package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.F;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.s;
import java.util.HashMap;
import java.util.List;

public interface o extends Comparable {
    ChronoLocalDate A(HashMap hashMap, F f10);

    int B(p pVar, int i10);

    ChronoLocalDate G(j jVar);

    C0341h L(j jVar);

    ChronoLocalDate O(int i10, int i11, int i12);

    ChronoZonedDateTime P(Instant instant, ZoneId zoneId);

    boolean S(long j10);

    ChronoLocalDate k(long j10);

    String l();

    String p();

    ChronoZonedDateTime q(j jVar);

    ChronoLocalDate r(int i10, int i11);

    s w(a aVar);

    List y();

    p z(int i10);
}
