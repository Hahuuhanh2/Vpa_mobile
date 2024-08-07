package ll;

import android.support.v4.media.a;
import java.io.OutputStream;
import sk.j;

/* compiled from: JvmOkio.kt */
public final class t implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f20903a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f20904b;

    public t(OutputStream outputStream, d0 d0Var) {
        this.f20903a = outputStream;
        this.f20904b = d0Var;
    }

    public final void Q(f fVar, long j10) {
        j.f(fVar, "source");
        b.b(fVar.f20878b, 0, j10);
        while (j10 > 0) {
            this.f20904b.f();
            x xVar = fVar.f20877a;
            j.c(xVar);
            int min = (int) Math.min(j10, (long) (xVar.f20920c - xVar.f20919b));
            this.f20903a.write(xVar.f20918a, xVar.f20919b, min);
            int i10 = xVar.f20919b + min;
            xVar.f20919b = i10;
            long j11 = (long) min;
            j10 -= j11;
            fVar.f20878b -= j11;
            if (i10 == xVar.f20920c) {
                fVar.f20877a = xVar.a();
                y.a(xVar);
            }
        }
    }

    public final void close() {
        this.f20903a.close();
    }

    public final d0 f() {
        return this.f20904b;
    }

    public final void flush() {
        this.f20903a.flush();
    }

    public final String toString() {
        StringBuilder q10 = a.q("sink(");
        q10.append(this.f20903a);
        q10.append(')');
        return q10.toString();
    }
}
