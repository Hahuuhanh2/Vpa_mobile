package cl;

/* compiled from: Produce.kt */
public final class n {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(cl.p r4, u3.c.a r5, ik.d r6) {
        /*
            boolean r0 = r6 instanceof cl.l
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cl.l r0 = (cl.l) r0
            int r1 = r0.f19264d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19264d = r1
            goto L_0x0018
        L_0x0013:
            cl.l r0 = new cl.l
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f19263c
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19264d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            rk.a r5 = r0.f19262b
            p3.l0.Q0(r6)     // Catch:{ all -> 0x006c }
            goto L_0x0066
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p3.l0.Q0(r6)
            ik.f r6 = r0.getContext()
            al.i1$b r2 = al.i1.b.f19045a
            ik.f$b r6 = r6.get(r2)
            if (r6 != r4) goto L_0x0042
            r6 = r3
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 == 0) goto L_0x0071
            r0.f19261a = r4     // Catch:{ all -> 0x006c }
            r0.f19262b = r5     // Catch:{ all -> 0x006c }
            r0.f19264d = r3     // Catch:{ all -> 0x006c }
            al.l r6 = new al.l     // Catch:{ all -> 0x006c }
            ik.d r0 = al.g0.b0(r0)     // Catch:{ all -> 0x006c }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x006c }
            r6.t()     // Catch:{ all -> 0x006c }
            cl.m r0 = new cl.m     // Catch:{ all -> 0x006c }
            r0.<init>(r6)     // Catch:{ all -> 0x006c }
            r4.g(r0)     // Catch:{ all -> 0x006c }
            java.lang.Object r4 = r6.s()     // Catch:{ all -> 0x006c }
            if (r4 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r5.invoke()
            ek.i r4 = ek.i.f20112a
            return r4
        L_0x006c:
            r4 = move-exception
            r5.invoke()
            throw r4
        L_0x0071:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.n.a(cl.p, u3.c$a, ik.d):java.lang.Object");
    }
}
