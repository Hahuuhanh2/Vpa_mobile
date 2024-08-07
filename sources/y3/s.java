package y3;

import java.util.concurrent.Executor;

/* compiled from: SynchronousExecutor */
public final class s implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
