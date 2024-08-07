package ol;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import nl.g;
import nl.j;
import org.threeten.bp.DateTimeException;
import p3.l0;
import rl.d;
import rl.e;
import rl.h;

/* compiled from: Chronology */
public abstract class f implements Comparable<f> {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        try {
            Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
        }
    }

    public static f n(e eVar) {
        l0.y0(eVar, "temporal");
        f fVar = (f) eVar.o(h.f22840b);
        if (fVar != null) {
            return fVar;
        }
        return h.f22637a;
    }

    /* renamed from: b */
    public final int compareTo(f fVar) {
        o();
        fVar.o();
        return 0;
    }

    public abstract nl.e c(e eVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        if (compareTo((f) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().hashCode();
        o();
        return hashCode ^ 72805;
    }

    public final <D extends a> D i(d dVar) {
        D d10 = (a) dVar;
        if (equals(d10.t())) {
            return d10;
        }
        o();
        d10.t().o();
        throw new ClassCastException("Chrono mismatch, expected: ISO, actual: ISO");
    }

    public final <D extends a> c<D> j(d dVar) {
        c<D> cVar = (c) dVar;
        if (equals(cVar.f22632a.t())) {
            return cVar;
        }
        o();
        cVar.f22632a.t().o();
        throw new ClassCastException("Chrono mismatch, required: ISO, supplied: ISO");
    }

    public final <D extends a> e<D> k(d dVar) {
        e<D> eVar = (e) dVar;
        if (equals(eVar.x().t())) {
            return eVar;
        }
        o();
        eVar.x().t().o();
        throw new ClassCastException("Chrono mismatch, required: ISO, supplied: ISO");
    }

    public abstract i m(int i10);

    public abstract void o();

    public b p(nl.f fVar) {
        try {
            nl.e c10 = c(fVar);
            g u10 = g.u(fVar);
            c10.getClass();
            return nl.f.D(c10, u10);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + nl.f.class, e10);
        }
    }

    public d<?> q(nl.d dVar, j jVar) {
        return e.C(this, dVar, jVar);
    }

    public final String toString() {
        o();
        return "ISO";
    }
}
