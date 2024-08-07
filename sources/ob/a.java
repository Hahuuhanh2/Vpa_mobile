package ob;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import mb.d;
import tb.h;

/* compiled from: InstrHttpInputStream */
public final class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f13790a;

    /* renamed from: b  reason: collision with root package name */
    public final d f13791b;

    /* renamed from: c  reason: collision with root package name */
    public final Timer f13792c;

    /* renamed from: d  reason: collision with root package name */
    public long f13793d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f13794e;

    /* renamed from: f  reason: collision with root package name */
    public long f13795f = -1;

    public a(InputStream inputStream, d dVar, Timer timer) {
        this.f13792c = timer;
        this.f13790a = inputStream;
        this.f13791b = dVar;
        this.f13794e = ((h) dVar.f13253o.f7906b).c0();
    }

    public final int available() {
        try {
            return this.f13790a.available();
        } catch (IOException e10) {
            this.f13791b.m(this.f13792c.a());
            h.c(this.f13791b);
            throw e10;
        }
    }

    public final void close() {
        long a10 = this.f13792c.a();
        if (this.f13795f == -1) {
            this.f13795f = a10;
        }
        try {
            this.f13790a.close();
            long j10 = this.f13793d;
            if (j10 != -1) {
                this.f13791b.l(j10);
            }
            long j11 = this.f13794e;
            if (j11 != -1) {
                h.a aVar = this.f13791b.f13253o;
                aVar.s();
                h.N((h) aVar.f7906b, j11);
            }
            this.f13791b.m(this.f13795f);
            this.f13791b.e();
        } catch (IOException e10) {
            this.f13791b.m(this.f13792c.a());
            h.c(this.f13791b);
            throw e10;
        }
    }

    public final void mark(int i10) {
        this.f13790a.mark(i10);
    }

    public final boolean markSupported() {
        return this.f13790a.markSupported();
    }

    public final int read() {
        try {
            int read = this.f13790a.read();
            long a10 = this.f13792c.a();
            if (this.f13794e == -1) {
                this.f13794e = a10;
            }
            if (read == -1 && this.f13795f == -1) {
                this.f13795f = a10;
                this.f13791b.m(a10);
                this.f13791b.e();
            } else {
                long j10 = this.f13793d + 1;
                this.f13793d = j10;
                this.f13791b.l(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f13791b.m(this.f13792c.a());
            h.c(this.f13791b);
            throw e10;
        }
    }

    public final void reset() {
        try {
            this.f13790a.reset();
        } catch (IOException e10) {
            this.f13791b.m(this.f13792c.a());
            h.c(this.f13791b);
            throw e10;
        }
    }

    public final long skip(long j10) {
        try {
            long skip = this.f13790a.skip(j10);
            long a10 = this.f13792c.a();
            if (this.f13794e == -1) {
                this.f13794e = a10;
            }
            if (skip == -1 && this.f13795f == -1) {
                this.f13795f = a10;
                this.f13791b.m(a10);
            } else {
                long j11 = this.f13793d + skip;
                this.f13793d = j11;
                this.f13791b.l(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f13791b.m(this.f13792c.a());
            h.c(this.f13791b);
            throw e10;
        }
    }

    public final int read(byte[] bArr, int i10, int i11) {
        try {
            int read = this.f13790a.read(bArr, i10, i11);
            long a10 = this.f13792c.a();
            if (this.f13794e == -1) {
                this.f13794e = a10;
            }
            if (read == -1 && this.f13795f == -1) {
                this.f13795f = a10;
                this.f13791b.m(a10);
                this.f13791b.e();
            } else {
                long j10 = this.f13793d + ((long) read);
                this.f13793d = j10;
                this.f13791b.l(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f13791b.m(this.f13792c.a());
            h.c(this.f13791b);
            throw e10;
        }
    }

    public final int read(byte[] bArr) {
        try {
            int read = this.f13790a.read(bArr);
            long a10 = this.f13792c.a();
            if (this.f13794e == -1) {
                this.f13794e = a10;
            }
            if (read == -1 && this.f13795f == -1) {
                this.f13795f = a10;
                this.f13791b.m(a10);
                this.f13791b.e();
            } else {
                long j10 = this.f13793d + ((long) read);
                this.f13793d = j10;
                this.f13791b.l(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f13791b.m(this.f13792c.a());
            h.c(this.f13791b);
            throw e10;
        }
    }
}
