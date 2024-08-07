package nb;

import android.content.Context;
import lb.a;
import tb.h;

/* compiled from: FirebasePerfNetworkValidator */
public final class c extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f13560c = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final h f13561a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f13562b;

    public c(h hVar, Context context) {
        this.f13562b = context;
        this.f13561a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r9 = this;
            tb.h r0 = r9.f13561a
            java.lang.String r0 = r0.d0()
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x0013
        L_0x000b:
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
        L_0x0013:
            r2 = 0
            if (r0 == 0) goto L_0x0021
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.d0()
            r0.f()
            return r2
        L_0x0021:
            tb.h r0 = r9.f13561a
            java.lang.String r0 = r0.d0()
            r3 = 0
            if (r0 != 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            java.net.URI r0 = java.net.URI.create(r0)     // Catch:{ IllegalArgumentException -> 0x0032, IllegalStateException -> 0x0030 }
            goto L_0x0043
        L_0x0030:
            r0 = move-exception
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            lb.a r4 = f13560c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r5[r2] = r0
            java.lang.String r0 = "getResultUrl throws exception %s"
            r4.g(r0, r5)
        L_0x0042:
            r0 = r3
        L_0x0043:
            if (r0 != 0) goto L_0x004b
            lb.a r0 = f13560c
            r0.f()
            return r2
        L_0x004b:
            android.content.Context r4 = r9.f13562b
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r6 = "firebase_performance_whitelisted_domains"
            java.lang.String r7 = "array"
            int r4 = r5.getIdentifier(r6, r7, r4)
            if (r4 != 0) goto L_0x0060
            goto L_0x0086
        L_0x0060:
            lb.a r6 = lb.a.d()
            r6.a()
            java.lang.String[] r6 = m9.b.J
            if (r6 != 0) goto L_0x0071
            java.lang.String[] r4 = r5.getStringArray(r4)
            m9.b.J = r4
        L_0x0071:
            java.lang.String r4 = r0.getHost()
            if (r4 != 0) goto L_0x0078
            goto L_0x0086
        L_0x0078:
            java.lang.String[] r5 = m9.b.J
            int r6 = r5.length
            r7 = r2
        L_0x007c:
            if (r7 >= r6) goto L_0x008b
            r8 = r5[r7]
            boolean r8 = r4.contains(r8)
            if (r8 == 0) goto L_0x0088
        L_0x0086:
            r4 = r1
            goto L_0x008c
        L_0x0088:
            int r7 = r7 + 1
            goto L_0x007c
        L_0x008b:
            r4 = r2
        L_0x008c:
            if (r4 != 0) goto L_0x0097
            lb.a r1 = f13560c
            r0.toString()
            r1.f()
            return r2
        L_0x0097:
            java.lang.String r4 = r0.getHost()
            if (r4 == 0) goto L_0x00b1
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00b1
            int r4 = r4.length()
            r5 = 255(0xff, float:3.57E-43)
            if (r4 > r5) goto L_0x00b1
            r4 = r1
            goto L_0x00b2
        L_0x00b1:
            r4 = r2
        L_0x00b2:
            if (r4 != 0) goto L_0x00ba
            lb.a r0 = f13560c
            r0.f()
            return r2
        L_0x00ba:
            java.lang.String r4 = r0.getScheme()
            if (r4 != 0) goto L_0x00c1
            goto L_0x00d2
        L_0x00c1:
            java.lang.String r5 = "http"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 != 0) goto L_0x00d4
            java.lang.String r5 = "https"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r4 = r2
            goto L_0x00d5
        L_0x00d4:
            r4 = r1
        L_0x00d5:
            if (r4 != 0) goto L_0x00dd
            lb.a r0 = f13560c
            r0.f()
            return r2
        L_0x00dd:
            java.lang.String r4 = r0.getUserInfo()
            if (r4 != 0) goto L_0x00e5
            r4 = r1
            goto L_0x00e6
        L_0x00e5:
            r4 = r2
        L_0x00e6:
            if (r4 != 0) goto L_0x00ee
            lb.a r0 = f13560c
            r0.f()
            return r2
        L_0x00ee:
            int r0 = r0.getPort()
            r4 = -1
            if (r0 == r4) goto L_0x00fa
            if (r0 <= 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r0 = r2
            goto L_0x00fb
        L_0x00fa:
            r0 = r1
        L_0x00fb:
            if (r0 != 0) goto L_0x0103
            lb.a r0 = f13560c
            r0.f()
            return r2
        L_0x0103:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.f0()
            if (r0 == 0) goto L_0x0111
            tb.h r0 = r9.f13561a
            tb.h$c r3 = r0.V()
        L_0x0111:
            if (r3 == 0) goto L_0x0119
            tb.h$c r0 = tb.h.c.HTTP_METHOD_UNKNOWN
            if (r3 == r0) goto L_0x0119
            r0 = r1
            goto L_0x011a
        L_0x0119:
            r0 = r2
        L_0x011a:
            if (r0 != 0) goto L_0x012b
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            tb.h$c r1 = r1.V()
            r1.toString()
            r0.f()
            return r2
        L_0x012b:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.g0()
            if (r0 == 0) goto L_0x014b
            tb.h r0 = r9.f13561a
            int r0 = r0.W()
            if (r0 <= 0) goto L_0x013d
            r0 = r1
            goto L_0x013e
        L_0x013d:
            r0 = r2
        L_0x013e:
            if (r0 != 0) goto L_0x014b
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.W()
            r0.f()
            return r2
        L_0x014b:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.h0()
            r3 = 0
            if (r0 == 0) goto L_0x016f
            tb.h r0 = r9.f13561a
            long r5 = r0.Y()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0161
            r0 = r1
            goto L_0x0162
        L_0x0161:
            r0 = r2
        L_0x0162:
            if (r0 != 0) goto L_0x016f
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.Y()
            r0.f()
            return r2
        L_0x016f:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.i0()
            if (r0 == 0) goto L_0x0191
            tb.h r0 = r9.f13561a
            long r5 = r0.Z()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0183
            r0 = r1
            goto L_0x0184
        L_0x0183:
            r0 = r2
        L_0x0184:
            if (r0 != 0) goto L_0x0191
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.Z()
            r0.f()
            return r2
        L_0x0191:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.e0()
            if (r0 == 0) goto L_0x0216
            tb.h r0 = r9.f13561a
            long r5 = r0.T()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01a5
            goto L_0x0216
        L_0x01a5:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.j0()
            if (r0 == 0) goto L_0x01c7
            tb.h r0 = r9.f13561a
            long r5 = r0.a0()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01b9
            r0 = r1
            goto L_0x01ba
        L_0x01b9:
            r0 = r2
        L_0x01ba:
            if (r0 != 0) goto L_0x01c7
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.a0()
            r0.f()
            return r2
        L_0x01c7:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.l0()
            if (r0 == 0) goto L_0x01e9
            tb.h r0 = r9.f13561a
            long r5 = r0.c0()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01db
            r0 = r1
            goto L_0x01dc
        L_0x01db:
            r0 = r2
        L_0x01dc:
            if (r0 != 0) goto L_0x01e9
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.c0()
            r0.f()
            return r2
        L_0x01e9:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.k0()
            if (r0 == 0) goto L_0x020b
            tb.h r0 = r9.f13561a
            long r5 = r0.b0()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01fc
            goto L_0x020b
        L_0x01fc:
            tb.h r0 = r9.f13561a
            boolean r0 = r0.g0()
            if (r0 != 0) goto L_0x020a
            lb.a r0 = f13560c
            r0.f()
            return r2
        L_0x020a:
            return r1
        L_0x020b:
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.b0()
            r0.f()
            return r2
        L_0x0216:
            lb.a r0 = f13560c
            tb.h r1 = r9.f13561a
            r1.T()
            r0.f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.c.a():boolean");
    }
}
