package kd;

import java.util.Collections;
import java.util.Set;
import uc.a;

/* compiled from: Code128Writer */
public final class d extends r {
    public static int g(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 1;
        if (i10 >= length) {
            return 1;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return 4;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i12 = i10 + 1;
            i11 = 2;
            if (i12 >= length) {
                return 2;
            }
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 < '0' || charAt2 > '9') {
                return i11;
            }
            return 3;
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r7 == 101) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r10 <= 244) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        if (g(r5 + 3, r0) == 3) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009b, code lost:
        if (r11 == 2) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a6, code lost:
        if (r10 == 3) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e2, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0037 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean[] c(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r17.length()
            if (r1 <= 0) goto L_0x0147
            r2 = 80
            if (r1 > r2) goto L_0x0147
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x002d
            char r4 = r0.charAt(r3)
            switch(r4) {
                case 241: goto L_0x001a;
                case 242: goto L_0x001a;
                case 243: goto L_0x001a;
                case 244: goto L_0x001a;
                default: goto L_0x0016;
            }
        L_0x0016:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L_0x001d
        L_0x001a:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x001d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Bad character in input: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x002d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 1
            r8 = r4
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0037:
            r9 = 103(0x67, float:1.44E-43)
            if (r5 >= r1) goto L_0x0103
            int r10 = g(r5, r0)
            r11 = 32
            r12 = 100
            r13 = 101(0x65, float:1.42E-43)
            r14 = 96
            r15 = 2
            if (r10 != r15) goto L_0x004d
            if (r7 != r13) goto L_0x00ab
            goto L_0x006d
        L_0x004d:
            if (r10 != r4) goto L_0x0068
            int r10 = r17.length()
            if (r5 >= r10) goto L_0x00ab
            char r10 = r0.charAt(r5)
            if (r10 < r11) goto L_0x006d
            if (r7 != r13) goto L_0x00ab
            if (r10 < r14) goto L_0x006d
            r11 = 241(0xf1, float:3.38E-43)
            if (r10 < r11) goto L_0x00ab
            r11 = 244(0xf4, float:3.42E-43)
            if (r10 > r11) goto L_0x00ab
            goto L_0x006d
        L_0x0068:
            r11 = 4
            if (r7 != r13) goto L_0x006f
            if (r10 != r11) goto L_0x006f
        L_0x006d:
            r2 = r13
            goto L_0x00ac
        L_0x006f:
            r2 = 99
            if (r7 != r2) goto L_0x0074
            goto L_0x00a8
        L_0x0074:
            r2 = 3
            if (r7 != r12) goto L_0x009e
            if (r10 != r11) goto L_0x007a
            goto L_0x00ab
        L_0x007a:
            int r10 = r5 + 2
            int r10 = g(r10, r0)
            if (r10 == r4) goto L_0x00ab
            if (r10 != r15) goto L_0x0085
            goto L_0x00ab
        L_0x0085:
            if (r10 != r11) goto L_0x0090
            int r10 = r5 + 3
            int r10 = g(r10, r0)
            if (r10 != r2) goto L_0x00ab
            goto L_0x00a8
        L_0x0090:
            int r10 = r5 + 4
        L_0x0092:
            int r11 = g(r10, r0)
            if (r11 != r2) goto L_0x009b
            int r10 = r10 + 2
            goto L_0x0092
        L_0x009b:
            if (r11 != r15) goto L_0x00a8
            goto L_0x00ab
        L_0x009e:
            if (r10 != r11) goto L_0x00a6
            int r10 = r5 + 1
            int r10 = g(r10, r0)
        L_0x00a6:
            if (r10 != r2) goto L_0x00ab
        L_0x00a8:
            r2 = 99
            goto L_0x00ac
        L_0x00ab:
            r2 = r12
        L_0x00ac:
            if (r2 != r7) goto L_0x00e5
            char r2 = r0.charAt(r5)
            switch(r2) {
                case 241: goto L_0x00bd;
                case 242: goto L_0x00ba;
                case 243: goto L_0x00e3;
                case 244: goto L_0x00b6;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            goto L_0x00c0
        L_0x00b6:
            if (r7 != r13) goto L_0x00e2
            r12 = r13
            goto L_0x00e2
        L_0x00ba:
            r12 = 97
            goto L_0x00e2
        L_0x00bd:
            r12 = 102(0x66, float:1.43E-43)
            goto L_0x00e2
        L_0x00c0:
            if (r7 == r12) goto L_0x00dc
            if (r7 == r13) goto L_0x00d1
            int r2 = r5 + 2
            java.lang.String r2 = r0.substring(r5, r2)
            int r12 = java.lang.Integer.parseInt(r2)
            int r5 = r5 + 1
            goto L_0x00e2
        L_0x00d1:
            char r2 = r0.charAt(r5)
            int r12 = r2 + -32
            if (r12 >= 0) goto L_0x00e2
            int r12 = r12 + 96
            goto L_0x00e2
        L_0x00dc:
            char r2 = r0.charAt(r5)
            int r12 = r2 + -32
        L_0x00e2:
            r14 = r12
        L_0x00e3:
            int r5 = r5 + r4
            goto L_0x00f4
        L_0x00e5:
            if (r7 != 0) goto L_0x00f1
            if (r2 == r12) goto L_0x00ee
            if (r2 == r13) goto L_0x00f2
            r9 = 105(0x69, float:1.47E-43)
            goto L_0x00f2
        L_0x00ee:
            r9 = 104(0x68, float:1.46E-43)
            goto L_0x00f2
        L_0x00f1:
            r9 = r2
        L_0x00f2:
            r7 = r2
            r14 = r9
        L_0x00f4:
            int[][] r2 = kd.c.f12473a
            r2 = r2[r14]
            r3.add(r2)
            int r14 = r14 * r8
            int r6 = r6 + r14
            if (r5 == 0) goto L_0x0037
            int r8 = r8 + 1
            goto L_0x0037
        L_0x0103:
            int r6 = r6 % r9
            int[][] r0 = kd.c.f12473a
            r1 = r0[r6]
            r3.add(r1)
            r1 = 106(0x6a, float:1.49E-43)
            r0 = r0[r1]
            r3.add(r0)
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0117:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x012d
            java.lang.Object r2 = r0.next()
            int[] r2 = (int[]) r2
            int r5 = r2.length
            r6 = 0
        L_0x0125:
            if (r6 >= r5) goto L_0x0117
            r7 = r2[r6]
            int r1 = r1 + r7
            int r6 = r6 + 1
            goto L_0x0125
        L_0x012d:
            boolean[] r0 = new boolean[r1]
            java.util.Iterator r1 = r3.iterator()
            r2 = 0
        L_0x0134:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0146
            java.lang.Object r3 = r1.next()
            int[] r3 = (int[]) r3
            int r3 = kd.r.a(r0, r2, r3, r4)
            int r2 = r2 + r3
            goto L_0x0134
        L_0x0146:
            return r0
        L_0x0147:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Contents length should be between 1 and 80 characters, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.d.c(java.lang.String):boolean[]");
    }

    public final Set f() {
        return Collections.singleton(a.CODE_128);
    }
}
