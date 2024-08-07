package t6;

import android.content.ServiceConnection;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14854a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14855b;

    public /* synthetic */ i(ServiceConnection serviceConnection) {
        this.f14855b = serviceConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r3 = r0.f14868f.f14874a;
        r4 = r0.f14864b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f14871c;
        r5.arg1 = r1.f14869a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.b());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f14872d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = r0.f14865c;
        r3 = (android.os.Messenger) r1.f16904b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        if (r3 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
        r1 = (com.google.android.gms.cloudmessaging.zzd) r1.f16905c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009e, code lost:
        if (r1 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        r1 = r1.f5318a;
        r1.getClass();
        r1.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f14854a
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00bf
        L_0x0007:
            java.lang.Object r0 = r8.f14855b
            t6.m r0 = (t6.m) r0
        L_0x000b:
            monitor-enter(r0)
            int r1 = r0.f14863a     // Catch:{ all -> 0x00bc }
            r2 = 2
            if (r1 == r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            goto L_0x001f
        L_0x0013:
            java.util.ArrayDeque r1 = r0.f14866d     // Catch:{ all -> 0x00bc }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x0020
            r0.c()     // Catch:{ all -> 0x00bc }
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
        L_0x001f:
            return
        L_0x0020:
            java.util.ArrayDeque r1 = r0.f14866d     // Catch:{ all -> 0x00bc }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00bc }
            t6.o r1 = (t6.o) r1     // Catch:{ all -> 0x00bc }
            android.util.SparseArray<t6.o<?>> r3 = r0.f14867e     // Catch:{ all -> 0x00bc }
            int r4 = r1.f14869a     // Catch:{ all -> 0x00bc }
            r3.put(r4, r1)     // Catch:{ all -> 0x00bc }
            t6.q r3 = r0.f14868f     // Catch:{ all -> 0x00bc }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f14875b     // Catch:{ all -> 0x00bc }
            t6.l r4 = new t6.l     // Catch:{ all -> 0x00bc }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00bc }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00bc }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00bc }
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0058
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 8
            r4.<init>(r3)
        L_0x0058:
            t6.q r3 = r0.f14868f
            android.content.Context r3 = r3.f14874a
            android.os.Messenger r4 = r0.f14864b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f14871c
            r5.what = r6
            int r6 = r1.f14869a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f14872d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            x2.g r1 = r0.f14865c     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.Object r3 = r1.f16904b     // Catch:{ RemoteException -> 0x00b2 }
            android.os.Messenger r3 = (android.os.Messenger) r3     // Catch:{ RemoteException -> 0x00b2 }
            if (r3 == 0) goto L_0x009a
            r3.send(r5)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x000b
        L_0x009a:
            java.lang.Object r1 = r1.f16905c     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.cloudmessaging.zzd r1 = (com.google.android.gms.cloudmessaging.zzd) r1     // Catch:{ RemoteException -> 0x00b2 }
            if (r1 == 0) goto L_0x00aa
            android.os.Messenger r1 = r1.f5318a     // Catch:{ RemoteException -> 0x00b2 }
            r1.getClass()     // Catch:{ RemoteException -> 0x00b2 }
            r1.send(r5)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x000b
        L_0x00aa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00b2 }
            throw r1     // Catch:{ RemoteException -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x000b
        L_0x00bc:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            throw r1
        L_0x00bf:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r8.f14855b
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.i.run():void");
    }

    public i(Runnable runnable) {
        this.f14855b = runnable;
    }
}
