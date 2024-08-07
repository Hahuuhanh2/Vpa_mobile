package j$.time.zone;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.C0338e;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f18298a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f18299b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneOffset f18300c;

    b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f18298a = LocalDateTime.d0(j10, 0, zoneOffset);
        this.f18299b = zoneOffset;
        this.f18300c = zoneOffset2;
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f18298a = localDateTime;
        this.f18299b = zoneOffset;
        this.f18300c = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final ZoneOffset K() {
        return this.f18299b;
    }

    /* access modifiers changed from: package-private */
    public final List R() {
        if (U()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new ZoneOffset[]{this.f18299b, this.f18300c});
    }

    public final long T() {
        LocalDateTime localDateTime = this.f18298a;
        ZoneOffset zoneOffset = this.f18299b;
        localDateTime.getClass();
        return C0338e.p(localDateTime, zoneOffset);
    }

    public final boolean U() {
        return this.f18300c.b0() > this.f18299b.b0();
    }

    /* access modifiers changed from: package-private */
    public final void V(DataOutput dataOutput) {
        a.c(T(), dataOutput);
        a.d(this.f18299b, dataOutput);
        a.d(this.f18300c, dataOutput);
    }

    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        LocalDateTime localDateTime = this.f18298a;
        ZoneOffset zoneOffset = this.f18299b;
        localDateTime.getClass();
        Instant r10 = C0338e.r(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = bVar.f18298a;
        ZoneOffset zoneOffset2 = bVar.f18299b;
        localDateTime2.getClass();
        return r10.compareTo(C0338e.r(localDateTime2, zoneOffset2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18298a.equals(bVar.f18298a) && this.f18299b.equals(bVar.f18299b) && this.f18300c.equals(bVar.f18300c);
    }

    public final int hashCode() {
        return (this.f18298a.hashCode() ^ this.f18299b.hashCode()) ^ Integer.rotateLeft(this.f18300c.hashCode(), 16);
    }

    public final LocalDateTime m() {
        return this.f18298a.g0((long) (this.f18300c.b0() - this.f18299b.b0()));
    }

    public final LocalDateTime n() {
        return this.f18298a;
    }

    public final Duration o() {
        return Duration.K((long) (this.f18300c.b0() - this.f18299b.b0()));
    }

    public final ZoneOffset t() {
        return this.f18300c;
    }

    public final String toString() {
        StringBuilder b10 = j$.time.b.b("Transition[");
        b10.append(U() ? "Gap" : "Overlap");
        b10.append(" at ");
        b10.append(this.f18298a);
        b10.append(this.f18299b);
        b10.append(" to ");
        b10.append(this.f18300c);
        b10.append(']');
        return b10.toString();
    }
}
