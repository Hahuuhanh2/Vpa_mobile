package kd;

import cd.a;
import com.google.zxing.NotFoundException;

/* compiled from: ITFReader */
public final class m extends q {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12487b = {6, 8, 10, 12, 14};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12488c = {1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f12489d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e  reason: collision with root package name */
    public static final int[][] f12490e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a  reason: collision with root package name */
    public int f12491a = -1;

    public static int h(int[] iArr) {
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < 20; i11++) {
            float e10 = q.e(iArr, f12490e[i11], 0.5f);
            if (e10 < f10) {
                i10 = i11;
                f10 = e10;
            } else if (e10 == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw NotFoundException.f7967c;
    }

    public static int[] i(int i10, a aVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i11 = aVar.f4688b;
        int i12 = i10;
        boolean z10 = false;
        int i13 = 0;
        while (i10 < i11) {
            if (aVar.e(i10) != z10) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else if (q.e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i12, i10};
                } else {
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw NotFoundException.f7967c;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r6 = i(r7, r2, f12489d[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h c(int r19, cd.a r20, java.util.Map<uc.b, ?> r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            r0 = r21
            int r3 = r2.f4688b
            r4 = 0
            int r5 = r2.f(r4)
            if (r5 == r3) goto L_0x00ff
            int[] r3 = f12488c
            int[] r3 = i(r5, r2, r3)
            r5 = 1
            r6 = r3[r5]
            r7 = r3[r4]
            int r6 = r6 - r7
            int r6 = r6 / 4
            r1.f12491a = r6
            r1.j(r7, r2)
            r20.k()
            int r6 = r2.f4688b     // Catch:{ all -> 0x0036 }
            int r7 = r2.f(r4)     // Catch:{ all -> 0x0036 }
            if (r7 == r6) goto L_0x00f8
            int[][] r6 = f12489d     // Catch:{ NotFoundException -> 0x0039 }
            r6 = r6[r4]     // Catch:{ NotFoundException -> 0x0039 }
            int[] r6 = i(r7, r2, r6)     // Catch:{ NotFoundException -> 0x0039 }
            goto L_0x0041
        L_0x0036:
            r0 = move-exception
            goto L_0x00fb
        L_0x0039:
            int[][] r6 = f12489d     // Catch:{ all -> 0x0036 }
            r6 = r6[r5]     // Catch:{ all -> 0x0036 }
            int[] r6 = i(r7, r2, r6)     // Catch:{ all -> 0x0036 }
        L_0x0041:
            r7 = r6[r4]     // Catch:{ all -> 0x0036 }
            r1.j(r7, r2)     // Catch:{ all -> 0x0036 }
            r7 = r6[r4]     // Catch:{ all -> 0x0036 }
            int r8 = r2.f4688b     // Catch:{ all -> 0x0036 }
            r9 = r6[r5]     // Catch:{ all -> 0x0036 }
            int r9 = r8 - r9
            r6[r4] = r9     // Catch:{ all -> 0x0036 }
            int r8 = r8 - r7
            r6[r5] = r8     // Catch:{ all -> 0x0036 }
            r20.k()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 20
            r7.<init>(r8)
            r8 = r3[r5]
            r9 = r6[r4]
            r10 = 10
            int[] r11 = new int[r10]
            r12 = 5
            int[] r13 = new int[r12]
            int[] r14 = new int[r12]
        L_0x006a:
            if (r8 >= r9) goto L_0x009f
            kd.q.f(r8, r2, r11)
            r15 = r4
        L_0x0070:
            if (r15 >= r12) goto L_0x0081
            int r16 = r15 * 2
            r17 = r11[r16]
            r13[r15] = r17
            int r16 = r16 + 1
            r16 = r11[r16]
            r14[r15] = r16
            int r15 = r15 + 1
            goto L_0x0070
        L_0x0081:
            int r15 = h(r13)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            int r15 = h(r14)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            r15 = r4
        L_0x0096:
            if (r15 >= r10) goto L_0x006a
            r16 = r11[r15]
            int r8 = r8 + r16
            int r15 = r15 + 1
            goto L_0x0096
        L_0x009f:
            java.lang.String r2 = r7.toString()
            r7 = 0
            if (r0 == 0) goto L_0x00af
            uc.b r8 = uc.b.ALLOWED_LENGTHS
            java.lang.Object r0 = r0.get(r8)
            int[] r0 = (int[]) r0
            goto L_0x00b0
        L_0x00af:
            r0 = r7
        L_0x00b0:
            if (r0 != 0) goto L_0x00b4
            int[] r0 = f12487b
        L_0x00b4:
            int r8 = r2.length()
            int r9 = r0.length
            r10 = r4
            r11 = r10
        L_0x00bb:
            if (r10 >= r9) goto L_0x00c9
            r12 = r0[r10]
            if (r8 != r12) goto L_0x00c3
            r0 = r5
            goto L_0x00ca
        L_0x00c3:
            if (r12 <= r11) goto L_0x00c6
            r11 = r12
        L_0x00c6:
            int r10 = r10 + 1
            goto L_0x00bb
        L_0x00c9:
            r0 = r4
        L_0x00ca:
            if (r0 != 0) goto L_0x00cf
            if (r8 <= r11) goto L_0x00cf
            r0 = r5
        L_0x00cf:
            if (r0 == 0) goto L_0x00f3
            uc.h r0 = new uc.h
            r8 = 2
            uc.j[] r8 = new uc.j[r8]
            uc.j r9 = new uc.j
            r3 = r3[r5]
            float r3 = (float) r3
            r10 = r19
            float r10 = (float) r10
            r9.<init>(r3, r10)
            r8[r4] = r9
            uc.j r3 = new uc.j
            r4 = r6[r4]
            float r4 = (float) r4
            r3.<init>(r4, r10)
            r8[r5] = r3
            uc.a r3 = uc.a.ITF
            r0.<init>(r2, r7, r8, r3)
            return r0
        L_0x00f3:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x00f8:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x00fb:
            r20.k()
            throw r0
        L_0x00ff:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.m.c(int, cd.a, java.util.Map):uc.h");
    }

    public final void j(int i10, a aVar) {
        int min = Math.min(this.f12491a * 10, i10);
        int i11 = i10 - 1;
        while (min > 0 && i11 >= 0 && !aVar.e(i11)) {
            min--;
            i11--;
        }
        if (min != 0) {
            throw NotFoundException.f7967c;
        }
    }
}
