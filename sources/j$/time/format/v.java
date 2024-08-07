package j$.time.format;

import j$.time.zone.i;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

final class v extends u {

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentHashMap f18191h = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final TextStyle f18192e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f18193f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f18194g = new HashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    v(j$.time.format.TextStyle r4) {
        /*
            r3 = this;
            j$.time.temporal.m r0 = j$.time.temporal.n.k()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ZoneText("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.<init>(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f18193f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f18194g = r0
            if (r4 == 0) goto L_0x0030
            r3.f18192e = r4
            return
        L_0x0030:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "textStyle"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.v.<init>(j$.time.format.TextStyle):void");
    }

    /* access modifiers changed from: protected */
    public final o a(x xVar) {
        o oVar;
        if (this.f18192e == TextStyle.NARROW) {
            return super.a(xVar);
        }
        Locale i10 = xVar.i();
        boolean k10 = xVar.k();
        HashSet a10 = i.a();
        int size = a10.size();
        HashMap hashMap = k10 ? this.f18193f : this.f18194g;
        Map.Entry entry = (Map.Entry) hashMap.get(i10);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (oVar = (o) ((SoftReference) entry.getValue()).get()) == null) {
            oVar = o.f(xVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i10).getZoneStrings();
            int length = zoneStrings.length;
            int i11 = 0;
            while (true) {
                int i12 = 2;
                if (i11 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i11];
                String str = strArr[0];
                if (a10.contains(str)) {
                    oVar.a(str, str);
                    String a11 = H.a(str, i10);
                    if (this.f18192e == TextStyle.FULL) {
                        i12 = 1;
                    }
                    while (i12 < strArr.length) {
                        oVar.a(strArr[i12], a11);
                        i12 += 2;
                    }
                }
                i11++;
            }
            hashMap.put(i10, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(oVar)));
        }
        return oVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: j$.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: j$.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r5 == null) goto L_0x0060;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(j$.time.format.A r13, java.lang.StringBuilder r14) {
        /*
            r12 = this;
            j$.time.temporal.m r0 = j$.time.temporal.n.l()
            java.lang.Object r0 = r13.f(r0)
            j$.time.ZoneId r0 = (j$.time.ZoneId) r0
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r2 = r0.l()
            boolean r3 = r0 instanceof j$.time.ZoneOffset
            r4 = 1
            if (r3 != 0) goto L_0x00b2
            j$.time.temporal.j r3 = r13.d()
            j$.time.temporal.a r5 = j$.time.temporal.a.INSTANT_SECONDS
            boolean r5 = r3.e(r5)
            r6 = 2
            if (r5 == 0) goto L_0x0036
            j$.time.zone.e r0 = r0.U()
            j$.time.Instant r3 = j$.time.Instant.V(r3)
            boolean r0 = r0.h(r3)
            if (r0 == 0) goto L_0x0034
            r0 = r4
            goto L_0x0037
        L_0x0034:
            r0 = r1
            goto L_0x0037
        L_0x0036:
            r0 = r6
        L_0x0037:
            java.util.Locale r13 = r13.c()
            j$.time.format.TextStyle r3 = r12.f18192e
            j$.time.format.TextStyle r5 = j$.time.format.TextStyle.NARROW
            r7 = 0
            if (r3 != r5) goto L_0x0043
            goto L_0x00af
        L_0x0043:
            j$.util.concurrent.ConcurrentHashMap r3 = f18191h
            java.lang.Object r5 = r3.get(r2)
            java.lang.ref.SoftReference r5 = (java.lang.ref.SoftReference) r5
            r8 = 5
            r9 = 3
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r5.get()
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L_0x0060
            java.lang.Object r5 = r7.get(r13)
            java.lang.String[] r5 = (java.lang.String[]) r5
            if (r5 != 0) goto L_0x009a
        L_0x0060:
            java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r2)
            r10 = 7
            java.lang.String[] r10 = new java.lang.String[r10]
            r10[r1] = r2
            java.lang.String r11 = r5.getDisplayName(r1, r4, r13)
            r10[r4] = r11
            java.lang.String r11 = r5.getDisplayName(r1, r1, r13)
            r10[r6] = r11
            java.lang.String r6 = r5.getDisplayName(r4, r4, r13)
            r10[r9] = r6
            r6 = 4
            java.lang.String r1 = r5.getDisplayName(r4, r1, r13)
            r10[r6] = r1
            r10[r8] = r2
            r1 = 6
            r10[r1] = r2
            if (r7 != 0) goto L_0x008e
            j$.util.concurrent.ConcurrentHashMap r7 = new j$.util.concurrent.ConcurrentHashMap
            r7.<init>()
        L_0x008e:
            r7.put(r13, r10)
            java.lang.ref.SoftReference r13 = new java.lang.ref.SoftReference
            r13.<init>(r7)
            r3.put(r2, r13)
            r5 = r10
        L_0x009a:
            j$.time.format.TextStyle r13 = r12.f18192e
            int r13 = r13.m()
            if (r0 == 0) goto L_0x00ac
            if (r0 == r4) goto L_0x00a8
            int r13 = r13 + r8
            r7 = r5[r13]
            goto L_0x00af
        L_0x00a8:
            int r13 = r13 + r9
            r7 = r5[r13]
            goto L_0x00af
        L_0x00ac:
            int r13 = r13 + r4
            r7 = r5[r13]
        L_0x00af:
            if (r7 == 0) goto L_0x00b2
            r2 = r7
        L_0x00b2:
            r14.append(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.v.m(j$.time.format.A, java.lang.StringBuilder):boolean");
    }
}
