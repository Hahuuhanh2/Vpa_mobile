package lb;

import android.util.Log;
import h5.l;
import hd.c;
import hd.d;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import l8.p;
import o5.a;
import s4.h;
import s4.k;
import u4.u;

/* compiled from: LogWrapper */
public class b implements k, l, uc.l, c {

    /* renamed from: b  reason: collision with root package name */
    public static b f12902b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12903a;

    public /* synthetic */ b(int i10) {
        this.f12903a = i10;
    }

    public static cd.b a(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        int length = bArr.length + i11;
        cd.b bVar = new cd.b(bArr[0].length + i11, length);
        int length2 = bVar.f4692d.length;
        for (int i12 = 0; i12 < length2; i12++) {
            bVar.f4692d[i12] = 0;
        }
        int i13 = (length - i10) - 1;
        int i14 = 0;
        while (i14 < bArr.length) {
            byte[] bArr2 = bArr[i14];
            for (int i15 = 0; i15 < bArr[0].length; i15++) {
                if (bArr2[i15] == 1) {
                    bVar.g(i15 + i10, i13);
                }
            }
            i14++;
            i13--;
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d0, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0339  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static cd.b b(java.lang.String r17, uc.a r18) {
        /*
            r0 = r17
            uc.a r1 = uc.a.PDF_417
            r2 = r18
            if (r2 != r1) goto L_0x0341
            byte[] r1 = sd.b.f14743a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r17.length()
            r1.<init>(r2)
            java.nio.charset.Charset r2 = sd.b.f14747e
            int r3 = r17.length()
            r4 = 1
            int r5 = v.v.g(r4)
            r6 = 2
            r7 = 3
            if (r5 == r4) goto L_0x014f
            if (r5 == r6) goto L_0x0146
            r6 = 902(0x386, float:1.264E-42)
            if (r5 == r7) goto L_0x013e
            r5 = 0
            r7 = 0
        L_0x002a:
            r8 = 0
        L_0x002b:
            if (r5 >= r3) goto L_0x0153
            int r9 = r17.length()
            r10 = 57
            r11 = 48
            if (r5 >= r9) goto L_0x0053
            char r12 = r0.charAt(r5)
            r13 = 0
            r14 = r5
        L_0x003d:
            if (r12 < r11) goto L_0x0043
            if (r12 > r10) goto L_0x0043
            r15 = r4
            goto L_0x0044
        L_0x0043:
            r15 = 0
        L_0x0044:
            if (r15 == 0) goto L_0x0054
            if (r14 >= r9) goto L_0x0054
            int r13 = r13 + 1
            int r14 = r14 + 1
            if (r14 >= r9) goto L_0x003d
            char r12 = r0.charAt(r14)
            goto L_0x003d
        L_0x0053:
            r13 = 0
        L_0x0054:
            r9 = 13
            if (r13 < r9) goto L_0x0061
            r1.append(r6)
            sd.b.b(r5, r13, r0, r1)
            int r5 = r5 + r13
            r7 = 2
            goto L_0x002a
        L_0x0061:
            int r6 = r17.length()
            r12 = r5
        L_0x0066:
            if (r12 >= r6) goto L_0x00ad
            char r14 = r0.charAt(r12)
            r15 = 0
        L_0x006d:
            if (r15 >= r9) goto L_0x0087
            if (r14 < r11) goto L_0x0076
            if (r14 > r10) goto L_0x0076
            r16 = r4
            goto L_0x0078
        L_0x0076:
            r16 = 0
        L_0x0078:
            if (r16 == 0) goto L_0x0087
            if (r12 >= r6) goto L_0x0087
            int r15 = r15 + 1
            int r12 = r12 + 1
            if (r12 >= r6) goto L_0x006d
            char r14 = r0.charAt(r12)
            goto L_0x006d
        L_0x0087:
            if (r15 < r9) goto L_0x008c
            int r12 = r12 - r5
            int r12 = r12 - r15
            goto L_0x00ae
        L_0x008c:
            if (r15 > 0) goto L_0x0066
            char r14 = r0.charAt(r12)
            r15 = 9
            if (r14 == r15) goto L_0x00a7
            r15 = 10
            if (r14 == r15) goto L_0x00a7
            if (r14 == r9) goto L_0x00a7
            r15 = 32
            if (r14 < r15) goto L_0x00a5
            r15 = 126(0x7e, float:1.77E-43)
            if (r14 > r15) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r14 = 0
            goto L_0x00a8
        L_0x00a7:
            r14 = r4
        L_0x00a8:
            if (r14 == 0) goto L_0x00ad
            int r12 = r12 + 1
            goto L_0x0066
        L_0x00ad:
            int r12 = r12 - r5
        L_0x00ae:
            r6 = 5
            if (r12 >= r6) goto L_0x012b
            if (r13 != r3) goto L_0x00b5
            goto L_0x012b
        L_0x00b5:
            java.nio.charset.CharsetEncoder r6 = r2.newEncoder()
            int r12 = r17.length()
            r13 = r5
        L_0x00be:
            if (r13 >= r12) goto L_0x010c
            char r14 = r0.charAt(r13)
            r15 = 0
        L_0x00c5:
            if (r15 >= r9) goto L_0x00db
            if (r14 < r11) goto L_0x00cd
            if (r14 > r10) goto L_0x00cd
            r14 = r4
            goto L_0x00ce
        L_0x00cd:
            r14 = 0
        L_0x00ce:
            if (r14 == 0) goto L_0x00db
            int r15 = r15 + 1
            int r14 = r13 + r15
            if (r14 >= r12) goto L_0x00db
            char r14 = r0.charAt(r14)
            goto L_0x00c5
        L_0x00db:
            if (r15 < r9) goto L_0x00de
            goto L_0x010c
        L_0x00de:
            char r14 = r0.charAt(r13)
            boolean r15 = r6.canEncode(r14)
            if (r15 == 0) goto L_0x00eb
            int r13 = r13 + 1
            goto L_0x00be
        L_0x00eb:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-encodable character detected: "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = " (Unicode: "
            r1.append(r2)
            r1.append(r14)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x010c:
            int r13 = r13 - r5
            if (r13 != 0) goto L_0x0110
            r13 = r4
        L_0x0110:
            int r13 = r13 + r5
            java.lang.String r5 = r0.substring(r5, r13)
            byte[] r5 = r5.getBytes(r2)
            int r6 = r5.length
            if (r6 != r4) goto L_0x0123
            if (r7 != 0) goto L_0x0123
            r6 = 0
            sd.b.a(r5, r4, r6, r1)
            goto L_0x0129
        L_0x0123:
            int r6 = r5.length
            sd.b.a(r5, r6, r7, r1)
            r8 = 0
            r7 = r4
        L_0x0129:
            r5 = r13
            goto L_0x013a
        L_0x012b:
            if (r7 == 0) goto L_0x0134
            r6 = 900(0x384, float:1.261E-42)
            r1.append(r6)
            r7 = 0
            r8 = 0
        L_0x0134:
            int r6 = sd.b.c(r0, r5, r12, r1, r8)
            int r5 = r5 + r12
            r8 = r6
        L_0x013a:
            r6 = 902(0x386, float:1.264E-42)
            goto L_0x002b
        L_0x013e:
            r1.append(r6)
            r2 = 0
            sd.b.b(r2, r3, r0, r1)
            goto L_0x0153
        L_0x0146:
            byte[] r2 = r0.getBytes(r2)
            int r3 = r2.length
            sd.b.a(r2, r3, r4, r1)
            goto L_0x0153
        L_0x014f:
            r2 = 0
            sd.b.c(r0, r2, r3, r1, r2)
        L_0x0153:
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            r3 = 0
            r5 = 0
            r6 = 2
        L_0x015e:
            r7 = 30
            if (r6 > r7) goto L_0x01a4
            int r8 = r2 + 1
            int r8 = r8 + 8
            int r9 = r8 / r6
            int r9 = r9 + r4
            int r10 = r6 * r9
            int r8 = r8 + r6
            if (r10 < r8) goto L_0x0170
            int r9 = r9 + -1
        L_0x0170:
            r8 = 2
            if (r9 < r8) goto L_0x01a4
            if (r9 > r7) goto L_0x01a1
            int r7 = r6 * 17
            int r7 = r7 + 69
            float r7 = (float) r7
            r8 = 1052166324(0x3eb6c8b4, float:0.357)
            float r7 = r7 * r8
            float r8 = (float) r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r10
            float r7 = r7 / r8
            if (r5 == 0) goto L_0x0197
            r8 = 1077936128(0x40400000, float:3.0)
            float r10 = r7 - r8
            float r10 = java.lang.Math.abs(r10)
            float r8 = r3 - r8
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x01a1
        L_0x0197:
            r3 = 2
            int[] r3 = new int[r3]
            r5 = 0
            r3[r5] = r6
            r3[r4] = r9
            r5 = r3
            r3 = r7
        L_0x01a1:
            int r6 = r6 + 1
            goto L_0x015e
        L_0x01a4:
            if (r5 != 0) goto L_0x01bf
            int r3 = r2 + 1
            int r3 = r3 + 8
            int r6 = r3 / 2
            int r6 = r6 + r4
            r8 = 2
            int r9 = r6 * 2
            int r3 = r3 + r8
            if (r9 < r3) goto L_0x01b5
            int r6 = r6 + -1
        L_0x01b5:
            if (r6 >= r8) goto L_0x01bf
            int[] r5 = new int[r8]
            r3 = 0
            r5[r3] = r8
            r5[r4] = r8
            goto L_0x01c0
        L_0x01bf:
            r3 = 0
        L_0x01c0:
            if (r5 == 0) goto L_0x0339
            r3 = r5[r3]
            r5 = r5[r4]
            int r6 = r3 * r5
            int r6 = r6 + -8
            int r8 = r2 + 1
            if (r6 <= r8) goto L_0x01d2
            int r6 = r6 - r2
            int r6 = r6 + -1
            goto L_0x01d3
        L_0x01d2:
            r6 = 0
        L_0x01d3:
            int r8 = r2 + 8
            int r8 = r8 + r4
            r9 = 929(0x3a1, float:1.302E-42)
            if (r8 > r9) goto L_0x031c
            int r2 = r2 + r6
            int r2 = r2 + r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            char r2 = (char) r2
            r0.append(r2)
            r0.append(r1)
            r1 = 0
        L_0x01e9:
            if (r1 >= r6) goto L_0x01f3
            r2 = 900(0x384, float:1.261E-42)
            r0.append(r2)
            int r1 = r1 + 1
            goto L_0x01e9
        L_0x01f3:
            java.lang.String r0 = r0.toString()
            r1 = 8
            char[] r1 = new char[r1]
            int r2 = r0.length()
            r6 = 0
        L_0x0200:
            r8 = 7
            if (r6 >= r2) goto L_0x0236
            char r10 = r0.charAt(r6)
            char r11 = r1[r8]
            int r10 = r10 + r11
            int r10 = r10 % r9
        L_0x020b:
            if (r8 <= 0) goto L_0x0223
            int[][] r11 = j7.a.f11717y
            r12 = 2
            r11 = r11[r12]
            r11 = r11[r8]
            int r11 = r11 * r10
            int r11 = r11 % r9
            int r11 = 929 - r11
            int r12 = r8 + -1
            char r13 = r1[r12]
            int r13 = r13 + r11
            int r13 = r13 % r9
            char r11 = (char) r13
            r1[r8] = r11
            r8 = r12
            goto L_0x020b
        L_0x0223:
            int[][] r8 = j7.a.f11717y
            r11 = 2
            r8 = r8[r11]
            r11 = 0
            r8 = r8[r11]
            int r10 = r10 * r8
            int r10 = r10 % r9
            int r8 = 929 - r10
            int r8 = r8 % r9
            char r8 = (char) r8
            r1[r11] = r8
            int r6 = r6 + 1
            goto L_0x0200
        L_0x0236:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r6 = 8
            r2.<init>(r6)
        L_0x023d:
            if (r8 < 0) goto L_0x0250
            char r6 = r1[r8]
            if (r6 == 0) goto L_0x0248
            int r6 = 929 - r6
            char r6 = (char) r6
            r1[r8] = r6
        L_0x0248:
            char r6 = r1[r8]
            r2.append(r6)
            int r8 = r8 + -1
            goto L_0x023d
        L_0x0250:
            java.lang.String r1 = r2.toString()
            sd.a r2 = new sd.a
            r2.<init>(r5, r3)
            java.lang.String r0 = f0.b0.r(r0, r1)
            r1 = 0
            r6 = 0
        L_0x025f:
            if (r1 >= r5) goto L_0x02df
            int r8 = r1 % 3
            int r9 = r2.f14740b
            int r9 = r9 + r4
            r2.f14740b = r9
            r9 = 130728(0x1fea8, float:1.83189E-40)
            a1.e r10 = r2.a()
            r11 = 17
            al.g0.N(r9, r11, r10)
            if (r8 != 0) goto L_0x0281
            int r9 = r1 / 3
            int r9 = r9 * r7
            int r10 = r5 + -1
            int r10 = r10 / 3
            int r10 = r10 + r9
            int r12 = r3 + -1
            goto L_0x029c
        L_0x0281:
            if (r8 != r4) goto L_0x0290
            int r9 = r1 / 3
            int r9 = r9 * r7
            int r10 = r9 + 6
            int r12 = r5 + -1
            int r13 = r12 % 3
            int r10 = r10 + r13
            int r12 = r12 / 3
            goto L_0x029c
        L_0x0290:
            int r9 = r1 / 3
            int r9 = r9 * r7
            int r10 = r3 + -1
            int r10 = r10 + r9
            int r9 = r9 + 6
            int r12 = r5 + -1
            int r12 = r12 % 3
        L_0x029c:
            int r12 = r12 + r9
            int[][] r9 = al.g0.f19032v
            r9 = r9[r8]
            r9 = r9[r10]
            a1.e r10 = r2.a()
            al.g0.N(r9, r11, r10)
            r9 = 0
        L_0x02ab:
            if (r9 >= r3) goto L_0x02c3
            int[][] r10 = al.g0.f19032v
            r10 = r10[r8]
            char r13 = r0.charAt(r6)
            r10 = r10[r13]
            a1.e r13 = r2.a()
            al.g0.N(r10, r11, r13)
            int r6 = r6 + 1
            int r9 = r9 + 1
            goto L_0x02ab
        L_0x02c3:
            r9 = 260649(0x3fa29, float:3.65247E-40)
            int[][] r10 = al.g0.f19032v
            r8 = r10[r8]
            r8 = r8[r12]
            a1.e r10 = r2.a()
            al.g0.N(r8, r11, r10)
            r8 = 18
            a1.e r10 = r2.a()
            al.g0.N(r9, r8, r10)
            int r1 = r1 + 1
            goto L_0x025f
        L_0x02df:
            r0 = 4
            byte[][] r0 = r2.b(r4, r0)
            r1 = 0
            r3 = r0[r1]
            int r3 = r3.length
            int r5 = r0.length
            if (r3 >= r5) goto L_0x02ed
            r3 = r4
            goto L_0x02ee
        L_0x02ed:
            r3 = r1
        L_0x02ee:
            if (r3 == 0) goto L_0x02f6
            byte[][] r0 = k(r0)
            r3 = r4
            goto L_0x02f7
        L_0x02f6:
            r3 = r1
        L_0x02f7:
            r1 = r0[r1]
            int r1 = r1.length
            r5 = 500(0x1f4, float:7.0E-43)
            int r1 = r5 / r1
            int r6 = r0.length
            int r5 = r5 / r6
            int r1 = java.lang.Math.min(r1, r5)
            if (r1 <= r4) goto L_0x0317
            int r0 = r1 << 2
            byte[][] r0 = r2.b(r1, r0)
            if (r3 == 0) goto L_0x0312
            byte[][] r0 = k(r0)
        L_0x0312:
            cd.b r0 = a(r0, r7)
            goto L_0x031b
        L_0x0317:
            cd.b r0 = a(r0, r7)
        L_0x031b:
            return r0
        L_0x031c:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Encoded message contains too many code words, message too big ("
            r2.<init>(r3)
            int r0 = r17.length()
            r2.append(r0)
            java.lang.String r0 = " bytes)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0339:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Unable to fit message in columns"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0341:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r18)
            java.lang.String r2 = "Can only encode PDF_417, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.b.b(java.lang.String, uc.a):cd.b");
    }

    public static String f(StringBuilder sb2) {
        char c10;
        char c11;
        int length = sb2.length();
        if (length != 0) {
            char c12 = 0;
            char charAt = sb2.charAt(0);
            if (length >= 2) {
                c10 = sb2.charAt(1);
            } else {
                c10 = 0;
            }
            if (length >= 3) {
                c11 = sb2.charAt(2);
            } else {
                c11 = 0;
            }
            if (length >= 4) {
                c12 = sb2.charAt(3);
            }
            int i10 = (charAt << 18) + (c10 << 12) + (c11 << 6) + c12;
            char c13 = (char) ((i10 >> 8) & 255);
            char c14 = (char) (i10 & 255);
            StringBuilder sb3 = new StringBuilder(3);
            sb3.append((char) ((i10 >> 16) & 255));
            if (length >= 2) {
                sb3.append(c13);
            }
            if (length >= 3) {
                sb3.append(c14);
            }
            return sb3.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static byte[][] k(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length2 = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length2] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public static void l(d dVar, StringBuilder sb2) {
        int charAt = sb2.charAt(1) * '(';
        int charAt2 = sb2.charAt(2) + charAt + (sb2.charAt(0) * 1600) + 1;
        dVar.f10744c.append(new String(new char[]{(char) (charAt2 / 256), (char) (charAt2 % 256)}));
        sb2.delete(0, 3);
    }

    public int c(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append(3);
            return 1;
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
            return 1;
        } else if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) ((c10 - 'A') + 14));
            return 1;
        } else if (c10 < ' ') {
            sb2.append(0);
            sb2.append(c10);
            return 2;
        } else if (c10 <= '/') {
            sb2.append(1);
            sb2.append((char) (c10 - '!'));
            return 2;
        } else if (c10 <= '@') {
            sb2.append(1);
            sb2.append((char) ((c10 - ':') + 15));
            return 2;
        } else if (c10 <= '_') {
            sb2.append(1);
            sb2.append((char) ((c10 - '[') + 22));
            return 2;
        } else if (c10 <= 127) {
            sb2.append(2);
            sb2.append((char) (c10 - '`'));
            return 2;
        } else {
            sb2.append("\u0001\u001e");
            return c((char) (c10 - 128), sb2) + 2;
        }
    }

    public final s4.c d(h hVar) {
        return s4.c.SOURCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e8 A[ADDED_TO_REGION, LOOP:8: B:95:0x02c7->B:106:0x02e8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0192 A[LOOP:6: B:59:0x0192->B:389:0x0192, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x02f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x02ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cd.b e(java.lang.String r18, uc.a r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            r2 = r19
            int r3 = r1.f12903a
            r4 = 0
            r5 = 10
            r6 = 11
            r7 = 6
            r8 = -1
            r9 = 5
            r10 = 3
            r11 = 4
            r12 = 0
            r13 = 2
            r14 = 1
            switch(r3) {
                case 8: goto L_0x0425;
                case 9: goto L_0x001d;
                default: goto L_0x0018;
            }
        L_0x0018:
            cd.b r0 = b(r18, r19)
            return r0
        L_0x001d:
            boolean r3 = r18.isEmpty()
            if (r3 != 0) goto L_0x041d
            uc.a r3 = uc.a.DATA_MATRIX
            if (r2 != r3) goto L_0x040d
            hd.g r2 = hd.g.FORCE_NONE
            hd.c[] r3 = new hd.c[r7]
            a.a r7 = new a.a
            r7.<init>()
            r3[r12] = r7
            lb.b r7 = new lb.b
            r7.<init>(r5)
            r3[r14] = r7
            hd.h r7 = new hd.h
            r7.<init>()
            r3[r13] = r7
            hd.i r7 = new hd.i
            r7.<init>()
            r3[r10] = r7
            lb.b r7 = new lb.b
            r7.<init>(r6)
            r3[r11] = r7
            al.g0 r6 = new al.g0
            r6.<init>(r5)
            r3[r9] = r6
            hd.d r5 = new hd.d
            r5.<init>(r0)
            r5.f10743b = r2
            java.lang.String r6 = "[)>\u001e05\u001d"
            boolean r6 = r0.startsWith(r6)
            java.lang.String r7 = "\u001e\u0004"
            if (r6 == 0) goto L_0x007a
            boolean r6 = r0.endsWith(r7)
            if (r6 == 0) goto L_0x007a
            r0 = 236(0xec, float:3.31E-43)
            r5.e(r0)
            r5.f10748g = r13
            int r0 = r5.f10745d
            int r0 = r0 + 7
            r5.f10745d = r0
            goto L_0x0095
        L_0x007a:
            java.lang.String r6 = "[)>\u001e06\u001d"
            boolean r6 = r0.startsWith(r6)
            if (r6 == 0) goto L_0x0095
            boolean r0 = r0.endsWith(r7)
            if (r0 == 0) goto L_0x0095
            r0 = 237(0xed, float:3.32E-43)
            r5.e(r0)
            r5.f10748g = r13
            int r0 = r5.f10745d
            int r0 = r0 + 7
            r5.f10745d = r0
        L_0x0095:
            r0 = r12
        L_0x0096:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x00a9
            r6 = r3[r0]
            r6.m(r5)
            int r6 = r5.f10746e
            if (r6 < 0) goto L_0x0096
            r5.f10746e = r8
            r0 = r6
            goto L_0x0096
        L_0x00a9:
            int r3 = r5.a()
            int r6 = r5.a()
            r5.d(r6)
            hd.f r6 = r5.f10747f
            int r6 = r6.f10755b
            r7 = 254(0xfe, float:3.56E-43)
            if (r3 >= r6) goto L_0x00c5
            if (r0 == 0) goto L_0x00c5
            if (r0 == r9) goto L_0x00c5
            if (r0 == r11) goto L_0x00c5
            r5.e(r7)
        L_0x00c5:
            java.lang.StringBuilder r0 = r5.f10744c
            int r3 = r0.length()
            r8 = 129(0x81, float:1.81E-43)
            if (r3 >= r6) goto L_0x00d2
            r0.append(r8)
        L_0x00d2:
            int r3 = r0.length()
            if (r3 >= r6) goto L_0x00ed
            int r3 = r0.length()
            int r3 = r3 + r14
            int r3 = r3 * 149
            int r3 = r3 % 253
            int r3 = r3 + r14
            int r3 = r3 + r8
            if (r3 > r7) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            int r3 = r3 + -254
        L_0x00e8:
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x00d2
        L_0x00ed:
            java.lang.StringBuilder r0 = r5.f10744c
            java.lang.String r0 = r0.toString()
            int r3 = r0.length()
            hd.f r2 = hd.f.f(r3, r2, r4, r4)
            int[] r3 = hd.e.f10749a
            int r3 = r0.length()
            int r4 = r2.f10755b
            if (r3 != r4) goto L_0x0405
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r5 = r2.f10756c
            int r4 = r4 + r5
            r3.<init>(r4)
            r3.append(r0)
            int r4 = r2.c()
            if (r4 != r14) goto L_0x0120
            int r4 = r2.f10756c
            java.lang.String r0 = hd.e.a(r4, r0)
            r3.append(r0)
            goto L_0x0178
        L_0x0120:
            int r5 = r3.capacity()
            r3.setLength(r5)
            int[] r5 = new int[r4]
            int[] r6 = new int[r4]
            r7 = r12
        L_0x012c:
            if (r7 >= r4) goto L_0x013c
            int r8 = r7 + 1
            int r9 = r2.a(r8)
            r5[r7] = r9
            int r9 = r2.f10761h
            r6[r7] = r9
            r7 = r8
            goto L_0x012c
        L_0x013c:
            r7 = r12
        L_0x013d:
            if (r7 >= r4) goto L_0x0178
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = r5[r7]
            r8.<init>(r9)
            r9 = r7
        L_0x0147:
            int r11 = r2.f10755b
            if (r9 >= r11) goto L_0x0154
            char r11 = r0.charAt(r9)
            r8.append(r11)
            int r9 = r9 + r4
            goto L_0x0147
        L_0x0154:
            java.lang.String r8 = r8.toString()
            r9 = r6[r7]
            java.lang.String r8 = hd.e.a(r9, r8)
            r9 = r7
            r11 = r12
        L_0x0160:
            r15 = r6[r7]
            int r15 = r15 * r4
            if (r9 >= r15) goto L_0x0175
            int r15 = r2.f10755b
            int r15 = r15 + r9
            int r16 = r11 + 1
            char r11 = r8.charAt(r11)
            r3.setCharAt(r15, r11)
            int r9 = r9 + r4
            r11 = r16
            goto L_0x0160
        L_0x0175:
            int r7 = r7 + 1
            goto L_0x013d
        L_0x0178:
            java.lang.String r0 = r3.toString()
            hd.b r3 = new hd.b
            int r4 = r2.b()
            int r5 = r2.f10757d
            int r4 = r4 * r5
            int r5 = r2.e()
            int r6 = r2.f10758e
            int r5 = r5 * r6
            r3.<init>(r0, r4, r5)
            r0 = 4
            r4 = r12
            r5 = r4
        L_0x0192:
            int r6 = r3.f10739b
            r7 = 8
            if (r0 != r6) goto L_0x01d0
            if (r4 != 0) goto L_0x01d0
            int r8 = r5 + 1
            int r6 = r6 + -1
            r3.a(r6, r12, r5, r14)
            int r6 = r3.f10739b
            int r6 = r6 - r14
            r3.a(r6, r14, r5, r13)
            int r6 = r3.f10739b
            int r6 = r6 - r14
            r3.a(r6, r13, r5, r10)
            int r6 = r3.f10740c
            int r6 = r6 - r13
            r9 = 4
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 5
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 6
            r3.a(r14, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 7
            r3.a(r13, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r3.a(r10, r6, r5, r7)
            r5 = r8
        L_0x01d0:
            int r6 = r3.f10739b
            int r8 = r6 + -2
            if (r0 != r8) goto L_0x0214
            if (r4 != 0) goto L_0x0214
            int r8 = r3.f10740c
            int r8 = r8 % 4
            if (r8 == 0) goto L_0x0214
            int r8 = r5 + 1
            int r6 = r6 + -3
            r3.a(r6, r12, r5, r14)
            int r6 = r3.f10739b
            int r6 = r6 - r13
            r3.a(r6, r12, r5, r13)
            int r6 = r3.f10739b
            int r6 = r6 - r14
            r3.a(r6, r12, r5, r10)
            int r6 = r3.f10740c
            r9 = 4
            int r6 = r6 - r9
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r10
            r9 = 5
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r13
            r9 = 6
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 7
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r3.a(r14, r6, r5, r7)
            r5 = r8
        L_0x0214:
            int r6 = r3.f10739b
            int r8 = r6 + -2
            if (r0 != r8) goto L_0x0258
            if (r4 != 0) goto L_0x0258
            int r8 = r3.f10740c
            int r8 = r8 % r7
            r9 = 4
            if (r8 != r9) goto L_0x0258
            int r8 = r5 + 1
            int r6 = r6 + -3
            r3.a(r6, r12, r5, r14)
            int r6 = r3.f10739b
            int r6 = r6 - r13
            r3.a(r6, r12, r5, r13)
            int r6 = r3.f10739b
            int r6 = r6 - r14
            r3.a(r6, r12, r5, r10)
            int r6 = r3.f10740c
            int r6 = r6 - r13
            r9 = 4
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 5
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 6
            r3.a(r14, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 7
            r3.a(r13, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r3.a(r10, r6, r5, r7)
            r5 = r8
        L_0x0258:
            int r6 = r3.f10739b
            int r8 = r6 + 4
            if (r0 != r8) goto L_0x029e
            if (r4 != r13) goto L_0x029e
            int r8 = r3.f10740c
            int r8 = r8 % r7
            if (r8 != 0) goto L_0x029e
            int r8 = r5 + 1
            int r6 = r6 + -1
            r3.a(r6, r12, r5, r14)
            int r6 = r3.f10739b
            int r6 = r6 - r14
            int r9 = r3.f10740c
            int r9 = r9 - r14
            r3.a(r6, r9, r5, r13)
            int r6 = r3.f10740c
            int r6 = r6 - r10
            r3.a(r12, r6, r5, r10)
            int r6 = r3.f10740c
            int r6 = r6 - r13
            r9 = 4
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r9 = 5
            r3.a(r12, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r10
            r9 = 6
            r3.a(r14, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r13
            r9 = 7
            r3.a(r14, r6, r5, r9)
            int r6 = r3.f10740c
            int r6 = r6 - r14
            r3.a(r14, r6, r5, r7)
            r5 = r8
        L_0x029e:
            int r6 = r3.f10739b
            if (r0 >= r6) goto L_0x02b9
            if (r4 < 0) goto L_0x02b9
            byte[] r6 = r3.f10741d
            int r7 = r3.f10740c
            int r7 = r7 * r0
            int r7 = r7 + r4
            byte r6 = r6[r7]
            if (r6 >= 0) goto L_0x02b0
            r6 = r14
            goto L_0x02b1
        L_0x02b0:
            r6 = r12
        L_0x02b1:
            if (r6 == 0) goto L_0x02b9
            int r6 = r5 + 1
            r3.b(r0, r4, r5)
            r5 = r6
        L_0x02b9:
            int r0 = r0 + -2
            int r4 = r4 + 2
            if (r0 < 0) goto L_0x02c3
            int r6 = r3.f10740c
            if (r4 < r6) goto L_0x029e
        L_0x02c3:
            int r0 = r0 + 1
            int r4 = r4 + 3
        L_0x02c7:
            if (r0 < 0) goto L_0x02e0
            int r6 = r3.f10740c
            if (r4 >= r6) goto L_0x02e0
            byte[] r7 = r3.f10741d
            int r6 = r6 * r0
            int r6 = r6 + r4
            byte r6 = r7[r6]
            if (r6 >= 0) goto L_0x02d7
            r6 = r14
            goto L_0x02d8
        L_0x02d7:
            r6 = r12
        L_0x02d8:
            if (r6 == 0) goto L_0x02e0
            int r6 = r5 + 1
            r3.b(r0, r4, r5)
            r5 = r6
        L_0x02e0:
            int r0 = r0 + 2
            int r4 = r4 + -2
            int r6 = r3.f10739b
            if (r0 >= r6) goto L_0x02ea
            if (r4 >= 0) goto L_0x02c7
        L_0x02ea:
            int r0 = r0 + 3
            int r4 = r4 + 1
            if (r0 < r6) goto L_0x0192
            int r7 = r3.f10740c
            if (r4 < r7) goto L_0x0192
            int r0 = r7 + -1
            int r4 = r6 + -1
            byte[] r5 = r3.f10741d
            int r4 = r4 * r7
            int r4 = r4 + r0
            byte r0 = r5[r4]
            if (r0 >= 0) goto L_0x0302
            r0 = r14
            goto L_0x0303
        L_0x0302:
            r0 = r12
        L_0x0303:
            if (r0 == 0) goto L_0x0316
            int r0 = r7 + -1
            int r4 = r6 + -1
            int r4 = r4 * r7
            int r4 = r4 + r0
            byte r0 = (byte) r14
            r5[r4] = r0
            int r0 = r7 + -2
            int r6 = r6 - r13
            int r6 = r6 * r7
            int r6 = r6 + r0
            byte r0 = (byte) r14
            r5[r6] = r0
        L_0x0316:
            int r0 = r2.b()
            int r4 = r2.f10757d
            int r0 = r0 * r4
            int r4 = r2.e()
            int r5 = r2.f10758e
            int r4 = r4 * r5
            wd.b r5 = new wd.b
            int r6 = r2.d()
            int r7 = r2.e()
            int r8 = r2.f10758e
            int r7 = r7 * r8
            int r8 = r2.e()
            int r8 = r8 << r14
            int r7 = r7 + r8
            r5.<init>(r6, r7)
            r6 = r12
            r7 = r6
        L_0x033c:
            if (r6 >= r4) goto L_0x03af
            int r8 = r2.f10758e
            int r8 = r6 % r8
            if (r8 != 0) goto L_0x035c
            r8 = r12
            r9 = r8
        L_0x0346:
            int r10 = r2.d()
            if (r8 >= r10) goto L_0x035a
            int r10 = r8 % 2
            if (r10 != 0) goto L_0x0352
            r10 = r14
            goto L_0x0353
        L_0x0352:
            r10 = r12
        L_0x0353:
            r5.c(r10, r9, r7)
            int r9 = r9 + r14
            int r8 = r8 + 1
            goto L_0x0346
        L_0x035a:
            int r7 = r7 + 1
        L_0x035c:
            r8 = r12
            r9 = r8
        L_0x035e:
            if (r8 >= r0) goto L_0x0392
            int r10 = r2.f10757d
            int r10 = r8 % r10
            if (r10 != 0) goto L_0x036b
            r5.c(r14, r9, r7)
            int r9 = r9 + 1
        L_0x036b:
            byte[] r10 = r3.f10741d
            int r11 = r3.f10740c
            int r11 = r11 * r6
            int r11 = r11 + r8
            byte r10 = r10[r11]
            if (r10 != r14) goto L_0x0377
            r10 = r14
            goto L_0x0378
        L_0x0377:
            r10 = r12
        L_0x0378:
            r5.c(r10, r9, r7)
            int r9 = r9 + r14
            int r10 = r2.f10757d
            int r11 = r8 % r10
            int r10 = r10 - r14
            if (r11 != r10) goto L_0x038f
            int r10 = r6 % 2
            if (r10 != 0) goto L_0x0389
            r10 = r14
            goto L_0x038a
        L_0x0389:
            r10 = r12
        L_0x038a:
            r5.c(r10, r9, r7)
            int r9 = r9 + 1
        L_0x038f:
            int r8 = r8 + 1
            goto L_0x035e
        L_0x0392:
            int r7 = r7 + 1
            int r8 = r2.f10758e
            int r9 = r6 % r8
            int r8 = r8 - r14
            if (r9 != r8) goto L_0x03ac
            r8 = r12
            r9 = r8
        L_0x039d:
            int r10 = r2.d()
            if (r8 >= r10) goto L_0x03aa
            r5.c(r14, r9, r7)
            int r9 = r9 + r14
            int r8 = r8 + 1
            goto L_0x039d
        L_0x03aa:
            int r7 = r7 + 1
        L_0x03ac:
            int r6 = r6 + 1
            goto L_0x033c
        L_0x03af:
            int r0 = r5.f16799b
            int r2 = r5.f16800c
            r3 = 500(0x1f4, float:7.0E-43)
            int r4 = java.lang.Math.max(r3, r0)
            int r6 = java.lang.Math.max(r3, r2)
            int r7 = r4 / r0
            int r8 = r6 / r2
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0 * r7
            int r4 = r4 - r8
            int r4 = r4 / r13
            int r8 = r2 * r7
            int r6 = r6 - r8
            int r6 = r6 / r13
            if (r3 < r2) goto L_0x03d8
            if (r3 >= r0) goto L_0x03d2
            goto L_0x03d8
        L_0x03d2:
            cd.b r8 = new cd.b
            r8.<init>(r3, r3)
            goto L_0x03df
        L_0x03d8:
            cd.b r8 = new cd.b
            r8.<init>(r0, r2)
            r4 = r12
            r6 = r4
        L_0x03df:
            int[] r3 = r8.f4692d
            int r3 = r3.length
            r9 = r12
        L_0x03e3:
            if (r9 >= r3) goto L_0x03ec
            int[] r10 = r8.f4692d
            r10[r9] = r12
            int r9 = r9 + 1
            goto L_0x03e3
        L_0x03ec:
            r3 = r12
        L_0x03ed:
            if (r3 >= r2) goto L_0x0404
            r10 = r4
            r9 = r12
        L_0x03f1:
            if (r9 >= r0) goto L_0x0400
            byte r11 = r5.a(r9, r3)
            if (r11 != r14) goto L_0x03fc
            r8.j(r10, r6, r7, r7)
        L_0x03fc:
            int r9 = r9 + 1
            int r10 = r10 + r7
            goto L_0x03f1
        L_0x0400:
            int r3 = r3 + 1
            int r6 = r6 + r7
            goto L_0x03ed
        L_0x0404:
            return r8
        L_0x0405:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The number of codewords does not match the selected symbol"
            r0.<init>(r2)
            throw r0
        L_0x040d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.String r3 = "Can only encode DATA_MATRIX, but got "
            java.lang.String r2 = r3.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x041d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Found empty contents"
            r0.<init>(r2)
            throw r0
        L_0x0425:
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.ISO_8859_1
            r4 = 33
            uc.a r7 = uc.a.AZTEC
            if (r2 != r7) goto L_0x07d4
            byte[] r0 = r0.getBytes(r3)
            yc.c r2 = new yc.c
            r2.<init>(r0)
            yc.e r0 = yc.e.f17654e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3 = r12
        L_0x043d:
            byte[] r7 = r2.f17651a
            int r8 = r7.length
            r9 = 32
            if (r12 >= r8) goto L_0x054b
            int r8 = r12 + 1
            int r11 = r7.length
            if (r8 >= r11) goto L_0x044b
            byte r3 = r7[r8]
        L_0x044b:
            byte r7 = r7[r12]
            r11 = 13
            if (r7 == r11) goto L_0x046a
            r5 = 44
            if (r7 == r5) goto L_0x0466
            r5 = 46
            if (r7 == r5) goto L_0x0462
            r5 = 58
            if (r7 == r5) goto L_0x045e
            goto L_0x046e
        L_0x045e:
            if (r3 != r9) goto L_0x046e
            r3 = 5
            goto L_0x046f
        L_0x0462:
            if (r3 != r9) goto L_0x046e
            r3 = r10
            goto L_0x046f
        L_0x0466:
            if (r3 != r9) goto L_0x046e
            r3 = 4
            goto L_0x046f
        L_0x046a:
            if (r3 != r5) goto L_0x046e
            r3 = r13
            goto L_0x046f
        L_0x046e:
            r3 = 0
        L_0x046f:
            if (r3 <= 0) goto L_0x04c5
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x047a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x04be
            java.lang.Object r7 = r0.next()
            yc.e r7 = (yc.e) r7
            yc.e r9 = r7.b(r12)
            r11 = 4
            yc.e r15 = r9.d(r11, r3)
            r5.add(r15)
            int r15 = r7.f17655a
            if (r15 == r11) goto L_0x049d
            yc.e r15 = r9.e(r11, r3)
            r5.add(r15)
        L_0x049d:
            if (r3 == r10) goto L_0x04a1
            if (r3 != r11) goto L_0x04ae
        L_0x04a1:
            int r11 = 16 - r3
            yc.e r9 = r9.d(r13, r11)
            yc.e r9 = r9.d(r13, r14)
            r5.add(r9)
        L_0x04ae:
            int r9 = r7.f17657c
            if (r9 <= 0) goto L_0x047a
            yc.e r7 = r7.a(r12)
            yc.e r7 = r7.a(r8)
            r5.add(r7)
            goto L_0x047a
        L_0x04be:
            java.util.LinkedList r0 = yc.c.a(r5)
            r12 = r8
            goto L_0x0543
        L_0x04c5:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x04ce:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x053f
            java.lang.Object r5 = r0.next()
            yc.e r5 = (yc.e) r5
            byte[] r7 = r2.f17651a
            byte r7 = r7[r12]
            r7 = r7 & 255(0xff, float:3.57E-43)
            char r7 = (char) r7
            int[][] r8 = yc.c.f17649d
            int r9 = r5.f17655a
            r8 = r8[r9]
            r8 = r8[r7]
            if (r8 <= 0) goto L_0x04ed
            r8 = r14
            goto L_0x04ee
        L_0x04ed:
            r8 = 0
        L_0x04ee:
            r9 = 0
            r10 = 0
            r11 = 4
        L_0x04f1:
            if (r9 > r11) goto L_0x0528
            int[][] r11 = yc.c.f17649d
            r11 = r11[r9]
            r11 = r11[r7]
            if (r11 <= 0) goto L_0x0523
            if (r10 != 0) goto L_0x0501
            yc.e r10 = r5.b(r12)
        L_0x0501:
            if (r8 == 0) goto L_0x0509
            int r15 = r5.f17655a
            if (r9 == r15) goto L_0x0509
            if (r9 != r13) goto L_0x0510
        L_0x0509:
            yc.e r13 = r10.d(r9, r11)
            r3.add(r13)
        L_0x0510:
            if (r8 != 0) goto L_0x0523
            int[][] r13 = yc.c.f17650e
            int r15 = r5.f17655a
            r13 = r13[r15]
            r13 = r13[r9]
            if (r13 < 0) goto L_0x0523
            yc.e r11 = r10.e(r9, r11)
            r3.add(r11)
        L_0x0523:
            int r9 = r9 + 1
            r11 = 4
            r13 = 2
            goto L_0x04f1
        L_0x0528:
            int r8 = r5.f17657c
            if (r8 > 0) goto L_0x0536
            int[][] r8 = yc.c.f17649d
            int r9 = r5.f17655a
            r8 = r8[r9]
            r7 = r8[r7]
            if (r7 != 0) goto L_0x053d
        L_0x0536:
            yc.e r5 = r5.a(r12)
            r3.add(r5)
        L_0x053d:
            r13 = 2
            goto L_0x04ce
        L_0x053f:
            java.util.LinkedList r0 = yc.c.a(r3)
        L_0x0543:
            int r12 = r12 + r14
            r5 = 10
            r10 = 3
            r3 = 0
            r13 = 2
            goto L_0x043d
        L_0x054b:
            yc.b r3 = new yc.b
            r3.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r3)
            yc.e r0 = (yc.e) r0
            byte[] r2 = r2.f17651a
            r0.getClass()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            int r5 = r2.length
            yc.e r0 = r0.b(r5)
            yc.f r0 = r0.f17656b
        L_0x0567:
            if (r0 == 0) goto L_0x056f
            r3.addFirst(r0)
            yc.f r0 = r0.f17660a
            goto L_0x0567
        L_0x056f:
            cd.a r0 = new cd.a
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0578:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0588
            java.lang.Object r5 = r3.next()
            yc.f r5 = (yc.f) r5
            r5.a(r0, r2)
            goto L_0x0578
        L_0x0588:
            int r2 = r0.f4688b
            r3 = 100
            int r3 = f0.b0.o(r4, r2, r3, r6)
            int r2 = r2 + r3
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x0594:
            if (r4 > r9) goto L_0x07cc
            r8 = 3
            if (r4 > r8) goto L_0x059b
            r8 = r14
            goto L_0x059c
        L_0x059b:
            r8 = 0
        L_0x059c:
            if (r8 == 0) goto L_0x05a1
            int r10 = r4 + 1
            goto L_0x05a2
        L_0x05a1:
            r10 = r4
        L_0x05a2:
            if (r8 == 0) goto L_0x05a7
            r11 = 88
            goto L_0x05a9
        L_0x05a7:
            r11 = 112(0x70, float:1.57E-43)
        L_0x05a9:
            int r12 = r10 << 4
            int r11 = r11 + r12
            int r11 = r11 * r10
            if (r2 > r11) goto L_0x07c6
            if (r5 == 0) goto L_0x05b7
            int[] r12 = p3.l0.D
            r12 = r12[r10]
            if (r7 == r12) goto L_0x05bf
        L_0x05b7:
            int[] r5 = p3.l0.D
            r7 = r5[r10]
            cd.a r5 = p3.l0.L0(r7, r0)
        L_0x05bf:
            int r12 = r11 % r7
            int r12 = r11 - r12
            if (r8 == 0) goto L_0x05cb
            int r13 = r5.f4688b
            int r15 = r7 << 6
            if (r13 > r15) goto L_0x07c6
        L_0x05cb:
            int r13 = r5.f4688b
            int r13 = r13 + r3
            if (r13 <= r12) goto L_0x05d2
            goto L_0x07c6
        L_0x05d2:
            cd.a r0 = p3.l0.W(r11, r7, r5)
            int r2 = r5.f4688b
            int r2 = r2 / r7
            cd.a r3 = new cd.a
            r3.<init>()
            if (r8 == 0) goto L_0x05f4
            int r4 = r10 + -1
            r5 = 2
            r3.b(r4, r5)
            int r2 = r2 + -1
            r4 = 6
            r3.b(r2, r4)
            r2 = 28
            r4 = 4
            cd.a r2 = p3.l0.W(r2, r4, r3)
            goto L_0x0606
        L_0x05f4:
            r4 = 4
            int r5 = r10 + -1
            r7 = 5
            r3.b(r5, r7)
            int r2 = r2 + -1
            r3.b(r2, r6)
            r2 = 40
            cd.a r2 = p3.l0.W(r2, r4, r3)
        L_0x0606:
            if (r8 == 0) goto L_0x0609
            goto L_0x060b
        L_0x0609:
            r6 = 14
        L_0x060b:
            int r3 = r10 << 2
            int r6 = r6 + r3
            int[] r3 = new int[r6]
            if (r8 == 0) goto L_0x061c
            r4 = 0
        L_0x0613:
            if (r4 >= r6) goto L_0x061a
            r3[r4] = r4
            int r4 = r4 + 1
            goto L_0x0613
        L_0x061a:
            r7 = r6
            goto L_0x0641
        L_0x061c:
            int r4 = r6 + 1
            int r5 = r6 / 2
            int r7 = r5 + -1
            int r7 = r7 / 15
            int r7 = r7 * 2
            int r7 = r7 + r4
            int r4 = r7 / 2
            r9 = 0
        L_0x062a:
            if (r9 >= r5) goto L_0x0641
            int r11 = r9 / 15
            int r11 = r11 + r9
            int r12 = r5 - r9
            int r12 = r12 - r14
            int r13 = r4 - r11
            int r13 = r13 + -1
            r3[r12] = r13
            int r12 = r5 + r9
            int r11 = r11 + r4
            int r11 = r11 + r14
            r3[r12] = r11
            int r9 = r9 + 1
            goto L_0x062a
        L_0x0641:
            cd.b r4 = new cd.b
            r4.<init>(r7, r7)
            r5 = 0
            r9 = 0
        L_0x0648:
            if (r5 >= r10) goto L_0x06d7
            int r11 = r10 - r5
            int r11 = r11 << 2
            if (r8 == 0) goto L_0x0653
            r12 = 9
            goto L_0x0655
        L_0x0653:
            r12 = 12
        L_0x0655:
            int r11 = r11 + r12
            r12 = 0
        L_0x0657:
            if (r12 >= r11) goto L_0x06ce
            int r13 = r12 << 1
            r14 = 2
            r15 = 0
        L_0x065d:
            if (r15 >= r14) goto L_0x06c9
            int r14 = r9 + r13
            int r14 = r14 + r15
            boolean r14 = r0.e(r14)
            if (r14 == 0) goto L_0x0674
            int r14 = r5 << 1
            int r16 = r14 + r15
            r1 = r3[r16]
            int r14 = r14 + r12
            r14 = r3[r14]
            r4.g(r1, r14)
        L_0x0674:
            int r1 = r11 << 1
            int r1 = r1 + r9
            int r1 = r1 + r13
            int r1 = r1 + r15
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x0690
            int r1 = r5 << 1
            int r14 = r1 + r12
            r14 = r3[r14]
            int r16 = r6 + -1
            int r16 = r16 - r1
            int r16 = r16 - r15
            r1 = r3[r16]
            r4.g(r14, r1)
        L_0x0690:
            int r1 = r11 << 2
            int r1 = r1 + r9
            int r1 = r1 + r13
            int r1 = r1 + r15
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x06aa
            int r1 = r6 + -1
            int r14 = r5 << 1
            int r1 = r1 - r14
            int r14 = r1 - r15
            r14 = r3[r14]
            int r1 = r1 - r12
            r1 = r3[r1]
            r4.g(r14, r1)
        L_0x06aa:
            int r1 = r11 * 6
            int r1 = r1 + r9
            int r1 = r1 + r13
            int r1 = r1 + r15
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x06c3
            int r1 = r6 + -1
            int r14 = r5 << 1
            int r1 = r1 - r14
            int r1 = r1 - r12
            r1 = r3[r1]
            int r14 = r14 + r15
            r14 = r3[r14]
            r4.g(r1, r14)
        L_0x06c3:
            int r15 = r15 + 1
            r14 = 2
            r1 = r17
            goto L_0x065d
        L_0x06c9:
            int r12 = r12 + 1
            r1 = r17
            goto L_0x0657
        L_0x06ce:
            int r1 = r11 << 3
            int r9 = r9 + r1
            int r5 = r5 + 1
            r1 = r17
            goto L_0x0648
        L_0x06d7:
            int r0 = r7 / 2
            if (r8 == 0) goto L_0x0717
            r1 = 0
        L_0x06dc:
            r3 = 7
            if (r1 >= r3) goto L_0x0757
            int r3 = r0 + -3
            int r3 = r3 + r1
            boolean r5 = r2.e(r1)
            if (r5 == 0) goto L_0x06ed
            int r5 = r0 + -5
            r4.g(r3, r5)
        L_0x06ed:
            int r5 = r1 + 7
            boolean r5 = r2.e(r5)
            if (r5 == 0) goto L_0x06fa
            int r5 = r0 + 5
            r4.g(r5, r3)
        L_0x06fa:
            int r5 = 20 - r1
            boolean r5 = r2.e(r5)
            if (r5 == 0) goto L_0x0707
            int r5 = r0 + 5
            r4.g(r3, r5)
        L_0x0707:
            int r5 = 27 - r1
            boolean r5 = r2.e(r5)
            if (r5 == 0) goto L_0x0714
            int r5 = r0 + -5
            r4.g(r5, r3)
        L_0x0714:
            int r1 = r1 + 1
            goto L_0x06dc
        L_0x0717:
            r1 = 0
            r3 = 10
        L_0x071a:
            if (r1 >= r3) goto L_0x0757
            int r5 = r0 + -5
            int r5 = r5 + r1
            int r9 = r1 / 5
            int r9 = r9 + r5
            boolean r5 = r2.e(r1)
            if (r5 == 0) goto L_0x072d
            int r5 = r0 + -7
            r4.g(r9, r5)
        L_0x072d:
            int r5 = r1 + 10
            boolean r5 = r2.e(r5)
            if (r5 == 0) goto L_0x073a
            int r5 = r0 + 7
            r4.g(r5, r9)
        L_0x073a:
            int r5 = 29 - r1
            boolean r5 = r2.e(r5)
            if (r5 == 0) goto L_0x0747
            int r5 = r0 + 7
            r4.g(r9, r5)
        L_0x0747:
            int r5 = 39 - r1
            boolean r5 = r2.e(r5)
            if (r5 == 0) goto L_0x0754
            int r5 = r0 + -7
            r4.g(r5, r9)
        L_0x0754:
            int r1 = r1 + 1
            goto L_0x071a
        L_0x0757:
            if (r8 == 0) goto L_0x075e
            r1 = 5
            p3.l0.F(r4, r0, r1)
            goto L_0x0786
        L_0x075e:
            r1 = 7
            p3.l0.F(r4, r0, r1)
            r1 = 0
            r2 = 0
        L_0x0764:
            int r3 = r6 / 2
            int r3 = r3 + -1
            if (r1 >= r3) goto L_0x0786
            r3 = r0 & 1
        L_0x076c:
            if (r3 >= r7) goto L_0x0781
            int r5 = r0 - r2
            r4.g(r5, r3)
            int r8 = r0 + r2
            r4.g(r8, r3)
            r4.g(r3, r5)
            r4.g(r3, r8)
            int r3 = r3 + 2
            goto L_0x076c
        L_0x0781:
            int r1 = r1 + 15
            int r2 = r2 + 16
            goto L_0x0764
        L_0x0786:
            int r0 = r4.f4689a
            int r1 = r4.f4690b
            r2 = 500(0x1f4, float:7.0E-43)
            int r3 = java.lang.Math.max(r2, r0)
            int r2 = java.lang.Math.max(r2, r1)
            int r5 = r3 / r0
            int r6 = r2 / r1
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r0 * r5
            int r6 = r3 - r6
            int r6 = r6 / 2
            int r7 = r1 * r5
            int r7 = r2 - r7
            int r7 = r7 / 2
            cd.b r8 = new cd.b
            r8.<init>(r3, r2)
            r2 = 0
        L_0x07ae:
            if (r2 >= r1) goto L_0x07c5
            r3 = 0
            r9 = r6
        L_0x07b2:
            if (r3 >= r0) goto L_0x07c1
            boolean r10 = r4.b(r3, r2)
            if (r10 == 0) goto L_0x07bd
            r8.j(r9, r7, r5, r5)
        L_0x07bd:
            int r3 = r3 + 1
            int r9 = r9 + r5
            goto L_0x07b2
        L_0x07c1:
            int r2 = r2 + 1
            int r7 = r7 + r5
            goto L_0x07ae
        L_0x07c5:
            return r8
        L_0x07c6:
            int r4 = r4 + 1
            r1 = r17
            goto L_0x0594
        L_0x07cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
        L_0x07d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r19)
            java.lang.String r2 = "Can only encode AZTEC, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.b.e(java.lang.String, uc.a):cd.b");
    }

    public void g(float f10, float f11, p pVar) {
        throw null;
    }

    public int h() {
        switch (this.f12903a) {
            case 10:
                return 1;
            default:
                return 4;
        }
    }

    public final boolean i(Object obj, File file, h hVar) {
        try {
            a.c(((f5.c) ((u) obj).get()).f9925a.f9935a.f9937a.a().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }

    public void j(d dVar, StringBuilder sb2) {
        int length = sb2.length() % 3;
        int a10 = dVar.a() + ((sb2.length() / 3) << 1);
        dVar.d(a10);
        int i10 = dVar.f10747f.f10755b - a10;
        if (length == 2) {
            sb2.append(0);
            while (sb2.length() >= 3) {
                l(dVar, sb2);
            }
            if (dVar.c()) {
                dVar.e(254);
            }
        } else if (i10 == 1 && length == 1) {
            while (sb2.length() >= 3) {
                l(dVar, sb2);
            }
            if (dVar.c()) {
                dVar.e(254);
            }
            dVar.f10745d--;
        } else if (length == 0) {
            while (sb2.length() >= 3) {
                l(dVar, sb2);
            }
            if (i10 > 0 || dVar.c()) {
                dVar.e(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        dVar.f10746e = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(hd.d r12) {
        /*
            r11 = this;
            int r0 = r11.f12903a
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case 10: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x00a8
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0011:
            boolean r6 = r12.c()
            if (r6 == 0) goto L_0x00a4
            char r6 = r12.b()
            int r7 = r12.f10745d
            int r7 = r7 + r5
            r12.f10745d = r7
            int r6 = r11.c(r6, r0)
            int r7 = r0.length()
            int r7 = r7 / r4
            int r7 = r7 << r5
            int r8 = r12.a()
            int r8 = r8 + r7
            r12.d(r8)
            hd.f r7 = r12.f10747f
            int r7 = r7.f10755b
            int r7 = r7 - r8
            boolean r8 = r12.c()
            if (r8 != 0) goto L_0x0089
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r8 = r0.length()
            int r8 = r8 % r4
            if (r8 != r3) goto L_0x0064
            if (r7 == r3) goto L_0x0064
            int r3 = r0.length()
            int r6 = r3 - r6
            r0.delete(r6, r3)
            int r3 = r12.f10745d
            int r3 = r3 + -1
            r12.f10745d = r3
            char r3 = r12.b()
            int r6 = r11.c(r3, r2)
            r12.f10747f = r1
        L_0x0064:
            int r3 = r0.length()
            int r3 = r3 % r4
            if (r3 != r5) goto L_0x00a4
            if (r6 > r4) goto L_0x006f
            if (r7 == r5) goto L_0x00a4
        L_0x006f:
            int r3 = r0.length()
            int r6 = r3 - r6
            r0.delete(r6, r3)
            int r3 = r12.f10745d
            int r3 = r3 + -1
            r12.f10745d = r3
            char r3 = r12.b()
            int r6 = r11.c(r3, r2)
            r12.f10747f = r1
            goto L_0x0064
        L_0x0089:
            int r6 = r0.length()
            int r6 = r6 % r4
            if (r6 != 0) goto L_0x0011
            java.lang.String r6 = r12.f10742a
            int r7 = r12.f10745d
            int r8 = r11.h()
            int r6 = m9.b.M(r6, r7, r8)
            int r7 = r11.h()
            if (r6 == r7) goto L_0x0011
            r12.f10746e = r2
        L_0x00a4:
            r11.j(r12, r0)
            return
        L_0x00a8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x00ad:
            boolean r6 = r12.c()
            r7 = 4
            if (r6 == 0) goto L_0x0102
            char r6 = r12.b()
            r8 = 32
            if (r6 < r8) goto L_0x00c4
            r8 = 63
            if (r6 > r8) goto L_0x00c4
            r0.append(r6)
            goto L_0x00d2
        L_0x00c4:
            r8 = 64
            if (r6 < r8) goto L_0x00fe
            r8 = 94
            if (r6 > r8) goto L_0x00fe
            int r6 = r6 + -64
            char r6 = (char) r6
            r0.append(r6)
        L_0x00d2:
            int r6 = r12.f10745d
            int r6 = r6 + r5
            r12.f10745d = r6
            int r6 = r0.length()
            if (r6 < r7) goto L_0x00ad
            java.lang.String r6 = f(r0)
            java.lang.StringBuilder r8 = r12.f10744c
            r8.append(r6)
            r0.delete(r2, r7)
            java.lang.String r6 = r12.f10742a
            int r8 = r12.f10745d
            int r9 = r11.h()
            int r6 = m9.b.M(r6, r8, r9)
            int r8 = r11.h()
            if (r6 == r8) goto L_0x00ad
            r12.f10746e = r2
            goto L_0x0102
        L_0x00fe:
            m9.b.E(r6)
            throw r1
        L_0x0102:
            r6 = 31
            r0.append(r6)
            int r6 = r0.length()     // Catch:{ all -> 0x0195 }
            if (r6 != 0) goto L_0x0111
            r12.f10746e = r2
            goto L_0x018c
        L_0x0111:
            if (r6 != r5) goto L_0x0147
            int r8 = r12.a()     // Catch:{ all -> 0x0195 }
            r12.d(r8)     // Catch:{ all -> 0x0195 }
            hd.f r8 = r12.f10747f     // Catch:{ all -> 0x0195 }
            int r8 = r8.f10755b     // Catch:{ all -> 0x0195 }
            int r9 = r12.a()     // Catch:{ all -> 0x0195 }
            int r8 = r8 - r9
            java.lang.String r9 = r12.f10742a     // Catch:{ all -> 0x0195 }
            int r9 = r9.length()     // Catch:{ all -> 0x0195 }
            int r10 = r12.f10748g     // Catch:{ all -> 0x0195 }
            int r9 = r9 - r10
            int r10 = r12.f10745d     // Catch:{ all -> 0x0195 }
            int r9 = r9 - r10
            if (r9 <= r8) goto L_0x0142
            int r8 = r12.a()     // Catch:{ all -> 0x0195 }
            int r8 = r8 + r5
            r12.d(r8)     // Catch:{ all -> 0x0195 }
            hd.f r8 = r12.f10747f     // Catch:{ all -> 0x0195 }
            int r8 = r8.f10755b     // Catch:{ all -> 0x0195 }
            int r10 = r12.a()     // Catch:{ all -> 0x0195 }
            int r8 = r8 - r10
        L_0x0142:
            if (r9 > r8) goto L_0x0147
            if (r8 > r3) goto L_0x0147
            goto L_0x018a
        L_0x0147:
            if (r6 > r7) goto L_0x018d
            int r6 = r6 - r5
            java.lang.String r0 = f(r0)     // Catch:{ all -> 0x0195 }
            boolean r7 = r12.c()     // Catch:{ all -> 0x0195 }
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x0158
            if (r6 > r3) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r5 = r2
        L_0x0159:
            if (r6 > r3) goto L_0x017b
            int r3 = r12.a()     // Catch:{ all -> 0x0195 }
            int r3 = r3 + r6
            r12.d(r3)     // Catch:{ all -> 0x0195 }
            hd.f r3 = r12.f10747f     // Catch:{ all -> 0x0195 }
            int r3 = r3.f10755b     // Catch:{ all -> 0x0195 }
            int r7 = r12.a()     // Catch:{ all -> 0x0195 }
            int r3 = r3 - r7
            if (r3 < r4) goto L_0x017b
            int r3 = r12.a()     // Catch:{ all -> 0x0195 }
            int r4 = r0.length()     // Catch:{ all -> 0x0195 }
            int r3 = r3 + r4
            r12.d(r3)     // Catch:{ all -> 0x0195 }
            r5 = r2
        L_0x017b:
            if (r5 == 0) goto L_0x0185
            r12.f10747f = r1     // Catch:{ all -> 0x0195 }
            int r0 = r12.f10745d     // Catch:{ all -> 0x0195 }
            int r0 = r0 - r6
            r12.f10745d = r0     // Catch:{ all -> 0x0195 }
            goto L_0x018a
        L_0x0185:
            java.lang.StringBuilder r1 = r12.f10744c     // Catch:{ all -> 0x0195 }
            r1.append(r0)     // Catch:{ all -> 0x0195 }
        L_0x018a:
            r12.f10746e = r2
        L_0x018c:
            return
        L_0x018d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0195 }
            java.lang.String r1 = "Count must not exceed 4"
            r0.<init>(r1)     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ all -> 0x0195 }
        L_0x0195:
            r0 = move-exception
            r12.f10746e = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.b.m(hd.d):void");
    }
}
