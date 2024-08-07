package kk;

import ik.d;
import sk.g;
import sk.j;
import sk.s;
import sk.t;

/* compiled from: ContinuationImpl.kt */
public abstract class h extends g implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final int f20843a = 2;

    public h(d dVar) {
        super(dVar);
    }

    public final int getArity() {
        return this.f20843a;
    }

    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.f22932a.getClass();
        String a10 = t.a(this);
        j.e(a10, "renderLambdaToString(this)");
        return a10;
    }
}
