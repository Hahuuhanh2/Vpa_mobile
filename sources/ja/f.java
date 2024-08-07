package ja;

import ia.h;
import java.io.File;
import java.nio.charset.Charset;

/* compiled from: QueueFileLogStore */
public final class f implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f11819d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f11820a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11821b = 65536;

    /* renamed from: c  reason: collision with root package name */
    public e f11822c;

    /* compiled from: QueueFileLogStore */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f11823a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11824b;

        public a(byte[] bArr, int i10) {
            this.f11823a = bArr;
            this.f11824b = i10;
        }
    }

    public f(File file) {
        this.f11820a = file;
    }

    public final void a() {
        h.b(this.f11822c);
        this.f11822c = null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r10 = this;
            java.io.File r0 = r10.f11820a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x0022
        L_0x000b:
            ja.e r0 = r10.f11822c
            if (r0 != 0) goto L_0x001e
            ja.e r0 = new ja.e     // Catch:{ IOException -> 0x0019 }
            java.io.File r3 = r10.f11820a     // Catch:{ IOException -> 0x0019 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0019 }
            r10.f11822c = r0     // Catch:{ IOException -> 0x0019 }
            goto L_0x001e
        L_0x0019:
            java.io.File r0 = r10.f11820a
            java.util.Objects.toString(r0)
        L_0x001e:
            ja.e r0 = r10.f11822c
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            r4 = r2
            goto L_0x0072
        L_0x0024:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r1] = r1
            int r0 = r0.z()
            byte[] r0 = new byte[r0]
            ja.e r4 = r10.f11822c     // Catch:{ IOException -> 0x006b }
            monitor-enter(r4)     // Catch:{ IOException -> 0x006b }
            ja.e$a r5 = r4.f11810d     // Catch:{ all -> 0x0068 }
            int r5 = r5.f11814a     // Catch:{ all -> 0x0068 }
            r6 = r1
        L_0x0037:
            int r7 = r4.f11809c     // Catch:{ all -> 0x0068 }
            if (r6 >= r7) goto L_0x0066
            ja.e$a r5 = r4.i(r5)     // Catch:{ all -> 0x0068 }
            ja.e$b r7 = new ja.e$b     // Catch:{ all -> 0x0068 }
            r7.<init>(r5)     // Catch:{ all -> 0x0068 }
            int r8 = r5.f11815b     // Catch:{ all -> 0x0068 }
            r9 = r3[r1]     // Catch:{ all -> 0x0061 }
            r7.read(r0, r9, r8)     // Catch:{ all -> 0x0061 }
            r9 = r3[r1]     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r8
            r3[r1] = r9     // Catch:{ all -> 0x0061 }
            r7.close()     // Catch:{ all -> 0x0068 }
            int r7 = r5.f11814a     // Catch:{ all -> 0x0068 }
            int r7 = r7 + 4
            int r5 = r5.f11815b     // Catch:{ all -> 0x0068 }
            int r7 = r7 + r5
            int r5 = r4.B(r7)     // Catch:{ all -> 0x0068 }
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0061:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x0068 }
            throw r5     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r4)     // Catch:{ IOException -> 0x006b }
            goto L_0x006b
        L_0x0068:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x006b }
            throw r5     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            ja.f$a r4 = new ja.f$a
            r3 = r3[r1]
            r4.<init>(r0, r3)
        L_0x0072:
            if (r4 != 0) goto L_0x0076
            r3 = r2
            goto L_0x007f
        L_0x0076:
            int r0 = r4.f11824b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f11823a
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L_0x007f:
            if (r3 == 0) goto L_0x0088
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r0 = f11819d
            r2.<init>(r3, r0)
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.f.b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r5, java.lang.String r7) {
        /*
            r4 = this;
            ja.e r0 = r4.f11822c
            if (r0 != 0) goto L_0x0013
            ja.e r0 = new ja.e     // Catch:{ IOException -> 0x000e }
            java.io.File r1 = r4.f11820a     // Catch:{ IOException -> 0x000e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x000e }
            r4.f11822c = r0     // Catch:{ IOException -> 0x000e }
            goto L_0x0013
        L_0x000e:
            java.io.File r0 = r4.f11820a
            java.util.Objects.toString(r0)
        L_0x0013:
            java.lang.String r0 = " "
            ja.e r1 = r4.f11822c
            if (r1 != 0) goto L_0x001b
            goto L_0x008f
        L_0x001b:
            if (r7 != 0) goto L_0x001f
            java.lang.String r7 = "null"
        L_0x001f:
            int r1 = r4.f11821b     // Catch:{ IOException -> 0x008f }
            int r1 = r1 / 4
            int r2 = r7.length()     // Catch:{ IOException -> 0x008f }
            if (r2 <= r1) goto L_0x0043
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008f }
            r2.<init>()     // Catch:{ IOException -> 0x008f }
            java.lang.String r3 = "..."
            r2.append(r3)     // Catch:{ IOException -> 0x008f }
            int r3 = r7.length()     // Catch:{ IOException -> 0x008f }
            int r3 = r3 - r1
            java.lang.String r7 = r7.substring(r3)     // Catch:{ IOException -> 0x008f }
            r2.append(r7)     // Catch:{ IOException -> 0x008f }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x008f }
        L_0x0043:
            java.lang.String r1 = "\r"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch:{ IOException -> 0x008f }
            java.lang.String r1 = "\n"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch:{ IOException -> 0x008f }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x008f }
            java.lang.String r1 = "%d %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x008f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x008f }
            r6 = 0
            r2[r6] = r5     // Catch:{ IOException -> 0x008f }
            r5 = 1
            r2[r5] = r7     // Catch:{ IOException -> 0x008f }
            java.lang.String r7 = java.lang.String.format(r0, r1, r2)     // Catch:{ IOException -> 0x008f }
            java.nio.charset.Charset r0 = f11819d     // Catch:{ IOException -> 0x008f }
            byte[] r7 = r7.getBytes(r0)     // Catch:{ IOException -> 0x008f }
            ja.e r0 = r4.f11822c     // Catch:{ IOException -> 0x008f }
            r0.d(r7)     // Catch:{ IOException -> 0x008f }
        L_0x006f:
            ja.e r7 = r4.f11822c     // Catch:{ IOException -> 0x008f }
            monitor-enter(r7)     // Catch:{ IOException -> 0x008f }
            int r0 = r7.f11809c     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0078
            r0 = r5
            goto L_0x0079
        L_0x0078:
            r0 = r6
        L_0x0079:
            monitor-exit(r7)     // Catch:{ IOException -> 0x008f }
            if (r0 != 0) goto L_0x008f
            ja.e r7 = r4.f11822c     // Catch:{ IOException -> 0x008f }
            int r7 = r7.z()     // Catch:{ IOException -> 0x008f }
            int r0 = r4.f11821b     // Catch:{ IOException -> 0x008f }
            if (r7 <= r0) goto L_0x008f
            ja.e r7 = r4.f11822c     // Catch:{ IOException -> 0x008f }
            r7.s()     // Catch:{ IOException -> 0x008f }
            goto L_0x006f
        L_0x008c:
            r5 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x008f }
            throw r5     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.f.c(long, java.lang.String):void");
    }
}
