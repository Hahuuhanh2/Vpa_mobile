package x3;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import o3.o;
import sk.j;
import v.v;

/* compiled from: WorkTypeConverters.kt */
public final class y {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        p3.l0.u(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        p3.l0.u(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet a(byte[] r9) {
        /*
            java.lang.String r0 = "bytes"
            sk.j.f(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            if (r1 != 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0050 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0050 }
            int r4 = r3.readInt()     // Catch:{ all -> 0x0047 }
        L_0x0023:
            if (r2 >= r4) goto L_0x0041
            java.lang.String r5 = r3.readUTF()     // Catch:{ all -> 0x0047 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0047 }
            boolean r6 = r3.readBoolean()     // Catch:{ all -> 0x0047 }
            o3.c$a r7 = new o3.c$a     // Catch:{ all -> 0x0047 }
            java.lang.String r8 = "uri"
            sk.j.e(r5, r8)     // Catch:{ all -> 0x0047 }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x0047 }
            r0.add(r7)     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0041:
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x0047 }
            p3.l0.u(r3, r9)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0047:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            p3.l0.u(r3, r2)     // Catch:{ IOException -> 0x0050 }
            throw r4     // Catch:{ IOException -> 0x0050 }
        L_0x004e:
            r9 = move-exception
            goto L_0x005a
        L_0x0050:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x004e }
        L_0x0054:
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x004e }
            p3.l0.u(r1, r9)
            return r0
        L_0x005a:
            throw r9     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            p3.l0.u(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.y.a(byte[]):java.util.LinkedHashSet");
    }

    public static final int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(v.d("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static final int c(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(v.d("Could not convert ", i10, " to NetworkType"));
    }

    public static final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(v.d("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static final o e(int i10) {
        if (i10 == 0) {
            return o.ENQUEUED;
        }
        if (i10 == 1) {
            return o.RUNNING;
        }
        if (i10 == 2) {
            return o.SUCCEEDED;
        }
        if (i10 == 3) {
            return o.FAILED;
        }
        if (i10 == 4) {
            return o.BLOCKED;
        }
        if (i10 == 5) {
            return o.CANCELLED;
        }
        throw new IllegalArgumentException(v.d("Could not convert ", i10, " to State"));
    }

    public static final int f(o oVar) {
        j.f(oVar, "state");
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal == 4) {
            return 4;
        }
        if (ordinal == 5) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }
}
