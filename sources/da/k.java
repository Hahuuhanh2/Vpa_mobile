package da;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import y6.j;

/* compiled from: SequentialExecutor */
public final class k implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f8854f = Logger.getLogger(k.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8855a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f8856b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public int f8857c = 1;

    /* renamed from: d  reason: collision with root package name */
    public long f8858d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final b f8859e = new b();

    /* compiled from: SequentialExecutor */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f8860a;

        public a(Runnable runnable) {
            this.f8860a = runnable;
        }

        public final void run() {
            this.f8860a.run();
        }

        public final String toString() {
            return this.f8860a.toString();
        }
    }

    /* compiled from: SequentialExecutor */
    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f8861a;

        public b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r10.f8861a.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            da.k.f8854f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f8861a, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r10 = this;
                r0 = 0
                r1 = r0
            L_0x0002:
                da.k r2 = da.k.this     // Catch:{ all -> 0x0076 }
                java.util.ArrayDeque r2 = r2.f8856b     // Catch:{ all -> 0x0076 }
                monitor-enter(r2)     // Catch:{ all -> 0x0076 }
                r3 = 1
                if (r0 != 0) goto L_0x0026
                da.k r0 = da.k.this     // Catch:{ all -> 0x0073 }
                int r4 = r0.f8857c     // Catch:{ all -> 0x0073 }
                r5 = 4
                if (r4 != r5) goto L_0x001c
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                if (r1 == 0) goto L_0x001b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001b:
                return
            L_0x001c:
                long r6 = r0.f8858d     // Catch:{ all -> 0x0073 }
                r8 = 1
                long r6 = r6 + r8
                r0.f8858d = r6     // Catch:{ all -> 0x0073 }
                r0.f8857c = r5     // Catch:{ all -> 0x0073 }
                r0 = r3
            L_0x0026:
                da.k r4 = da.k.this     // Catch:{ all -> 0x0073 }
                java.util.ArrayDeque r4 = r4.f8856b     // Catch:{ all -> 0x0073 }
                java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0073 }
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0073 }
                r10.f8861a = r4     // Catch:{ all -> 0x0073 }
                if (r4 != 0) goto L_0x0043
                da.k r0 = da.k.this     // Catch:{ all -> 0x0073 }
                r0.f8857c = r3     // Catch:{ all -> 0x0073 }
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                if (r1 == 0) goto L_0x0042
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x0042:
                return
            L_0x0043:
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0076 }
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r10.f8861a     // Catch:{ RuntimeException -> 0x0052 }
                r3.run()     // Catch:{ RuntimeException -> 0x0052 }
                goto L_0x006d
            L_0x0050:
                r0 = move-exception
                goto L_0x0070
            L_0x0052:
                r3 = move-exception
                java.util.logging.Logger r4 = da.k.f8854f     // Catch:{ all -> 0x0050 }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0050 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
                r6.<init>()     // Catch:{ all -> 0x0050 }
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch:{ all -> 0x0050 }
                java.lang.Runnable r7 = r10.f8861a     // Catch:{ all -> 0x0050 }
                r6.append(r7)     // Catch:{ all -> 0x0050 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0050 }
                r4.log(r5, r6, r3)     // Catch:{ all -> 0x0050 }
            L_0x006d:
                r10.f8861a = r2     // Catch:{ all -> 0x0076 }
                goto L_0x0002
            L_0x0070:
                r10.f8861a = r2     // Catch:{ all -> 0x0076 }
                throw r0     // Catch:{ all -> 0x0076 }
            L_0x0073:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                throw r0     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r0 = move-exception
                if (r1 == 0) goto L_0x0080
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0080:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: da.k.b.a():void");
        }

        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k.this.f8856b) {
                    k.this.f8857c = 1;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f8861a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            StringBuilder q10 = android.support.v4.media.a.q("SequentialExecutorWorker{state=");
            q10.append(android.support.v4.media.a.C(k.this.f8857c));
            q10.append("}");
            return q10.toString();
        }
    }

    public k(Executor executor) {
        j.f(executor);
        this.f8855a = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f8855a.execute(r8.f8859e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r8.f8857c == 2) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r6 = r8.f8856b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r8.f8858d != r3) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r8.f8857c != 2) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r8.f8857c = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        monitor-enter(r8.f8856b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4 = r8.f8857c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005b, code lost:
        if ((r2 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0061, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r9) {
        /*
            r8 = this;
            y6.j.f(r9)
            java.util.ArrayDeque r0 = r8.f8856b
            monitor-enter(r0)
            int r1 = r8.f8857c     // Catch:{ all -> 0x006c }
            r2 = 4
            if (r1 == r2) goto L_0x0065
            r2 = 3
            if (r1 != r2) goto L_0x000f
            goto L_0x0065
        L_0x000f:
            long r3 = r8.f8858d     // Catch:{ all -> 0x006c }
            da.k$a r1 = new da.k$a     // Catch:{ all -> 0x006c }
            r1.<init>(r9)     // Catch:{ all -> 0x006c }
            java.util.ArrayDeque r9 = r8.f8856b     // Catch:{ all -> 0x006c }
            r9.add(r1)     // Catch:{ all -> 0x006c }
            r9 = 2
            r8.f8857c = r9     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            r0 = 0
            r5 = 1
            java.util.concurrent.Executor r6 = r8.f8855a     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            da.k$b r7 = r8.f8859e     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            int r1 = r8.f8857c
            if (r1 == r9) goto L_0x002d
            r0 = r5
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            return
        L_0x0030:
            java.util.ArrayDeque r6 = r8.f8856b
            monitor-enter(r6)
            long r0 = r8.f8858d     // Catch:{ all -> 0x0041 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
            int r0 = r8.f8857c     // Catch:{ all -> 0x0041 }
            if (r0 != r9) goto L_0x003f
            r8.f8857c = r2     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r6)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0041 }
            throw r9
        L_0x0044:
            r2 = move-exception
            goto L_0x0047
        L_0x0046:
            r2 = move-exception
        L_0x0047:
            java.util.ArrayDeque r3 = r8.f8856b
            monitor-enter(r3)
            int r4 = r8.f8857c     // Catch:{ all -> 0x0062 }
            if (r4 == r5) goto L_0x0050
            if (r4 != r9) goto L_0x0059
        L_0x0050:
            java.util.ArrayDeque r9 = r8.f8856b     // Catch:{ all -> 0x0062 }
            boolean r9 = r9.removeLastOccurrence(r1)     // Catch:{ all -> 0x0062 }
            if (r9 == 0) goto L_0x0059
            r0 = r5
        L_0x0059:
            boolean r9 = r2 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0062 }
            if (r9 == 0) goto L_0x0061
            if (r0 != 0) goto L_0x0061
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            return
        L_0x0061:
            throw r2     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            throw r9
        L_0x0065:
            java.util.ArrayDeque r1 = r8.f8856b     // Catch:{ all -> 0x006c }
            r1.add(r9)     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: da.k.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("SequentialExecutor@");
        q10.append(System.identityHashCode(this));
        q10.append("{");
        q10.append(this.f8855a);
        q10.append("}");
        return q10.toString();
    }
}
