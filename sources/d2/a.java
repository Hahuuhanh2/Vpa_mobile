package d2;

import d2.h;

/* compiled from: BaseObservable */
public class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public transient k f8538a;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        if (r0.f8542d != 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000d, code lost:
        r0.f8539a.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r3 = r0.f8539a.lastIndexOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r3 < 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r0.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0008, code lost:
        monitor-enter(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d2.h.a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            d2.k r0 = r2.f8538a     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            return
        L_0x0007:
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            monitor-enter(r0)
            int r1 = r0.f8542d     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0013
            java.util.ArrayList r1 = r0.f8539a     // Catch:{ all -> 0x0020 }
            r1.remove(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x001e
        L_0x0013:
            java.util.ArrayList r1 = r0.f8539a     // Catch:{ all -> 0x0020 }
            int r3 = r1.lastIndexOf(r3)     // Catch:{ all -> 0x0020 }
            if (r3 < 0) goto L_0x001e
            r0.f(r3)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a.a(d2.h$a):void");
    }

    public final void d(h.a aVar) {
        synchronized (this) {
            if (this.f8538a == null) {
                this.f8538a = new k();
            }
        }
        k kVar = this.f8538a;
        synchronized (kVar) {
            if (aVar != null) {
                int lastIndexOf = kVar.f8539a.lastIndexOf(aVar);
                if (lastIndexOf < 0 || kVar.a(lastIndexOf)) {
                    kVar.f8539a.add(aVar);
                }
            } else {
                throw new IllegalArgumentException("callback cannot be null");
            }
        }
    }

    public final void f(int i10) {
        synchronized (this) {
            k kVar = this.f8538a;
            if (kVar != null) {
                kVar.b(i10, this);
            }
        }
    }
}
