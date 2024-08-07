package fb;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.b;

/* compiled from: RequestDeduplicator */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f10165a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10166b = new b();

    public u(ExecutorService executorService) {
        this.f10165a = executorService;
    }
}
