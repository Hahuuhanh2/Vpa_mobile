package ll;

import android.support.v4.media.a;
import ek.i;
import java.io.IOException;
import sk.j;

/* compiled from: AsyncTimeout.kt */
public final class e implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c0 f20876b;

    public e(b0 b0Var, q qVar) {
        this.f20875a = b0Var;
        this.f20876b = qVar;
    }

    public final long J0(f fVar, long j10) {
        j.f(fVar, "sink");
        c cVar = this.f20875a;
        c0 c0Var = this.f20876b;
        cVar.h();
        try {
            long J0 = c0Var.J0(fVar, 8192);
            if (!cVar.i()) {
                return J0;
            }
            throw cVar.j((IOException) null);
        } catch (IOException e10) {
            e = e10;
            if (cVar.i()) {
                e = cVar.j(e);
            }
            throw e;
        } finally {
            cVar.i();
        }
    }

    public final void close() {
        c cVar = this.f20875a;
        c0 c0Var = this.f20876b;
        cVar.h();
        try {
            c0Var.close();
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
        return this.f20875a;
    }

    public final String toString() {
        StringBuilder q10 = a.q("AsyncTimeout.source(");
        q10.append(this.f20876b);
        q10.append(')');
        return q10.toString();
    }
}
