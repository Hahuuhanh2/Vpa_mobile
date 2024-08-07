package tc;

import com.google.protobuf.i;

/* compiled from: GeneratedMessageInfoFactory */
public final class h implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final h f14993a = new h();

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final tc.n a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.Class<com.google.protobuf.i> r0 = com.google.protobuf.i.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x0031
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch:{ Exception -> 0x0019 }
            com.google.protobuf.i r0 = com.google.protobuf.i.y(r0)     // Catch:{ Exception -> 0x0019 }
            com.google.protobuf.i$e r1 = com.google.protobuf.i.e.BUILD_MESSAGE_INFO     // Catch:{ Exception -> 0x0019 }
            java.lang.Object r0 = r0.w(r1)     // Catch:{ Exception -> 0x0019 }
            tc.n r0 = (tc.n) r0     // Catch:{ Exception -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        L_0x0031:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.h.a(java.lang.Class):tc.n");
    }

    public final boolean b(Class<?> cls) {
        return i.class.isAssignableFrom(cls);
    }
}
