package v8;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture */
public interface a<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
