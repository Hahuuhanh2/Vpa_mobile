package sk;

import java.io.Serializable;

/* compiled from: Lambda.kt */
public abstract class k<R> implements g<R>, Serializable {
    private final int arity;

    public k(int i10) {
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        s.f22932a.getClass();
        String a10 = t.a(this);
        j.e(a10, "renderLambdaToString(this)");
        return a10;
    }
}
