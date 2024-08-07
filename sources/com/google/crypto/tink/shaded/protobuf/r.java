package com.google.crypto.tink.shaded.protobuf;

import j9.c;

/* compiled from: LazyFieldLite */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public volatile x f7419a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f7420b;

    static {
        i.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.crypto.tink.shaded.protobuf.x a(com.google.crypto.tink.shaded.protobuf.x r2) {
        /*
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.x r0 = r1.f7419a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.x r0 = r1.f7419a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f7419a = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            j9.c$f r0 = j9.c.f11735b     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.f7420b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f7419a = r2     // Catch:{ all -> 0x001d }
            j9.c$f r2 = j9.c.f11735b     // Catch:{ all -> 0x001d }
            r1.f7420b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.google.crypto.tink.shaded.protobuf.x r2 = r1.f7419a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r.a(com.google.crypto.tink.shaded.protobuf.x):com.google.crypto.tink.shaded.protobuf.x");
    }

    public final c b() {
        if (this.f7420b != null) {
            return this.f7420b;
        }
        synchronized (this) {
            if (this.f7420b != null) {
                c cVar = this.f7420b;
                return cVar;
            }
            if (this.f7419a == null) {
                this.f7420b = c.f11735b;
            } else {
                this.f7420b = this.f7419a.b();
            }
            c cVar2 = this.f7420b;
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
        x xVar = this.f7419a;
        x xVar2 = rVar.f7419a;
        if (xVar == null && xVar2 == null) {
            return b().equals(rVar.b());
        }
        if (xVar != null && xVar2 != null) {
            return xVar.equals(xVar2);
        }
        if (xVar != null) {
            return xVar.equals(rVar.a(xVar.g()));
        }
        return a(xVar2.g()).equals(xVar2);
    }

    public int hashCode() {
        return 1;
    }
}
