package j$.time;

import j$.time.chrono.C0338e;
import j$.time.chrono.v;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class OffsetDateTime implements Temporal, k, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f18027a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f18028b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f18021c;
        ZoneOffset zoneOffset = ZoneOffset.f18036g;
        localDateTime.getClass();
        R(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f18022d;
        ZoneOffset zoneOffset2 = ZoneOffset.f18035f;
        localDateTime2.getClass();
        R(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (localDateTime != null) {
            this.f18027a = localDateTime;
            if (zoneOffset != null) {
                this.f18028b = zoneOffset;
                return;
            }
            throw new NullPointerException("offset");
        }
        throw new NullPointerException("dateTime");
    }

    public static OffsetDateTime R(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime U(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        } else if (zoneId != null) {
            ZoneOffset d10 = zoneId.U().d(instant);
            return new OffsetDateTime(LocalDateTime.d0(instant.W(), instant.X(), d10), d10);
        } else {
            throw new NullPointerException("zone");
        }
    }

    static OffsetDateTime W(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f18021c;
        LocalDate localDate = LocalDate.f18016d;
        return new OffsetDateTime(LocalDateTime.c0(LocalDate.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.j0(objectInput)), ZoneOffset.g0(objectInput));
    }

    private OffsetDateTime X(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f18027a != localDateTime || !this.f18028b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
    }

    public final Object K(p pVar) {
        if (pVar == n.i() || pVar == n.k()) {
            return this.f18028b;
        }
        if (pVar == n.l()) {
            return null;
        }
        return pVar == n.f() ? this.f18027a.f() : pVar == n.g() ? this.f18027a.b() : pVar == n.e() ? v.f18100d : pVar == n.j() ? ChronoUnit.NANOS : pVar.h(this);
    }

    /* renamed from: V */
    public final OffsetDateTime d(long j10, q qVar) {
        return qVar instanceof ChronoUnit ? X(this.f18027a.d(j10, qVar), this.f18028b) : (OffsetDateTime) qVar.m(this, j10);
    }

    public final Temporal c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return (OffsetDateTime) oVar.R(this, j10);
        }
        a aVar = (a) oVar;
        int i10 = o.f18231a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? X(this.f18027a.c(j10, oVar), this.f18028b) : X(this.f18027a, ZoneOffset.e0(aVar.U(j10))) : U(Instant.Z(j10, (long) this.f18027a.V()), this.f18028b);
    }

    public final int compareTo(Object obj) {
        int i10;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.f18028b.equals(offsetDateTime.f18028b)) {
            i10 = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f18027a;
            ZoneOffset zoneOffset = this.f18028b;
            localDateTime.getClass();
            long p10 = C0338e.p(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime.f18027a;
            ZoneOffset zoneOffset2 = offsetDateTime.f18028b;
            localDateTime2.getClass();
            i10 = Long.compare(p10, C0338e.p(localDateTime2, zoneOffset2));
            if (i10 == 0) {
                i10 = this.f18027a.b().Y() - offsetDateTime.f18027a.b().Y();
            }
        }
        return i10 == 0 ? toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime()) : i10;
    }

    public final boolean e(o oVar) {
        return (oVar instanceof a) || (oVar != null && oVar.m(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f18027a.equals(offsetDateTime.f18027a) && this.f18028b.equals(offsetDateTime.f18028b);
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public final long h(o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i10 = o.f18231a[((a) oVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f18027a.h(oVar) : (long) this.f18028b.b0();
        }
        LocalDateTime localDateTime = this.f18027a;
        ZoneOffset zoneOffset = this.f18028b;
        localDateTime.getClass();
        return C0338e.p(localDateTime, zoneOffset);
    }

    public final int hashCode() {
        return this.f18027a.hashCode() ^ this.f18028b.hashCode();
    }

    public final long i(Temporal temporal, q qVar) {
        OffsetDateTime offsetDateTime;
        if (temporal instanceof OffsetDateTime) {
            offsetDateTime = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset a02 = ZoneOffset.a0(temporal);
                LocalDate localDate = (LocalDate) temporal.K(n.f());
                k kVar = (k) temporal.K(n.g());
                offsetDateTime = (localDate == null || kVar == null) ? U(Instant.V(temporal), a02) : new OffsetDateTime(LocalDateTime.c0(localDate, kVar), a02);
            } catch (e e10) {
                throw new e("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, offsetDateTime);
        }
        ZoneOffset zoneOffset = this.f18028b;
        if (!zoneOffset.equals(offsetDateTime.f18028b)) {
            offsetDateTime = new OffsetDateTime(offsetDateTime.f18027a.g0((long) (zoneOffset.b0() - offsetDateTime.f18028b.b0())), zoneOffset);
        }
        return this.f18027a.i(offsetDateTime.f18027a, qVar);
    }

    public final ZoneOffset j() {
        return this.f18028b;
    }

    public final int m(o oVar) {
        if (!(oVar instanceof a)) {
            return n.a(this, oVar);
        }
        int i10 = o.f18231a[((a) oVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f18027a.m(oVar) : this.f18028b.b0();
        }
        throw new r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final Temporal n(LocalDate localDate) {
        if ((localDate instanceof LocalDate) || (localDate instanceof k) || (localDate instanceof LocalDateTime)) {
            return X(this.f18027a.n(localDate), this.f18028b);
        }
        if (localDate instanceof Instant) {
            return U((Instant) localDate, this.f18028b);
        }
        if (localDate instanceof ZoneOffset) {
            return X(this.f18027a, (ZoneOffset) localDate);
        }
        boolean z10 = localDate instanceof OffsetDateTime;
        j jVar = localDate;
        if (!z10) {
            localDate.getClass();
            jVar = C0338e.a(localDate, this);
        }
        return (OffsetDateTime) jVar;
    }

    public final s o(o oVar) {
        return oVar instanceof a ? (oVar == a.INSTANT_SECONDS || oVar == a.OFFSET_SECONDS) ? oVar.o() : this.f18027a.o(oVar) : oVar.n(this);
    }

    public final Temporal t(Temporal temporal) {
        return temporal.c(this.f18027a.f().I(), a.EPOCH_DAY).c(this.f18027a.b().k0(), a.NANO_OF_DAY).c((long) this.f18028b.b0(), a.OFFSET_SECONDS);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f18027a;
    }

    public final String toString() {
        return this.f18027a.toString() + this.f18028b.toString();
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f18027a.l0(objectOutput);
        this.f18028b.h0(objectOutput);
    }
}
