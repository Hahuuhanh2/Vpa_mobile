package u6;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class d {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15292a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f15293b = new AtomicBoolean();

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ Exception -> 0x0037 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0037 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1
            java.lang.String r3 = "com.google.android.gms"
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r0.next()
            android.content.pm.PackageInstaller$SessionInfo r1 = (android.content.pm.PackageInstaller.SessionInfo) r1
            java.lang.String r1 = r1.getAppPackageName()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0010
            return r2
        L_0x002a:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r3, r0)     // Catch:{  }
            boolean r4 = r4.enabled     // Catch:{  }
            return r4
        L_0x0037:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.d.a(android.content.Context):boolean");
    }
}
