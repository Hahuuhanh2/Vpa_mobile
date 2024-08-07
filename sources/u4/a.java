package u4;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources */
public final class a implements ThreadFactory {

    /* renamed from: u4.a$a  reason: collision with other inner class name */
    /* compiled from: ActiveResources */
    public class C0203a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f15092a;

        public C0203a(Runnable runnable) {
            this.f15092a = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f15092a.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C0203a(runnable), "glide-active-resources");
    }
}
