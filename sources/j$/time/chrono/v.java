package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.d;
import j$.time.e;
import j$.time.format.F;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.s;
import j$.time.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class v extends C0337d implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final v f18100d = new v();
    private static final long serialVersionUID = -1440403870442975015L;

    private v() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final ChronoLocalDate A(HashMap hashMap, F f10) {
        return (LocalDate) super.A(hashMap, f10);
    }

    public final int B(p pVar, int i10) {
        if (pVar instanceof w) {
            return pVar == w.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public final ChronoLocalDate G(j jVar) {
        return LocalDate.V(jVar);
    }

    public final C0341h L(j jVar) {
        return LocalDateTime.U(jVar);
    }

    public final ChronoLocalDate O(int i10, int i11, int i12) {
        return LocalDate.f0(i10, i11, i12);
    }

    public final ChronoZonedDateTime P(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    public final boolean S(long j10) {
        return (3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0);
    }

    /* access modifiers changed from: package-private */
    public final void U(HashMap hashMap, F f10) {
        a aVar = a.PROLEPTIC_MONTH;
        Long l10 = (Long) hashMap.remove(aVar);
        if (l10 != null) {
            if (f10 != F.LENIENT) {
                aVar.V(l10.longValue());
            }
            long j10 = (long) 12;
            C0337d.m(hashMap, a.MONTH_OF_YEAR, (long) (((int) j$.time.a.e(l10.longValue(), j10)) + 1));
            C0337d.m(hashMap, a.YEAR, j$.time.a.g(l10.longValue(), j10));
        }
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate V(HashMap hashMap, F f10) {
        int i10;
        a aVar = a.YEAR;
        int U = aVar.U(((Long) hashMap.remove(aVar)).longValue());
        boolean z10 = true;
        if (f10 == F.LENIENT) {
            long h10 = j$.time.a.h(((Long) hashMap.remove(a.MONTH_OF_YEAR)).longValue(), 1);
            return LocalDate.f0(U, 1, 1).k0(h10).plusDays(j$.time.a.h(((Long) hashMap.remove(a.DAY_OF_MONTH)).longValue(), 1));
        }
        a aVar2 = a.MONTH_OF_YEAR;
        int U2 = aVar2.U(((Long) hashMap.remove(aVar2)).longValue());
        a aVar3 = a.DAY_OF_MONTH;
        int U3 = aVar3.U(((Long) hashMap.remove(aVar3)).longValue());
        if (f10 == F.SMART) {
            if (U2 == 4 || U2 == 6 || U2 == 9 || U2 == 11) {
                i10 = 30;
            } else if (U2 == 2) {
                Month month = Month.FEBRUARY;
                long j10 = (long) U;
                int i11 = u.f18288b;
                if ((3 & j10) != 0 || (j10 % 100 == 0 && j10 % 400 != 0)) {
                    z10 = false;
                }
                i10 = month.U(z10);
            }
            U3 = Math.min(U3, i10);
        }
        return LocalDate.f0(U, U2, U3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r11 > 0) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.time.chrono.ChronoLocalDate W(java.util.HashMap r10, j$.time.format.F r11) {
        /*
            r9 = this;
            j$.time.temporal.a r0 = j$.time.temporal.a.YEAR_OF_ERA
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x009a
            j$.time.format.F r2 = j$.time.format.F.LENIENT
            if (r11 == r2) goto L_0x0015
            long r2 = r1.longValue()
            r0.V(r2)
        L_0x0015:
            j$.time.temporal.a r2 = j$.time.temporal.a.ERA
            java.lang.Object r2 = r10.remove(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L_0x005e
            j$.time.temporal.a r2 = j$.time.temporal.a.YEAR
            java.lang.Object r7 = r10.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            j$.time.format.F r8 = j$.time.format.F.STRICT
            if (r11 != r8) goto L_0x0042
            if (r7 == 0) goto L_0x003e
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            long r0 = r1.longValue()
            if (r11 <= 0) goto L_0x0051
            goto L_0x005a
        L_0x003e:
            r10.put(r0, r1)
            goto L_0x00af
        L_0x0042:
            if (r7 == 0) goto L_0x0056
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            long r0 = r1.longValue()
        L_0x0051:
            long r0 = j$.time.a.h(r5, r0)
            goto L_0x005a
        L_0x0056:
            long r0 = r1.longValue()
        L_0x005a:
            j$.time.chrono.C0337d.m(r10, r2, r0)
            goto L_0x00af
        L_0x005e:
            long r7 = r2.longValue()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x006d
            j$.time.temporal.a r11 = j$.time.temporal.a.YEAR
            long r0 = r1.longValue()
            goto L_0x007f
        L_0x006d:
            long r7 = r2.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0083
            j$.time.temporal.a r11 = j$.time.temporal.a.YEAR
            long r0 = r1.longValue()
            long r0 = j$.time.a.h(r5, r0)
        L_0x007f:
            j$.time.chrono.C0337d.m(r10, r11, r0)
            goto L_0x00af
        L_0x0083:
            j$.time.e r10 = new j$.time.e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid value for era: "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x009a:
            j$.time.temporal.a r11 = j$.time.temporal.a.ERA
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto L_0x00af
            java.lang.Object r10 = r10.get(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            r11.V(r0)
        L_0x00af:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.v.W(java.util.HashMap, j$.time.format.F):j$.time.chrono.ChronoLocalDate");
    }

    public final ChronoLocalDate k(long j10) {
        return LocalDate.h0(j10);
    }

    public final String l() {
        return "ISO";
    }

    public final ChronoLocalDate o() {
        return LocalDate.V(LocalDate.e0(d.d()));
    }

    public final String p() {
        return "iso8601";
    }

    public final ChronoZonedDateTime q(j jVar) {
        return ZonedDateTime.U(jVar);
    }

    public final ChronoLocalDate r(int i10, int i11) {
        return LocalDate.i0(i10, i11);
    }

    public final s w(a aVar) {
        return aVar.o();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new H((byte) 1, this);
    }

    public final List y() {
        return Arrays.asList(w.values());
    }

    public final p z(int i10) {
        if (i10 == 0) {
            return w.BCE;
        }
        if (i10 == 1) {
            return w.CE;
        }
        throw new e("Invalid era: " + i10);
    }
}
