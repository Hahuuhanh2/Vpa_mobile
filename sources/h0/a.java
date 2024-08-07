package h0;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor */
public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f10503a;

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
