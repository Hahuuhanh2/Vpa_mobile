package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.C0338e;
import j$.time.temporal.a;
import j$.time.temporal.j;
import java.util.Locale;

final class i implements C0353g {
    i() {
    }

    public final boolean m(A a10, StringBuilder sb2) {
        StringBuilder sb3 = sb2;
        Long e10 = a10.e(a.INSTANT_SECONDS);
        j d10 = a10.d();
        a aVar = a.NANO_OF_SECOND;
        Long valueOf = d10.e(aVar) ? Long.valueOf(a10.d().h(aVar)) : null;
        int i10 = 0;
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int U = aVar.U(valueOf != null ? valueOf.longValue() : 0);
        if (longValue >= -62167219200L) {
            long j10 = (longValue - 315569520000L) + 62167219200L;
            long g2 = j$.time.a.g(j10, 315569520000L) + 1;
            LocalDateTime d02 = LocalDateTime.d0(j$.time.a.e(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (g2 > 0) {
                sb3.append('+');
                sb3.append(g2);
            }
            sb3.append(d02);
            if (d02.W() == 0) {
                sb3.append(":00");
            }
        } else {
            long j11 = longValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime d03 = LocalDateTime.d0(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb3.append(d03);
            if (d03.W() == 0) {
                sb3.append(":00");
            }
            if (j12 < 0) {
                if (d03.X() == -10000) {
                    sb3.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb3.insert(length, j12);
                } else {
                    sb3.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (U > 0) {
            sb3.append('.');
            int i11 = 100000000;
            while (true) {
                if (U <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = U / i11;
                sb3.append((char) (i12 + 48));
                U -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb3.append('Z');
        return true;
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        int i13 = i10;
        w wVar = new w();
        wVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        wVar.e('T');
        a aVar = a.HOUR_OF_DAY;
        wVar.m(aVar, 2);
        wVar.e(':');
        a aVar2 = a.MINUTE_OF_HOUR;
        wVar.m(aVar2, 2);
        wVar.e(':');
        a aVar3 = a.SECOND_OF_MINUTE;
        wVar.m(aVar3, 2);
        a aVar4 = a.NANO_OF_SECOND;
        int i14 = 0;
        wVar.b(aVar4, 0, 9, true);
        wVar.e('Z');
        C0352f h10 = wVar.v(Locale.getDefault()).h();
        x d10 = xVar.d();
        int n10 = h10.n(d10, charSequence, i13);
        if (n10 < 0) {
            return n10;
        }
        long longValue = d10.j(a.YEAR).longValue();
        int intValue = d10.j(a.MONTH_OF_YEAR).intValue();
        int intValue2 = d10.j(a.DAY_OF_MONTH).intValue();
        int intValue3 = d10.j(aVar).intValue();
        int intValue4 = d10.j(aVar2).intValue();
        Long j10 = d10.j(aVar3);
        Long j11 = d10.j(aVar4);
        int intValue5 = j10 != null ? j10.intValue() : 0;
        int intValue6 = j11 != null ? j11.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i12 = 0;
            i11 = intValue5;
            i14 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            xVar.p();
            i12 = intValue3;
            i11 = 59;
        } else {
            i12 = intValue3;
            i11 = intValue5;
        }
        try {
            x xVar2 = xVar;
            int i15 = i10;
            return xVar2.o(aVar4, (long) intValue6, i15, xVar2.o(a.INSTANT_SECONDS, j$.time.a.f(longValue / 10000, 315569520000L) + C0338e.p(LocalDateTime.b0(((int) longValue) % 10000, intValue, intValue2, i12, intValue4, i11).f0((long) i14), ZoneOffset.UTC), i15, n10));
        } catch (RuntimeException unused) {
            return ~i13;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
