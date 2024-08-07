package fb;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncTask */
public final class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f10177a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f10178b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f10179c;

    /* compiled from: SyncTask */
    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public x f10180a;

        public a(x xVar) {
            this.f10180a = xVar;
        }

        public final void a() {
            if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                Log.isLoggable("FirebaseMessaging", 3);
            }
            this.f10180a.f10179c.f7589d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final void onReceive(Context context, Intent intent) {
            x xVar = this.f10180a;
            if (xVar != null && xVar.a()) {
                if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                x xVar2 = this.f10180a;
                xVar2.f10179c.getClass();
                FirebaseMessaging.b(xVar2, 0);
                this.f10180a.f10179c.f7589d.unregisterReceiver(this);
                this.f10180a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public x(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i7.a("firebase-iid-executor"));
        this.f10179c = firebaseMessaging;
        this.f10177a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f7589d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f10178b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f10179c.f7589d.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        boolean z10 = true;
        try {
            if (this.f10179c.a() == null) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                e10.getMessage();
                return false;
            } else if (e10.getMessage() == null) {
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1.getMessage();
        r1 = r4.f10179c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a5, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r1.f7596k = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b5, code lost:
        if (fb.v.a().c(r4.f10179c.f7589d) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00cc, code lost:
        if (fb.v.a().c(r4.f10179c.f7589d) != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ce, code lost:
        r4.f10178b.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"WakelockTimeout"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            fb.v r0 = fb.v.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c
            android.content.Context r1 = r1.f7589d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r0 = r4.f10178b
            r0.acquire()
        L_0x0013:
            r0 = 0
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c     // Catch:{ IOException -> 0x0045 }
            r2 = 1
            monitor-enter(r1)     // Catch:{ IOException -> 0x0045 }
            r1.f7596k = r2     // Catch:{ all -> 0x009d }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c     // Catch:{ IOException -> 0x0045 }
            fb.q r1 = r1.f7595j     // Catch:{ IOException -> 0x0045 }
            boolean r1 = r1.b()     // Catch:{ IOException -> 0x0045 }
            if (r1 != 0) goto L_0x0047
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c     // Catch:{ IOException -> 0x0045 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0045 }
            r1.f7596k = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            fb.v r0 = fb.v.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c
            android.content.Context r1 = r1.f7589d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x003e
            android.os.PowerManager$WakeLock r0 = r4.f10178b
            r0.release()
        L_0x003e:
            return
        L_0x003f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            throw r2     // Catch:{ IOException -> 0x0045 }
        L_0x0042:
            r0 = move-exception
            goto L_0x00c0
        L_0x0045:
            r1 = move-exception
            goto L_0x00a0
        L_0x0047:
            fb.v r1 = fb.v.a()     // Catch:{ IOException -> 0x0045 }
            com.google.firebase.messaging.FirebaseMessaging r2 = r4.f10179c     // Catch:{ IOException -> 0x0045 }
            android.content.Context r2 = r2.f7589d     // Catch:{ IOException -> 0x0045 }
            boolean r1 = r1.b(r2)     // Catch:{ IOException -> 0x0045 }
            if (r1 == 0) goto L_0x0077
            boolean r1 = r4.a()     // Catch:{ IOException -> 0x0045 }
            if (r1 != 0) goto L_0x0077
            fb.x$a r1 = new fb.x$a     // Catch:{ IOException -> 0x0045 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0045 }
            r1.a()     // Catch:{ IOException -> 0x0045 }
            fb.v r0 = fb.v.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c
            android.content.Context r1 = r1.f7589d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0076
            android.os.PowerManager$WakeLock r0 = r4.f10178b
            r0.release()
        L_0x0076:
            return
        L_0x0077:
            boolean r1 = r4.b()     // Catch:{ IOException -> 0x0045 }
            if (r1 == 0) goto L_0x0087
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c     // Catch:{ IOException -> 0x0045 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0045 }
            r1.f7596k = r0     // Catch:{ all -> 0x0084 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            goto L_0x008e
        L_0x0084:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            throw r2     // Catch:{ IOException -> 0x0045 }
        L_0x0087:
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c     // Catch:{ IOException -> 0x0045 }
            long r2 = r4.f10177a     // Catch:{ IOException -> 0x0045 }
            r1.e(r2)     // Catch:{ IOException -> 0x0045 }
        L_0x008e:
            fb.v r0 = fb.v.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c
            android.content.Context r1 = r1.f7589d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00bc
            goto L_0x00b7
        L_0x009d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            throw r2     // Catch:{ IOException -> 0x0045 }
        L_0x00a0:
            r1.getMessage()     // Catch:{ all -> 0x0042 }
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c     // Catch:{ all -> 0x0042 }
            monitor-enter(r1)     // Catch:{ all -> 0x0042 }
            r1.f7596k = r0     // Catch:{ all -> 0x00bd }
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            fb.v r0 = fb.v.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r4.f10179c
            android.content.Context r1 = r1.f7589d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00bc
        L_0x00b7:
            android.os.PowerManager$WakeLock r0 = r4.f10178b
            r0.release()
        L_0x00bc:
            return
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x00c0:
            fb.v r1 = fb.v.a()
            com.google.firebase.messaging.FirebaseMessaging r2 = r4.f10179c
            android.content.Context r2 = r2.f7589d
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L_0x00d3
            android.os.PowerManager$WakeLock r1 = r4.f10178b
            r1.release()
        L_0x00d3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.x.run():void");
    }
}
