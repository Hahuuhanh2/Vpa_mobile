package j$.time.format;

import j$.time.b;
import j$.time.e;
import j$.time.temporal.o;

class k implements C0353g {

    /* renamed from: f  reason: collision with root package name */
    static final long[] f18153f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a  reason: collision with root package name */
    final o f18154a;

    /* renamed from: b  reason: collision with root package name */
    final int f18155b;

    /* renamed from: c  reason: collision with root package name */
    final int f18156c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f18157d;

    /* renamed from: e  reason: collision with root package name */
    final int f18158e;

    k(o oVar, int i10, int i11, int i12) {
        this.f18154a = oVar;
        this.f18155b = i10;
        this.f18156c = i11;
        this.f18157d = i12;
        this.f18158e = 0;
    }

    protected k(o oVar, int i10, int i11, int i12, int i13) {
        this.f18154a = oVar;
        this.f18155b = i10;
        this.f18156c = i11;
        this.f18157d = i12;
        this.f18158e = i13;
    }

    /* access modifiers changed from: package-private */
    public long b(A a10, long j10) {
        return j10;
    }

    /* access modifiers changed from: package-private */
    public boolean c(x xVar) {
        int i10 = this.f18158e;
        return i10 == -1 || (i10 > 0 && this.f18155b == this.f18156c && this.f18157d == 4);
    }

    /* access modifiers changed from: package-private */
    public int d(x xVar, long j10, int i10, int i11) {
        return xVar.o(this.f18154a, j10, i10, i11);
    }

    /* access modifiers changed from: package-private */
    public k e() {
        return this.f18158e == -1 ? this : new k(this.f18154a, this.f18155b, this.f18156c, this.f18157d, -1);
    }

    /* access modifiers changed from: package-private */
    public k f(int i10) {
        return new k(this.f18154a, this.f18155b, this.f18156c, this.f18157d, this.f18158e + i10);
    }

    public final boolean m(A a10, StringBuilder sb2) {
        Long e10 = a10.e(this.f18154a);
        if (e10 == null) {
            return false;
        }
        long b10 = b(a10, e10.longValue());
        D b11 = a10.b();
        String l10 = b10 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(b10));
        if (l10.length() <= this.f18156c) {
            b11.getClass();
            if (b10 >= 0) {
                if ((r10 = C0350d.f18143a[G.a(this.f18157d)]) != 1) {
                }
                sb2.append('+');
            } else {
                int i10 = C0350d.f18143a[G.a(this.f18157d)];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    sb2.append('-');
                } else if (i10 == 4) {
                    StringBuilder b12 = b.b("Field ");
                    b12.append(this.f18154a);
                    b12.append(" cannot be printed as the value ");
                    b12.append(b10);
                    b12.append(" cannot be negative according to the SignStyle");
                    throw new e(b12.toString());
                }
            }
            for (int i11 = 0; i11 < this.f18155b - l10.length(); i11++) {
                sb2.append('0');
            }
            sb2.append(l10);
            return true;
        }
        StringBuilder b13 = b.b("Field ");
        b13.append(this.f18154a);
        b13.append(" cannot be printed as the value ");
        b13.append(b10);
        b13.append(" exceeds the maximum print width of ");
        b13.append(this.f18156c);
        throw new e(b13.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(j$.time.format.x r20, java.lang.CharSequence r21, int r22) {
        /*
            r19 = this;
            r6 = r19
            r0 = r22
            int r1 = r21.length()
            if (r0 != r1) goto L_0x000c
            int r0 = ~r0
            return r0
        L_0x000c:
            char r2 = r21.charAt(r22)
            j$.time.format.D r3 = r20.g()
            r3.getClass()
            r3 = 43
            r4 = 4
            r5 = 2
            r7 = 0
            r8 = 0
            r9 = 1
            if (r2 != r3) goto L_0x004f
            int r2 = r6.f18157d
            boolean r3 = r20.l()
            int r10 = r6.f18155b
            int r11 = r6.f18156c
            if (r10 != r11) goto L_0x002e
            r10 = r9
            goto L_0x002f
        L_0x002e:
            r10 = r8
        L_0x002f:
            if (r2 == 0) goto L_0x004e
            int r2 = r2 + -1
            if (r2 == 0) goto L_0x0041
            if (r2 == r9) goto L_0x003d
            if (r2 == r4) goto L_0x003d
            if (r3 != 0) goto L_0x003f
            if (r10 != 0) goto L_0x003f
        L_0x003d:
            r2 = r9
            goto L_0x0044
        L_0x003f:
            r2 = r8
            goto L_0x0044
        L_0x0041:
            if (r3 != 0) goto L_0x003f
            goto L_0x003d
        L_0x0044:
            if (r2 != 0) goto L_0x0048
            int r0 = ~r0
            return r0
        L_0x0048:
            int r0 = r0 + 1
            r4 = r0
            r0 = r8
            r2 = r9
            goto L_0x0094
        L_0x004e:
            throw r7
        L_0x004f:
            j$.time.format.D r3 = r20.g()
            r3.getClass()
            r3 = 45
            if (r2 != r3) goto L_0x0085
            int r2 = r6.f18157d
            boolean r3 = r20.l()
            int r10 = r6.f18155b
            int r11 = r6.f18156c
            if (r10 != r11) goto L_0x0068
            r10 = r9
            goto L_0x0069
        L_0x0068:
            r10 = r8
        L_0x0069:
            if (r2 == 0) goto L_0x0084
            int r2 = r2 + -1
            if (r2 == 0) goto L_0x0077
            if (r2 == r9) goto L_0x0077
            if (r2 == r4) goto L_0x0077
            if (r3 != 0) goto L_0x0079
            if (r10 != 0) goto L_0x0079
        L_0x0077:
            r2 = r9
            goto L_0x007a
        L_0x0079:
            r2 = r8
        L_0x007a:
            if (r2 != 0) goto L_0x007e
            int r0 = ~r0
            return r0
        L_0x007e:
            int r0 = r0 + 1
            r4 = r0
            r2 = r8
            r0 = r9
            goto L_0x0094
        L_0x0084:
            throw r7
        L_0x0085:
            int r2 = r6.f18157d
            if (r2 != r5) goto L_0x0091
            boolean r2 = r20.l()
            if (r2 == 0) goto L_0x0091
            int r0 = ~r0
            return r0
        L_0x0091:
            r4 = r0
            r0 = r8
            r2 = r0
        L_0x0094:
            boolean r3 = r20.l()
            if (r3 != 0) goto L_0x00a3
            boolean r3 = r19.c(r20)
            if (r3 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r3 = r9
            goto L_0x00a5
        L_0x00a3:
            int r3 = r6.f18155b
        L_0x00a5:
            int r10 = r4 + r3
            if (r10 <= r1) goto L_0x00ab
            int r0 = ~r4
            return r0
        L_0x00ab:
            boolean r11 = r20.l()
            if (r11 != 0) goto L_0x00bb
            boolean r11 = r19.c(r20)
            if (r11 == 0) goto L_0x00b8
            goto L_0x00bb
        L_0x00b8:
            r11 = 9
            goto L_0x00bd
        L_0x00bb:
            int r11 = r6.f18156c
        L_0x00bd:
            int r12 = r6.f18158e
            int r12 = java.lang.Math.max(r12, r8)
            int r12 = r12 + r11
        L_0x00c4:
            if (r8 >= r5) goto L_0x012a
            int r12 = r12 + r4
            int r11 = java.lang.Math.min(r12, r1)
            r12 = r4
            r17 = r7
            r15 = 0
        L_0x00d0:
            if (r12 >= r11) goto L_0x0112
            int r18 = r12 + 1
            r5 = r21
            char r12 = r5.charAt(r12)
            j$.time.format.D r7 = r20.g()
            int r7 = r7.a(r12)
            if (r7 >= 0) goto L_0x00ea
            int r12 = r18 + -1
            if (r12 >= r10) goto L_0x0114
            int r0 = ~r4
            return r0
        L_0x00ea:
            int r12 = r18 - r4
            r13 = 18
            if (r12 <= r13) goto L_0x0108
            if (r17 != 0) goto L_0x00f6
            java.math.BigInteger r17 = java.math.BigInteger.valueOf(r15)
        L_0x00f6:
            r12 = r17
            java.math.BigInteger r13 = java.math.BigInteger.TEN
            java.math.BigInteger r12 = r12.multiply(r13)
            long r13 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r13)
            java.math.BigInteger r17 = r12.add(r7)
            goto L_0x010d
        L_0x0108:
            r12 = 10
            long r15 = r15 * r12
            long r12 = (long) r7
            long r15 = r15 + r12
        L_0x010d:
            r12 = r18
            r5 = 2
            r7 = 0
            goto L_0x00d0
        L_0x0112:
            r5 = r21
        L_0x0114:
            int r7 = r6.f18158e
            if (r7 <= 0) goto L_0x0125
            if (r8 != 0) goto L_0x0125
            int r12 = r12 - r4
            int r12 = r12 - r7
            int r12 = java.lang.Math.max(r3, r12)
            int r8 = r8 + 1
            r5 = 2
            r7 = 0
            goto L_0x00c4
        L_0x0125:
            r5 = r12
            r10 = r15
            r7 = r17
            goto L_0x012e
        L_0x012a:
            r5 = r4
            r7 = 0
            r10 = 0
        L_0x012e:
            if (r0 == 0) goto L_0x015b
            if (r7 == 0) goto L_0x0149
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0143
            boolean r0 = r20.l()
            if (r0 == 0) goto L_0x0143
            int r4 = r4 - r9
            int r0 = ~r4
            return r0
        L_0x0143:
            java.math.BigInteger r0 = r7.negate()
            r7 = r0
            goto L_0x0175
        L_0x0149:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0158
            boolean r0 = r20.l()
            if (r0 == 0) goto L_0x0158
            int r4 = r4 - r9
            int r0 = ~r4
            return r0
        L_0x0158:
            long r0 = -r10
            r2 = r0
            goto L_0x0176
        L_0x015b:
            int r0 = r6.f18157d
            r1 = 5
            if (r0 != r1) goto L_0x0175
            boolean r0 = r20.l()
            if (r0 == 0) goto L_0x0175
            int r0 = r5 - r4
            int r1 = r6.f18155b
            if (r2 == 0) goto L_0x0171
            if (r0 > r1) goto L_0x0175
            int r4 = r4 - r9
            int r0 = ~r4
            return r0
        L_0x0171:
            if (r0 <= r1) goto L_0x0175
            int r0 = ~r4
            return r0
        L_0x0175:
            r2 = r10
        L_0x0176:
            if (r7 == 0) goto L_0x0195
            int r0 = r7.bitLength()
            r1 = 63
            if (r0 <= r1) goto L_0x0188
            java.math.BigInteger r0 = java.math.BigInteger.TEN
            java.math.BigInteger r7 = r7.divide(r0)
            int r5 = r5 + -1
        L_0x0188:
            long r2 = r7.longValue()
            r0 = r19
            r1 = r20
            int r0 = r0.d(r1, r2, r4, r5)
            return r0
        L_0x0195:
            r0 = r19
            r1 = r20
            int r0 = r0.d(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.k.n(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f18155b;
        if (i10 == 1 && this.f18156c == 19 && this.f18157d == 1) {
            sb2 = b.b("Value(");
            sb2.append(this.f18154a);
        } else if (i10 == this.f18156c && this.f18157d == 4) {
            sb2 = b.b("Value(");
            sb2.append(this.f18154a);
            sb2.append(",");
            sb2.append(this.f18155b);
        } else {
            sb2 = b.b("Value(");
            sb2.append(this.f18154a);
            sb2.append(",");
            sb2.append(this.f18155b);
            sb2.append(",");
            sb2.append(this.f18156c);
            sb2.append(",");
            sb2.append(G.b(this.f18157d));
        }
        sb2.append(")");
        return sb2.toString();
    }
}
