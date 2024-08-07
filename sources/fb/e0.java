package fb;

import android.content.Intent;
import java.util.concurrent.TimeUnit;
import s7.a;

/* compiled from: WakeLockHolder */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f10129a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10130b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static a f10131c;

    public static void a(Intent intent) {
        synchronized (f10130b) {
            if (f10131c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f10131c.c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName b(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f10130b
            monitor-enter(r0)
            s7.a r1 = f10131c     // Catch:{ all -> 0x0039 }
            r2 = 1
            if (r1 != 0) goto L_0x0019
            s7.a r1 = new s7.a     // Catch:{ all -> 0x0039 }
            r1.<init>(r4)     // Catch:{ all -> 0x0039 }
            f10131c = r1     // Catch:{ all -> 0x0039 }
            java.lang.Object r3 = r1.f14642a     // Catch:{ all -> 0x0039 }
            monitor-enter(r3)     // Catch:{ all -> 0x0039 }
            r1.f14648g = r2     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0016 }
            throw r4     // Catch:{ all -> 0x0039 }
        L_0x0019:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x0039 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x002e
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x002e:
            if (r1 != 0) goto L_0x0037
            s7.a r5 = f10131c     // Catch:{ all -> 0x0039 }
            long r1 = f10129a     // Catch:{ all -> 0x0039 }
            r5.a(r1)     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.e0.b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
