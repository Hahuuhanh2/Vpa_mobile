package t1;

import t1.k;
import v1.a;

/* compiled from: FontRequestWorker */
public final class j implements a<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14777a;

    public j(String str) {
        this.f14777a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 >= r2.size()) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        ((v1.a) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            t1.k$a r5 = (t1.k.a) r5
            java.lang.Object r0 = t1.k.f14780c
            monitor-enter(r0)
            v0.h<java.lang.String, java.util.ArrayList<v1.a<t1.k$a>>> r1 = t1.k.f14781d     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r4.f14777a     // Catch:{ all -> 0x002e }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x002e }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            goto L_0x002d
        L_0x0014:
            java.lang.String r3 = r4.f14777a     // Catch:{ all -> 0x002e }
            r1.remove(r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            r0 = 0
        L_0x001b:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002d
            java.lang.Object r1 = r2.get(r0)
            v1.a r1 = (v1.a) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x001b
        L_0x002d:
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.j.accept(java.lang.Object):void");
    }
}
