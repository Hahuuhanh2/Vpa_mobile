package vd;

import java.util.ArrayList;
import uc.k;

/* compiled from: AlignmentPatternFinder */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final cd.b f16170a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16171b = new ArrayList(5);

    /* renamed from: c  reason: collision with root package name */
    public final int f16172c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16173d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16174e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16175f;

    /* renamed from: g  reason: collision with root package name */
    public final float f16176g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f16177h;

    /* renamed from: i  reason: collision with root package name */
    public final k f16178i;

    public b(cd.b bVar, int i10, int i11, int i12, int i13, float f10, k kVar) {
        this.f16170a = bVar;
        this.f16172c = i10;
        this.f16173d = i11;
        this.f16174e = i12;
        this.f16175f = i13;
        this.f16176g = f10;
        this.f16177h = new int[3];
        this.f16178i = kVar;
    }

    public final boolean a(int[] iArr) {
        float f10 = this.f16176g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - ((float) iArr[i10])) >= f11) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0103 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final vd.a b(int r16, int r17, int[] r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = 0
            r2 = r18[r1]
            r3 = 1
            r4 = r18[r3]
            int r2 = r2 + r4
            r5 = 2
            r6 = r18[r5]
            int r2 = r2 + r6
            int r6 = r17 - r6
            float r6 = (float) r6
            float r7 = (float) r4
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            float r6 = r6 - r7
            int r7 = (int) r6
            int r4 = r4 * r5
            cd.b r9 = r0.f16170a
            int r10 = r9.f4690b
            int[] r11 = r0.f16177h
            r11[r1] = r1
            r11[r3] = r1
            r11[r5] = r1
            r12 = r16
        L_0x0024:
            if (r12 < 0) goto L_0x0037
            boolean r13 = r9.b(r7, r12)
            if (r13 == 0) goto L_0x0037
            r13 = r11[r3]
            if (r13 > r4) goto L_0x0037
            int r13 = r13 + 1
            r11[r3] = r13
            int r12 = r12 + -1
            goto L_0x0024
        L_0x0037:
            r13 = 2143289344(0x7fc00000, float:NaN)
            if (r12 < 0) goto L_0x00ae
            r14 = r11[r3]
            if (r14 <= r4) goto L_0x0041
            goto L_0x00ae
        L_0x0041:
            if (r12 < 0) goto L_0x0054
            boolean r14 = r9.b(r7, r12)
            if (r14 != 0) goto L_0x0054
            r14 = r11[r1]
            if (r14 > r4) goto L_0x0054
            int r14 = r14 + 1
            r11[r1] = r14
            int r12 = r12 + -1
            goto L_0x0041
        L_0x0054:
            r12 = r11[r1]
            if (r12 <= r4) goto L_0x0059
            goto L_0x00ae
        L_0x0059:
            int r12 = r16 + 1
        L_0x005b:
            if (r12 >= r10) goto L_0x006e
            boolean r14 = r9.b(r7, r12)
            if (r14 == 0) goto L_0x006e
            r14 = r11[r3]
            if (r14 > r4) goto L_0x006e
            int r14 = r14 + 1
            r11[r3] = r14
            int r12 = r12 + 1
            goto L_0x005b
        L_0x006e:
            if (r12 == r10) goto L_0x00ae
            r14 = r11[r3]
            if (r14 <= r4) goto L_0x0075
            goto L_0x00ae
        L_0x0075:
            if (r12 >= r10) goto L_0x0088
            boolean r14 = r9.b(r7, r12)
            if (r14 != 0) goto L_0x0088
            r14 = r11[r5]
            if (r14 > r4) goto L_0x0088
            int r14 = r14 + 1
            r11[r5] = r14
            int r12 = r12 + 1
            goto L_0x0075
        L_0x0088:
            r7 = r11[r5]
            if (r7 <= r4) goto L_0x008d
            goto L_0x00ae
        L_0x008d:
            r4 = r11[r1]
            r9 = r11[r3]
            int r4 = r4 + r9
            int r4 = r4 + r7
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            int r4 = r4 * 5
            int r2 = r2 * r5
            if (r4 < r2) goto L_0x009e
            goto L_0x00ae
        L_0x009e:
            boolean r2 = r15.a(r11)
            if (r2 == 0) goto L_0x00ae
            r2 = r11[r5]
            int r12 = r12 - r2
            float r2 = (float) r12
            r4 = r11[r3]
            float r4 = (float) r4
            float r4 = r4 / r8
            float r13 = r2 - r4
        L_0x00ae:
            boolean r2 = java.lang.Float.isNaN(r13)
            if (r2 != 0) goto L_0x0126
            r2 = r18[r1]
            r4 = r18[r3]
            int r2 = r2 + r4
            r4 = r18[r5]
            int r2 = r2 + r4
            float r2 = (float) r2
            r4 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 / r4
            java.util.ArrayList r4 = r0.f16171b
            java.util.Iterator r4 = r4.iterator()
        L_0x00c6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0115
            java.lang.Object r5 = r4.next()
            vd.a r5 = (vd.a) r5
            float r7 = r5.f15489b
            float r7 = r13 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0100
            float r7 = r5.f15488a
            float r7 = r6 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0100
            float r7 = r5.f16169c
            float r7 = r2 - r7
            float r7 = java.lang.Math.abs(r7)
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x00fe
            float r9 = r5.f16169c
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0100
        L_0x00fe:
            r7 = r3
            goto L_0x0101
        L_0x0100:
            r7 = r1
        L_0x0101:
            if (r7 == 0) goto L_0x00c6
            float r1 = r5.f15488a
            float r1 = r1 + r6
            float r1 = r1 / r8
            float r3 = r5.f15489b
            float r3 = r3 + r13
            float r3 = r3 / r8
            float r4 = r5.f16169c
            float r4 = r4 + r2
            float r4 = r4 / r8
            vd.a r2 = new vd.a
            r2.<init>(r1, r3, r4)
            return r2
        L_0x0115:
            vd.a r1 = new vd.a
            r1.<init>(r6, r13, r2)
            java.util.ArrayList r2 = r0.f16171b
            r2.add(r1)
            uc.k r2 = r0.f16178i
            if (r2 == 0) goto L_0x0126
            r2.a(r1)
        L_0x0126:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.b.b(int, int, int[]):vd.a");
    }
}
