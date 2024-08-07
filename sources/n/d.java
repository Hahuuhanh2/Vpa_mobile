package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.o;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor */
public final class d extends o {

    /* renamed from: b  reason: collision with root package name */
    public final Object f13299b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f13300c = Executors.newFixedThreadPool(4, new a());

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f13301d;

    /* compiled from: DefaultTaskExecutor */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f13302a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder q10 = android.support.v4.media.a.q("arch_disk_io_");
            q10.append(this.f13302a.getAndIncrement());
            thread.setName(q10.toString());
            return thread;
        }
    }

    public static Handler J(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
