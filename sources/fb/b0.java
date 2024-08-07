package fb;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v0.b;

/* compiled from: TopicsSubscriber */
public final class b0 {

    /* renamed from: i  reason: collision with root package name */
    public static final long f10102i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f10103j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10104a;

    /* renamed from: b  reason: collision with root package name */
    public final q f10105b;

    /* renamed from: c  reason: collision with root package name */
    public final n f10106c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f10107d;

    /* renamed from: e  reason: collision with root package name */
    public final b f10108e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f10109f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10110g = false;

    /* renamed from: h  reason: collision with root package name */
    public final z f10111h;

    public b0(FirebaseMessaging firebaseMessaging, q qVar, z zVar, n nVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10107d = firebaseMessaging;
        this.f10105b = qVar;
        this.f10111h = zVar;
        this.f10106c = nVar;
        this.f10104a = context;
        this.f10109f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    public static boolean d() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    public final void b(String str) {
        n nVar = this.f10106c;
        String a10 = this.f10107d.a();
        nVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(nVar.a(nVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        n nVar = this.f10106c;
        String a10 = this.f10107d.a();
        nVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(nVar.a(nVar.c(a10, "/topics/" + str, bundle)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = r0.f10183b;
        r4 = 65535;
        r5 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r5 == 83) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r5 == 85) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r3.equals("U") == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r3.equals("S") == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r4 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r4 == 1) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        c(r0.f10182a);
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        b(r0.f10182a);
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r3.getMessage()) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r3.getMessage() != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        r3.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r7 = this;
        L_0x0000:
            monitor-enter(r7)
            fb.z r0 = r7.f10111h     // Catch:{ all -> 0x00d1 }
            fb.y r0 = r0.a()     // Catch:{ all -> 0x00d1 }
            r1 = 1
            if (r0 != 0) goto L_0x000f
            d()     // Catch:{ all -> 0x00d1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            return r1
        L_0x000f:
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            r2 = 0
            java.lang.String r3 = r0.f10183b     // Catch:{ IOException -> 0x004f }
            r4 = -1
            int r5 = r3.hashCode()     // Catch:{ IOException -> 0x004f }
            r6 = 83
            if (r5 == r6) goto L_0x002b
            r6 = 85
            if (r5 == r6) goto L_0x0021
            goto L_0x0034
        L_0x0021:
            java.lang.String r5 = "U"
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x004f }
            if (r3 == 0) goto L_0x0034
            r4 = r1
            goto L_0x0034
        L_0x002b:
            java.lang.String r5 = "S"
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x004f }
            if (r3 == 0) goto L_0x0034
            r4 = r2
        L_0x0034:
            if (r4 == 0) goto L_0x0045
            if (r4 == r1) goto L_0x003c
            d()     // Catch:{ IOException -> 0x004f }
            goto L_0x004d
        L_0x003c:
            java.lang.String r3 = r0.f10182a     // Catch:{ IOException -> 0x004f }
            r7.c(r3)     // Catch:{ IOException -> 0x004f }
            d()     // Catch:{ IOException -> 0x004f }
            goto L_0x004d
        L_0x0045:
            java.lang.String r3 = r0.f10182a     // Catch:{ IOException -> 0x004f }
            r7.b(r3)     // Catch:{ IOException -> 0x004f }
            d()     // Catch:{ IOException -> 0x004f }
        L_0x004d:
            r3 = r1
            goto L_0x0075
        L_0x004f:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "SERVICE_NOT_AVAILABLE"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0071
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "INTERNAL_SERVER_ERROR"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.String r4 = r3.getMessage()
            if (r4 != 0) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            throw r3
        L_0x0071:
            r3.getMessage()
        L_0x0074:
            r3 = r2
        L_0x0075:
            if (r3 != 0) goto L_0x0078
            return r2
        L_0x0078:
            fb.z r2 = r7.f10111h
            monitor-enter(r2)
            fb.w r3 = r2.f10186a     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = r0.f10184c     // Catch:{ all -> 0x00ce }
            java.util.ArrayDeque<java.lang.String> r5 = r3.f10175d     // Catch:{ all -> 0x00ce }
            monitor-enter(r5)     // Catch:{ all -> 0x00ce }
            java.util.ArrayDeque<java.lang.String> r6 = r3.f10175d     // Catch:{ all -> 0x00cb }
            boolean r4 = r6.remove(r4)     // Catch:{ all -> 0x00cb }
            if (r4 == 0) goto L_0x0094
            java.util.concurrent.Executor r4 = r3.f10176e     // Catch:{ all -> 0x00cb }
            fb.l r6 = new fb.l     // Catch:{ all -> 0x00cb }
            r6.<init>(r3, r1)     // Catch:{ all -> 0x00cb }
            r4.execute(r6)     // Catch:{ all -> 0x00cb }
        L_0x0094:
            monitor-exit(r5)     // Catch:{ all -> 0x00cb }
            monitor-exit(r2)
            v0.b r1 = r7.f10108e
            monitor-enter(r1)
            java.lang.String r0 = r0.f10184c     // Catch:{ all -> 0x00c8 }
            v0.b r2 = r7.f10108e     // Catch:{ all -> 0x00c8 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x00a6
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            goto L_0x0000
        L_0x00a6:
            v0.b r2 = r7.f10108e     // Catch:{ all -> 0x00c8 }
            r3 = 0
            java.lang.Object r2 = r2.getOrDefault(r0, r3)     // Catch:{ all -> 0x00c8 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x00c8 }
            java.lang.Object r4 = r2.poll()     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4     // Catch:{ all -> 0x00c8 }
            if (r4 == 0) goto L_0x00ba
            r4.setResult(r3)     // Catch:{ all -> 0x00c8 }
        L_0x00ba:
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x00c5
            v0.b r2 = r7.f10108e     // Catch:{ all -> 0x00c8 }
            r2.remove(r0)     // Catch:{ all -> 0x00c8 }
        L_0x00c5:
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            goto L_0x0000
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            throw r0
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.b0.e():boolean");
    }

    public final void f(long j10) {
        this.f10109f.schedule(new c0(this, this.f10104a, this.f10105b, Math.min(Math.max(30, 2 * j10), f10102i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f10110g = true;
        }
    }
}
