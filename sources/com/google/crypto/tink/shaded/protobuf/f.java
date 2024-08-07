package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import j9.c;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v.v;

/* compiled from: CodedInputStream */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public int f7344a;

    /* renamed from: b  reason: collision with root package name */
    public int f7345b = 100;

    /* renamed from: c  reason: collision with root package name */
    public int f7346c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public g f7347d;

    /* compiled from: CodedInputStream */
    public static final class a extends f {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f7348e;

        /* renamed from: f  reason: collision with root package name */
        public int f7349f;

        /* renamed from: g  reason: collision with root package name */
        public int f7350g;

        /* renamed from: h  reason: collision with root package name */
        public int f7351h;

        /* renamed from: i  reason: collision with root package name */
        public int f7352i;

        /* renamed from: j  reason: collision with root package name */
        public int f7353j;

        /* renamed from: k  reason: collision with root package name */
        public int f7354k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f7348e = bArr;
            this.f7349f = i11 + i10;
            this.f7351h = i10;
            this.f7352i = i10;
        }

        public final int A() {
            int i10 = this.f7351h;
            if (this.f7349f - i10 >= 4) {
                byte[] bArr = this.f7348e;
                this.f7351h = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.g();
        }

        public final long B() {
            int i10 = this.f7351h;
            if (this.f7349f - i10 >= 8) {
                byte[] bArr = this.f7348e;
                this.f7351h = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.g();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int C() {
            /*
                r5 = this;
                int r0 = r5.f7351h
                int r1 = r5.f7349f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f7348e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f7351h = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.E()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f7351h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f.a.C():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long D() {
            /*
                r11 = this;
                int r0 = r11.f7351h
                int r1 = r11.f7349f
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f7348e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f7351h = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.E()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f7351h = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f.a.D():long");
        }

        public final long E() {
            long j10 = 0;
            int i10 = 0;
            while (i10 < 64) {
                int i11 = this.f7351h;
                if (i11 != this.f7349f) {
                    byte[] bArr = this.f7348e;
                    this.f7351h = i11 + 1;
                    byte b10 = bArr[i11];
                    j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i10;
                    if ((b10 & 128) == 0) {
                        return j10;
                    }
                    i10 += 7;
                } else {
                    throw InvalidProtocolBufferException.g();
                }
            }
            throw InvalidProtocolBufferException.d();
        }

        public final void F(int i10) {
            if (i10 >= 0) {
                int i11 = this.f7349f;
                int i12 = this.f7351h;
                if (i10 <= i11 - i12) {
                    this.f7351h = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            throw InvalidProtocolBufferException.g();
        }

        public final void a(int i10) {
            if (this.f7353j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        public final int d() {
            return this.f7351h - this.f7352i;
        }

        public final boolean e() {
            if (this.f7351h == this.f7349f) {
                return true;
            }
            return false;
        }

        public final void f(int i10) {
            this.f7354k = i10;
            int i11 = this.f7349f + this.f7350g;
            this.f7349f = i11;
            int i12 = i11 - this.f7352i;
            if (i12 > i10) {
                int i13 = i12 - i10;
                this.f7350g = i13;
                this.f7349f = i11 - i13;
                return;
            }
            this.f7350g = 0;
        }

        public final int g(int i10) {
            if (i10 >= 0) {
                int i11 = this.f7351h;
                int i12 = this.f7352i;
                int i13 = (i11 - i12) + i10;
                if (i13 >= 0) {
                    int i14 = this.f7354k;
                    if (i13 <= i14) {
                        this.f7354k = i13;
                        int i15 = this.f7349f + this.f7350g;
                        this.f7349f = i15;
                        int i16 = i15 - i12;
                        if (i16 > i13) {
                            int i17 = i16 - i13;
                            this.f7350g = i17;
                            this.f7349f = i15 - i17;
                        } else {
                            this.f7350g = 0;
                        }
                        return i14;
                    }
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.e();
        }

        public final boolean h() {
            if (D() != 0) {
                return true;
            }
            return false;
        }

        public final c.f i() {
            byte[] bArr;
            int C = C();
            if (C > 0) {
                int i10 = this.f7349f;
                int i11 = this.f7351h;
                if (C <= i10 - i11) {
                    c.f l10 = c.l(this.f7348e, i11, C);
                    this.f7351h += C;
                    return l10;
                }
            }
            if (C == 0) {
                return c.f11735b;
            }
            if (C > 0) {
                int i12 = this.f7349f;
                int i13 = this.f7351h;
                if (C <= i12 - i13) {
                    int i14 = C + i13;
                    this.f7351h = i14;
                    bArr = Arrays.copyOfRange(this.f7348e, i13, i14);
                    c.f fVar = c.f11735b;
                    return new c.f(bArr);
                }
            }
            if (C > 0) {
                throw InvalidProtocolBufferException.g();
            } else if (C == 0) {
                bArr = p.f7416b;
                c.f fVar2 = c.f11735b;
                return new c.f(bArr);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }

        public final double j() {
            return Double.longBitsToDouble(B());
        }

        public final int k() {
            return C();
        }

        public final int l() {
            return A();
        }

        public final long m() {
            return B();
        }

        public final float n() {
            return Float.intBitsToFloat(A());
        }

        public final int o() {
            return C();
        }

        public final long p() {
            return D();
        }

        public final int q() {
            return A();
        }

        public final long r() {
            return B();
        }

        public final int s() {
            return f.b(C());
        }

        public final long t() {
            return f.c(D());
        }

        public final String u() {
            int C = C();
            if (C > 0) {
                int i10 = this.f7349f;
                int i11 = this.f7351h;
                if (C <= i10 - i11) {
                    String str = new String(this.f7348e, i11, C, p.f7415a);
                    this.f7351h += C;
                    return str;
                }
            }
            if (C == 0) {
                return "";
            }
            if (C < 0) {
                throw InvalidProtocolBufferException.e();
            }
            throw InvalidProtocolBufferException.g();
        }

        public final String v() {
            int C = C();
            if (C > 0) {
                int i10 = this.f7349f;
                int i11 = this.f7351h;
                if (C <= i10 - i11) {
                    String a10 = i0.f7397a.a(this.f7348e, i11, C);
                    this.f7351h += C;
                    return a10;
                }
            }
            if (C == 0) {
                return "";
            }
            if (C <= 0) {
                throw InvalidProtocolBufferException.e();
            }
            throw InvalidProtocolBufferException.g();
        }

        public final int w() {
            if (e()) {
                this.f7353j = 0;
                return 0;
            }
            int C = C();
            this.f7353j = C;
            if ((C >>> 3) != 0) {
                return C;
            }
            throw InvalidProtocolBufferException.a();
        }

        public final int x() {
            return C();
        }

        public final long y() {
            return D();
        }

        public final boolean z(int i10) {
            int w9;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                if (this.f7349f - this.f7351h >= 10) {
                    while (i12 < 10) {
                        byte[] bArr = this.f7348e;
                        int i13 = this.f7351h;
                        this.f7351h = i13 + 1;
                        if (bArr[i13] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.d();
                }
                while (i12 < 10) {
                    int i14 = this.f7351h;
                    if (i14 != this.f7349f) {
                        byte[] bArr2 = this.f7348e;
                        this.f7351h = i14 + 1;
                        if (bArr2[i14] < 0) {
                            i12++;
                        }
                    } else {
                        throw InvalidProtocolBufferException.g();
                    }
                }
                throw InvalidProtocolBufferException.d();
                return true;
            } else if (i11 == 1) {
                F(8);
                return true;
            } else if (i11 == 2) {
                F(C());
                return true;
            } else if (i11 == 3) {
                do {
                    w9 = w();
                    if (w9 == 0 || !z(w9)) {
                        a(((i10 >>> 3) << 3) | 4);
                    }
                    w9 = w();
                    break;
                } while (!z(w9));
                a(((i10 >>> 3) << 3) | 4);
                return true;
            } else if (i11 == 4) {
                return false;
            } else {
                if (i11 == 5) {
                    F(4);
                    return true;
                }
                int i15 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    /* compiled from: CodedInputStream */
    public static final class b extends f {

        /* renamed from: e  reason: collision with root package name */
        public final InputStream f7355e;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f7356f;

        /* renamed from: g  reason: collision with root package name */
        public int f7357g;

        /* renamed from: h  reason: collision with root package name */
        public int f7358h;

        /* renamed from: i  reason: collision with root package name */
        public int f7359i;

        /* renamed from: j  reason: collision with root package name */
        public int f7360j;

        /* renamed from: k  reason: collision with root package name */
        public int f7361k;

        /* renamed from: l  reason: collision with root package name */
        public int f7362l = Integer.MAX_VALUE;

        public b(InputStream inputStream) {
            Charset charset = p.f7415a;
            if (inputStream != null) {
                this.f7355e = inputStream;
                this.f7356f = new byte[4096];
                this.f7357g = 0;
                this.f7359i = 0;
                this.f7361k = 0;
                return;
            }
            throw new NullPointerException("input");
        }

        public final byte[] A(int i10) {
            byte[] B = B(i10);
            if (B != null) {
                return B;
            }
            int i11 = this.f7359i;
            int i12 = this.f7357g;
            int i13 = i12 - i11;
            this.f7361k += i12;
            this.f7359i = 0;
            this.f7357g = 0;
            ArrayList C = C(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f7356f, i11, bArr, 0, i13);
            Iterator it = C.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] B(int i10) {
            if (i10 == 0) {
                return p.f7416b;
            }
            if (i10 >= 0) {
                int i11 = this.f7361k;
                int i12 = this.f7359i;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f7346c <= 0) {
                    int i14 = this.f7362l;
                    if (i13 <= i14) {
                        int i15 = this.f7357g - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096) {
                            try {
                                if (i16 > this.f7355e.available()) {
                                    return null;
                                }
                            } catch (InvalidProtocolBufferException e10) {
                                e10.f7325a = true;
                                throw e10;
                            }
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f7356f, this.f7359i, bArr, 0, i15);
                        this.f7361k += this.f7357g;
                        this.f7359i = 0;
                        this.f7357g = 0;
                        while (i15 < i10) {
                            try {
                                int read = this.f7355e.read(bArr, i15, i10 - i15);
                                if (read != -1) {
                                    this.f7361k += read;
                                    i15 += read;
                                } else {
                                    throw InvalidProtocolBufferException.g();
                                }
                            } catch (InvalidProtocolBufferException e11) {
                                e11.f7325a = true;
                                throw e11;
                            }
                        }
                        return bArr;
                    }
                    K((i14 - i11) - i12);
                    throw InvalidProtocolBufferException.g();
                }
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.e();
        }

        public final ArrayList C(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f7355e.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f7361k += read;
                        i11 += read;
                    } else {
                        throw InvalidProtocolBufferException.g();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int D() {
            int i10 = this.f7359i;
            if (this.f7357g - i10 < 4) {
                J(4);
                i10 = this.f7359i;
            }
            byte[] bArr = this.f7356f;
            this.f7359i = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long E() {
            int i10 = this.f7359i;
            if (this.f7357g - i10 < 8) {
                J(8);
                i10 = this.f7359i;
            }
            byte[] bArr = this.f7356f;
            this.f7359i = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int F() {
            /*
                r5 = this;
                int r0 = r5.f7359i
                int r1 = r5.f7357g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f7356f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f7359i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.H()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f7359i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f.b.F():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long G() {
            /*
                r11 = this;
                int r0 = r11.f7359i
                int r1 = r11.f7357g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f7356f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f7359i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.H()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f7359i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f.b.G():long");
        }

        public final long H() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f7359i == this.f7357g) {
                    J(1);
                }
                byte[] bArr = this.f7356f;
                int i11 = this.f7359i;
                this.f7359i = i11 + 1;
                byte b10 = bArr[i11];
                j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.d();
        }

        public final void I() {
            int i10 = this.f7357g + this.f7358h;
            this.f7357g = i10;
            int i11 = this.f7361k + i10;
            int i12 = this.f7362l;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f7358h = i13;
                this.f7357g = i10 - i13;
                return;
            }
            this.f7358h = 0;
        }

        public final void J(int i10) {
            if (L(i10)) {
                return;
            }
            if (i10 > (this.f7346c - this.f7361k) - this.f7359i) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.g();
        }

        public final void K(int i10) {
            int i11 = this.f7357g;
            int i12 = this.f7359i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f7359i = i12 + i10;
            } else if (i10 >= 0) {
                int i13 = this.f7361k;
                int i14 = i13 + i12;
                int i15 = i14 + i10;
                int i16 = this.f7362l;
                if (i15 <= i16) {
                    this.f7361k = i14;
                    int i17 = i11 - i12;
                    this.f7357g = 0;
                    this.f7359i = 0;
                    while (i17 < i10) {
                        try {
                            long j10 = (long) (i10 - i17);
                            long skip = this.f7355e.skip(j10);
                            int i18 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                            if (i18 < 0 || skip > j10) {
                                throw new IllegalStateException(this.f7355e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i18 == 0) {
                                break;
                            } else {
                                i17 += (int) skip;
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            e10.f7325a = true;
                            throw e10;
                        } catch (Throwable th2) {
                            this.f7361k += i17;
                            I();
                            throw th2;
                        }
                    }
                    this.f7361k += i17;
                    I();
                    if (i17 < i10) {
                        int i19 = this.f7357g;
                        int i20 = i19 - this.f7359i;
                        this.f7359i = i19;
                        J(1);
                        while (true) {
                            int i21 = i10 - i20;
                            int i22 = this.f7357g;
                            if (i21 > i22) {
                                i20 += i22;
                                this.f7359i = i22;
                                J(1);
                            } else {
                                this.f7359i = i21;
                                return;
                            }
                        }
                    }
                } else {
                    K((i16 - i13) - i12);
                    throw InvalidProtocolBufferException.g();
                }
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }

        public final boolean L(int i10) {
            int i11 = this.f7359i;
            int i12 = i11 + i10;
            int i13 = this.f7357g;
            if (i12 > i13) {
                int i14 = this.f7346c;
                int i15 = this.f7361k;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f7362l) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f7356f;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f7361k += i11;
                    this.f7357g -= i11;
                    this.f7359i = 0;
                }
                InputStream inputStream = this.f7355e;
                byte[] bArr2 = this.f7356f;
                int i16 = this.f7357g;
                try {
                    int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f7346c - this.f7361k) - i16));
                    if (read == 0 || read < -1 || read > this.f7356f.length) {
                        throw new IllegalStateException(this.f7355e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    } else if (read <= 0) {
                        return false;
                    } else {
                        this.f7357g += read;
                        I();
                        if (this.f7357g >= i10) {
                            return true;
                        }
                        return L(i10);
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e10.f7325a = true;
                    throw e10;
                }
            } else {
                throw new IllegalStateException(v.d("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
        }

        public final void a(int i10) {
            if (this.f7360j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        public final int d() {
            return this.f7361k + this.f7359i;
        }

        public final boolean e() {
            if (this.f7359i != this.f7357g || L(1)) {
                return false;
            }
            return true;
        }

        public final void f(int i10) {
            this.f7362l = i10;
            I();
        }

        public final int g(int i10) {
            if (i10 >= 0) {
                int i11 = this.f7361k + this.f7359i + i10;
                int i12 = this.f7362l;
                if (i11 <= i12) {
                    this.f7362l = i11;
                    I();
                    return i12;
                }
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.e();
        }

        public final boolean h() {
            if (G() != 0) {
                return true;
            }
            return false;
        }

        public final c.f i() {
            int F = F();
            int i10 = this.f7357g;
            int i11 = this.f7359i;
            if (F <= i10 - i11 && F > 0) {
                c.f l10 = c.l(this.f7356f, i11, F);
                this.f7359i += F;
                return l10;
            } else if (F == 0) {
                return c.f11735b;
            } else {
                byte[] B = B(F);
                if (B != null) {
                    return c.l(B, 0, B.length);
                }
                int i12 = this.f7359i;
                int i13 = this.f7357g;
                int i14 = i13 - i12;
                this.f7361k += i13;
                this.f7359i = 0;
                this.f7357g = 0;
                ArrayList C = C(F - i14);
                byte[] bArr = new byte[F];
                System.arraycopy(this.f7356f, i12, bArr, 0, i14);
                Iterator it = C.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    i14 += bArr2.length;
                }
                c.f fVar = c.f11735b;
                return new c.f(bArr);
            }
        }

        public final double j() {
            return Double.longBitsToDouble(E());
        }

        public final int k() {
            return F();
        }

        public final int l() {
            return D();
        }

        public final long m() {
            return E();
        }

        public final float n() {
            return Float.intBitsToFloat(D());
        }

        public final int o() {
            return F();
        }

        public final long p() {
            return G();
        }

        public final int q() {
            return D();
        }

        public final long r() {
            return E();
        }

        public final int s() {
            return f.b(F());
        }

        public final long t() {
            return f.c(G());
        }

        public final String u() {
            int F = F();
            if (F > 0) {
                int i10 = this.f7357g;
                int i11 = this.f7359i;
                if (F <= i10 - i11) {
                    String str = new String(this.f7356f, i11, F, p.f7415a);
                    this.f7359i += F;
                    return str;
                }
            }
            if (F == 0) {
                return "";
            }
            if (F > this.f7357g) {
                return new String(A(F), p.f7415a);
            }
            J(F);
            String str2 = new String(this.f7356f, this.f7359i, F, p.f7415a);
            this.f7359i += F;
            return str2;
        }

        public final String v() {
            byte[] bArr;
            byte[] bArr2;
            int F = F();
            int i10 = this.f7359i;
            int i11 = this.f7357g;
            if (F <= i11 - i10 && F > 0) {
                bArr = this.f7356f;
                this.f7359i = i10 + F;
            } else if (F == 0) {
                return "";
            } else {
                if (F <= i11) {
                    J(F);
                    bArr2 = this.f7356f;
                    this.f7359i = F + 0;
                } else {
                    bArr2 = A(F);
                }
                bArr = bArr2;
                i10 = 0;
            }
            return i0.f7397a.a(bArr, i10, F);
        }

        public final int w() {
            if (e()) {
                this.f7360j = 0;
                return 0;
            }
            int F = F();
            this.f7360j = F;
            if ((F >>> 3) != 0) {
                return F;
            }
            throw InvalidProtocolBufferException.a();
        }

        public final int x() {
            return F();
        }

        public final long y() {
            return G();
        }

        public final boolean z(int i10) {
            int w9;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                if (this.f7357g - this.f7359i >= 10) {
                    while (i12 < 10) {
                        byte[] bArr = this.f7356f;
                        int i13 = this.f7359i;
                        this.f7359i = i13 + 1;
                        if (bArr[i13] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.d();
                }
                while (i12 < 10) {
                    if (this.f7359i == this.f7357g) {
                        J(1);
                    }
                    byte[] bArr2 = this.f7356f;
                    int i14 = this.f7359i;
                    this.f7359i = i14 + 1;
                    if (bArr2[i14] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.d();
                return true;
            } else if (i11 == 1) {
                K(8);
                return true;
            } else if (i11 == 2) {
                K(F());
                return true;
            } else if (i11 == 3) {
                do {
                    w9 = w();
                    if (w9 == 0 || !z(w9)) {
                        a(((i10 >>> 3) << 3) | 4);
                    }
                    w9 = w();
                    break;
                } while (!z(w9));
                a(((i10 >>> 3) << 3) | 4);
                return true;
            } else if (i11 == 4) {
                return false;
            } else {
                if (i11 == 5) {
                    K(4);
                    return true;
                }
                int i15 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void f(int i10);

    public abstract int g(int i10);

    public abstract boolean h();

    public abstract c.f i();

    public abstract double j();

    public abstract int k();

    public abstract int l();

    public abstract long m();

    public abstract float n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract String u();

    public abstract String v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract boolean z(int i10);
}
