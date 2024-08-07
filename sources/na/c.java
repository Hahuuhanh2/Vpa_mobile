package na;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.a;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final File f13551a;

    /* renamed from: b  reason: collision with root package name */
    public final File f13552b;

    /* renamed from: c  reason: collision with root package name */
    public final File f13553c;

    /* renamed from: d  reason: collision with root package name */
    public final File f13554d;

    /* renamed from: e  reason: collision with root package name */
    public final File f13555e;

    /* renamed from: f  reason: collision with root package name */
    public final File f13556f;

    public c(Context context) {
        boolean z10;
        String str;
        File filesDir = context.getFilesDir();
        this.f13551a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder q10 = a.q(".com.google.firebase.crashlytics.files.v2");
            q10.append(File.pathSeparator);
            q10.append(Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_"));
            str = q10.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f13552b = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f13553c = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f13554d = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f13555e = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f13556f = file5;
    }

    public static void a(File file) {
        if (file.exists() && d(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void c(java.io.File r3) {
        /*
            java.lang.Class<na.c> r0 = na.c.class
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x001d
            boolean r1 = r3.isDirectory()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return
        L_0x0011:
            r3.toString()     // Catch:{ all -> 0x0028 }
            r1 = 3
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r2, r1)     // Catch:{ all -> 0x0028 }
            r3.delete()     // Catch:{ all -> 0x0028 }
        L_0x001d:
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            r3.toString()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: na.c.c(java.io.File):void");
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File d10 : listFiles) {
                d(d10);
            }
        }
        return file.delete();
    }

    public static <T> List<T> e(T[] tArr) {
        if (tArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    public final File b(String str, String str2) {
        File file = new File(this.f13553c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
