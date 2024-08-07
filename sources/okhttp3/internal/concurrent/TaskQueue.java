package okhttp3.internal.concurrent;

import android.support.v4.media.a;
import ek.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: TaskQueue.kt */
public final class TaskQueue {

    /* renamed from: a  reason: collision with root package name */
    public final TaskRunner f22195a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22196b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22197c;

    /* renamed from: d  reason: collision with root package name */
    public Task f22198d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f22199e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f22200f;

    /* compiled from: TaskQueue.kt */
    public static final class AwaitIdleTask extends Task {

        /* renamed from: e  reason: collision with root package name */
        public final CountDownLatch f22201e = new CountDownLatch(1);

        public AwaitIdleTask() {
            super(a.o(new StringBuilder(), Util.f22177g, " awaitIdle"), false);
        }

        public final long a() {
            this.f22201e.countDown();
            return -1;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        j.f(taskRunner, "taskRunner");
        j.f(str, "name");
        this.f22195a = taskRunner;
        this.f22196b = str;
    }

    public final void a() {
        byte[] bArr = Util.f22171a;
        synchronized (this.f22195a) {
            if (b()) {
                this.f22195a.e(this);
            }
            i iVar = i.f20112a;
        }
    }

    public final boolean b() {
        Task task = this.f22198d;
        if (task != null && task.f22192b) {
            this.f22200f = true;
        }
        boolean z10 = false;
        for (int size = this.f22199e.size() - 1; -1 < size; size--) {
            if (((Task) this.f22199e.get(size)).f22192b) {
                Task task2 = (Task) this.f22199e.get(size);
                TaskRunner.f22203h.getClass();
                if (TaskRunner.f22205j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task2, this, "canceled");
                }
                this.f22199e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(okhttp3.internal.concurrent.Task r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            sk.j.f(r3, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r2.f22195a
            monitor-enter(r0)
            boolean r1 = r2.f22197c     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.f22192b     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0026
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.f22203h     // Catch:{ all -> 0x0050 }
            r4.getClass()     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = okhttp3.internal.concurrent.TaskRunner.f22205j     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.a(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0024:
            monitor-exit(r0)
            return
        L_0x0026:
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.f22203h     // Catch:{ all -> 0x0050 }
            r4.getClass()     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = okhttp3.internal.concurrent.TaskRunner.f22205j     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.a(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            okhttp3.internal.concurrent.TaskRunner r3 = r2.f22195a     // Catch:{ all -> 0x0050 }
            r3.e(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            ek.i r3 = ek.i.f20112a     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.c(okhttp3.internal.concurrent.Task, long):void");
    }

    public final boolean d(Task task, long j10, boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        j.f(task, "task");
        TaskQueue taskQueue = task.f22193c;
        if (taskQueue != this) {
            if (taskQueue == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                task.f22193c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c10 = this.f22195a.f22206a.c();
        long j11 = c10 + j10;
        int indexOf = this.f22199e.indexOf(task);
        if (indexOf != -1) {
            if (task.f22194d <= j11) {
                TaskRunner.f22203h.getClass();
                if (TaskRunner.f22205j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "already scheduled");
                }
                return false;
            }
            this.f22199e.remove(indexOf);
        }
        task.f22194d = j11;
        TaskRunner.f22203h.getClass();
        if (TaskRunner.f22205j.isLoggable(Level.FINE)) {
            if (z10) {
                StringBuilder q10 = a.q("run again after ");
                q10.append(TaskLoggerKt.b(j11 - c10));
                str = q10.toString();
            } else {
                StringBuilder q11 = a.q("scheduled after ");
                q11.append(TaskLoggerKt.b(j11 - c10));
                str = q11.toString();
            }
            TaskLoggerKt.a(task, this, str);
        }
        Iterator it = this.f22199e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((Task) it.next()).f22194d - c10 > j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f22199e.size();
        }
        this.f22199e.add(i10, task);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = Util.f22171a;
        synchronized (this.f22195a) {
            this.f22197c = true;
            if (b()) {
                this.f22195a.e(this);
            }
            i iVar = i.f20112a;
        }
    }

    public final String toString() {
        return this.f22196b;
    }
}
