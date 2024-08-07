package j$.time;

import java.io.Serializable;

final class c extends d implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f18042a;

    c(ZoneId zoneId) {
        this.f18042a = zoneId;
    }

    public final ZoneId a() {
        return this.f18042a;
    }

    public final Instant b() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final long c() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f18042a.equals(((c) obj).f18042a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18042a.hashCode() + 1;
    }

    public final String toString() {
        StringBuilder b10 = b.b("SystemClock[");
        b10.append(this.f18042a);
        b10.append("]");
        return b10.toString();
    }
}
