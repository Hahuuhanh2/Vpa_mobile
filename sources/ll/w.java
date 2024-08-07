package ll;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import n0.l;
import p3.l0;
import sk.j;

/* compiled from: RealBufferedSource.kt */
public final class w implements i {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f20914a;

    /* renamed from: b  reason: collision with root package name */
    public final f f20915b = new f();

    /* renamed from: c  reason: collision with root package name */
    public boolean f20916c;

    public w(c0 c0Var) {
        j.f(c0Var, "source");
        this.f20914a = c0Var;
    }

    public final boolean A() {
        if (!(!this.f20916c)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f20915b.A() || this.f20914a.J0(this.f20915b, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public final String F(long j10) {
        boolean z10;
        long j11;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            long d10 = d((byte) 10, 0, j11);
            if (d10 != -1) {
                return ml.a.a(this.f20915b, d10);
            }
            if (j11 < Long.MAX_VALUE && i0(j11) && this.f20915b.B(j11 - 1) == 13 && i0(1 + j11) && this.f20915b.B(j11) == 10) {
                return ml.a.a(this.f20915b, j11);
            }
            f fVar = new f();
            f fVar2 = this.f20915b;
            fVar2.z(0, Math.min((long) 32, fVar2.f20878b), fVar);
            StringBuilder q10 = android.support.v4.media.a.q("\\n not found: limit=");
            q10.append(Math.min(this.f20915b.f20878b, j10));
            q10.append(" content=");
            q10.append(fVar.N().j());
            q10.append(8230);
            throw new EOFException(q10.toString());
        }
        throw new IllegalArgumentException(l.i("limit < 0: ", j10).toString());
    }

    public final long G(f fVar) {
        long j10 = 0;
        while (this.f20914a.J0(this.f20915b, 8192) != -1) {
            long x10 = this.f20915b.x();
            if (x10 > 0) {
                j10 += x10;
                fVar.Q(this.f20915b, x10);
            }
        }
        f fVar2 = this.f20915b;
        long j11 = fVar2.f20878b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        fVar.Q(fVar2, j11);
        return j12;
    }

    public final void G0(long j10) {
        if (!i0(j10)) {
            throw new EOFException();
        }
    }

    public final long J0(f fVar, long j10) {
        boolean z10;
        j.f(fVar, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(l.i("byteCount < 0: ", j10).toString());
        } else if (!this.f20916c) {
            f fVar2 = this.f20915b;
            if (fVar2.f20878b == 0 && this.f20914a.J0(fVar2, 8192) == -1) {
                return -1;
            }
            return this.f20915b.J0(fVar, Math.min(j10, this.f20915b.f20878b));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final long M0() {
        G0(1);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!i0((long) i11)) {
                break;
            }
            byte B = this.f20915b.B((long) i10);
            if ((B >= 48 && B <= 57) || ((B >= 97 && B <= 102) || (B >= 65 && B <= 70))) {
                i10 = i11;
            } else if (i10 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                l0.n(16);
                l0.n(16);
                String num = Integer.toString(B, 16);
                j.e(num, "toString(this, checkRadix(radix))");
                sb2.append(num);
                throw new NumberFormatException(sb2.toString());
            }
        }
        return this.f20915b.M0();
    }

    public final InputStream O0() {
        return new a(this);
    }

    public final long T(j jVar) {
        j.f(jVar, "targetBytes");
        if (!this.f20916c) {
            long j10 = 0;
            while (true) {
                long K = this.f20915b.K(j10, jVar);
                if (K != -1) {
                    return K;
                }
                f fVar = this.f20915b;
                long j11 = fVar.f20878b;
                if (this.f20914a.J0(fVar, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, j11);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final String V(Charset charset) {
        this.f20915b.E0(this.f20914a);
        f fVar = this.f20915b;
        return fVar.S(fVar.f20878b, charset);
    }

    public final void Z(f fVar, long j10) {
        j.f(fVar, "sink");
        try {
            G0(j10);
            this.f20915b.Z(fVar, j10);
        } catch (EOFException e10) {
            fVar.E0(this.f20915b);
            throw e10;
        }
    }

    public final f a() {
        return this.f20915b;
    }

    public final void close() {
        if (!this.f20916c) {
            this.f20916c = true;
            this.f20914a.close();
            this.f20915b.q();
        }
    }

    public final long d(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f20916c) {
            long j12 = 0;
            if (0 > j11) {
                z10 = false;
            }
            if (z10) {
                while (j12 < j11) {
                    long E = this.f20915b.E(b10, j12, j11);
                    if (E != -1) {
                        return E;
                    }
                    f fVar = this.f20915b;
                    long j13 = fVar.f20878b;
                    if (j13 >= j11 || this.f20914a.J0(fVar, 8192) == -1) {
                        return -1;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + 0 + " toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final d0 f() {
        return this.f20914a.f();
    }

    public final w h() {
        return new w(new u(this));
    }

    public final int i() {
        G0(4);
        int readInt = this.f20915b.readInt();
        int i10 = b.f20859a;
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean i0(long j10) {
        boolean z10;
        f fVar;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(l.i("byteCount < 0: ", j10).toString());
        } else if (!this.f20916c) {
            do {
                fVar = this.f20915b;
                if (fVar.f20878b >= j10) {
                    return true;
                }
            } while (this.f20914a.J0(fVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final boolean isOpen() {
        return !this.f20916c;
    }

    public final j n(long j10) {
        G0(j10);
        return this.f20915b.n(j10);
    }

    public final String p0() {
        return F(Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "sink");
        f fVar = this.f20915b;
        if (fVar.f20878b == 0 && this.f20914a.J0(fVar, 8192) == -1) {
            return -1;
        }
        return this.f20915b.read(byteBuffer);
    }

    public final byte readByte() {
        G0(1);
        return this.f20915b.readByte();
    }

    public final int readInt() {
        G0(4);
        return this.f20915b.readInt();
    }

    public final short readShort() {
        G0(2);
        return this.f20915b.readShort();
    }

    public final void skip(long j10) {
        if (!this.f20916c) {
            while (j10 > 0) {
                f fVar = this.f20915b;
                if (fVar.f20878b == 0 && this.f20914a.J0(fVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f20915b.f20878b);
                this.f20915b.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("buffer(");
        q10.append(this.f20914a);
        q10.append(')');
        return q10.toString();
    }

    public final int u0(s sVar) {
        j.f(sVar, "options");
        if (!this.f20916c) {
            while (true) {
                int b10 = ml.a.b(this.f20915b, sVar, true);
                if (b10 == -2) {
                    if (this.f20914a.J0(this.f20915b, 8192) == -1) {
                        break;
                    }
                } else if (b10 != -1) {
                    this.f20915b.skip((long) sVar.f20901a[b10].i());
                    return b10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w f20917a;

        public a(w wVar) {
            this.f20917a = wVar;
        }

        public final int available() {
            w wVar = this.f20917a;
            if (!wVar.f20916c) {
                return (int) Math.min(wVar.f20915b.f20878b, (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.f20917a.close();
        }

        public final int read() {
            w wVar = this.f20917a;
            if (!wVar.f20916c) {
                f fVar = wVar.f20915b;
                if (fVar.f20878b == 0 && wVar.f20914a.J0(fVar, 8192) == -1) {
                    return -1;
                }
                return this.f20917a.f20915b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f20917a + ".inputStream()";
        }

        public final int read(byte[] bArr, int i10, int i11) {
            j.f(bArr, "data");
            if (!this.f20917a.f20916c) {
                b.b((long) bArr.length, (long) i10, (long) i11);
                w wVar = this.f20917a;
                f fVar = wVar.f20915b;
                if (fVar.f20878b == 0 && wVar.f20914a.J0(fVar, 8192) == -1) {
                    return -1;
                }
                return this.f20917a.f20915b.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
