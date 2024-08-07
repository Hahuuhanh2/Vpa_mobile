package h0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IoExecutor */
public final class e implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static volatile e f10516b;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f10517a = Executors.newFixedThreadPool(2, new a());

    /* compiled from: IoExecutor */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f10518a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", new Object[]{Integer.valueOf(this.f10518a.getAndIncrement())}));
            return thread;
        }
    }

    public final void execute(Runnable runnable) {
        this.f10517a.execute(runnable);
    }
}
