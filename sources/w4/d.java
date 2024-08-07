package w4;

import java.io.File;
import p4.a;

/* compiled from: DiskLruCacheWrapper */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final j f16466a;

    /* renamed from: b  reason: collision with root package name */
    public final File f16467b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16468c;

    /* renamed from: d  reason: collision with root package name */
    public final b f16469d = new b();

    /* renamed from: e  reason: collision with root package name */
    public a f16470e;

    @Deprecated
    public d(File file, long j10) {
        this.f16467b = file;
        this.f16468c = j10;
        this.f16466a = new j();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0094 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(s4.e r6, u4.g r7) {
        /*
            r5 = this;
            w4.j r0 = r5.f16466a
            java.lang.String r0 = r0.a(r6)
            w4.b r1 = r5.f16469d
            monitor-enter(r1)
            java.util.HashMap r2 = r1.f16459a     // Catch:{ all -> 0x00bd }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00bd }
            w4.b$a r2 = (w4.b.a) r2     // Catch:{ all -> 0x00bd }
            if (r2 != 0) goto L_0x0031
            w4.b$b r2 = r1.f16460b     // Catch:{ all -> 0x00bd }
            java.util.ArrayDeque r3 = r2.f16463a     // Catch:{ all -> 0x00bd }
            monitor-enter(r3)     // Catch:{ all -> 0x00bd }
            java.util.ArrayDeque r2 = r2.f16463a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            w4.b$a r2 = (w4.b.a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            w4.b$a r2 = new w4.b$a     // Catch:{ all -> 0x00bd }
            r2.<init>()     // Catch:{ all -> 0x00bd }
        L_0x0028:
            java.util.HashMap r3 = r1.f16459a     // Catch:{ all -> 0x00bd }
            r3.put(r0, r2)     // Catch:{ all -> 0x00bd }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00bd }
        L_0x0031:
            int r3 = r2.f16462b     // Catch:{ all -> 0x00bd }
            r4 = 1
            int r3 = r3 + r4
            r2.f16462b = r3     // Catch:{ all -> 0x00bd }
            monitor-exit(r1)     // Catch:{ all -> 0x00bd }
            java.util.concurrent.locks.ReentrantLock r1 = r2.f16461a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x0049
            java.util.Objects.toString(r6)     // Catch:{ all -> 0x00b6 }
        L_0x0049:
            monitor-enter(r5)     // Catch:{ IOException -> 0x00af }
            p4.a r6 = r5.f16470e     // Catch:{ all -> 0x00ac }
            if (r6 != 0) goto L_0x0058
            java.io.File r6 = r5.f16467b     // Catch:{ all -> 0x00ac }
            long r1 = r5.f16468c     // Catch:{ all -> 0x00ac }
            p4.a r6 = p4.a.z(r6, r1)     // Catch:{ all -> 0x00ac }
            r5.f16470e = r6     // Catch:{ all -> 0x00ac }
        L_0x0058:
            p4.a r6 = r5.f16470e     // Catch:{ all -> 0x00ac }
            monitor-exit(r5)     // Catch:{ IOException -> 0x00af }
            p4.a$e r1 = r6.v(r0)     // Catch:{ IOException -> 0x00af }
            if (r1 == 0) goto L_0x0067
        L_0x0061:
            w4.b r6 = r5.f16469d
            r6.a(r0)
            return
        L_0x0067:
            p4.a$c r6 = r6.q(r0)     // Catch:{ IOException -> 0x00af }
            if (r6 == 0) goto L_0x0095
            java.io.File r1 = r6.b()     // Catch:{ all -> 0x008c }
            s4.d<DataType> r2 = r7.f15112a     // Catch:{ all -> 0x008c }
            DataType r3 = r7.f15113b     // Catch:{ all -> 0x008c }
            s4.h r7 = r7.f15114c     // Catch:{ all -> 0x008c }
            boolean r7 = r2.i(r3, r1, r7)     // Catch:{ all -> 0x008c }
            if (r7 == 0) goto L_0x0084
            p4.a r7 = p4.a.this     // Catch:{ all -> 0x008c }
            p4.a.d(r7, r6, r4)     // Catch:{ all -> 0x008c }
            r6.f14057c = r4     // Catch:{ all -> 0x008c }
        L_0x0084:
            boolean r7 = r6.f14057c     // Catch:{ IOException -> 0x00af }
            if (r7 != 0) goto L_0x0061
            r6.a()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0061
        L_0x008c:
            r7 = move-exception
            boolean r1 = r6.f14057c     // Catch:{ IOException -> 0x00af }
            if (r1 != 0) goto L_0x0094
            r6.a()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            throw r7     // Catch:{ IOException -> 0x00af }
        L_0x0095:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00af }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00af }
            r7.<init>()     // Catch:{ IOException -> 0x00af }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x00af }
            r7.append(r0)     // Catch:{ IOException -> 0x00af }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00af }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00af }
            throw r6     // Catch:{ IOException -> 0x00af }
        L_0x00ac:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x00af }
            throw r6     // Catch:{ IOException -> 0x00af }
        L_0x00af:
            java.lang.String r6 = "DiskLruCacheWrapper"
            r7 = 5
            android.util.Log.isLoggable(r6, r7)     // Catch:{ all -> 0x00b6 }
            goto L_0x0061
        L_0x00b6:
            r6 = move-exception
            w4.b r7 = r5.f16469d
            r7.a(r0)
            throw r6
        L_0x00bd:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bd }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.d.o(s4.e, u4.g):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        android.util.Log.isLoggable("DiskLruCacheWrapper", 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File q(s4.e r6) {
        /*
            r5 = this;
            w4.j r0 = r5.f16466a
            java.lang.String r0 = r0.a(r6)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x0012
            java.util.Objects.toString(r6)
        L_0x0012:
            r6 = 0
            monitor-enter(r5)     // Catch:{ IOException -> 0x0034 }
            p4.a r2 = r5.f16470e     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x0022
            java.io.File r2 = r5.f16467b     // Catch:{ all -> 0x0031 }
            long r3 = r5.f16468c     // Catch:{ all -> 0x0031 }
            p4.a r2 = p4.a.z(r2, r3)     // Catch:{ all -> 0x0031 }
            r5.f16470e = r2     // Catch:{ all -> 0x0031 }
        L_0x0022:
            p4.a r2 = r5.f16470e     // Catch:{ all -> 0x0031 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0034 }
            p4.a$e r0 = r2.v(r0)     // Catch:{ IOException -> 0x0034 }
            if (r0 == 0) goto L_0x0038
            r2 = 0
            java.io.File[] r0 = r0.f14066a     // Catch:{ IOException -> 0x0034 }
            r6 = r0[r2]     // Catch:{ IOException -> 0x0034 }
            goto L_0x0038
        L_0x0031:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0034 }
            throw r0     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r0 = 5
            android.util.Log.isLoggable(r1, r0)
        L_0x0038:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.d.q(s4.e):java.io.File");
    }
}
