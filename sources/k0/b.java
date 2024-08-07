package k0;

import f0.m0;
import z.d;

/* compiled from: DeviceQuirks */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11905a;

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    static {
        /*
            z.d r0 = new z.d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "HUAWEI"
            boolean r3 = r3.equalsIgnoreCase(r2)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r6 = "SNE-LX1"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x001f
            r3 = r5
            goto L_0x0020
        L_0x001f:
            r3 = r4
        L_0x0020:
            if (r3 != 0) goto L_0x0096
            java.lang.String r3 = "HONOR"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r6 = "STK-LX1"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0036
            r3 = r5
            goto L_0x0037
        L_0x0036:
            r3 = r4
        L_0x0037:
            if (r3 != 0) goto L_0x0096
            java.lang.String r3 = android.os.Build.FINGERPRINT
            java.lang.String r6 = "generic"
            boolean r7 = r3.startsWith(r6)
            if (r7 != 0) goto L_0x0094
            java.lang.String r7 = "unknown"
            boolean r3 = r3.startsWith(r7)
            if (r3 != 0) goto L_0x0094
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r7 = "google_sdk"
            boolean r8 = r3.contains(r7)
            if (r8 != 0) goto L_0x0094
            java.lang.String r8 = "Emulator"
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x0094
            java.lang.String r8 = "Cuttlefish"
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x0094
            java.lang.String r8 = "Android SDK built for x86"
            boolean r3 = r3.contains(r8)
            if (r3 != 0) goto L_0x0094
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r8 = "Genymotion"
            boolean r3 = r3.contains(r8)
            if (r3 != 0) goto L_0x0094
            boolean r3 = r2.startsWith(r6)
            if (r3 == 0) goto L_0x0085
            java.lang.String r3 = android.os.Build.DEVICE
            boolean r3 = r3.startsWith(r6)
            if (r3 != 0) goto L_0x0094
        L_0x0085:
            java.lang.String r3 = android.os.Build.PRODUCT
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0094
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r6 = "ranchu"
            r3.contains(r6)
        L_0x0094:
            r3 = r4
            goto L_0x0097
        L_0x0096:
            r3 = r5
        L_0x0097:
            if (r3 == 0) goto L_0x00a1
            k0.c r3 = new k0.c
            r3.<init>()
            r1.add(r3)
        L_0x00a1:
            k0.i r3 = new k0.i
            r3.<init>()
            r1.add(r3)
            java.util.HashSet r3 = k0.a.f11904a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r6 = r2.toUpperCase(r3)
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r8 = r7.toUpperCase(r3)
            java.util.HashSet r9 = k0.a.f11904a
            android.util.Pair r6 = android.util.Pair.create(r6, r8)
            boolean r6 = r9.contains(r6)
            if (r6 == 0) goto L_0x00cb
            k0.a r6 = new k0.a
            r6.<init>()
            r1.add(r6)
        L_0x00cb:
            java.util.HashSet r6 = k0.f.f11908a
            java.lang.String r8 = r7.toUpperCase(r3)
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto L_0x00df
            k0.f r6 = new k0.f
            r6.<init>()
            r1.add(r6)
        L_0x00df:
            java.util.HashSet r6 = k0.e.f11907a
            java.lang.String r7 = r7.toUpperCase(r3)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x00f3
            k0.e r6 = new k0.e
            r6.<init>()
            r1.add(r6)
        L_0x00f3:
            java.util.HashSet r6 = k0.d.f11906a
            java.lang.String r6 = "Samsung"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x010c
            java.util.HashSet r2 = k0.d.f11906a
            java.lang.String r6 = android.os.Build.DEVICE
            java.lang.String r3 = r6.toUpperCase(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x010c
            r4 = r5
        L_0x010c:
            if (r4 == 0) goto L_0x0116
            k0.d r2 = new k0.d
            r2.<init>()
            r1.add(r2)
        L_0x0116:
            r0.<init>((java.util.ArrayList) r1)
            f11905a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.<clinit>():void");
    }

    public static <T extends m0> T a(Class<T> cls) {
        return f11905a.f(cls);
    }
}
