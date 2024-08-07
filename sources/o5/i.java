package o5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache */
public class i<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f13745a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f13746b;

    /* renamed from: c  reason: collision with root package name */
    public long f13747c;

    /* compiled from: LruCache */
    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        public final Y f13748a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13749b;

        public a(Y y10, int i10) {
            this.f13748a = y10;
            this.f13749b = i10;
        }
    }

    public i(long j10) {
        this.f13746b = j10;
    }

    public final synchronized Y a(T t10) {
        Y y10;
        a aVar = (a) this.f13745a.get(t10);
        if (aVar != null) {
            y10 = aVar.f13748a;
        } else {
            y10 = null;
        }
        return y10;
    }

    public int b(Y y10) {
        return 1;
    }

    public void c(T t10, Y y10) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized Y d(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.b(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r0     // Catch:{ all -> 0x004c }
            long r3 = r7.f13746b     // Catch:{ all -> 0x004c }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f13747c     // Catch:{ all -> 0x004c }
            long r5 = r5 + r1
            r7.f13747c = r5     // Catch:{ all -> 0x004c }
        L_0x0019:
            java.util.LinkedHashMap r1 = r7.f13745a     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            o5.i$a r2 = new o5.i$a     // Catch:{ all -> 0x004c }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004c }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004c }
            o5.i$a r0 = (o5.i.a) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f13747c     // Catch:{ all -> 0x004c }
            int r3 = r0.f13749b     // Catch:{ all -> 0x004c }
            long r5 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 - r5
            r7.f13747c = r1     // Catch:{ all -> 0x004c }
            Y r1 = r0.f13748a     // Catch:{ all -> 0x004c }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f13748a     // Catch:{ all -> 0x004c }
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
        L_0x0041:
            long r8 = r7.f13746b     // Catch:{ all -> 0x004c }
            r7.e(r8)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            Y r4 = r0.f13748a     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return r4
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.i.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized void e(long j10) {
        while (this.f13747c > j10) {
            Iterator it = this.f13745a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f13747c -= (long) aVar.f13749b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f13748a);
        }
    }
}
