package cb;

import android.content.SharedPreferences;

/* compiled from: IidStore */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f4681c = {"*", "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f4682a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4683b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r0.isEmpty() != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(m9.d r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.f13218a
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r3.f4682a = r0
            r4.a()
            m9.e r0 = r4.f13220c
            java.lang.String r0 = r0.f13235e
            if (r0 == 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            r4.a()
            m9.e r4 = r4.f13220c
            java.lang.String r0 = r4.f13232b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            goto L_0x004a
        L_0x0033:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x0040
        L_0x003e:
            r0 = r2
            goto L_0x004a
        L_0x0040:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            r3.f4683b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.b.<init>(m9.d):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|18|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r6 = this;
            android.content.SharedPreferences r0 = r6.f4682a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f4682a     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "|S||P|"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r3
        L_0x0010:
            r2 = 8
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch:{ IllegalArgumentException -> 0x002a, InvalidKeySpecException -> 0x0028, NoSuchAlgorithmException -> 0x0026 }
            java.lang.String r4 = "RSA"
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch:{ IllegalArgumentException -> 0x002a, InvalidKeySpecException -> 0x0028, NoSuchAlgorithmException -> 0x0026 }
            java.security.spec.X509EncodedKeySpec r5 = new java.security.spec.X509EncodedKeySpec     // Catch:{ IllegalArgumentException -> 0x002a, InvalidKeySpecException -> 0x0028, NoSuchAlgorithmException -> 0x0026 }
            r5.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x002a, InvalidKeySpecException -> 0x0028, NoSuchAlgorithmException -> 0x0026 }
            java.security.PublicKey r1 = r4.generatePublic(r5)     // Catch:{ IllegalArgumentException -> 0x002a, InvalidKeySpecException -> 0x0028, NoSuchAlgorithmException -> 0x0026 }
            goto L_0x002f
        L_0x0026:
            r1 = move-exception
            goto L_0x002b
        L_0x0028:
            r1 = move-exception
            goto L_0x002b
        L_0x002a:
            r1 = move-exception
        L_0x002b:
            r1.toString()     // Catch:{ all -> 0x0055 }
            r1 = r3
        L_0x002f:
            if (r1 != 0) goto L_0x0033
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r3
        L_0x0033:
            byte[] r1 = r1.getEncoded()     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
            byte[] r1 = r4.digest(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
            r4 = 0
            byte r5 = r1[r4]     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
            r5 = r5 & 15
            int r5 = r5 + 112
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
            r1[r4] = r5     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
            r5 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r4, r2, r5)     // Catch:{ NoSuchAlgorithmException -> 0x0053 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r3
        L_0x0055:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.b.a():java.lang.String");
    }
}
