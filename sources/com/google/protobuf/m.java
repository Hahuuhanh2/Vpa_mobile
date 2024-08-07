package com.google.protobuf;

import tc.c;
import tc.e;

/* compiled from: LazyFieldLite */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public volatile u f7921a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f7922b;

    static {
        e.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.u a(com.google.protobuf.u r2) {
        /*
            r1 = this;
            com.google.protobuf.u r0 = r1.f7921a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            com.google.protobuf.u r0 = r1.f7921a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f7921a = r2     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            tc.c$e r0 = tc.c.f14960b     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            r1.f7922b = r0     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f7921a = r2     // Catch:{ all -> 0x001d }
            tc.c$e r2 = tc.c.f14960b     // Catch:{ all -> 0x001d }
            r1.f7922b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            com.google.protobuf.u r2 = r1.f7921a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m.a(com.google.protobuf.u):com.google.protobuf.u");
    }

    public final c b() {
        if (this.f7922b != null) {
            return this.f7922b;
        }
        synchronized (this) {
            if (this.f7922b != null) {
                c cVar = this.f7922b;
                return cVar;
            }
            if (this.f7921a == null) {
                this.f7922b = c.f14960b;
            } else {
                this.f7922b = this.f7921a.b();
            }
            c cVar2 = this.f7922b;
            return cVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        u uVar = this.f7921a;
        u uVar2 = mVar.f7921a;
        if (uVar == null && uVar2 == null) {
            return b().equals(mVar.b());
        }
        if (uVar != null && uVar2 != null) {
            return uVar.equals(uVar2);
        }
        if (uVar != null) {
            return uVar.equals(mVar.a(uVar.g()));
        }
        return a(uVar2.g()).equals(uVar2);
    }

    public int hashCode() {
        return 1;
    }
}
