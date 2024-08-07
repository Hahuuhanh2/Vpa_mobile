package nl;

import java.io.Serializable;
import n0.l;
import ol.a;
import ol.h;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import p3.l0;
import rl.b;
import rl.d;
import rl.f;
import rl.g;
import rl.i;
import rl.j;
import rl.k;
import v.v;

/* compiled from: LocalDate */
public final class e extends a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final e f21752d = F(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final e f21753e = F(999999999, 12, 31);

    /* renamed from: a  reason: collision with root package name */
    public final int f21754a;

    /* renamed from: b  reason: collision with root package name */
    public final short f21755b;

    /* renamed from: c  reason: collision with root package name */
    public final short f21756c;

    public e(int i10, int i11, int i12) {
        this.f21754a = i10;
        this.f21755b = (short) i11;
        this.f21756c = (short) i12;
    }

    public static e A(int i10, h hVar, int i11) {
        if (i11 > 28) {
            h.f22637a.getClass();
            if (i11 > hVar.u(h.isLeapYear((long) i10))) {
                if (i11 == 29) {
                    throw new DateTimeException(v.d("Invalid date 'February 29' as '", i10, "' is not a leap year"));
                }
                StringBuilder q10 = android.support.v4.media.a.q("Invalid date '");
                q10.append(hVar.name());
                q10.append(" ");
                q10.append(i11);
                q10.append("'");
                throw new DateTimeException(q10.toString());
            }
        }
        return new e(i10, hVar.ordinal() + 1, i11);
    }

    public static e B(rl.e eVar) {
        e eVar2 = (e) eVar.o(rl.h.f22844f);
        if (eVar2 != null) {
            return eVar2;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static e F(int i10, int i11, int i12) {
        rl.a.YEAR.m((long) i10);
        rl.a.MONTH_OF_YEAR.m((long) i11);
        rl.a.DAY_OF_MONTH.m((long) i12);
        return A(i10, h.v(i11), i12);
    }

    public static e G(long j10) {
        long j11;
        long j12 = j10;
        rl.a.EPOCH_DAY.m(j12);
        long j13 = (j12 + 719528) - 60;
        if (j13 < 0) {
            long j14 = ((j13 + 1) / 146097) - 1;
            j11 = j14 * 400;
            j13 += (-j14) * 146097;
        } else {
            j11 = 0;
        }
        long j15 = ((j13 * 400) + 591) / 146097;
        long j16 = j13 - ((j15 / 400) + (((j15 / 4) + (j15 * 365)) - (j15 / 100)));
        if (j16 < 0) {
            j15--;
            j16 = j13 - ((j15 / 400) + (((j15 / 4) + (365 * j15)) - (j15 / 100)));
        }
        int i10 = (int) j16;
        int i11 = ((i10 * 5) + 2) / 153;
        return new e(rl.a.YEAR.k(j15 + j11 + ((long) (i11 / 10))), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static e L(int i10, int i11, int i12) {
        int i13;
        if (i11 == 2) {
            h.f22637a.getClass();
            if (h.isLeapYear((long) i10)) {
                i13 = 29;
            } else {
                i13 = 28;
            }
            i12 = Math.min(i12, i13);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return F(i10, i11, i12);
    }

    public final int C(g gVar) {
        switch (((rl.a) gVar).ordinal()) {
            case 15:
                return D().s();
            case 16:
                return ((this.f21756c - 1) % 7) + 1;
            case 17:
                return ((E() - 1) % 7) + 1;
            case 18:
                return this.f21756c;
            case 19:
                return E();
            case 20:
                throw new DateTimeException(l.j("Field too large for an int: ", gVar));
            case 21:
                return ((this.f21756c - 1) / 7) + 1;
            case 22:
                return ((E() - 1) / 7) + 1;
            case 23:
                return this.f21755b;
            case 24:
                throw new DateTimeException(l.j("Field too large for an int: ", gVar));
            case 25:
                int i10 = this.f21754a;
                if (i10 >= 1) {
                    return i10;
                }
                return 1 - i10;
            case 26:
                return this.f21754a;
            case 27:
                if (this.f21754a >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
        }
    }

    public final b D() {
        long j10 = (long) 7;
        return b.t(((int) ((((toEpochDay() + 3) % j10) + j10) % j10)) + 1);
    }

    public final int E() {
        return (h.v(this.f21755b).s(isLeapYear()) + this.f21756c) - 1;
    }

    /* renamed from: H */
    public final e w(long j10, j jVar) {
        if (!(jVar instanceof b)) {
            return (e) jVar.b(this, j10);
        }
        switch (((b) jVar).ordinal()) {
            case 7:
                return I(j10);
            case 8:
                return I(l0.B0(7, j10));
            case 9:
                return J(j10);
            case 10:
                return K(j10);
            case 11:
                return K(l0.B0(10, j10));
            case 12:
                return K(l0.B0(100, j10));
            case 13:
                return K(l0.B0(1000, j10));
            case 14:
                rl.a aVar = rl.a.ERA;
                return y(l0.A0(c(aVar), j10), aVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + jVar);
        }
    }

    public final e I(long j10) {
        if (j10 == 0) {
            return this;
        }
        return G(l0.A0(toEpochDay(), j10));
    }

    public final e J(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f21754a) * 12) + ((long) (this.f21755b - 1)) + j10;
        long j12 = (long) 12;
        return L(rl.a.YEAR.k(l0.T(j11, 12)), ((int) (((j11 % j12) + j12) % j12)) + 1, this.f21756c);
    }

    public final e K(long j10) {
        if (j10 == 0) {
            return this;
        }
        return L(rl.a.YEAR.k(((long) this.f21754a) + j10), this.f21755b, this.f21756c);
    }

    /* renamed from: M */
    public final e y(long j10, g gVar) {
        if (!(gVar instanceof rl.a)) {
            return (e) gVar.i(this, j10);
        }
        rl.a aVar = (rl.a) gVar;
        aVar.m(j10);
        switch (aVar.ordinal()) {
            case 15:
                return I(j10 - ((long) D().s()));
            case 16:
                return I(j10 - c(rl.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 17:
                return I(j10 - c(rl.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 18:
                return O((int) j10);
            case 19:
                return P((int) j10);
            case 20:
                return G(j10);
            case 21:
                return I(l0.B0(7, j10 - c(rl.a.ALIGNED_WEEK_OF_MONTH)));
            case 22:
                return I(l0.B0(7, j10 - c(rl.a.ALIGNED_WEEK_OF_YEAR)));
            case 23:
                return Q((int) j10);
            case 24:
                return J(j10 - c(rl.a.PROLEPTIC_MONTH));
            case 25:
                if (this.f21754a < 1) {
                    j10 = 1 - j10;
                }
                return R((int) j10);
            case 26:
                return R((int) j10);
            case 27:
                if (c(rl.a.ERA) == j10) {
                    return this;
                }
                return R(1 - this.f21754a);
            default:
                throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
        }
    }

    /* renamed from: N */
    public final e x(f fVar) {
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return (e) fVar.i(this);
    }

    public final e O(int i10) {
        if (this.f21756c == i10) {
            return this;
        }
        return F(this.f21754a, this.f21755b, i10);
    }

    public final e P(int i10) {
        if (E() == i10) {
            return this;
        }
        int i11 = this.f21754a;
        long j10 = (long) i11;
        rl.a.YEAR.m(j10);
        rl.a.DAY_OF_YEAR.m((long) i10);
        h.f22637a.getClass();
        boolean isLeapYear = h.isLeapYear(j10);
        if (i10 != 366 || isLeapYear) {
            h v2 = h.v(((i10 - 1) / 31) + 1);
            if (i10 > (v2.u(isLeapYear) + v2.s(isLeapYear)) - 1) {
                v2 = h.f21769b[((((int) 1) + 12) + v2.ordinal()) % 12];
            }
            return A(i11, v2, (i10 - v2.s(isLeapYear)) + 1);
        }
        throw new DateTimeException(v.d("Invalid date 'DayOfYear 366' as '", i11, "' is not a leap year"));
    }

    public final e Q(int i10) {
        if (this.f21755b == i10) {
            return this;
        }
        rl.a.MONTH_OF_YEAR.m((long) i10);
        return L(this.f21754a, i10, this.f21756c);
    }

    public final e R(int i10) {
        if (this.f21754a == i10) {
            return this;
        }
        rl.a.YEAR.m((long) i10);
        return L(i10, this.f21755b, this.f21756c);
    }

    public final long c(g gVar) {
        if (!(gVar instanceof rl.a)) {
            return gVar.j(this);
        }
        if (gVar == rl.a.EPOCH_DAY) {
            return toEpochDay();
        }
        if (gVar == rl.a.PROLEPTIC_MONTH) {
            return (((long) this.f21754a) * 12) + ((long) (this.f21755b - 1));
        }
        return (long) C(gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        if (z((e) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f21754a;
        return (((i10 << 11) + (this.f21755b << 6)) + this.f21756c) ^ (i10 & -2048);
    }

    public final d i(d dVar) {
        return super.i(dVar);
    }

    public final boolean isLeapYear() {
        h.f22637a.getClass();
        return h.isLeapYear((long) this.f21754a);
    }

    public final int k(g gVar) {
        if (gVar instanceof rl.a) {
            return C(gVar);
        }
        return super.k(gVar);
    }

    public final k m(g gVar) {
        int i10;
        int i11;
        long j10;
        long j11;
        if (!(gVar instanceof rl.a)) {
            return gVar.b(this);
        }
        rl.a aVar = (rl.a) gVar;
        if (aVar.isDateBased()) {
            int ordinal = aVar.ordinal();
            if (ordinal == 18) {
                short s10 = this.f21755b;
                if (s10 != 2) {
                    if (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) {
                        i10 = 30;
                    } else {
                        i10 = 31;
                    }
                } else if (isLeapYear()) {
                    i10 = 29;
                } else {
                    i10 = 28;
                }
                return k.c(1, (long) i10);
            } else if (ordinal == 19) {
                if (isLeapYear()) {
                    i11 = 366;
                } else {
                    i11 = 365;
                }
                return k.c(1, (long) i11);
            } else if (ordinal == 21) {
                if (h.v(this.f21755b) != h.FEBRUARY || isLeapYear()) {
                    j10 = 5;
                } else {
                    j10 = 4;
                }
                return k.c(1, j10);
            } else if (ordinal != 25) {
                return gVar.range();
            } else {
                if (this.f21754a <= 0) {
                    j11 = 1000000000;
                } else {
                    j11 = 999999999;
                }
                return k.c(1, j11);
            }
        } else {
            throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
        }
    }

    public final boolean n(g gVar) {
        return super.n(gVar);
    }

    public final <R> R o(i<R> iVar) {
        if (iVar == rl.h.f22844f) {
            return this;
        }
        return super.o(iVar);
    }

    public final d p(long j10, b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return w(Long.MAX_VALUE, bVar).w(1, bVar);
        }
        return w(-j10, bVar);
    }

    /* renamed from: s */
    public final int compareTo(a aVar) {
        if (aVar instanceof e) {
            return z((e) aVar);
        }
        return super.compareTo(aVar);
    }

    public final ol.f t() {
        return h.f22637a;
    }

    public final long toEpochDay() {
        long j10;
        long j11 = (long) this.f21754a;
        long j12 = (long) this.f21755b;
        long j13 = (365 * j11) + 0;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / -400) + ((j11 / -4) - (j11 / -100)));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + ((long) (this.f21756c - 1));
        if (j12 > 2) {
            j14--;
            if (!isLeapYear()) {
                j14--;
            }
        }
        return j14 - 719528;
    }

    public final String toString() {
        String str;
        int i10 = this.f21754a;
        short s10 = this.f21755b;
        short s11 = this.f21756c;
        int abs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        String str2 = "-0";
        if (s10 < 10) {
            str = str2;
        } else {
            str = "-";
        }
        sb2.append(str);
        sb2.append(s10);
        if (s11 >= 10) {
            str2 = "-";
        }
        sb2.append(str2);
        sb2.append(s11);
        return sb2.toString();
    }

    public final ol.g u() {
        return super.u();
    }

    public final a v(long j10, b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return w(Long.MAX_VALUE, bVar).w(1, bVar);
        }
        return w(-j10, bVar);
    }

    public final int z(e eVar) {
        int i10 = this.f21754a - eVar.f21754a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f21755b - eVar.f21755b;
        if (i11 == 0) {
            return this.f21756c - eVar.f21756c;
        }
        return i11;
    }
}
