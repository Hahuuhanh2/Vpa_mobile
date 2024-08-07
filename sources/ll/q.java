package ll;

import j7.a;
import java.io.IOException;
import java.io.InputStream;
import sk.j;

/* compiled from: JvmOkio.kt */
public final class q implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f20898a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f20899b;

    public q(InputStream inputStream, d0 d0Var) {
        j.f(inputStream, "input");
        j.f(d0Var, "timeout");
        this.f20898a = inputStream;
        this.f20899b = d0Var;
    }

    public final long J0(f fVar, long j10) {
        j.f(fVar, "sink");
        try {
            this.f20899b.f();
            x d02 = fVar.d0(1);
            int read = this.f20898a.read(d02.f20918a, d02.f20920c, (int) Math.min(8192, (long) (8192 - d02.f20920c)));
            if (read != -1) {
                d02.f20920c += read;
                long j11 = (long) read;
                fVar.f20878b += j11;
                return j11;
            } else if (d02.f20919b != d02.f20920c) {
                return -1;
            } else {
                fVar.f20877a = d02.a();
                y.a(d02);
                return -1;
            }
        } catch (AssertionError e10) {
            if (a.Q(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public final void close() {
        this.f20898a.close();
    }

    public final d0 f() {
        return this.f20899b;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("source(");
        q10.append(this.f20898a);
        q10.append(')');
        return q10.toString();
    }
}
