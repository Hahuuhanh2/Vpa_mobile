package com.google.crypto.tink.shaded.protobuf;

import j9.c;
import j9.d;

/* compiled from: UnknownFieldSchema */
public abstract class g0<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(int i10, Object obj, Object obj2);

    public abstract void d(B b10, int i10, c cVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract h0 f(Object obj);

    public abstract h0 g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract h0 k(Object obj, Object obj2);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[LOOP:0: B:16:0x0037->B:19:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(B r7, j9.y r8) {
        /*
            r6 = this;
            com.google.crypto.tink.shaded.protobuf.g r8 = (com.google.crypto.tink.shaded.protobuf.g) r8
            int r0 = r8.f7381b
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x006f
            if (r0 == r3) goto L_0x0062
            r4 = 2
            if (r0 == r4) goto L_0x005a
            r4 = 4
            r5 = 3
            if (r0 == r5) goto L_0x0030
            if (r0 == r4) goto L_0x002f
            r2 = 5
            if (r0 != r2) goto L_0x0027
            r8.v(r2)
            com.google.crypto.tink.shaded.protobuf.f r8 = r8.f7380a
            int r8 = r8.l()
            r6.a(r7, r1, r8)
            return r3
        L_0x0027:
            int r7 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f7324b
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r7 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException
            r7.<init>()
            throw r7
        L_0x002f:
            return r2
        L_0x0030:
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r6.m()
            int r2 = r1 << 3
            r2 = r2 | r4
        L_0x0037:
            int r4 = r8.a()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x0046
            boolean r4 = r6.l(r0, r8)
            if (r4 != 0) goto L_0x0037
        L_0x0046:
            int r8 = r8.f7381b
            if (r2 != r8) goto L_0x0052
            com.google.crypto.tink.shaded.protobuf.h0 r8 = r6.q(r0)
            r6.c(r1, r7, r8)
            return r3
        L_0x0052:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r8 = "Protocol message end-group tag did not match expected tag."
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x005a:
            j9.c r8 = r8.e()
            r6.d(r7, r1, r8)
            return r3
        L_0x0062:
            r8.v(r3)
            com.google.crypto.tink.shaded.protobuf.f r8 = r8.f7380a
            long r4 = r8.m()
            r6.b(r7, r1, r4)
            return r3
        L_0x006f:
            r8.v(r2)
            com.google.crypto.tink.shaded.protobuf.f r8 = r8.f7380a
            long r4 = r8.p()
            r6.e(r7, r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.g0.l(java.lang.Object, j9.y):boolean");
    }

    public abstract h0 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t10);

    public abstract void p();

    public abstract h0 q(Object obj);

    public abstract void r(Object obj, d dVar);

    public abstract void s(Object obj, d dVar);
}
