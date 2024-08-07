package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static volatile i f2271b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f2272c = new i(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, n.e<?, ?>> f2273a;

    /* compiled from: ExtensionRegistryLite */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2274a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2275b;

        public a(Object obj, int i10) {
            this.f2274a = obj;
            this.f2275b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2274a == aVar.f2274a && this.f2275b == aVar.f2275b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2274a) * 65535) + this.f2275b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }

    public i() {
        this.f2273a = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|(3:9|10|11)|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.datastore.preferences.protobuf.i a() {
        /*
            androidx.datastore.preferences.protobuf.i r0 = f2271b
            if (r0 != 0) goto L_0x002b
            java.lang.Class<androidx.datastore.preferences.protobuf.i> r1 = androidx.datastore.preferences.protobuf.i.class
            monitor-enter(r1)
            androidx.datastore.preferences.protobuf.i r0 = f2271b     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            java.lang.Class<?> r0 = j2.d.f11488a     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = "getEmptyRegistry"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0022 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch:{ Exception -> 0x0022 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0022 }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r2)     // Catch:{ Exception -> 0x0022 }
            androidx.datastore.preferences.protobuf.i r0 = (androidx.datastore.preferences.protobuf.i) r0     // Catch:{ Exception -> 0x0022 }
            goto L_0x0024
        L_0x0022:
            androidx.datastore.preferences.protobuf.i r0 = f2272c     // Catch:{ all -> 0x0028 }
        L_0x0024:
            f2271b = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.a():androidx.datastore.preferences.protobuf.i");
    }

    public i(int i10) {
        this.f2273a = Collections.emptyMap();
    }
}
