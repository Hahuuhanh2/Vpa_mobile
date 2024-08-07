package ll;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import sk.j;

/* compiled from: InflaterSource.kt */
public final class p implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final i f20894a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f20895b;

    /* renamed from: c  reason: collision with root package name */
    public int f20896c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20897d;

    public p(w wVar, Inflater inflater) {
        this.f20894a = wVar;
        this.f20895b = inflater;
    }

    public final long J0(f fVar, long j10) {
        long j11;
        j.f(fVar, "sink");
        while (!this.f20897d) {
            try {
                x d02 = fVar.d0(1);
                int min = (int) Math.min(8192, (long) (8192 - d02.f20920c));
                if (this.f20895b.needsInput()) {
                    if (!this.f20894a.A()) {
                        x xVar = this.f20894a.a().f20877a;
                        j.c(xVar);
                        int i10 = xVar.f20920c;
                        int i11 = xVar.f20919b;
                        int i12 = i10 - i11;
                        this.f20896c = i12;
                        this.f20895b.setInput(xVar.f20918a, i11, i12);
                    }
                }
                int inflate = this.f20895b.inflate(d02.f20918a, d02.f20920c, min);
                int i13 = this.f20896c;
                if (i13 != 0) {
                    int remaining = i13 - this.f20895b.getRemaining();
                    this.f20896c -= remaining;
                    this.f20894a.skip((long) remaining);
                }
                if (inflate > 0) {
                    d02.f20920c += inflate;
                    j11 = (long) inflate;
                    fVar.f20878b += j11;
                } else {
                    if (d02.f20919b == d02.f20920c) {
                        fVar.f20877a = d02.a();
                        y.a(d02);
                    }
                    j11 = 0;
                }
                if (j11 > 0) {
                    return j11;
                }
                if (this.f20895b.finished() || this.f20895b.needsDictionary()) {
                    return -1;
                }
                if (this.f20894a.A()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        if (!this.f20897d) {
            this.f20895b.end();
            this.f20897d = true;
            this.f20894a.close();
        }
    }

    public final d0 f() {
        return this.f20894a.f();
    }
}
