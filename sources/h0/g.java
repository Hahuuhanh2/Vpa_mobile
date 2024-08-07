package h0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SequentialExecutor */
public final class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f10520a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f10521b;

    /* renamed from: c  reason: collision with root package name */
    public final b f10522c = new b();

    /* renamed from: d  reason: collision with root package name */
    public int f10523d = 1;

    /* renamed from: e  reason: collision with root package name */
    public long f10524e = 0;

    /* compiled from: SequentialExecutor */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f10525a;

        public a(Runnable runnable) {
            this.f10525a = runnable;
        }

        public final void run() {
            this.f10525a.run();
        }
    }

    /* compiled from: SequentialExecutor */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r4.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return;
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r10 = this;
                r0 = 0
                r1 = r0
            L_0x0002:
                h0.g r2 = h0.g.this     // Catch:{ all -> 0x0057 }
                java.util.ArrayDeque r2 = r2.f10520a     // Catch:{ all -> 0x0057 }
                monitor-enter(r2)     // Catch:{ all -> 0x0057 }
                r3 = 1
                if (r0 != 0) goto L_0x0026
                h0.g r0 = h0.g.this     // Catch:{ all -> 0x0054 }
                int r4 = r0.f10523d     // Catch:{ all -> 0x0054 }
                r5 = 4
                if (r4 != r5) goto L_0x001c
                monitor-exit(r2)     // Catch:{ all -> 0x0054 }
                if (r1 == 0) goto L_0x001b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001b:
                return
            L_0x001c:
                long r6 = r0.f10524e     // Catch:{ all -> 0x0054 }
                r8 = 1
                long r6 = r6 + r8
                r0.f10524e = r6     // Catch:{ all -> 0x0054 }
                r0.f10523d = r5     // Catch:{ all -> 0x0054 }
                r0 = r3
            L_0x0026:
                h0.g r4 = h0.g.this     // Catch:{ all -> 0x0054 }
                java.util.ArrayDeque r4 = r4.f10520a     // Catch:{ all -> 0x0054 }
                java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0054 }
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0054 }
                if (r4 != 0) goto L_0x0041
                h0.g r0 = h0.g.this     // Catch:{ all -> 0x0054 }
                r0.f10523d = r3     // Catch:{ all -> 0x0054 }
                monitor-exit(r2)     // Catch:{ all -> 0x0054 }
                if (r1 == 0) goto L_0x0040
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x0040:
                return
            L_0x0041:
                monitor-exit(r2)     // Catch:{ all -> 0x0054 }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0057 }
                r1 = r1 | r2
                r4.run()     // Catch:{ RuntimeException -> 0x004b }
                goto L_0x0002
            L_0x004b:
                java.lang.String r2 = "SequentialExecutor"
                r4.toString()     // Catch:{ all -> 0x0057 }
                c0.p0.c(r2)     // Catch:{ all -> 0x0057 }
                goto L_0x0002
            L_0x0054:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0054 }
                throw r0     // Catch:{ all -> 0x0057 }
            L_0x0057:
                r0 = move-exception
                if (r1 == 0) goto L_0x0061
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0061:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.g.b.a():void");
        }

        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (g.this.f10520a) {
                    g.this.f10523d = 1;
                    throw e10;
                }
            }
        }
    }

    public g(Executor executor) {
        executor.getClass();
        this.f10521b = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f10521b.execute(r8.f10522c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r8.f10523d == 2) goto L_0x002d;
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
        r6 = r8.f10520a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r8.f10524e != r3) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r8.f10523d != 2) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r8.f10523d = 3;
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
        monitor-enter(r8.f10520a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4 = r8.f10523d;
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
            r9.getClass()
            java.util.ArrayDeque r0 = r8.f10520a
            monitor-enter(r0)
            int r1 = r8.f10523d     // Catch:{ all -> 0x006c }
            r2 = 4
            if (r1 == r2) goto L_0x0065
            r2 = 3
            if (r1 != r2) goto L_0x000f
            goto L_0x0065
        L_0x000f:
            long r3 = r8.f10524e     // Catch:{ all -> 0x006c }
            h0.g$a r1 = new h0.g$a     // Catch:{ all -> 0x006c }
            r1.<init>(r9)     // Catch:{ all -> 0x006c }
            java.util.ArrayDeque r9 = r8.f10520a     // Catch:{ all -> 0x006c }
            r9.add(r1)     // Catch:{ all -> 0x006c }
            r9 = 2
            r8.f10523d = r9     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            r0 = 0
            r5 = 1
            java.util.concurrent.Executor r6 = r8.f10521b     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            h0.g$b r7 = r8.f10522c     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            int r1 = r8.f10523d
            if (r1 == r9) goto L_0x002d
            r0 = r5
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            return
        L_0x0030:
            java.util.ArrayDeque r6 = r8.f10520a
            monitor-enter(r6)
            long r0 = r8.f10524e     // Catch:{ all -> 0x0041 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
            int r0 = r8.f10523d     // Catch:{ all -> 0x0041 }
            if (r0 != r9) goto L_0x003f
            r8.f10523d = r2     // Catch:{ all -> 0x0041 }
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
            java.util.ArrayDeque r3 = r8.f10520a
            monitor-enter(r3)
            int r4 = r8.f10523d     // Catch:{ all -> 0x0062 }
            if (r4 == r5) goto L_0x0050
            if (r4 != r9) goto L_0x0059
        L_0x0050:
            java.util.ArrayDeque r9 = r8.f10520a     // Catch:{ all -> 0x0062 }
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
            java.util.ArrayDeque r1 = r8.f10520a     // Catch:{ all -> 0x006c }
            r1.add(r9)     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.execute(java.lang.Runnable):void");
    }
}
