package nl;

import java.io.Serializable;
import n0.l;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import p3.l0;
import ql.b;
import rl.a;
import rl.e;
import rl.f;
import rl.g;
import rl.h;
import rl.i;
import rl.j;
import rl.k;

/* compiled from: Instant */
public final class d extends b implements rl.d, f, Comparable<d>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final d f21749c = new d(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f21750a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21751b;

    static {
        u(-31557014167219200L, 0);
        u(31556889864403199L, 999999999);
    }

    public d(int i10, long j10) {
        this.f21750a = j10;
        this.f21751b = i10;
    }

    public static d s(int i10, long j10) {
        if ((((long) i10) | j10) == 0) {
            return f21749c;
        }
        if (j10 >= -31557014167219200L && j10 <= 31556889864403199L) {
            return new d(i10, j10);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    public static d t(e eVar) {
        try {
            return u(eVar.c(a.INSTANT_SECONDS), (long) eVar.k(a.NANO_OF_SECOND));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e10);
        }
    }

    public static d u(long j10, long j11) {
        long j12 = (long) 1000000000;
        return s((int) (((j11 % j12) + j12) % j12), l0.A0(j10, l0.T(j11, 1000000000)));
    }

    public final rl.d b(long j10, g gVar) {
        if (!(gVar instanceof a)) {
            return (d) gVar.i(this, j10);
        }
        a aVar = (a) gVar;
        aVar.m(j10);
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                int i10 = ((int) j10) * 1000;
                if (i10 != this.f21751b) {
                    return s(i10, this.f21750a);
                }
            } else if (ordinal == 4) {
                int i11 = ((int) j10) * 1000000;
                if (i11 != this.f21751b) {
                    return s(i11, this.f21750a);
                }
            } else if (ordinal != 28) {
                throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
            } else if (j10 != this.f21750a) {
                return s(this.f21751b, j10);
            }
        } else if (j10 != ((long) this.f21751b)) {
            return s((int) j10, this.f21750a);
        }
        return this;
    }

    public final long c(g gVar) {
        int i10;
        if (!(gVar instanceof a)) {
            return gVar.j(this);
        }
        int ordinal = ((a) gVar).ordinal();
        if (ordinal == 0) {
            i10 = this.f21751b;
        } else if (ordinal == 2) {
            i10 = this.f21751b / 1000;
        } else if (ordinal == 4) {
            i10 = this.f21751b / 1000000;
        } else if (ordinal == 28) {
            return this.f21750a;
        } else {
            throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
        }
        return (long) i10;
    }

    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int x10 = l0.x(this.f21750a, dVar.f21750a);
        if (x10 != 0) {
            return x10;
        }
        return this.f21751b - dVar.f21751b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f21750a == dVar.f21750a && this.f21751b == dVar.f21751b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f21750a;
        return (this.f21751b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final rl.d i(rl.d dVar) {
        return dVar.b(this.f21750a, a.INSTANT_SECONDS).b((long) this.f21751b, a.NANO_OF_SECOND);
    }

    public final int k(g gVar) {
        if (!(gVar instanceof a)) {
            return super.m(gVar).a(gVar.j(this), gVar);
        }
        int ordinal = ((a) gVar).ordinal();
        if (ordinal == 0) {
            return this.f21751b;
        }
        if (ordinal == 2) {
            return this.f21751b / 1000;
        }
        if (ordinal == 4) {
            return this.f21751b / 1000000;
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final k m(g gVar) {
        return super.m(gVar);
    }

    public final boolean n(g gVar) {
        if (gVar instanceof a) {
            if (gVar == a.INSTANT_SECONDS || gVar == a.NANO_OF_SECOND || gVar == a.MICRO_OF_SECOND || gVar == a.MILLI_OF_SECOND) {
                return true;
            }
            return false;
        } else if (gVar == null || !gVar.c(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final <R> R o(i<R> iVar) {
        if (iVar == h.f22841c) {
            return rl.b.NANOS;
        }
        if (iVar == h.f22844f || iVar == h.f22845g || iVar == h.f22840b || iVar == h.f22839a || iVar == h.f22842d || iVar == h.f22843e) {
            return null;
        }
        return iVar.a(this);
    }

    public final rl.d p(long j10, rl.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return j(Long.MAX_VALUE, bVar).j(1, bVar);
        }
        return j(-j10, bVar);
    }

    public final rl.d q(e eVar) {
        return (d) eVar.i(this);
    }

    public final String toString() {
        return pl.a.f22661h.a(this);
    }

    public final d v(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return u(l0.A0(l0.A0(this.f21750a, j10), j11 / 1000000000), ((long) this.f21751b) + (j11 % 1000000000));
    }

    /* renamed from: w */
    public final d j(long j10, j jVar) {
        if (!(jVar instanceof rl.b)) {
            return (d) jVar.b(this, j10);
        }
        switch (((rl.b) jVar).ordinal()) {
            case 0:
                return v(0, j10);
            case 1:
                return v(j10 / 1000000, (j10 % 1000000) * 1000);
            case 2:
                return v(j10 / 1000, (j10 % 1000) * 1000000);
            case 3:
                return v(j10, 0);
            case 4:
                return v(l0.B0(60, j10), 0);
            case 5:
                return v(l0.B0(3600, j10), 0);
            case 6:
                return v(l0.B0(43200, j10), 0);
            case 7:
                return v(l0.B0(86400, j10), 0);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + jVar);
        }
    }

    public final long x() {
        long j10 = this.f21750a;
        if (j10 >= 0) {
            return l0.A0(l0.C0(j10), (long) (this.f21751b / 1000000));
        }
        return l0.D0(l0.C0(j10 + 1), 1000 - ((long) (this.f21751b / 1000000)));
    }
}
