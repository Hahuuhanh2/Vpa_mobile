package j$.util.concurrent;

final class h extends m {

    /* renamed from: e  reason: collision with root package name */
    final m[] f18422e;

    h(m[] mVarArr) {
        super(-1, (Object) null, (Object) null, (m) null);
        this.f18422e = mVarArr;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if ((r0 instanceof j$.util.concurrent.h) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r0 = ((j$.util.concurrent.h) r0).f18422e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return r0.a(r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.util.concurrent.m a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.m[] r0 = r4.f18422e
        L_0x0002:
            r1 = 0
            if (r6 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0039
            int r2 = r0.length
            if (r2 == 0) goto L_0x0039
            int r2 = r2 + -1
            r2 = r2 & r5
            j$.util.concurrent.m r0 = j$.util.concurrent.ConcurrentHashMap.m(r0, r2)
            if (r0 != 0) goto L_0x0014
            goto L_0x0039
        L_0x0014:
            int r2 = r0.f18429a
            if (r2 != r5) goto L_0x0025
            java.lang.Object r3 = r0.f18430b
            if (r3 == r6) goto L_0x0024
            if (r3 == 0) goto L_0x0025
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0025
        L_0x0024:
            return r0
        L_0x0025:
            if (r2 >= 0) goto L_0x0035
            boolean r1 = r0 instanceof j$.util.concurrent.h
            if (r1 == 0) goto L_0x0030
            j$.util.concurrent.h r0 = (j$.util.concurrent.h) r0
            j$.util.concurrent.m[] r0 = r0.f18422e
            goto L_0x0002
        L_0x0030:
            j$.util.concurrent.m r5 = r0.a(r5, r6)
            return r5
        L_0x0035:
            j$.util.concurrent.m r0 = r0.f18432d
            if (r0 != 0) goto L_0x0014
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.h.a(int, java.lang.Object):j$.util.concurrent.m");
    }
}
