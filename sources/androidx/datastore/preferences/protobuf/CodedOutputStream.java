package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;
import androidx.fragment.app.o;
import f0.b0;
import f2.p;
import j2.u;
import j2.y;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends o {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f2201c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2202d = y.f11531f;

    /* renamed from: b  reason: collision with root package name */
    public g f2203b;

    public static abstract class a extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f2204e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2205f;

        /* renamed from: n  reason: collision with root package name */
        public int f2206n;

        public a(int i10) {
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f2204e = bArr;
                this.f2205f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void D0(int i10) {
            byte[] bArr = this.f2204e;
            int i11 = this.f2206n;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f2206n = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        public final void E0(long j10) {
            byte[] bArr = this.f2204e;
            int i10 = this.f2206n;
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((int) (j10 & 255));
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f2206n = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        }

        public final void F0(int i10, int i11) {
            G0((i10 << 3) | i11);
        }

        public final void G0(int i10) {
            if (CodedOutputStream.f2202d) {
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f2204e;
                    int i11 = this.f2206n;
                    this.f2206n = i11 + 1;
                    y.p(bArr, (long) i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f2204e;
                int i12 = this.f2206n;
                this.f2206n = i12 + 1;
                y.p(bArr2, (long) i12, (byte) i10);
                return;
            }
            while ((i10 & -128) != 0) {
                byte[] bArr3 = this.f2204e;
                int i13 = this.f2206n;
                this.f2206n = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f2204e;
            int i14 = this.f2206n;
            this.f2206n = i14 + 1;
            bArr4[i14] = (byte) i10;
        }

        public final void H0(long j10) {
            if (CodedOutputStream.f2202d) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f2204e;
                    int i10 = this.f2206n;
                    this.f2206n = i10 + 1;
                    y.p(bArr, (long) i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2204e;
                int i11 = this.f2206n;
                this.f2206n = i11 + 1;
                y.p(bArr2, (long) i11, (byte) ((int) j10));
                return;
            }
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f2204e;
                int i12 = this.f2206n;
                this.f2206n = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f2204e;
            int i13 = this.f2206n;
            this.f2206n = i13 + 1;
            bArr4[i13] = (byte) ((int) j10);
        }
    }

    public static class b extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f2207e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2208f;

        /* renamed from: n  reason: collision with root package name */
        public int f2209n;

        public b(byte[] bArr, int i10) {
            int i11 = 0 + i10;
            if ((0 | i10 | (bArr.length - i11)) >= 0) {
                this.f2207e = bArr;
                this.f2209n = 0;
                this.f2208f = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)}));
        }

        public final void A0(int i10) {
            if (CodedOutputStream.f2202d && !j2.a.a()) {
                int i11 = this.f2208f;
                int i12 = this.f2209n;
                if (i11 - i12 >= 5) {
                    if ((i10 & -128) == 0) {
                        byte[] bArr = this.f2207e;
                        this.f2209n = i12 + 1;
                        y.p(bArr, (long) i12, (byte) i10);
                        return;
                    }
                    byte[] bArr2 = this.f2207e;
                    this.f2209n = i12 + 1;
                    y.p(bArr2, (long) i12, (byte) (i10 | 128));
                    int i13 = i10 >>> 7;
                    if ((i13 & -128) == 0) {
                        byte[] bArr3 = this.f2207e;
                        int i14 = this.f2209n;
                        this.f2209n = i14 + 1;
                        y.p(bArr3, (long) i14, (byte) i13);
                        return;
                    }
                    byte[] bArr4 = this.f2207e;
                    int i15 = this.f2209n;
                    this.f2209n = i15 + 1;
                    y.p(bArr4, (long) i15, (byte) (i13 | 128));
                    int i16 = i13 >>> 7;
                    if ((i16 & -128) == 0) {
                        byte[] bArr5 = this.f2207e;
                        int i17 = this.f2209n;
                        this.f2209n = i17 + 1;
                        y.p(bArr5, (long) i17, (byte) i16);
                        return;
                    }
                    byte[] bArr6 = this.f2207e;
                    int i18 = this.f2209n;
                    this.f2209n = i18 + 1;
                    y.p(bArr6, (long) i18, (byte) (i16 | 128));
                    int i19 = i16 >>> 7;
                    if ((i19 & -128) == 0) {
                        byte[] bArr7 = this.f2207e;
                        int i20 = this.f2209n;
                        this.f2209n = i20 + 1;
                        y.p(bArr7, (long) i20, (byte) i19);
                        return;
                    }
                    byte[] bArr8 = this.f2207e;
                    int i21 = this.f2209n;
                    this.f2209n = i21 + 1;
                    y.p(bArr8, (long) i21, (byte) (i19 | 128));
                    byte[] bArr9 = this.f2207e;
                    int i22 = this.f2209n;
                    this.f2209n = i22 + 1;
                    y.p(bArr9, (long) i22, (byte) (i19 >>> 7));
                    return;
                }
            }
            while ((i10 & -128) != 0) {
                byte[] bArr10 = this.f2207e;
                int i23 = this.f2209n;
                this.f2209n = i23 + 1;
                bArr10[i23] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr11 = this.f2207e;
                int i24 = this.f2209n;
                this.f2209n = i24 + 1;
                bArr11[i24] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2209n), Integer.valueOf(this.f2208f), 1}), e10);
            }
        }

        public final void B0(int i10, long j10) {
            y0(i10, 0);
            C0(j10);
        }

        public final void C0(long j10) {
            if (!CodedOutputStream.f2202d || this.f2208f - this.f2209n < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f2207e;
                    int i10 = this.f2209n;
                    this.f2209n = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f2207e;
                    int i11 = this.f2209n;
                    this.f2209n = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2209n), Integer.valueOf(this.f2208f), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f2207e;
                    int i12 = this.f2209n;
                    this.f2209n = i12 + 1;
                    y.p(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f2207e;
                int i13 = this.f2209n;
                this.f2209n = i13 + 1;
                y.p(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void D0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f2207e, this.f2209n, i11);
                this.f2209n += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2209n), Integer.valueOf(this.f2208f), Integer.valueOf(i11)}), e10);
            }
        }

        public final void I(byte[] bArr, int i10, int i11) {
            D0(bArr, i10, i11);
        }

        public final void h0(byte b10) {
            try {
                byte[] bArr = this.f2207e;
                int i10 = this.f2209n;
                this.f2209n = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2209n), Integer.valueOf(this.f2208f), 1}), e10);
            }
        }

        public final void i0(int i10, boolean z10) {
            y0(i10, 0);
            h0(z10 ? (byte) 1 : 0);
        }

        public final void j0(byte[] bArr, int i10) {
            A0(i10);
            D0(bArr, 0, i10);
        }

        public final void k0(int i10, j2.c cVar) {
            y0(i10, 2);
            l0(cVar);
        }

        public final void l0(j2.c cVar) {
            A0(cVar.size());
            cVar.q(this);
        }

        public final void m0(int i10, int i11) {
            y0(i10, 5);
            n0(i11);
        }

        public final void n0(int i10) {
            try {
                byte[] bArr = this.f2207e;
                int i11 = this.f2209n;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f2209n = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2209n), Integer.valueOf(this.f2208f), 1}), e10);
            }
        }

        public final void o0(int i10, long j10) {
            y0(i10, 1);
            p0(j10);
        }

        public final void p0(long j10) {
            try {
                byte[] bArr = this.f2207e;
                int i10 = this.f2209n;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f2209n = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2209n), Integer.valueOf(this.f2208f), 1}), e10);
            }
        }

        public final void q0(int i10, int i11) {
            y0(i10, 0);
            r0(i11);
        }

        public final void r0(int i10) {
            if (i10 >= 0) {
                A0(i10);
            } else {
                C0((long) i10);
            }
        }

        public final void s0(int i10, z zVar, u uVar) {
            y0(i10, 2);
            A0(((a) zVar).h(uVar));
            uVar.i(zVar, this.f2203b);
        }

        public final void t0(z zVar) {
            A0(zVar.c());
            zVar.j(this);
        }

        public final void u0(int i10, z zVar) {
            y0(1, 3);
            z0(2, i10);
            y0(3, 2);
            t0(zVar);
            y0(1, 4);
        }

        public final void v0(int i10, j2.c cVar) {
            y0(1, 3);
            z0(2, i10);
            k0(3, cVar);
            y0(1, 4);
        }

        public final void w0(int i10, String str) {
            y0(i10, 2);
            x0(str);
        }

        public final void x0(String str) {
            int i10 = this.f2209n;
            try {
                int d02 = CodedOutputStream.d0(str.length() * 3);
                int d03 = CodedOutputStream.d0(str.length());
                if (d03 == d02) {
                    int i11 = i10 + d03;
                    this.f2209n = i11;
                    int b10 = l0.f2303a.b(str, this.f2207e, i11, this.f2208f - i11);
                    this.f2209n = i10;
                    A0((b10 - i10) - d03);
                    this.f2209n = b10;
                    return;
                }
                A0(l0.b(str));
                byte[] bArr = this.f2207e;
                int i12 = this.f2209n;
                this.f2209n = l0.f2303a.b(str, bArr, i12, this.f2208f - i12);
            } catch (l0.d e10) {
                this.f2209n = i10;
                g0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        public final void y0(int i10, int i11) {
            A0((i10 << 3) | i11);
        }

        public final void z0(int i10, int i11) {
            y0(i10, 0);
            A0(i11);
        }
    }

    public static final class c extends a {

        /* renamed from: o  reason: collision with root package name */
        public final OutputStream f2210o;

        public c(p.b bVar, int i10) {
            super(i10);
            this.f2210o = bVar;
        }

        public final void A0(int i10) {
            J0(5);
            G0(i10);
        }

        public final void B0(int i10, long j10) {
            J0(20);
            F0(i10, 0);
            H0(j10);
        }

        public final void C0(long j10) {
            J0(10);
            H0(j10);
        }

        public final void I(byte[] bArr, int i10, int i11) {
            K0(bArr, i10, i11);
        }

        public final void I0() {
            this.f2210o.write(this.f2204e, 0, this.f2206n);
            this.f2206n = 0;
        }

        public final void J0(int i10) {
            if (this.f2205f - this.f2206n < i10) {
                I0();
            }
        }

        public final void K0(byte[] bArr, int i10, int i11) {
            int i12 = this.f2205f;
            int i13 = this.f2206n;
            int i14 = i12 - i13;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, this.f2204e, i13, i11);
                this.f2206n += i11;
                return;
            }
            System.arraycopy(bArr, i10, this.f2204e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f2206n = this.f2205f;
            I0();
            if (i16 <= this.f2205f) {
                System.arraycopy(bArr, i15, this.f2204e, 0, i16);
                this.f2206n = i16;
                return;
            }
            this.f2210o.write(bArr, i15, i16);
        }

        public final void h0(byte b10) {
            if (this.f2206n == this.f2205f) {
                I0();
            }
            byte[] bArr = this.f2204e;
            int i10 = this.f2206n;
            this.f2206n = i10 + 1;
            bArr[i10] = b10;
        }

        public final void i0(int i10, boolean z10) {
            J0(11);
            F0(i10, 0);
            byte b10 = z10 ? (byte) 1 : 0;
            byte[] bArr = this.f2204e;
            int i11 = this.f2206n;
            this.f2206n = i11 + 1;
            bArr[i11] = b10;
        }

        public final void j0(byte[] bArr, int i10) {
            A0(i10);
            K0(bArr, 0, i10);
        }

        public final void k0(int i10, j2.c cVar) {
            y0(i10, 2);
            l0(cVar);
        }

        public final void l0(j2.c cVar) {
            A0(cVar.size());
            cVar.q(this);
        }

        public final void m0(int i10, int i11) {
            J0(14);
            F0(i10, 5);
            D0(i11);
        }

        public final void n0(int i10) {
            J0(4);
            D0(i10);
        }

        public final void o0(int i10, long j10) {
            J0(18);
            F0(i10, 1);
            E0(j10);
        }

        public final void p0(long j10) {
            J0(8);
            E0(j10);
        }

        public final void q0(int i10, int i11) {
            J0(20);
            F0(i10, 0);
            if (i11 >= 0) {
                G0(i11);
            } else {
                H0((long) i11);
            }
        }

        public final void r0(int i10) {
            if (i10 >= 0) {
                A0(i10);
            } else {
                C0((long) i10);
            }
        }

        public final void s0(int i10, z zVar, u uVar) {
            y0(i10, 2);
            A0(((a) zVar).h(uVar));
            uVar.i(zVar, this.f2203b);
        }

        public final void t0(z zVar) {
            A0(zVar.c());
            zVar.j(this);
        }

        public final void u0(int i10, z zVar) {
            y0(1, 3);
            z0(2, i10);
            y0(3, 2);
            t0(zVar);
            y0(1, 4);
        }

        public final void v0(int i10, j2.c cVar) {
            y0(1, 3);
            z0(2, i10);
            k0(3, cVar);
            y0(1, 4);
        }

        public final void w0(int i10, String str) {
            y0(i10, 2);
            x0(str);
        }

        public final void x0(String str) {
            int i10;
            try {
                int length = str.length() * 3;
                int d02 = CodedOutputStream.d0(length);
                int i11 = d02 + length;
                int i12 = this.f2205f;
                if (i11 > i12) {
                    byte[] bArr = new byte[length];
                    int b10 = l0.f2303a.b(str, bArr, 0, length);
                    A0(b10);
                    K0(bArr, 0, b10);
                    return;
                }
                if (i11 > i12 - this.f2206n) {
                    I0();
                }
                int d03 = CodedOutputStream.d0(str.length());
                i10 = this.f2206n;
                if (d03 == d02) {
                    int i13 = i10 + d03;
                    this.f2206n = i13;
                    int b11 = l0.f2303a.b(str, this.f2204e, i13, this.f2205f - i13);
                    this.f2206n = i10;
                    G0((b11 - i10) - d03);
                    this.f2206n = b11;
                    return;
                }
                int b12 = l0.b(str);
                G0(b12);
                this.f2206n = l0.f2303a.b(str, this.f2204e, this.f2206n, b12);
            } catch (l0.d e10) {
                this.f2206n = i10;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            } catch (l0.d e12) {
                g0(str, e12);
            }
        }

        public final void y0(int i10, int i11) {
            A0((i10 << 3) | i11);
        }

        public final void z0(int i10, int i11) {
            J0(20);
            F0(i10, 0);
            G0(i11);
        }
    }

    public static int J(int i10) {
        return b0(i10) + 1;
    }

    public static int K(int i10, j2.c cVar) {
        int b02 = b0(i10);
        int size = cVar.size();
        return d0(size) + size + b02;
    }

    public static int L(int i10) {
        return b0(i10) + 8;
    }

    public static int M(int i10, int i11) {
        return S(i11) + b0(i10);
    }

    public static int N(int i10) {
        return b0(i10) + 4;
    }

    public static int O(int i10) {
        return b0(i10) + 8;
    }

    public static int P(int i10) {
        return b0(i10) + 4;
    }

    @Deprecated
    public static int Q(int i10, z zVar, u uVar) {
        return ((a) zVar).h(uVar) + (b0(i10) * 2);
    }

    public static int R(int i10, int i11) {
        return S(i11) + b0(i10);
    }

    public static int S(int i10) {
        if (i10 >= 0) {
            return d0(i10);
        }
        return 10;
    }

    public static int T(int i10, long j10) {
        return f0(j10) + b0(i10);
    }

    public static int U(r rVar) {
        int i10;
        if (rVar.f2323b != null) {
            i10 = rVar.f2323b.size();
        } else if (rVar.f2322a != null) {
            i10 = rVar.f2322a.c();
        } else {
            i10 = 0;
        }
        return d0(i10) + i10;
    }

    public static int V(int i10) {
        return b0(i10) + 4;
    }

    public static int W(int i10) {
        return b0(i10) + 8;
    }

    public static int X(int i10, int i11) {
        return d0((i11 >> 31) ^ (i11 << 1)) + b0(i10);
    }

    public static int Y(int i10, long j10) {
        return f0((j10 >> 63) ^ (j10 << 1)) + b0(i10);
    }

    public static int Z(int i10, String str) {
        return a0(str) + b0(i10);
    }

    public static int a0(String str) {
        int i10;
        try {
            i10 = l0.b(str);
        } catch (l0.d unused) {
            i10 = str.getBytes(p.f2318a).length;
        }
        return d0(i10) + i10;
    }

    public static int b0(int i10) {
        return d0((i10 << 3) | 0);
    }

    public static int c0(int i10, int i11) {
        return d0(i11) + b0(i10);
    }

    public static int d0(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int e0(int i10, long j10) {
        return f0(j10) + b0(i10);
    }

    public static int f0(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public abstract void A0(int i10);

    public abstract void B0(int i10, long j10);

    public abstract void C0(long j10);

    public final void g0(String str, l0.d dVar) {
        f2201c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(p.f2318a);
        try {
            A0(bytes.length);
            I(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        } catch (OutOfSpaceException e11) {
            throw e11;
        }
    }

    public abstract void h0(byte b10);

    public abstract void i0(int i10, boolean z10);

    public abstract void j0(byte[] bArr, int i10);

    public abstract void k0(int i10, j2.c cVar);

    public abstract void l0(j2.c cVar);

    public abstract void m0(int i10, int i11);

    public abstract void n0(int i10);

    public abstract void o0(int i10, long j10);

    public abstract void p0(long j10);

    public abstract void q0(int i10, int i11);

    public abstract void r0(int i10);

    public abstract void s0(int i10, z zVar, u uVar);

    public abstract void t0(z zVar);

    public abstract void u0(int i10, z zVar);

    public abstract void v0(int i10, j2.c cVar);

    public abstract void w0(int i10, String str);

    public abstract void x0(String str);

    public abstract void y0(int i10, int i11);

    public abstract void z0(int i10, int i11);

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(b0.r("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
