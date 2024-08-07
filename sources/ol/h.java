package ol;

import android.support.v4.media.a;
import java.io.Serializable;
import nl.d;
import nl.e;
import nl.f;
import nl.j;
import nl.m;
import org.threeten.bp.DateTimeException;
import p3.l0;

/* compiled from: IsoChronology */
public final class h extends f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final h f22637a = new h();

    public static boolean isLeapYear(long j10) {
        if ((3 & j10) != 0 || (j10 % 100 == 0 && j10 % 400 != 0)) {
            return false;
        }
        return true;
    }

    public final e c(rl.e eVar) {
        return e.B(eVar);
    }

    public final i m(int i10) {
        if (i10 == 0) {
            return i.BCE;
        }
        if (i10 == 1) {
            return i.CE;
        }
        throw new DateTimeException(a.m("Invalid era: ", i10));
    }

    public final void o() {
    }

    public final b p(f fVar) {
        return f.B(fVar);
    }

    public final d q(d dVar, j jVar) {
        l0.y0(dVar, "instant");
        return m.C(dVar.f21750a, dVar.f21751b, jVar);
    }
}
