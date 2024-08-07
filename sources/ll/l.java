package ll;

import sk.j;

/* compiled from: ForwardingSink.kt */
public abstract class l implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f20886a;

    public l(a0 a0Var) {
        j.f(a0Var, "delegate");
        this.f20886a = a0Var;
    }

    public void Q(f fVar, long j10) {
        j.f(fVar, "source");
        this.f20886a.Q(fVar, j10);
    }

    public void close() {
        this.f20886a.close();
    }

    public final d0 f() {
        return this.f20886a.f();
    }

    public void flush() {
        this.f20886a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f20886a + ')';
    }
}
