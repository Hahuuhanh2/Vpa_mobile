package pl;

import f0.b0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import p3.l0;
import pl.i;
import rl.c;
import v.v;

/* compiled from: DateTimeFormatterBuilder */
public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f22669f = new a();

    /* renamed from: a  reason: collision with root package name */
    public b f22670a;

    /* renamed from: b  reason: collision with root package name */
    public final b f22671b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f22672c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22673d;

    /* renamed from: e  reason: collision with root package name */
    public int f22674e;

    /* compiled from: DateTimeFormatterBuilder */
    public class a implements rl.i<nl.j> {
        public final Object a(rl.e eVar) {
            nl.j jVar = (nl.j) eVar.o(rl.h.f22839a);
            if (jVar == null || (jVar instanceof nl.k)) {
                return null;
            }
            return jVar;
        }
    }

    /* renamed from: pl.b$b  reason: collision with other inner class name */
    /* compiled from: DateTimeFormatterBuilder */
    public static final class C0303b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final char f22675a;

        public C0303b(char c10) {
            this.f22675a = c10;
        }

        public final boolean b(e eVar, StringBuilder sb2) {
            sb2.append(this.f22675a);
            return true;
        }

        public final String toString() {
            if (this.f22675a == '\'') {
                return "''";
            }
            StringBuilder q10 = android.support.v4.media.a.q("'");
            q10.append(this.f22675a);
            q10.append("'");
            return q10.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final d[] f22676a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22677b;

        public c(ArrayList arrayList, boolean z10) {
            this((d[]) arrayList.toArray(new d[arrayList.size()]), z10);
        }

        public final boolean b(e eVar, StringBuilder sb2) {
            int length = sb2.length();
            if (this.f22677b) {
                eVar.f22709d++;
            }
            try {
                for (d b10 : this.f22676a) {
                    if (!b10.b(eVar, sb2)) {
                        sb2.setLength(length);
                        return true;
                    }
                }
                if (this.f22677b) {
                    eVar.f22709d--;
                }
                return true;
            } finally {
                if (this.f22677b) {
                    eVar.f22709d--;
                }
            }
        }

        public final String toString() {
            String str;
            String str2;
            StringBuilder sb2 = new StringBuilder();
            if (this.f22676a != null) {
                if (this.f22677b) {
                    str = "[";
                } else {
                    str = "(";
                }
                sb2.append(str);
                for (d append : this.f22676a) {
                    sb2.append(append);
                }
                if (this.f22677b) {
                    str2 = "]";
                } else {
                    str2 = ")";
                }
                sb2.append(str2);
            }
            return sb2.toString();
        }

        public c(d[] dVarArr, boolean z10) {
            this.f22676a = dVarArr;
            this.f22677b = z10;
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public interface d {
        boolean b(e eVar, StringBuilder sb2);
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static final class e implements d {

        /* renamed from: a  reason: collision with root package name */
        public final rl.g f22678a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22679b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22680c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f22681d;

        public e(rl.a aVar) {
            boolean z10;
            l0.y0(aVar, "field");
            rl.k kVar = aVar.f22815d;
            if (kVar.f22846a == kVar.f22847b && kVar.f22848c == kVar.f22849d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f22678a = aVar;
                this.f22679b = 0;
                this.f22680c = 9;
                this.f22681d = true;
                return;
            }
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }

        public final boolean b(e eVar, StringBuilder sb2) {
            BigDecimal bigDecimal;
            Long a10 = eVar.a(this.f22678a);
            if (a10 == null) {
                return false;
            }
            g gVar = eVar.f22708c;
            long longValue = a10.longValue();
            rl.k range = this.f22678a.range();
            range.b(longValue, this.f22678a);
            BigDecimal valueOf = BigDecimal.valueOf(range.f22846a);
            BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(range.f22849d).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            if (divide.compareTo(BigDecimal.ZERO) == 0) {
                bigDecimal = BigDecimal.ZERO;
            } else {
                bigDecimal = divide.stripTrailingZeros();
            }
            if (bigDecimal.scale() != 0) {
                String a11 = gVar.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), this.f22679b), this.f22680c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f22681d) {
                    sb2.append(gVar.f22716d);
                }
                sb2.append(a11);
                return true;
            } else if (this.f22679b <= 0) {
                return true;
            } else {
                if (this.f22681d) {
                    sb2.append(gVar.f22716d);
                }
                for (int i10 = 0; i10 < this.f22679b; i10++) {
                    sb2.append(gVar.f22713a);
                }
                return true;
            }
        }

        public final String toString() {
            String str;
            if (this.f22681d) {
                str = ",DecimalPoint";
            } else {
                str = "";
            }
            StringBuilder q10 = android.support.v4.media.a.q("Fraction(");
            q10.append(this.f22678a);
            q10.append(",");
            q10.append(this.f22679b);
            q10.append(",");
            q10.append(this.f22680c);
            q10.append(str);
            q10.append(")");
            return q10.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static final class f implements d {
        public final boolean b(e eVar, StringBuilder sb2) {
            e eVar2 = eVar;
            StringBuilder sb3 = sb2;
            Long a10 = eVar2.a(rl.a.INSTANT_SECONDS);
            Long l10 = 0L;
            rl.e eVar3 = eVar2.f22706a;
            rl.a aVar = rl.a.NANO_OF_SECOND;
            if (eVar3.n(aVar)) {
                l10 = Long.valueOf(eVar2.f22706a.c(aVar));
            }
            if (a10 == null) {
                return false;
            }
            long longValue = a10.longValue();
            int k10 = aVar.k(l10.longValue());
            if (longValue >= -62167219200L) {
                long j10 = (longValue - 315569520000L) + 62167219200L;
                long T = l0.T(j10, 315569520000L) + 1;
                nl.f E = nl.f.E((((j10 % 315569520000L) + 315569520000L) % 315569520000L) - 62167219200L, 0, nl.k.f21776f);
                if (T > 0) {
                    sb3.append('+');
                    sb3.append(T);
                }
                sb3.append(E);
                if (E.f21760b.f21766c == 0) {
                    sb3.append(":00");
                }
            } else {
                long j11 = longValue + 62167219200L;
                long j12 = j11 / 315569520000L;
                long j13 = j11 % 315569520000L;
                nl.f E2 = nl.f.E(j13 - 62167219200L, 0, nl.k.f21776f);
                int length = sb2.length();
                sb3.append(E2);
                if (E2.f21760b.f21766c == 0) {
                    sb3.append(":00");
                }
                if (j12 < 0) {
                    if (E2.f21759a.f21754a == -10000) {
                        sb3.replace(length, length + 2, Long.toString(j12 - 1));
                    } else if (j13 == 0) {
                        sb3.insert(length, j12);
                    } else {
                        sb3.insert(length + 1, Math.abs(j12));
                    }
                }
            }
            if (k10 != 0) {
                sb3.append('.');
                if (k10 % 1000000 == 0) {
                    sb3.append(Integer.toString((k10 / 1000000) + 1000).substring(1));
                } else if (k10 % 1000 == 0) {
                    sb3.append(Integer.toString((k10 / 1000) + 1000000).substring(1));
                } else {
                    sb3.append(Integer.toString(k10 + 1000000000).substring(1));
                }
            }
            sb3.append('Z');
            return true;
        }

        public final String toString() {
            return "Instant()";
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static final class h implements d {

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f22688c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: d  reason: collision with root package name */
        public static final h f22689d = new h("Z", "+HH:MM:ss");

        /* renamed from: a  reason: collision with root package name */
        public final String f22690a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22691b;

        static {
            new h("0", "+HH:MM:ss");
        }

        public h(String str, String str2) {
            this.f22690a = str;
            int i10 = 0;
            while (true) {
                String[] strArr = f22688c;
                if (i10 >= 9) {
                    throw new IllegalArgumentException(b0.r("Invalid zone offset pattern: ", str2));
                } else if (strArr[i10].equals(str2)) {
                    this.f22691b = i10;
                    return;
                } else {
                    i10++;
                }
            }
        }

        public final boolean b(e eVar, StringBuilder sb2) {
            String str;
            String str2;
            Long a10 = eVar.a(rl.a.OFFSET_SECONDS);
            if (a10 == null) {
                return false;
            }
            long longValue = a10.longValue();
            if (longValue > 2147483647L || longValue < -2147483648L) {
                throw new ArithmeticException(n0.l.i("Calculation overflows an int: ", longValue));
            }
            int i10 = (int) longValue;
            if (i10 == 0) {
                sb2.append(this.f22690a);
            } else {
                int abs = Math.abs((i10 / 3600) % 100);
                int abs2 = Math.abs((i10 / 60) % 60);
                int abs3 = Math.abs(i10 % 60);
                int length = sb2.length();
                if (i10 < 0) {
                    str = "-";
                } else {
                    str = "+";
                }
                sb2.append(str);
                sb2.append((char) ((abs / 10) + 48));
                sb2.append((char) ((abs % 10) + 48));
                int i11 = this.f22691b;
                if (i11 >= 3 || (i11 >= 1 && abs2 > 0)) {
                    String str3 = ":";
                    if (i11 % 2 == 0) {
                        str2 = str3;
                    } else {
                        str2 = "";
                    }
                    sb2.append(str2);
                    sb2.append((char) ((abs2 / 10) + 48));
                    sb2.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i12 = this.f22691b;
                    if (i12 >= 7 || (i12 >= 5 && abs3 > 0)) {
                        if (i12 % 2 != 0) {
                            str3 = "";
                        }
                        sb2.append(str3);
                        sb2.append((char) ((abs3 / 10) + 48));
                        sb2.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb2.setLength(length);
                    sb2.append(this.f22690a);
                }
            }
            return true;
        }

        public final String toString() {
            String replace = this.f22690a.replace("'", "''");
            StringBuilder q10 = android.support.v4.media.a.q("Offset(");
            q10.append(f22688c[this.f22691b]);
            q10.append(",'");
            q10.append(replace);
            q10.append("')");
            return q10.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public enum i implements d {
        SENSITIVE,
        INSENSITIVE,
        LENIENT;

        public final boolean b(e eVar, StringBuilder sb2) {
            return true;
        }

        public final String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static final class j implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f22696a;

        public j(String str) {
            this.f22696a = str;
        }

        public final boolean b(e eVar, StringBuilder sb2) {
            sb2.append(this.f22696a);
            return true;
        }

        public final String toString() {
            return b0.s("'", this.f22696a.replace("'", "''"), "'");
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static final class k implements d {

        /* renamed from: a  reason: collision with root package name */
        public final rl.g f22697a;

        /* renamed from: b  reason: collision with root package name */
        public final j f22698b;

        /* renamed from: c  reason: collision with root package name */
        public final f f22699c;

        /* renamed from: d  reason: collision with root package name */
        public volatile g f22700d;

        public k(rl.a aVar, j jVar, f fVar) {
            this.f22697a = aVar;
            this.f22698b = jVar;
            this.f22699c = fVar;
        }

        public final boolean b(e eVar, StringBuilder sb2) {
            Long a10 = eVar.a(this.f22697a);
            if (a10 == null) {
                return false;
            }
            String a11 = this.f22699c.a(this.f22697a, a10.longValue(), this.f22698b, eVar.f22707b);
            if (a11 == null) {
                if (this.f22700d == null) {
                    this.f22700d = new g(this.f22697a, 1, 19, 1);
                }
                return this.f22700d.b(eVar, sb2);
            }
            sb2.append(a11);
            return true;
        }

        public final String toString() {
            if (this.f22698b == j.FULL) {
                StringBuilder q10 = android.support.v4.media.a.q("Text(");
                q10.append(this.f22697a);
                q10.append(")");
                return q10.toString();
            }
            StringBuilder q11 = android.support.v4.media.a.q("Text(");
            q11.append(this.f22697a);
            q11.append(",");
            q11.append(this.f22698b);
            q11.append(")");
            return q11.toString();
        }
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static final class l implements d {
        public l() {
            a aVar = b.f22669f;
        }

        public final boolean b(e eVar, StringBuilder sb2) {
            Object o10 = eVar.f22706a.o(b.f22669f);
            if (o10 == null && eVar.f22709d == 0) {
                StringBuilder q10 = android.support.v4.media.a.q("Unable to extract value: ");
                q10.append(eVar.f22706a.getClass());
                throw new DateTimeException(q10.toString());
            }
            nl.j jVar = (nl.j) o10;
            if (jVar == null) {
                return false;
            }
            sb2.append(jVar.getId());
            return true;
        }

        public final String toString() {
            return "ZoneRegionId()";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', rl.a.ERA);
        hashMap.put('y', rl.a.YEAR_OF_ERA);
        hashMap.put('u', rl.a.YEAR);
        int i10 = rl.c.f22831a;
        c.a.b bVar = c.a.f22832a;
        hashMap.put('Q', bVar);
        hashMap.put('q', bVar);
        rl.a aVar = rl.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', rl.a.DAY_OF_YEAR);
        hashMap.put('d', rl.a.DAY_OF_MONTH);
        hashMap.put('F', rl.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        rl.a aVar2 = rl.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', rl.a.AMPM_OF_DAY);
        hashMap.put('H', rl.a.HOUR_OF_DAY);
        hashMap.put('k', rl.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', rl.a.HOUR_OF_AMPM);
        hashMap.put('h', rl.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', rl.a.MINUTE_OF_HOUR);
        hashMap.put('s', rl.a.SECOND_OF_MINUTE);
        rl.a aVar3 = rl.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', rl.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', rl.a.NANO_OF_DAY);
    }

    public b() {
        this.f22670a = this;
        this.f22672c = new ArrayList();
        this.f22674e = -1;
        this.f22671b = null;
        this.f22673d = false;
    }

    public final void a(a aVar) {
        c cVar = aVar.f22662a;
        if (cVar.f22677b) {
            cVar = new c(cVar.f22676a, false);
        }
        b(cVar);
    }

    public final int b(d dVar) {
        l0.y0(dVar, "pp");
        b bVar = this.f22670a;
        bVar.getClass();
        bVar.f22672c.add(dVar);
        b bVar2 = this.f22670a;
        bVar2.f22674e = -1;
        return bVar2.f22672c.size() - 1;
    }

    public final void c(char c10) {
        b(new C0303b(c10));
    }

    public final void d(String str) {
        if (str.length() <= 0) {
            return;
        }
        if (str.length() == 1) {
            b(new C0303b(str.charAt(0)));
        } else {
            b(new j(str));
        }
    }

    public final void e(rl.a aVar, HashMap hashMap) {
        l0.y0(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        j jVar = j.FULL;
        b(new k(aVar, jVar, new c(new i.b(Collections.singletonMap(jVar, linkedHashMap)))));
    }

    public final void f(g gVar) {
        g gVar2;
        int i10;
        b bVar = this.f22670a;
        int i11 = bVar.f22674e;
        if (i11 < 0 || !(bVar.f22672c.get(i11) instanceof g)) {
            this.f22670a.f22674e = b(gVar);
            return;
        }
        b bVar2 = this.f22670a;
        int i12 = bVar2.f22674e;
        g gVar3 = (g) bVar2.f22672c.get(i12);
        int i13 = gVar.f22684b;
        int i14 = gVar.f22685c;
        if (i13 == i14 && (i10 = gVar.f22686d) == 4) {
            gVar2 = new g(gVar3.f22683a, gVar3.f22684b, gVar3.f22685c, gVar3.f22686d, gVar3.f22687e + i14);
            if (gVar.f22687e != -1) {
                gVar = new g(gVar.f22683a, i13, i14, i10, -1);
            }
            b(gVar);
            this.f22670a.f22674e = i12;
        } else {
            if (gVar3.f22687e != -1) {
                gVar3 = new g(gVar3.f22683a, gVar3.f22684b, gVar3.f22685c, gVar3.f22686d, -1);
            }
            this.f22670a.f22674e = b(gVar);
            gVar2 = gVar3;
        }
        this.f22670a.f22672c.set(i12, gVar2);
    }

    public final void g(rl.g gVar, int i10) {
        l0.y0(gVar, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.m("The width must be from 1 to 19 inclusive but was ", i10));
        }
        f(new g(gVar, i10, i10, 4));
    }

    public final b h(rl.g gVar, int i10, int i11, int i12) {
        if (i10 == i11 && i12 == 4) {
            g(gVar, i11);
            return this;
        }
        l0.y0(gVar, "field");
        b0.A(i12, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.m("The minimum width must be from 1 to 19 inclusive but was ", i10));
        } else if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.m("The maximum width must be from 1 to 19 inclusive but was ", i11));
        } else if (i11 >= i10) {
            f(new g(gVar, i10, i11, i12));
            return this;
        } else {
            throw new IllegalArgumentException(b0.p("The maximum width must exceed or equal the minimum width but ", i11, " < ", i10));
        }
    }

    public final void i() {
        b bVar = this.f22670a;
        if (bVar.f22671b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        } else if (bVar.f22672c.size() > 0) {
            b bVar2 = this.f22670a;
            c cVar = new c(bVar2.f22672c, bVar2.f22673d);
            this.f22670a = this.f22670a.f22671b;
            b(cVar);
        } else {
            this.f22670a = this.f22670a.f22671b;
        }
    }

    public final void j() {
        b bVar = this.f22670a;
        bVar.f22674e = -1;
        this.f22670a = new b(bVar);
    }

    public final a k(Locale locale) {
        l0.y0(locale, "locale");
        while (this.f22670a.f22671b != null) {
            i();
        }
        return new a(new c(this.f22672c, false), locale, g.f22712e, h.SMART, (Set<rl.g>) null, (ol.f) null, (nl.j) null);
    }

    public final a l(h hVar) {
        a k10 = k(Locale.getDefault());
        if (l0.M(k10.f22665d, hVar)) {
            return k10;
        }
        return new a(k10.f22662a, k10.f22663b, k10.f22664c, hVar, k10.f22666e, k10.f22667f, k10.f22668g);
    }

    /* compiled from: DateTimeFormatterBuilder */
    public static class g implements d {

        /* renamed from: f  reason: collision with root package name */
        public static final int[] f22682f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: a  reason: collision with root package name */
        public final rl.g f22683a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22684b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22685c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22686d;

        /* renamed from: e  reason: collision with root package name */
        public final int f22687e;

        public g(rl.g gVar, int i10, int i11, int i12) {
            this.f22683a = gVar;
            this.f22684b = i10;
            this.f22685c = i11;
            this.f22686d = i12;
            this.f22687e = 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
            if (r4 != 4) goto L_0x0092;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(pl.e r11, java.lang.StringBuilder r12) {
            /*
                r10 = this;
                rl.g r0 = r10.f22683a
                java.lang.Long r0 = r11.a(r0)
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                long r2 = r0.longValue()
                pl.g r11 = r11.f22708c
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x0019
                java.lang.String r0 = "9223372036854775808"
                goto L_0x0021
            L_0x0019:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L_0x0021:
                int r4 = r0.length()
                int r5 = r10.f22685c
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto L_0x00a7
                java.lang.String r0 = r11.a(r0)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 4
                r8 = 1
                if (r4 < 0) goto L_0x005f
                int r4 = r10.f22686d
                int r4 = v.v.g(r4)
                if (r4 == r8) goto L_0x0059
                if (r4 == r5) goto L_0x0044
                goto L_0x0092
            L_0x0044:
                int r4 = r10.f22684b
                r5 = 19
                if (r4 >= r5) goto L_0x0092
                int[] r5 = f22682f
                r4 = r5[r4]
                long r4 = (long) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0092
                char r2 = r11.f22714b
                r12.append(r2)
                goto L_0x0092
            L_0x0059:
                char r2 = r11.f22714b
                r12.append(r2)
                goto L_0x0092
            L_0x005f:
                int r4 = r10.f22686d
                int r4 = v.v.g(r4)
                if (r4 == 0) goto L_0x008d
                if (r4 == r8) goto L_0x008d
                r9 = 3
                if (r4 == r9) goto L_0x006f
                if (r4 == r5) goto L_0x008d
                goto L_0x0092
            L_0x006f:
                org.threeten.bp.DateTimeException r11 = new org.threeten.bp.DateTimeException
                java.lang.StringBuilder r12 = android.support.v4.media.a.q(r7)
                rl.g r0 = r10.f22683a
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L_0x008d:
                char r2 = r11.f22715c
                r12.append(r2)
            L_0x0092:
                int r2 = r10.f22684b
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto L_0x00a3
                char r2 = r11.f22713a
                r12.append(r2)
                int r1 = r1 + 1
                goto L_0x0092
            L_0x00a3:
                r12.append(r0)
                return r8
            L_0x00a7:
                org.threeten.bp.DateTimeException r11 = new org.threeten.bp.DateTimeException
                java.lang.StringBuilder r12 = android.support.v4.media.a.q(r7)
                rl.g r0 = r10.f22683a
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r12.append(r0)
                int r0 = r10.f22685c
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.b.g.b(pl.e, java.lang.StringBuilder):boolean");
        }

        public final String toString() {
            int i10 = this.f22684b;
            if (i10 == 1 && this.f22685c == 19 && this.f22686d == 1) {
                StringBuilder q10 = android.support.v4.media.a.q("Value(");
                q10.append(this.f22683a);
                q10.append(")");
                return q10.toString();
            } else if (i10 == this.f22685c && this.f22686d == 4) {
                StringBuilder q11 = android.support.v4.media.a.q("Value(");
                q11.append(this.f22683a);
                q11.append(",");
                return v.e(q11, this.f22684b, ")");
            } else {
                StringBuilder q12 = android.support.v4.media.a.q("Value(");
                q12.append(this.f22683a);
                q12.append(",");
                q12.append(this.f22684b);
                q12.append(",");
                q12.append(this.f22685c);
                q12.append(",");
                q12.append(n0.l.t(this.f22686d));
                q12.append(")");
                return q12.toString();
            }
        }

        public g(rl.g gVar, int i10, int i11, int i12, int i13) {
            this.f22683a = gVar;
            this.f22684b = i10;
            this.f22685c = i11;
            this.f22686d = i12;
            this.f22687e = i13;
        }
    }

    public b(b bVar) {
        this.f22670a = this;
        this.f22672c = new ArrayList();
        this.f22674e = -1;
        this.f22671b = bVar;
        this.f22673d = true;
    }
}
