package ld;

import cd.a;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kd.q;
import uc.b;
import uc.h;
import uc.j;
import uc.k;

/* compiled from: RSS14Reader */
public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f12966i = {1, 10, 34, 70, 126};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f12967j = {4, 20, 48, 81};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f12968k = {0, 161, 961, 2015, 2715};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f12969l = {0, 336, 1036, 1516};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f12970m = {8, 6, 4, 3, 1};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f12971n = {2, 4, 6, 8};

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f12972o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f12973g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f12974h = new ArrayList();

    public static void k(ArrayList arrayList, d dVar) {
        if (dVar != null) {
            boolean z10 = false;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar2 = (d) it.next();
                if (dVar2.f12959a == dVar.f12959a) {
                    dVar2.f12965d++;
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                arrayList.add(dVar);
            }
        }
    }

    public final h c(int i10, a aVar, Map<b, ?> map) {
        boolean z10;
        k(this.f12973g, m(aVar, false, i10, map));
        aVar.k();
        k(this.f12974h, m(aVar, true, i10, map));
        aVar.k();
        Iterator it = this.f12973g.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f12965d > 1) {
                Iterator it2 = this.f12974h.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2.f12965d > 1) {
                        int i11 = ((dVar2.f12960b * 16) + dVar.f12960b) % 79;
                        int i12 = (dVar.f12964c.f12961a * 9) + dVar2.f12964c.f12961a;
                        if (i12 > 72) {
                            i12--;
                        }
                        if (i12 > 8) {
                            i12--;
                        }
                        if (i11 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            String valueOf = String.valueOf((((long) dVar.f12959a) * 4537077) + ((long) dVar2.f12959a));
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(valueOf);
                            int i13 = 0;
                            for (int i14 = 0; i14 < 13; i14++) {
                                int charAt = sb2.charAt(i14) - '0';
                                if ((i14 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i13 += charAt;
                            }
                            int i15 = 10 - (i13 % 10);
                            if (i15 == 10) {
                                i15 = 0;
                            }
                            sb2.append(i15);
                            j[] jVarArr = dVar.f12964c.f12963c;
                            j[] jVarArr2 = dVar2.f12964c.f12963c;
                            return new h(sb2.toString(), (byte[]) null, new j[]{jVarArr[0], jVarArr[1], jVarArr2[0], jVarArr2[1]}, uc.a.RSS_14);
                        }
                    }
                }
                continue;
            }
        }
        throw NotFoundException.f7967c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r4 < 4) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        if (r4 < 4) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        r15 = false;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        r14 = false;
        r15 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ld.b l(cd.a r18, ld.c r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int[] r4 = r0.f12954b
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            r6 = 1
            if (r3 == 0) goto L_0x0019
            int[] r2 = r2.f12962b
            r2 = r2[r5]
            kd.q.g(r2, r1, r4)
            goto L_0x0032
        L_0x0019:
            int[] r2 = r2.f12962b
            r2 = r2[r6]
            kd.q.f(r2, r1, r4)
            int r1 = r4.length
            int r1 = r1 - r6
            r2 = r5
        L_0x0023:
            if (r2 >= r1) goto L_0x0032
            r7 = r4[r2]
            r8 = r4[r1]
            r4[r2] = r8
            r4[r1] = r7
            int r2 = r2 + 1
            int r1 = r1 + -1
            goto L_0x0023
        L_0x0032:
            if (r3 == 0) goto L_0x0037
            r1 = 16
            goto L_0x0039
        L_0x0037:
            r1 = 15
        L_0x0039:
            int r2 = m9.b.Z(r4)
            float r2 = (float) r2
            float r7 = (float) r1
            float r2 = r2 / r7
            int[] r7 = r0.f12957e
            int[] r8 = r0.f12958f
            float[] r9 = r0.f12955c
            float[] r10 = r0.f12956d
            r11 = r5
        L_0x0049:
            int r12 = r4.length
            if (r11 >= r12) goto L_0x0073
            r12 = r4[r11]
            float r12 = (float) r12
            float r12 = r12 / r2
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r12
            int r13 = (int) r13
            r14 = 8
            if (r13 > 0) goto L_0x005a
            r13 = r6
            goto L_0x005d
        L_0x005a:
            if (r13 <= r14) goto L_0x005d
            r13 = r14
        L_0x005d:
            int r14 = r11 / 2
            r15 = r11 & 1
            if (r15 != 0) goto L_0x006a
            r7[r14] = r13
            float r13 = (float) r13
            float r12 = r12 - r13
            r9[r14] = r12
            goto L_0x0070
        L_0x006a:
            r8[r14] = r13
            float r13 = (float) r13
            float r12 = r12 - r13
            r10[r14] = r12
        L_0x0070:
            int r11 = r11 + 1
            goto L_0x0049
        L_0x0073:
            int[] r2 = r0.f12957e
            int r2 = m9.b.Z(r2)
            int[] r4 = r0.f12958f
            int r4 = m9.b.Z(r4)
            r9 = 12
            r10 = 4
            r11 = 10
            if (r3 == 0) goto L_0x0097
            if (r2 <= r9) goto L_0x008b
            r13 = r5
            r12 = r6
            goto L_0x0091
        L_0x008b:
            r12 = r5
            if (r2 >= r10) goto L_0x0090
            r13 = r6
            goto L_0x0091
        L_0x0090:
            r13 = r12
        L_0x0091:
            if (r4 <= r9) goto L_0x0094
            goto L_0x00a8
        L_0x0094:
            if (r4 >= r10) goto L_0x00b0
            goto L_0x00ad
        L_0x0097:
            r12 = 11
            if (r2 <= r12) goto L_0x009e
            r13 = r5
            r12 = r6
            goto L_0x00a6
        L_0x009e:
            r12 = 5
            if (r2 >= r12) goto L_0x00a4
            r12 = r5
            r13 = r6
            goto L_0x00a6
        L_0x00a4:
            r12 = r5
            r13 = r12
        L_0x00a6:
            if (r4 <= r11) goto L_0x00ab
        L_0x00a8:
            r14 = r5
            r15 = r6
            goto L_0x00b2
        L_0x00ab:
            if (r4 >= r10) goto L_0x00b0
        L_0x00ad:
            r15 = r5
            r14 = r6
            goto L_0x00b2
        L_0x00b0:
            r14 = r5
            r15 = r14
        L_0x00b2:
            int r16 = r2 + r4
            int r1 = r16 - r1
            r11 = r2 & 1
            if (r11 != r3) goto L_0x00bc
            r11 = r6
            goto L_0x00bd
        L_0x00bc:
            r11 = r5
        L_0x00bd:
            r5 = r4 & 1
            if (r5 != r6) goto L_0x00c3
            r5 = r6
            goto L_0x00c4
        L_0x00c3:
            r5 = 0
        L_0x00c4:
            r10 = -1
            if (r1 == r10) goto L_0x00f3
            if (r1 == 0) goto L_0x00de
            if (r1 != r6) goto L_0x00db
            if (r11 == 0) goto L_0x00d4
            if (r5 != 0) goto L_0x00d1
            r12 = r6
            goto L_0x00ff
        L_0x00d1:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00d4:
            if (r5 == 0) goto L_0x00d8
            r15 = r6
            goto L_0x00ff
        L_0x00d8:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00db:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00de:
            if (r11 == 0) goto L_0x00ed
            if (r5 == 0) goto L_0x00ea
            if (r2 >= r4) goto L_0x00e7
            r13 = r6
            r15 = r13
            goto L_0x00ff
        L_0x00e7:
            r12 = r6
            r14 = r12
            goto L_0x00ff
        L_0x00ea:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00ed:
            if (r5 != 0) goto L_0x00f0
            goto L_0x00ff
        L_0x00f0:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00f3:
            if (r11 == 0) goto L_0x00fc
            if (r5 != 0) goto L_0x00f9
            r13 = r6
            goto L_0x00ff
        L_0x00f9:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00fc:
            if (r5 == 0) goto L_0x01b3
            r14 = r6
        L_0x00ff:
            if (r13 == 0) goto L_0x010e
            if (r12 != 0) goto L_0x010b
            int[] r1 = r0.f12957e
            float[] r2 = r0.f12955c
            ld.a.i(r2, r1)
            goto L_0x010e
        L_0x010b:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x010e:
            if (r12 == 0) goto L_0x0117
            int[] r1 = r0.f12957e
            float[] r2 = r0.f12955c
            ld.a.h(r2, r1)
        L_0x0117:
            if (r14 == 0) goto L_0x0126
            if (r15 != 0) goto L_0x0123
            int[] r1 = r0.f12958f
            float[] r2 = r0.f12955c
            ld.a.i(r2, r1)
            goto L_0x0126
        L_0x0123:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0126:
            if (r15 == 0) goto L_0x012f
            int[] r1 = r0.f12958f
            float[] r2 = r0.f12956d
            ld.a.h(r2, r1)
        L_0x012f:
            int r1 = r7.length
            int r1 = r1 - r6
            r2 = 0
            r4 = 0
        L_0x0133:
            if (r1 < 0) goto L_0x013e
            int r2 = r2 * 9
            r5 = r7[r1]
            int r2 = r2 + r5
            int r4 = r4 + r5
            int r1 = r1 + -1
            goto L_0x0133
        L_0x013e:
            int r1 = r8.length
            int r1 = r1 - r6
            r5 = 0
            r10 = 0
        L_0x0142:
            if (r1 < 0) goto L_0x014d
            int r5 = r5 * 9
            r11 = r8[r1]
            int r5 = r5 + r11
            int r10 = r10 + r11
            int r1 = r1 + -1
            goto L_0x0142
        L_0x014d:
            int r5 = r5 * 3
            int r5 = r5 + r2
            if (r3 == 0) goto L_0x0181
            r1 = r4 & 1
            if (r1 != 0) goto L_0x017e
            if (r4 > r9) goto L_0x017e
            r1 = 4
            if (r4 < r1) goto L_0x017e
            int r9 = r9 - r4
            int r9 = r9 / 2
            int[] r1 = f12970m
            r1 = r1[r9]
            int r2 = 9 - r1
            r3 = 0
            int r1 = j7.a.L(r7, r1, r3)
            int r2 = j7.a.L(r8, r2, r6)
            int[] r3 = f12966i
            r3 = r3[r9]
            int[] r4 = f12968k
            r4 = r4[r9]
            ld.b r6 = new ld.b
            int r1 = r1 * r3
            int r1 = r1 + r2
            int r1 = r1 + r4
            r6.<init>(r1, r5)
            return r6
        L_0x017e:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0181:
            r1 = r10 & 1
            if (r1 != 0) goto L_0x01b0
            r1 = 10
            if (r10 > r1) goto L_0x01b0
            r2 = 4
            if (r10 < r2) goto L_0x01b0
            int r11 = 10 - r10
            int r11 = r11 / 2
            int[] r1 = f12971n
            r1 = r1[r11]
            int r2 = 9 - r1
            int r1 = j7.a.L(r7, r1, r6)
            r3 = 0
            int r2 = j7.a.L(r8, r2, r3)
            int[] r3 = f12967j
            r3 = r3[r11]
            int[] r4 = f12969l
            r4 = r4[r11]
            ld.b r6 = new ld.b
            int r2 = r2 * r3
            int r2 = r2 + r1
            int r2 = r2 + r4
            r6.<init>(r2, r5)
            return r6
        L_0x01b0:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x01b3:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.e.l(cd.a, ld.c, boolean):ld.b");
    }

    public final d m(a aVar, boolean z10, int i10, Map<b, ?> map) {
        k kVar;
        try {
            c o10 = o(aVar, i10, z10, n(aVar, z10));
            if (map == null) {
                kVar = null;
            } else {
                kVar = (k) map.get(b.NEED_RESULT_POINT_CALLBACK);
            }
            if (kVar != null) {
                int[] iArr = o10.f12962b;
                float f10 = ((float) ((iArr[0] + iArr[1]) - 1)) / 2.0f;
                if (z10) {
                    f10 = ((float) (aVar.f4688b - 1)) - f10;
                }
                kVar.a(new j(f10, (float) i10));
            }
            b l10 = l(aVar, o10, true);
            b l11 = l(aVar, o10, false);
            return new d((l10.f12959a * 1597) + l11.f12959a, (l11.f12960b * 4) + l10.f12960b, o10);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final int[] n(a aVar, boolean z10) {
        int[] iArr = this.f12953a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i10 = aVar.f4688b;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < i10) {
            z11 = !aVar.e(i11);
            if (z10 == z11) {
                break;
            }
            i11++;
        }
        int i12 = 0;
        int i13 = i11;
        while (i11 < i10) {
            if (aVar.e(i11) != z11) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 != 3) {
                    i12++;
                } else if (a.j(iArr)) {
                    return new int[]{i13, i11};
                } else {
                    i13 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i12--;
                }
                iArr[i12] = 1;
                z11 = !z11;
            }
            i11++;
        }
        throw NotFoundException.f7967c;
    }

    public final c o(a aVar, int i10, boolean z10, int[] iArr) {
        int i11;
        int i12;
        boolean e10 = aVar.e(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && e10 != aVar.e(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int[] iArr2 = this.f12953a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = iArr[0] - i14;
        int[][] iArr3 = f12972o;
        for (int i15 = 0; i15 < 9; i15++) {
            if (q.e(iArr2, iArr3[i15], 0.45f) < 0.2f) {
                int i16 = iArr[1];
                if (z10) {
                    int i17 = aVar.f4688b;
                    i11 = (i17 - 1) - i16;
                    i12 = (i17 - 1) - i14;
                } else {
                    i11 = i16;
                    i12 = i14;
                }
                return new c(i15, i12, i11, i10, new int[]{i14, i16});
            }
        }
        throw NotFoundException.f7967c;
    }

    public final void reset() {
        this.f12973g.clear();
        this.f12974h.clear();
    }
}
