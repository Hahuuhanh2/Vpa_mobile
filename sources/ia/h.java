package ia;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/* compiled from: CommonUtils */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11305a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* compiled from: CommonUtils */
    public enum a {
        UNKNOWN;
        

        /* renamed from: b  reason: collision with root package name */
        public static final HashMap f11307b = null;

        /* access modifiers changed from: public */
        static {
            a aVar;
            a aVar2;
            a aVar3;
            a aVar4;
            HashMap hashMap = new HashMap(4);
            f11307b = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }
    }

    public static synchronized long a(Context context) {
        long j10;
        synchronized (h.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        }
        return j10;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int c() {
        boolean z10;
        boolean g2 = g();
        if (h()) {
            g2 |= true;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 ? g2 | true ? 1 : 0 : g2 ? 1 : 0;
    }

    public static String d(Context context) {
        int e10 = e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e10 == 0) {
            e10 = e(context, "com.crashlytics.android.build_id", "string");
        }
        if (e10 != 0) {
            return context.getResources().getString(e10);
        }
        return null;
    }

    public static int e(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i10);
                if ("android".equals(str3)) {
                    str3 = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                str3 = context.getPackageName();
            }
        } else {
            str3 = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, str3);
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10] & 255;
            int i11 = i10 * 2;
            char[] cArr2 = f11305a;
            cArr[i11] = cArr2[b10 >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean g() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (str.contains("goldfish") || str.contains("ranchu")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean h() {
        boolean g2 = g();
        String str = Build.TAGS;
        if ((!g2 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (g2 || !file.exists()) {
            return false;
        }
        return true;
    }

    public static String i(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
}
