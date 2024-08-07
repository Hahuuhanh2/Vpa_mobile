package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import j2.c;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v.v;

/* compiled from: CodedInputStream */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public int f2238a;

    /* renamed from: b  reason: collision with root package name */
    public int f2239b = 100;

    /* renamed from: c  reason: collision with root package name */
    public int f2240c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public f f2241d;

    /* compiled from: CodedInputStream */
    public static final class a extends e {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f2242e;

        /* renamed from: f  reason: collision with root package name */
        public int f2243f;

        /* renamed from: g  reason: collision with root package name */
        public int f2244g;

        /* renamed from: h  reason: collision with root package name */
        public int f2245h;

        /* renamed from: i  reason: collision with root package name */
        public int f2246i;

        /* renamed from: j  reason: collision with root package name */
        public int f2247j;

        /* renamed from: k  reason: collision with root package name */
        public int f2248k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f2242e = bArr;
            this.f2243f = i11 + i10;
            this.f2245h = i10;
            this.f2246i = i10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int A() {
            /*
                r5 = this;
                int r0 = r5.f2245h
                int r1 = r5.f2243f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f2242e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f2245h = r3
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
                long r0 = r5.C()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f2245h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.a.A():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long B() {
            /*
                r11 = this;
                int r0 = r11.f2245h
                int r1 = r11.f2243f
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f2242e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f2245h = r3
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
                long r0 = r11.C()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f2245h = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.a.B():long");
        }

        public final long C() {
            long j10 = 0;
            int i10 = 0;
            while (i10 < 64) {
                int i11 = this.f2245h;
                if (i11 != this.f2243f) {
                    byte[] bArr = this.f2242e;
                    this.f2245h = i11 + 1;
                    byte b10 = bArr[i11];
                    j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i10;
                    if ((b10 & 128) == 0) {
                        return j10;
                    }
                    i10 += 7;
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void D(int i10) {
            if (i10 >= 0) {
                int i11 = this.f2243f;
                int i12 = this.f2245h;
                if (i10 <= i11 - i12) {
                    this.f2245h = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        public final void a(int i10) {
            if (this.f2247j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        public final int b() {
            return this.f2245h - this.f2246i;
        }

        public final boolean c() {
            if (this.f2245h == this.f2243f) {
                return true;
            }
            return false;
        }

        public final void d(int i10) {
            this.f2248k = i10;
            int i11 = this.f2243f + this.f2244g;
            this.f2243f = i11;
            int i12 = i11 - this.f2246i;
            if (i12 > i10) {
                int i13 = i12 - i10;
                this.f2244g = i13;
                this.f2243f = i11 - i13;
                return;
            }
            this.f2244g = 0;
        }

        public final int e(int i10) {
            if (i10 >= 0) {
                int i11 = this.f2245h;
                int i12 = this.f2246i;
                int i13 = (i11 - i12) + i10;
                int i14 = this.f2248k;
                if (i13 <= i14) {
                    this.f2248k = i13;
                    int i15 = this.f2243f + this.f2244g;
                    this.f2243f = i15;
                    int i16 = i15 - i12;
                    if (i16 > i13) {
                        int i17 = i16 - i13;
                        this.f2244g = i17;
                        this.f2243f = i15 - i17;
                    } else {
                        this.f2244g = 0;
                    }
                    return i14;
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.d();
        }

        public final boolean f() {
            if (B() != 0) {
                return true;
            }
            return false;
        }

        public final c.e g() {
            byte[] bArr;
            int A = A();
            if (A > 0) {
                int i10 = this.f2243f;
                int i11 = this.f2245h;
                if (A <= i10 - i11) {
                    c.e l10 = c.l(this.f2242e, i11, A);
                    this.f2245h += A;
                    return l10;
                }
            }
            if (A == 0) {
                return c.f11484b;
            }
            if (A > 0) {
                int i12 = this.f2243f;
                int i13 = this.f2245h;
                if (A <= i12 - i13) {
                    int i14 = A + i13;
                    this.f2245h = i14;
                    bArr = Arrays.copyOfRange(this.f2242e, i13, i14);
                    c.e eVar = c.f11484b;
                    return new c.e(bArr);
                }
            }
            if (A > 0) {
                throw InvalidProtocolBufferException.f();
            } else if (A == 0) {
                bArr = p.f2319b;
                c.e eVar2 = c.f11484b;
                return new c.e(bArr);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final double h() {
            return Double.longBitsToDouble(z());
        }

        public final int i() {
            return A();
        }

        public final int j() {
            return y();
        }

        public final long k() {
            return z();
        }

        public final float l() {
            return Float.intBitsToFloat(y());
        }

        public final int m() {
            return A();
        }

        public final long n() {
            return B();
        }

        public final int o() {
            return y();
        }

        public final long p() {
            return z();
        }

        public final int q() {
            int A = A();
            return (-(A & 1)) ^ (A >>> 1);
        }

        public final long r() {
            long B = B();
            return (-(B & 1)) ^ (B >>> 1);
        }

        public final String s() {
            int A = A();
            if (A > 0) {
                int i10 = this.f2243f;
                int i11 = this.f2245h;
                if (A <= i10 - i11) {
                    String str = new String(this.f2242e, i11, A, p.f2318a);
                    this.f2245h += A;
                    return str;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A < 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        public final String t() {
            int A = A();
            if (A > 0) {
                int i10 = this.f2243f;
                int i11 = this.f2245h;
                if (A <= i10 - i11) {
                    String a10 = l0.f2303a.a(this.f2242e, i11, A);
                    this.f2245h += A;
                    return a10;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A <= 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        public final int u() {
            if (c()) {
                this.f2247j = 0;
                return 0;
            }
            int A = A();
            this.f2247j = A;
            if ((A >>> 3) != 0) {
                return A;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        public final int v() {
            return A();
        }

        public final long w() {
            return B();
        }

        public final boolean x(int i10) {
            int u10;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                if (this.f2243f - this.f2245h >= 10) {
                    while (i12 < 10) {
                        byte[] bArr = this.f2242e;
                        int i13 = this.f2245h;
                        this.f2245h = i13 + 1;
                        if (bArr[i13] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.c();
                }
                while (i12 < 10) {
                    int i14 = this.f2245h;
                    if (i14 != this.f2243f) {
                        byte[] bArr2 = this.f2242e;
                        this.f2245h = i14 + 1;
                        if (bArr2[i14] < 0) {
                            i12++;
                        }
                    } else {
                        throw InvalidProtocolBufferException.f();
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            } else if (i11 == 1) {
                D(8);
                return true;
            } else if (i11 == 2) {
                D(A());
                return true;
            } else if (i11 == 3) {
                do {
                    u10 = u();
                    if (u10 == 0 || !x(u10)) {
                        a(((i10 >>> 3) << 3) | 4);
                    }
                    u10 = u();
                    break;
                } while (!x(u10));
                a(((i10 >>> 3) << 3) | 4);
                return true;
            } else if (i11 == 4) {
                return false;
            } else {
                if (i11 == 5) {
                    D(4);
                    return true;
                }
                int i15 = InvalidProtocolBufferException.f2211a;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }

        public final int y() {
            int i10 = this.f2245h;
            if (this.f2243f - i10 >= 4) {
                byte[] bArr = this.f2242e;
                this.f2245h = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.f();
        }

        public final long z() {
            int i10 = this.f2245h;
            if (this.f2243f - i10 >= 8) {
                byte[] bArr = this.f2242e;
                this.f2245h = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.f();
        }
    }

    /* compiled from: CodedInputStream */
    public static final class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public final InputStream f2249e;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f2250f;

        /* renamed from: g  reason: collision with root package name */
        public int f2251g;

        /* renamed from: h  reason: collision with root package name */
        public int f2252h;

        /* renamed from: i  reason: collision with root package name */
        public int f2253i;

        /* renamed from: j  reason: collision with root package name */
        public int f2254j;

        /* renamed from: k  reason: collision with root package name */
        public int f2255k;

        /* renamed from: l  reason: collision with root package name */
        public int f2256l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = p.f2318a;
            this.f2249e = fileInputStream;
            this.f2250f = new byte[4096];
            this.f2251g = 0;
            this.f2253i = 0;
            this.f2255k = 0;
        }

        public final ArrayList A(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f2249e.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f2255k += read;
                        i11 += read;
                    } else {
                        throw InvalidProtocolBufferException.f();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int B() {
            int i10 = this.f2253i;
            if (this.f2251g - i10 < 4) {
                H(4);
                i10 = this.f2253i;
            }
            byte[] bArr = this.f2250f;
            this.f2253i = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long C() {
            int i10 = this.f2253i;
            if (this.f2251g - i10 < 8) {
                H(8);
                i10 = this.f2253i;
            }
            byte[] bArr = this.f2250f;
            this.f2253i = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int D() {
            /*
                r5 = this;
                int r0 = r5.f2253i
                int r1 = r5.f2251g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f2250f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f2253i = r3
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
                long r0 = r5.F()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f2253i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.b.D():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long E() {
            /*
                r11 = this;
                int r0 = r11.f2253i
                int r1 = r11.f2251g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f2250f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f2253i = r3
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
                long r0 = r11.F()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f2253i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.b.E():long");
        }

        public final long F() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f2253i == this.f2251g) {
                    H(1);
                }
                byte[] bArr = this.f2250f;
                int i11 = this.f2253i;
                this.f2253i = i11 + 1;
                byte b10 = bArr[i11];
                j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void G() {
            int i10 = this.f2251g + this.f2252h;
            this.f2251g = i10;
            int i11 = this.f2255k + i10;
            int i12 = this.f2256l;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f2252h = i13;
                this.f2251g = i10 - i13;
                return;
            }
            this.f2252h = 0;
        }

        public final void H(int i10) {
            if (J(i10)) {
                return;
            }
            if (i10 > (this.f2240c - this.f2255k) - this.f2253i) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.f();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            throw new java.lang.IllegalStateException(r7.f2249e.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void I(int r8) {
            /*
                r7 = this;
                int r0 = r7.f2251g
                int r1 = r7.f2253i
                int r2 = r0 - r1
                if (r8 > r2) goto L_0x000f
                if (r8 < 0) goto L_0x000f
                int r1 = r1 + r8
                r7.f2253i = r1
                goto L_0x0092
            L_0x000f:
                if (r8 < 0) goto L_0x009d
                int r2 = r7.f2255k
                int r3 = r2 + r1
                int r4 = r3 + r8
                int r5 = r7.f2256l
                if (r4 > r5) goto L_0x0093
                r7.f2255k = r3
                int r0 = r0 - r1
                r1 = 0
                r7.f2251g = r1
                r7.f2253i = r1
            L_0x0023:
                if (r0 >= r8) goto L_0x006d
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f2249e     // Catch:{ all -> 0x0063 }
                long r3 = (long) r1     // Catch:{ all -> 0x0063 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0063 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x003e
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x003e
                if (r5 != 0) goto L_0x003b
                goto L_0x006d
            L_0x003b:
                int r1 = (int) r1     // Catch:{ all -> 0x0063 }
                int r0 = r0 + r1
                goto L_0x0023
            L_0x003e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0063 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
                r3.<init>()     // Catch:{ all -> 0x0063 }
                java.io.InputStream r4 = r7.f2249e     // Catch:{ all -> 0x0063 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0063 }
                r3.append(r4)     // Catch:{ all -> 0x0063 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0063 }
                r3.append(r1)     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0063 }
                r8.<init>(r1)     // Catch:{ all -> 0x0063 }
                throw r8     // Catch:{ all -> 0x0063 }
            L_0x0063:
                r8 = move-exception
                int r1 = r7.f2255k
                int r1 = r1 + r0
                r7.f2255k = r1
                r7.G()
                throw r8
            L_0x006d:
                int r1 = r7.f2255k
                int r1 = r1 + r0
                r7.f2255k = r1
                r7.G()
                if (r0 >= r8) goto L_0x0092
                int r0 = r7.f2251g
                int r1 = r7.f2253i
                int r1 = r0 - r1
                r7.f2253i = r0
                r0 = 1
                r7.H(r0)
            L_0x0083:
                int r2 = r8 - r1
                int r3 = r7.f2251g
                if (r2 <= r3) goto L_0x0090
                int r1 = r1 + r3
                r7.f2253i = r3
                r7.H(r0)
                goto L_0x0083
            L_0x0090:
                r7.f2253i = r2
            L_0x0092:
                return
            L_0x0093:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r7.I(r5)
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.f()
                throw r8
            L_0x009d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.d()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.b.I(int):void");
        }

        public final boolean J(int i10) {
            int i11 = this.f2253i;
            int i12 = i11 + i10;
            int i13 = this.f2251g;
            if (i12 > i13) {
                int i14 = this.f2240c;
                int i15 = this.f2255k;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f2256l) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f2250f;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f2255k += i11;
                    this.f2251g -= i11;
                    this.f2253i = 0;
                }
                InputStream inputStream = this.f2249e;
                byte[] bArr2 = this.f2250f;
                int i16 = this.f2251g;
                int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f2240c - this.f2255k) - i16));
                if (read == 0 || read < -1 || read > this.f2250f.length) {
                    throw new IllegalStateException(this.f2249e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f2251g += read;
                    G();
                    if (this.f2251g >= i10) {
                        return true;
                    }
                    return J(i10);
                }
            } else {
                throw new IllegalStateException(v.d("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
        }

        public final void a(int i10) {
            if (this.f2254j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        public final int b() {
            return this.f2255k + this.f2253i;
        }

        public final boolean c() {
            if (this.f2253i != this.f2251g || J(1)) {
                return false;
            }
            return true;
        }

        public final void d(int i10) {
            this.f2256l = i10;
            G();
        }

        public final int e(int i10) {
            if (i10 >= 0) {
                int i11 = this.f2255k + this.f2253i + i10;
                int i12 = this.f2256l;
                if (i11 <= i12) {
                    this.f2256l = i11;
                    G();
                    return i12;
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.d();
        }

        public final boolean f() {
            if (E() != 0) {
                return true;
            }
            return false;
        }

        public final c.e g() {
            int D = D();
            int i10 = this.f2251g;
            int i11 = this.f2253i;
            if (D <= i10 - i11 && D > 0) {
                c.e l10 = c.l(this.f2250f, i11, D);
                this.f2253i += D;
                return l10;
            } else if (D == 0) {
                return c.f11484b;
            } else {
                byte[] z10 = z(D);
                if (z10 != null) {
                    return c.l(z10, 0, z10.length);
                }
                int i12 = this.f2253i;
                int i13 = this.f2251g;
                int i14 = i13 - i12;
                this.f2255k += i13;
                this.f2253i = 0;
                this.f2251g = 0;
                ArrayList A = A(D - i14);
                byte[] bArr = new byte[D];
                System.arraycopy(this.f2250f, i12, bArr, 0, i14);
                Iterator it = A.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    i14 += bArr2.length;
                }
                c.e eVar = c.f11484b;
                return new c.e(bArr);
            }
        }

        public final double h() {
            return Double.longBitsToDouble(C());
        }

        public final int i() {
            return D();
        }

        public final int j() {
            return B();
        }

        public final long k() {
            return C();
        }

        public final float l() {
            return Float.intBitsToFloat(B());
        }

        public final int m() {
            return D();
        }

        public final long n() {
            return E();
        }

        public final int o() {
            return B();
        }

        public final long p() {
            return C();
        }

        public final int q() {
            int D = D();
            return (-(D & 1)) ^ (D >>> 1);
        }

        public final long r() {
            long E = E();
            return (-(E & 1)) ^ (E >>> 1);
        }

        public final String s() {
            int D = D();
            if (D > 0) {
                int i10 = this.f2251g;
                int i11 = this.f2253i;
                if (D <= i10 - i11) {
                    String str = new String(this.f2250f, i11, D, p.f2318a);
                    this.f2253i += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D > this.f2251g) {
                return new String(y(D), p.f2318a);
            }
            H(D);
            String str2 = new String(this.f2250f, this.f2253i, D, p.f2318a);
            this.f2253i += D;
            return str2;
        }

        public final String t() {
            byte[] bArr;
            byte[] bArr2;
            int D = D();
            int i10 = this.f2253i;
            int i11 = this.f2251g;
            if (D <= i11 - i10 && D > 0) {
                bArr = this.f2250f;
                this.f2253i = i10 + D;
            } else if (D == 0) {
                return "";
            } else {
                if (D <= i11) {
                    H(D);
                    bArr2 = this.f2250f;
                    this.f2253i = D + 0;
                } else {
                    bArr2 = y(D);
                }
                bArr = bArr2;
                i10 = 0;
            }
            return l0.f2303a.a(bArr, i10, D);
        }

        public final int u() {
            if (c()) {
                this.f2254j = 0;
                return 0;
            }
            int D = D();
            this.f2254j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        public final int v() {
            return D();
        }

        public final long w() {
            return E();
        }

        public final boolean x(int i10) {
            int u10;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                if (this.f2251g - this.f2253i >= 10) {
                    while (i12 < 10) {
                        byte[] bArr = this.f2250f;
                        int i13 = this.f2253i;
                        this.f2253i = i13 + 1;
                        if (bArr[i13] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.c();
                }
                while (i12 < 10) {
                    if (this.f2253i == this.f2251g) {
                        H(1);
                    }
                    byte[] bArr2 = this.f2250f;
                    int i14 = this.f2253i;
                    this.f2253i = i14 + 1;
                    if (bArr2[i14] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            } else if (i11 == 1) {
                I(8);
                return true;
            } else if (i11 == 2) {
                I(D());
                return true;
            } else if (i11 == 3) {
                do {
                    u10 = u();
                    if (u10 == 0 || !x(u10)) {
                        a(((i10 >>> 3) << 3) | 4);
                    }
                    u10 = u();
                    break;
                } while (!x(u10));
                a(((i10 >>> 3) << 3) | 4);
                return true;
            } else if (i11 == 4) {
                return false;
            } else {
                if (i11 == 5) {
                    I(4);
                    return true;
                }
                int i15 = InvalidProtocolBufferException.f2211a;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }

        public final byte[] y(int i10) {
            byte[] z10 = z(i10);
            if (z10 != null) {
                return z10;
            }
            int i11 = this.f2253i;
            int i12 = this.f2251g;
            int i13 = i12 - i11;
            this.f2255k += i12;
            this.f2253i = 0;
            this.f2251g = 0;
            ArrayList A = A(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2250f, i11, bArr, 0, i13);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] z(int i10) {
            if (i10 == 0) {
                return p.f2319b;
            }
            if (i10 >= 0) {
                int i11 = this.f2255k;
                int i12 = this.f2253i;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f2240c <= 0) {
                    int i14 = this.f2256l;
                    if (i13 <= i14) {
                        int i15 = this.f2251g - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > this.f2249e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f2250f, this.f2253i, bArr, 0, i15);
                        this.f2255k += this.f2251g;
                        this.f2253i = 0;
                        this.f2251g = 0;
                        while (i15 < i10) {
                            int read = this.f2249e.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f2255k += read;
                                i15 += read;
                            } else {
                                throw InvalidProtocolBufferException.f();
                            }
                        }
                        return bArr;
                    }
                    I((i14 - i11) - i12);
                    throw InvalidProtocolBufferException.f();
                }
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    public abstract void a(int i10);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i10);

    public abstract int e(int i10);

    public abstract boolean f();

    public abstract c.e g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i10);
}
