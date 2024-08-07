package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.d;
import j$.time.e;
import j$.time.format.F;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class y extends C0337d implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final y f18103d = new y();
    private static final long serialVersionUID = 459996390165777884L;

    private y() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final ChronoLocalDate A(HashMap hashMap, F f10) {
        return (A) super.A(hashMap, f10);
    }

    public final int B(p pVar, int i10) {
        if (pVar instanceof B) {
            B b10 = (B) pVar;
            int year = (b10.p().getYear() + i10) - 1;
            if (i10 == 1) {
                return year;
            }
            if (year >= -999999999 && year <= 999999999 && year >= b10.p().getYear() && pVar == B.k(LocalDate.f0(year, 1, 1))) {
                return year;
            }
            throw new e("Invalid yearOfEra value");
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public final ChronoLocalDate G(j jVar) {
        return jVar instanceof A ? (A) jVar : new A(LocalDate.V(jVar));
    }

    public final C0341h L(j jVar) {
        return super.L(jVar);
    }

    public final ChronoLocalDate O(int i10, int i11, int i12) {
        return new A(LocalDate.f0(i10, i11, i12));
    }

    public final ChronoZonedDateTime P(Instant instant, ZoneId zoneId) {
        return n.W(this, instant, zoneId);
    }

    public final boolean S(long j10) {
        return v.f18100d.S(j10);
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate W(HashMap hashMap, F f10) {
        A a10;
        a aVar = a.ERA;
        Long l10 = (Long) hashMap.get(aVar);
        B r10 = l10 != null ? B.r(w(aVar).a(l10.longValue(), aVar)) : null;
        a aVar2 = a.YEAR_OF_ERA;
        Long l11 = (Long) hashMap.get(aVar2);
        int a11 = l11 != null ? w(aVar2).a(l11.longValue(), aVar2) : 0;
        if (r10 == null && l11 != null && !hashMap.containsKey(a.YEAR) && f10 != F.STRICT) {
            r10 = B.z()[B.z().length - 1];
        }
        if (!(l11 == null || r10 == null)) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (hashMap.containsKey(aVar3)) {
                a aVar4 = a.DAY_OF_MONTH;
                if (hashMap.containsKey(aVar4)) {
                    hashMap.remove(aVar);
                    hashMap.remove(aVar2);
                    if (f10 == F.LENIENT) {
                        return new A(LocalDate.f0((r10.p().getYear() + a11) - 1, 1, 1)).d(j$.time.a.h(((Long) hashMap.remove(aVar3)).longValue(), 1), ChronoUnit.MONTHS).d(j$.time.a.h(((Long) hashMap.remove(aVar4)).longValue(), 1), ChronoUnit.DAYS);
                    }
                    int a12 = w(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    int a13 = w(aVar4).a(((Long) hashMap.remove(aVar4)).longValue(), aVar4);
                    if (f10 != F.SMART) {
                        LocalDate localDate = A.f18043d;
                        LocalDate f02 = LocalDate.f0((r10.p().getYear() + a11) - 1, a12, a13);
                        if (!f02.a0(r10.p()) && r10 == B.k(f02)) {
                            return new A(r10, a11, f02);
                        }
                        throw new e("year, month, and day not valid for Era");
                    } else if (a11 >= 1) {
                        int year = (r10.p().getYear() + a11) - 1;
                        try {
                            a10 = new A(LocalDate.f0(year, a12, a13));
                        } catch (e unused) {
                            a10 = new A(LocalDate.f0(year, a12, 1)).n(new m(0));
                        }
                        if (a10.Y() == r10 || n.a(a10, a.YEAR_OF_ERA) <= 1 || a11 <= 1) {
                            return a10;
                        }
                        throw new e("Invalid YearOfEra for Era: " + r10 + " " + a11);
                    } else {
                        throw new e("Invalid YearOfEra: " + a11);
                    }
                }
            }
            a aVar5 = a.DAY_OF_YEAR;
            if (hashMap.containsKey(aVar5)) {
                hashMap.remove(aVar);
                hashMap.remove(aVar2);
                if (f10 == F.LENIENT) {
                    return new A(LocalDate.i0((r10.p().getYear() + a11) - 1, 1)).d(j$.time.a.h(((Long) hashMap.remove(aVar5)).longValue(), 1), ChronoUnit.DAYS);
                }
                int a14 = w(aVar5).a(((Long) hashMap.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = A.f18043d;
                int year2 = r10.p().getYear();
                LocalDate i02 = a11 == 1 ? LocalDate.i0(year2, (r10.p().X() + a14) - 1) : LocalDate.i0((year2 + a11) - 1, a14);
                if (!i02.a0(r10.p()) && r10 == B.k(i02)) {
                    return new A(r10, a11, i02);
                }
                throw new e("Invalid parameters");
            }
        }
        return null;
    }

    public final ChronoLocalDate k(long j10) {
        return new A(LocalDate.h0(j10));
    }

    public final String l() {
        return "Japanese";
    }

    public final ChronoLocalDate o() {
        LocalDate e02 = LocalDate.e0(d.d());
        return e02 instanceof A ? (A) e02 : new A(LocalDate.V(e02));
    }

    public final String p() {
        return "japanese";
    }

    public final ChronoZonedDateTime q(j jVar) {
        return super.q(jVar);
    }

    public final ChronoLocalDate r(int i10, int i11) {
        return new A(LocalDate.i0(i10, i11));
    }

    public final s w(a aVar) {
        switch (x.f18102a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new r("Unsupported field: " + aVar);
            case 5:
                return s.l(B.y(), (long) (999999999 - B.l().p().getYear()));
            case 6:
                return s.l(B.w(), a.DAY_OF_YEAR.o().d());
            case 7:
                return s.j((long) A.f18043d.getYear(), 999999999);
            case 8:
                return s.j((long) B.f18047d.getValue(), (long) B.l().getValue());
            default:
                return aVar.o();
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new H((byte) 1, this);
    }

    public final List y() {
        return Arrays.asList(B.z());
    }

    public final p z(int i10) {
        return B.r(i10);
    }
}
