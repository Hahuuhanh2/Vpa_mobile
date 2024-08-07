package t6;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class g implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f14851a;

    public /* synthetic */ g(m mVar) {
        this.f14851a = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r2.c(new com.google.android.gms.cloudmessaging.zzq("Not supported by GmsCore", (java.lang.SecurityException) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r2.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r5 = r5.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            t6.m r0 = r4.f14851a
            int r1 = r5.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            android.util.Log.isLoggable(r2, r3)
            monitor-enter(r0)
            android.util.SparseArray<t6.o<?>> r2 = r0.f14867e     // Catch:{ all -> 0x003e }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x003e }
            t6.o r2 = (t6.o) r2     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            goto L_0x003c
        L_0x0017:
            android.util.SparseArray<t6.o<?>> r3 = r0.f14867e     // Catch:{ all -> 0x003e }
            r3.remove(r1)     // Catch:{ all -> 0x003e }
            r0.c()     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0039
            com.google.android.gms.cloudmessaging.zzq r5 = new com.google.android.gms.cloudmessaging.zzq
            java.lang.String r0 = "Not supported by GmsCore"
            r1 = 0
            r5.<init>(r0, r1)
            r2.c(r5)
            goto L_0x003c
        L_0x0039:
            r2.a(r5)
        L_0x003c:
            r5 = 1
            return r5
        L_0x003e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.g.handleMessage(android.os.Message):boolean");
    }
}
