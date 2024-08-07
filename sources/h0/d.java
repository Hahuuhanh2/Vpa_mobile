package h0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: HighPriorityExecutor */
public final class d implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static volatile d f10514b;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f10515a = Executors.newSingleThreadExecutor(new a());

    /* compiled from: HighPriorityExecutor */
    public class a implements ThreadFactory {
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public final void execute(Runnable runnable) {
        this.f10515a.execute(runnable);
    }
}
