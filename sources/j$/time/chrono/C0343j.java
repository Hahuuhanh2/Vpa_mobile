package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.a;
import j$.time.b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.j  reason: case insensitive filesystem */
final class C0343j implements C0341h, Temporal, k, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a  reason: collision with root package name */
    private final transient ChronoLocalDate f18069a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.k f18070b;

    private C0343j(ChronoLocalDate chronoLocalDate, j$.time.k kVar) {
        if (chronoLocalDate == null) {
            throw new NullPointerException("date");
        } else if (kVar != null) {
            this.f18069a = chronoLocalDate;
            this.f18070b = kVar;
        } else {
            throw new NullPointerException("time");
        }
    }

    static C0343j R(o oVar, Temporal temporal) {
        C0343j jVar = (C0343j) temporal;
        C0337d dVar = (C0337d) oVar;
        if (dVar.equals(jVar.a())) {
            return jVar;
        }
        StringBuilder b10 = b.b("Chronology mismatch, required: ");
        b10.append(dVar.l());
        b10.append(", actual: ");
        b10.append(jVar.a().l());
        throw new ClassCastException(b10.toString());
    }

    static C0343j V(ChronoLocalDate chronoLocalDate, j$.time.k kVar) {
        return new C0343j(chronoLocalDate, kVar);
    }

    private C0343j Y(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12, long j13) {
        j$.time.k c02;
        ChronoLocalDate chronoLocalDate2 = chronoLocalDate;
        if ((j10 | j11 | j12 | j13) == 0) {
            c02 = this.f18070b;
        } else {
            long j14 = j10 / 24;
            long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
            long k02 = this.f18070b.k0();
            long j16 = j15 + k02;
            long g2 = a.g(j16, 86400000000000L) + j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
            long e10 = a.e(j16, 86400000000000L);
            c02 = e10 == k02 ? this.f18070b : j$.time.k.c0(e10);
            chronoLocalDate2 = chronoLocalDate2.d(g2, ChronoUnit.DAYS);
        }
        return a0(chronoLocalDate2, c02);
    }

    private C0343j a0(Temporal temporal, j$.time.k kVar) {
        ChronoLocalDate chronoLocalDate = this.f18069a;
        return (chronoLocalDate == temporal && this.f18070b == kVar) ? this : new C0343j(C0340g.R(chronoLocalDate.a(), temporal), kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 2, this);
    }

    public final ChronoZonedDateTime F(ZoneId zoneId) {
        return n.V(zoneId, (ZoneOffset) null, this);
    }

    public final /* synthetic */ Object K(p pVar) {
        return C0338e.m(this, pVar);
    }

    /* renamed from: N */
    public final /* synthetic */ int compareTo(C0341h hVar) {
        return C0338e.e(this, hVar);
    }

    /* renamed from: U */
    public final C0341h g(long j10, q qVar) {
        return R(a(), n.b(this, j10, (ChronoUnit) qVar));
    }

    /* renamed from: W */
    public final C0343j d(long j10, q qVar) {
        long j11 = j10;
        q qVar2 = qVar;
        if (!(qVar2 instanceof ChronoUnit)) {
            return R(this.f18069a.a(), qVar2.m(this, j11));
        }
        switch (C0342i.f18068a[((ChronoUnit) qVar2).ordinal()]) {
            case 1:
                return Y(this.f18069a, 0, 0, 0, j10);
            case 2:
                C0343j a02 = a0(this.f18069a.d(j11 / 86400000000L, ChronoUnit.DAYS), this.f18070b);
                return a02.Y(a02.f18069a, 0, 0, 0, (j11 % 86400000000L) * 1000);
            case 3:
                C0343j a03 = a0(this.f18069a.d(j11 / 86400000, ChronoUnit.DAYS), this.f18070b);
                return a03.Y(a03.f18069a, 0, 0, 0, (j11 % 86400000) * 1000000);
            case 4:
                return X(j10);
            case 5:
                return Y(this.f18069a, 0, j10, 0, 0);
            case 6:
                return Y(this.f18069a, j10, 0, 0, 0);
            case 7:
                C0343j a04 = a0(this.f18069a.d(j11 / 256, ChronoUnit.DAYS), this.f18070b);
                return a04.Y(a04.f18069a, (j11 % 256) * 12, 0, 0, 0);
            default:
                return a0(this.f18069a.d(j11, qVar2), this.f18070b);
        }
    }

    /* access modifiers changed from: package-private */
    public final C0343j X(long j10) {
        return Y(this.f18069a, 0, 0, j10, 0);
    }

    /* renamed from: Z */
    public final C0343j c(long j10, o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).isTimeBased() ? a0(this.f18069a, this.f18070b.c(j10, oVar)) : a0(this.f18069a.c(j10, oVar), this.f18070b) : R(this.f18069a.a(), oVar.R(this, j10));
    }

    public final o a() {
        return f().a();
    }

    public final j$.time.k b() {
        return this.f18070b;
    }

    public final boolean e(o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.m(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0341h) {
            return C0338e.e(this, (C0341h) obj) == 0;
        }
        return false;
    }

    public final ChronoLocalDate f() {
        return this.f18069a;
    }

    public final long h(o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).isTimeBased() ? this.f18070b.h(oVar) : this.f18069a.h(oVar) : oVar.K(this);
    }

    public final int hashCode() {
        return this.f18069a.hashCode() ^ this.f18070b.hashCode();
    }

    public final long i(Temporal temporal, q qVar) {
        long j10;
        if (temporal != null) {
            C0341h L = a().L(temporal);
            if (qVar instanceof ChronoUnit) {
                if (qVar.isTimeBased()) {
                    j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                    long h10 = L.h(aVar) - this.f18069a.h(aVar);
                    switch (C0342i.f18068a[((ChronoUnit) qVar).ordinal()]) {
                        case 1:
                            j10 = 86400000000000L;
                            break;
                        case 2:
                            j10 = 86400000000L;
                            break;
                        case 3:
                            j10 = 86400000;
                            break;
                        case 4:
                            h10 = a.f(h10, (long) 86400);
                            break;
                        case 5:
                            h10 = a.f(h10, (long) 1440);
                            break;
                        case 6:
                            h10 = a.f(h10, (long) 24);
                            break;
                        case 7:
                            h10 = a.f(h10, (long) 2);
                            break;
                    }
                    h10 = a.f(h10, j10);
                    return a.d(h10, this.f18070b.i(L.b(), qVar));
                }
                ChronoLocalDate f10 = L.f();
                if (L.b().compareTo(this.f18070b) < 0) {
                    f10 = f10.g(1, ChronoUnit.DAYS);
                }
                return this.f18069a.i(f10, qVar);
            } else if (qVar != null) {
                return qVar.between(this, L);
            } else {
                throw new NullPointerException("unit");
            }
        } else {
            throw new NullPointerException("endExclusive");
        }
    }

    public final int m(o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).isTimeBased() ? this.f18070b.m(oVar) : this.f18069a.m(oVar) : o(oVar).a(h(oVar), oVar);
    }

    public final Temporal n(LocalDate localDate) {
        j jVar;
        o oVar;
        if (localDate instanceof ChronoLocalDate) {
            return a0(localDate, this.f18070b);
        }
        if (localDate instanceof j$.time.k) {
            return a0(this.f18069a, (j$.time.k) localDate);
        }
        if (localDate instanceof C0343j) {
            oVar = this.f18069a.a();
            jVar = localDate;
        } else {
            oVar = this.f18069a.a();
            localDate.getClass();
            jVar = C0338e.a(localDate, this);
        }
        return R(oVar, (C0343j) jVar);
    }

    public final s o(o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.n(this);
        }
        if (!((j$.time.temporal.a) oVar).isTimeBased()) {
            return this.f18069a.o(oVar);
        }
        j$.time.k kVar = this.f18070b;
        kVar.getClass();
        return n.d(kVar, oVar);
    }

    public final /* synthetic */ long s(ZoneOffset zoneOffset) {
        return C0338e.p(this, zoneOffset);
    }

    public final /* synthetic */ Temporal t(Temporal temporal) {
        return C0338e.b(this, temporal);
    }

    public final String toString() {
        return this.f18069a.toString() + 'T' + this.f18070b.toString();
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f18069a);
        objectOutput.writeObject(this.f18070b);
    }
}
