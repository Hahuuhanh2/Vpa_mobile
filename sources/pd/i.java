package pd;

import cd.b;
import java.util.Arrays;
import z.j;

/* compiled from: PDF417ScanningDecoder */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final j f14170a = new j(16);

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static pd.c a(pd.g r15) {
        /*
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            pd.a r1 = r15.f()
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 != 0) goto L_0x0010
            r5 = r0
            goto L_0x0085
        L_0x0010:
            java.lang.Object r5 = r15.f16904b
            pd.c r5 = (pd.c) r5
            boolean r6 = r15.f14168d
            if (r6 == 0) goto L_0x001b
            uc.j r7 = r5.f14147b
            goto L_0x001d
        L_0x001b:
            uc.j r7 = r5.f14149d
        L_0x001d:
            if (r6 == 0) goto L_0x0022
            uc.j r5 = r5.f14148c
            goto L_0x0024
        L_0x0022:
            uc.j r5 = r5.f14150e
        L_0x0024:
            float r6 = r7.f15489b
            int r6 = (int) r6
            int r6 = r15.d(r6)
            float r5 = r5.f15489b
            int r5 = (int) r5
            int r5 = r15.d(r5)
            java.lang.Object r7 = r15.f16905c
            pd.d[] r7 = (pd.d[]) r7
            r9 = r2
            r8 = r3
            r10 = r4
        L_0x0039:
            if (r6 >= r5) goto L_0x0069
            r11 = r7[r6]
            if (r11 == 0) goto L_0x0066
            int r12 = r11.f14158d
            int r12 = r12 / 30
            int r12 = r12 * 3
            int r13 = r11.f14157c
            int r13 = r13 / 3
            int r13 = r13 + r12
            r11.f14159e = r13
            int r12 = r13 - r8
            if (r12 != 0) goto L_0x0053
            int r9 = r9 + 1
            goto L_0x0066
        L_0x0053:
            if (r12 != r4) goto L_0x005d
            int r10 = java.lang.Math.max(r10, r9)
            int r8 = r11.f14159e
            r9 = r4
            goto L_0x0066
        L_0x005d:
            int r11 = r1.f14144e
            if (r13 < r11) goto L_0x0064
            r7[r6] = r0
            goto L_0x0066
        L_0x0064:
            r9 = r4
            r8 = r13
        L_0x0066:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0069:
            int r1 = r1.f14144e
            int[] r5 = new int[r1]
            java.lang.Object r6 = r15.f16905c
            pd.d[] r6 = (pd.d[]) r6
            int r7 = r6.length
            r8 = r2
        L_0x0073:
            if (r8 >= r7) goto L_0x0085
            r9 = r6[r8]
            if (r9 == 0) goto L_0x0082
            int r9 = r9.f14159e
            if (r9 >= r1) goto L_0x0082
            r10 = r5[r9]
            int r10 = r10 + r4
            r5[r9] = r10
        L_0x0082:
            int r8 = r8 + 1
            goto L_0x0073
        L_0x0085:
            if (r5 != 0) goto L_0x0088
            return r0
        L_0x0088:
            int r0 = r5.length
            r1 = r2
            r6 = r3
        L_0x008b:
            if (r1 >= r0) goto L_0x0096
            r7 = r5[r1]
            int r6 = java.lang.Math.max(r6, r7)
            int r1 = r1 + 1
            goto L_0x008b
        L_0x0096:
            int r0 = r5.length
            r1 = r2
            r7 = r1
        L_0x0099:
            if (r1 >= r0) goto L_0x00a5
            r8 = r5[r1]
            int r9 = r6 - r8
            int r7 = r7 + r9
            if (r8 > 0) goto L_0x00a5
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00a5:
            java.lang.Object r0 = r15.f16905c
            pd.d[] r0 = (pd.d[]) r0
            r1 = r2
        L_0x00aa:
            if (r7 <= 0) goto L_0x00b5
            r8 = r0[r1]
            if (r8 != 0) goto L_0x00b5
            int r7 = r7 + -1
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00b5:
            int r1 = r5.length
            int r1 = r1 - r4
            r8 = r2
        L_0x00b8:
            if (r1 < 0) goto L_0x00c4
            r9 = r5[r1]
            int r10 = r6 - r9
            int r8 = r8 + r10
            if (r9 > 0) goto L_0x00c4
            int r1 = r1 + -1
            goto L_0x00b8
        L_0x00c4:
            int r1 = r0.length
            int r1 = r1 - r4
        L_0x00c6:
            if (r8 <= 0) goto L_0x00d1
            r4 = r0[r1]
            if (r4 != 0) goto L_0x00d1
            int r8 = r8 + -1
            int r1 = r1 + -1
            goto L_0x00c6
        L_0x00d1:
            java.lang.Object r0 = r15.f16904b
            pd.c r0 = (pd.c) r0
            boolean r15 = r15.f14168d
            uc.j r1 = r0.f14147b
            uc.j r4 = r0.f14148c
            uc.j r5 = r0.f14149d
            uc.j r6 = r0.f14150e
            if (r7 <= 0) goto L_0x00fd
            if (r15 == 0) goto L_0x00e5
            r9 = r1
            goto L_0x00e6
        L_0x00e5:
            r9 = r5
        L_0x00e6:
            float r10 = r9.f15489b
            int r10 = (int) r10
            int r10 = r10 - r7
            if (r10 >= 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r2 = r10
        L_0x00ee:
            uc.j r7 = new uc.j
            float r9 = r9.f15488a
            float r2 = (float) r2
            r7.<init>(r9, r2)
            if (r15 == 0) goto L_0x00fa
            r1 = r7
            goto L_0x00fd
        L_0x00fa:
            r11 = r1
            r13 = r7
            goto L_0x00ff
        L_0x00fd:
            r11 = r1
            r13 = r5
        L_0x00ff:
            if (r8 <= 0) goto L_0x0121
            if (r15 == 0) goto L_0x0105
            r1 = r4
            goto L_0x0106
        L_0x0105:
            r1 = r6
        L_0x0106:
            float r2 = r1.f15489b
            int r2 = (int) r2
            int r2 = r2 + r8
            cd.b r5 = r0.f14146a
            int r5 = r5.f4690b
            if (r2 < r5) goto L_0x0112
            int r2 = r5 + -1
        L_0x0112:
            uc.j r3 = new uc.j
            float r1 = r1.f15488a
            float r2 = (float) r2
            r3.<init>(r1, r2)
            if (r15 == 0) goto L_0x011e
            r4 = r3
            goto L_0x0121
        L_0x011e:
            r14 = r3
            r12 = r4
            goto L_0x0123
        L_0x0121:
            r12 = r4
            r14 = r6
        L_0x0123:
            pd.c r15 = new pd.c
            cd.b r10 = r0.f14146a
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.i.a(pd.g):pd.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static cd.e b(int r20, int[] r21, int[] r22) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r0.length
            if (r2 == 0) goto L_0x04ed
            int r2 = r20 + 1
            r3 = 1
            int r2 = r3 << r2
            int r4 = r1.length
            int r5 = r2 / 2
            int r5 = r5 + 3
            if (r4 > r5) goto L_0x04e8
            if (r2 < 0) goto L_0x04e8
            r4 = 512(0x200, float:7.175E-43)
            if (r2 > r4) goto L_0x04e8
            z.j r4 = f14170a
            vl.d r5 = new vl.d
            java.lang.Object r6 = r4.f17753b
            qd.a r6 = (qd.a) r6
            r5.<init>(r6, r0)
            int[] r6 = new int[r2]
            r7 = 0
            r8 = r2
            r9 = r7
        L_0x0029:
            if (r8 <= 0) goto L_0x0041
            java.lang.Object r10 = r4.f17753b
            qd.a r10 = (qd.a) r10
            int[] r10 = r10.f14445a
            r10 = r10[r8]
            int r10 = r5.c(r10)
            int r11 = r2 - r8
            r6[r11] = r10
            if (r10 == 0) goto L_0x003e
            r9 = r3
        L_0x003e:
            int r8 = r8 + -1
            goto L_0x0029
        L_0x0041:
            r5 = 2
            if (r9 != 0) goto L_0x0046
            goto L_0x0250
        L_0x0046:
            java.lang.Object r8 = r4.f17753b
            qd.a r8 = (qd.a) r8
            vl.d r8 = r8.f14448d
            int r9 = r1.length
            r10 = r7
        L_0x004e:
            r11 = 929(0x3a1, float:1.302E-42)
            if (r10 >= r9) goto L_0x0074
            r12 = r1[r10]
            java.lang.Object r13 = r4.f17753b
            qd.a r13 = (qd.a) r13
            int r14 = r0.length
            int r14 = r14 - r3
            int r14 = r14 - r12
            int[] r12 = r13.f14445a
            r12 = r12[r14]
            vl.d r14 = new vl.d
            int[] r15 = new int[r5]
            int r12 = 929 - r12
            int r12 = r12 % r11
            r15[r7] = r12
            r15[r3] = r3
            r14.<init>(r13, r15)
            vl.d r8 = r8.m(r14)
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0074:
            vl.d r1 = new vl.d
            java.lang.Object r8 = r4.f17753b
            qd.a r8 = (qd.a) r8
            r1.<init>(r8, r6)
            java.lang.Object r6 = r4.f17753b
            qd.a r6 = (qd.a) r6
            r6.getClass()
            if (r2 < 0) goto L_0x04e2
            int r8 = r2 + 1
            int[] r8 = new int[r8]
            r8[r7] = r3
            vl.d r9 = new vl.d
            r9.<init>(r6, r8)
            int r6 = r9.g()
            int r8 = r1.g()
            if (r6 >= r8) goto L_0x00a0
            r19 = r9
            r9 = r1
            r1 = r19
        L_0x00a0:
            java.lang.Object r6 = r4.f17753b
            qd.a r6 = (qd.a) r6
            vl.d r8 = r6.f14447c
            vl.d r6 = r6.f14448d
            r19 = r8
            r8 = r6
            r6 = r19
        L_0x00ad:
            int r10 = r1.g()
            int r12 = r2 / 2
            if (r10 < r12) goto L_0x0180
            boolean r10 = r1.j()
            if (r10 != 0) goto L_0x017b
            java.lang.Object r10 = r4.f17753b
            qd.a r10 = (qd.a) r10
            vl.d r10 = r10.f14447c
            int r12 = r1.g()
            int r12 = r1.f(r12)
            java.lang.Object r13 = r4.f17753b
            qd.a r13 = (qd.a) r13
            int r12 = r13.a(r12)
        L_0x00d1:
            int r13 = r9.g()
            int r14 = r1.g()
            if (r13 < r14) goto L_0x0162
            boolean r13 = r9.j()
            if (r13 != 0) goto L_0x0162
            int r13 = r9.g()
            int r14 = r1.g()
            int r13 = r13 - r14
            java.lang.Object r14 = r4.f17753b
            qd.a r14 = (qd.a) r14
            int r15 = r9.g()
            int r15 = r9.f(r15)
            int r14 = r14.b(r15, r12)
            java.lang.Object r15 = r4.f17753b
            qd.a r15 = (qd.a) r15
            r15.getClass()
            if (r13 < 0) goto L_0x015c
            if (r14 != 0) goto L_0x0108
            vl.d r15 = r15.f14447c
            goto L_0x0114
        L_0x0108:
            int r5 = r13 + 1
            int[] r5 = new int[r5]
            r5[r7] = r14
            vl.d r3 = new vl.d
            r3.<init>(r15, r5)
            r15 = r3
        L_0x0114:
            vl.d r10 = r10.b(r15)
            if (r13 < 0) goto L_0x0156
            if (r14 != 0) goto L_0x0123
            java.lang.Object r3 = r1.f23362b
            qd.a r3 = (qd.a) r3
            vl.d r3 = r3.f14447c
            goto L_0x014c
        L_0x0123:
            java.lang.Object r3 = r1.f23363c
            int[] r3 = (int[]) r3
            int r3 = r3.length
            int r13 = r13 + r3
            int[] r5 = new int[r13]
            r13 = r7
        L_0x012c:
            if (r13 >= r3) goto L_0x0143
            java.lang.Object r15 = r1.f23362b
            qd.a r15 = (qd.a) r15
            java.lang.Object r11 = r1.f23363c
            int[] r11 = (int[]) r11
            r11 = r11[r13]
            int r11 = r15.b(r11, r14)
            r5[r13] = r11
            int r13 = r13 + 1
            r11 = 929(0x3a1, float:1.302E-42)
            goto L_0x012c
        L_0x0143:
            vl.d r3 = new vl.d
            java.lang.Object r11 = r1.f23362b
            qd.a r11 = (qd.a) r11
            r3.<init>(r11, r5)
        L_0x014c:
            vl.d r9 = r9.r(r3)
            r3 = 1
            r5 = 2
            r11 = 929(0x3a1, float:1.302E-42)
            goto L_0x00d1
        L_0x0156:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x015c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0162:
            vl.d r3 = r10.m(r8)
            vl.d r3 = r3.r(r6)
            vl.d r3 = r3.n()
            r6 = r8
            r5 = 2
            r11 = 929(0x3a1, float:1.302E-42)
            r8 = r3
            r3 = 1
            r19 = r9
            r9 = r1
            r1 = r19
            goto L_0x00ad
        L_0x017b:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x0180:
            int r3 = r8.f(r7)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r5 = r4.f17753b
            qd.a r5 = (qd.a) r5
            int r3 = r5.a(r3)
            vl.d r5 = r8.l(r3)
            vl.d r1 = r1.l(r3)
            int r3 = r5.g()
            int[] r6 = new int[r3]
            r9 = r7
            r8 = 1
        L_0x019e:
            java.lang.Object r10 = r4.f17753b
            qd.a r10 = (qd.a) r10
            r10.getClass()
            r10 = 929(0x3a1, float:1.302E-42)
            if (r8 >= r10) goto L_0x01c0
            if (r9 >= r3) goto L_0x01c0
            int r10 = r5.c(r8)
            if (r10 != 0) goto L_0x01bd
            java.lang.Object r10 = r4.f17753b
            qd.a r10 = (qd.a) r10
            int r10 = r10.a(r8)
            r6[r9] = r10
            int r9 = r9 + 1
        L_0x01bd:
            int r8 = r8 + 1
            goto L_0x019e
        L_0x01c0:
            if (r9 != r3) goto L_0x04d8
            int r8 = r5.g()
            int[] r9 = new int[r8]
            r10 = 1
        L_0x01c9:
            if (r10 > r8) goto L_0x01de
            int r11 = r8 - r10
            java.lang.Object r12 = r4.f17753b
            qd.a r12 = (qd.a) r12
            int r13 = r5.f(r10)
            int r12 = r12.b(r10, r13)
            r9[r11] = r12
            int r10 = r10 + 1
            goto L_0x01c9
        L_0x01de:
            vl.d r5 = new vl.d
            java.lang.Object r8 = r4.f17753b
            qd.a r8 = (qd.a) r8
            r5.<init>(r8, r9)
            int[] r8 = new int[r3]
            r9 = r7
        L_0x01ea:
            if (r9 >= r3) goto L_0x021f
            java.lang.Object r10 = r4.f17753b
            qd.a r10 = (qd.a) r10
            r11 = r6[r9]
            int r10 = r10.a(r11)
            java.lang.Object r11 = r4.f17753b
            qd.a r11 = (qd.a) r11
            int r12 = r1.c(r10)
            r11.getClass()
            r11 = 929(0x3a1, float:1.302E-42)
            int r12 = 929 - r12
            int r12 = r12 % r11
            java.lang.Object r11 = r4.f17753b
            qd.a r11 = (qd.a) r11
            int r10 = r5.c(r10)
            int r10 = r11.a(r10)
            java.lang.Object r11 = r4.f17753b
            qd.a r11 = (qd.a) r11
            int r10 = r11.b(r12, r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x01ea
        L_0x021f:
            r1 = r7
        L_0x0220:
            if (r1 >= r3) goto L_0x0250
            int r5 = r0.length
            r9 = 1
            int r5 = r5 - r9
            java.lang.Object r9 = r4.f17753b
            qd.a r9 = (qd.a) r9
            r10 = r6[r1]
            if (r10 == 0) goto L_0x0247
            int[] r9 = r9.f14446b
            r9 = r9[r10]
            int r5 = r5 - r9
            if (r5 < 0) goto L_0x0242
            r9 = r0[r5]
            r10 = r8[r1]
            r11 = 929(0x3a1, float:1.302E-42)
            int r9 = r9 + r11
            int r9 = r9 - r10
            int r9 = r9 % r11
            r0[r5] = r9
            int r1 = r1 + 1
            goto L_0x0220
        L_0x0242:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x0247:
            r9.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0250:
            int r1 = r0.length
            r3 = 4
            if (r1 < r3) goto L_0x04d3
            r1 = r0[r7]
            int r3 = r0.length
            if (r1 > r3) goto L_0x04ce
            if (r1 != 0) goto L_0x0268
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0263
            int r1 = r0.length
            int r1 = r1 - r2
            r0[r7] = r1
            goto L_0x0268
        L_0x0263:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0268:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            char[] r2 = pd.e.f14160a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            r4 = 1
            int r3 = r3 << r4
            r2.<init>(r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.ISO_8859_1
            r5 = r0[r4]
            od.b r4 = new od.b
            r4.<init>()
            r6 = 2
        L_0x0280:
            r8 = r0[r7]
            if (r6 >= r8) goto L_0x04b6
            r9 = 913(0x391, float:1.28E-42)
            if (r5 == r9) goto L_0x049f
            r9 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 900: goto L_0x02a2;
                case 901: goto L_0x029e;
                case 902: goto L_0x0298;
                default: goto L_0x028d;
            }
        L_0x028d:
            switch(r5) {
                case 922: goto L_0x049a;
                case 923: goto L_0x049a;
                case 924: goto L_0x029e;
                case 925: goto L_0x03ae;
                case 926: goto L_0x03a8;
                case 927: goto L_0x0381;
                case 928: goto L_0x02a8;
                default: goto L_0x0290;
            }
        L_0x0290:
            int r6 = r6 + -1
            int r5 = pd.e.c(r0, r6, r2)
            goto L_0x04a7
        L_0x0298:
            int r5 = pd.e.b(r0, r6, r2)
            goto L_0x04a7
        L_0x029e:
            r8 = 2
            r11 = 1
            goto L_0x03b4
        L_0x02a2:
            int r5 = pd.e.c(r0, r6, r2)
            goto L_0x04a7
        L_0x02a8:
            int r5 = r6 + 2
            if (r5 > r8) goto L_0x037c
            r8 = 2
            int[] r5 = new int[r8]
            r9 = r7
        L_0x02b0:
            if (r9 >= r8) goto L_0x02bb
            r10 = r0[r6]
            r5[r9] = r10
            int r9 = r9 + 1
            int r6 = r6 + 1
            goto L_0x02b0
        L_0x02bb:
            java.lang.String r5 = pd.e.a(r5, r8)
            java.lang.Integer.parseInt(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r5 = pd.e.c(r0, r6, r5)
            r6 = r0[r5]
            r9 = 923(0x39b, float:1.293E-42)
            r10 = -1
            if (r6 != r9) goto L_0x02d5
            int r6 = r5 + 1
            goto L_0x02d6
        L_0x02d5:
            r6 = r10
        L_0x02d6:
            r11 = r0[r7]
            if (r5 >= r11) goto L_0x036b
            r11 = r0[r5]
            r12 = 922(0x39a, float:1.292E-42)
            if (r11 == r12) goto L_0x0364
            if (r11 != r9) goto L_0x035f
            int r5 = r5 + 1
            r11 = r0[r5]
            switch(r11) {
                case 0: goto L_0x0352;
                case 1: goto L_0x033f;
                case 2: goto L_0x032c;
                case 3: goto L_0x0320;
                case 4: goto L_0x0314;
                case 5: goto L_0x0301;
                case 6: goto L_0x02ee;
                default: goto L_0x02e9;
            }
        L_0x02e9:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x02ee:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r5 = r5 + 1
            int r5 = pd.e.b(r0, r5, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Integer.parseInt(r11)
            goto L_0x02d6
        L_0x0301:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r5 = r5 + 1
            int r5 = pd.e.b(r0, r5, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Long.parseLong(r11)
            goto L_0x02d6
        L_0x0314:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r5 = r5 + 1
            int r5 = pd.e.c(r0, r5, r11)
            goto L_0x02d6
        L_0x0320:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r5 = r5 + 1
            int r5 = pd.e.c(r0, r5, r11)
            goto L_0x02d6
        L_0x032c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r5 = r5 + 1
            int r5 = pd.e.b(r0, r5, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Long.parseLong(r11)
            goto L_0x02d6
        L_0x033f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r5 = r5 + 1
            int r5 = pd.e.b(r0, r5, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Integer.parseInt(r11)
            goto L_0x02d6
        L_0x0352:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r5 = r5 + 1
            int r5 = pd.e.c(r0, r5, r11)
            goto L_0x02d6
        L_0x035f:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0364:
            int r5 = r5 + 1
            r11 = 1
            r4.f13864a = r11
            goto L_0x02d6
        L_0x036b:
            r11 = 1
            if (r6 == r10) goto L_0x04a7
            int r9 = r5 - r6
            boolean r10 = r4.f13864a
            if (r10 == 0) goto L_0x0376
            int r9 = r9 + -1
        L_0x0376:
            int r9 = r9 + r6
            java.util.Arrays.copyOfRange(r0, r6, r9)
            goto L_0x04a7
        L_0x037c:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0381:
            r8 = 2
            r11 = 1
            int r5 = r6 + 1
            r3 = r0[r6]
            java.util.HashMap r6 = cd.d.f4696c
            if (r3 < 0) goto L_0x03a3
            if (r3 >= r9) goto L_0x03a3
            java.util.HashMap r6 = cd.d.f4696c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r6.get(r3)
            cd.d r3 = (cd.d) r3
            java.lang.String r3 = r3.name()
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            goto L_0x04a7
        L_0x03a3:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x03a8:
            r8 = 2
            r11 = 1
            int r5 = r6 + 2
            goto L_0x04a7
        L_0x03ae:
            r8 = 2
            r11 = 1
            int r5 = r6 + 1
            goto L_0x04a7
        L_0x03b4:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            r12 = 901(0x385, float:1.263E-42)
            r15 = 900(0x384, double:4.447E-321)
            r8 = 6
            r11 = 928(0x3a0, float:1.3E-42)
            if (r5 == r12) goto L_0x0419
            r12 = 924(0x39c, float:1.295E-42)
            if (r5 == r12) goto L_0x03c8
        L_0x03c6:
            r13 = r10
            goto L_0x0416
        L_0x03c8:
            r5 = r7
        L_0x03c9:
            r12 = r7
            r17 = 0
        L_0x03cc:
            r13 = r0[r7]
            if (r6 >= r13) goto L_0x03c6
            if (r5 != 0) goto L_0x03c6
            int r13 = r6 + 1
            r6 = r0[r6]
            if (r6 >= r9) goto L_0x03e2
            int r12 = r12 + 1
            long r17 = r17 * r15
            r22 = r10
            long r9 = (long) r6
            long r17 = r17 + r9
            goto L_0x03ec
        L_0x03e2:
            r22 = r10
            if (r6 == r11) goto L_0x03ee
            switch(r6) {
                case 900: goto L_0x03ee;
                case 901: goto L_0x03ee;
                case 902: goto L_0x03ee;
                default: goto L_0x03e9;
            }
        L_0x03e9:
            switch(r6) {
                case 922: goto L_0x03ee;
                case 923: goto L_0x03ee;
                case 924: goto L_0x03ee;
                default: goto L_0x03ec;
            }
        L_0x03ec:
            r6 = r13
            goto L_0x03f2
        L_0x03ee:
            int r13 = r13 + -1
            r6 = r13
            r5 = 1
        L_0x03f2:
            int r9 = r12 % 5
            if (r9 != 0) goto L_0x0410
            if (r12 <= 0) goto L_0x0410
            r9 = r7
        L_0x03f9:
            if (r9 >= r8) goto L_0x040b
            int r10 = 5 - r9
            int r10 = r10 * 8
            long r12 = r17 >> r10
            int r10 = (int) r12
            byte r10 = (byte) r10
            r13 = r22
            r13.write(r10)
            int r9 = r9 + 1
            goto L_0x03f9
        L_0x040b:
            r10 = r22
            r9 = 900(0x384, float:1.261E-42)
            goto L_0x03c9
        L_0x0410:
            r13 = r22
            r10 = r13
            r9 = 900(0x384, float:1.261E-42)
            goto L_0x03cc
        L_0x0416:
            r5 = r6
            goto L_0x048d
        L_0x0419:
            r13 = r10
            int[] r5 = new int[r8]
            int r9 = r6 + 1
            r6 = r0[r6]
            r10 = r7
        L_0x0421:
            r12 = r7
            r17 = 0
            r19 = r10
            r10 = r9
            r9 = r19
        L_0x0429:
            r14 = r0[r7]
            if (r10 >= r14) goto L_0x0475
            if (r9 != 0) goto L_0x0475
            int r14 = r12 + 1
            r5[r12] = r6
            long r17 = r17 * r15
            long r7 = (long) r6
            long r17 = r17 + r7
            int r6 = r10 + 1
            r7 = r0[r10]
            if (r7 == r11) goto L_0x046b
            switch(r7) {
                case 900: goto L_0x046b;
                case 901: goto L_0x046b;
                case 902: goto L_0x046b;
                default: goto L_0x0441;
            }
        L_0x0441:
            switch(r7) {
                case 922: goto L_0x046b;
                case 923: goto L_0x046b;
                case 924: goto L_0x046b;
                default: goto L_0x0444;
            }
        L_0x0444:
            int r8 = r14 % 5
            if (r8 != 0) goto L_0x0465
            if (r14 <= 0) goto L_0x0465
            r8 = 0
            r10 = 6
        L_0x044c:
            if (r8 >= r10) goto L_0x045f
            int r12 = 5 - r8
            int r12 = r12 * 8
            long r10 = r17 >> r12
            int r10 = (int) r10
            byte r10 = (byte) r10
            r13.write(r10)
            int r8 = r8 + 1
            r10 = 6
            r11 = 928(0x3a0, float:1.3E-42)
            goto L_0x044c
        L_0x045f:
            r8 = r10
            r10 = r9
            r9 = r6
            r6 = r7
            r7 = 0
            goto L_0x0421
        L_0x0465:
            r10 = r6
            r6 = r7
            r12 = r14
            r7 = 0
            r8 = 6
            goto L_0x0472
        L_0x046b:
            int r10 = r6 + -1
            r6 = r7
            r12 = r14
            r7 = 0
            r8 = 6
            r9 = 1
        L_0x0472:
            r11 = 928(0x3a0, float:1.3E-42)
            goto L_0x0429
        L_0x0475:
            if (r10 != r14) goto L_0x0480
            r7 = 900(0x384, float:1.261E-42)
            if (r6 >= r7) goto L_0x0480
            int r7 = r12 + 1
            r5[r12] = r6
            r12 = r7
        L_0x0480:
            r6 = 0
        L_0x0481:
            if (r6 >= r12) goto L_0x048c
            r7 = r5[r6]
            byte r7 = (byte) r7
            r13.write(r7)
            int r6 = r6 + 1
            goto L_0x0481
        L_0x048c:
            r5 = r10
        L_0x048d:
            java.lang.String r6 = new java.lang.String
            byte[] r7 = r13.toByteArray()
            r6.<init>(r7, r3)
            r2.append(r6)
            goto L_0x04a7
        L_0x049a:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x049f:
            int r5 = r6 + 1
            r6 = r0[r6]
            char r6 = (char) r6
            r2.append(r6)
        L_0x04a7:
            int r6 = r0.length
            if (r5 >= r6) goto L_0x04b1
            int r6 = r5 + 1
            r5 = r0[r5]
            r7 = 0
            goto L_0x0280
        L_0x04b1:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x04b6:
            int r0 = r2.length()
            if (r0 == 0) goto L_0x04c9
            cd.e r0 = new cd.e
            java.lang.String r2 = r2.toString()
            r3 = 0
            r0.<init>(r3, r2, r3, r1)
            r0.f4705e = r4
            return r0
        L_0x04c9:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x04ce:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x04d3:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x04d8:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x04dd:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x04e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x04e8:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x04ed:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.i.b(int, int[], int[]):cd.e");
    }

    public static d c(b bVar, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        b bVar2 = bVar;
        int i22 = i10;
        int i23 = i11;
        int i24 = i13;
        if (z10) {
            i16 = -1;
        } else {
            i16 = 1;
        }
        boolean z12 = z10;
        int i25 = i12;
        int i26 = 0;
        loop0:
        while (true) {
            if (i26 >= 2) {
                break;
            }
            while (true) {
                if (!z12) {
                    if (i25 >= i23) {
                        continue;
                        break;
                    }
                } else if (i25 < i22) {
                    continue;
                    break;
                }
                if (z12 != bVar2.b(i25, i24)) {
                    continue;
                    break;
                } else if (Math.abs(i12 - i25) > 2) {
                    i25 = i12;
                    break loop0;
                } else {
                    i25 += i16;
                }
            }
            i16 = -i16;
            z12 = !z12;
            i26++;
        }
        int[] iArr = new int[8];
        if (z10) {
            i17 = 1;
        } else {
            i17 = -1;
        }
        boolean z13 = z10;
        int i27 = 0;
        int i28 = i25;
        while (true) {
            if (!z10) {
                if (i28 < i22) {
                    break;
                }
            } else if (i28 >= i23) {
                break;
            }
            if (i27 >= 8) {
                break;
            } else if (bVar2.b(i28, i24) == z13) {
                iArr[i27] = iArr[i27] + 1;
                i28 += i17;
            } else {
                i27++;
                z13 = !z13;
            }
        }
        if (i27 != 8) {
            if (z10) {
                i22 = i23;
            }
            if (!(i28 == i22 && i27 == 7)) {
                iArr = null;
            }
        }
        if (iArr == null) {
            return null;
        }
        int Z = m9.b.Z(iArr);
        if (z10) {
            i18 = i25 + Z;
        } else {
            for (int i29 = 0; i29 < iArr.length / 2; i29++) {
                int i30 = iArr[i29];
                iArr[i29] = iArr[(iArr.length - 1) - i29];
                iArr[(iArr.length - 1) - i29] = i30;
            }
            int i31 = i25;
            i25 -= Z;
            i18 = i31;
        }
        if (i14 - 2 > Z || Z > i15 + 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return null;
        }
        float[][] fArr = h.f14169a;
        float Z2 = (float) m9.b.Z(iArr);
        int[] iArr2 = new int[8];
        int i32 = 0;
        int i33 = 0;
        for (int i34 = 0; i34 < 17; i34++) {
            float f10 = ((((float) i34) * Z2) / 17.0f) + (Z2 / 34.0f);
            int i35 = iArr[i32] + i33;
            if (((float) i35) <= f10) {
                i32++;
                i33 = i35;
            }
            iArr2[i32] = iArr2[i32] + 1;
        }
        long j10 = 0;
        for (int i36 = 0; i36 < 8; i36++) {
            for (int i37 = 0; i37 < iArr2[i36]; i37++) {
                long j11 = j10 << 1;
                if (i36 % 2 == 0) {
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                j10 = j11 | ((long) i21);
            }
        }
        int i38 = (int) j10;
        int binarySearch = Arrays.binarySearch(m9.b.F, i38 & 262143);
        if (binarySearch < 0) {
            i19 = -1;
        } else {
            i19 = (m9.b.G[binarySearch] - 1) % 929;
        }
        if (i19 == -1) {
            i38 = -1;
        }
        if (i38 == -1) {
            int Z3 = m9.b.Z(iArr);
            float[] fArr2 = new float[8];
            if (Z3 > 1) {
                for (int i39 = 0; i39 < 8; i39++) {
                    fArr2[i39] = ((float) iArr[i39]) / ((float) Z3);
                }
            }
            float f11 = Float.MAX_VALUE;
            i38 = -1;
            int i40 = 0;
            while (true) {
                float[][] fArr3 = h.f14169a;
                if (i40 >= fArr3.length) {
                    break;
                }
                float f12 = 0.0f;
                float[] fArr4 = fArr3[i40];
                for (int i41 = 0; i41 < 8; i41++) {
                    float f13 = fArr4[i41] - fArr2[i41];
                    f12 += f13 * f13;
                    if (f12 >= f11) {
                        break;
                    }
                }
                if (f12 < f11) {
                    i38 = m9.b.F[i40];
                    f11 = f12;
                }
                i40++;
            }
        }
        int binarySearch2 = Arrays.binarySearch(m9.b.F, i38 & 262143);
        if (binarySearch2 < 0) {
            i20 = -1;
        } else {
            i20 = (m9.b.G[binarySearch2] - 1) % 929;
        }
        if (i20 == -1) {
            return null;
        }
        int[] iArr3 = new int[8];
        int i42 = 0;
        int i43 = 7;
        while (true) {
            int i44 = i38 & 1;
            if (i44 != i42) {
                i43--;
                if (i43 < 0) {
                    return new d(i25, i18, ((((iArr3[0] - iArr3[2]) + iArr3[4]) - iArr3[6]) + 9) % 9, i20);
                }
                i42 = i44;
            }
            iArr3[i43] = iArr3[i43] + 1;
            i38 >>= 1;
        }
    }

    public static g d(b bVar, c cVar, uc.j jVar, boolean z10, int i10, int i11) {
        int i12;
        int i13;
        c cVar2 = cVar;
        uc.j jVar2 = jVar;
        boolean z11 = z10;
        g gVar = new g(cVar2, z11);
        for (int i14 = 0; i14 < 2; i14++) {
            if (i14 == 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            int i15 = i12;
            int i16 = (int) jVar2.f15488a;
            int i17 = (int) jVar2.f15489b;
            while (i17 <= cVar2.f14154i && i17 >= cVar2.f14153h) {
                d c10 = c(bVar, 0, bVar.f4689a, z10, i16, i17, i10, i11);
                if (c10 != null) {
                    ((d[]) gVar.f16905c)[gVar.d(i17)] = c10;
                    if (z11) {
                        i13 = c10.f14155a;
                    } else {
                        i13 = c10.f14156b;
                    }
                    i16 = i13;
                }
                i17 += i15;
            }
        }
        return gVar;
    }
}
