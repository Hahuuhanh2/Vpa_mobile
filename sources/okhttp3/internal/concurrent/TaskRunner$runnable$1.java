package okhttp3.internal.concurrent;

import android.support.v4.media.a;
import ek.i;
import java.util.logging.Level;
import sk.j;

/* compiled from: TaskRunner.kt */
public final class TaskRunner$runnable$1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskRunner f22214a;

    public TaskRunner$runnable$1(TaskRunner taskRunner) {
        this.f22214a = taskRunner;
    }

    public final void run() {
        Task c10;
        while (true) {
            TaskRunner taskRunner = this.f22214a;
            synchronized (taskRunner) {
                c10 = taskRunner.c();
            }
            if (c10 != null) {
                TaskQueue taskQueue = c10.f22193c;
                j.c(taskQueue);
                TaskRunner taskRunner2 = this.f22214a;
                long j10 = -1;
                TaskRunner.f22203h.getClass();
                boolean isLoggable = TaskRunner.f22205j.isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = taskQueue.f22195a.f22206a.c();
                    TaskLoggerKt.a(c10, taskQueue, "starting");
                }
                try {
                    TaskRunner.a(taskRunner2, c10);
                    i iVar = i.f20112a;
                    if (isLoggable) {
                        StringBuilder q10 = a.q("finished run in ");
                        q10.append(TaskLoggerKt.b(taskQueue.f22195a.f22206a.c() - j10));
                        TaskLoggerKt.a(c10, taskQueue, q10.toString());
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        long c11 = taskQueue.f22195a.f22206a.c() - j10;
                        StringBuilder q11 = a.q("failed a run in ");
                        q11.append(TaskLoggerKt.b(c11));
                        TaskLoggerKt.a(c10, taskQueue, q11.toString());
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
    }
}
