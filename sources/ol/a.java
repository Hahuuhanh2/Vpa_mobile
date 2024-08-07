package ol;

import nl.e;
import p3.l0;
import rl.b;
import rl.d;
import rl.f;
import rl.g;
import rl.h;
import rl.i;
import rl.j;

/* compiled from: ChronoLocalDate */
public abstract class a extends ql.a implements f, Comparable<a> {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (compareTo((a) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ t().hashCode();
    }

    public d i(d dVar) {
        return dVar.b(toEpochDay(), rl.a.EPOCH_DAY);
    }

    public boolean n(g gVar) {
        if (gVar instanceof rl.a) {
            return gVar.isDateBased();
        }
        if (gVar == null || !gVar.c(this)) {
            return false;
        }
        return true;
    }

    public <R> R o(i<R> iVar) {
        if (iVar == h.f22840b) {
            return t();
        }
        if (iVar == h.f22841c) {
            return b.DAYS;
        }
        if (iVar == h.f22844f) {
            return e.G(toEpochDay());
        }
        if (iVar == h.f22845g || iVar == h.f22842d || iVar == h.f22839a || iVar == h.f22843e) {
            return null;
        }
        return super.o(iVar);
    }

    /* renamed from: s */
    public int compareTo(a aVar) {
        int x10 = l0.x(toEpochDay(), aVar.toEpochDay());
        if (x10 == 0) {
            return t().compareTo(aVar.t());
        }
        return x10;
    }

    public abstract f t();

    public long toEpochDay() {
        return ((e) this).c(rl.a.EPOCH_DAY);
    }

    public String toString() {
        String str;
        e eVar = (e) this;
        long c10 = eVar.c(rl.a.YEAR_OF_ERA);
        long c11 = eVar.c(rl.a.MONTH_OF_YEAR);
        long c12 = eVar.c(rl.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        t().o();
        sb2.append("ISO");
        sb2.append(" ");
        sb2.append(u());
        sb2.append(" ");
        sb2.append(c10);
        String str2 = "-0";
        if (c11 < 10) {
            str = str2;
        } else {
            str = "-";
        }
        sb2.append(str);
        sb2.append(c11);
        if (c12 >= 10) {
            str2 = "-";
        }
        sb2.append(str2);
        sb2.append(c12);
        return sb2.toString();
    }

    public g u() {
        return t().m(k(rl.a.ERA));
    }

    /* renamed from: v */
    public a p(long j10, b bVar) {
        return t().i(super.p(j10, bVar));
    }

    /* renamed from: w */
    public abstract e j(long j10, j jVar);

    /* renamed from: x */
    public a q(e eVar) {
        return t().i(eVar.i(this));
    }

    /* renamed from: y */
    public abstract e b(long j10, g gVar);
}
