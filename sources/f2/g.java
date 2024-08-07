package f2;

/* compiled from: DataMigrationInitializer.kt */
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9794a = new a();

    /* compiled from: DataMigrationInitializer.kt */
    public static final class a {
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object a(f2.g.a r5, java.util.List r6, f2.j r7, ik.d r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof f2.e
                if (r0 == 0) goto L_0x0016
                r0 = r8
                f2.e r0 = (f2.e) r0
                int r1 = r0.f9784e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0016
                int r1 = r1 - r2
                r0.f9784e = r1
                goto L_0x001b
            L_0x0016:
                f2.e r0 = new f2.e
                r0.<init>(r5, r8)
            L_0x001b:
                java.lang.Object r5 = r0.f9782c
                jk.a r8 = jk.a.COROUTINE_SUSPENDED
                int r1 = r0.f9784e
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L_0x0043
                if (r1 == r2) goto L_0x003b
                if (r1 != r3) goto L_0x0033
                java.util.Iterator r6 = r0.f9781b
                java.io.Serializable r7 = r0.f9780a
                sk.r r7 = (sk.r) r7
                p3.l0.Q0(r5)     // Catch:{ all -> 0x0080 }
                goto L_0x0067
            L_0x0033:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x003b:
                java.io.Serializable r6 = r0.f9780a
                java.util.List r6 = (java.util.List) r6
                p3.l0.Q0(r5)
                goto L_0x005d
            L_0x0043:
                p3.l0.Q0(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                f2.f r1 = new f2.f
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f9780a = r5
                r0.f9784e = r2
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L_0x005c
                goto L_0x0096
            L_0x005c:
                r6 = r5
            L_0x005d:
                sk.r r5 = new sk.r
                r5.<init>()
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L_0x0067:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L_0x008e
                java.lang.Object r5 = r6.next()
                rk.l r5 = (rk.l) r5
                r0.f9780a = r7     // Catch:{ all -> 0x0080 }
                r0.f9781b = r6     // Catch:{ all -> 0x0080 }
                r0.f9784e = r3     // Catch:{ all -> 0x0080 }
                java.lang.Object r5 = r5.invoke(r0)     // Catch:{ all -> 0x0080 }
                if (r5 != r8) goto L_0x0067
                goto L_0x0096
            L_0x0080:
                r5 = move-exception
                T r1 = r7.f22931a
                if (r1 != 0) goto L_0x0088
                r7.f22931a = r5
                goto L_0x0067
            L_0x0088:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                al.g0.s(r1, r5)
                goto L_0x0067
            L_0x008e:
                T r5 = r7.f22931a
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L_0x0097
                ek.i r8 = ek.i.f20112a
            L_0x0096:
                return r8
            L_0x0097:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.g.a.a(f2.g$a, java.util.List, f2.j, ik.d):java.lang.Object");
        }
    }
}
