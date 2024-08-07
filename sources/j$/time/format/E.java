package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.b;
import j$.time.chrono.C0337d;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.o;
import j$.time.e;
import j$.time.k;
import j$.time.r;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class E implements j {

    /* renamed from: a  reason: collision with root package name */
    final HashMap f18124a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    ZoneId f18125b;

    /* renamed from: c  reason: collision with root package name */
    o f18126c;

    /* renamed from: d  reason: collision with root package name */
    private F f18127d;

    /* renamed from: e  reason: collision with root package name */
    private ChronoLocalDate f18128e;

    /* renamed from: f  reason: collision with root package name */
    private k f18129f;

    /* renamed from: g  reason: collision with root package name */
    r f18130g = r.f18235d;

    E() {
    }

    private void k(j jVar) {
        Iterator it = this.f18124a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.o oVar = (j$.time.temporal.o) entry.getKey();
            if (jVar.e(oVar)) {
                try {
                    long h10 = jVar.h(oVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (h10 == longValue) {
                        it.remove();
                    } else {
                        throw new e("Conflict found: Field " + oVar + " " + h10 + " differs from " + oVar + " " + longValue + " derived from " + jVar);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void p() {
        if (this.f18124a.containsKey(a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f18125b;
            if (zoneId == null) {
                Long l10 = (Long) this.f18124a.get(a.OFFSET_SECONDS);
                if (l10 != null) {
                    zoneId = ZoneOffset.e0(l10.intValue());
                } else {
                    return;
                }
            }
            q(zoneId);
        }
    }

    private void q(ZoneId zoneId) {
        HashMap hashMap = this.f18124a;
        a aVar = a.INSTANT_SECONDS;
        ChronoZonedDateTime P = this.f18126c.P(Instant.Y(((Long) hashMap.remove(aVar)).longValue()), zoneId);
        y(P.f());
        z(aVar, a.SECOND_OF_DAY, Long.valueOf((long) P.b().l0()));
    }

    private void r(long j10, long j11, long j12, long j13) {
        k b02;
        r rVar;
        if (this.f18127d == F.LENIENT) {
            long d10 = j$.time.a.d(j$.time.a.d(j$.time.a.d(j$.time.a.f(j10, 3600000000000L), j$.time.a.f(j11, 60000000000L)), j$.time.a.f(j12, 1000000000)), j13);
            b02 = k.c0(j$.time.a.e(d10, 86400000000000L));
            rVar = r.c((int) j$.time.a.g(d10, 86400000000000L));
        } else {
            int U = a.MINUTE_OF_HOUR.U(j11);
            int U2 = a.NANO_OF_SECOND.U(j13);
            if (this.f18127d == F.SMART && j10 == 24 && U == 0 && j12 == 0 && U2 == 0) {
                b02 = k.f18221g;
                rVar = r.c(1);
            } else {
                b02 = k.b0(a.HOUR_OF_DAY.U(j10), U, a.SECOND_OF_MINUTE.U(j12), U2);
                rVar = r.f18235d;
            }
        }
        w(b02, rVar);
    }

    private void t() {
        Long l10;
        a aVar;
        HashMap hashMap = this.f18124a;
        a aVar2 = a.CLOCK_HOUR_OF_DAY;
        long j10 = 0;
        if (hashMap.containsKey(aVar2)) {
            long longValue = ((Long) this.f18124a.remove(aVar2)).longValue();
            F f10 = this.f18127d;
            if (f10 == F.STRICT || (f10 == F.SMART && longValue != 0)) {
                aVar2.V(longValue);
            }
            a aVar3 = a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            z(aVar2, aVar3, Long.valueOf(longValue));
        }
        HashMap hashMap2 = this.f18124a;
        a aVar4 = a.CLOCK_HOUR_OF_AMPM;
        if (hashMap2.containsKey(aVar4)) {
            long longValue2 = ((Long) this.f18124a.remove(aVar4)).longValue();
            F f11 = this.f18127d;
            if (f11 == F.STRICT || (f11 == F.SMART && longValue2 != 0)) {
                aVar4.V(longValue2);
            }
            a aVar5 = a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j10 = longValue2;
            }
            z(aVar4, aVar5, Long.valueOf(j10));
        }
        HashMap hashMap3 = this.f18124a;
        a aVar6 = a.AMPM_OF_DAY;
        if (hashMap3.containsKey(aVar6)) {
            HashMap hashMap4 = this.f18124a;
            a aVar7 = a.HOUR_OF_AMPM;
            if (hashMap4.containsKey(aVar7)) {
                long longValue3 = ((Long) this.f18124a.remove(aVar6)).longValue();
                long longValue4 = ((Long) this.f18124a.remove(aVar7)).longValue();
                if (this.f18127d == F.LENIENT) {
                    aVar = a.HOUR_OF_DAY;
                    l10 = Long.valueOf(j$.time.a.d(j$.time.a.f(longValue3, (long) 12), longValue4));
                } else {
                    aVar6.V(longValue3);
                    aVar7.V(longValue3);
                    aVar = a.HOUR_OF_DAY;
                    l10 = Long.valueOf((longValue3 * 12) + longValue4);
                }
                z(aVar6, aVar, l10);
            }
        }
        HashMap hashMap5 = this.f18124a;
        a aVar8 = a.NANO_OF_DAY;
        if (hashMap5.containsKey(aVar8)) {
            long longValue5 = ((Long) this.f18124a.remove(aVar8)).longValue();
            if (this.f18127d != F.LENIENT) {
                aVar8.V(longValue5);
            }
            z(aVar8, a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            z(aVar8, a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            z(aVar8, a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            z(aVar8, a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        HashMap hashMap6 = this.f18124a;
        a aVar9 = a.MICRO_OF_DAY;
        if (hashMap6.containsKey(aVar9)) {
            long longValue6 = ((Long) this.f18124a.remove(aVar9)).longValue();
            if (this.f18127d != F.LENIENT) {
                aVar9.V(longValue6);
            }
            z(aVar9, a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            z(aVar9, a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        HashMap hashMap7 = this.f18124a;
        a aVar10 = a.MILLI_OF_DAY;
        if (hashMap7.containsKey(aVar10)) {
            long longValue7 = ((Long) this.f18124a.remove(aVar10)).longValue();
            if (this.f18127d != F.LENIENT) {
                aVar10.V(longValue7);
            }
            z(aVar10, a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            z(aVar10, a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        HashMap hashMap8 = this.f18124a;
        a aVar11 = a.SECOND_OF_DAY;
        if (hashMap8.containsKey(aVar11)) {
            long longValue8 = ((Long) this.f18124a.remove(aVar11)).longValue();
            if (this.f18127d != F.LENIENT) {
                aVar11.V(longValue8);
            }
            z(aVar11, a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            z(aVar11, a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            z(aVar11, a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        HashMap hashMap9 = this.f18124a;
        a aVar12 = a.MINUTE_OF_DAY;
        if (hashMap9.containsKey(aVar12)) {
            long longValue9 = ((Long) this.f18124a.remove(aVar12)).longValue();
            if (this.f18127d != F.LENIENT) {
                aVar12.V(longValue9);
            }
            z(aVar12, a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            z(aVar12, a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        HashMap hashMap10 = this.f18124a;
        a aVar13 = a.NANO_OF_SECOND;
        if (hashMap10.containsKey(aVar13)) {
            long longValue10 = ((Long) this.f18124a.get(aVar13)).longValue();
            F f12 = this.f18127d;
            F f13 = F.LENIENT;
            if (f12 != f13) {
                aVar13.V(longValue10);
            }
            HashMap hashMap11 = this.f18124a;
            a aVar14 = a.MICRO_OF_SECOND;
            if (hashMap11.containsKey(aVar14)) {
                long longValue11 = ((Long) this.f18124a.remove(aVar14)).longValue();
                if (this.f18127d != f13) {
                    aVar14.V(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                z(aVar14, aVar13, Long.valueOf(longValue10));
            }
            HashMap hashMap12 = this.f18124a;
            a aVar15 = a.MILLI_OF_SECOND;
            if (hashMap12.containsKey(aVar15)) {
                long longValue12 = ((Long) this.f18124a.remove(aVar15)).longValue();
                if (this.f18127d != f13) {
                    aVar15.V(longValue12);
                }
                z(aVar15, aVar13, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        HashMap hashMap13 = this.f18124a;
        a aVar16 = a.HOUR_OF_DAY;
        if (hashMap13.containsKey(aVar16)) {
            HashMap hashMap14 = this.f18124a;
            a aVar17 = a.MINUTE_OF_HOUR;
            if (hashMap14.containsKey(aVar17)) {
                HashMap hashMap15 = this.f18124a;
                a aVar18 = a.SECOND_OF_MINUTE;
                if (hashMap15.containsKey(aVar18) && this.f18124a.containsKey(aVar13)) {
                    r(((Long) this.f18124a.remove(aVar16)).longValue(), ((Long) this.f18124a.remove(aVar17)).longValue(), ((Long) this.f18124a.remove(aVar18)).longValue(), ((Long) this.f18124a.remove(aVar13)).longValue());
                }
            }
        }
    }

    private void w(k kVar, r rVar) {
        k kVar2 = this.f18129f;
        if (kVar2 == null) {
            this.f18129f = kVar;
        } else if (kVar2.equals(kVar)) {
            r rVar2 = this.f18130g;
            rVar2.getClass();
            r rVar3 = r.f18235d;
            boolean z10 = true;
            if (!(rVar2 == rVar3)) {
                if (rVar != rVar3) {
                    z10 = false;
                }
                if (!z10 && !this.f18130g.equals(rVar)) {
                    StringBuilder b10 = b.b("Conflict found: Fields resolved to different excess periods: ");
                    b10.append(this.f18130g);
                    b10.append(" ");
                    b10.append(rVar);
                    throw new e(b10.toString());
                }
            }
        } else {
            StringBuilder b11 = b.b("Conflict found: Fields resolved to different times: ");
            b11.append(this.f18129f);
            b11.append(" ");
            b11.append(kVar);
            throw new e(b11.toString());
        }
        this.f18130g = rVar;
    }

    private void y(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f18128e;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate != null && !chronoLocalDate2.equals(chronoLocalDate)) {
                StringBuilder b10 = b.b("Conflict found: Fields resolved to two different dates: ");
                b10.append(this.f18128e);
                b10.append(" ");
                b10.append(chronoLocalDate);
                throw new e(b10.toString());
            }
        } else if (chronoLocalDate != null) {
            if (((C0337d) this.f18126c).equals(chronoLocalDate.a())) {
                this.f18128e = chronoLocalDate;
                return;
            }
            StringBuilder b11 = b.b("ChronoLocalDate must use the effective parsed chronology: ");
            b11.append(this.f18126c);
            throw new e(b11.toString());
        }
    }

    private void z(a aVar, a aVar2, Long l10) {
        Long l11 = (Long) this.f18124a.put(aVar2, l10);
        if (l11 != null && l11.longValue() != l10.longValue()) {
            throw new e("Conflict found: " + aVar2 + " " + l11 + " differs from " + aVar2 + " " + l10 + " while resolving  " + aVar);
        }
    }

    public final Object K(p pVar) {
        if (pVar == n.l()) {
            return this.f18125b;
        }
        if (pVar == n.e()) {
            return this.f18126c;
        }
        if (pVar == n.f()) {
            ChronoLocalDate chronoLocalDate = this.f18128e;
            if (chronoLocalDate != null) {
                return LocalDate.V(chronoLocalDate);
            }
            return null;
        } else if (pVar == n.g()) {
            return this.f18129f;
        } else {
            if (pVar == n.k() || pVar == n.i()) {
                return pVar.h(this);
            }
            if (pVar == n.j()) {
                return null;
            }
            return pVar.h(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.f18128e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f18129f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(j$.time.temporal.o r2) {
        /*
            r1 = this;
            java.util.HashMap r0 = r1.f18124a
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x002c
            j$.time.chrono.ChronoLocalDate r0 = r1.f18128e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.e(r2)
            if (r0 != 0) goto L_0x002c
        L_0x0012:
            j$.time.k r0 = r1.f18129f
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.e(r2)
            if (r0 == 0) goto L_0x001d
            goto L_0x002c
        L_0x001d:
            if (r2 == 0) goto L_0x002a
            boolean r0 = r2 instanceof j$.time.temporal.a
            if (r0 != 0) goto L_0x002a
            boolean r2 = r2.m(r1)
            if (r2 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r2 = 0
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.E.e(j$.time.temporal.o):boolean");
    }

    public final long h(j$.time.temporal.o oVar) {
        if (oVar != null) {
            Long l10 = (Long) this.f18124a.get(oVar);
            if (l10 != null) {
                return l10.longValue();
            }
            ChronoLocalDate chronoLocalDate = this.f18128e;
            if (chronoLocalDate != null && chronoLocalDate.e(oVar)) {
                return this.f18128e.h(oVar);
            }
            k kVar = this.f18129f;
            if (kVar != null && kVar.e(oVar)) {
                return this.f18129f.h(oVar);
            }
            if (!(oVar instanceof a)) {
                return oVar.K(this);
            }
            throw new j$.time.temporal.r(b.a("Unsupported field: ", oVar));
        }
        throw new NullPointerException("field");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(j$.time.format.F r19, java.util.Set r20) {
        /*
            r18 = this;
            r9 = r18
            r0 = r20
            if (r0 == 0) goto L_0x000f
            java.util.HashMap r1 = r9.f18124a
            java.util.Set r1 = r1.keySet()
            r1.retainAll(r0)
        L_0x000f:
            r0 = r19
            r9.f18127d = r0
            r18.p()
            j$.time.chrono.o r0 = r9.f18126c
            java.util.HashMap r1 = r9.f18124a
            j$.time.format.F r2 = r9.f18127d
            j$.time.chrono.ChronoLocalDate r0 = r0.A(r1, r2)
            r9.y(r0)
            r18.t()
            java.util.HashMap r0 = r9.f18124a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00ef
            r0 = 0
        L_0x002f:
            r1 = 50
            if (r0 >= r1) goto L_0x00cf
            java.util.HashMap r2 = r9.f18124a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00cf
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            j$.time.temporal.o r3 = (j$.time.temporal.o) r3
            java.util.HashMap r4 = r9.f18124a
            j$.time.format.F r5 = r9.f18127d
            j$.time.temporal.j r4 = r3.t(r4, r9, r5)
            if (r4 == 0) goto L_0x00c3
            boolean r1 = r4 instanceof j$.time.chrono.ChronoZonedDateTime
            if (r1 == 0) goto L_0x008e
            j$.time.chrono.ChronoZonedDateTime r4 = (j$.time.chrono.ChronoZonedDateTime) r4
            j$.time.ZoneId r1 = r9.f18125b
            if (r1 != 0) goto L_0x006a
            j$.time.ZoneId r1 = r4.H()
            r9.f18125b = r1
            goto L_0x0074
        L_0x006a:
            j$.time.ZoneId r2 = r4.H()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
        L_0x0074:
            j$.time.chrono.h r4 = r4.u()
            goto L_0x008e
        L_0x0079:
            j$.time.e r0 = new j$.time.e
            java.lang.String r1 = "ChronoZonedDateTime must use the effective parsed zone: "
            java.lang.StringBuilder r1 = j$.time.b.b(r1)
            j$.time.ZoneId r2 = r9.f18125b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            boolean r1 = r4 instanceof j$.time.chrono.C0341h
            if (r1 == 0) goto L_0x00a5
            j$.time.chrono.h r4 = (j$.time.chrono.C0341h) r4
            j$.time.k r1 = r4.b()
            j$.time.r r2 = j$.time.r.f18235d
            r9.w(r1, r2)
            j$.time.chrono.ChronoLocalDate r1 = r4.f()
            r9.y(r1)
            goto L_0x00cb
        L_0x00a5:
            boolean r1 = r4 instanceof j$.time.chrono.ChronoLocalDate
            if (r1 == 0) goto L_0x00af
            j$.time.chrono.ChronoLocalDate r4 = (j$.time.chrono.ChronoLocalDate) r4
            r9.y(r4)
            goto L_0x00cb
        L_0x00af:
            boolean r1 = r4 instanceof j$.time.k
            if (r1 == 0) goto L_0x00bb
            j$.time.k r4 = (j$.time.k) r4
            j$.time.r r1 = j$.time.r.f18235d
            r9.w(r4, r1)
            goto L_0x00cb
        L_0x00bb:
            j$.time.e r0 = new j$.time.e
            java.lang.String r1 = "Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime"
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            java.util.HashMap r4 = r9.f18124a
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L_0x003d
        L_0x00cb:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x00cf:
            if (r0 == r1) goto L_0x00e7
            if (r0 <= 0) goto L_0x00ef
            r18.p()
            j$.time.chrono.o r0 = r9.f18126c
            java.util.HashMap r1 = r9.f18124a
            j$.time.format.F r2 = r9.f18127d
            j$.time.chrono.ChronoLocalDate r0 = r0.A(r1, r2)
            r9.y(r0)
            r18.t()
            goto L_0x00ef
        L_0x00e7:
            j$.time.e r0 = new j$.time.e
            java.lang.String r1 = "One of the parsed fields has an incorrectly implemented resolve method"
            r0.<init>(r1)
            throw r0
        L_0x00ef:
            j$.time.k r0 = r9.f18129f
            r10 = 1000(0x3e8, double:4.94E-321)
            r1 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 != 0) goto L_0x01d9
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r3 = j$.time.temporal.a.MILLI_OF_SECOND
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0140
            java.util.HashMap r0 = r9.f18124a
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r6 = j$.time.temporal.a.MICRO_OF_SECOND
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0134
            long r4 = r4 * r10
            java.util.HashMap r0 = r9.f18124a
            java.lang.Object r0 = r0.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = r0 % r10
            long r0 = r0 + r4
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r9.z(r3, r6, r2)
            java.util.HashMap r2 = r9.f18124a
            r2.remove(r6)
            goto L_0x0156
        L_0x0134:
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r3 = j$.time.temporal.a.NANO_OF_SECOND
            long r4 = r4 * r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r2 = r0
            r0 = r1
            goto L_0x015f
        L_0x0140:
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.MICRO_OF_SECOND
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0162
            java.util.HashMap r0 = r9.f18124a
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x0156:
            java.util.HashMap r2 = r9.f18124a
            j$.time.temporal.a r3 = j$.time.temporal.a.NANO_OF_SECOND
            long r0 = r0 * r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x015f:
            r2.put(r3, r0)
        L_0x0162:
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r12 = j$.time.temporal.a.HOUR_OF_DAY
            java.lang.Object r0 = r0.get(r12)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x01d9
            java.util.HashMap r1 = r9.f18124a
            j$.time.temporal.a r13 = j$.time.temporal.a.MINUTE_OF_HOUR
            java.lang.Object r1 = r1.get(r13)
            java.lang.Long r1 = (java.lang.Long) r1
            java.util.HashMap r2 = r9.f18124a
            j$.time.temporal.a r14 = j$.time.temporal.a.SECOND_OF_MINUTE
            java.lang.Object r2 = r2.get(r14)
            java.lang.Long r2 = (java.lang.Long) r2
            java.util.HashMap r3 = r9.f18124a
            j$.time.temporal.a r15 = j$.time.temporal.a.NANO_OF_SECOND
            java.lang.Object r3 = r3.get(r15)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r1 != 0) goto L_0x0192
            if (r2 != 0) goto L_0x021d
            if (r3 != 0) goto L_0x021d
        L_0x0192:
            if (r1 == 0) goto L_0x019a
            if (r2 != 0) goto L_0x019a
            if (r3 == 0) goto L_0x019a
            goto L_0x021d
        L_0x019a:
            if (r1 == 0) goto L_0x01a1
            long r4 = r1.longValue()
            goto L_0x01a3
        L_0x01a1:
            r4 = 0
        L_0x01a3:
            if (r2 == 0) goto L_0x01aa
            long r1 = r2.longValue()
            goto L_0x01ac
        L_0x01aa:
            r1 = 0
        L_0x01ac:
            r6 = r1
            if (r3 == 0) goto L_0x01b4
            long r1 = r3.longValue()
            goto L_0x01b6
        L_0x01b4:
            r1 = 0
        L_0x01b6:
            r16 = r1
            long r1 = r0.longValue()
            r0 = r18
            r3 = r4
            r5 = r6
            r7 = r16
            r0.r(r1, r3, r5, r7)
            java.util.HashMap r0 = r9.f18124a
            r0.remove(r12)
            java.util.HashMap r0 = r9.f18124a
            r0.remove(r13)
            java.util.HashMap r0 = r9.f18124a
            r0.remove(r14)
            java.util.HashMap r0 = r9.f18124a
            r0.remove(r15)
        L_0x01d9:
            j$.time.format.F r0 = r9.f18127d
            j$.time.format.F r1 = j$.time.format.F.LENIENT
            if (r0 == r1) goto L_0x021d
            java.util.HashMap r0 = r9.f18124a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x021d
            java.util.HashMap r0 = r9.f18124a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01f1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x021d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            j$.time.temporal.o r2 = (j$.time.temporal.o) r2
            boolean r3 = r2 instanceof j$.time.temporal.a
            if (r3 == 0) goto L_0x01f1
            boolean r3 = r2.isTimeBased()
            if (r3 == 0) goto L_0x01f1
            j$.time.temporal.a r2 = (j$.time.temporal.a) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r2.V(r3)
            goto L_0x01f1
        L_0x021d:
            j$.time.chrono.ChronoLocalDate r0 = r9.f18128e
            if (r0 == 0) goto L_0x0224
            r9.k(r0)
        L_0x0224:
            j$.time.k r0 = r9.f18129f
            if (r0 == 0) goto L_0x0242
            r9.k(r0)
            j$.time.chrono.ChronoLocalDate r0 = r9.f18128e
            if (r0 == 0) goto L_0x0242
            java.util.HashMap r0 = r9.f18124a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0242
            j$.time.chrono.ChronoLocalDate r0 = r9.f18128e
            j$.time.k r1 = r9.f18129f
            j$.time.chrono.h r0 = r0.J(r1)
            r9.k(r0)
        L_0x0242:
            j$.time.chrono.ChronoLocalDate r0 = r9.f18128e
            if (r0 == 0) goto L_0x0264
            j$.time.k r0 = r9.f18129f
            if (r0 == 0) goto L_0x0264
            j$.time.r r0 = r9.f18130g
            r0.getClass()
            j$.time.r r1 = j$.time.r.f18235d
            if (r0 != r1) goto L_0x0255
            r0 = 1
            goto L_0x0256
        L_0x0255:
            r0 = 0
        L_0x0256:
            if (r0 != 0) goto L_0x0264
            j$.time.chrono.ChronoLocalDate r0 = r9.f18128e
            j$.time.r r2 = r9.f18130g
            j$.time.chrono.ChronoLocalDate r0 = r0.C(r2)
            r9.f18128e = r0
            r9.f18130g = r1
        L_0x0264:
            j$.time.k r0 = r9.f18129f
            if (r0 != 0) goto L_0x02da
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.INSTANT_SECONDS
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0286
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.SECOND_OF_DAY
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0286
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.SECOND_OF_MINUTE
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x02da
        L_0x0286:
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.NANO_OF_SECOND
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x02b9
            java.util.HashMap r0 = r9.f18124a
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            java.util.HashMap r2 = r9.f18124a
            j$.time.temporal.a r3 = j$.time.temporal.a.MICRO_OF_SECOND
            long r4 = r0 / r10
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            java.util.HashMap r2 = r9.f18124a
            j$.time.temporal.a r3 = j$.time.temporal.a.MILLI_OF_SECOND
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            goto L_0x02da
        L_0x02b9:
            java.util.HashMap r0 = r9.f18124a
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.put(r1, r4)
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.MICRO_OF_SECOND
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.put(r1, r4)
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.MILLI_OF_SECOND
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
        L_0x02da:
            j$.time.chrono.ChronoLocalDate r0 = r9.f18128e
            if (r0 == 0) goto L_0x0320
            j$.time.k r1 = r9.f18129f
            if (r1 == 0) goto L_0x0320
            j$.time.ZoneId r2 = r9.f18125b
            if (r2 == 0) goto L_0x02f1
            j$.time.chrono.h r0 = r0.J(r1)
            j$.time.ZoneId r1 = r9.f18125b
            j$.time.chrono.ChronoZonedDateTime r0 = r0.F(r1)
            goto L_0x0311
        L_0x02f1:
            java.util.HashMap r0 = r9.f18124a
            j$.time.temporal.a r1 = j$.time.temporal.a.OFFSET_SECONDS
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0320
            int r0 = r0.intValue()
            j$.time.ZoneOffset r0 = j$.time.ZoneOffset.e0(r0)
            j$.time.chrono.ChronoLocalDate r1 = r9.f18128e
            j$.time.k r2 = r9.f18129f
            j$.time.chrono.h r1 = r1.J(r2)
            j$.time.chrono.ChronoZonedDateTime r0 = r1.F(r0)
        L_0x0311:
            j$.time.temporal.a r1 = j$.time.temporal.a.INSTANT_SECONDS
            long r2 = r0.h(r1)
            java.util.HashMap r0 = r9.f18124a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
        L_0x0320:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.E.l(j$.time.format.F, java.util.Set):void");
    }

    public final /* synthetic */ int m(j$.time.temporal.o oVar) {
        return n.a(this, oVar);
    }

    public final /* synthetic */ s o(j$.time.temporal.o oVar) {
        return n.d(this, oVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f18124a);
        sb2.append(',');
        sb2.append(this.f18126c);
        if (this.f18125b != null) {
            sb2.append(',');
            sb2.append(this.f18125b);
        }
        if (!(this.f18128e == null && this.f18129f == null)) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f18128e;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f18129f != null) {
                    sb2.append('T');
                }
            }
            sb2.append(this.f18129f);
        }
        return sb2.toString();
    }
}
