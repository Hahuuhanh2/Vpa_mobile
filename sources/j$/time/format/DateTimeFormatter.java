package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.o;
import j$.time.chrono.v;
import j$.time.e;
import j$.time.h;
import j$.time.temporal.a;
import j$.time.temporal.i;
import j$.time.temporal.j;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: h  reason: collision with root package name */
    public static final DateTimeFormatter f18116h;

    /* renamed from: a  reason: collision with root package name */
    private final C0352f f18117a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f18118b;

    /* renamed from: c  reason: collision with root package name */
    private final D f18119c;

    /* renamed from: d  reason: collision with root package name */
    private final F f18120d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f18121e = null;

    /* renamed from: f  reason: collision with root package name */
    private final o f18122f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneId f18123g;

    static {
        w wVar = new w();
        a aVar = a.YEAR;
        wVar.n(aVar, 4, 10, 5);
        wVar.e('-');
        a aVar2 = a.MONTH_OF_YEAR;
        wVar.m(aVar2, 2);
        wVar.e('-');
        a aVar3 = a.DAY_OF_MONTH;
        wVar.m(aVar3, 2);
        F f10 = F.STRICT;
        v vVar = v.f18100d;
        DateTimeFormatter u10 = wVar.u(f10, vVar);
        ISO_LOCAL_DATE = u10;
        w wVar2 = new w();
        wVar2.r();
        wVar2.a(u10);
        wVar2.h();
        wVar2.u(f10, vVar);
        w wVar3 = new w();
        wVar3.r();
        wVar3.a(u10);
        wVar3.q();
        wVar3.h();
        wVar3.u(f10, vVar);
        w wVar4 = new w();
        a aVar4 = a.HOUR_OF_DAY;
        wVar4.m(aVar4, 2);
        wVar4.e(':');
        a aVar5 = a.MINUTE_OF_HOUR;
        wVar4.m(aVar5, 2);
        wVar4.q();
        wVar4.e(':');
        a aVar6 = a.SECOND_OF_MINUTE;
        wVar4.m(aVar6, 2);
        wVar4.q();
        wVar4.b(a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter u11 = wVar4.u(f10, (v) null);
        w wVar5 = new w();
        wVar5.r();
        wVar5.a(u11);
        wVar5.h();
        wVar5.u(f10, (v) null);
        w wVar6 = new w();
        wVar6.r();
        wVar6.a(u11);
        wVar6.q();
        wVar6.h();
        wVar6.u(f10, (v) null);
        w wVar7 = new w();
        wVar7.r();
        wVar7.a(u10);
        wVar7.e('T');
        wVar7.a(u11);
        DateTimeFormatter u12 = wVar7.u(f10, vVar);
        w wVar8 = new w();
        wVar8.r();
        wVar8.a(u12);
        wVar8.h();
        DateTimeFormatter u13 = wVar8.u(f10, vVar);
        w wVar9 = new w();
        wVar9.a(u13);
        wVar9.q();
        wVar9.e('[');
        wVar9.s();
        wVar9.o();
        wVar9.e(']');
        wVar9.u(f10, vVar);
        w wVar10 = new w();
        wVar10.a(u12);
        wVar10.q();
        wVar10.h();
        wVar10.q();
        wVar10.e('[');
        wVar10.s();
        wVar10.o();
        wVar10.e(']');
        wVar10.u(f10, vVar);
        w wVar11 = new w();
        wVar11.r();
        wVar11.n(aVar, 4, 10, 5);
        wVar11.e('-');
        wVar11.m(a.DAY_OF_YEAR, 3);
        wVar11.q();
        wVar11.h();
        wVar11.u(f10, vVar);
        w wVar12 = new w();
        wVar12.r();
        wVar12.n(i.f18263c, 4, 10, 5);
        wVar12.f("-W");
        wVar12.m(i.f18262b, 2);
        wVar12.e('-');
        a aVar7 = a.DAY_OF_WEEK;
        wVar12.m(aVar7, 1);
        wVar12.q();
        wVar12.h();
        wVar12.u(f10, vVar);
        w wVar13 = new w();
        wVar13.r();
        wVar13.c();
        f18116h = wVar13.u(f10, (v) null);
        w wVar14 = new w();
        wVar14.r();
        wVar14.m(aVar, 4);
        wVar14.m(aVar2, 2);
        wVar14.m(aVar3, 2);
        wVar14.q();
        wVar14.g("+HHMMss", "Z");
        wVar14.u(f10, vVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        v vVar2 = vVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        w wVar15 = new w();
        wVar15.r();
        wVar15.t();
        wVar15.q();
        wVar15.j(aVar7, hashMap);
        wVar15.f(", ");
        wVar15.p();
        wVar15.n(aVar3, 1, 2, 4);
        wVar15.e(' ');
        wVar15.j(aVar2, hashMap2);
        wVar15.e(' ');
        wVar15.m(aVar, 4);
        wVar15.e(' ');
        wVar15.m(aVar4, 2);
        wVar15.e(':');
        wVar15.m(aVar5, 2);
        wVar15.q();
        wVar15.e(':');
        wVar15.m(aVar6, 2);
        wVar15.p();
        wVar15.e(' ');
        wVar15.g("+HHMM", "GMT");
        wVar15.u(F.SMART, vVar2);
    }

    DateTimeFormatter(C0352f fVar, Locale locale, F f10, v vVar) {
        D d10 = D.f18115a;
        this.f18117a = fVar;
        if (locale != null) {
            this.f18118b = locale;
            this.f18119c = d10;
            if (f10 != null) {
                this.f18120d = f10;
                this.f18122f = vVar;
                this.f18123g = null;
                return;
            }
            throw new NullPointerException("resolverStyle");
        }
        throw new NullPointerException("locale");
    }

    private j g(CharSequence charSequence) {
        String str;
        ParsePosition parsePosition = new ParsePosition(0);
        if (charSequence != null) {
            x xVar = new x(this);
            int n10 = this.f18117a.n(xVar, charSequence, parsePosition.getIndex());
            if (n10 < 0) {
                parsePosition.setErrorIndex(~n10);
                xVar = null;
            } else {
                parsePosition.setIndex(n10);
            }
            if (xVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                return xVar.t(this.f18120d, this.f18121e);
            }
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str2 = "Text '" + str + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new y(str2, charSequence);
            }
            String str3 = "Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new y(str3, charSequence);
        }
        throw new NullPointerException("text");
    }

    public static DateTimeFormatter ofPattern(String str) {
        w wVar = new w();
        wVar.i(str);
        return wVar.v(Locale.getDefault());
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        w wVar = new w();
        wVar.i(str);
        return wVar.v(locale);
    }

    public final String a(j jVar) {
        StringBuilder sb2 = new StringBuilder(32);
        if (jVar != null) {
            try {
                this.f18117a.m(new A(jVar, this), sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new e(e10.getMessage(), e10);
            }
        } else {
            throw new NullPointerException("temporal");
        }
    }

    public final o b() {
        return this.f18122f;
    }

    public final D c() {
        return this.f18119c;
    }

    public final Locale d() {
        return this.f18118b;
    }

    public final ZoneId e() {
        return this.f18123g;
    }

    public final Object f(CharSequence charSequence, h hVar) {
        String str;
        if (charSequence != null) {
            try {
                return ((E) g(charSequence)).K(hVar);
            } catch (y e10) {
                throw e10;
            } catch (RuntimeException e11) {
                if (charSequence.length() > 64) {
                    str = charSequence.subSequence(0, 64).toString() + "...";
                } else {
                    str = charSequence.toString();
                }
                throw new y("Text '" + str + "' could not be parsed: " + e11.getMessage(), charSequence, e11);
            }
        } else {
            throw new NullPointerException("text");
        }
    }

    /* access modifiers changed from: package-private */
    public final C0352f h() {
        return this.f18117a.a();
    }

    public final String toString() {
        String fVar = this.f18117a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
