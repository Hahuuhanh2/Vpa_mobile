package al;

import fl.r;
import ik.d;

/* compiled from: Timeout.kt */
public final class b2<U, T extends U> extends r<T> implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f18993e;

    public b2(long j10, d<? super U> dVar) {
        super(dVar, dVar.getContext());
        this.f18993e = j10;
    }

    public final String W() {
        return super.W() + "(timeMillis=" + this.f18993e + ')';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r2 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            long r0 = r4.f18993e
            ik.f r2 = r4.f18986c
            al.l0 r2 = al.m0.b(r2)
            boolean r3 = r2 instanceof al.n0
            if (r3 == 0) goto L_0x000f
            al.n0 r2 = (al.n0) r2
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r2 == 0) goto L_0x001f
            int r3 = zk.a.f23785d
            zk.c r3 = zk.c.MILLISECONDS
            p3.l0.S0(r0, r3)
            java.lang.String r2 = r2.q()
            if (r2 != 0) goto L_0x0035
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Timed out waiting for "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " ms"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
        L_0x0035:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            r0.<init>(r2, r4)
            r4.r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al.b2.run():void");
    }
}
