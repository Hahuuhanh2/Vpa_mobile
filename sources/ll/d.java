package ll;

import android.support.v4.media.a;
import ek.i;
import java.io.IOException;
import sk.j;

/* compiled from: AsyncTimeout.kt */
public final class d implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20869a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f20870b;

    public d(b0 b0Var, t tVar) {
        this.f20869a = b0Var;
        this.f20870b = tVar;
    }

    public final void Q(f fVar, long j10) {
        j.f(fVar, "source");
        b.b(fVar.f20878b, 0, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                x xVar = fVar.f20877a;
                j.c(xVar);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (xVar.f20920c - xVar.f20919b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        xVar = xVar.f20923f;
                        j.c(xVar);
                    }
                }
                c cVar = this.f20869a;
                a0 a0Var = this.f20870b;
                cVar.h();
                try {
                    a0Var.Q(fVar, j11);
                    i iVar = i.f20112a;
                    if (!cVar.i()) {
                        j10 -= j11;
                    } else {
                        throw cVar.j((IOException) null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (cVar.i()) {
                        e = cVar.j(e);
                    }
                    throw e;
                } finally {
                    boolean i10 = cVar.i();
                }
            } else {
                return;
            }
        }
    }

    public final void close() {
        c cVar = this.f20869a;
        a0 a0Var = this.f20870b;
        cVar.h();
        try {
            a0Var.close();
            i iVar = i.f20112a;
            if (cVar.i()) {
                throw cVar.j((IOException) null);
            }
        } catch (IOException e10) {
            e = e10;
            if (cVar.i()) {
                e = cVar.j(e);
            }
            throw e;
        } finally {
            boolean i10 = cVar.i();
        }
    }

    public final d0 f() {
        return this.f20869a;
    }

    public final void flush() {
        c cVar = this.f20869a;
        a0 a0Var = this.f20870b;
        cVar.h();
        try {
            a0Var.flush();
            i iVar = i.f20112a;
            if (cVar.i()) {
                throw cVar.j((IOException) null);
            }
        } catch (IOException e10) {
            e = e10;
            if (cVar.i()) {
                e = cVar.j(e);
            }
            throw e;
        } finally {
            boolean i10 = cVar.i();
        }
    }

    public final String toString() {
        StringBuilder q10 = a.q("AsyncTimeout.sink(");
        q10.append(this.f20870b);
        q10.append(')');
        return q10.toString();
    }
}
