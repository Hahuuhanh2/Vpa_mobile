package c0;

import f0.p;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CameraExecutor */
public final class m implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4304c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Object f4305a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public ThreadPoolExecutor f4306b;

    /* compiled from: CameraExecutor */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f4307a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", new Object[]{Integer.valueOf(this.f4307a.getAndIncrement())}));
            return thread;
        }
    }

    public m() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f4304c);
        threadPoolExecutor.setRejectedExecutionHandler(new l());
        this.f4306b = threadPoolExecutor;
    }

    public final void a(p pVar) {
        ThreadPoolExecutor threadPoolExecutor;
        pVar.getClass();
        synchronized (this.f4305a) {
            try {
                if (this.f4306b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f4304c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new l());
                    this.f4306b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f4306b;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        int max = Math.max(1, pVar.a().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f4305a) {
            this.f4306b.execute(runnable);
        }
    }
}
