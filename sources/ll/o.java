package ll;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import sk.j;

/* compiled from: GzipSource.kt */
public final class o implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public byte f20889a;

    /* renamed from: b  reason: collision with root package name */
    public final w f20890b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f20891c;

    /* renamed from: d  reason: collision with root package name */
    public final p f20892d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f20893e = new CRC32();

    public o(c0 c0Var) {
        j.f(c0Var, "source");
        w wVar = new w(c0Var);
        this.f20890b = wVar;
        Inflater inflater = new Inflater(true);
        this.f20891c = inflater;
        this.f20892d = new p(wVar, inflater);
    }

    public static void d(int i10, int i11, String str) {
        if (i11 != i10) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
            j.e(format, "format(this, *args)");
            throw new IOException(format);
        }
    }

    public final long J0(f fVar, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j11;
        f fVar2 = fVar;
        j.f(fVar2, "sink");
        if (this.f20889a == 0) {
            this.f20890b.G0(10);
            byte B = this.f20890b.f20915b.B(3);
            boolean z13 = false;
            if (((B >> 1) & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h(0, 10, this.f20890b.f20915b);
            }
            d(8075, this.f20890b.readShort(), "ID1ID2");
            this.f20890b.skip(8);
            if (((B >> 2) & 1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f20890b.G0(2);
                if (z10) {
                    h(0, 2, this.f20890b.f20915b);
                }
                short readShort = this.f20890b.f20915b.readShort();
                int i10 = b.f20859a;
                short s10 = readShort & 65535;
                long j12 = (long) (((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8))) & 65535);
                this.f20890b.G0(j12);
                if (z10) {
                    j11 = j12;
                    h(0, j12, this.f20890b.f20915b);
                } else {
                    j11 = j12;
                }
                this.f20890b.skip(j11);
            }
            if (((B >> 3) & 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                long d10 = this.f20890b.d((byte) 0, 0, Long.MAX_VALUE);
                if (d10 != -1) {
                    if (z10) {
                        h(0, d10 + 1, this.f20890b.f20915b);
                    }
                    this.f20890b.skip(d10 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (((B >> 4) & 1) == 1) {
                z13 = true;
            }
            if (z13) {
                long d11 = this.f20890b.d((byte) 0, 0, Long.MAX_VALUE);
                if (d11 != -1) {
                    if (z10) {
                        h(0, d11 + 1, this.f20890b.f20915b);
                    }
                    this.f20890b.skip(d11 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z10) {
                w wVar = this.f20890b;
                wVar.G0(2);
                short readShort2 = wVar.f20915b.readShort();
                int i11 = b.f20859a;
                short s11 = readShort2 & 65535;
                d((short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) ((int) this.f20893e.getValue()), "FHCRC");
                this.f20893e.reset();
            }
            this.f20889a = 1;
        }
        if (this.f20889a == 1) {
            long j13 = fVar2.f20878b;
            long J0 = this.f20892d.J0(fVar2, 8192);
            if (J0 != -1) {
                h(j13, J0, fVar);
                return J0;
            }
            this.f20889a = 2;
        }
        if (this.f20889a == 2) {
            d(this.f20890b.i(), (int) this.f20893e.getValue(), "CRC");
            d(this.f20890b.i(), (int) this.f20891c.getBytesWritten(), "ISIZE");
            this.f20889a = 3;
            if (!this.f20890b.A()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1;
    }

    public final void close() {
        this.f20892d.close();
    }

    public final d0 f() {
        return this.f20890b.f();
    }

    public final void h(long j10, long j11, f fVar) {
        x xVar = fVar.f20877a;
        j.c(xVar);
        while (true) {
            int i10 = xVar.f20920c;
            int i11 = xVar.f20919b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            xVar = xVar.f20923f;
            j.c(xVar);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) xVar.f20919b) + j10);
            int min = (int) Math.min((long) (xVar.f20920c - i12), j11);
            this.f20893e.update(xVar.f20918a, i12, min);
            j11 -= (long) min;
            xVar = xVar.f20923f;
            j.c(xVar);
            j10 = 0;
        }
    }
}
