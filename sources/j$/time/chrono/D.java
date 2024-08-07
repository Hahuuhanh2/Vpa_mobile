package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.d;
import j$.time.e;
import j$.time.format.F;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class D extends C0337d implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final D f18053d = new D();
    private static final long serialVersionUID = 1039765215346859963L;

    private D() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final ChronoLocalDate A(HashMap hashMap, F f10) {
        return (F) super.A(hashMap, f10);
    }

    public final int B(p pVar, int i10) {
        if (pVar instanceof G) {
            return pVar == G.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    public final ChronoLocalDate G(j jVar) {
        return jVar instanceof F ? (F) jVar : new F(LocalDate.V(jVar));
    }

    public final C0341h L(j jVar) {
        return super.L(jVar);
    }

    public final ChronoLocalDate O(int i10, int i11, int i12) {
        return new F(LocalDate.f0(i10 + 1911, i11, i12));
    }

    public final ChronoZonedDateTime P(Instant instant, ZoneId zoneId) {
        return n.W(this, instant, zoneId);
    }

    public final boolean S(long j10) {
        return v.f18100d.S(j10 + 1911);
    }

    public final ChronoLocalDate k(long j10) {
        return new F(LocalDate.h0(j10));
    }

    public final String l() {
        return "Minguo";
    }

    public final ChronoLocalDate o() {
        LocalDate e02 = LocalDate.e0(d.d());
        return e02 instanceof F ? (F) e02 : new F(LocalDate.V(e02));
    }

    public final String p() {
        return "roc";
    }

    public final ChronoZonedDateTime q(j jVar) {
        return super.q(jVar);
    }

    public final ChronoLocalDate r(int i10, int i11) {
        return new F(LocalDate.i0(i10 + 1911, i11));
    }

    public final s w(a aVar) {
        int i10 = C.f18052a[aVar.ordinal()];
        if (i10 == 1) {
            s o10 = a.PROLEPTIC_MONTH.o();
            return s.j(o10.e() - 22932, o10.d() - 22932);
        } else if (i10 == 2) {
            s o11 = a.YEAR.o();
            return s.l(o11.d() - 1911, (-o11.e()) + 1 + 1911);
        } else if (i10 != 3) {
            return aVar.o();
        } else {
            s o12 = a.YEAR.o();
            return s.j(o12.e() - 1911, o12.d() - 1911);
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new H((byte) 1, this);
    }

    public final List y() {
        return Arrays.asList(G.values());
    }

    public final p z(int i10) {
        if (i10 == 0) {
            return G.BEFORE_ROC;
        }
        if (i10 == 1) {
            return G.ROC;
        }
        throw new e("Invalid era: " + i10);
    }
}
