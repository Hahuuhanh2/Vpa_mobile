package o5;

import java.util.concurrent.Executor;

/* compiled from: Executors */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13740a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f13741b = new b();

    /* compiled from: Executors */
    public class a implements Executor {
        public final void execute(Runnable runnable) {
            l.f().post(runnable);
        }
    }

    /* compiled from: Executors */
    public class b implements Executor {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
