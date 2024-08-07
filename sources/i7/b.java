package i7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import t6.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f11190a = "GAC_Transform";

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f11191b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    public final ThreadFactory f11192c = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11192c.newThread(new i(runnable));
        int andIncrement = this.f11191b.getAndIncrement();
        newThread.setName(this.f11190a + "[" + andIncrement + "]");
        return newThread;
    }
}
