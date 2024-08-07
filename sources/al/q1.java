package al;

import fl.m;
import gl.c;

/* compiled from: MainCoroutineDispatcher.kt */
public abstract class q1 extends a0 {
    public abstract q1 a0();

    public String toString() {
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
        return getClass().getSimpleName() + '@' + g0.T(this);
    }
}
