package fb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: TopicsSyncTask */
public final class c0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f10114f = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static Boolean f10115n;

    /* renamed from: o  reason: collision with root package name */
    public static Boolean f10116o;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10117a;

    /* renamed from: b  reason: collision with root package name */
    public final q f10118b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f10119c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f10120d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10121e;

    /* compiled from: TopicsSyncTask */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public c0 f10122a;

        public a(c0 c0Var, c0 c0Var2) {
            this.f10122a = c0Var2;
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            c0 c0Var = this.f10122a;
            if (c0Var != null) {
                if (c0Var.c()) {
                    if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                    c0 c0Var2 = this.f10122a;
                    c0Var2.f10120d.f10109f.schedule(c0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f10122a = null;
                }
            }
        }
    }

    public c0(b0 b0Var, Context context, q qVar, long j10) {
        this.f10120d = b0Var;
        this.f10117a = context;
        this.f10121e = j10;
        this.f10118b = qVar;
        this.f10119c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f10114f) {
            Boolean bool = f10116o;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f10116o = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f10114f) {
            Boolean bool = f10115n;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f10115n = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo networkInfo;
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f10117a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1.getMessage();
        r1 = r6.f10120d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00a4, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1.f10110g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ae, code lost:
        if (b(r6.f10117a) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00bf, code lost:
        if (b(r6.f10117a) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r6.f10119c.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00c6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f10117a
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x000f
            android.os.PowerManager$WakeLock r0 = r6.f10119c
            long r1 = fb.f.f10132a
            r0.acquire(r1)
        L_0x000f:
            r0 = 0
            fb.b0 r1 = r6.f10120d     // Catch:{ IOException -> 0x0039 }
            r2 = 1
            monitor-enter(r1)     // Catch:{ IOException -> 0x0039 }
            r1.f10110g = r2     // Catch:{ all -> 0x009c }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0039 }
            fb.q r1 = r6.f10118b     // Catch:{ IOException -> 0x0039 }
            boolean r1 = r1.b()     // Catch:{ IOException -> 0x0039 }
            if (r1 != 0) goto L_0x003b
            fb.b0 r1 = r6.f10120d     // Catch:{ IOException -> 0x0039 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0039 }
            r1.f10110g = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0039 }
            android.content.Context r0 = r6.f10117a
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x0032
            android.os.PowerManager$WakeLock r0 = r6.f10119c     // Catch:{ RuntimeException -> 0x0032 }
            r0.release()     // Catch:{ RuntimeException -> 0x0032 }
        L_0x0032:
            return
        L_0x0033:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0039 }
            throw r2     // Catch:{ IOException -> 0x0039 }
        L_0x0036:
            r0 = move-exception
            goto L_0x00b9
        L_0x0039:
            r1 = move-exception
            goto L_0x009f
        L_0x003b:
            android.content.Context r1 = r6.f10117a     // Catch:{ IOException -> 0x0039 }
            boolean r1 = a(r1)     // Catch:{ IOException -> 0x0039 }
            if (r1 == 0) goto L_0x007a
            boolean r1 = r6.c()     // Catch:{ IOException -> 0x0039 }
            if (r1 != 0) goto L_0x007a
            fb.c0$a r1 = new fb.c0$a     // Catch:{ IOException -> 0x0039 }
            r1.<init>(r6, r6)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r2 = "FirebaseMessaging"
            r3 = 3
            boolean r4 = android.util.Log.isLoggable(r2, r3)     // Catch:{ IOException -> 0x0039 }
            if (r4 != 0) goto L_0x0060
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0039 }
            r5 = 23
            if (r4 != r5) goto L_0x0060
            android.util.Log.isLoggable(r2, r3)     // Catch:{ IOException -> 0x0039 }
        L_0x0060:
            android.content.Context r2 = r6.f10117a     // Catch:{ IOException -> 0x0039 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ IOException -> 0x0039 }
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0039 }
            r2.registerReceiver(r1, r3)     // Catch:{ IOException -> 0x0039 }
            android.content.Context r0 = r6.f10117a
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x0079
            android.os.PowerManager$WakeLock r0 = r6.f10119c     // Catch:{ RuntimeException -> 0x0079 }
            r0.release()     // Catch:{ RuntimeException -> 0x0079 }
        L_0x0079:
            return
        L_0x007a:
            fb.b0 r1 = r6.f10120d     // Catch:{ IOException -> 0x0039 }
            boolean r1 = r1.e()     // Catch:{ IOException -> 0x0039 }
            if (r1 == 0) goto L_0x008c
            fb.b0 r1 = r6.f10120d     // Catch:{ IOException -> 0x0039 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0039 }
            r1.f10110g = r0     // Catch:{ all -> 0x0089 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0039 }
            goto L_0x0093
        L_0x0089:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0039 }
            throw r2     // Catch:{ IOException -> 0x0039 }
        L_0x008c:
            fb.b0 r1 = r6.f10120d     // Catch:{ IOException -> 0x0039 }
            long r2 = r6.f10121e     // Catch:{ IOException -> 0x0039 }
            r1.f(r2)     // Catch:{ IOException -> 0x0039 }
        L_0x0093:
            android.content.Context r0 = r6.f10117a
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x00b5
            goto L_0x00b0
        L_0x009c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0039 }
            throw r2     // Catch:{ IOException -> 0x0039 }
        L_0x009f:
            r1.getMessage()     // Catch:{ all -> 0x0036 }
            fb.b0 r1 = r6.f10120d     // Catch:{ all -> 0x0036 }
            monitor-enter(r1)     // Catch:{ all -> 0x0036 }
            r1.f10110g = r0     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            android.content.Context r0 = r6.f10117a
            boolean r0 = b(r0)
            if (r0 == 0) goto L_0x00b5
        L_0x00b0:
            android.os.PowerManager$WakeLock r0 = r6.f10119c     // Catch:{ RuntimeException -> 0x00b5 }
            r0.release()     // Catch:{ RuntimeException -> 0x00b5 }
        L_0x00b5:
            return
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x00b9:
            android.content.Context r1 = r6.f10117a
            boolean r1 = b(r1)
            if (r1 == 0) goto L_0x00c6
            android.os.PowerManager$WakeLock r1 = r6.f10119c     // Catch:{ RuntimeException -> 0x00c6 }
            r1.release()     // Catch:{ RuntimeException -> 0x00c6 }
        L_0x00c6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.c0.run():void");
    }
}
