package cl;

import el.f;
import java.util.concurrent.CancellationException;

/* compiled from: Channel.kt */
public interface r<E> {
    Object a(f fVar);

    Object b();

    void cancel(CancellationException cancellationException);

    g<E> iterator();
}
