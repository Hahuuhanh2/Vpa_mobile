package kd;

import cd.a;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import uc.b;
import uc.h;
import x2.g;

/* compiled from: UPCEANReader */
public abstract class u extends q {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12506d = {1, 1, 1};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f12507e = {1, 1, 1, 1, 1};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f12508f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g  reason: collision with root package name */
    public static final int[][] f12509g;

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f12510h;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f12511a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final t f12512b = new t();

    /* renamed from: c  reason: collision with root package name */
    public final g f12513c = new g(7);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f12509g = iArr;
        int[][] iArr2 = new int[20][];
        f12510h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f12509g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f12510h[i10] = iArr4;
        }
    }

    public static boolean i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        if (q(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10)) {
            return true;
        }
        return false;
    }

    public static int j(a aVar, int[] iArr, int i10, int[][] iArr2) {
        q.f(i10, aVar, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float e10 = q.e(iArr, iArr2[i12], 0.7f);
            if (e10 < f10) {
                i11 = i12;
                f10 = e10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw NotFoundException.f7967c;
    }

    public static int[] n(a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) {
        int i11;
        int i12 = aVar.f4688b;
        if (z10) {
            i11 = aVar.g(i10);
        } else {
            i11 = aVar.f(i10);
        }
        int length = iArr.length;
        boolean z11 = z10;
        int i13 = 0;
        int i14 = i11;
        while (i11 < i12) {
            if (aVar.e(i11) != z11) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else if (q.e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i14, i11};
                } else {
                    i14 += iArr2[0] + iArr2[1];
                    int i15 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i15);
                    iArr2[i15] = 0;
                    iArr2[i13] = 0;
                    i13 = i15;
                }
                iArr2[i13] = 1;
                z11 = !z11;
            }
            i11++;
        }
        throw NotFoundException.f7967c;
    }

    public static int[] o(a aVar) {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f12506d;
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = n(aVar, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z10 = aVar.j(i13, i11);
            }
            i10 = i12;
        }
        return iArr2;
    }

    public static int q(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    public h c(int i10, a aVar, Map<b, ?> map) {
        return m(i10, aVar, o(aVar), map);
    }

    public boolean h(String str) {
        return i(str);
    }

    public int[] k(int i10, a aVar) {
        return n(aVar, i10, false, f12506d, new int[3]);
    }

    public abstract int l(a aVar, int[] iArr, StringBuilder sb2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uc.h m(int r12, cd.a r13, int[] r14, java.util.Map<uc.b, ?> r15) {
        /*
            r11 = this;
            r0 = 0
            if (r15 != 0) goto L_0x0005
            r1 = r0
            goto L_0x000d
        L_0x0005:
            uc.b r1 = uc.b.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r1 = r15.get(r1)
            uc.k r1 = (uc.k) r1
        L_0x000d:
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0023
            uc.j r5 = new uc.j
            r6 = r14[r3]
            r7 = r14[r4]
            int r6 = r6 + r7
            float r6 = (float) r6
            float r6 = r6 / r2
            float r7 = (float) r12
            r5.<init>(r6, r7)
            r1.a(r5)
        L_0x0023:
            java.lang.StringBuilder r5 = r11.f12511a
            r5.setLength(r3)
            int r6 = r11.l(r13, r14, r5)
            if (r1 == 0) goto L_0x0038
            uc.j r7 = new uc.j
            float r8 = (float) r6
            float r9 = (float) r12
            r7.<init>(r8, r9)
            r1.a(r7)
        L_0x0038:
            int[] r6 = r11.k(r6, r13)
            if (r1 == 0) goto L_0x004e
            uc.j r7 = new uc.j
            r8 = r6[r3]
            r9 = r6[r4]
            int r8 = r8 + r9
            float r8 = (float) r8
            float r8 = r8 / r2
            float r9 = (float) r12
            r7.<init>(r8, r9)
            r1.a(r7)
        L_0x004e:
            r1 = r6[r4]
            r7 = r6[r3]
            int r7 = r1 - r7
            int r7 = r7 + r1
            int r8 = r13.f4688b
            if (r7 >= r8) goto L_0x014f
            boolean r1 = r13.j(r1, r7)
            if (r1 == 0) goto L_0x014f
            java.lang.String r1 = r5.toString()
            int r5 = r1.length()
            r7 = 8
            if (r5 < r7) goto L_0x014a
            boolean r5 = r11.h(r1)
            if (r5 == 0) goto L_0x0145
            r5 = r14[r4]
            r14 = r14[r3]
            int r5 = r5 + r14
            float r14 = (float) r5
            float r14 = r14 / r2
            r5 = r6[r4]
            r7 = r6[r3]
            int r5 = r5 + r7
            float r5 = (float) r5
            float r5 = r5 / r2
            uc.a r2 = r11.p()
            uc.h r7 = new uc.h
            r8 = 2
            uc.j[] r8 = new uc.j[r8]
            uc.j r9 = new uc.j
            float r10 = (float) r12
            r9.<init>(r14, r10)
            r8[r3] = r9
            uc.j r14 = new uc.j
            r14.<init>(r5, r10)
            r8[r4] = r14
            r7.<init>(r1, r0, r8, r2)
            kd.t r14 = r11.f12512b     // Catch:{ ReaderException -> 0x00d3 }
            r5 = r6[r4]     // Catch:{ ReaderException -> 0x00d3 }
            uc.h r12 = r14.a(r12, r5, r13)     // Catch:{ ReaderException -> 0x00d3 }
            uc.i r13 = uc.i.UPC_EAN_EXTENSION     // Catch:{ ReaderException -> 0x00d3 }
            java.lang.String r14 = r12.f15472a     // Catch:{ ReaderException -> 0x00d3 }
            r7.b(r13, r14)     // Catch:{ ReaderException -> 0x00d3 }
            java.util.Map<uc.i, java.lang.Object> r13 = r12.f15476e     // Catch:{ ReaderException -> 0x00d3 }
            r7.a(r13)     // Catch:{ ReaderException -> 0x00d3 }
            uc.j[] r13 = r12.f15474c     // Catch:{ ReaderException -> 0x00d3 }
            uc.j[] r14 = r7.f15474c     // Catch:{ ReaderException -> 0x00d3 }
            if (r14 != 0) goto L_0x00b7
            r7.f15474c = r13     // Catch:{ ReaderException -> 0x00d3 }
            goto L_0x00cc
        L_0x00b7:
            if (r13 == 0) goto L_0x00cc
            int r5 = r13.length     // Catch:{ ReaderException -> 0x00d3 }
            if (r5 <= 0) goto L_0x00cc
            int r5 = r14.length     // Catch:{ ReaderException -> 0x00d3 }
            int r6 = r13.length     // Catch:{ ReaderException -> 0x00d3 }
            int r5 = r5 + r6
            uc.j[] r5 = new uc.j[r5]     // Catch:{ ReaderException -> 0x00d3 }
            int r6 = r14.length     // Catch:{ ReaderException -> 0x00d3 }
            java.lang.System.arraycopy(r14, r3, r5, r3, r6)     // Catch:{ ReaderException -> 0x00d3 }
            int r14 = r14.length     // Catch:{ ReaderException -> 0x00d3 }
            int r6 = r13.length     // Catch:{ ReaderException -> 0x00d3 }
            java.lang.System.arraycopy(r13, r3, r5, r14, r6)     // Catch:{ ReaderException -> 0x00d3 }
            r7.f15474c = r5     // Catch:{ ReaderException -> 0x00d3 }
        L_0x00cc:
            java.lang.String r12 = r12.f15472a     // Catch:{ ReaderException -> 0x00d3 }
            int r12 = r12.length()     // Catch:{ ReaderException -> 0x00d3 }
            goto L_0x00d4
        L_0x00d3:
            r12 = r3
        L_0x00d4:
            if (r15 != 0) goto L_0x00d8
            r13 = r0
            goto L_0x00e0
        L_0x00d8:
            uc.b r13 = uc.b.ALLOWED_EAN_EXTENSIONS
            java.lang.Object r13 = r15.get(r13)
            int[] r13 = (int[]) r13
        L_0x00e0:
            if (r13 == 0) goto L_0x00f6
            int r14 = r13.length
            r15 = r3
        L_0x00e4:
            if (r15 >= r14) goto L_0x00ef
            r5 = r13[r15]
            if (r12 != r5) goto L_0x00ec
            r12 = r4
            goto L_0x00f0
        L_0x00ec:
            int r15 = r15 + 1
            goto L_0x00e4
        L_0x00ef:
            r12 = r3
        L_0x00f0:
            if (r12 == 0) goto L_0x00f3
            goto L_0x00f6
        L_0x00f3:
            com.google.zxing.NotFoundException r12 = com.google.zxing.NotFoundException.f7967c
            throw r12
        L_0x00f6:
            uc.a r12 = uc.a.EAN_13
            if (r2 == r12) goto L_0x00fe
            uc.a r12 = uc.a.UPC_A
            if (r2 != r12) goto L_0x0144
        L_0x00fe:
            x2.g r12 = r11.f12513c
            r12.e()
            r13 = 3
            java.lang.String r13 = r1.substring(r3, r13)
            int r13 = java.lang.Integer.parseInt(r13)
            java.lang.Object r14 = r12.f16904b
            java.util.List r14 = (java.util.List) r14
            int r14 = r14.size()
            r15 = r3
        L_0x0115:
            if (r15 >= r14) goto L_0x013d
            java.lang.Object r1 = r12.f16904b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r15)
            int[] r1 = (int[]) r1
            r2 = r1[r3]
            if (r13 >= r2) goto L_0x0126
            goto L_0x013d
        L_0x0126:
            int r5 = r1.length
            if (r5 != r4) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r2 = r1[r4]
        L_0x012c:
            if (r13 > r2) goto L_0x013a
            java.lang.Object r12 = r12.f16905c
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r12.get(r15)
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x013d
        L_0x013a:
            int r15 = r15 + 1
            goto L_0x0115
        L_0x013d:
            if (r0 == 0) goto L_0x0144
            uc.i r12 = uc.i.POSSIBLE_COUNTRY
            r7.b(r12, r0)
        L_0x0144:
            return r7
        L_0x0145:
            com.google.zxing.ChecksumException r12 = com.google.zxing.ChecksumException.a()
            throw r12
        L_0x014a:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.a()
            throw r12
        L_0x014f:
            com.google.zxing.NotFoundException r12 = com.google.zxing.NotFoundException.f7967c
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.u.m(int, cd.a, int[], java.util.Map):uc.h");
    }

    public abstract uc.a p();
}
