package lc;

import com.google.android.gms.internal.mlkit_common.zzbh;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t6.j;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class i extends zzbh {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f12916b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f12917a;

    public i() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r(defaultThreadFactory));
        this.f12917a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f12916b.get();
        if (deque == null || deque.size() > 1) {
            this.f12917a.execute(new j(runnable, 3));
            return;
        }
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    public final /* synthetic */ Object zza() {
        return this.f12917a;
    }

    public final ExecutorService zzb() {
        return this.f12917a;
    }
}
