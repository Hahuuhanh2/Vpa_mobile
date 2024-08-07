package nl;

import android.support.v4.media.a;
import n0.l;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import rl.d;
import rl.e;
import rl.f;
import rl.g;
import rl.h;
import rl.i;
import rl.k;

/* compiled from: DayOfWeek */
public enum b implements e, f {
    WEDNESDAY,
    THURSDAY;
    

    /* renamed from: c  reason: collision with root package name */
    public static final b[] f21744c = null;

    /* access modifiers changed from: public */
    static {
        f21744c = values();
    }

    public static b t(int i10) {
        if (i10 >= 1 && i10 <= 7) {
            return f21744c[i10 - 1];
        }
        throw new DateTimeException(a.m("Invalid value for DayOfWeek: ", i10));
    }

    public final long c(g gVar) {
        if (gVar == rl.a.DAY_OF_WEEK) {
            return (long) s();
        }
        if (!(gVar instanceof rl.a)) {
            return gVar.j(this);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final d i(d dVar) {
        return dVar.b((long) s(), rl.a.DAY_OF_WEEK);
    }

    public final int k(g gVar) {
        if (gVar == rl.a.DAY_OF_WEEK) {
            return s();
        }
        return m(gVar).a(c(gVar), gVar);
    }

    public final k m(g gVar) {
        if (gVar == rl.a.DAY_OF_WEEK) {
            return gVar.range();
        }
        if (!(gVar instanceof rl.a)) {
            return gVar.b(this);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final boolean n(g gVar) {
        if (gVar instanceof rl.a) {
            if (gVar == rl.a.DAY_OF_WEEK) {
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
            return rl.b.DAYS;
        }
        if (iVar == h.f22844f || iVar == h.f22845g || iVar == h.f22840b || iVar == h.f22842d || iVar == h.f22839a || iVar == h.f22843e) {
            return null;
        }
        return iVar.a(this);
    }

    public final int s() {
        return ordinal() + 1;
    }
}
