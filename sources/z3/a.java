package z3;

import f0.b0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture */
public abstract class a<V> implements v8.a<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f17837d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f17838e = Logger.getLogger(a.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final C0246a f17839f;

    /* renamed from: n  reason: collision with root package name */
    public static final Object f17840n = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f17841a;

    /* renamed from: b  reason: collision with root package name */
    public volatile d f17842b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f17843c;

    /* renamed from: z3.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractFuture */
    public static abstract class C0246a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractFuture */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f17844c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f17845d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f17846a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f17847b;

        static {
            if (a.f17837d) {
                f17845d = null;
                f17844c = null;
                return;
            }
            f17845d = new b((Throwable) null, false);
            f17844c = new b((Throwable) null, true);
        }

        public b(Throwable th2, boolean z10) {
            this.f17846a = z10;
            this.f17847b = th2;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f17848b = new c(new C0247a());

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f17849a;

        /* renamed from: z3.a$c$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        public class C0247a extends Throwable {
            public C0247a() {
                super("Failure occurred while trying to finish a future.");
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th2) {
            boolean z10 = a.f17837d;
            th2.getClass();
            this.f17849a = th2;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f17850d = new d((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f17851a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f17852b;

        /* renamed from: c  reason: collision with root package name */
        public d f17853c;

        public d(Runnable runnable, Executor executor) {
            this.f17851a = runnable;
            this.f17852b = executor;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class e extends C0246a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f17854a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f17855b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f17856c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f17857d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f17858e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f17854a = atomicReferenceFieldUpdater;
            this.f17855b = atomicReferenceFieldUpdater2;
            this.f17856c = atomicReferenceFieldUpdater3;
            this.f17857d = atomicReferenceFieldUpdater4;
            this.f17858e = atomicReferenceFieldUpdater5;
        }

        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f17857d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f17858e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f17856c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        public final void d(h hVar, h hVar2) {
            this.f17855b.lazySet(hVar, hVar2);
        }

        public final void e(h hVar, Thread thread) {
            this.f17854a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractFuture */
    public static final class f<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final a<V> f17859a;

        /* renamed from: b  reason: collision with root package name */
        public final v8.a<? extends V> f17860b;

        public f(a<V> aVar, v8.a<? extends V> aVar2) {
            this.f17859a = aVar;
            this.f17860b = aVar2;
        }

        public final void run() {
            if (this.f17859a.f17841a == this) {
                if (a.f17839f.b(this.f17859a, this, a.f(this.f17860b))) {
                    a.c(this.f17859a);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    public static final class g extends C0246a {
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f17842b != dVar) {
                    return false;
                }
                aVar.f17842b = dVar2;
                return true;
            }
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f17841a != obj) {
                    return false;
                }
                aVar.f17841a = obj2;
                return true;
            }
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f17843c != hVar) {
                    return false;
                }
                aVar.f17843c = hVar2;
                return true;
            }
        }

        public final void d(h hVar, h hVar2) {
            hVar.f17863b = hVar2;
        }

        public final void e(h hVar, Thread thread) {
            hVar.f17862a = thread;
        }
    }

    /* compiled from: AbstractFuture */
    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f17861c = new h(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f17862a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f17863b;

        public h(int i10) {
        }

        public h() {
            a.f17839f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: z3.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: z3.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: z3.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: z3.a$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<z3.a$h> r0 = z3.a.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f17837d = r1
            java.lang.Class<z3.a> r1 = z3.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f17838e = r1
            z3.a$e r1 = new z3.a$e     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<z3.a> r2 = z3.a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<z3.a> r0 = z3.a.class
            java.lang.Class<z3.a$d> r2 = z3.a.d.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<z3.a> r0 = z3.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            z3.a$g r1 = new z3.a$g
            r1.<init>()
        L_0x0054:
            f17839f = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f17838e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f17840n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.<clinit>():void");
    }

    public static void c(a<?> aVar) {
        a<V> aVar2;
        d dVar;
        d dVar2;
        d dVar3 = null;
        a<?> aVar3 = aVar;
        while (true) {
            h hVar = aVar3.f17843c;
            if (f17839f.c(aVar3, hVar, h.f17861c)) {
                while (hVar != null) {
                    Thread thread = hVar.f17862a;
                    if (thread != null) {
                        hVar.f17862a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f17863b;
                }
                do {
                    dVar = aVar3.f17842b;
                } while (!f17839f.a(aVar3, dVar, d.f17850d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f17853c;
                    dVar3.f17853c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f17853c;
                    Runnable runnable = dVar2.f17851a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        a<V> aVar4 = fVar.f17859a;
                        if (aVar4.f17841a == fVar) {
                            if (f17839f.b(aVar4, fVar, f(fVar.f17860b))) {
                                aVar2 = aVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f17852b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
            aVar2 = aVar3;
            aVar3 = aVar2;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f17838e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object f(v8.a<?> r5) {
        /*
            boolean r0 = r5 instanceof z3.a
            r1 = 0
            if (r0 == 0) goto L_0x0023
            z3.a r5 = (z3.a) r5
            java.lang.Object r5 = r5.f17841a
            boolean r0 = r5 instanceof z3.a.b
            if (r0 == 0) goto L_0x0022
            r0 = r5
            z3.a$b r0 = (z3.a.b) r0
            boolean r2 = r0.f17846a
            if (r2 == 0) goto L_0x0022
            java.lang.Throwable r5 = r0.f17847b
            if (r5 == 0) goto L_0x0020
            z3.a$b r5 = new z3.a$b
            java.lang.Throwable r0 = r0.f17847b
            r5.<init>(r0, r1)
            goto L_0x0022
        L_0x0020:
            z3.a$b r5 = z3.a.b.f17845d
        L_0x0022:
            return r5
        L_0x0023:
            boolean r0 = r5.isCancelled()
            boolean r2 = f17837d
            r3 = 1
            r2 = r2 ^ r3
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0031
            z3.a$b r5 = z3.a.b.f17845d
            return r5
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Object r3 = r5.get()     // Catch:{ InterruptedException -> 0x008a, all -> 0x004b }
            if (r2 == 0) goto L_0x003f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x003f:
            if (r3 != 0) goto L_0x004a
            java.lang.Object r3 = f17840n     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r5 = move-exception
            goto L_0x0056
        L_0x0046:
            r2 = move-exception
            goto L_0x005c
        L_0x0048:
            r5 = move-exception
            goto L_0x0080
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            if (r2 == 0) goto L_0x0055
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0055:
            throw r3     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0056:
            z3.a$c r0 = new z3.a$c
            r0.<init>(r5)
            return r0
        L_0x005c:
            if (r0 != 0) goto L_0x007a
            z3.a$c r0 = new z3.a$c
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r2)
            r0.<init>(r1)
            return r0
        L_0x007a:
            z3.a$b r5 = new z3.a$b
            r5.<init>(r2, r1)
            return r5
        L_0x0080:
            z3.a$c r0 = new z3.a$c
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
        L_0x008a:
            r2 = r3
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.f(v8.a):java.lang.Object");
    }

    public final void a(StringBuilder sb2) {
        Object obj;
        String str;
        boolean z10 = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
                sb2.append("]");
                return;
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e11) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e11.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == this) {
            str = "this future";
        } else {
            str = String.valueOf(obj);
        }
        sb2.append(str);
        sb2.append("]");
    }

    public final void b(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f17842b;
        if (dVar != d.f17850d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f17853c = dVar;
                if (!f17839f.a(this, dVar, dVar2)) {
                    dVar = this.f17842b;
                } else {
                    return;
                }
            } while (dVar != d.f17850d);
        }
        d(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, v8.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f17841a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof z3.a.f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f17837d
            if (r3 == 0) goto L_0x001f
            z3.a$b r3 = new z3.a$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            z3.a$b r3 = z3.a.b.f17844c
            goto L_0x0026
        L_0x0024:
            z3.a$b r3 = z3.a.b.f17845d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            z3.a$a r6 = f17839f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0054
            c(r4)
            boolean r4 = r0 instanceof z3.a.f
            if (r4 == 0) goto L_0x005d
            z3.a$f r0 = (z3.a.f) r0
            v8.a<? extends V> r0 = r0.f17860b
            boolean r4 = r0 instanceof z3.a
            if (r4 == 0) goto L_0x0050
            r4 = r0
            z3.a r4 = (z3.a) r4
            java.lang.Object r0 = r4.f17841a
            if (r0 != 0) goto L_0x0048
            r5 = r1
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            boolean r6 = r0 instanceof z3.a.f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = r1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.f17841a
            boolean r6 = r0 instanceof z3.a.f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.cancel(boolean):boolean");
    }

    public final V e(Object obj) {
        if (obj instanceof b) {
            Throwable th2 = ((b) obj).f17847b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f17849a);
        } else if (obj == f17840n) {
            return null;
        } else {
            return obj;
        }
    }

    public final String g() {
        String str;
        Object obj = this.f17841a;
        if (obj instanceof f) {
            StringBuilder q10 = android.support.v4.media.a.q("setFuture=[");
            v8.a<? extends V> aVar = ((f) obj).f17860b;
            if (aVar == this) {
                str = "this future";
            } else {
                str = String.valueOf(aVar);
            }
            return android.support.v4.media.a.o(q10, str, "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder q11 = android.support.v4.media.a.q("remaining delay=[");
            q11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            q11.append(" ms]");
            return q11.toString();
        }
    }

    public final V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f17841a;
            boolean z10 = true;
            if ((obj != null) && (!(obj instanceof f))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f17843c;
                if (hVar != h.f17861c) {
                    h hVar2 = new h();
                    do {
                        C0246a aVar = f17839f;
                        aVar.d(hVar2, hVar);
                        if (aVar.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f17841a;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(hVar2);
                        } else {
                            hVar = this.f17843c;
                        }
                    } while (hVar != h.f17861c);
                }
                return e(this.f17841a);
            }
            while (nanos > 0) {
                Object obj3 = this.f17841a;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar2 = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String r10 = b0.r(str, " (plus ");
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i10 != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (i10 > 0) {
                    String str2 = r10 + convert + " " + lowerCase;
                    if (z10) {
                        str2 = b0.r(str2, ",");
                    }
                    r10 = b0.r(str2, " ");
                }
                if (z10) {
                    r10 = r10 + nanos2 + " nanoseconds ";
                }
                str = b0.r(r10, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(b0.r(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(b0.s(str, " for ", aVar2));
        }
        throw new InterruptedException();
    }

    public final void h(h hVar) {
        hVar.f17862a = null;
        while (true) {
            h hVar2 = this.f17843c;
            if (hVar2 != h.f17861c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f17863b;
                    if (hVar2.f17862a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f17863b = hVar4;
                        if (hVar3.f17862a == null) {
                        }
                    } else if (!f17839f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.f17841a instanceof b;
    }

    public final boolean isDone() {
        boolean z10;
        Object obj = this.f17841a;
        if (obj != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof f)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f17841a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = g();
            } catch (RuntimeException e10) {
                StringBuilder q10 = android.support.v4.media.a.q("Exception thrown from implementation: ");
                q10.append(e10.getClass());
                str = q10.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f17841a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f17843c;
            if (hVar != h.f17861c) {
                h hVar2 = new h();
                do {
                    C0246a aVar = f17839f;
                    aVar.d(hVar2, hVar);
                    if (aVar.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f17841a;
                            } else {
                                h(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f17843c;
                } while (hVar != h.f17861c);
            }
            return e(this.f17841a);
        }
        throw new InterruptedException();
    }
}
