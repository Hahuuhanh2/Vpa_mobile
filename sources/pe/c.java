package pe;

import android.os.Build;
import android.text.TextUtils;
import j7.a;
import java.util.regex.Pattern;

/* compiled from: RomUtils */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f14171a = {"samsung"};

    /* renamed from: b  reason: collision with root package name */
    public static Integer f14172b;

    public static int a() {
        String str = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || !str.contains("Flyme")) {
            return 0;
        }
        String substring = str.replaceAll("Flyme", "").replaceAll("OS", "").replaceAll(" ", "").substring(0, 1);
        if (Pattern.compile("^[-\\+]?[\\d]+$").matcher(substring).matches()) {
            return a.A0(substring);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[SYNTHETIC, Splitter:B:14:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003b, all -> 0x002d }
            java.lang.String r2 = "getprop ro.miui.ui.version.code"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ IOException -> 0x003b, all -> 0x002d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003b, all -> 0x002d }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003b, all -> 0x002d }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x003b, all -> 0x002d }
            r3.<init>(r1)     // Catch:{ IOException -> 0x003b, all -> 0x002d }
            r1 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r1)     // Catch:{ IOException -> 0x003b, all -> 0x002d }
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException -> 0x003c, all -> 0x002b }
            r2.close()     // Catch:{ IOException -> 0x003c, all -> 0x002b }
            r2.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002a:
            return r1
        L_0x002b:
            r0 = move-exception
            goto L_0x0030
        L_0x002d:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r1 = move-exception
            r1.printStackTrace()
        L_0x003a:
            throw r0
        L_0x003b:
            r2 = r0
        L_0x003c:
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.c.b():java.lang.String");
    }
}
