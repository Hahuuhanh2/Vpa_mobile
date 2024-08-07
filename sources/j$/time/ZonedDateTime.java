package j$.time;

import j$.time.chrono.C0338e;
import j$.time.chrono.C0341h;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.o;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.zone.b;
import j$.time.zone.e;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f18039a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f18040b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneId f18041c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f18039a = localDateTime;
        this.f18040b = zoneOffset;
        this.f18041c = zoneId;
    }

    private static ZonedDateTime R(long j10, int i10, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.U().d(Instant.Z(j10, (long) i10));
        return new ZonedDateTime(LocalDateTime.d0(j10, i10, d10), zoneId, d10);
    }

    public static ZonedDateTime U(j jVar) {
        if (jVar instanceof ZonedDateTime) {
            return (ZonedDateTime) jVar;
        }
        try {
            ZoneId R = ZoneId.R(jVar);
            a aVar = a.INSTANT_SECONDS;
            return jVar.e(aVar) ? R(jVar.h(aVar), jVar.m(a.NANO_OF_SECOND), R) : V(LocalDateTime.c0(LocalDate.V(jVar), k.V(jVar)), R, (ZoneOffset) null);
        } catch (e e10) {
            throw new e("Unable to obtain ZonedDateTime from TemporalAccessor: " + jVar + " of type " + jVar.getClass().getName(), e10);
        }
    }

    public static ZonedDateTime V(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        if (localDateTime == null) {
            throw new NullPointerException("localDateTime");
        } else if (zoneId == null) {
            throw new NullPointerException("zone");
        } else if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        } else {
            e U = zoneId.U();
            List g2 = U.g(localDateTime);
            if (g2.size() == 1) {
                zoneOffset = (ZoneOffset) g2.get(0);
            } else if (g2.size() == 0) {
                b f10 = U.f(localDateTime);
                localDateTime = localDateTime.g0(f10.o().o());
                zoneOffset = f10.t();
            } else if ((zoneOffset == null || !g2.contains(zoneOffset)) && (zoneOffset = (ZoneOffset) g2.get(0)) == null) {
                throw new NullPointerException("offset");
            }
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
    }

    static ZonedDateTime X(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f18021c;
        LocalDate localDate = LocalDate.f18016d;
        LocalDateTime c02 = LocalDateTime.c0(LocalDate.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.j0(objectInput));
        ZoneOffset g02 = ZoneOffset.g0(objectInput);
        ZoneId zoneId = (ZoneId) s.a(objectInput);
        if (zoneId == null) {
            throw new NullPointerException("zone");
        } else if (!(zoneId instanceof ZoneOffset) || g02.equals(zoneId)) {
            return new ZonedDateTime(c02, zoneId, g02);
        } else {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
    }

    private ZonedDateTime Y(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f18040b) || !this.f18041c.U().g(this.f18039a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f18039a, this.f18041c, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        } else if (zoneId != null) {
            return R(instant.W(), instant.X(), zoneId);
        } else {
            throw new NullPointerException("zone");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    public final ChronoZonedDateTime D(ZoneId zoneId) {
        if (zoneId != null) {
            return this.f18041c.equals(zoneId) ? this : V(this.f18039a, zoneId, this.f18040b);
        }
        throw new NullPointerException("zone");
    }

    public final ZoneId H() {
        return this.f18041c;
    }

    public final Object K(p pVar) {
        return pVar == n.f() ? this.f18039a.f() : C0338e.n(this, pVar);
    }

    public final /* synthetic */ long T() {
        return C0338e.q(this);
    }

    /* renamed from: W */
    public final ZonedDateTime d(long j10, q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (ZonedDateTime) qVar.m(this, j10);
        }
        if (qVar.isDateBased()) {
            return V(this.f18039a.d(j10, qVar), this.f18041c, this.f18040b);
        }
        LocalDateTime e02 = this.f18039a.d(j10, qVar);
        ZoneOffset zoneOffset = this.f18040b;
        ZoneId zoneId = this.f18041c;
        if (e02 == null) {
            throw new NullPointerException("localDateTime");
        } else if (zoneOffset == null) {
            throw new NullPointerException("offset");
        } else if (zoneId != null) {
            return zoneId.U().g(e02).contains(zoneOffset) ? new ZonedDateTime(e02, zoneId, zoneOffset) : R(C0338e.p(e02, zoneOffset), e02.V(), zoneId);
        } else {
            throw new NullPointerException("zone");
        }
    }

    public final LocalDateTime Z() {
        return this.f18039a;
    }

    public final o a() {
        return ((LocalDate) f()).a();
    }

    /* renamed from: a0 */
    public final ZonedDateTime n(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return V(LocalDateTime.c0(localDate, this.f18039a.b()), this.f18041c, this.f18040b);
        }
        if (localDate instanceof k) {
            return V(LocalDateTime.c0(this.f18039a.f(), (k) localDate), this.f18041c, this.f18040b);
        }
        if (localDate instanceof LocalDateTime) {
            return V((LocalDateTime) localDate, this.f18041c, this.f18040b);
        }
        if (localDate instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) localDate;
            return V(offsetDateTime.toLocalDateTime(), this.f18041c, offsetDateTime.j());
        } else if (localDate instanceof Instant) {
            Instant instant = (Instant) localDate;
            return R(instant.W(), instant.X(), this.f18041c);
        } else if (localDate instanceof ZoneOffset) {
            return Y((ZoneOffset) localDate);
        } else {
            localDate.getClass();
            return (ZonedDateTime) C0338e.a(localDate, this);
        }
    }

    public final k b() {
        return this.f18039a.b();
    }

    /* renamed from: b0 */
    public final ZonedDateTime x(ZoneId zoneId) {
        if (zoneId == null) {
            throw new NullPointerException("zone");
        } else if (this.f18041c.equals(zoneId)) {
            return this;
        } else {
            LocalDateTime localDateTime = this.f18039a;
            ZoneOffset zoneOffset = this.f18040b;
            localDateTime.getClass();
            return R(C0338e.p(localDateTime, zoneOffset), this.f18039a.V(), zoneId);
        }
    }

    public final Temporal c(long j10, j$.time.temporal.o oVar) {
        if (!(oVar instanceof a)) {
            return (ZonedDateTime) oVar.R(this, j10);
        }
        a aVar = (a) oVar;
        int i10 = x.f18295a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? V(this.f18039a.c(j10, oVar), this.f18041c, this.f18040b) : Y(ZoneOffset.e0(aVar.U(j10))) : R(j10, this.f18039a.V(), this.f18041c);
    }

    /* access modifiers changed from: package-private */
    public final void c0(DataOutput dataOutput) {
        this.f18039a.l0(dataOutput);
        this.f18040b.h0(dataOutput);
        this.f18041c.Y(dataOutput);
    }

    public final boolean e(j$.time.temporal.o oVar) {
        return (oVar instanceof a) || (oVar != null && oVar.m(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f18039a.equals(zonedDateTime.f18039a) && this.f18040b.equals(zonedDateTime.f18040b) && this.f18041c.equals(zonedDateTime.f18041c);
    }

    public final ChronoLocalDate f() {
        return this.f18039a.f();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.a(this);
        }
        throw new NullPointerException("formatter");
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public final long h(j$.time.temporal.o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i10 = x.f18295a[((a) oVar).ordinal()];
        return i10 != 1 ? i10 != 2 ? this.f18039a.h(oVar) : (long) this.f18040b.b0() : C0338e.q(this);
    }

    public final int hashCode() {
        return (this.f18039a.hashCode() ^ this.f18040b.hashCode()) ^ Integer.rotateLeft(this.f18041c.hashCode(), 3);
    }

    public final long i(Temporal temporal, q qVar) {
        ZonedDateTime U = U(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, U);
        }
        ZonedDateTime b02 = U.x(this.f18041c);
        return qVar.isDateBased() ? this.f18039a.i(b02.f18039a, qVar) : OffsetDateTime.R(this.f18039a, this.f18040b).i(OffsetDateTime.R(b02.f18039a, b02.f18040b), qVar);
    }

    public final ZoneOffset j() {
        return this.f18040b;
    }

    public final int m(j$.time.temporal.o oVar) {
        if (!(oVar instanceof a)) {
            return C0338e.g(this, oVar);
        }
        int i10 = x.f18295a[((a) oVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f18039a.m(oVar) : this.f18040b.b0();
        }
        throw new r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final s o(j$.time.temporal.o oVar) {
        return oVar instanceof a ? (oVar == a.INSTANT_SECONDS || oVar == a.OFFSET_SECONDS) ? oVar.o() : this.f18039a.o(oVar) : oVar.n(this);
    }

    /* renamed from: t */
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return C0338e.f(this, chronoZonedDateTime);
    }

    public final Instant toInstant() {
        return Instant.Z(T(), (long) b().Y());
    }

    public final String toString() {
        String str = this.f18039a.toString() + this.f18040b.toString();
        if (this.f18040b == this.f18041c) {
            return str;
        }
        return str + '[' + this.f18041c.toString() + ']';
    }

    public final C0341h u() {
        return this.f18039a;
    }
}
