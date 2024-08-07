package ia;

import ab.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import lc.b;

/* compiled from: IdManager */
public final class k0 implements l0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f11324g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f11325h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final b f11326a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f11327b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11328c;

    /* renamed from: d  reason: collision with root package name */
    public final c f11329d;

    /* renamed from: e  reason: collision with root package name */
    public final g0 f11330e;

    /* renamed from: f  reason: collision with root package name */
    public c f11331f;

    public k0(Context context, String str, c cVar, g0 g0Var) {
        if (str != null) {
            this.f11327b = context;
            this.f11328c = str;
            this.f11329d = cVar;
            this.f11330e = g0Var;
            this.f11326a = new b(6, 0);
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String str2;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            str2 = null;
        } else {
            str2 = f11324g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", str2).putString("firebase.installation.id", str).apply();
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c A[Catch:{ all -> 0x0016 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized ia.l0.a b() {
        /*
            r7 = this;
            monitor-enter(r7)
            ia.c r0 = r7.f11331f     // Catch:{ all -> 0x0016 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.f11278b     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0014
            ia.g0 r0 = r7.f11330e     // Catch:{ all -> 0x0016 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            r0 = r2
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            goto L_0x00e2
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 != 0) goto L_0x0020
            ia.c r0 = r7.f11331f     // Catch:{ all -> 0x0016 }
            monitor-exit(r7)
            return r0
        L_0x0020:
            java.lang.String r0 = "FirebaseCrashlytics"
            r3 = 2
            android.util.Log.isLoggable(r0, r3)     // Catch:{ all -> 0x0016 }
            android.content.Context r0 = r7.f11327b     // Catch:{ all -> 0x0016 }
            java.lang.String r4 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r2)     // Catch:{ all -> 0x0016 }
            java.lang.String r4 = "firebase.installation.id"
            r5 = 0
            java.lang.String r4 = r0.getString(r4, r5)     // Catch:{ all -> 0x0016 }
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r6, r3)     // Catch:{ all -> 0x0016 }
            ia.g0 r6 = r7.f11330e     // Catch:{ all -> 0x0016 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x0016 }
            if (r6 == 0) goto L_0x0094
            ab.c r1 = r7.f11329d     // Catch:{ all -> 0x0016 }
            com.google.android.gms.tasks.Task r1 = r1.getId()     // Catch:{ all -> 0x0016 }
            java.lang.Object r1 = ia.o0.a(r1)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x004f:
            r1 = r5
        L_0x0050:
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0074
            if (r4 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = "SYN_"
            r1.append(r2)     // Catch:{ all -> 0x0016 }
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            r1.append(r2)     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0016 }
            goto L_0x0074
        L_0x0073:
            r1 = r4
        L_0x0074:
            boolean r2 = r1.equals(r4)     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0088
            java.lang.String r2 = "crashlytics.installation.id"
            java.lang.String r0 = r0.getString(r2, r5)     // Catch:{ all -> 0x0016 }
            ia.c r2 = new ia.c     // Catch:{ all -> 0x0016 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0016 }
            r7.f11331f = r2     // Catch:{ all -> 0x0016 }
            goto L_0x00d4
        L_0x0088:
            java.lang.String r0 = r7.a(r1, r0)     // Catch:{ all -> 0x0016 }
            ia.c r2 = new ia.c     // Catch:{ all -> 0x0016 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0016 }
            r7.f11331f = r2     // Catch:{ all -> 0x0016 }
            goto L_0x00d4
        L_0x0094:
            if (r4 == 0) goto L_0x009f
            java.lang.String r6 = "SYN_"
            boolean r4 = r4.startsWith(r6)     // Catch:{ all -> 0x0016 }
            if (r4 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r1 = r2
        L_0x00a0:
            if (r1 == 0) goto L_0x00b0
            java.lang.String r1 = "crashlytics.installation.id"
            java.lang.String r0 = r0.getString(r1, r5)     // Catch:{ all -> 0x0016 }
            ia.c r1 = new ia.c     // Catch:{ all -> 0x0016 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x0016 }
            r7.f11331f = r1     // Catch:{ all -> 0x0016 }
            goto L_0x00d4
        L_0x00b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = "SYN_"
            r1.append(r2)     // Catch:{ all -> 0x0016 }
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            r1.append(r2)     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0016 }
            java.lang.String r0 = r7.a(r1, r0)     // Catch:{ all -> 0x0016 }
            ia.c r1 = new ia.c     // Catch:{ all -> 0x0016 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x0016 }
            r7.f11331f = r1     // Catch:{ all -> 0x0016 }
        L_0x00d4:
            ia.c r0 = r7.f11331f     // Catch:{ all -> 0x0016 }
            java.util.Objects.toString(r0)     // Catch:{ all -> 0x0016 }
            java.lang.String r0 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r0, r3)     // Catch:{ all -> 0x0016 }
            ia.c r0 = r7.f11331f     // Catch:{ all -> 0x0016 }
            monitor-exit(r7)
            return r0
        L_0x00e2:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.k0.b():ia.l0$a");
    }

    public final String c() {
        String str;
        b bVar = this.f11326a;
        Context context = this.f11327b;
        synchronized (bVar) {
            if (((String) bVar.f12907b) == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                bVar.f12907b = installerPackageName;
            }
            if ("".equals((String) bVar.f12907b)) {
                str = null;
            } else {
                str = (String) bVar.f12907b;
            }
        }
        return str;
    }
}
