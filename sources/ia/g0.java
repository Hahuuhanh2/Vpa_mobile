package ia;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import m9.d;

/* compiled from: DataCollectionArbiter */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final d f11299a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11300b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public TaskCompletionSource<Void> f11301c = new TaskCompletionSource<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f11302d = false;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f11303e;

    /* renamed from: f  reason: collision with root package name */
    public final TaskCompletionSource<Void> f11304f = new TaskCompletionSource<>();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g0(m9.d r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f11300b = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r6.f11301c = r0
            r0 = 0
            r6.f11302d = r0
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r6.f11304f = r1
            r7.a()
            android.content.Context r1 = r7.f13218a
            r6.f11299a = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003d
            r6.f11302d = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003e
        L_0x003d:
            r7 = r5
        L_0x003e:
            if (r7 != 0) goto L_0x007c
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x0069
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0069 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r1 == 0) goto L_0x0069
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x0069
            boolean r2 = r2.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x0069
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            boolean r7 = r1.getBoolean(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x006a
        L_0x0069:
            r7 = r5
        L_0x006a:
            if (r7 != 0) goto L_0x0070
            r6.f11302d = r0
            r7 = r5
            goto L_0x007c
        L_0x0070:
            r6.f11302d = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x007c:
            r6.f11303e = r7
            java.lang.Object r7 = r6.f11300b
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r6.f11301c     // Catch:{ all -> 0x008e }
            r0.trySetResult(r5)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r7)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.g0.<init>(m9.d):void");
    }

    public final synchronized boolean a() {
        boolean z10;
        String str;
        String str2;
        Boolean bool = this.f11303e;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            try {
                z10 = this.f11299a.j();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f11303e == null) {
            str2 = "global Firebase setting";
        } else if (this.f11302d) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str, str2});
        Log.isLoggable("FirebaseCrashlytics", 3);
        return z10;
    }
}
