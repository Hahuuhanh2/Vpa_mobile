package ll;

import sk.j;

/* compiled from: PeekSource.kt */
public final class u implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final i f20905a;

    /* renamed from: b  reason: collision with root package name */
    public final f f20906b;

    /* renamed from: c  reason: collision with root package name */
    public x f20907c;

    /* renamed from: d  reason: collision with root package name */
    public int f20908d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20909e;

    /* renamed from: f  reason: collision with root package name */
    public long f20910f;

    public u(i iVar) {
        int i10;
        j.f(iVar, "upstream");
        this.f20905a = iVar;
        f a10 = iVar.a();
        this.f20906b = a10;
        x xVar = a10.f20877a;
        this.f20907c = xVar;
        if (xVar != null) {
            i10 = xVar.f20919b;
        } else {
            i10 = -1;
        }
        this.f20908d = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r10 == r0.f20919b) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long J0(ll.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r10 = "sink"
            sk.j.f(r9, r10)
            boolean r10 = r8.f20909e
            r11 = 1
            r10 = r10 ^ r11
            if (r10 == 0) goto L_0x006a
            ll.x r10 = r8.f20907c
            if (r10 == 0) goto L_0x0020
            ll.f r0 = r8.f20906b
            ll.x r0 = r0.f20877a
            if (r10 != r0) goto L_0x001f
            int r10 = r8.f20908d
            sk.j.c(r0)
            int r0 = r0.f20919b
            if (r10 != r0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r11 = 0
        L_0x0020:
            if (r11 == 0) goto L_0x005e
            ll.i r10 = r8.f20905a
            long r0 = r8.f20910f
            r2 = 1
            long r0 = r0 + r2
            boolean r10 = r10.i0(r0)
            if (r10 != 0) goto L_0x0032
            r9 = -1
            return r9
        L_0x0032:
            ll.x r10 = r8.f20907c
            if (r10 != 0) goto L_0x0042
            ll.f r10 = r8.f20906b
            ll.x r10 = r10.f20877a
            if (r10 == 0) goto L_0x0042
            r8.f20907c = r10
            int r10 = r10.f20919b
            r8.f20908d = r10
        L_0x0042:
            ll.f r10 = r8.f20906b
            long r10 = r10.f20878b
            long r0 = r8.f20910f
            long r10 = r10 - r0
            r0 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r0, r10)
            ll.f r2 = r8.f20906b
            long r3 = r8.f20910f
            r5 = r10
            r7 = r9
            r2.z(r3, r5, r7)
            long r0 = r8.f20910f
            long r0 = r0 + r10
            r8.f20910f = r0
            return r10
        L_0x005e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x006a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.u.J0(ll.f, long):long");
    }

    public final void close() {
        this.f20909e = true;
    }

    public final d0 f() {
        return this.f20905a.f();
    }
}
