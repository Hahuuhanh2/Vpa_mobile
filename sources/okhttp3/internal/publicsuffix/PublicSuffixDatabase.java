package okhttp3.internal.publicsuffix;

import fk.p;
import j7.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;
import sk.j;
import yk.l;

/* compiled from: PublicSuffixDatabase.kt */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f22593e = new Companion(0);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f22594f = {42};

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f22595g = a.c0("*");

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f22596h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f22597a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f22598b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f22599c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f22600d;

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static final String a(Companion companion, byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            byte b10;
            int i12;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            companion.getClass();
            int length = bArr3.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr3[i14] != 10) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i11 = i15 + i16;
                    if (bArr3[i11] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i11 - i15;
                int i18 = i10;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        b10 = 46;
                        z10 = false;
                    } else {
                        byte b11 = bArr4[i18][i19];
                        byte[] bArr5 = Util.f22171a;
                        byte b12 = b11 & 255;
                        z10 = z11;
                        b10 = b12;
                    }
                    byte b13 = bArr3[i15 + i20];
                    byte[] bArr6 = Util.f22171a;
                    i12 = b10 - (b13 & 255);
                    if (i12 != 0) {
                        break;
                    }
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr4[i18].length != i19) {
                        z11 = z10;
                    } else if (i18 == bArr4.length - 1) {
                        break;
                    } else {
                        i18++;
                        i19 = -1;
                        z11 = true;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i21 = i17 - i20;
                        int length2 = bArr4[i18].length - i19;
                        int length3 = bArr4.length;
                        for (int i22 = i18 + 1; i22 < length3; i22++) {
                            length2 += bArr4[i22].length;
                        }
                        if (length2 >= i21) {
                            if (length2 <= i21) {
                                Charset charset = StandardCharsets.UTF_8;
                                j.e(charset, "UTF_8");
                                return new String(bArr3, i15, i17, charset);
                            }
                        }
                    }
                    i13 = i11 + 1;
                }
                length = i15 - 1;
            }
            return null;
        }
    }

    public static List c(String str) {
        int i10 = 0;
        List e12 = l.e1(str, new char[]{'.'});
        if (!j.a(p.R0(e12), "")) {
            return e12;
        }
        int size = e12.size() - 1;
        if (size >= 0) {
            i10 = size;
        }
        return p.V0(e12, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r1 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x003b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r1 = "unicodeDomain"
            sk.j.e(r0, r1)
            java.util.List r0 = c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f22597a
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f22597a
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0052
            r1 = r3
        L_0x0020:
            r13.b()     // Catch:{ InterruptedIOException -> 0x0043, IOException -> 0x0028 }
            if (r1 == 0) goto L_0x005f
            goto L_0x003b
        L_0x0026:
            r14 = move-exception
            goto L_0x0048
        L_0x0028:
            r4 = move-exception
            okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.f22562a     // Catch:{ all -> 0x0026 }
            r5.getClass()     // Catch:{ all -> 0x0026 }
            okhttp3.internal.platform.Platform r5 = okhttp3.internal.platform.Platform.f22563b     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.getClass()     // Catch:{ all -> 0x0026 }
            okhttp3.internal.platform.Platform.i(r7, r6, r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x005f
        L_0x003b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x005f
        L_0x0043:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0026 }
            r1 = r2
            goto L_0x0020
        L_0x0048:
            if (r1 == 0) goto L_0x0051
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0051:
            throw r14
        L_0x0052:
            java.util.concurrent.CountDownLatch r1 = r13.f22598b     // Catch:{ InterruptedException -> 0x0058 }
            r1.await()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x005f:
            byte[] r1 = r13.f22599c
            if (r1 == 0) goto L_0x0065
            r1 = r2
            goto L_0x0066
        L_0x0065:
            r1 = r3
        L_0x0066:
            if (r1 == 0) goto L_0x01d6
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r3
        L_0x006f:
            if (r5 >= r1) goto L_0x008c
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            sk.j.e(r7, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "this as java.lang.String).getBytes(charset)"
            sk.j.e(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006f
        L_0x008c:
            r5 = r3
        L_0x008d:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x00a6
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r8 = f22593e
            byte[] r9 = r13.f22599c
            if (r9 == 0) goto L_0x00a2
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.a(r8, r9, r4, r5)
            if (r8 == 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            int r5 = r5 + 1
            goto L_0x008d
        L_0x00a2:
            sk.j.l(r6)
            throw r7
        L_0x00a6:
            r8 = r7
        L_0x00a7:
            if (r1 <= r2) goto L_0x00cc
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r2
            r10 = r3
        L_0x00b2:
            if (r10 >= r9) goto L_0x00cc
            byte[] r11 = f22594f
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r11 = f22593e
            byte[] r12 = r13.f22599c
            if (r12 == 0) goto L_0x00c8
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.a(r11, r12, r5, r10)
            if (r11 == 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            int r10 = r10 + 1
            goto L_0x00b2
        L_0x00c8:
            sk.j.l(r6)
            throw r7
        L_0x00cc:
            r11 = r7
        L_0x00cd:
            if (r11 == 0) goto L_0x00e9
            int r1 = r1 - r2
            r5 = r3
        L_0x00d1:
            if (r5 >= r1) goto L_0x00e9
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r6 = f22593e
            byte[] r9 = r13.f22600d
            if (r9 == 0) goto L_0x00e3
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.a(r6, r9, r4, r5)
            if (r6 == 0) goto L_0x00e0
            goto L_0x00ea
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00e3:
            java.lang.String r14 = "publicSuffixExceptionListBytes"
            sk.j.l(r14)
            throw r7
        L_0x00e9:
            r6 = r7
        L_0x00ea:
            r1 = 46
            r4 = 33
            if (r6 == 0) goto L_0x0108
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            char[] r6 = new char[r2]
            r6[r3] = r1
            java.util.List r1 = yk.l.e1(r5, r6)
            goto L_0x0134
        L_0x0108:
            if (r8 != 0) goto L_0x010f
            if (r11 != 0) goto L_0x010f
            java.util.List<java.lang.String> r1 = f22595g
            goto L_0x0134
        L_0x010f:
            if (r8 == 0) goto L_0x011a
            char[] r5 = new char[r2]
            r5[r3] = r1
            java.util.List r5 = yk.l.e1(r8, r5)
            goto L_0x011c
        L_0x011a:
            fk.r r5 = fk.r.f20213a
        L_0x011c:
            if (r11 == 0) goto L_0x0127
            char[] r6 = new char[r2]
            r6[r3] = r1
            java.util.List r1 = yk.l.e1(r11, r6)
            goto L_0x0129
        L_0x0127:
            fk.r r1 = fk.r.f20213a
        L_0x0129:
            int r6 = r5.size()
            int r8 = r1.size()
            if (r6 <= r8) goto L_0x0134
            r1 = r5
        L_0x0134:
            int r5 = r0.size()
            int r6 = r1.size()
            if (r5 != r6) goto L_0x014b
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            char r5 = r5.charAt(r3)
            if (r5 == r4) goto L_0x014b
            return r7
        L_0x014b:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            char r5 = r5.charAt(r3)
            if (r5 != r4) goto L_0x0160
            int r0 = r0.size()
            int r1 = r1.size()
            goto L_0x0169
        L_0x0160:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + r2
        L_0x0169:
            int r0 = r0 - r1
            java.util.List r14 = c(r14)
            fk.n r1 = new fk.n
            r1.<init>(r14)
            if (r0 < 0) goto L_0x0177
            r14 = r2
            goto L_0x0178
        L_0x0177:
            r14 = r3
        L_0x0178:
            if (r14 == 0) goto L_0x01c4
            if (r0 != 0) goto L_0x017d
            goto L_0x018e
        L_0x017d:
            boolean r14 = r1 instanceof xk.c
            if (r14 == 0) goto L_0x0188
            xk.c r1 = (xk.c) r1
            xk.b r1 = r1.a(r0)
            goto L_0x018e
        L_0x0188:
            xk.b r14 = new xk.b
            r14.<init>(r1, r0)
            r1 = r14
        L_0x018e:
            java.lang.String r14 = ""
            java.lang.String r0 = "<this>"
            sk.j.f(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.util.Iterator r1 = r1.iterator()
        L_0x01a1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01b7
            java.lang.Object r4 = r1.next()
            int r3 = r3 + r2
            if (r3 <= r2) goto L_0x01b3
            java.lang.String r5 = "."
            r0.append(r5)
        L_0x01b3:
            al.g0.t(r0, r4, r7)
            goto L_0x01a1
        L_0x01b7:
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            sk.j.e(r14, r0)
            return r14
        L_0x01c4:
            java.lang.String r14 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r14 = v.v.d(r14, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L_0x01d6:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        p3.l0.u(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        r7.f22598b.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r7 = this;
            sk.r r0 = new sk.r     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            sk.r r1 = new sk.r     // Catch:{ all -> 0x006d }
            r1.<init>()     // Catch:{ all -> 0x006d }
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r3 = "publicsuffixes.gz"
            java.io.InputStream r2 = r2.getResourceAsStream(r3)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x001a
        L_0x0014:
            java.util.concurrent.CountDownLatch r0 = r7.f22598b
            r0.countDown()
            return
        L_0x001a:
            ll.o r3 = new ll.o     // Catch:{ all -> 0x006d }
            ll.q r2 = j7.a.w0(r2)     // Catch:{ all -> 0x006d }
            r3.<init>(r2)     // Catch:{ all -> 0x006d }
            ll.w r2 = new ll.w     // Catch:{ all -> 0x006d }
            r2.<init>(r3)     // Catch:{ all -> 0x006d }
            r3 = 0
            int r4 = r2.readInt()     // Catch:{ all -> 0x0066 }
            long r4 = (long) r4     // Catch:{ all -> 0x0066 }
            r2.G0(r4)     // Catch:{ all -> 0x0066 }
            ll.f r6 = r2.f20915b     // Catch:{ all -> 0x0066 }
            byte[] r4 = r6.L(r4)     // Catch:{ all -> 0x0066 }
            r0.f22931a = r4     // Catch:{ all -> 0x0066 }
            int r4 = r2.readInt()     // Catch:{ all -> 0x0066 }
            long r4 = (long) r4     // Catch:{ all -> 0x0066 }
            r2.G0(r4)     // Catch:{ all -> 0x0066 }
            ll.f r6 = r2.f20915b     // Catch:{ all -> 0x0066 }
            byte[] r4 = r6.L(r4)     // Catch:{ all -> 0x0066 }
            r1.f22931a = r4     // Catch:{ all -> 0x0066 }
            ek.i r4 = ek.i.f20112a     // Catch:{ all -> 0x0066 }
            p3.l0.u(r2, r3)     // Catch:{ all -> 0x006d }
            monitor-enter(r7)     // Catch:{ all -> 0x006d }
            T r0 = r0.f22931a     // Catch:{ all -> 0x0063 }
            sk.j.c(r0)     // Catch:{ all -> 0x0063 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0063 }
            r7.f22599c = r0     // Catch:{ all -> 0x0063 }
            T r0 = r1.f22931a     // Catch:{ all -> 0x0063 }
            sk.j.c(r0)     // Catch:{ all -> 0x0063 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0063 }
            r7.f22600d = r0     // Catch:{ all -> 0x0063 }
            monitor-exit(r7)     // Catch:{ all -> 0x006d }
            goto L_0x0014
        L_0x0063:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x0066:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            p3.l0.u(r2, r0)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r7.f22598b
            r1.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }
}
