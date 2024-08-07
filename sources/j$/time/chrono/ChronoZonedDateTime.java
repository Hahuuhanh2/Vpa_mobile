package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.k;
import j$.time.temporal.Temporal;
import j$.time.temporal.o;

public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoZonedDateTime D(ZoneId zoneId);

    ZoneId H();

    long T();

    o a();

    k b();

    ChronoLocalDate f();

    long h(o oVar);

    ZoneOffset j();

    Instant toInstant();

    C0341h u();

    ChronoZonedDateTime x(ZoneOffset zoneOffset);
}
