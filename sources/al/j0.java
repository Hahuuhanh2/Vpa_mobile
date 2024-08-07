package al;

import hl.c;
import ik.d;

/* compiled from: Deferred.kt */
public interface j0<T> extends i1 {
    Object await(d<? super T> dVar);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    c<T> getOnAwait();
}
