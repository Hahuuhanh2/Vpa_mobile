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

public final class J extends C0337d implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final J f18060d = new J();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private J() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final ChronoLocalDate A(HashMap hashMap, F f10) {
        return (L) super.A(hashMap, f10);
    }

    public final int B(p pVar, int i10) {
        if (pVar instanceof M) {
            return pVar == M.BE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public final ChronoLocalDate G(j jVar) {
        return jVar instanceof L ? (L) jVar : new L(LocalDate.V(jVar));
    }

    public final C0341h L(j jVar) {
        return super.L(jVar);
    }

    public final ChronoLocalDate O(int i10, int i11, int i12) {
        return new L(LocalDate.f0(i10 - 543, i11, i12));
    }

    public final ChronoZonedDateTime P(Instant instant, ZoneId zoneId) {
        return n.W(this, instant, zoneId);
    }

    public final boolean S(long j10) {
        return v.f18100d.S(j10 - 543);
    }

    public final ChronoLocalDate k(long j10) {
        return new L(LocalDate.h0(j10));
    }

    public final String l() {
        return "ThaiBuddhist";
    }

    public final ChronoLocalDate o() {
        LocalDate e02 = LocalDate.e0(d.d());
        return e02 instanceof L ? (L) e02 : new L(LocalDate.V(e02));
    }

    public final String p() {
        return "buddhist";
    }

    public final ChronoZonedDateTime q(j jVar) {
        return super.q(jVar);
    }

    public final ChronoLocalDate r(int i10, int i11) {
        return new L(LocalDate.i0(i10 - 543, i11));
    }

    public final s w(a aVar) {
        int i10 = I.f18059a[aVar.ordinal()];
        if (i10 == 1) {
            s o10 = a.PROLEPTIC_MONTH.o();
            return s.j(o10.e() + 6516, o10.d() + 6516);
        } else if (i10 == 2) {
            s o11 = a.YEAR.o();
            return s.l((-(o11.e() + 543)) + 1, o11.d() + 543);
        } else if (i10 != 3) {
            return aVar.o();
        } else {
            s o12 = a.YEAR.o();
            return s.j(o12.e() + 543, o12.d() + 543);
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new H((byte) 1, this);
    }

    public final List y() {
        return Arrays.asList(M.values());
    }

    public final p z(int i10) {
        if (i10 == 0) {
            return M.BEFORE_BE;
        }
        if (i10 == 1) {
            return M.BE;
        }
        throw new e("Invalid era: " + i10);
    }
}
