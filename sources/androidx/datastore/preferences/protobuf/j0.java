package androidx.datastore.preferences.protobuf;

import j2.c;

/* compiled from: UnknownFieldSchema */
public abstract class j0<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(int i10, Object obj, Object obj2);

    public abstract void d(B b10, int i10, c cVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract k0 f(Object obj);

    public abstract k0 g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract k0 k(Object obj, Object obj2);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[LOOP:0: B:16:0x0032->B:19:0x003f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(B r7, androidx.datastore.preferences.protobuf.f0 r8) {
        /*
            r6 = this;
            int r0 = r8.a()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 == r2) goto L_0x005f
            r3 = 2
            if (r0 == r3) goto L_0x0057
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x002b
            if (r0 == r3) goto L_0x0029
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.i()
            r6.a(r7, r1, r8)
            return r2
        L_0x0021:
            int r7 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.f2211a
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r7 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException
            r7.<init>()
            throw r7
        L_0x0029:
            r7 = 0
            return r7
        L_0x002b:
            androidx.datastore.preferences.protobuf.k0 r0 = r6.m()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x0032:
            int r4 = r8.A()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x0041
            boolean r4 = r6.l(r0, r8)
            if (r4 != 0) goto L_0x0032
        L_0x0041:
            int r8 = r8.a()
            if (r3 != r8) goto L_0x004f
            androidx.datastore.preferences.protobuf.k0 r8 = r6.q(r0)
            r6.c(r1, r7, r8)
            return r2
        L_0x004f:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r7 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r8 = "Protocol message end-group tag did not match expected tag."
            r7.<init>(r8)
            throw r7
        L_0x0057:
            j2.c r8 = r8.E()
            r6.d(r7, r1, r8)
            return r2
        L_0x005f:
            long r3 = r8.e()
            r6.b(r7, r1, r3)
            return r2
        L_0x0067:
            long r3 = r8.L()
            r6.e(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j0.l(java.lang.Object, androidx.datastore.preferences.protobuf.f0):boolean");
    }

    public abstract k0 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t10);

    public abstract void p();

    public abstract k0 q(Object obj);

    public abstract void r(Object obj, g gVar);

    public abstract void s(Object obj, g gVar);
}
