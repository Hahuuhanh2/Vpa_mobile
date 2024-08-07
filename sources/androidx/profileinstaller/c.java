package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: ProfileInstaller */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2922a = new a();

    /* compiled from: ProfileInstaller */
    public class a implements C0027c {
        public final void a() {
        }

        public final void b(int i10, Object obj) {
        }
    }

    /* compiled from: ProfileInstaller */
    public class b implements C0027c {
        public final void a() {
        }

        public final void b(int i10, Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Throwable th2 = (Throwable) obj;
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c  reason: collision with other inner class name */
    /* compiled from: ProfileInstaller */
    public interface C0027c {
        void a();

        void b(int i10, Object obj);
    }

    static {
        new b();
    }

    public static void a(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01b4, code lost:
        if (r7 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01c5 A[SYNTHETIC, Splitter:B:137:0x01c5] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e5 A[SYNTHETIC, Splitter:B:56:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r17, java.util.concurrent.Executor r18, androidx.profileinstaller.c.C0027c r19, boolean r20) {
        /*
            r1 = r17
            r5 = r19
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r8 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r17.getPackageManager()
            r9 = 0
            android.content.pm.PackageInfo r11 = r0.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x028e }
            java.io.File r12 = r17.getFilesDir()
            r13 = 0
            r14 = 1
            if (r20 != 0) goto L_0x0077
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r12, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x003e
            goto L_0x006b
        L_0x003e:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006b }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006b }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006b }
            r3.<init>(r4)     // Catch:{ IOException -> 0x006b }
            long r15 = r3.readLong()     // Catch:{ all -> 0x005f }
            r3.close()     // Catch:{ IOException -> 0x006b }
            long r3 = r11.lastUpdateTime
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            r0 = r14
            goto L_0x0058
        L_0x0057:
            r0 = r9
        L_0x0058:
            if (r0 == 0) goto L_0x006c
            r3 = 2
            r5.b(r3, r13)
            goto L_0x006c
        L_0x005f:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ IOException -> 0x006b }
        L_0x006a:
            throw r4     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            r0 = r9
        L_0x006c:
            if (r0 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            r17.getPackageName()
            androidx.profileinstaller.d.c(r1, r9)
            goto L_0x027c
        L_0x0077:
            r17.getPackageName()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r15 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r15.<init>(r3, r2)
            androidx.profileinstaller.b r7 = new androidx.profileinstaller.b
            java.lang.String r4 = "dexopt/baseline.prof"
            r2 = r7
            r3 = r8
            r9 = r4
            r4 = r18
            r5 = r19
            r10 = r7
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r2 = r10.f2916d
            r3 = 4
            if (r2 != 0) goto L_0x00a8
            r2 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.b(r2, r0)
            goto L_0x00b1
        L_0x00a8:
            boolean r0 = r15.canWrite()
            if (r0 != 0) goto L_0x00b3
            r10.b(r3, r13)
        L_0x00b1:
            r0 = 0
            goto L_0x00b6
        L_0x00b3:
            r10.f2919g = r14
            r0 = r14
        L_0x00b6:
            if (r0 != 0) goto L_0x00bb
            r6 = 0
            goto L_0x0272
        L_0x00bb:
            boolean r0 = r10.f2919g
            java.lang.String r2 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0288
            byte[] r0 = r10.f2916d
            r4 = 8
            r5 = 6
            if (r0 != 0) goto L_0x00ca
            goto L_0x01b7
        L_0x00ca:
            java.io.FileInputStream r0 = r10.a(r8, r9)     // Catch:{ FileNotFoundException -> 0x00d9, IOException -> 0x00d0 }
            r6 = r0
            goto L_0x00e1
        L_0x00d0:
            r0 = move-exception
            r6 = r0
            androidx.profileinstaller.c$c r0 = r10.f2915c
            r7 = 7
            r0.b(r7, r6)
            goto L_0x00e0
        L_0x00d9:
            r0 = move-exception
            r6 = r0
            androidx.profileinstaller.c$c r0 = r10.f2915c
            r0.b(r5, r6)
        L_0x00e0:
            r6 = r13
        L_0x00e1:
            java.lang.String r7 = "Invalid magic"
            if (r6 == 0) goto L_0x013d
            byte[] r0 = w2.d.f16440a     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            byte[] r8 = p3.l0.s0(r6, r3)     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            boolean r0 = java.util.Arrays.equals(r0, r8)     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            if (r0 == 0) goto L_0x010a
            byte[] r0 = p3.l0.s0(r6, r3)     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            java.lang.String r8 = r10.f2918f     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            w2.a[] r8 = w2.d.h(r6, r0, r8)     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            r6.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x012d
        L_0x00ff:
            r0 = move-exception
            r6 = r0
            androidx.profileinstaller.c$c r0 = r10.f2915c
            r9 = 7
            r0.b(r9, r6)
            goto L_0x012d
        L_0x0108:
            r0 = move-exception
            goto L_0x0113
        L_0x010a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
            throw r0     // Catch:{ IOException -> 0x011a, IllegalStateException -> 0x0108 }
        L_0x0110:
            r0 = move-exception
            r1 = r0
            goto L_0x0130
        L_0x0113:
            androidx.profileinstaller.c$c r8 = r10.f2915c     // Catch:{ all -> 0x0110 }
            r8.b(r4, r0)     // Catch:{ all -> 0x0110 }
            r9 = 7
            goto L_0x0121
        L_0x011a:
            r0 = move-exception
            androidx.profileinstaller.c$c r8 = r10.f2915c     // Catch:{ all -> 0x0110 }
            r9 = 7
            r8.b(r9, r0)     // Catch:{ all -> 0x0110 }
        L_0x0121:
            r6.close()     // Catch:{ IOException -> 0x0125 }
            goto L_0x012c
        L_0x0125:
            r0 = move-exception
            r6 = r0
            androidx.profileinstaller.c$c r0 = r10.f2915c
            r0.b(r9, r6)
        L_0x012c:
            r8 = r13
        L_0x012d:
            r10.f2920h = r8
            goto L_0x013d
        L_0x0130:
            r6.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x013c
        L_0x0134:
            r0 = move-exception
            r2 = r0
            androidx.profileinstaller.c$c r0 = r10.f2915c
            r3 = 7
            r0.b(r3, r2)
        L_0x013c:
            throw r1
        L_0x013d:
            w2.a[] r0 = r10.f2920h
            if (r0 == 0) goto L_0x01b7
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r6 < r8) goto L_0x0158
            r9 = 33
            if (r6 <= r9) goto L_0x014c
            goto L_0x0158
        L_0x014c:
            if (r6 == r8) goto L_0x0156
            r8 = 25
            if (r6 == r8) goto L_0x0156
            switch(r6) {
                case 31: goto L_0x0156;
                case 32: goto L_0x0156;
                case 33: goto L_0x0156;
                default: goto L_0x0155;
            }
        L_0x0155:
            goto L_0x0158
        L_0x0156:
            r6 = r14
            goto L_0x0159
        L_0x0158:
            r6 = 0
        L_0x0159:
            if (r6 == 0) goto L_0x01b7
            byte[] r6 = r10.f2916d
            android.content.res.AssetManager r8 = r10.f2913a     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
            java.lang.String r9 = "dexopt/baseline.profm"
            java.io.FileInputStream r8 = r10.a(r8, r9)     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
            if (r8 == 0) goto L_0x0194
            byte[] r9 = w2.d.f16441b     // Catch:{ all -> 0x0188 }
            byte[] r15 = p3.l0.s0(r8, r3)     // Catch:{ all -> 0x0188 }
            boolean r9 = java.util.Arrays.equals(r9, r15)     // Catch:{ all -> 0x0188 }
            if (r9 == 0) goto L_0x0182
            byte[] r3 = p3.l0.s0(r8, r3)     // Catch:{ all -> 0x0188 }
            w2.a[] r0 = w2.d.e(r8, r3, r6, r0)     // Catch:{ all -> 0x0188 }
            r10.f2920h = r0     // Catch:{ all -> 0x0188 }
            r8.close()     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
            r7 = r10
            goto L_0x01b4
        L_0x0182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0188 }
            r0.<init>(r7)     // Catch:{ all -> 0x0188 }
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            r3 = r0
            r8.close()     // Catch:{ all -> 0x018e }
            goto L_0x0193
        L_0x018e:
            r0 = move-exception
            r6 = r0
            r3.addSuppressed(r6)     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
        L_0x0193:
            throw r3     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
        L_0x0194:
            if (r8 == 0) goto L_0x01b3
            r8.close()     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
            goto L_0x01b3
        L_0x019a:
            r0 = move-exception
            r10.f2920h = r13
            androidx.profileinstaller.c$c r3 = r10.f2915c
            r3.b(r4, r0)
            goto L_0x01b3
        L_0x01a3:
            r0 = move-exception
            androidx.profileinstaller.c$c r3 = r10.f2915c
            r6 = 7
            r3.b(r6, r0)
            goto L_0x01b3
        L_0x01ab:
            r0 = move-exception
            androidx.profileinstaller.c$c r3 = r10.f2915c
            r6 = 9
            r3.b(r6, r0)
        L_0x01b3:
            r7 = r13
        L_0x01b4:
            if (r7 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r7 = r10
        L_0x01b8:
            w2.a[] r0 = r7.f2920h
            byte[] r3 = r7.f2916d
            if (r0 == 0) goto L_0x0211
            if (r3 != 0) goto L_0x01c1
            goto L_0x0211
        L_0x01c1:
            boolean r6 = r7.f2919g
            if (r6 == 0) goto L_0x020b
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0201, IllegalStateException -> 0x01fa }
            r6.<init>()     // Catch:{ IOException -> 0x0201, IllegalStateException -> 0x01fa }
            byte[] r8 = w2.d.f16440a     // Catch:{ all -> 0x01ee }
            r6.write(r8)     // Catch:{ all -> 0x01ee }
            r6.write(r3)     // Catch:{ all -> 0x01ee }
            boolean r0 = w2.d.j(r6, r3, r0)     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x01e4
            androidx.profileinstaller.c$c r0 = r7.f2915c     // Catch:{ all -> 0x01ee }
            r3 = 5
            r0.b(r3, r13)     // Catch:{ all -> 0x01ee }
            r7.f2920h = r13     // Catch:{ all -> 0x01ee }
            r6.close()     // Catch:{ IOException -> 0x0201, IllegalStateException -> 0x01fa }
            goto L_0x0211
        L_0x01e4:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x01ee }
            r7.f2921i = r0     // Catch:{ all -> 0x01ee }
            r6.close()     // Catch:{ IOException -> 0x0201, IllegalStateException -> 0x01fa }
            goto L_0x0208
        L_0x01ee:
            r0 = move-exception
            r3 = r0
            r6.close()     // Catch:{ all -> 0x01f4 }
            goto L_0x01f9
        L_0x01f4:
            r0 = move-exception
            r6 = r0
            r3.addSuppressed(r6)     // Catch:{ IOException -> 0x0201, IllegalStateException -> 0x01fa }
        L_0x01f9:
            throw r3     // Catch:{ IOException -> 0x0201, IllegalStateException -> 0x01fa }
        L_0x01fa:
            r0 = move-exception
            androidx.profileinstaller.c$c r3 = r7.f2915c
            r3.b(r4, r0)
            goto L_0x0208
        L_0x0201:
            r0 = move-exception
            androidx.profileinstaller.c$c r3 = r7.f2915c
            r4 = 7
            r3.b(r4, r0)
        L_0x0208:
            r7.f2920h = r13
            goto L_0x0211
        L_0x020b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0211:
            byte[] r0 = r7.f2921i
            if (r0 != 0) goto L_0x0216
            goto L_0x026c
        L_0x0216:
            boolean r3 = r7.f2919g
            if (r3 == 0) goto L_0x0282
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0264, IOException -> 0x025c }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0264, IOException -> 0x025c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0250 }
            java.io.File r0 = r7.f2917e     // Catch:{ all -> 0x0250 }
            r3.<init>(r0)     // Catch:{ all -> 0x0250 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0244 }
        L_0x022a:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x0244 }
            if (r4 <= 0) goto L_0x0235
            r6 = 0
            r3.write(r0, r6, r4)     // Catch:{ all -> 0x0244 }
            goto L_0x022a
        L_0x0235:
            r7.b(r14, r13)     // Catch:{ all -> 0x0244 }
            r3.close()     // Catch:{ all -> 0x0250 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0264, IOException -> 0x025c }
            r7.f2921i = r13
            r7.f2920h = r13
            r6 = r14
            goto L_0x026d
        L_0x0244:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x024a }
            goto L_0x024f
        L_0x024a:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ all -> 0x0250 }
        L_0x024f:
            throw r4     // Catch:{ all -> 0x0250 }
        L_0x0250:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch:{ all -> 0x0256 }
            goto L_0x025b
        L_0x0256:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0264, IOException -> 0x025c }
        L_0x025b:
            throw r3     // Catch:{ FileNotFoundException -> 0x0264, IOException -> 0x025c }
        L_0x025c:
            r0 = move-exception
            r2 = 7
            r7.b(r2, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0268
        L_0x0262:
            r0 = move-exception
            goto L_0x027d
        L_0x0264:
            r0 = move-exception
            r7.b(r5, r0)     // Catch:{ all -> 0x0262 }
        L_0x0268:
            r7.f2921i = r13
            r7.f2920h = r13
        L_0x026c:
            r6 = 0
        L_0x026d:
            if (r6 == 0) goto L_0x0272
            a(r11, r12)
        L_0x0272:
            if (r6 == 0) goto L_0x0278
            if (r20 == 0) goto L_0x0278
            r9 = r14
            goto L_0x0279
        L_0x0278:
            r9 = 0
        L_0x0279:
            androidx.profileinstaller.d.c(r1, r9)
        L_0x027c:
            return
        L_0x027d:
            r7.f2921i = r13
            r7.f2920h = r13
            throw r0
        L_0x0282:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0288:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x028e:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r5.b(r3, r2)
            r2 = 0
            androidx.profileinstaller.d.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.c$c, boolean):void");
    }
}
