package k1;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import f0.b0;
import i1.v;
import java.io.File;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import m1.e;
import p3.l0;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: ContextCompat */
public class a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    /* compiled from: ContextCompat */
    public static class C0131a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat */
    public static class b {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }
    }

    /* compiled from: ContextCompat */
    public static class c {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat */
    public static class d {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat */
    public static class e {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat */
    public static class f {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat */
    public static class g {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            if ((i10 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat */
    public static class h {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat */
    public static class i {
        public static String a(Context context) {
            return context.getAttributionTag();
        }

        public static Display b(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* compiled from: ContextCompat */
    public static class j {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        } else if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (new v(context).a()) {
                return 0;
            }
            return -1;
        }
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f.a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File createFilesDir(java.io.File r2) {
        /*
            java.lang.Object r0 = sSync
            monitor-enter(r0)
            boolean r1 = r2.exists()     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0014
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0011:
            r2.getPath()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.a.createFilesDir(java.io.File):java.io.File");
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return i.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return d.a(context);
    }

    public static int getColor(Context context, int i10) {
        return e.a(context, i10);
    }

    public static ColorStateList getColorStateList(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        e.d dVar = new e.d(resources, theme);
        synchronized (m1.e.f13064c) {
            SparseArray sparseArray = m1.e.f13063b.get(dVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (cVar = (e.c) sparseArray.get(i10)) == null)) {
                if (!cVar.f13066b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f13067c == 0) && (theme == null || cVar.f13067c != theme.hashCode()))) {
                    sparseArray.remove(i10);
                } else {
                    colorStateList2 = cVar.f13065a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = m1.e.f13062a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z10 = true;
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            z10 = false;
        }
        if (!z10) {
            try {
                colorStateList = m1.a.a(resources, resources.getXml(i10), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return e.b.b(resources, i10, theme);
        }
        synchronized (m1.e.f13064c) {
            WeakHashMap<e.d, SparseArray<e.c>> weakHashMap = m1.e.f13063b;
            SparseArray sparseArray2 = weakHashMap.get(dVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(dVar, sparseArray2);
            }
            sparseArray2.append(i10, new e.c(colorStateList, dVar.f13068a.getConfiguration(), theme));
        }
        return colorStateList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|38|(1:40)(1:41)|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r2 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r1.isEmpty() == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0077, code lost:
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context getContextForLanguage(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0020
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L_0x001d
            android.os.LocaleList r0 = i1.j.a(r0)
            s1.j r1 = new s1.j
            s1.m r2 = new s1.m
            r2.<init>(r0)
            r1.<init>(r2)
            goto L_0x0083
        L_0x001d:
            s1.j r1 = s1.j.f14593b
            goto L_0x0083
        L_0x0020:
            java.lang.Object r0 = i1.f.f10945a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x007e }
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
            int r4 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
        L_0x0038:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
            r6 = 1
            if (r5 == r6) goto L_0x0061
            r6 = 3
            if (r5 != r6) goto L_0x0048
            int r7 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
            if (r7 <= r4) goto L_0x0061
        L_0x0048:
            if (r5 == r6) goto L_0x0038
            r6 = 4
            if (r5 != r6) goto L_0x004e
            goto L_0x0038
        L_0x004e:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
            if (r5 == 0) goto L_0x0038
            r4 = 0
            java.lang.String r5 = "application_locales"
            java.lang.String r1 = r3.getAttributeValue(r4, r5)     // Catch:{ IOException | XmlPullParserException -> 0x006b, all -> 0x0064 }
        L_0x0061:
            if (r2 == 0) goto L_0x0070
            goto L_0x006d
        L_0x0064:
            r8 = move-exception
            if (r2 == 0) goto L_0x006a
            r2.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x006b:
            if (r2 == 0) goto L_0x0070
        L_0x006d:
            r2.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r2 != 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch:{ all -> 0x00ac }
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            goto L_0x007f
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
        L_0x007f:
            s1.j r1 = s1.j.b(r1)
        L_0x0083:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r0 > r2) goto L_0x00ab
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x00ab
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.res.Resources r3 = r8.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r2.<init>(r3)
            r3 = 24
            if (r0 < r3) goto L_0x00a4
            s1.f.b.b(r2, r1)
            goto L_0x00a7
        L_0x00a4:
            s1.f.a.a(r2, r1)
        L_0x00a7:
            android.content.Context r8 = k1.a.b.a(r8, r2)
        L_0x00ab:
            return r8
        L_0x00ac:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.a.getContextForLanguage(android.content.Context):android.content.Context");
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Display getDisplayOrDefault(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return i.b(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i10) {
        return d.b(context, i10);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return c.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return c.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h.a(context);
        }
        return new s1.h(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return d.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return c.c(context);
    }

    public static String getString(Context context, int i10) {
        return getContextForLanguage(context).getString(i10);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return e.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return e.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f.c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (l0.o(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(b0.s("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return registerReceiver(context, broadcastReceiver, intentFilter, (String) null, (Handler) null, i10);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, (Bundle) null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        C0131a.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            g.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 == 0 || (i10 & 4) == 0) {
            if (i11 != 0) {
                i10 |= 2;
            }
            int i12 = i10;
            int i13 = i12 & 2;
            if (i13 == 0 && (i12 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else if (i13 == 0 || (i12 & 4) == 0) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 33) {
                    return j.a(context, broadcastReceiver, intentFilter, str, handler, i12);
                }
                if (i14 >= 26) {
                    return g.a(context, broadcastReceiver, intentFilter, str, handler, i12);
                }
                if ((i12 & 4) == 0 || str != null) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
                }
                return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
            } else {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            }
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        C0131a.a(context, intentArr, bundle);
        return true;
    }
}
