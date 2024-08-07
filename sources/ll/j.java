package ll;

import al.g0;
import f0.b0;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import m9.b;

/* compiled from: ByteString.kt */
public class j implements Serializable, Comparable<j> {

    /* renamed from: d  reason: collision with root package name */
    public static final j f20882d = new j(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f20883a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f20884b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f20885c;

    /* compiled from: ByteString.kt */
    public static final class a {
        public static j a(String str) {
            boolean z10;
            if (str.length() % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) (b.c(str.charAt(i11 + 1)) + (b.c(str.charAt(i11)) << 4));
                }
                return new j(bArr);
            }
            throw new IllegalArgumentException(b0.r("Unexpected hex string: ", str).toString());
        }

        public static j b(String str) {
            sk.j.f(str, "<this>");
            byte[] bytes = str.getBytes(yk.a.f23582b);
            sk.j.e(bytes, "this as java.lang.String).getBytes(charset)");
            j jVar = new j(bytes);
            jVar.f20885c = str;
            return jVar;
        }

        public static j c(byte[] bArr) {
            j jVar = j.f20882d;
            int i10 = b.f20859a;
            int length = bArr.length;
            b.b((long) bArr.length, (long) 0, (long) length);
            int i11 = length + 0;
            g0.J(i11, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i11);
            sk.j.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return new j(copyOfRange);
        }
    }

    static {
        new a();
    }

    public j(byte[] bArr) {
        sk.j.f(bArr, "data");
        this.f20883a = bArr;
    }

    public String b() {
        byte[] bArr = this.f20883a;
        byte[] bArr2 = a.f20858a;
        sk.j.f(bArr, "<this>");
        sk.j.f(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[(b13 & 3) << 4];
            bArr3[i19] = 61;
            bArr3[i19 + 1] = 61;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i20];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b14 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i22] = bArr2[(b15 & 15) << 2];
            bArr3[i22 + 1] = 61;
        }
        return new String(bArr3, yk.a.f23582b);
    }

    public j c(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f20883a, 0, i());
        byte[] digest = instance.digest();
        sk.j.c(digest);
        return new j(digest);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r6 < r7) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 < r1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            ll.j r9 = (ll.j) r9
            java.lang.String r0 = "other"
            sk.j.f(r9, r0)
            int r0 = r8.i()
            int r1 = r9.i()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            r5 = -1
            if (r4 >= r2) goto L_0x002c
            byte r6 = r8.m(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.m(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0029
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 >= r7) goto L_0x0033
            goto L_0x0031
        L_0x002c:
            if (r0 != r1) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            if (r0 >= r1) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.j.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int i10 = jVar.i();
            byte[] bArr = this.f20883a;
            if (i10 == bArr.length && jVar.n(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f20884b;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f20883a);
        this.f20884b = hashCode;
        return hashCode;
    }

    public int i() {
        return this.f20883a.length;
    }

    public String j() {
        byte[] bArr = this.f20883a;
        char[] cArr = new char[(bArr.length * 2)];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = b.D;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] k() {
        return this.f20883a;
    }

    public byte m(int i10) {
        return this.f20883a[i10];
    }

    public boolean n(int i10, byte[] bArr, int i11, int i12) {
        sk.j.f(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.f20883a;
            if (i10 > bArr2.length - i12 || i11 < 0 || i11 > bArr.length - i12 || !b.a(bArr2, i10, bArr, i11, i12)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean o(j jVar, int i10) {
        sk.j.f(jVar, "other");
        return jVar.n(0, this.f20883a, 0, i10);
    }

    public j p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f20883a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 < 65 || b10 > 90) {
                i10++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                sk.j.e(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b11 = copyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new j(copyOf);
            }
        }
    }

    public final String q() {
        String str = this.f20885c;
        if (str != null) {
            return str;
        }
        byte[] k10 = k();
        sk.j.f(k10, "<this>");
        String str2 = new String(k10, yk.a.f23582b);
        this.f20885c = str2;
        return str2;
    }

    public void s(f fVar, int i10) {
        sk.j.f(fVar, "buffer");
        fVar.write(this.f20883a, 0, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0103, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0114, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0123, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0135, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0142, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x018c, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x019d, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01ae, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x01bd, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01d3, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x01e0, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x01e7, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0228, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x022b, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009b, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00aa, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b5, code lost:
        if (r4 == 64) goto L_0x022c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x022b A[EDGE_INSN: B:248:0x022b->B:214:0x022b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x022b A[EDGE_INSN: B:257:0x022b->B:214:0x022b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x022b A[EDGE_INSN: B:260:0x022b->B:214:0x022b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x022b A[EDGE_INSN: B:262:0x022b->B:214:0x022b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x022b A[EDGE_INSN: B:274:0x022b->B:214:0x022b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f20883a
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x0327
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0014:
            r6 = 64
            if (r3 >= r2) goto L_0x022c
            byte r7 = r1[r3]
            r8 = 10
            r9 = 13
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 160(0xa0, float:2.24E-43)
            r12 = 32
            r14 = 65533(0xfffd, float:9.1831E-41)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r7 < 0) goto L_0x0090
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0031
            goto L_0x022c
        L_0x0031:
            if (r7 == r8) goto L_0x004d
            if (r7 == r9) goto L_0x004d
            if (r7 < 0) goto L_0x003b
            if (r7 >= r12) goto L_0x003b
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 != 0) goto L_0x004a
            if (r10 > r7) goto L_0x0044
            if (r7 >= r11) goto L_0x0044
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r4 = 0
            goto L_0x004b
        L_0x004a:
            r4 = 1
        L_0x004b:
            if (r4 != 0) goto L_0x022b
        L_0x004d:
            if (r7 != r14) goto L_0x0051
            goto L_0x022b
        L_0x0051:
            if (r7 >= r15) goto L_0x0055
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = 2
        L_0x0056:
            int r5 = r5 + r4
            int r3 = r3 + 1
        L_0x0059:
            r4 = r16
            if (r3 >= r2) goto L_0x0014
            byte r7 = r1[r3]
            if (r7 < 0) goto L_0x0014
            int r3 = r3 + 1
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0069
            goto L_0x022c
        L_0x0069:
            if (r7 == r8) goto L_0x0085
            if (r7 == r9) goto L_0x0085
            if (r7 < 0) goto L_0x0073
            if (r7 >= r12) goto L_0x0073
            r4 = 1
            goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            if (r4 != 0) goto L_0x0082
            if (r10 > r7) goto L_0x007c
            if (r7 >= r11) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            if (r4 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r4 = 0
            goto L_0x0083
        L_0x0082:
            r4 = 1
        L_0x0083:
            if (r4 != 0) goto L_0x022b
        L_0x0085:
            if (r7 != r14) goto L_0x0089
            goto L_0x022b
        L_0x0089:
            if (r7 >= r15) goto L_0x008d
            r4 = 1
            goto L_0x008e
        L_0x008d:
            r4 = 2
        L_0x008e:
            int r5 = r5 + r4
            goto L_0x0059
        L_0x0090:
            int r14 = r7 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x00f5
            int r14 = r3 + 1
            if (r2 > r14) goto L_0x009f
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x009f:
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x00a7
            r15 = 1
            goto L_0x00a8
        L_0x00a7:
            r15 = 0
        L_0x00a8:
            if (r15 != 0) goto L_0x00ae
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x00ae:
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r7 = r7 ^ r14
            if (r7 >= r13) goto L_0x00b9
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x00b9:
            int r13 = r4 + 1
            if (r4 != r6) goto L_0x00bf
            goto L_0x022c
        L_0x00bf:
            if (r7 == r8) goto L_0x00db
            if (r7 == r9) goto L_0x00db
            if (r7 < 0) goto L_0x00c9
            if (r7 >= r12) goto L_0x00c9
            r4 = 1
            goto L_0x00ca
        L_0x00c9:
            r4 = 0
        L_0x00ca:
            if (r4 != 0) goto L_0x00d8
            if (r10 > r7) goto L_0x00d2
            if (r7 >= r11) goto L_0x00d2
            r4 = 1
            goto L_0x00d3
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            if (r4 == 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            r4 = 0
            goto L_0x00d9
        L_0x00d8:
            r4 = 1
        L_0x00d9:
            if (r4 != 0) goto L_0x022b
        L_0x00db:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x00e2
            goto L_0x022b
        L_0x00e2:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x00ea
            r4 = 1
            r16 = r4
            goto L_0x00ec
        L_0x00ea:
            r16 = 2
        L_0x00ec:
            int r5 = r5 + r16
            ek.i r4 = ek.i.f20112a
            int r3 = r3 + 2
            r4 = r13
            goto L_0x0014
        L_0x00f5:
            int r10 = r7 >> 4
            r11 = 57344(0xe000, float:8.0356E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r10 != r15) goto L_0x0184
            int r10 = r3 + 2
            if (r2 > r10) goto L_0x0107
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x0107:
            int r14 = r3 + 1
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0111
            r15 = 1
            goto L_0x0112
        L_0x0111:
            r15 = 0
        L_0x0112:
            if (r15 != 0) goto L_0x0118
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x0118:
            byte r10 = r1[r10]
            r15 = r10 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0120
            r13 = 1
            goto L_0x0121
        L_0x0120:
            r13 = 0
        L_0x0121:
            if (r13 != 0) goto L_0x0127
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x0127:
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r10 = r10 ^ r13
            int r13 = r14 << 6
            r10 = r10 ^ r13
            int r7 = r7 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L_0x0139
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x0139:
            if (r12 > r7) goto L_0x013f
            if (r7 >= r11) goto L_0x013f
            r10 = 1
            goto L_0x0140
        L_0x013f:
            r10 = 0
        L_0x0140:
            if (r10 == 0) goto L_0x0146
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x0146:
            int r10 = r4 + 1
            if (r4 != r6) goto L_0x014c
            goto L_0x022c
        L_0x014c:
            if (r7 == r8) goto L_0x016e
            if (r7 == r9) goto L_0x016e
            if (r7 < 0) goto L_0x0158
            r4 = 32
            if (r7 >= r4) goto L_0x0158
            r4 = 1
            goto L_0x0159
        L_0x0158:
            r4 = 0
        L_0x0159:
            if (r4 != 0) goto L_0x016b
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 > r7) goto L_0x0165
            r4 = 160(0xa0, float:2.24E-43)
            if (r7 >= r4) goto L_0x0165
            r4 = 1
            goto L_0x0166
        L_0x0165:
            r4 = 0
        L_0x0166:
            if (r4 == 0) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r4 = 0
            goto L_0x016c
        L_0x016b:
            r4 = 1
        L_0x016c:
            if (r4 != 0) goto L_0x022b
        L_0x016e:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x0175
            goto L_0x022b
        L_0x0175:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x017b
            r13 = 1
            goto L_0x017c
        L_0x017b:
            r13 = 2
        L_0x017c:
            int r5 = r5 + r13
            ek.i r4 = ek.i.f20112a
            int r3 = r3 + 3
            r4 = r10
            goto L_0x0014
        L_0x0184:
            int r9 = r7 >> 3
            if (r9 != r15) goto L_0x0228
            int r9 = r3 + 3
            if (r2 > r9) goto L_0x0190
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x0190:
            int r10 = r3 + 1
            byte r10 = r1[r10]
            r14 = r10 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L_0x019a
            r14 = 1
            goto L_0x019b
        L_0x019a:
            r14 = 0
        L_0x019b:
            if (r14 != 0) goto L_0x01a1
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x01a1:
            int r14 = r3 + 2
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x01ab
            r15 = 1
            goto L_0x01ac
        L_0x01ab:
            r15 = 0
        L_0x01ac:
            if (r15 != 0) goto L_0x01b2
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x01b2:
            byte r9 = r1[r9]
            r15 = r9 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x01ba
            r13 = 1
            goto L_0x01bb
        L_0x01ba:
            r13 = 0
        L_0x01bb:
            if (r13 != 0) goto L_0x01c1
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x01c1:
            r13 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r13
            int r13 = r14 << 6
            r9 = r9 ^ r13
            int r10 = r10 << 12
            r9 = r9 ^ r10
            int r7 = r7 << 18
            r7 = r7 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r9) goto L_0x01d7
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x01d7:
            if (r12 > r7) goto L_0x01dd
            if (r7 >= r11) goto L_0x01dd
            r9 = 1
            goto L_0x01de
        L_0x01dd:
            r9 = 0
        L_0x01de:
            if (r9 == 0) goto L_0x01e3
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x01e3:
            r9 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r9) goto L_0x01ea
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x01ea:
            int r9 = r4 + 1
            if (r4 != r6) goto L_0x01ef
            goto L_0x022c
        L_0x01ef:
            if (r7 == r8) goto L_0x0213
            r4 = 13
            if (r7 == r4) goto L_0x0213
            if (r7 < 0) goto L_0x01fd
            r4 = 32
            if (r7 >= r4) goto L_0x01fd
            r4 = 1
            goto L_0x01fe
        L_0x01fd:
            r4 = 0
        L_0x01fe:
            if (r4 != 0) goto L_0x0210
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 > r7) goto L_0x020a
            r4 = 160(0xa0, float:2.24E-43)
            if (r7 >= r4) goto L_0x020a
            r4 = 1
            goto L_0x020b
        L_0x020a:
            r4 = 0
        L_0x020b:
            if (r4 == 0) goto L_0x020e
            goto L_0x0210
        L_0x020e:
            r4 = 0
            goto L_0x0211
        L_0x0210:
            r4 = 1
        L_0x0211:
            if (r4 != 0) goto L_0x022b
        L_0x0213:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x0219
            goto L_0x022b
        L_0x0219:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x021f
            r13 = 1
            goto L_0x0220
        L_0x021f:
            r13 = 2
        L_0x0220:
            int r5 = r5 + r13
            ek.i r4 = ek.i.f20112a
            int r3 = r3 + 4
            r4 = r9
            goto L_0x0014
        L_0x0228:
            if (r4 != r6) goto L_0x022b
            goto L_0x022c
        L_0x022b:
            r5 = -1
        L_0x022c:
            java.lang.String r1 = "…]"
            java.lang.String r2 = "[size="
            r3 = 93
            r4 = -1
            if (r5 != r4) goto L_0x02cd
            byte[] r4 = r0.f20883a
            int r4 = r4.length
            if (r4 > r6) goto L_0x0250
            java.lang.String r1 = "[hex="
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.lang.String r2 = r17.j()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x0327
        L_0x0250:
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            byte[] r3 = r0.f20883a
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " hex="
            r2.append(r3)
            int r3 = ll.b.f20859a
            if (r6 != r3) goto L_0x0267
            int r6 = r17.i()
        L_0x0267:
            byte[] r3 = r0.f20883a
            int r4 = r3.length
            if (r6 > r4) goto L_0x026e
            r4 = 1
            goto L_0x026f
        L_0x026e:
            r4 = 0
        L_0x026f:
            if (r4 == 0) goto L_0x02ae
            int r4 = r6 + 0
            if (r4 < 0) goto L_0x0277
            r4 = 1
            goto L_0x0278
        L_0x0277:
            r4 = 0
        L_0x0278:
            if (r4 == 0) goto L_0x02a2
            int r4 = r3.length
            if (r6 != r4) goto L_0x027f
            r4 = r0
            goto L_0x0292
        L_0x027f:
            ll.j r4 = new ll.j
            int r5 = r3.length
            al.g0.J(r6, r5)
            r5 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r5, r6)
            java.lang.String r5 = "copyOfRange(this, fromIndex, toIndex)"
            sk.j.e(r3, r5)
            r4.<init>(r3)
        L_0x0292:
            java.lang.String r3 = r4.j()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0327
        L_0x02a2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "endIndex < beginIndex"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02ae:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            byte[] r2 = r0.f20883a
            int r2 = r2.length
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x02cd:
            java.lang.String r4 = r17.q()
            r6 = 0
            java.lang.String r6 = r4.substring(r6, r5)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            sk.j.e(r6, r7)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = yk.h.J0(r6, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = yk.h.J0(r6, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r6 = yk.h.J0(r6, r7, r8)
            int r4 = r4.length()
            if (r5 >= r4) goto L_0x0313
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            byte[] r3 = r0.f20883a
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " text="
            r2.append(r3)
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0327
        L_0x0313:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[text="
            r1.append(r2)
            r1.append(r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L_0x0327:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.j.toString():java.lang.String");
    }
}
