package androidx.datastore.preferences.protobuf;

import j2.c;

/* compiled from: LazyFieldLite */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public volatile z f2322a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f2323b;

    static {
        i.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.datastore.preferences.protobuf.z a(androidx.datastore.preferences.protobuf.z r2) {
        /*
            r1 = this;
            androidx.datastore.preferences.protobuf.z r0 = r1.f2322a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            androidx.datastore.preferences.protobuf.z r0 = r1.f2322a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f2322a = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            j2.c$e r0 = j2.c.f11484b     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.f2323b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f2322a = r2     // Catch:{ all -> 0x001d }
            j2.c$e r2 = j2.c.f11484b     // Catch:{ all -> 0x001d }
            r1.f2323b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            androidx.datastore.preferences.protobuf.z r2 = r1.f2322a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.r.a(androidx.datastore.preferences.protobuf.z):androidx.datastore.preferences.protobuf.z");
    }

    public final c b() {
        if (this.f2323b != null) {
            return this.f2323b;
        }
        synchronized (this) {
            if (this.f2323b != null) {
                c cVar = this.f2323b;
                return cVar;
            }
            if (this.f2322a == null) {
                this.f2323b = c.f11484b;
            } else {
                this.f2323b = this.f2322a.b();
            }
            c cVar2 = this.f2323b;
            return cVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        z zVar = this.f2322a;
        z zVar2 = rVar.f2322a;
        if (zVar == null && zVar2 == null) {
            return b().equals(rVar.b());
        }
        if (zVar != null && zVar2 != null) {
            return zVar.equals(zVar2);
        }
        if (zVar != null) {
            return zVar.equals(rVar.a(zVar.g()));
        }
        return a(zVar2.g()).equals(zVar2);
    }

    public int hashCode() {
        return 1;
    }
}
