package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Logger;
import sk.j;

/* compiled from: TaskLogger.kt */
public final class TaskLoggerKt {
    public static final void a(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.f22203h.getClass();
        Logger logger = TaskRunner.f22205j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.f22196b);
        sb2.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        j.e(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(task.f22191a);
        logger.fine(sb2.toString());
    }

    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        j.e(format, "format(format, *args)");
        return format;
    }
}
