package kk;

import ik.d;
import sk.g;
import sk.j;
import sk.s;
import sk.t;

/* compiled from: ContinuationImpl.kt */
public abstract class i extends c implements g<Object> {
    private final int arity;

    public i(int i10, d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.f22932a.getClass();
        String a10 = t.a(this);
        j.e(a10, "renderLambdaToString(this)");
        return a10;
    }

    public i(int i10) {
        this(i10, (d<Object>) null);
    }
}
