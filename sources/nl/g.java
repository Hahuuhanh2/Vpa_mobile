package nl;

import java.io.Serializable;
import n0.l;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import ql.b;
import rl.a;
import rl.d;
import rl.e;
import rl.f;
import rl.h;
import rl.i;
import rl.j;
import rl.k;

/* compiled from: LocalTime */
public final class g extends b implements d, f, Comparable<g>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final g f21761e;

    /* renamed from: f  reason: collision with root package name */
    public static final g f21762f = new g(23, 59, 59, 999999999);

    /* renamed from: n  reason: collision with root package name */
    public static final g[] f21763n = new g[24];

    /* renamed from: a  reason: collision with root package name */
    public final byte f21764a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f21765b;

    /* renamed from: c  reason: collision with root package name */
    public final byte f21766c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21767d;

    static {
        int i10 = 0;
        while (true) {
            g[] gVarArr = f21763n;
            if (i10 < gVarArr.length) {
                gVarArr[i10] = new g(i10, 0, 0, 0);
                i10++;
            } else {
                g gVar = gVarArr[0];
                g gVar2 = gVarArr[12];
                f21761e = gVar;
                return;
            }
        }
    }

    public g(int i10, int i11, int i12, int i13) {
        this.f21764a = (byte) i10;
        this.f21765b = (byte) i11;
        this.f21766c = (byte) i12;
        this.f21767d = i13;
    }

    public static g t(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f21763n[i10];
        }
        return new g(i10, i11, i12, i13);
    }

    public static g u(e eVar) {
        g gVar = (g) eVar.o(h.f22845g);
        if (gVar != null) {
            return gVar;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static g w(long j10) {
        a.NANO_OF_DAY.m(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (((long) i10) * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (((long) i11) * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return t(i10, i11, i12, (int) (j12 - (((long) i12) * 1000000000)));
    }

    public static g x(int i10, long j10) {
        a.SECOND_OF_DAY.m(j10);
        a.NANO_OF_SECOND.m((long) i10);
        int i11 = (int) (j10 / 3600);
        long j11 = j10 - ((long) (i11 * 3600));
        int i12 = (int) (j11 / 60);
        return t(i11, i12, (int) (j11 - ((long) (i12 * 60))), i10);
    }

    public final g A(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f21764a * 60) + this.f21765b;
        int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
        if (i10 == i11) {
            return this;
        }
        return t(i11 / 60, i11 % 60, this.f21766c, this.f21767d);
    }

    public final g B(long j10) {
        if (j10 == 0) {
            return this;
        }
        long D = D();
        long j11 = (((j10 % 86400000000000L) + D) + 86400000000000L) % 86400000000000L;
        if (D == j11) {
            return this;
        }
        return t((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public final g C(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f21765b * 60) + (this.f21764a * 3600) + this.f21766c;
        int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
        if (i10 == i11) {
            return this;
        }
        return t(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f21767d);
    }

    public final long D() {
        return (((long) this.f21766c) * 1000000000) + (((long) this.f21765b) * 60000000000L) + (((long) this.f21764a) * 3600000000000L) + ((long) this.f21767d);
    }

    public final int E() {
        return (this.f21765b * 60) + (this.f21764a * 3600) + this.f21766c;
    }

    /* renamed from: F */
    public final g b(long j10, rl.g gVar) {
        if (!(gVar instanceof a)) {
            return (g) gVar.i(this, j10);
        }
        a aVar = (a) gVar;
        aVar.m(j10);
        switch (aVar.ordinal()) {
            case 0:
                return I((int) j10);
            case 1:
                return w(j10);
            case 2:
                return I(((int) j10) * 1000);
            case 3:
                return w(j10 * 1000);
            case 4:
                return I(((int) j10) * 1000000);
            case 5:
                return w(j10 * 1000000);
            case 6:
                int i10 = (int) j10;
                if (this.f21766c == i10) {
                    return this;
                }
                a.SECOND_OF_MINUTE.m((long) i10);
                return t(this.f21764a, this.f21765b, i10, this.f21767d);
            case 7:
                return C(j10 - ((long) E()));
            case 8:
                return H((int) j10);
            case 9:
                return A(j10 - ((long) ((this.f21764a * 60) + this.f21765b)));
            case 10:
                return z(j10 - ((long) (this.f21764a % 12)));
            case 11:
                if (j10 == 12) {
                    j10 = 0;
                }
                return z(j10 - ((long) (this.f21764a % 12)));
            case 12:
                return G((int) j10);
            case 13:
                if (j10 == 24) {
                    j10 = 0;
                }
                return G((int) j10);
            case 14:
                return z((j10 - ((long) (this.f21764a / 12))) * 12);
            default:
                throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
        }
    }

    public final g G(int i10) {
        if (this.f21764a == i10) {
            return this;
        }
        a.HOUR_OF_DAY.m((long) i10);
        return t(i10, this.f21765b, this.f21766c, this.f21767d);
    }

    public final g H(int i10) {
        if (this.f21765b == i10) {
            return this;
        }
        a.MINUTE_OF_HOUR.m((long) i10);
        return t(this.f21764a, i10, this.f21766c, this.f21767d);
    }

    public final g I(int i10) {
        if (this.f21767d == i10) {
            return this;
        }
        a.NANO_OF_SECOND.m((long) i10);
        return t(this.f21764a, this.f21765b, this.f21766c, i10);
    }

    public final long c(rl.g gVar) {
        if (!(gVar instanceof a)) {
            return gVar.j(this);
        }
        if (gVar == a.NANO_OF_DAY) {
            return D();
        }
        if (gVar == a.MICRO_OF_DAY) {
            return D() / 1000;
        }
        return (long) v(gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f21764a == gVar.f21764a && this.f21765b == gVar.f21765b && this.f21766c == gVar.f21766c && this.f21767d == gVar.f21767d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long D = D();
        return (int) (D ^ (D >>> 32));
    }

    public final d i(d dVar) {
        return dVar.b(D(), a.NANO_OF_DAY);
    }

    public final int k(rl.g gVar) {
        if (gVar instanceof a) {
            return v(gVar);
        }
        return super.k(gVar);
    }

    public final k m(rl.g gVar) {
        return super.m(gVar);
    }

    public final boolean n(rl.g gVar) {
        if (gVar instanceof a) {
            return gVar.isTimeBased();
        }
        if (gVar == null || !gVar.c(this)) {
            return false;
        }
        return true;
    }

    public final <R> R o(i<R> iVar) {
        if (iVar == h.f22841c) {
            return rl.b.NANOS;
        }
        if (iVar == h.f22845g) {
            return this;
        }
        if (iVar == h.f22840b || iVar == h.f22839a || iVar == h.f22842d || iVar == h.f22843e || iVar == h.f22844f) {
            return null;
        }
        return iVar.a(this);
    }

    public final d p(long j10, rl.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return j(Long.MAX_VALUE, bVar).j(1, bVar);
        }
        return j(-j10, bVar);
    }

    public final d q(e eVar) {
        if (eVar instanceof g) {
            return (g) eVar;
        }
        return (g) eVar.i(this);
    }

    /* renamed from: s */
    public final int compareTo(g gVar) {
        int i10;
        int i11;
        int i12;
        byte b10 = this.f21764a;
        byte b11 = gVar.f21764a;
        int i13 = 1;
        if (b10 < b11) {
            i10 = -1;
        } else if (b10 > b11) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            return i10;
        }
        byte b12 = this.f21765b;
        byte b13 = gVar.f21765b;
        if (b12 < b13) {
            i11 = -1;
        } else if (b12 > b13) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i11 != 0) {
            return i11;
        }
        byte b14 = this.f21766c;
        byte b15 = gVar.f21766c;
        if (b14 < b15) {
            i12 = -1;
        } else if (b14 > b15) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i12 != 0) {
            return i12;
        }
        int i14 = this.f21767d;
        int i15 = gVar.f21767d;
        if (i14 < i15) {
            i13 = -1;
        } else if (i14 <= i15) {
            i13 = 0;
        }
        return i13;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f21764a;
        byte b11 = this.f21765b;
        byte b12 = this.f21766c;
        int i10 = this.f21767d;
        if (b10 < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(b10);
        String str3 = ":0";
        if (b11 < 10) {
            str2 = str3;
        } else {
            str2 = ":";
        }
        sb2.append(str2);
        sb2.append(b11);
        if (b12 > 0 || i10 > 0) {
            if (b12 >= 10) {
                str3 = ":";
            }
            sb2.append(str3);
            sb2.append(b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    public final int v(rl.g gVar) {
        switch (((a) gVar).ordinal()) {
            case 0:
                return this.f21767d;
            case 1:
                throw new DateTimeException(l.j("Field too large for an int: ", gVar));
            case 2:
                return this.f21767d / 1000;
            case 3:
                throw new DateTimeException(l.j("Field too large for an int: ", gVar));
            case 4:
                return this.f21767d / 1000000;
            case 5:
                return (int) (D() / 1000000);
            case 6:
                return this.f21766c;
            case 7:
                return E();
            case 8:
                return this.f21765b;
            case 9:
                return (this.f21764a * 60) + this.f21765b;
            case 10:
                return this.f21764a % 12;
            case 11:
                int i10 = this.f21764a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 12:
                return this.f21764a;
            case 13:
                byte b10 = this.f21764a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 14:
                return this.f21764a / 12;
            default:
                throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
        }
    }

    /* renamed from: y */
    public final g j(long j10, j jVar) {
        if (!(jVar instanceof rl.b)) {
            return (g) jVar.b(this, j10);
        }
        switch (((rl.b) jVar).ordinal()) {
            case 0:
                return B(j10);
            case 1:
                return B((j10 % 86400000000L) * 1000);
            case 2:
                return B((j10 % 86400000) * 1000000);
            case 3:
                return C(j10);
            case 4:
                return A(j10);
            case 5:
                return z(j10);
            case 6:
                return z((j10 % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + jVar);
        }
    }

    public final g z(long j10) {
        if (j10 == 0) {
            return this;
        }
        return t(((((int) (j10 % 24)) + this.f21764a) + 24) % 24, this.f21765b, this.f21766c, this.f21767d);
    }
}
