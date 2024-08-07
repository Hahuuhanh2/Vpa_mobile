package n9;

import com.google.firebase.abt.AbtException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p9.a;

/* compiled from: FirebaseABTesting */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final za.b<a> f13538a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13539b = "frc";

    /* renamed from: c  reason: collision with root package name */
    public Integer f13540c = null;

    public b(za.b bVar) {
        this.f13538a = bVar;
    }

    public static boolean a(ArrayList arrayList, a aVar) {
        String str = aVar.f13532a;
        String str2 = aVar.f13533b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f13532a.equals(str) && aVar2.f13533b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final List<a.b> b() {
        return this.f13538a.get().f(this.f13539b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.util.ArrayList r18) {
        /*
            r17 = this;
            r1 = r17
            r17.d()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r18.iterator()
        L_0x000e:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x00b4
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String[] r5 = n9.a.f13530g
            java.lang.String r5 = "triggerEvent"
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String[] r7 = n9.a.f13530g
            r8 = 0
            r9 = r8
        L_0x0029:
            r10 = 5
            if (r9 >= r10) goto L_0x003a
            r10 = r7[r9]
            boolean r11 = r3.containsKey(r10)
            if (r11 != 0) goto L_0x0037
            r6.add(r10)
        L_0x0037:
            int r9 = r9 + 1
            goto L_0x0029
        L_0x003a:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x00a3
            java.text.SimpleDateFormat r6 = n9.a.f13531h     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r7 = "experimentStartTime"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.util.Date r12 = r6.parse(r7)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r6 = "triggerTimeoutMillis"
            java.lang.Object r6 = r3.get(r6)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            long r13 = java.lang.Long.parseLong(r6)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r6 = "timeToLiveMillis"
            java.lang.Object r6 = r3.get(r6)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            long r15 = java.lang.Long.parseLong(r6)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            n9.a r6 = new n9.a     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r7 = "experimentId"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            java.lang.String r7 = "variantId"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            r10 = r7
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            boolean r7 = r3.containsKey(r5)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            if (r7 == 0) goto L_0x0087
            java.lang.Object r3 = r3.get(r5)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
        L_0x0087:
            r11 = r4
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r15)     // Catch:{ ParseException -> 0x009a, NumberFormatException -> 0x0091 }
            r0.add(r6)
            goto L_0x000e
        L_0x0091:
            r0 = move-exception
            com.google.firebase.abt.AbtException r2 = new com.google.firebase.abt.AbtException
            java.lang.String r3 = "Could not process experiment: one of the durations could not be converted into a long."
            r2.<init>(r3, r0)
            throw r2
        L_0x009a:
            r0 = move-exception
            com.google.firebase.abt.AbtException r2 = new com.google.firebase.abt.AbtException
            java.lang.String r3 = "Could not process experiment: parsing experiment start time failed."
            r2.<init>(r3, r0)
            throw r2
        L_0x00a3:
            com.google.firebase.abt.AbtException r0 = new com.google.firebase.abt.AbtException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r8] = r6
            java.lang.String r3 = "The following keys are missing from the experiment info map: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        L_0x00b4:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x00df
            r17.d()
            java.util.List r0 = r17.b()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01e9
            java.lang.Object r2 = r0.next()
            p9.a$b r2 = (p9.a.b) r2
            java.lang.String r2 = r2.f14090b
            za.b<p9.a> r3 = r1.f13538a
            java.lang.Object r3 = r3.get()
            p9.a r3 = (p9.a) r3
            r3.e(r2)
            goto L_0x00c5
        L_0x00df:
            r17.d()
            java.util.List r2 = r17.b()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00ef:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0121
            java.lang.Object r5 = r2.next()
            p9.a$b r5 = (p9.a.b) r5
            java.lang.String[] r6 = n9.a.f13530g
            java.lang.String r6 = r5.f14092d
            if (r6 == 0) goto L_0x0103
            r10 = r6
            goto L_0x0104
        L_0x0103:
            r10 = r4
        L_0x0104:
            n9.a r6 = new n9.a
            java.lang.String r8 = r5.f14090b
            java.lang.Object r7 = r5.f14091c
            java.lang.String r9 = java.lang.String.valueOf(r7)
            java.util.Date r11 = new java.util.Date
            long r12 = r5.f14101m
            r11.<init>(r12)
            long r12 = r5.f14093e
            long r14 = r5.f14098j
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r14)
            r3.add(r6)
            goto L_0x00ef
        L_0x0121:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r3.iterator()
        L_0x012a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0146
            java.lang.Object r5 = r4.next()
            n9.a r5 = (n9.a) r5
            boolean r6 = a(r0, r5)
            if (r6 != 0) goto L_0x012a
            java.lang.String r6 = r1.f13539b
            p9.a$b r5 = r5.a(r6)
            r2.add(r5)
            goto L_0x012a
        L_0x0146:
            java.util.Iterator r2 = r2.iterator()
        L_0x014a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0164
            java.lang.Object r4 = r2.next()
            p9.a$b r4 = (p9.a.b) r4
            java.lang.String r4 = r4.f14090b
            za.b<p9.a> r5 = r1.f13538a
            java.lang.Object r5 = r5.get()
            p9.a r5 = (p9.a) r5
            r5.e(r4)
            goto L_0x014a
        L_0x0164:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x016d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0183
            java.lang.Object r4 = r0.next()
            n9.a r4 = (n9.a) r4
            boolean r5 = a(r3, r4)
            if (r5 != 0) goto L_0x016d
            r2.add(r4)
            goto L_0x016d
        L_0x0183:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.List r3 = r17.b()
            r0.<init>(r3)
            java.lang.Integer r3 = r1.f13540c
            if (r3 != 0) goto L_0x01a4
            za.b<p9.a> r3 = r1.f13538a
            java.lang.Object r3 = r3.get()
            p9.a r3 = (p9.a) r3
            java.lang.String r4 = r1.f13539b
            int r3 = r3.d(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.f13540c = r3
        L_0x01a4:
            java.lang.Integer r3 = r1.f13540c
            int r3 = r3.intValue()
            java.util.Iterator r2 = r2.iterator()
        L_0x01ae:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e9
            java.lang.Object r4 = r2.next()
            n9.a r4 = (n9.a) r4
        L_0x01ba:
            int r5 = r0.size()
            if (r5 < r3) goto L_0x01d4
            java.lang.Object r5 = r0.pollFirst()
            p9.a$b r5 = (p9.a.b) r5
            java.lang.String r5 = r5.f14090b
            za.b<p9.a> r6 = r1.f13538a
            java.lang.Object r6 = r6.get()
            p9.a r6 = (p9.a) r6
            r6.e(r5)
            goto L_0x01ba
        L_0x01d4:
            java.lang.String r5 = r1.f13539b
            p9.a$b r4 = r4.a(r5)
            za.b<p9.a> r5 = r1.f13538a
            java.lang.Object r5 = r5.get()
            p9.a r5 = (p9.a) r5
            r5.b(r4)
            r0.offer(r4)
            goto L_0x01ae
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.c(java.util.ArrayList):void");
    }

    public final void d() {
        if (this.f13538a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
