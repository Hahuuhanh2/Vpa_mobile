package nl;

import android.support.v4.media.a;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import n0.l;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import p3.l0;
import pl.b;
import pl.f;
import pl.j;
import rl.b;
import rl.d;
import rl.e;
import rl.f;
import rl.g;
import rl.i;
import rl.k;

/* compiled from: Month */
public enum h implements e, f {
    FEBRUARY;
    

    /* renamed from: b  reason: collision with root package name */
    public static final h[] f21769b = null;

    /* access modifiers changed from: public */
    static {
        f21769b = values();
    }

    public static h v(int i10) {
        if (i10 >= 1 && i10 <= 12) {
            return f21769b[i10 - 1];
        }
        throw new DateTimeException(a.m("Invalid value for MonthOfYear: ", i10));
    }

    public final long c(g gVar) {
        if (gVar == rl.a.MONTH_OF_YEAR) {
            return (long) (ordinal() + 1);
        }
        if (!(gVar instanceof rl.a)) {
            return gVar.j(this);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final d i(d dVar) {
        if (ol.f.n(dVar).equals(ol.h.f22637a)) {
            return dVar.b((long) (ordinal() + 1), rl.a.MONTH_OF_YEAR);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public final int k(g gVar) {
        if (gVar == rl.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        return m(gVar).a(c(gVar), gVar);
    }

    public final k m(g gVar) {
        if (gVar == rl.a.MONTH_OF_YEAR) {
            return gVar.range();
        }
        if (!(gVar instanceof rl.a)) {
            return gVar.b(this);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final boolean n(g gVar) {
        if (gVar instanceof rl.a) {
            if (gVar == rl.a.MONTH_OF_YEAR) {
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
        if (iVar == rl.h.f22840b) {
            return ol.h.f22637a;
        }
        if (iVar == rl.h.f22841c) {
            return b.MONTHS;
        }
        if (iVar == rl.h.f22844f || iVar == rl.h.f22845g || iVar == rl.h.f22842d || iVar == rl.h.f22839a || iVar == rl.h.f22843e) {
            return null;
        }
        return iVar.a(this);
    }

    public final int s(boolean z10) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + true;
            case 3:
                return z10 + true;
            case 4:
                return z10 + true;
            case 5:
                return z10 + true;
            case 6:
                return z10 + true;
            case 7:
                return z10 + true;
            case 8:
                return z10 + true;
            case 9:
                return z10 + true;
            case 10:
                return z10 + true;
            default:
                return z10 + true;
        }
    }

    public final String t(j jVar, Locale locale) {
        pl.b bVar = new pl.b();
        rl.a aVar = rl.a.MONTH_OF_YEAR;
        l0.y0(aVar, "field");
        AtomicReference<pl.f> atomicReference = pl.f.f22710a;
        bVar.b(new b.k(aVar, jVar, f.a.f22711a));
        return bVar.k(locale).a(this);
    }

    public final int u(boolean z10) {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) {
                return 30;
            }
            return 31;
        } else if (z10) {
            return 29;
        } else {
            return 28;
        }
    }
}
