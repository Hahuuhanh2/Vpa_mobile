package ia;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils */
public final class h0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11309a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f11310b;

    /* compiled from: ExecutorUtils */
    public class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f11311a;

        public a(Runnable runnable) {
            this.f11311a = runnable;
        }

        public final void a() {
            this.f11311a.run();
        }
    }

    public h0(String str, AtomicLong atomicLong) {
        this.f11309a = str;
        this.f11310b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f11309a + this.f11310b.getAndIncrement());
        return newThread;
    }
}
