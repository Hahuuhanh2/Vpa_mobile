package h7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.common.proguard.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f10610a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f10611b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f10612c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f10613d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f10614e = new d();

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f10615f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            char[] cArr = f10615f;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f10610a == null) {
            f10610a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f10610a.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r0 != false) goto L_0x0013;
     */
    @android.annotation.TargetApi(26)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(android.content.Context r4) {
        /*
            boolean r0 = b(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x0040
        L_0x0013:
            java.lang.Boolean r0 = f10611b
            if (r0 != 0) goto L_0x0027
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r4 = r4.hasSystemFeature(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            f10611b = r4
        L_0x0027:
            java.lang.Boolean r4 = f10611b
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0041
            boolean r4 = h7.g.a()
            if (r4 == 0) goto L_0x0040
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r4 < r0) goto L_0x003d
            r4 = r2
            goto L_0x003e
        L_0x003d:
            r4 = r1
        L_0x003e:
            if (r4 == 0) goto L_0x0041
        L_0x0040:
            return r2
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d.c(android.content.Context):boolean");
    }
}
