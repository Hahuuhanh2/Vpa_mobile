package ob;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import mb.d;
import tb.h;

/* compiled from: InstrHttpOutputStream */
public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f13796a;

    /* renamed from: b  reason: collision with root package name */
    public final Timer f13797b;

    /* renamed from: c  reason: collision with root package name */
    public d f13798c;

    /* renamed from: d  reason: collision with root package name */
    public long f13799d = -1;

    public b(OutputStream outputStream, d dVar, Timer timer) {
        this.f13796a = outputStream;
        this.f13798c = dVar;
        this.f13797b = timer;
    }

    public final void close() {
        long j10 = this.f13799d;
        if (j10 != -1) {
            this.f13798c.i(j10);
        }
        d dVar = this.f13798c;
        long a10 = this.f13797b.a();
        h.a aVar = dVar.f13253o;
        aVar.s();
        h.M((h) aVar.f7906b, a10);
        try {
            this.f13796a.close();
        } catch (IOException e10) {
            this.f13798c.m(this.f13797b.a());
            h.c(this.f13798c);
            throw e10;
        }
    }

    public final void flush() {
        try {
            this.f13796a.flush();
        } catch (IOException e10) {
            this.f13798c.m(this.f13797b.a());
            h.c(this.f13798c);
            throw e10;
        }
    }

    public final void write(int i10) {
        try {
            this.f13796a.write(i10);
            long j10 = this.f13799d + 1;
            this.f13799d = j10;
            this.f13798c.i(j10);
        } catch (IOException e10) {
            this.f13798c.m(this.f13797b.a());
            h.c(this.f13798c);
            throw e10;
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.f13796a.write(bArr);
            long length = this.f13799d + ((long) bArr.length);
            this.f13799d = length;
            this.f13798c.i(length);
        } catch (IOException e10) {
            this.f13798c.m(this.f13797b.a());
            h.c(this.f13798c);
            throw e10;
        }
    }

    public final void write(byte[] bArr, int i10, int i11) {
        try {
            this.f13796a.write(bArr, i10, i11);
            long j10 = this.f13799d + ((long) i11);
            this.f13799d = j10;
            this.f13798c.i(j10);
        } catch (IOException e10) {
            this.f13798c.m(this.f13797b.a());
            h.c(this.f13798c);
            throw e10;
        }
    }
}
