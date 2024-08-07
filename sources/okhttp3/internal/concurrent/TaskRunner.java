package okhttp3.internal.concurrent;

import ek.i;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kl.a;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: TaskRunner.kt */
public final class TaskRunner {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f22203h = new Companion(0);

    /* renamed from: i  reason: collision with root package name */
    public static final TaskRunner f22204i;

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f22205j;

    /* renamed from: a  reason: collision with root package name */
    public final Backend f22206a;

    /* renamed from: b  reason: collision with root package name */
    public int f22207b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22208c;

    /* renamed from: d  reason: collision with root package name */
    public long f22209d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f22210e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f22211f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final TaskRunner$runnable$1 f22212g = new TaskRunner$runnable$1(this);

    /* compiled from: TaskRunner.kt */
    public interface Backend {
        void a(TaskRunner taskRunner);

        void b(TaskRunner taskRunner, long j10);

        long c();

        void execute(Runnable runnable);
    }

    /* compiled from: TaskRunner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: TaskRunner.kt */
    public static final class RealBackend implements Backend {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f22213a;

        public RealBackend(a aVar) {
            this.f22213a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }

        public final void a(TaskRunner taskRunner) {
            j.f(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        public final void b(TaskRunner taskRunner, long j10) {
            j.f(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        public final long c() {
            return System.nanoTime();
        }

        public final void execute(Runnable runnable) {
            j.f(runnable, "runnable");
            this.f22213a.execute(runnable);
        }
    }

    static {
        String str = Util.f22177g + " TaskRunner";
        j.f(str, "name");
        f22204i = new TaskRunner(new RealBackend(new a(str, true)));
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        j.e(logger, "getLogger(TaskRunner::class.java.name)");
        f22205j = logger;
    }

    public TaskRunner(RealBackend realBackend) {
        this.f22206a = realBackend;
    }

    public static final void a(TaskRunner taskRunner, Task task) {
        taskRunner.getClass();
        byte[] bArr = Util.f22171a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(task.f22191a);
        try {
            long a10 = task.a();
            synchronized (taskRunner) {
                taskRunner.b(task, a10);
                i iVar = i.f20112a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (taskRunner) {
                taskRunner.b(task, -1);
                i iVar2 = i.f20112a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(Task task, long j10) {
        boolean z10;
        byte[] bArr = Util.f22171a;
        TaskQueue taskQueue = task.f22193c;
        j.c(taskQueue);
        if (taskQueue.f22198d == task) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean z11 = taskQueue.f22200f;
            taskQueue.f22200f = false;
            taskQueue.f22198d = null;
            this.f22210e.remove(taskQueue);
            if (j10 != -1 && !z11 && !taskQueue.f22197c) {
                taskQueue.d(task, j10, true);
            }
            if (!taskQueue.f22199e.isEmpty()) {
                this.f22211f.add(taskQueue);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.concurrent.Task c() {
        /*
            r14 = this;
            byte[] r0 = okhttp3.internal.Util.f22171a
        L_0x0002:
            java.util.ArrayList r0 = r14.f22211f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f22206a
            long r2 = r0.c()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.ArrayList r0 = r14.f22211f
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x001e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r0.next()
            okhttp3.internal.concurrent.TaskQueue r7 = (okhttp3.internal.concurrent.TaskQueue) r7
            java.util.ArrayList r7 = r7.f22199e
            java.lang.Object r7 = r7.get(r9)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            long r10 = r7.f22194d
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0046
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x001e
        L_0x0046:
            if (r6 == 0) goto L_0x004a
            r0 = r8
            goto L_0x004d
        L_0x004a:
            r6 = r7
            goto L_0x001e
        L_0x004c:
            r0 = r9
        L_0x004d:
            if (r6 == 0) goto L_0x0082
            byte[] r1 = okhttp3.internal.Util.f22171a
            r1 = -1
            r6.f22194d = r1
            okhttp3.internal.concurrent.TaskQueue r1 = r6.f22193c
            sk.j.c(r1)
            java.util.ArrayList r2 = r1.f22199e
            r2.remove(r6)
            java.util.ArrayList r2 = r14.f22211f
            r2.remove(r1)
            r1.f22198d = r6
            java.util.ArrayList r2 = r14.f22210e
            r2.add(r1)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r14.f22208c
            if (r0 != 0) goto L_0x0081
            java.util.ArrayList r0 = r14.f22211f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0081
        L_0x007a:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f22206a
            okhttp3.internal.concurrent.TaskRunner$runnable$1 r1 = r14.f22212g
            r0.execute(r1)
        L_0x0081:
            return r6
        L_0x0082:
            boolean r0 = r14.f22208c
            if (r0 == 0) goto L_0x0093
            long r6 = r14.f22209d
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f22206a
            r0.a(r14)
        L_0x0092:
            return r1
        L_0x0093:
            r14.f22208c = r8
            long r2 = r2 + r4
            r14.f22209d = r2
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r14.f22206a     // Catch:{ InterruptedException -> 0x00a0 }
            r0.b(r14, r4)     // Catch:{ InterruptedException -> 0x00a0 }
            goto L_0x00a3
        L_0x009e:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a0:
            r14.d()     // Catch:{ all -> 0x009e }
        L_0x00a3:
            r14.f22208c = r9
            goto L_0x0002
        L_0x00a7:
            r14.f22208c = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskRunner.c():okhttp3.internal.concurrent.Task");
    }

    public final void d() {
        for (int size = this.f22210e.size() - 1; -1 < size; size--) {
            ((TaskQueue) this.f22210e.get(size)).b();
        }
        for (int size2 = this.f22211f.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) this.f22211f.get(size2);
            taskQueue.b();
            if (taskQueue.f22199e.isEmpty()) {
                this.f22211f.remove(size2);
            }
        }
    }

    public final void e(TaskQueue taskQueue) {
        j.f(taskQueue, "taskQueue");
        byte[] bArr = Util.f22171a;
        if (taskQueue.f22198d == null) {
            if (!taskQueue.f22199e.isEmpty()) {
                ArrayList arrayList = this.f22211f;
                j.f(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                this.f22211f.remove(taskQueue);
            }
        }
        if (this.f22208c) {
            this.f22206a.a(this);
        } else {
            this.f22206a.execute(this.f22212g);
        }
    }

    public final TaskQueue f() {
        int i10;
        synchronized (this) {
            i10 = this.f22207b;
            this.f22207b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new TaskQueue(this, sb2.toString());
    }
}
