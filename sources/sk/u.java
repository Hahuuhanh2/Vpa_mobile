package sk;

import f0.b0;

/* compiled from: TypeIntrinsics */
public final class u {
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00b9, code lost:
        if (r0 == r3) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r3, java.lang.Object r4) {
        /*
            if (r4 == 0) goto L_0x00d6
            boolean r0 = r4 instanceof ek.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r4 instanceof sk.g
            if (r0 == 0) goto L_0x0015
            r0 = r4
            sk.g r0 = (sk.g) r0
            int r0 = r0.getArity()
            goto L_0x00b9
        L_0x0015:
            boolean r0 = r4 instanceof rk.a
            if (r0 == 0) goto L_0x001c
            r0 = r2
            goto L_0x00b9
        L_0x001c:
            boolean r0 = r4 instanceof rk.l
            if (r0 == 0) goto L_0x0023
            r0 = r1
            goto L_0x00b9
        L_0x0023:
            boolean r0 = r4 instanceof rk.p
            if (r0 == 0) goto L_0x002a
            r0 = 2
            goto L_0x00b9
        L_0x002a:
            boolean r0 = r4 instanceof rk.q
            if (r0 == 0) goto L_0x0031
            r0 = 3
            goto L_0x00b9
        L_0x0031:
            boolean r0 = r4 instanceof rk.r
            if (r0 == 0) goto L_0x0038
            r0 = 4
            goto L_0x00b9
        L_0x0038:
            boolean r0 = r4 instanceof rk.s
            if (r0 == 0) goto L_0x003f
            r0 = 5
            goto L_0x00b9
        L_0x003f:
            boolean r0 = r4 instanceof rk.t
            if (r0 == 0) goto L_0x0046
            r0 = 6
            goto L_0x00b9
        L_0x0046:
            boolean r0 = r4 instanceof rk.u
            if (r0 == 0) goto L_0x004d
            r0 = 7
            goto L_0x00b9
        L_0x004d:
            boolean r0 = r4 instanceof rk.v
            if (r0 == 0) goto L_0x0055
            r0 = 8
            goto L_0x00b9
        L_0x0055:
            boolean r0 = r4 instanceof rk.w
            if (r0 == 0) goto L_0x005d
            r0 = 9
            goto L_0x00b9
        L_0x005d:
            boolean r0 = r4 instanceof rk.b
            if (r0 == 0) goto L_0x0064
            r0 = 10
            goto L_0x00b9
        L_0x0064:
            boolean r0 = r4 instanceof rk.c
            if (r0 == 0) goto L_0x006b
            r0 = 11
            goto L_0x00b9
        L_0x006b:
            boolean r0 = r4 instanceof rk.d
            if (r0 == 0) goto L_0x0072
            r0 = 12
            goto L_0x00b9
        L_0x0072:
            boolean r0 = r4 instanceof rk.e
            if (r0 == 0) goto L_0x0079
            r0 = 13
            goto L_0x00b9
        L_0x0079:
            boolean r0 = r4 instanceof rk.f
            if (r0 == 0) goto L_0x0080
            r0 = 14
            goto L_0x00b9
        L_0x0080:
            boolean r0 = r4 instanceof rk.g
            if (r0 == 0) goto L_0x0087
            r0 = 15
            goto L_0x00b9
        L_0x0087:
            boolean r0 = r4 instanceof rk.h
            if (r0 == 0) goto L_0x008e
            r0 = 16
            goto L_0x00b9
        L_0x008e:
            boolean r0 = r4 instanceof rk.i
            if (r0 == 0) goto L_0x0095
            r0 = 17
            goto L_0x00b9
        L_0x0095:
            boolean r0 = r4 instanceof rk.j
            if (r0 == 0) goto L_0x009c
            r0 = 18
            goto L_0x00b9
        L_0x009c:
            boolean r0 = r4 instanceof rk.k
            if (r0 == 0) goto L_0x00a3
            r0 = 19
            goto L_0x00b9
        L_0x00a3:
            boolean r0 = r4 instanceof rk.m
            if (r0 == 0) goto L_0x00aa
            r0 = 20
            goto L_0x00b9
        L_0x00aa:
            boolean r0 = r4 instanceof rk.n
            if (r0 == 0) goto L_0x00b1
            r0 = 21
            goto L_0x00b9
        L_0x00b1:
            boolean r0 = r4 instanceof rk.o
            if (r0 == 0) goto L_0x00b8
            r0 = 22
            goto L_0x00b9
        L_0x00b8:
            r0 = -1
        L_0x00b9:
            if (r0 != r3) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r1 = r2
        L_0x00bd:
            if (r1 == 0) goto L_0x00c0
            goto L_0x00d6
        L_0x00c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            b(r4, r3)
            r3 = 0
            throw r3
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.u.a(int, java.lang.Object):void");
    }

    public static void b(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(b0.s(str2, " cannot be cast to ", str));
        j.j(u.class.getName(), classCastException);
        throw classCastException;
    }
}
