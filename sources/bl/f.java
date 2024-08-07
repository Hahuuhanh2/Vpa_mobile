package bl;

import al.b2;
import al.g0;
import al.l;
import al.q1;
import al.r0;
import al.s1;
import al.t0;
import android.os.Handler;
import android.os.Looper;
import f0.b0;
import fl.m;
import gl.c;
import java.util.concurrent.CancellationException;
import sk.j;

/* compiled from: HandlerDispatcher.kt */
public final class f extends g {
    private volatile f _immediate;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f19172c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19173d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19174e;

    /* renamed from: f  reason: collision with root package name */
    public final f f19175f;

    public f(Handler handler, String str, boolean z10) {
        this.f19172c = handler;
        this.f19173d = str;
        this.f19174e = z10;
        this._immediate = z10 ? this : null;
        f fVar = this._immediate;
        if (fVar == null) {
            fVar = new f(handler, str, true);
            this._immediate = fVar;
        }
        this.f19175f = fVar;
    }

    public final boolean W(ik.f fVar) {
        if (!this.f19174e || !j.a(Looper.myLooper(), this.f19172c.getLooper())) {
            return true;
        }
        return false;
    }

    public final q1 a0() {
        return this.f19175f;
    }

    public final void c0(ik.f fVar, Runnable runnable) {
        g0.x(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        r0.f19085b.s(fVar, runnable);
    }

    public final t0 d(long j10, b2 b2Var, ik.f fVar) {
        Handler handler = this.f19172c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(b2Var, j10)) {
            return new c(this, b2Var);
        }
        c0(fVar, b2Var);
        return s1.f19087a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f) || ((f) obj).f19172c != this.f19172c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f19172c);
    }

    public final void i(long j10, l lVar) {
        d dVar = new d(lVar, this);
        Handler handler = this.f19172c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(dVar, j10)) {
            lVar.v(new e(this, dVar));
        } else {
            c0(lVar.f19051e, dVar);
        }
    }

    public final void s(ik.f fVar, Runnable runnable) {
        if (!this.f19172c.post(runnable)) {
            c0(fVar, runnable);
        }
    }

    public final String toString() {
        String str;
        q1 q1Var;
        c cVar = r0.f19084a;
        q1 q1Var2 = m.f20254a;
        if (this == q1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                q1Var = q1Var2.a0();
            } catch (UnsupportedOperationException unused) {
                q1Var = null;
            }
            if (this == q1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f19173d;
        if (str2 == null) {
            str2 = this.f19172c.toString();
        }
        if (this.f19174e) {
            return b0.r(str2, ".immediate");
        }
        return str2;
    }

    public f(Handler handler) {
        this(handler, (String) null, false);
    }
}
