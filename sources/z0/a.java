package z0;

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

/* compiled from: AbstractResolvableFuture */
public abstract class a<V> implements v8.a<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f17774d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f17775e = Logger.getLogger(a.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final C0241a f17776f;

    /* renamed from: n  reason: collision with root package name */
    public static final Object f17777n = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f17778a;

    /* renamed from: b  reason: collision with root package name */
    public volatile d f17779b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f17780c;

    /* renamed from: z0.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractResolvableFuture */
    public static abstract class C0241a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f17781c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f17782d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f17783a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f17784b;

        static {
            if (a.f17774d) {
                f17782d = null;
                f17781c = null;
                return;
            }
            f17782d = new b((Throwable) null, false);
            f17781c = new b((Throwable) null, true);
        }

        public b(Throwable th2, boolean z10) {
            this.f17783a = z10;
            this.f17784b = th2;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f17785a;

        /* renamed from: z0.a$c$a  reason: collision with other inner class name */
        /* compiled from: AbstractResolvableFuture */
        public class C0242a extends Throwable {
            public C0242a() {
                super("Failure occurred while trying to finish a future.");
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0242a());
        }

        public c(Throwable th2) {
            boolean z10 = a.f17774d;
            th2.getClass();
            this.f17785a = th2;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f17786d = new d((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f17787a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f17788b;

        /* renamed from: c  reason: collision with root package name */
        public d f17789c;

        public d(Runnable runnable, Executor executor) {
            this.f17787a = runnable;
            this.f17788b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    public static final class e extends C0241a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f17790a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f17791b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f17792c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f17793d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f17794e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f17790a = atomicReferenceFieldUpdater;
            this.f17791b = atomicReferenceFieldUpdater2;
            this.f17792c = atomicReferenceFieldUpdater3;
            this.f17793d = atomicReferenceFieldUpdater4;
            this.f17794e = atomicReferenceFieldUpdater5;
        }

        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f17793d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f17794e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f17792c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        public final void d(h hVar, h hVar2) {
            this.f17791b.lazySet(hVar, hVar2);
        }

        public final void e(h hVar, Thread thread) {
            this.f17790a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture */
    public static final class f<V> implements Runnable {
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    public static final class g extends C0241a {
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f17779b != dVar) {
                    return false;
                }
                aVar.f17779b = dVar2;
                return true;
            }
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f17778a != obj) {
                    return false;
                }
                aVar.f17778a = obj2;
                return true;
            }
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f17780c != hVar) {
                    return false;
                }
                aVar.f17780c = hVar2;
                return true;
            }
        }

        public final void d(h hVar, h hVar2) {
            hVar.f17797b = hVar2;
        }

        public final void e(h hVar, Thread thread) {
            hVar.f17796a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture */
    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f17795c = new h(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f17796a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f17797b;

        public h(int i10) {
        }

        public h() {
            a.f17776f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: z0.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: z0.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: z0.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: z0.a$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<z0.a$h> r0 = z0.a.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f17774d = r1
            java.lang.Class<z0.a> r1 = z0.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f17775e = r1
            z0.a$e r1 = new z0.a$e     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<z0.a> r2 = z0.a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<z0.a> r0 = z0.a.class
            java.lang.Class<z0.a$d> r2 = z0.a.d.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<z0.a> r0 = z0.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            z0.a$g r1 = new z0.a$g
            r1.<init>()
        L_0x0054:
            f17776f = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f17775e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f17777n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.a.<clinit>():void");
    }

    public static void j(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f17780c;
        } while (!f17776f.c(aVar, hVar, h.f17795c));
        while (hVar != null) {
            Thread thread = hVar.f17796a;
            if (thread != null) {
                hVar.f17796a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f17797b;
        }
        aVar.i();
        do {
            dVar = aVar.f17779b;
        } while (!f17776f.a(aVar, dVar, d.f17786d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f17789c;
            dVar.f17789c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f17789c;
            Runnable runnable = dVar2.f17787a;
            if (!(runnable instanceof f)) {
                k(runnable, dVar2.f17788b);
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
            }
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f17775e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    public final void b(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f17779b;
        if (dVar != d.f17786d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f17789c = dVar;
                if (!f17776f.a(this, dVar, dVar2)) {
                    dVar = this.f17779b;
                } else {
                    return;
                }
            } while (dVar != d.f17786d);
        }
        k(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
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

    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        Object obj = this.f17778a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || (obj instanceof f)) {
            if (f17774d) {
                bVar = new b(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                bVar = b.f17781c;
            } else {
                bVar = b.f17782d;
            }
            while (!f17776f.b(this, obj, bVar)) {
                obj = this.f17778a;
                if (!(obj instanceof f)) {
                }
            }
            j(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    public final V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f17778a;
            boolean z10 = true;
            if ((obj != null) && (!(obj instanceof f))) {
                return m(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f17780c;
                if (hVar != h.f17795c) {
                    h hVar2 = new h();
                    do {
                        C0241a aVar = f17776f;
                        aVar.d(hVar2, hVar);
                        if (aVar.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f17778a;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return m(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(hVar2);
                        } else {
                            hVar = this.f17780c;
                        }
                    } while (hVar != h.f17795c);
                }
                return m(this.f17778a);
            }
            while (nanos > 0) {
                Object obj3 = this.f17778a;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return m(obj3);
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

    public void i() {
    }

    public final boolean isCancelled() {
        return this.f17778a instanceof b;
    }

    public final boolean isDone() {
        boolean z10;
        Object obj = this.f17778a;
        if (obj != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof f)) & z10;
    }

    public final V m(Object obj) {
        if (obj instanceof b) {
            Throwable th2 = ((b) obj).f17784b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f17785a);
        } else if (obj == f17777n) {
            return null;
        } else {
            return obj;
        }
    }

    public String n() {
        Object obj = this.f17778a;
        if (obj instanceof f) {
            StringBuilder q10 = android.support.v4.media.a.q("setFuture=[");
            ((f) obj).getClass();
            q10.append("null");
            q10.append("]");
            return q10.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder q11 = android.support.v4.media.a.q("remaining delay=[");
            q11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            q11.append(" ms]");
            return q11.toString();
        }
    }

    public final void o(h hVar) {
        hVar.f17796a = null;
        while (true) {
            h hVar2 = this.f17780c;
            if (hVar2 != h.f17795c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f17797b;
                    if (hVar2.f17796a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f17797b = hVar4;
                        if (hVar3.f17796a == null) {
                        }
                    } else if (!f17776f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean p(V v2) {
        if (v2 == null) {
            v2 = f17777n;
        }
        if (!f17776f.b(this, (Object) null, v2)) {
            return false;
        }
        j(this);
        return true;
    }

    public boolean q(Throwable th2) {
        th2.getClass();
        if (!f17776f.b(this, (Object) null, new c(th2))) {
            return false;
        }
        j(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f17778a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                str = n();
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
                c(sb2);
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
            Object obj2 = this.f17778a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return m(obj2);
            }
            h hVar = this.f17780c;
            if (hVar != h.f17795c) {
                h hVar2 = new h();
                do {
                    C0241a aVar = f17776f;
                    aVar.d(hVar2, hVar);
                    if (aVar.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f17778a;
                            } else {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return m(obj);
                    }
                    hVar = this.f17780c;
                } while (hVar != h.f17795c);
            }
            return m(this.f17778a);
        }
        throw new InterruptedException();
    }
}
