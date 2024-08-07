package w8;

import androidx.fragment.app.o;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import d9.j;
import d9.s;
import i9.c0;
import i9.i0;
import i9.t;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z.d;

/* compiled from: KeysetHandle */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f16723a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f16724b;

    /* renamed from: c  reason: collision with root package name */
    public final g9.a f16725c = g9.a.f10398b;

    /* compiled from: KeysetHandle */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f16726a;

        public a(o oVar) {
            this.f16726a = oVar;
        }
    }

    public i(c0 c0Var, List<a> list) {
        this.f16723a = c0Var;
        this.f16724b = list;
    }

    public static final i a(c0 c0Var) {
        Integer num;
        if (c0Var.H() > 0) {
            ArrayList arrayList = new ArrayList(c0Var.H());
            for (c0.b next : c0Var.I()) {
                int J = next.J();
                int J2 = next.J();
                if (next.K() == i0.RAW) {
                    num = null;
                } else {
                    num = Integer.valueOf(J2);
                }
                try {
                    try {
                        o a10 = j.f8789b.a(s.a(next.I().J(), next.I().K(), next.I().I(), next.K(), num));
                        int ordinal = next.L().ordinal();
                        if (!(ordinal == 1 || ordinal == 2)) {
                            if (ordinal != 3) {
                                throw new GeneralSecurityException("Unknown key status");
                            }
                        }
                        int J3 = c0Var.J();
                        arrayList.add(new a(a10));
                    } catch (GeneralSecurityException unused) {
                        arrayList.add((Object) null);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new TinkBugException("Creating a protokey serialization failed", e10);
                }
            }
            return new i(c0Var, Collections.unmodifiableList(arrayList));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX INFO: finally extract failed */
    public static final i c(d dVar, a aVar) {
        byte[] bArr = new byte[0];
        try {
            t I = t.I((InputStream) dVar.f17746a, com.google.crypto.tink.shaded.protobuf.i.a());
            ((InputStream) dVar.f17746a).close();
            if (I.G().size() != 0) {
                try {
                    c0 M = c0.M(aVar.b(I.G().s(), bArr), com.google.crypto.tink.shaded.protobuf.i.a());
                    if (M.H() > 0) {
                        return a(M);
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            } else {
                throw new GeneralSecurityException("empty keyset");
            }
        } catch (Throwable th2) {
            ((InputStream) dVar.f17746a).close();
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <P> P b(java.lang.Class<P> r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicReference<w8.f> r0 = w8.q.f16745a
            r0 = 0
            d9.i r1 = d9.i.f8787b     // Catch:{ GeneralSecurityException -> 0x000a }
            java.lang.Class r1 = r1.a(r15)     // Catch:{ GeneralSecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            java.lang.String r2 = "No wrapper found for "
            if (r1 == 0) goto L_0x01c6
            i9.z r3 = i9.z.ENABLED
            i9.c0 r4 = r14.f16723a
            int r5 = w8.r.f16749a
            int r5 = r4.J()
            java.util.List r4 = r4.I()
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = 1
            r8 = r6
            r9 = r8
            r10 = r7
        L_0x0026:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00b9
            java.lang.Object r11 = r4.next()
            i9.c0$b r11 = (i9.c0.b) r11
            i9.z r12 = r11.L()
            if (r12 == r3) goto L_0x0039
            goto L_0x0026
        L_0x0039:
            boolean r12 = r11.M()
            if (r12 == 0) goto L_0x00a1
            i9.i0 r12 = r11.K()
            i9.i0 r13 = i9.i0.UNKNOWN_PREFIX
            if (r12 == r13) goto L_0x0089
            i9.z r12 = r11.L()
            i9.z r13 = i9.z.UNKNOWN_STATUS
            if (r12 == r13) goto L_0x0071
            int r12 = r11.J()
            if (r12 != r5) goto L_0x0061
            if (r9 != 0) goto L_0x0059
            r9 = r7
            goto L_0x0061
        L_0x0059:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains multiple primary keys"
            r15.<init>(r0)
            throw r15
        L_0x0061:
            i9.y r11 = r11.I()
            i9.y$b r11 = r11.I()
            i9.y$b r12 = i9.y.b.ASYMMETRIC_PUBLIC
            if (r11 == r12) goto L_0x006e
            r10 = r6
        L_0x006e:
            int r8 = r8 + 1
            goto L_0x0026
        L_0x0071:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.J()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown status"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x0089:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.J()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown prefix"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00a1:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.J()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has no key data"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00b9:
            if (r8 == 0) goto L_0x01be
            if (r9 != 0) goto L_0x00c8
            if (r10 == 0) goto L_0x00c0
            goto L_0x00c8
        L_0x00c0:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            r15.<init>(r0)
            throw r15
        L_0x00c8:
            w8.n$a r4 = new w8.n$a
            r4.<init>(r1)
            g9.a r5 = r14.f16725c
            j$.util.concurrent.ConcurrentHashMap r8 = r4.f16733b
            if (r8 == 0) goto L_0x01b6
            r4.f16735d = r5
            r5 = r6
        L_0x00d6:
            i9.c0 r8 = r14.f16723a
            int r8 = r8.H()
            if (r5 >= r8) goto L_0x014b
            i9.c0 r8 = r14.f16723a
            i9.c0$b r8 = r8.G(r5)
            i9.z r9 = r8.L()
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x0148
            i9.y r9 = r8.I()     // Catch:{ GeneralSecurityException -> 0x0101 }
            java.util.concurrent.atomic.AtomicReference<w8.f> r10 = w8.q.f16745a     // Catch:{ GeneralSecurityException -> 0x0101 }
            java.lang.String r10 = r9.J()     // Catch:{ GeneralSecurityException -> 0x0101 }
            j9.c r9 = r9.K()     // Catch:{ GeneralSecurityException -> 0x0101 }
            java.lang.Object r9 = w8.q.c(r10, r9, r1)     // Catch:{ GeneralSecurityException -> 0x0101 }
            goto L_0x011d
        L_0x0101:
            r9 = move-exception
            java.lang.String r10 = r9.getMessage()
            java.lang.String r11 = "No key manager found for key type "
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x011c
            java.lang.String r10 = r9.getMessage()
            java.lang.String r11 = " not supported by key manager of type "
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            throw r9
        L_0x011c:
            r9 = r0
        L_0x011d:
            java.util.List<w8.i$a> r10 = r14.f16724b
            java.lang.Object r10 = r10.get(r5)
            if (r10 == 0) goto L_0x0134
            java.util.List<w8.i$a> r10 = r14.f16724b
            java.lang.Object r10 = r10.get(r5)
            w8.i$a r10 = (w8.i.a) r10
            androidx.fragment.app.o r10 = r10.f16726a
            java.lang.Object r10 = w8.q.b(r10, r1)     // Catch:{ GeneralSecurityException -> 0x0134 }
            goto L_0x0135
        L_0x0134:
            r10 = r0
        L_0x0135:
            int r11 = r8.J()
            i9.c0 r12 = r14.f16723a
            int r12 = r12.J()
            if (r11 != r12) goto L_0x0145
            r4.a(r10, r9, r8, r7)
            goto L_0x0148
        L_0x0145:
            r4.a(r10, r9, r8, r6)
        L_0x0148:
            int r5 = r5 + 1
            goto L_0x00d6
        L_0x014b:
            j$.util.concurrent.ConcurrentHashMap r1 = r4.f16733b
            if (r1 == 0) goto L_0x01ae
            w8.n r3 = new w8.n
            w8.n$b<P> r5 = r4.f16734c
            g9.a r6 = r4.f16735d
            java.lang.Class<P> r7 = r4.f16732a
            r3.<init>(r1, r5, r6, r7)
            r4.f16733b = r0
            java.util.concurrent.atomic.AtomicReference<w8.f> r0 = w8.q.f16745a
            d9.i r0 = d9.i.f8787b
            java.util.concurrent.atomic.AtomicReference<d9.r> r0 = r0.f8788a
            java.lang.Object r0 = r0.get()
            d9.r r0 = (d9.r) r0
            java.util.HashMap r1 = r0.f8800b
            boolean r1 = r1.containsKey(r15)
            if (r1 == 0) goto L_0x0199
            java.util.HashMap r0 = r0.f8800b
            java.lang.Object r15 = r0.get(r15)
            w8.o r15 = (w8.o) r15
            java.lang.Class r0 = r15.a()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0191
            java.lang.Class r0 = r15.a()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0191
            java.lang.Object r15 = r15.c(r3)
            return r15
        L_0x0191:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r15.<init>(r0)
            throw r15
        L_0x0199:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x01ae:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "build cannot be called twice"
            r15.<init>(r0)
            throw r15
        L_0x01b6:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "setAnnotations cannot be called after build"
            r15.<init>(r0)
            throw r15
        L_0x01be:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            r15.<init>(r0)
            throw r15
        L_0x01c6:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r2)
            java.lang.String r15 = r15.getName()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.i.b(java.lang.Class):java.lang.Object");
    }

    public final String toString() {
        return r.a(this.f16723a).toString();
    }
}
