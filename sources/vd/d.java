package vd;

import cd.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import uc.k;

/* compiled from: FinderPatternFinder */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f16181f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f16182a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16183b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f16184c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f16185d = new int[5];

    /* renamed from: e  reason: collision with root package name */
    public final k f16186e;

    /* compiled from: FinderPatternFinder */
    public static final class a implements Serializable, Comparator<c> {
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((c) obj).f16179c, ((c) obj2).f16179c);
        }
    }

    public d(b bVar, k kVar) {
        this.f16182a = bVar;
        this.f16186e = kVar;
    }

    public static float a(int[] iArr, int i10) {
        return ((float) ((i10 - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    public static boolean c(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = ((float) i10) / 7.0f;
        float f11 = f10 / 2.0f;
        if (Math.abs(f10 - ((float) iArr[0])) >= f11 || Math.abs(f10 - ((float) iArr[1])) >= f11 || Math.abs((f10 * 3.0f) - ((float) iArr[2])) >= 3.0f * f11 || Math.abs(f10 - ((float) iArr[3])) >= f11 || Math.abs(f10 - ((float) iArr[4])) >= f11) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b3, code lost:
        if (r4 < r14) goto L_0x01b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z.k b(java.util.Map<uc.b, ?> r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0012
            uc.b r4 = uc.b.TRY_HARDER
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0012
            r1 = r3
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            cd.b r4 = r0.f16182a
            int r5 = r4.f4690b
            int r4 = r4.f4689a
            int r6 = r5 * 3
            int r6 = r6 / 388
            r7 = 3
            if (r6 < r7) goto L_0x0022
            if (r1 == 0) goto L_0x0023
        L_0x0022:
            r6 = r7
        L_0x0023:
            r1 = 5
            int[] r1 = new int[r1]
            int r8 = r6 + -1
            r9 = r2
        L_0x0029:
            r10 = 2
            if (r8 >= r5) goto L_0x00ff
            if (r9 != 0) goto L_0x00ff
            java.util.Arrays.fill(r1, r2)
            r11 = r2
            r12 = r11
        L_0x0033:
            if (r11 >= r4) goto L_0x00e6
            cd.b r13 = r0.f16182a
            boolean r13 = r13.b(r11, r8)
            if (r13 == 0) goto L_0x004a
            r13 = r12 & 1
            if (r13 != r3) goto L_0x0043
            int r12 = r12 + 1
        L_0x0043:
            r13 = r1[r12]
            int r13 = r13 + r3
            r1[r12] = r13
            goto L_0x00e3
        L_0x004a:
            r13 = r12 & 1
            if (r13 != 0) goto L_0x00de
            r13 = 4
            if (r12 != r13) goto L_0x00d6
            boolean r12 = c(r1)
            if (r12 == 0) goto L_0x00c4
            boolean r12 = r0.d(r8, r11, r1)
            if (r12 == 0) goto L_0x00b3
            boolean r6 = r0.f16184c
            if (r6 == 0) goto L_0x0066
            boolean r9 = r25.e()
            goto L_0x00ad
        L_0x0066:
            java.util.ArrayList r6 = r0.f16183b
            int r6 = r6.size()
            if (r6 > r3) goto L_0x006f
            goto L_0x00a2
        L_0x006f:
            r6 = 0
            java.util.ArrayList r12 = r0.f16183b
            java.util.Iterator r12 = r12.iterator()
        L_0x0076:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00a2
            java.lang.Object r13 = r12.next()
            vd.c r13 = (vd.c) r13
            int r14 = r13.f16180d
            if (r14 < r10) goto L_0x0076
            if (r6 != 0) goto L_0x008a
            r6 = r13
            goto L_0x0076
        L_0x008a:
            r0.f16184c = r3
            float r12 = r6.f15488a
            float r14 = r13.f15488a
            float r12 = r12 - r14
            float r12 = java.lang.Math.abs(r12)
            float r6 = r6.f15489b
            float r13 = r13.f15489b
            float r6 = r6 - r13
            float r6 = java.lang.Math.abs(r6)
            float r12 = r12 - r6
            int r6 = (int) r12
            int r6 = r6 / r10
            goto L_0x00a3
        L_0x00a2:
            r6 = r2
        L_0x00a3:
            r12 = r1[r10]
            if (r6 <= r12) goto L_0x00ad
            int r6 = r6 - r12
            int r6 = r6 - r10
            int r8 = r8 + r6
            int r6 = r4 + -1
            r11 = r6
        L_0x00ad:
            java.util.Arrays.fill(r1, r2)
            r12 = r2
            r6 = r10
            goto L_0x00e3
        L_0x00b3:
            r12 = r1[r10]
            r1[r2] = r12
            r12 = r1[r7]
            r1[r3] = r12
            r12 = r1[r13]
            r1[r10] = r12
            r1[r7] = r3
            r1[r13] = r2
            goto L_0x00d4
        L_0x00c4:
            r12 = r1[r10]
            r1[r2] = r12
            r12 = r1[r7]
            r1[r3] = r12
            r12 = r1[r13]
            r1[r10] = r12
            r1[r7] = r3
            r1[r13] = r2
        L_0x00d4:
            r12 = r7
            goto L_0x00e3
        L_0x00d6:
            int r12 = r12 + 1
            r13 = r1[r12]
            int r13 = r13 + r3
            r1[r12] = r13
            goto L_0x00e3
        L_0x00de:
            r13 = r1[r12]
            int r13 = r13 + r3
            r1[r12] = r13
        L_0x00e3:
            int r11 = r11 + r3
            goto L_0x0033
        L_0x00e6:
            boolean r10 = c(r1)
            if (r10 == 0) goto L_0x00fc
            boolean r10 = r0.d(r8, r4, r1)
            if (r10 == 0) goto L_0x00fc
            r6 = r1[r2]
            boolean r10 = r0.f16184c
            if (r10 == 0) goto L_0x00fc
            boolean r9 = r25.e()
        L_0x00fc:
            int r8 = r8 + r6
            goto L_0x0029
        L_0x00ff:
            java.util.ArrayList r1 = r0.f16183b
            int r1 = r1.size()
            if (r1 < r7) goto L_0x0221
            java.util.ArrayList r1 = r0.f16183b
            vd.d$a r4 = f16181f
            j$.util.List.EL.sort(r1, r4)
            vd.c[] r1 = new vd.c[r7]
            r6 = r2
            r7 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0116:
            java.util.ArrayList r9 = r0.f16183b
            int r9 = r9.size()
            int r9 = r9 - r10
            if (r6 >= r9) goto L_0x020a
            java.util.ArrayList r9 = r0.f16183b
            java.lang.Object r9 = r9.get(r6)
            vd.c r9 = (vd.c) r9
            float r11 = r9.c()
            int r6 = r6 + 1
            r12 = r6
        L_0x012e:
            java.util.ArrayList r13 = r0.f16183b
            int r13 = r13.size()
            int r13 = r13 - r3
            if (r12 >= r13) goto L_0x0203
            java.util.ArrayList r13 = r0.f16183b
            java.lang.Object r13 = r13.get(r12)
            vd.c r13 = (vd.c) r13
            float r14 = r9.f15488a
            float r15 = r13.f15488a
            float r14 = r14 - r15
            double r14 = (double) r14
            float r4 = r9.f15489b
            float r5 = r13.f15489b
            float r4 = r4 - r5
            double r4 = (double) r4
            double r14 = r14 * r14
            double r4 = r4 * r4
            double r4 = r4 + r14
            int r12 = r12 + 1
            r14 = r12
        L_0x0151:
            java.util.ArrayList r15 = r0.f16183b
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x01fa
            java.util.ArrayList r15 = r0.f16183b
            java.lang.Object r15 = r15.get(r14)
            vd.c r15 = (vd.c) r15
            float r16 = r15.c()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r11
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 > 0) goto L_0x01e5
            float r10 = r13.f15488a
            float r3 = r15.f15488a
            float r10 = r10 - r3
            r18 = r3
            double r2 = (double) r10
            float r10 = r13.f15489b
            float r0 = r15.f15489b
            float r10 = r10 - r0
            r19 = r11
            double r10 = (double) r10
            double r2 = r2 * r2
            double r10 = r10 * r10
            double r10 = r10 + r2
            float r2 = r9.f15488a
            float r2 = r2 - r18
            double r2 = (double) r2
            r18 = r6
            float r6 = r9.f15489b
            float r6 = r6 - r0
            r0 = r14
            r20 = r15
            double r14 = (double) r6
            double r2 = r2 * r2
            double r14 = r14 * r14
            double r14 = r14 + r2
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x01ad
            int r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ab
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x01a5
            r2 = r4
            r23 = r10
            r10 = r14
            r14 = r23
            goto L_0x01c0
        L_0x01a5:
            r23 = r10
            r10 = r14
            r14 = r23
            goto L_0x01b5
        L_0x01ab:
            r2 = r4
            goto L_0x01c0
        L_0x01ad:
            int r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x01b8
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x01bd
        L_0x01b5:
            r2 = r10
            r10 = r4
            goto L_0x01c0
        L_0x01b8:
            r23 = r10
            r10 = r14
            r14 = r23
        L_0x01bd:
            r2 = r10
            r10 = r14
            r14 = r4
        L_0x01c0:
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 * r21
            double r10 = r14 - r10
            double r10 = java.lang.Math.abs(r10)
            double r2 = r2 * r21
            double r14 = r14 - r2
            double r2 = java.lang.Math.abs(r14)
            double r2 = r2 + r10
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x01e1
            r6 = 0
            r1[r6] = r9
            r10 = 1
            r1[r10] = r13
            r11 = 2
            r1[r11] = r20
            r7 = r2
            goto L_0x01ed
        L_0x01e1:
            r6 = 0
            r10 = 1
            r11 = 2
            goto L_0x01ed
        L_0x01e5:
            r18 = r6
            r19 = r11
            r0 = r14
            r6 = r2
            r11 = r10
            r10 = r3
        L_0x01ed:
            int r14 = r0 + 1
            r0 = r25
            r2 = r6
            r3 = r10
            r10 = r11
            r6 = r18
            r11 = r19
            goto L_0x0151
        L_0x01fa:
            r19 = r11
            r11 = r10
            r0 = r25
            r11 = r19
            goto L_0x012e
        L_0x0203:
            r18 = r6
            r11 = r10
            r0 = r25
            goto L_0x0116
        L_0x020a:
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x021c
            uc.j.b(r1)
            z.k r0 = new z.k
            r0.<init>((vd.c[]) r1)
            return r0
        L_0x021c:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.a()
            throw r0
        L_0x0221:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.d.b(java.util.Map):z.k");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x033c A[LOOP:19: B:179:0x02da->B:193:0x033c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x031b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(int r18, int r19, int[] r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = r1[r4]
            int r3 = r3 + r5
            r5 = 2
            r6 = r1[r5]
            int r3 = r3 + r6
            r6 = 3
            r7 = r1[r6]
            int r3 = r3 + r7
            r7 = 4
            r8 = r1[r7]
            int r3 = r3 + r8
            r8 = r19
            float r8 = a(r1, r8)
            int r8 = (int) r8
            r9 = r1[r5]
            cd.b r10 = r0.f16182a
            int r11 = r10.f4690b
            int[] r12 = r0.f16185d
            java.util.Arrays.fill(r12, r2)
            int[] r12 = r0.f16185d
            r13 = r18
        L_0x002d:
            if (r13 < 0) goto L_0x003d
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x003d
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + -1
            goto L_0x002d
        L_0x003d:
            r15 = 5
            if (r13 >= 0) goto L_0x0042
            goto L_0x00df
        L_0x0042:
            if (r13 < 0) goto L_0x0055
            boolean r16 = r10.b(r8, r13)
            if (r16 != 0) goto L_0x0055
            r14 = r12[r4]
            if (r14 > r9) goto L_0x0055
            int r14 = r14 + 1
            r12[r4] = r14
            int r13 = r13 + -1
            goto L_0x0042
        L_0x0055:
            if (r13 < 0) goto L_0x00df
            r14 = r12[r4]
            if (r14 <= r9) goto L_0x005d
            goto L_0x00df
        L_0x005d:
            if (r13 < 0) goto L_0x0070
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x0070
            r14 = r12[r2]
            if (r14 > r9) goto L_0x0070
            int r14 = r14 + 1
            r12[r2] = r14
            int r13 = r13 + -1
            goto L_0x005d
        L_0x0070:
            r13 = r12[r2]
            if (r13 <= r9) goto L_0x0076
            goto L_0x00df
        L_0x0076:
            int r13 = r18 + 1
        L_0x0078:
            if (r13 >= r11) goto L_0x0088
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x0088
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + 1
            goto L_0x0078
        L_0x0088:
            if (r13 != r11) goto L_0x008b
            goto L_0x00df
        L_0x008b:
            if (r13 >= r11) goto L_0x009e
            boolean r14 = r10.b(r8, r13)
            if (r14 != 0) goto L_0x009e
            r14 = r12[r6]
            if (r14 >= r9) goto L_0x009e
            int r14 = r14 + 1
            r12[r6] = r14
            int r13 = r13 + 1
            goto L_0x008b
        L_0x009e:
            if (r13 == r11) goto L_0x00df
            r14 = r12[r6]
            if (r14 < r9) goto L_0x00a5
            goto L_0x00df
        L_0x00a5:
            if (r13 >= r11) goto L_0x00b8
            boolean r14 = r10.b(r8, r13)
            if (r14 == 0) goto L_0x00b8
            r14 = r12[r7]
            if (r14 >= r9) goto L_0x00b8
            int r14 = r14 + 1
            r12[r7] = r14
            int r13 = r13 + 1
            goto L_0x00a5
        L_0x00b8:
            r10 = r12[r7]
            if (r10 < r9) goto L_0x00bd
            goto L_0x00df
        L_0x00bd:
            r9 = r12[r2]
            r11 = r12[r4]
            int r9 = r9 + r11
            r11 = r12[r5]
            int r9 = r9 + r11
            r11 = r12[r6]
            int r9 = r9 + r11
            int r9 = r9 + r10
            int r9 = r9 - r3
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * r15
            int r10 = r3 * 2
            if (r9 < r10) goto L_0x00d4
            goto L_0x00df
        L_0x00d4:
            boolean r9 = c(r12)
            if (r9 == 0) goto L_0x00df
            float r9 = a(r12, r13)
            goto L_0x00e1
        L_0x00df:
            r9 = 2143289344(0x7fc00000, float:NaN)
        L_0x00e1:
            boolean r10 = java.lang.Float.isNaN(r9)
            if (r10 != 0) goto L_0x0354
            int r10 = (int) r9
            r1 = r1[r5]
            cd.b r11 = r0.f16182a
            int r12 = r11.f4689a
            int[] r13 = r0.f16185d
            java.util.Arrays.fill(r13, r2)
            int[] r13 = r0.f16185d
            r14 = r8
        L_0x00f6:
            if (r14 < 0) goto L_0x0107
            boolean r16 = r11.b(r14, r10)
            if (r16 == 0) goto L_0x0107
            r16 = r13[r5]
            int r16 = r16 + 1
            r13[r5] = r16
            int r14 = r14 + -1
            goto L_0x00f6
        L_0x0107:
            if (r14 >= 0) goto L_0x010b
            goto L_0x01a7
        L_0x010b:
            if (r14 < 0) goto L_0x011f
            boolean r16 = r11.b(r14, r10)
            if (r16 != 0) goto L_0x011f
            r15 = r13[r4]
            if (r15 > r1) goto L_0x011f
            int r15 = r15 + 1
            r13[r4] = r15
            int r14 = r14 + -1
            r15 = 5
            goto L_0x010b
        L_0x011f:
            if (r14 < 0) goto L_0x01a7
            r15 = r13[r4]
            if (r15 <= r1) goto L_0x0127
            goto L_0x01a7
        L_0x0127:
            if (r14 < 0) goto L_0x013a
            boolean r15 = r11.b(r14, r10)
            if (r15 == 0) goto L_0x013a
            r15 = r13[r2]
            if (r15 > r1) goto L_0x013a
            int r15 = r15 + 1
            r13[r2] = r15
            int r14 = r14 + -1
            goto L_0x0127
        L_0x013a:
            r14 = r13[r2]
            if (r14 <= r1) goto L_0x0140
            goto L_0x01a7
        L_0x0140:
            int r8 = r8 + r4
        L_0x0141:
            if (r8 >= r12) goto L_0x0151
            boolean r14 = r11.b(r8, r10)
            if (r14 == 0) goto L_0x0151
            r14 = r13[r5]
            int r14 = r14 + r4
            r13[r5] = r14
            int r8 = r8 + 1
            goto L_0x0141
        L_0x0151:
            if (r8 != r12) goto L_0x0154
            goto L_0x01a7
        L_0x0154:
            if (r8 >= r12) goto L_0x0167
            boolean r14 = r11.b(r8, r10)
            if (r14 != 0) goto L_0x0167
            r14 = r13[r6]
            if (r14 >= r1) goto L_0x0167
            int r14 = r14 + 1
            r13[r6] = r14
            int r8 = r8 + 1
            goto L_0x0154
        L_0x0167:
            if (r8 == r12) goto L_0x01a7
            r14 = r13[r6]
            if (r14 < r1) goto L_0x016e
            goto L_0x01a7
        L_0x016e:
            if (r8 >= r12) goto L_0x0181
            boolean r14 = r11.b(r8, r10)
            if (r14 == 0) goto L_0x0181
            r14 = r13[r7]
            if (r14 >= r1) goto L_0x0181
            int r14 = r14 + 1
            r13[r7] = r14
            int r8 = r8 + 1
            goto L_0x016e
        L_0x0181:
            r11 = r13[r7]
            if (r11 < r1) goto L_0x0186
            goto L_0x01a7
        L_0x0186:
            r1 = r13[r2]
            r12 = r13[r4]
            int r1 = r1 + r12
            r12 = r13[r5]
            int r1 = r1 + r12
            r12 = r13[r6]
            int r1 = r1 + r12
            int r1 = r1 + r11
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r11 = 5
            int r1 = r1 * r11
            if (r1 < r3) goto L_0x019c
            goto L_0x01a7
        L_0x019c:
            boolean r1 = c(r13)
            if (r1 == 0) goto L_0x01a7
            float r14 = a(r13, r8)
            goto L_0x01a9
        L_0x01a7:
            r14 = 2143289344(0x7fc00000, float:NaN)
        L_0x01a9:
            boolean r1 = java.lang.Float.isNaN(r14)
            if (r1 != 0) goto L_0x0354
            int r1 = (int) r14
            int[] r8 = r0.f16185d
            java.util.Arrays.fill(r8, r2)
            int[] r8 = r0.f16185d
            r11 = r2
        L_0x01b8:
            if (r10 < r11) goto L_0x01d0
            if (r1 < r11) goto L_0x01d0
            cd.b r12 = r0.f16182a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.b(r13, r15)
            if (r12 == 0) goto L_0x01d0
            r12 = r8[r5]
            int r12 = r12 + r4
            r8[r5] = r12
            int r11 = r11 + 1
            goto L_0x01b8
        L_0x01d0:
            r12 = r8[r5]
            if (r12 != 0) goto L_0x01d5
            goto L_0x020e
        L_0x01d5:
            if (r10 < r11) goto L_0x01ed
            if (r1 < r11) goto L_0x01ed
            cd.b r12 = r0.f16182a
            int r15 = r1 - r11
            int r13 = r10 - r11
            boolean r12 = r12.b(r15, r13)
            if (r12 != 0) goto L_0x01ed
            r12 = r8[r4]
            int r12 = r12 + r4
            r8[r4] = r12
            int r11 = r11 + 1
            goto L_0x01d5
        L_0x01ed:
            r12 = r8[r4]
            if (r12 != 0) goto L_0x01f2
            goto L_0x020e
        L_0x01f2:
            if (r10 < r11) goto L_0x020a
            if (r1 < r11) goto L_0x020a
            cd.b r12 = r0.f16182a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.b(r13, r15)
            if (r12 == 0) goto L_0x020a
            r12 = r8[r2]
            int r12 = r12 + r4
            r8[r2] = r12
            int r11 = r11 + 1
            goto L_0x01f2
        L_0x020a:
            r11 = r8[r2]
            if (r11 != 0) goto L_0x0211
        L_0x020e:
            r7 = r2
            goto L_0x02d3
        L_0x0211:
            cd.b r11 = r0.f16182a
            int r12 = r11.f4690b
            int r11 = r11.f4689a
            r13 = r4
        L_0x0218:
            int r15 = r10 + r13
            if (r15 >= r12) goto L_0x0232
            int r2 = r1 + r13
            if (r2 >= r11) goto L_0x0232
            cd.b r7 = r0.f16182a
            boolean r2 = r7.b(r2, r15)
            if (r2 == 0) goto L_0x0232
            r2 = r8[r5]
            int r2 = r2 + r4
            r8[r5] = r2
            int r13 = r13 + 1
            r2 = 0
            r7 = 4
            goto L_0x0218
        L_0x0232:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x024a
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x024a
            cd.b r15 = r0.f16182a
            boolean r2 = r15.b(r7, r2)
            if (r2 != 0) goto L_0x024a
            r2 = r8[r6]
            int r2 = r2 + r4
            r8[r6] = r2
            int r13 = r13 + 1
            goto L_0x0232
        L_0x024a:
            r2 = r8[r6]
            if (r2 != 0) goto L_0x0250
            goto L_0x02d2
        L_0x0250:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x0269
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x0269
            cd.b r15 = r0.f16182a
            boolean r2 = r15.b(r7, r2)
            if (r2 == 0) goto L_0x0269
            r2 = 4
            r7 = r8[r2]
            int r7 = r7 + r4
            r8[r2] = r7
            int r13 = r13 + 1
            goto L_0x0250
        L_0x0269:
            r2 = 4
            r1 = r8[r2]
            if (r1 != 0) goto L_0x026f
            goto L_0x02d2
        L_0x026f:
            r1 = 0
            r2 = 0
            r7 = 5
        L_0x0272:
            if (r1 >= r7) goto L_0x027d
            r10 = r8[r1]
            if (r10 != 0) goto L_0x0279
            goto L_0x02d2
        L_0x0279:
            int r2 = r2 + r10
            int r1 = r1 + 1
            goto L_0x0272
        L_0x027d:
            r1 = 7
            if (r2 >= r1) goto L_0x0281
            goto L_0x02d2
        L_0x0281:
            float r1 = (float) r2
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r2 = 1068146622(0x3faa9fbe, float:1.333)
            float r2 = r1 / r2
            r7 = 0
            r10 = r8[r7]
            float r7 = (float) r10
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d2
            r7 = r8[r4]
            float r7 = (float) r7
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d2
            r7 = 1077936128(0x40400000, float:3.0)
            float r10 = r1 * r7
            r5 = r8[r5]
            float r5 = (float) r5
            float r10 = r10 - r5
            float r5 = java.lang.Math.abs(r10)
            float r7 = r7 * r2
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d2
            r5 = r8[r6]
            float r5 = (float) r5
            float r5 = r1 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d2
            r5 = 4
            r5 = r8[r5]
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d2
            r7 = r4
            goto L_0x02d3
        L_0x02d2:
            r7 = 0
        L_0x02d3:
            if (r7 == 0) goto L_0x0354
            float r1 = (float) r3
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r7 = 0
        L_0x02da:
            java.util.ArrayList r2 = r0.f16183b
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x033f
            java.util.ArrayList r2 = r0.f16183b
            java.lang.Object r2 = r2.get(r7)
            vd.c r2 = (vd.c) r2
            float r3 = r2.f15489b
            float r3 = r9 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0318
            float r3 = r2.f15488a
            float r3 = r14 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0318
            float r3 = r2.f16179c
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0316
            float r5 = r2.f16179c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0318
        L_0x0316:
            r3 = r4
            goto L_0x0319
        L_0x0318:
            r3 = 0
        L_0x0319:
            if (r3 == 0) goto L_0x033c
            java.util.ArrayList r3 = r0.f16183b
            int r5 = r2.f16180d
            int r6 = r5 + 1
            float r5 = (float) r5
            float r8 = r2.f15488a
            float r8 = r8 * r5
            float r8 = r8 + r14
            float r10 = (float) r6
            float r8 = r8 / r10
            float r11 = r2.f15489b
            float r11 = r11 * r5
            float r11 = r11 + r9
            float r11 = r11 / r10
            float r2 = r2.f16179c
            float r5 = r5 * r2
            float r5 = r5 + r1
            float r5 = r5 / r10
            vd.c r2 = new vd.c
            r2.<init>(r8, r11, r5, r6)
            r3.set(r7, r2)
            r2 = r4
            goto L_0x0340
        L_0x033c:
            int r7 = r7 + 1
            goto L_0x02da
        L_0x033f:
            r2 = 0
        L_0x0340:
            if (r2 != 0) goto L_0x0353
            vd.c r2 = new vd.c
            r2.<init>(r14, r9, r1, r4)
            java.util.ArrayList r1 = r0.f16183b
            r1.add(r2)
            uc.k r1 = r0.f16186e
            if (r1 == 0) goto L_0x0353
            r1.a(r2)
        L_0x0353:
            return r4
        L_0x0354:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.d.d(int, int, int[]):boolean");
    }

    public final boolean e() {
        int size = this.f16183b.size();
        Iterator it = this.f16183b.iterator();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f16180d >= 2) {
                i10++;
                f11 += cVar.f16179c;
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / ((float) size);
        Iterator it2 = this.f16183b.iterator();
        while (it2.hasNext()) {
            f10 += Math.abs(((c) it2.next()).f16179c - f12);
        }
        if (f10 <= f11 * 0.05f) {
            return true;
        }
        return false;
    }
}
