package kd;

import cd.a;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import uc.b;
import uc.g;
import uc.h;
import uc.i;
import uc.j;
import vl.d;

/* compiled from: OneDReader */
public abstract class q implements g {
    public static float e(int[] iArr, int[] iArr2, float f10) {
        float f11;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f12 = (float) i10;
        float f13 = f12 / ((float) i11);
        float f14 = f10 * f13;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f16 = ((float) iArr2[i13]) * f13;
            float f17 = (float) i14;
            if (f17 > f16) {
                f11 = f17 - f16;
            } else {
                f11 = f16 - f17;
            }
            if (f11 > f14) {
                return Float.POSITIVE_INFINITY;
            }
            f15 += f11;
        }
        return f15 / f12;
    }

    public static void f(int i10, a aVar, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i12 = aVar.f4688b;
        if (i10 < i12) {
            boolean z10 = !aVar.e(i10);
            while (i10 < i12) {
                if (aVar.e(i10) == z10) {
                    i11++;
                    if (i11 == length) {
                        break;
                    }
                    iArr[i11] = 1;
                    z10 = !z10;
                } else {
                    iArr[i11] = iArr[i11] + 1;
                }
                i10++;
            }
            if (i11 == length) {
                return;
            }
            if (i11 != length - 1 || i10 != i12) {
                throw NotFoundException.f7967c;
            }
            return;
        }
        throw NotFoundException.f7967c;
    }

    public static void g(int i10, a aVar, int[] iArr) {
        int length = iArr.length;
        boolean e10 = aVar.e(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.e(i10) != e10) {
                length--;
                e10 = !e10;
            }
        }
        if (length < 0) {
            f(i10 + 1, aVar, iArr);
            return;
        }
        throw NotFoundException.f7967c;
    }

    public h a(d dVar) {
        return b(dVar, (Map<b, ?>) null);
    }

    public h b(d dVar, Map<b, ?> map) {
        boolean z10;
        i iVar = i.ORIENTATION;
        try {
            return d(dVar, map);
        } catch (NotFoundException e10) {
            if (map == null || !map.containsKey(b.TRY_HARDER)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 || !((uc.d) ((h4.i) dVar.f23362b).f10560b).c()) {
                throw e10;
            }
            d dVar2 = new d((h4.i) ((h4.i) dVar.f23362b).e(((uc.d) ((h4.i) dVar.f23362b).f10560b).d()));
            h d10 = d(dVar2, map);
            Map<i, Object> map2 = d10.f15476e;
            int i10 = 270;
            if (map2 != null && map2.containsKey(iVar)) {
                i10 = (((Integer) map2.get(iVar)).intValue() + 270) % 360;
            }
            d10.b(iVar, Integer.valueOf(i10));
            j[] jVarArr = d10.f15474c;
            if (jVarArr != null) {
                int i11 = ((uc.d) ((h4.i) dVar2.f23362b).f10560b).f15463b;
                for (int i12 = 0; i12 < jVarArr.length; i12++) {
                    j jVar = jVarArr[i12];
                    jVarArr[i12] = new j((((float) i11) - jVar.f15489b) - 1.0f, jVar.f15488a);
                }
            }
            return d10;
        }
    }

    public abstract h c(int i10, a aVar, Map<b, ?> map);

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b A[Catch:{ ReaderException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ca A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h d(vl.d r19, java.util.Map<uc.b, ?> r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.f23362b
            r3 = r2
            h4.i r3 = (h4.i) r3
            java.lang.Object r3 = r3.f10560b
            uc.d r3 = (uc.d) r3
            int r3 = r3.f15462a
            h4.i r2 = (h4.i) r2
            java.lang.Object r2 = r2.f10560b
            uc.d r2 = (uc.d) r2
            int r2 = r2.f15463b
            cd.a r4 = new cd.a
            r4.<init>(r3)
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x002a
            uc.b r7 = uc.b.TRY_HARDER
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L_0x002a
            r7 = r6
            goto L_0x002b
        L_0x002a:
            r7 = r5
        L_0x002b:
            if (r7 == 0) goto L_0x0030
            r8 = 8
            goto L_0x0031
        L_0x0030:
            r8 = 5
        L_0x0031:
            int r8 = r2 >> r8
            int r8 = java.lang.Math.max(r6, r8)
            if (r7 == 0) goto L_0x003b
            r7 = r2
            goto L_0x003d
        L_0x003b:
            r7 = 15
        L_0x003d:
            int r9 = r2 / 2
            r10 = r5
        L_0x0040:
            if (r10 >= r7) goto L_0x00e1
            int r11 = r10 + 1
            int r12 = r11 / 2
            r10 = r10 & 1
            if (r10 != 0) goto L_0x004c
            r10 = r6
            goto L_0x004d
        L_0x004c:
            r10 = r5
        L_0x004d:
            if (r10 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            int r12 = -r12
        L_0x0051:
            int r12 = r12 * r8
            int r12 = r12 + r9
            if (r12 < 0) goto L_0x00e1
            if (r12 >= r2) goto L_0x00e1
            java.lang.Object r10 = r0.f23362b     // Catch:{ NotFoundException -> 0x00d7 }
            h4.i r10 = (h4.i) r10     // Catch:{ NotFoundException -> 0x00d7 }
            cd.a r4 = r10.h(r12, r4)     // Catch:{ NotFoundException -> 0x00d7 }
            r10 = r5
        L_0x0060:
            r13 = 2
            if (r10 >= r13) goto L_0x00d7
            if (r10 != r6) goto L_0x0083
            r4.k()
            if (r1 == 0) goto L_0x0083
            uc.b r13 = uc.b.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r1.containsKey(r13)
            if (r14 == 0) goto L_0x0083
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<uc.b> r15 = uc.b.class
            r14.<init>(r15)
            r14.putAll(r1)
            r14.remove(r13)
            r13 = r18
            r1 = r14
            goto L_0x0085
        L_0x0083:
            r13 = r18
        L_0x0085:
            uc.h r14 = r13.c(r12, r4, r1)     // Catch:{ ReaderException -> 0x00cb }
            if (r10 != r6) goto L_0x00ca
            uc.i r15 = uc.i.ORIENTATION     // Catch:{ ReaderException -> 0x00cb }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ ReaderException -> 0x00c6 }
            r14.b(r15, r6)     // Catch:{ ReaderException -> 0x00c6 }
            uc.j[] r6 = r14.f15474c     // Catch:{ ReaderException -> 0x00c6 }
            if (r6 == 0) goto L_0x00ca
            uc.j r15 = new uc.j     // Catch:{ ReaderException -> 0x00c6 }
            float r0 = (float) r3
            r16 = r1
            r1 = r6[r5]     // Catch:{ ReaderException -> 0x00c8 }
            float r5 = r1.f15488a     // Catch:{ ReaderException -> 0x00c8 }
            float r5 = r0 - r5
            r17 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r17
            float r1 = r1.f15489b     // Catch:{ ReaderException -> 0x00c8 }
            r15.<init>(r5, r1)     // Catch:{ ReaderException -> 0x00c8 }
            r5 = 0
            r6[r5] = r15     // Catch:{ ReaderException -> 0x00c8 }
            uc.j r1 = new uc.j     // Catch:{ ReaderException -> 0x00c8 }
            r15 = 1
            r5 = r6[r15]     // Catch:{ ReaderException -> 0x00c4 }
            float r15 = r5.f15488a     // Catch:{ ReaderException -> 0x00c8 }
            float r0 = r0 - r15
            float r0 = r0 - r17
            float r5 = r5.f15489b     // Catch:{ ReaderException -> 0x00c8 }
            r1.<init>(r0, r5)     // Catch:{ ReaderException -> 0x00c8 }
            r0 = 1
            r6[r0] = r1     // Catch:{ ReaderException -> 0x00ce }
            goto L_0x00ca
        L_0x00c4:
            r0 = r15
            goto L_0x00ce
        L_0x00c6:
            r16 = r1
        L_0x00c8:
            r0 = 1
            goto L_0x00ce
        L_0x00ca:
            return r14
        L_0x00cb:
            r16 = r1
            r0 = r6
        L_0x00ce:
            int r10 = r10 + 1
            r6 = r0
            r1 = r16
            r5 = 0
            r0 = r19
            goto L_0x0060
        L_0x00d7:
            r13 = r18
            r0 = r6
            r6 = r0
            r10 = r11
            r5 = 0
            r0 = r19
            goto L_0x0040
        L_0x00e1:
            r13 = r18
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.q.d(vl.d, java.util.Map):uc.h");
    }

    public void reset() {
    }
}
