package j$.time;

import j$.time.chrono.C0337d;
import j$.time.chrono.C0338e;
import j$.time.chrono.v;
import j$.time.format.w;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

public final class u implements Temporal, k, Comparable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f18288b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a  reason: collision with root package name */
    private final int f18289a;

    static {
        w wVar = new w();
        wVar.n(a.YEAR, 4, 10, 5);
        wVar.v(Locale.getDefault());
    }

    private u(int i10) {
        this.f18289a = i10;
    }

    public static u R(int i10) {
        a.YEAR.V((long) i10);
        return new u(i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 11, this);
    }

    public final Object K(p pVar) {
        return pVar == n.e() ? v.f18100d : pVar == n.j() ? ChronoUnit.YEARS : n.c(this, pVar);
    }

    /* renamed from: U */
    public final u d(long j10, q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (u) qVar.m(this, j10);
        }
        int i10 = t.f18242b[((ChronoUnit) qVar).ordinal()];
        if (i10 == 1) {
            return V(j10);
        }
        if (i10 == 2) {
            return V(a.f(j10, (long) 10));
        }
        if (i10 == 3) {
            return V(a.f(j10, (long) 100));
        }
        if (i10 == 4) {
            return V(a.f(j10, (long) 1000));
        }
        if (i10 == 5) {
            a aVar = a.ERA;
            return c(a.d(h(aVar), j10), aVar);
        }
        throw new r("Unsupported unit: " + qVar);
    }

    public final u V(long j10) {
        return j10 == 0 ? this : R(a.YEAR.U(((long) this.f18289a) + j10));
    }

    /* renamed from: W */
    public final u c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return (u) oVar.R(this, j10);
        }
        a aVar = (a) oVar;
        aVar.V(j10);
        int i10 = t.f18241a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.f18289a < 1) {
                j10 = 1 - j10;
            }
            return R((int) j10);
        } else if (i10 == 2) {
            return R((int) j10);
        } else {
            if (i10 == 3) {
                return h(a.ERA) == j10 ? this : R(1 - this.f18289a);
            }
            throw new r(b.a("Unsupported field: ", oVar));
        }
    }

    /* access modifiers changed from: package-private */
    public final void X(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18289a);
    }

    public final int compareTo(Object obj) {
        return this.f18289a - ((u) obj).f18289a;
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar == a.YEAR || oVar == a.YEAR_OF_ERA || oVar == a.ERA : oVar != null && oVar.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f18289a == ((u) obj).f18289a;
        }
        return false;
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public final long h(o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i10 = t.f18241a[((a) oVar).ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.f18289a;
            if (i12 < 1) {
                i12 = 1 - i12;
            }
            return (long) i12;
        } else if (i10 == 2) {
            return (long) this.f18289a;
        } else {
            if (i10 == 3) {
                if (this.f18289a < 1) {
                    i11 = 0;
                }
                return (long) i11;
            }
            throw new r(b.a("Unsupported field: ", oVar));
        }
    }

    public final int hashCode() {
        return this.f18289a;
    }

    public final long i(Temporal temporal, q qVar) {
        u uVar;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else if (temporal != null) {
            try {
                if (!v.f18100d.equals(C0338e.s(temporal))) {
                    temporal = LocalDate.V(temporal);
                }
                uVar = R(temporal.m(a.YEAR));
            } catch (e e10) {
                throw new e("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        } else {
            throw new NullPointerException("temporal");
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, uVar);
        }
        long j10 = ((long) uVar.f18289a) - ((long) this.f18289a);
        int i10 = t.f18242b[((ChronoUnit) qVar).ordinal()];
        if (i10 == 1) {
            return j10;
        }
        if (i10 == 2) {
            return j10 / 10;
        }
        if (i10 == 3) {
            return j10 / 100;
        }
        if (i10 == 4) {
            return j10 / 1000;
        }
        if (i10 == 5) {
            a aVar = a.ERA;
            return uVar.h(aVar) - h(aVar);
        }
        throw new r("Unsupported unit: " + qVar);
    }

    public final int m(o oVar) {
        return o(oVar).a(h(oVar), oVar);
    }

    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (u) C0338e.a(localDate, this);
    }

    public final s o(o oVar) {
        if (oVar != a.YEAR_OF_ERA) {
            return n.d(this, oVar);
        }
        return s.j(1, this.f18289a <= 0 ? 1000000000 : 999999999);
    }

    public final Temporal t(Temporal temporal) {
        if (((C0337d) C0338e.s(temporal)).equals(v.f18100d)) {
            return temporal.c((long) this.f18289a, a.YEAR);
        }
        throw new e("Adjustment only supported on ISO date-time");
    }

    public final String toString() {
        return Integer.toString(this.f18289a);
    }
}
