package ll;

import android.support.v4.media.a;
import java.nio.ByteBuffer;
import sk.j;

/* compiled from: RealBufferedSink.kt */
public final class v implements h {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f20911a;

    /* renamed from: b  reason: collision with root package name */
    public final f f20912b = new f();

    /* renamed from: c  reason: collision with root package name */
    public boolean f20913c;

    public v(a0 a0Var) {
        j.f(a0Var, "sink");
        this.f20911a = a0Var;
    }

    public final long E0(c0 c0Var) {
        long j10 = 0;
        while (true) {
            long J0 = ((q) c0Var).J0(this.f20912b, 8192);
            if (J0 == -1) {
                return j10;
            }
            j10 += J0;
            d();
        }
    }

    public final h K0(long j10) {
        if (!this.f20913c) {
            this.f20912b.j0(j10);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h O(String str) {
        j.f(str, "string");
        if (!this.f20913c) {
            this.f20912b.w0(str);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void Q(f fVar, long j10) {
        j.f(fVar, "source");
        if (!this.f20913c) {
            this.f20912b.Q(fVar, j10);
            d();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h Y(j jVar) {
        j.f(jVar, "byteString");
        if (!this.f20913c) {
            this.f20912b.e0(jVar);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final f a() {
        return this.f20912b;
    }

    public final h b0(long j10) {
        if (!this.f20913c) {
            this.f20912b.l0(j10);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        if (!this.f20913c) {
            Throwable th2 = null;
            try {
                f fVar = this.f20912b;
                long j10 = fVar.f20878b;
                if (j10 > 0) {
                    this.f20911a.Q(fVar, j10);
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.f20911a.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            this.f20913c = true;
            if (th2 != null) {
                throw th2;
            }
        }
    }

    public final h d() {
        if (!this.f20913c) {
            long x10 = this.f20912b.x();
            if (x10 > 0) {
                this.f20911a.Q(this.f20912b, x10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final d0 f() {
        return this.f20911a.f();
    }

    public final void flush() {
        if (!this.f20913c) {
            f fVar = this.f20912b;
            long j10 = fVar.f20878b;
            if (j10 > 0) {
                this.f20911a.Q(fVar, j10);
            }
            this.f20911a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.f20913c;
    }

    public final String toString() {
        StringBuilder q10 = a.q("buffer(");
        q10.append(this.f20911a);
        q10.append(')');
        return q10.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "source");
        if (!this.f20913c) {
            int write = this.f20912b.write(byteBuffer);
            d();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h writeByte(int i10) {
        if (!this.f20913c) {
            this.f20912b.g0(i10);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h writeInt(int i10) {
        if (!this.f20913c) {
            this.f20912b.o0(i10);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h writeShort(int i10) {
        if (!this.f20913c) {
            this.f20912b.s0(i10);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h write(byte[] bArr) {
        j.f(bArr, "source");
        if (!this.f20913c) {
            this.f20912b.write(bArr);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h write(byte[] bArr, int i10, int i11) {
        j.f(bArr, "source");
        if (!this.f20913c) {
            this.f20912b.write(bArr, i10, i11);
            d();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
