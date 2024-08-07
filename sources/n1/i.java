package n1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m1.c;

/* compiled from: TypefaceCompatApi21Impl */
public class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f13436a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<?> f13437b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f13438c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f13439d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f13440e = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        h();
        try {
            return ((Boolean) f13438c.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f13440e) {
            f13440e = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            f13437b = constructor;
            f13436a = cls;
            f13438c = method;
            f13439d = method2;
        }
    }

    public Typeface a(Context context, c.C0159c cVar, Resources resources, int i10) {
        h();
        try {
            Object newInstance = f13437b.newInstance(new Object[0]);
            c.d[] dVarArr = cVar.f13049a;
            int length = dVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                c.d dVar = dVarArr[i11];
                File d10 = p.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!p.b(d10, resources, dVar.f13055f)) {
                        d10.delete();
                        return null;
                    } else if (!g(newInstance, d10.getPath(), dVar.f13051b, dVar.f13052c)) {
                        return null;
                    } else {
                        d10.delete();
                        i11++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f13436a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f13439d.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r4, t1.m[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            t1.m r5 = r3.f(r6, r5)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f14786a     // Catch:{ IOException -> 0x0084 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r1)     // Catch:{ IOException -> 0x0084 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0084 }
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x004b }
            r6.<init>()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r0 = "/proc/self/fd/"
            r6.append(r0)     // Catch:{ ErrnoException -> 0x004b }
            int r0 = r5.getFd()     // Catch:{ ErrnoException -> 0x004b }
            r6.append(r0)     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = r6.toString()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x004b }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x004b }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x004b }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x004b }
            if (r0 == 0) goto L_0x004b
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x004b }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x004b }
            goto L_0x004c
        L_0x0049:
            r4 = move-exception
            goto L_0x007b
        L_0x004b:
            r0 = r1
        L_0x004c:
            if (r0 == 0) goto L_0x005d
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x005d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r6.<init>(r0)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r4 = r3.c(r4, r6)     // Catch:{ all -> 0x0071 }
            r6.close()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x0071:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0049 }
        L_0x007a:
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x007b:
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0084 }
        L_0x0083:
            throw r4     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i.b(android.content.Context, t1.m[], int):android.graphics.Typeface");
    }
}
