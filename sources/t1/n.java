package t1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor */
public final class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f14791a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public int f14792b = 10;

    /* compiled from: RequestExecutor */
    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final int f14793a;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f14793a = i10;
        }

        public final void run() {
            Process.setThreadPriority(this.f14793a);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f14791a, this.f14792b);
    }
}
