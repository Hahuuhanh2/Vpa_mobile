package ll;

import sk.j;

/* compiled from: ForwardingSource.kt */
public abstract class m implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f20887a;

    public m(c0 c0Var) {
        j.f(c0Var, "delegate");
        this.f20887a = c0Var;
    }

    public long J0(f fVar, long j10) {
        j.f(fVar, "sink");
        return this.f20887a.J0(fVar, 8192);
    }

    public void close() {
        this.f20887a.close();
    }

    public final d0 f() {
        return this.f20887a.f();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f20887a + ')';
    }
}
