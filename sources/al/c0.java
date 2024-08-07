package al;

import al.b0;
import ik.f;
import p3.l0;

/* compiled from: CoroutineExceptionHandler.kt */
public final class c0 {
    public static final void a(f fVar, Throwable th2) {
        try {
            b0 b0Var = (b0) fVar.get(b0.a.f18992a);
            if (b0Var != null) {
                b0Var.N(fVar, th2);
            } else {
                l0.e0(fVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                g0.s(runtimeException, th2);
                th2 = runtimeException;
            }
            l0.e0(fVar, th2);
        }
    }
}
