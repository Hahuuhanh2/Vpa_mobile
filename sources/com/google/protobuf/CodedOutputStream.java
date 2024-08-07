package com.google.protobuf;

import androidx.fragment.app.o;
import com.google.protobuf.e0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tc.b0;
import tc.c;
import tc.x;

public abstract class CodedOutputStream extends o {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f7863c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7864d = b0.f14956e;

    /* renamed from: b  reason: collision with root package name */
    public e f7865b;

    public static class a extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f7866e;

        /* renamed from: f  reason: collision with root package name */
        public final int f7867f;

        /* renamed from: n  reason: collision with root package name */
        public int f7868n;

        public a(byte[] bArr, int i10) {
            int i11 = 0 + i10;
            if ((0 | i10 | (bArr.length - i11)) >= 0) {
                this.f7866e = bArr;
                this.f7868n = 0;
                this.f7867f = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)}));
        }

        public final void A0(int i10, long j10) {
            x0(i10, 0);
            B0(j10);
        }

        public final void B0(long j10) {
            if (!CodedOutputStream.f7864d || this.f7867f - this.f7868n < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f7866e;
                    int i10 = this.f7868n;
                    this.f7868n = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f7866e;
                    int i11 = this.f7868n;
                    this.f7868n = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7868n), Integer.valueOf(this.f7867f), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f7866e;
                    int i12 = this.f7868n;
                    this.f7868n = i12 + 1;
                    b0.q(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f7866e;
                int i13 = this.f7868n;
                this.f7868n = i13 + 1;
                b0.q(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final int C0() {
            return this.f7867f - this.f7868n;
        }

        public final void D0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f7866e, this.f7868n, i11);
                this.f7868n += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7868n), Integer.valueOf(this.f7867f), Integer.valueOf(i11)}), e10);
            }
        }

        public final void I(byte[] bArr, int i10, int i11) {
            D0(bArr, i10, i11);
        }

        public final void g0(byte b10) {
            try {
                byte[] bArr = this.f7866e;
                int i10 = this.f7868n;
                this.f7868n = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7868n), Integer.valueOf(this.f7867f), 1}), e10);
            }
        }

        public final void h0(int i10, boolean z10) {
            x0(i10, 0);
            g0(z10 ? (byte) 1 : 0);
        }

        public final void i0(byte[] bArr, int i10) {
            z0(i10);
            D0(bArr, 0, i10);
        }

        public final void j0(int i10, c cVar) {
            x0(i10, 2);
            k0(cVar);
        }

        public final void k0(c cVar) {
            z0(cVar.size());
            cVar.q(this);
        }

        public final void l0(int i10, int i11) {
            x0(i10, 5);
            m0(i11);
        }

        public final void m0(int i10) {
            try {
                byte[] bArr = this.f7866e;
                int i11 = this.f7868n;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f7868n = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7868n), Integer.valueOf(this.f7867f), 1}), e10);
            }
        }

        public final void n0(int i10, long j10) {
            x0(i10, 1);
            o0(j10);
        }

        public final void o0(long j10) {
            try {
                byte[] bArr = this.f7866e;
                int i10 = this.f7868n;
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
                this.f7868n = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7868n), Integer.valueOf(this.f7867f), 1}), e10);
            }
        }

        public final void p0(int i10, int i11) {
            x0(i10, 0);
            q0(i11);
        }

        public final void q0(int i10) {
            if (i10 >= 0) {
                z0(i10);
            } else {
                B0((long) i10);
            }
        }

        public final void r0(int i10, u uVar, x xVar) {
            x0(i10, 2);
            z0(((a) uVar).i(xVar));
            xVar.h(uVar, this.f7865b);
        }

        public final void s0(u uVar) {
            z0(uVar.c());
            uVar.k(this);
        }

        public final void t0(int i10, u uVar) {
            x0(1, 3);
            y0(2, i10);
            x0(3, 2);
            s0(uVar);
            x0(1, 4);
        }

        public final void u0(int i10, c cVar) {
            x0(1, 3);
            y0(2, i10);
            j0(3, cVar);
            x0(1, 4);
        }

        public final void v0(int i10, String str) {
            x0(i10, 2);
            w0(str);
        }

        public final void w0(String str) {
            int i10 = this.f7868n;
            try {
                int d02 = CodedOutputStream.d0(str.length() * 3);
                int d03 = CodedOutputStream.d0(str.length());
                if (d03 == d02) {
                    int i11 = i10 + d03;
                    this.f7868n = i11;
                    int a10 = e0.f7900a.a(str, this.f7866e, i11, this.f7867f - i11);
                    this.f7868n = i10;
                    z0((a10 - i10) - d03);
                    this.f7868n = a10;
                    return;
                }
                z0(e0.b(str));
                byte[] bArr = this.f7866e;
                int i12 = this.f7868n;
                this.f7868n = e0.f7900a.a(str, bArr, i12, this.f7867f - i12);
            } catch (e0.c e10) {
                this.f7868n = i10;
                CodedOutputStream.f7863c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
                byte[] bytes = str.getBytes(k.f7917a);
                try {
                    z0(bytes.length);
                    D0(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        public final void x0(int i10, int i11) {
            z0((i10 << 3) | i11);
        }

        public final void y0(int i10, int i11) {
            x0(i10, 0);
            z0(i11);
        }

        public final void z0(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.f7866e;
                int i11 = this.f7868n;
                this.f7868n = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f7866e;
                int i12 = this.f7868n;
                this.f7868n = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7868n), Integer.valueOf(this.f7867f), 1}), e10);
            }
        }
    }

    public static int J(int i10) {
        return b0(i10) + 1;
    }

    public static int K(int i10, c cVar) {
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
    public static int Q(int i10, u uVar, x xVar) {
        return ((a) uVar).i(xVar) + (b0(i10) * 2);
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

    public static int U(m mVar) {
        int i10;
        if (mVar.f7922b != null) {
            i10 = mVar.f7922b.size();
        } else if (mVar.f7921a != null) {
            i10 = mVar.f7921a.c();
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
            i10 = e0.b(str);
        } catch (e0.c unused) {
            i10 = str.getBytes(k.f7917a).length;
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

    public abstract void A0(int i10, long j10);

    public abstract void B0(long j10);

    public abstract void g0(byte b10);

    public abstract void h0(int i10, boolean z10);

    public abstract void i0(byte[] bArr, int i10);

    public abstract void j0(int i10, c cVar);

    public abstract void k0(c cVar);

    public abstract void l0(int i10, int i11);

    public abstract void m0(int i10);

    public abstract void n0(int i10, long j10);

    public abstract void o0(long j10);

    public abstract void p0(int i10, int i11);

    public abstract void q0(int i10);

    public abstract void r0(int i10, u uVar, x xVar);

    public abstract void s0(u uVar);

    public abstract void t0(int i10, u uVar);

    public abstract void u0(int i10, c cVar);

    public abstract void v0(int i10, String str);

    public abstract void w0(String str);

    public abstract void x0(int i10, int i11);

    public abstract void y0(int i10, int i11);

    public abstract void z0(int i10);

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(f0.b0.r("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
