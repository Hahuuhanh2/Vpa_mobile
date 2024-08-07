package j$.time.format;

import j$.time.chrono.v;
import j$.time.temporal.a;
import j$.time.temporal.i;
import j$.time.temporal.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class w {

    /* renamed from: h  reason: collision with root package name */
    private static final C0347a f18195h = new C0347a();

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap f18196i;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f18197j = 0;

    /* renamed from: a  reason: collision with root package name */
    private w f18198a;

    /* renamed from: b  reason: collision with root package name */
    private final w f18199b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f18200c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18201d;

    /* renamed from: e  reason: collision with root package name */
    private int f18202e;

    /* renamed from: f  reason: collision with root package name */
    private char f18203f;

    /* renamed from: g  reason: collision with root package name */
    private int f18204g;

    static {
        HashMap hashMap = new HashMap();
        f18196i = hashMap;
        hashMap.put('G', a.ERA);
        hashMap.put('y', a.YEAR_OF_ERA);
        hashMap.put('u', a.YEAR);
        o oVar = i.f18261a;
        hashMap.put('Q', oVar);
        hashMap.put('q', oVar);
        a aVar = a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', a.DAY_OF_YEAR);
        hashMap.put('d', a.DAY_OF_MONTH);
        hashMap.put('F', a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        a aVar2 = a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', a.AMPM_OF_DAY);
        hashMap.put('H', a.HOUR_OF_DAY);
        hashMap.put('k', a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', a.HOUR_OF_AMPM);
        hashMap.put('h', a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', a.MINUTE_OF_HOUR);
        hashMap.put('s', a.SECOND_OF_MINUTE);
        a aVar3 = a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', a.NANO_OF_DAY);
    }

    public w() {
        this.f18198a = this;
        this.f18200c = new ArrayList();
        this.f18204g = -1;
        this.f18199b = null;
        this.f18201d = false;
    }

    private w(w wVar) {
        this.f18198a = this;
        this.f18200c = new ArrayList();
        this.f18204g = -1;
        this.f18199b = wVar;
        this.f18201d = true;
    }

    private int d(C0353g gVar) {
        if (gVar != null) {
            w wVar = this.f18198a;
            int i10 = wVar.f18202e;
            if (i10 > 0) {
                m mVar = new m(gVar, i10, wVar.f18203f);
                wVar.f18202e = 0;
                wVar.f18203f = 0;
                gVar = mVar;
            }
            wVar.f18200c.add(gVar);
            w wVar2 = this.f18198a;
            wVar2.f18204g = -1;
            return wVar2.f18200c.size() - 1;
        }
        throw new NullPointerException("pp");
    }

    private void l(k kVar) {
        k kVar2;
        w wVar = this.f18198a;
        int i10 = wVar.f18204g;
        if (i10 >= 0) {
            k kVar3 = (k) wVar.f18200c.get(i10);
            if (kVar.f18155b == kVar.f18156c && kVar.f18157d == 4) {
                kVar2 = kVar3.f(kVar.f18156c);
                d(kVar.e());
                this.f18198a.f18204g = i10;
            } else {
                kVar2 = kVar3.e();
                this.f18198a.f18204g = d(kVar);
            }
            this.f18198a.f18200c.set(i10, kVar2);
            return;
        }
        wVar.f18204g = d(kVar);
    }

    private DateTimeFormatter w(Locale locale, F f10, v vVar) {
        if (locale != null) {
            while (this.f18198a.f18199b != null) {
                p();
            }
            C0352f fVar = new C0352f(this.f18200c, false);
            D d10 = D.f18115a;
            return new DateTimeFormatter(fVar, locale, f10, vVar);
        }
        throw new NullPointerException("locale");
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            d(dateTimeFormatter.h());
            return;
        }
        throw new NullPointerException("formatter");
    }

    public final void b(a aVar, int i10, int i11, boolean z10) {
        d(new C0354h(aVar, i10, i11, z10));
    }

    public final void c() {
        d(new i());
    }

    public final void e(char c10) {
        d(new C0351e(c10));
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("literal");
        } else if (str.length() > 0) {
            d(str.length() == 1 ? new C0351e(str.charAt(0)) : new j(1, str));
        }
    }

    public final void g(String str, String str2) {
        d(new l(str, str2));
    }

    public final void h() {
        d(l.f18160d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e8, code lost:
        if (r3 == 1) goto L_0x01f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x02b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x03e4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            if (r1 == 0) goto L_0x0446
            r2 = 0
            r3 = r2
        L_0x0008:
            int r4 = r17.length()
            if (r3 >= r4) goto L_0x0445
            char r4 = r1.charAt(r3)
            r5 = 65
            r6 = 122(0x7a, float:1.71E-43)
            r7 = 90
            r8 = 97
            r9 = 1
            if (r4 < r5) goto L_0x001f
            if (r4 <= r7) goto L_0x0023
        L_0x001f:
            if (r4 < r8) goto L_0x039f
            if (r4 > r6) goto L_0x039f
        L_0x0023:
            int r10 = r3 + 1
        L_0x0025:
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0034
            char r11 = r1.charAt(r10)
            if (r11 != r4) goto L_0x0034
            int r10 = r10 + 1
            goto L_0x0025
        L_0x0034:
            int r3 = r10 - r3
            r11 = 112(0x70, float:1.57E-43)
            r12 = -1
            if (r4 != r11) goto L_0x00a3
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0061
            char r4 = r1.charAt(r10)
            if (r4 < r5) goto L_0x0049
            if (r4 <= r7) goto L_0x004d
        L_0x0049:
            if (r4 < r8) goto L_0x0061
            if (r4 > r6) goto L_0x0061
        L_0x004d:
            int r5 = r10 + 1
        L_0x004f:
            int r11 = r17.length()
            if (r5 >= r11) goto L_0x005e
            char r11 = r1.charAt(r5)
            if (r11 != r4) goto L_0x005e
            int r5 = r5 + 1
            goto L_0x004f
        L_0x005e:
            int r10 = r5 - r10
            goto L_0x0064
        L_0x0061:
            r5 = r10
            r10 = r3
            r3 = r2
        L_0x0064:
            if (r3 == 0) goto L_0x008c
            if (r3 < r9) goto L_0x0075
            j$.time.format.w r11 = r0.f18198a
            r11.f18202e = r3
            r3 = 32
            r11.f18203f = r3
            r11.f18204g = r12
            r3 = r10
            r10 = r5
            goto L_0x00a3
        L_0x0075:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "The pad width must be at least one but was "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x008c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Pad letter 'p' must be followed by valid pad pattern: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00a3:
            java.util.HashMap r5 = f18196i
            java.lang.Character r11 = java.lang.Character.valueOf(r4)
            java.lang.Object r5 = r5.get(r11)
            j$.time.temporal.o r5 = (j$.time.temporal.o) r5
            r11 = 4
            java.lang.String r13 = "Too many pattern letters: "
            r14 = 2
            r15 = 5
            if (r5 == 0) goto L_0x020c
            r6 = 81
            r7 = 3
            r12 = 19
            if (r4 == r6) goto L_0x01ac
            r6 = 83
            if (r4 == r6) goto L_0x01a4
            if (r4 == r8) goto L_0x018c
            r6 = 104(0x68, float:1.46E-43)
            if (r4 == r6) goto L_0x016d
            r6 = 107(0x6b, float:1.5E-43)
            if (r4 == r6) goto L_0x016d
            r6 = 109(0x6d, float:1.53E-43)
            if (r4 == r6) goto L_0x016d
            r6 = 113(0x71, float:1.58E-43)
            if (r4 == r6) goto L_0x016b
            r6 = 115(0x73, float:1.61E-43)
            if (r4 == r6) goto L_0x016d
            r6 = 117(0x75, float:1.64E-43)
            if (r4 == r6) goto L_0x014d
            r6 = 121(0x79, float:1.7E-43)
            if (r4 == r6) goto L_0x014d
            switch(r4) {
                case 68: goto L_0x0126;
                case 69: goto L_0x01ac;
                case 70: goto L_0x010d;
                case 71: goto L_0x00ec;
                case 72: goto L_0x016d;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            switch(r4) {
                case 75: goto L_0x016d;
                case 76: goto L_0x016b;
                case 77: goto L_0x01ac;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            switch(r4) {
                case 99: goto L_0x0142;
                case 100: goto L_0x016d;
                case 101: goto L_0x01ac;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            if (r3 != r9) goto L_0x0173
            goto L_0x01f6
        L_0x00ec:
            if (r3 == r9) goto L_0x01ee
            if (r3 == r14) goto L_0x01ee
            if (r3 == r7) goto L_0x01ee
            if (r3 == r11) goto L_0x01d9
            if (r3 != r15) goto L_0x00f8
            goto L_0x01bc
        L_0x00f8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x010d:
            if (r3 != r9) goto L_0x0111
            goto L_0x01f6
        L_0x0111:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0126:
            if (r3 != r9) goto L_0x012a
            goto L_0x01f6
        L_0x012a:
            if (r3 > r7) goto L_0x012d
            goto L_0x0173
        L_0x012d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0142:
            if (r3 == r14) goto L_0x0145
            goto L_0x016b
        L_0x0145:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid pattern \"cc\""
            r1.<init>(r2)
            throw r1
        L_0x014d:
            if (r3 != r14) goto L_0x0164
            j$.time.LocalDate r3 = j$.time.format.q.f18177i
            if (r3 == 0) goto L_0x015c
            j$.time.format.q r4 = new j$.time.format.q
            r4.<init>(r5, r3)
            r0.l(r4)
            goto L_0x01a9
        L_0x015c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "baseDate"
            r1.<init>(r2)
            throw r1
        L_0x0164:
            if (r3 >= r11) goto L_0x0167
            r15 = r9
        L_0x0167:
            r0.n(r5, r3, r12, r15)
            goto L_0x01a9
        L_0x016b:
            r6 = r9
            goto L_0x01ad
        L_0x016d:
            if (r3 != r9) goto L_0x0171
            goto L_0x01f6
        L_0x0171:
            if (r3 != r14) goto L_0x0177
        L_0x0173:
            r0.m(r5, r3)
            goto L_0x01a9
        L_0x0177:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x018c:
            if (r3 != r9) goto L_0x018f
            goto L_0x01ee
        L_0x018f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a4:
            j$.time.temporal.a r4 = j$.time.temporal.a.NANO_OF_SECOND
            r0.b(r4, r3, r3, r2)
        L_0x01a9:
            r3 = -1
            goto L_0x0385
        L_0x01ac:
            r6 = r2
        L_0x01ad:
            if (r3 == r9) goto L_0x01e1
            if (r3 == r14) goto L_0x01e1
            if (r3 == r7) goto L_0x01dc
            if (r3 == r11) goto L_0x01d4
            if (r3 != r15) goto L_0x01bf
            if (r6 == 0) goto L_0x01bc
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.NARROW_STANDALONE
            goto L_0x01f0
        L_0x01bc:
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.NARROW
            goto L_0x01f0
        L_0x01bf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d4:
            if (r6 == 0) goto L_0x01d9
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.FULL_STANDALONE
            goto L_0x01f0
        L_0x01d9:
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.FULL
            goto L_0x01f0
        L_0x01dc:
            if (r6 == 0) goto L_0x01ee
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.SHORT_STANDALONE
            goto L_0x01f0
        L_0x01e1:
            r6 = 99
            if (r4 == r6) goto L_0x0203
            r6 = 101(0x65, float:1.42E-43)
            if (r4 != r6) goto L_0x01ea
            goto L_0x0203
        L_0x01ea:
            r6 = 69
            if (r4 != r6) goto L_0x01f4
        L_0x01ee:
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.SHORT
        L_0x01f0:
            r0.k(r5, r3)
            goto L_0x01a9
        L_0x01f4:
            if (r3 != r9) goto L_0x01ff
        L_0x01f6:
            j$.time.format.k r3 = new j$.time.format.k
            r3.<init>(r5, r9, r12, r9)
            r0.l(r3)
            goto L_0x01a9
        L_0x01ff:
            r0.m(r5, r14)
            goto L_0x01a9
        L_0x0203:
            j$.time.format.t r5 = new j$.time.format.t
            r5.<init>(r4, r3)
            r0.d(r5)
            goto L_0x01a9
        L_0x020c:
            if (r4 != r6) goto L_0x0235
            if (r3 > r11) goto L_0x0220
            if (r3 != r11) goto L_0x0215
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.FULL
            goto L_0x0217
        L_0x0215:
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.SHORT
        L_0x0217:
            j$.time.format.v r4 = new j$.time.format.v
            r4.<init>(r3)
            r0.d(r4)
            goto L_0x01a9
        L_0x0220:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0235:
            r5 = 86
            if (r4 != r5) goto L_0x0262
            if (r3 != r14) goto L_0x024b
            j$.time.format.u r3 = new j$.time.format.u
            j$.time.temporal.m r4 = j$.time.temporal.n.l()
            java.lang.String r5 = "ZoneId()"
            r3.<init>(r4, r5)
            r0.d(r3)
            goto L_0x01a9
        L_0x024b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Pattern letter count must be 2: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0262:
            java.lang.String r5 = "+0000"
            if (r4 != r7) goto L_0x028a
            if (r3 >= r11) goto L_0x026c
            java.lang.String r3 = "+HHMM"
            goto L_0x031b
        L_0x026c:
            if (r3 != r11) goto L_0x026f
            goto L_0x0295
        L_0x026f:
            if (r3 != r15) goto L_0x0275
            java.lang.String r3 = "+HH:MM:ss"
            goto L_0x02e3
        L_0x0275:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x028a:
            r6 = 79
            if (r4 != r6) goto L_0x02d3
            if (r3 != r9) goto L_0x0293
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.SHORT
            goto L_0x0297
        L_0x0293:
            if (r3 != r11) goto L_0x02bc
        L_0x0295:
            j$.time.format.TextStyle r3 = j$.time.format.TextStyle.FULL
        L_0x0297:
            if (r3 == 0) goto L_0x02b4
            j$.time.format.TextStyle r4 = j$.time.format.TextStyle.FULL
            if (r3 == r4) goto L_0x02aa
            j$.time.format.TextStyle r4 = j$.time.format.TextStyle.SHORT
            if (r3 != r4) goto L_0x02a2
            goto L_0x02aa
        L_0x02a2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Style must be either full or short"
            r1.<init>(r2)
            throw r1
        L_0x02aa:
            j$.time.format.j r4 = new j$.time.format.j
            r4.<init>(r2, r3)
            r0.d(r4)
            goto L_0x01a9
        L_0x02b4:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "style"
            r1.<init>(r2)
            throw r1
        L_0x02bc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Pattern letter count must be 1 or 4: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02d3:
            r6 = 88
            if (r4 != r6) goto L_0x02ff
            if (r3 > r15) goto L_0x02ea
            java.lang.String[] r4 = j$.time.format.l.f18159c
            if (r3 != r9) goto L_0x02df
            r5 = r2
            goto L_0x02e0
        L_0x02df:
            r5 = r9
        L_0x02e0:
            int r3 = r3 + r5
            r3 = r4[r3]
        L_0x02e3:
            java.lang.String r4 = "Z"
            r0.g(r3, r4)
            goto L_0x01a9
        L_0x02ea:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02ff:
            r6 = 120(0x78, float:1.68E-43)
            if (r4 != r6) goto L_0x0335
            if (r3 > r15) goto L_0x0320
            if (r3 != r9) goto L_0x030a
            java.lang.String r5 = "+00"
            goto L_0x0311
        L_0x030a:
            int r4 = r3 % 2
            if (r4 != 0) goto L_0x030f
            goto L_0x0311
        L_0x030f:
            java.lang.String r5 = "+00:00"
        L_0x0311:
            java.lang.String[] r4 = j$.time.format.l.f18159c
            if (r3 != r9) goto L_0x0317
            r6 = r2
            goto L_0x0318
        L_0x0317:
            r6 = r9
        L_0x0318:
            int r3 = r3 + r6
            r3 = r4[r3]
        L_0x031b:
            r0.g(r3, r5)
            goto L_0x01a9
        L_0x0320:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0335:
            r5 = 87
            if (r4 != r5) goto L_0x0356
            if (r3 > r9) goto L_0x0341
            j$.time.format.t r5 = new j$.time.format.t
            r5.<init>(r4, r3)
            goto L_0x0380
        L_0x0341:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0356:
            r5 = 119(0x77, float:1.67E-43)
            if (r4 != r5) goto L_0x0377
            if (r3 > r14) goto L_0x0362
            j$.time.format.t r5 = new j$.time.format.t
            r5.<init>(r4, r3)
            goto L_0x0380
        L_0x0362:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0377:
            r5 = 89
            if (r4 != r5) goto L_0x0388
            j$.time.format.t r5 = new j$.time.format.t
            r5.<init>(r4, r3)
        L_0x0380:
            r0.d(r5)
            goto L_0x01a9
        L_0x0385:
            int r3 = r3 + r10
            goto L_0x0428
        L_0x0388:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown pattern letter: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x039f:
            java.lang.String r5 = "'"
            r6 = 39
            if (r4 != r6) goto L_0x03fb
            int r3 = r3 + 1
            r4 = r3
        L_0x03a8:
            int r7 = r17.length()
            if (r4 >= r7) goto L_0x03c5
            char r7 = r1.charAt(r4)
            if (r7 != r6) goto L_0x03c3
            int r7 = r4 + 1
            int r8 = r17.length()
            if (r7 >= r8) goto L_0x03c5
            char r8 = r1.charAt(r7)
            if (r8 != r6) goto L_0x03c5
            r4 = r7
        L_0x03c3:
            int r4 = r4 + r9
            goto L_0x03a8
        L_0x03c5:
            int r7 = r17.length()
            if (r4 >= r7) goto L_0x03e4
            java.lang.String r3 = r1.substring(r3, r4)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x03d9
            r0.e(r6)
            goto L_0x03e2
        L_0x03d9:
            java.lang.String r6 = "''"
            java.lang.String r3 = r3.replace(r6, r5)
            r0.f(r3)
        L_0x03e2:
            r3 = r4
            goto L_0x0428
        L_0x03e4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Pattern ends with an incomplete string literal: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x03fb:
            r6 = 91
            if (r4 != r6) goto L_0x0403
            r16.q()
            goto L_0x0428
        L_0x0403:
            r6 = 93
            if (r4 != r6) goto L_0x0419
            j$.time.format.w r4 = r0.f18198a
            j$.time.format.w r4 = r4.f18199b
            if (r4 == 0) goto L_0x0411
            r16.p()
            goto L_0x0428
        L_0x0411:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern invalid as it contains ] without previous ["
            r1.<init>(r2)
            throw r1
        L_0x0419:
            r6 = 123(0x7b, float:1.72E-43)
            if (r4 == r6) goto L_0x042b
            r6 = 125(0x7d, float:1.75E-43)
            if (r4 == r6) goto L_0x042b
            r6 = 35
            if (r4 == r6) goto L_0x042b
            r0.e(r4)
        L_0x0428:
            int r3 = r3 + r9
            goto L_0x0008
        L_0x042b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Pattern includes reserved character: '"
            r2.append(r3)
            r2.append(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0445:
            return
        L_0x0446:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "pattern"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.w.i(java.lang.String):void");
    }

    public final void j(a aVar, HashMap hashMap) {
        if (aVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
            TextStyle textStyle = TextStyle.FULL;
            d(new s(aVar, textStyle, new C0348b(new B(Collections.singletonMap(textStyle, linkedHashMap)))));
            return;
        }
        throw new NullPointerException("field");
    }

    public final void k(o oVar, TextStyle textStyle) {
        if (oVar == null) {
            throw new NullPointerException("field");
        } else if (textStyle != null) {
            d(new s(oVar, textStyle, new C()));
        } else {
            throw new NullPointerException("textStyle");
        }
    }

    public final void m(o oVar, int i10) {
        if (oVar == null) {
            throw new NullPointerException("field");
        } else if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        } else {
            l(new k(oVar, i10, i10, 4));
        }
    }

    public final w n(o oVar, int i10, int i11, int i12) {
        if (i10 == i11 && i12 == 4) {
            m(oVar, i11);
            return this;
        } else if (oVar == null) {
            throw new NullPointerException("field");
        } else if (i12 == 0) {
            throw new NullPointerException("signStyle");
        } else if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        } else if (i11 >= i10) {
            l(new k(oVar, i10, i11, i12));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    public final void o() {
        d(new u(f18195h, "ZoneRegionId()"));
    }

    public final void p() {
        w wVar = this.f18198a;
        if (wVar.f18199b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        } else if (wVar.f18200c.size() > 0) {
            w wVar2 = this.f18198a;
            C0352f fVar = new C0352f(wVar2.f18200c, wVar2.f18201d);
            this.f18198a = this.f18198a.f18199b;
            d(fVar);
        } else {
            this.f18198a = this.f18198a.f18199b;
        }
    }

    public final void q() {
        w wVar = this.f18198a;
        wVar.f18204g = -1;
        this.f18198a = new w(wVar);
    }

    public final void r() {
        d(r.INSENSITIVE);
    }

    public final void s() {
        d(r.SENSITIVE);
    }

    public final void t() {
        d(r.LENIENT);
    }

    /* access modifiers changed from: package-private */
    public final DateTimeFormatter u(F f10, v vVar) {
        return w(Locale.getDefault(), f10, vVar);
    }

    public final DateTimeFormatter v(Locale locale) {
        return w(locale, F.SMART, (v) null);
    }
}
