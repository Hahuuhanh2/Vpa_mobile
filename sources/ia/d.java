package ia;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable */
public abstract class d implements Runnable {
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
