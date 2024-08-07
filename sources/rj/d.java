package rj;

import bk.a;
import p3.l0;

/* compiled from: Observable */
public abstract class d<T> implements e<T> {
    public final void b(f<? super T> fVar) {
        try {
            e(fVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            l0.P0(th2);
            a.a(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void e(f<? super T> fVar);
}
