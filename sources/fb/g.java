package fb;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: DisplayNotification */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f10133a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f10134b;

    /* renamed from: c  reason: collision with root package name */
    public final r f10135c;

    public g(Context context, r rVar, ExecutorService executorService) {
        this.f10133a = executorService;
        this.f10134b = context;
        this.f10135c = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[SYNTHETIC, Splitter:B:28:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r10 = this;
            fb.r r0 = r10.f10135c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r10.f10134b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 == 0) goto L_0x001e
            goto L_0x004e
        L_0x001e:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r10.f10134b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x004e
            java.util.Iterator r3 = r3.iterator()
        L_0x0036:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0036
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x004e
            r0 = r1
            goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            return r2
        L_0x0052:
            fb.r r0 = r10.f10135c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.i(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0062
            goto L_0x006d
        L_0x0062:
            fb.o r3 = new fb.o     // Catch:{ MalformedURLException -> 0x006d }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006d }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x006d }
            r3.<init>(r5)     // Catch:{ MalformedURLException -> 0x006d }
            goto L_0x006e
        L_0x006d:
            r3 = r4
        L_0x006e:
            if (r3 == 0) goto L_0x008a
            java.util.concurrent.ExecutorService r0 = r10.f10133a
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource
            r5.<init>()
            v.n r6 = new v.n
            r7 = 29
            r6.<init>(r7, r3, r5)
            java.util.concurrent.Future r0 = r0.submit(r6)
            r3.f10156b = r0
            com.google.android.gms.tasks.Task r0 = r5.getTask()
            r3.f10157c = r0
        L_0x008a:
            android.content.Context r0 = r10.f10134b
            fb.r r5 = r10.f10135c
            fb.e$a r0 = fb.e.a(r0, r5)
            i1.p r5 = r0.f10127a
            if (r3 != 0) goto L_0x0097
            goto L_0x00da
        L_0x0097:
            com.google.android.gms.tasks.Task<android.graphics.Bitmap> r6 = r3.f10157c     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            y6.j.f(r6)     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r7 = 5
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r7, r9)     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r5.d(r6)     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            i1.n r7 = new i1.n     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r7.<init>()     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            if (r6 != 0) goto L_0x00b2
            r8 = r4
            goto L_0x00b9
        L_0x00b2:
            androidx.core.graphics.drawable.IconCompat r8 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r8.<init>(r1)     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r8.f2121b = r6     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
        L_0x00b9:
            r7.f10966b = r8     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r7.f10967c = r4     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r7.f10968d = r1     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            r5.f(r7)     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00c7, TimeoutException -> 0x00c3 }
            goto L_0x00da
        L_0x00c3:
            r3.close()
            goto L_0x00da
        L_0x00c7:
            r3.close()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x00da
        L_0x00d2:
            r3 = move-exception
            java.lang.Throwable r3 = r3.getCause()
            java.util.Objects.toString(r3)
        L_0x00da:
            r3 = 3
            java.lang.String r4 = "FirebaseMessaging"
            android.util.Log.isLoggable(r4, r3)
            android.content.Context r3 = r10.f10134b
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            java.lang.String r4 = r0.f10128b
            i1.p r0 = r0.f10127a
            android.app.Notification r0 = r0.a()
            r3.notify(r4, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.g.a():boolean");
    }
}
