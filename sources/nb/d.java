package nb;

import java.util.Iterator;
import lb.a;
import tb.m;

/* compiled from: FirebasePerfTraceValidator */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13563b = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final m f13564a;

    public d(m mVar) {
        this.f13564a = mVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(tb.m r6, int r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r7 <= r1) goto L_0x000d
            lb.a r6 = f13563b
            r6.f()
            return r0
        L_0x000d:
            java.util.Map r2 = r6.R()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x002e
            goto L_0x004b
        L_0x002e:
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x003e
            lb.a r4 = f13563b
            r4.f()
            goto L_0x004b
        L_0x003e:
            int r4 = r4.length()
            r5 = 100
            if (r4 <= r5) goto L_0x004d
            lb.a r4 = f13563b
            r4.f()
        L_0x004b:
            r4 = r0
            goto L_0x004e
        L_0x004d:
            r4 = r1
        L_0x004e:
            if (r4 != 0) goto L_0x005c
            lb.a r6 = f13563b
            java.lang.Object r7 = r3.getKey()
            java.lang.String r7 = (java.lang.String) r7
            r6.f()
            return r0
        L_0x005c:
            java.lang.Object r4 = r3.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0066
            r4 = r1
            goto L_0x0067
        L_0x0066:
            r4 = r0
        L_0x0067:
            if (r4 != 0) goto L_0x0019
            lb.a r6 = f13563b
            java.lang.Object r7 = r3.getValue()
            java.util.Objects.toString(r7)
            r6.f()
            return r0
        L_0x0076:
            com.google.protobuf.k$c r6 = r6.X()
            java.util.Iterator r6 = r6.iterator()
        L_0x007e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = r6.next()
            tb.m r2 = (tb.m) r2
            int r3 = r7 + 1
            boolean r2 = d(r2, r3)
            if (r2 != 0) goto L_0x007e
            return r0
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.d.d(tb.m, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(tb.m r6, int r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0009
            lb.a r6 = f13563b
            r6.f()
            return r0
        L_0x0009:
            r1 = 1
            if (r7 <= r1) goto L_0x0012
            lb.a r6 = f13563b
            r6.f()
            return r0
        L_0x0012:
            java.lang.String r2 = r6.V()
            if (r2 != 0) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x002d
            int r2 = r2.length()
            r3 = 100
            if (r2 > r3) goto L_0x002d
            r2 = r1
            goto L_0x002e
        L_0x002d:
            r2 = r0
        L_0x002e:
            if (r2 != 0) goto L_0x0036
            lb.a r6 = f13563b
            r6.f()
            return r0
        L_0x0036:
            long r2 = r6.U()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0042
            r2 = r1
            goto L_0x0043
        L_0x0042:
            r2 = r0
        L_0x0043:
            if (r2 != 0) goto L_0x004b
            lb.a r6 = f13563b
            r6.f()
            return r0
        L_0x004b:
            boolean r2 = r6.Y()
            if (r2 != 0) goto L_0x0057
            lb.a r6 = f13563b
            r6.f()
            return r0
        L_0x0057:
            java.lang.String r2 = r6.V()
            java.lang.String r3 = "_st_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0086
            java.util.Map r2 = r6.R()
            java.lang.String r3 = "_fr_tot"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x007d
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L_0x007d
            r2 = r1
            goto L_0x007e
        L_0x007d:
            r2 = r0
        L_0x007e:
            if (r2 != 0) goto L_0x0086
            lb.a r6 = f13563b
            r6.f()
            return r0
        L_0x0086:
            com.google.protobuf.k$c r2 = r6.X()
            java.util.Iterator r2 = r2.iterator()
        L_0x008e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a3
            java.lang.Object r3 = r2.next()
            tb.m r3 = (tb.m) r3
            int r4 = r7 + 1
            boolean r3 = e(r3, r4)
            if (r3 != 0) goto L_0x008e
            return r0
        L_0x00a3:
            java.util.Map r6 = r6.S()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00af:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d6
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r2 = r7.getKey()     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IllegalArgumentException -> 0x00cb }
            nb.e.b(r2, r7)     // Catch:{ IllegalArgumentException -> 0x00cb }
            goto L_0x00af
        L_0x00cb:
            r6 = move-exception
            lb.a r7 = f13563b
            r6.getLocalizedMessage()
            r7.f()
            r6 = r0
            goto L_0x00d7
        L_0x00d6:
            r6 = r1
        L_0x00d7:
            if (r6 != 0) goto L_0x00da
            return r0
        L_0x00da:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.d.e(tb.m, int):boolean");
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!e(this.f13564a, 0)) {
            a aVar = f13563b;
            this.f13564a.V();
            aVar.f();
            return false;
        }
        m mVar = this.f13564a;
        if (mVar.Q() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Iterator it = mVar.X().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if (((m) it.next()).Q() > 0) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    break;
                }
            }
        } else {
            z11 = true;
        }
        if (!z11 || d(this.f13564a, 0)) {
            return true;
        }
        a aVar2 = f13563b;
        this.f13564a.V();
        aVar2.f();
        return false;
    }
}
