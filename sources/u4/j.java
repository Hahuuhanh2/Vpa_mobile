package u4;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import b5.l;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p5.a;
import p5.d;
import s4.g;
import s4.k;
import u4.h;
import u4.m;
import u4.n;
import v.v;

/* compiled from: DecodeJob */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public boolean A;
    public Object B;
    public Thread C;
    public s4.e D;
    public s4.e E;
    public Object F;
    public s4.a G;
    public com.bumptech.glide.load.data.d<?> H;
    public volatile h I;
    public volatile boolean J;
    public volatile boolean K;
    public boolean L;

    /* renamed from: a  reason: collision with root package name */
    public final i<R> f15133a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15134b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final d.a f15135c = new d.a();

    /* renamed from: d  reason: collision with root package name */
    public final d f15136d;

    /* renamed from: e  reason: collision with root package name */
    public final v1.d<j<?>> f15137e;

    /* renamed from: f  reason: collision with root package name */
    public final c<?> f15138f = new c<>();

    /* renamed from: n  reason: collision with root package name */
    public final e f15139n = new e();

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.h f15140o;

    /* renamed from: p  reason: collision with root package name */
    public s4.e f15141p;

    /* renamed from: q  reason: collision with root package name */
    public com.bumptech.glide.j f15142q;

    /* renamed from: r  reason: collision with root package name */
    public p f15143r;

    /* renamed from: s  reason: collision with root package name */
    public int f15144s;

    /* renamed from: t  reason: collision with root package name */
    public int f15145t;

    /* renamed from: u  reason: collision with root package name */
    public l f15146u;

    /* renamed from: v  reason: collision with root package name */
    public s4.h f15147v;

    /* renamed from: w  reason: collision with root package name */
    public a<R> f15148w;

    /* renamed from: x  reason: collision with root package name */
    public int f15149x;

    /* renamed from: y  reason: collision with root package name */
    public f f15150y;

    /* renamed from: z  reason: collision with root package name */
    public int f15151z;

    /* compiled from: DecodeJob */
    public interface a<R> {
    }

    /* compiled from: DecodeJob */
    public final class b<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final s4.a f15152a;

        public b(s4.a aVar) {
            this.f15152a = aVar;
        }
    }

    /* compiled from: DecodeJob */
    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public s4.e f15154a;

        /* renamed from: b  reason: collision with root package name */
        public k<Z> f15155b;

        /* renamed from: c  reason: collision with root package name */
        public t<Z> f15156c;
    }

    /* compiled from: DecodeJob */
    public interface d {
    }

    /* compiled from: DecodeJob */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15157a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15158b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15159c;

        public final boolean a() {
            if ((this.f15159c || this.f15158b) && this.f15157a) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DecodeJob */
    public enum f {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public j(d dVar, a.c cVar) {
        this.f15136d = dVar;
        this.f15137e = cVar;
    }

    public final void b() {
        x4.a aVar;
        this.f15151z = 2;
        n nVar = (n) this.f15148w;
        if (nVar.f15214u) {
            aVar = nVar.f15209p;
        } else if (nVar.f15215v) {
            aVar = nVar.f15210q;
        } else {
            aVar = nVar.f15208o;
        }
        aVar.execute(this);
    }

    public final void c(s4.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, s4.a aVar) {
        x4.a aVar2;
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        glideException.f4993b = eVar;
        glideException.f4994c = aVar;
        glideException.f4995d = a10;
        this.f15134b.add(glideException);
        if (Thread.currentThread() != this.C) {
            this.f15151z = 2;
            n nVar = (n) this.f15148w;
            if (nVar.f15214u) {
                aVar2 = nVar.f15209p;
            } else if (nVar.f15215v) {
                aVar2 = nVar.f15210q;
            } else {
                aVar2 = nVar.f15208o;
            }
            aVar2.execute(this);
            return;
        }
        u();
    }

    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int ordinal = this.f15142q.ordinal() - jVar.f15142q.ordinal();
        if (ordinal == 0) {
            return this.f15149x - jVar.f15149x;
        }
        return ordinal;
    }

    public final void i(s4.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, s4.a aVar, s4.e eVar2) {
        x4.a aVar2;
        this.D = eVar;
        this.F = obj;
        this.H = dVar;
        this.G = aVar;
        this.E = eVar2;
        boolean z10 = false;
        if (eVar != this.f15133a.a().get(0)) {
            z10 = true;
        }
        this.L = z10;
        if (Thread.currentThread() != this.C) {
            this.f15151z = 3;
            n nVar = (n) this.f15148w;
            if (nVar.f15214u) {
                aVar2 = nVar.f15209p;
            } else if (nVar.f15215v) {
                aVar2 = nVar.f15210q;
            } else {
                aVar2 = nVar.f15208o;
            }
            aVar2.execute(this);
            return;
        }
        n();
    }

    public final d.a j() {
        return this.f15135c;
    }

    public final <Data> u<R> k(com.bumptech.glide.load.data.d<?> dVar, Data data, s4.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = o5.h.f13744a;
            SystemClock.elapsedRealtimeNanos();
            u<R> m10 = m(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m10.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f15143r);
                Thread.currentThread().getName();
            }
            return m10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> u<R> m(Data data, s4.a aVar) {
        boolean z10;
        s<Data, ?, R> c10 = this.f15133a.c(data.getClass());
        s4.h hVar = this.f15147v;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar == s4.a.RESOURCE_DISK_CACHE || this.f15133a.f15132r) {
                z10 = true;
            } else {
                z10 = false;
            }
            g gVar = l.f4035i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                hVar = new s4.h();
                hVar.f14631b.j(this.f15147v.f14631b);
                hVar.f14631b.put(gVar, Boolean.valueOf(z10));
            }
        }
        s4.h hVar2 = hVar;
        com.bumptech.glide.load.data.e f10 = this.f15140o.f4926b.f(data);
        try {
            return c10.a(this.f15144s, this.f15145t, hVar2, f10, new b(aVar));
        } finally {
            f10.b();
        }
    }

    public final void n() {
        u<R> uVar;
        boolean z10;
        c<?> cVar;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            Objects.toString(this.F);
            Objects.toString(this.D);
            Objects.toString(this.H);
            int i10 = o5.h.f13744a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f15143r);
            Thread.currentThread().getName();
        }
        t tVar = null;
        try {
            uVar = k(this.H, this.F, this.G);
        } catch (GlideException e10) {
            s4.e eVar = this.E;
            s4.a aVar = this.G;
            e10.f4993b = eVar;
            e10.f4994c = aVar;
            e10.f4995d = null;
            this.f15134b.add(e10);
            uVar = null;
        }
        if (uVar != null) {
            s4.a aVar2 = this.G;
            boolean z11 = this.L;
            if (uVar instanceof r) {
                ((r) uVar).a();
            }
            boolean z12 = false;
            if (this.f15138f.f15156c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                tVar = (t) t.f15246e.b();
                j7.a.r(tVar);
                tVar.f15250d = false;
                tVar.f15249c = true;
                tVar.f15248b = uVar;
                uVar = tVar;
            }
            q(uVar, aVar2, z11);
            this.f15150y = f.ENCODE;
            try {
                cVar = this.f15138f;
                if (cVar.f15156c != null) {
                    z12 = true;
                }
                if (z12) {
                    d dVar = this.f15136d;
                    s4.h hVar = this.f15147v;
                    cVar.getClass();
                    ((m.c) dVar).a().o(cVar.f15154a, new g(cVar.f15155b, cVar.f15156c, hVar));
                    cVar.f15156c.a();
                }
                if (tVar != null) {
                    tVar.a();
                }
                e eVar2 = this.f15139n;
                synchronized (eVar2) {
                    eVar2.f15158b = true;
                    a10 = eVar2.a();
                }
                if (a10) {
                    t();
                }
            } catch (Throwable th2) {
                if (tVar != null) {
                    tVar.a();
                }
                throw th2;
            }
        } else {
            u();
        }
    }

    public final h o() {
        int ordinal = this.f15150y.ordinal();
        if (ordinal == 1) {
            return new v(this.f15133a, this);
        }
        if (ordinal == 2) {
            i<R> iVar = this.f15133a;
            return new e(iVar.a(), iVar, this);
        } else if (ordinal == 3) {
            return new z(this.f15133a, this);
        } else {
            if (ordinal == 5) {
                return null;
            }
            StringBuilder q10 = android.support.v4.media.a.q("Unrecognized stage: ");
            q10.append(this.f15150y);
            throw new IllegalStateException(q10.toString());
        }
    }

    public final f p(f fVar) {
        f fVar2 = f.RESOURCE_CACHE;
        f fVar3 = f.DATA_CACHE;
        f fVar4 = f.FINISHED;
        int ordinal = fVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3 || ordinal == 5) {
                        return fVar4;
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + fVar);
                } else if (this.A) {
                    return fVar4;
                } else {
                    return f.SOURCE;
                }
            } else if (this.f15146u.a()) {
                return fVar3;
            } else {
                return p(fVar3);
            }
        } else if (this.f15146u.b()) {
            return fVar2;
        } else {
            return p(fVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r1 = (u4.m) r0.f15206f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r9 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r9.f15236a == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r1.f15183g.a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r9 = r1.f15177a;
        r9.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0.f15216w == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = r9.f16905c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r9 = r9.f16904b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r9 = (java.util.Map) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r0.equals(r9.get(r8)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r9.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r8 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r8.hasNext() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r9 = (u4.n.d) r8.next();
        r9.f15225b.execute(new u4.n.b(r9.f15224a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r0.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(u4.u<R> r8, s4.a r9, boolean r10) {
        /*
            r7 = this;
            r7.w()
            u4.j$a<R> r0 = r7.f15148w
            u4.n r0 = (u4.n) r0
            monitor-enter(r0)
            r0.f15217x = r8     // Catch:{ all -> 0x00c9 }
            r0.f15218y = r9     // Catch:{ all -> 0x00c9 }
            r0.F = r10     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            monitor-enter(r0)
            p5.d$a r8 = r0.f15202b     // Catch:{ all -> 0x00c6 }
            r8.a()     // Catch:{ all -> 0x00c6 }
            boolean r8 = r0.E     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x0024
            u4.u<?> r8 = r0.f15217x     // Catch:{ all -> 0x00c6 }
            r8.b()     // Catch:{ all -> 0x00c6 }
            r0.f()     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00b2
        L_0x0024:
            u4.n$e r8 = r0.f15201a     // Catch:{ all -> 0x00c6 }
            java.util.List<u4.n$d> r8 = r8.f15226a     // Catch:{ all -> 0x00c6 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00be
            boolean r8 = r0.f15219z     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00b6
            u4.n$c r8 = r0.f15205e     // Catch:{ all -> 0x00c6 }
            u4.u<?> r2 = r0.f15217x     // Catch:{ all -> 0x00c6 }
            boolean r3 = r0.f15213t     // Catch:{ all -> 0x00c6 }
            s4.e r5 = r0.f15212s     // Catch:{ all -> 0x00c6 }
            u4.q$a r6 = r0.f15203c     // Catch:{ all -> 0x00c6 }
            r8.getClass()     // Catch:{ all -> 0x00c6 }
            u4.q r8 = new u4.q     // Catch:{ all -> 0x00c6 }
            r4 = 1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            r0.C = r8     // Catch:{ all -> 0x00c6 }
            r8 = 1
            r0.f15219z = r8     // Catch:{ all -> 0x00c6 }
            u4.n$e r9 = r0.f15201a     // Catch:{ all -> 0x00c6 }
            r9.getClass()     // Catch:{ all -> 0x00c6 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            java.util.List<u4.n$d> r9 = r9.f15226a     // Catch:{ all -> 0x00c6 }
            r10.<init>(r9)     // Catch:{ all -> 0x00c6 }
            int r9 = r10.size()     // Catch:{ all -> 0x00c6 }
            int r9 = r9 + r8
            r0.d(r9)     // Catch:{ all -> 0x00c6 }
            s4.e r8 = r0.f15212s     // Catch:{ all -> 0x00c6 }
            u4.q<?> r9 = r0.C     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            u4.o r1 = r0.f15206f
            u4.m r1 = (u4.m) r1
            monitor-enter(r1)
            if (r9 == 0) goto L_0x0074
            boolean r2 = r9.f15236a     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0074
            u4.c r2 = r1.f15183g     // Catch:{ all -> 0x00b3 }
            r2.a(r8, r9)     // Catch:{ all -> 0x00b3 }
        L_0x0074:
            x2.g r9 = r1.f15177a     // Catch:{ all -> 0x00b3 }
            r9.getClass()     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.f15216w     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0080
            java.lang.Object r9 = r9.f16905c     // Catch:{ all -> 0x00b3 }
            goto L_0x0082
        L_0x0080:
            java.lang.Object r9 = r9.f16904b     // Catch:{ all -> 0x00b3 }
        L_0x0082:
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r9.get(r8)     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0091
            r9.remove(r8)     // Catch:{ all -> 0x00b3 }
        L_0x0091:
            monitor-exit(r1)
            java.util.Iterator r8 = r10.iterator()
        L_0x0096:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            u4.n$d r9 = (u4.n.d) r9
            java.util.concurrent.Executor r10 = r9.f15225b
            u4.n$b r1 = new u4.n$b
            k5.h r9 = r9.f15224a
            r1.<init>(r9)
            r10.execute(r1)
            goto L_0x0096
        L_0x00af:
            r0.c()
        L_0x00b2:
            return
        L_0x00b3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L_0x00b6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Already have resource"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00be:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Received a resource without any callbacks to notify"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r8
        L_0x00c9:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.j.q(u4.u, s4.a, boolean):void");
    }

    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.H;
        try {
            if (this.K) {
                s();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            v();
            if (dVar != null) {
                dVar.b();
            }
        } catch (d e10) {
            throw e10;
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            throw th2;
        }
    }

    public final void s() {
        boolean a10;
        Object obj;
        w();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f15134b));
        n nVar = (n) this.f15148w;
        synchronized (nVar) {
            nVar.A = glideException;
        }
        synchronized (nVar) {
            nVar.f15202b.a();
            if (nVar.E) {
                nVar.f();
            } else if (nVar.f15201a.f15226a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!nVar.B) {
                nVar.B = true;
                s4.e eVar = nVar.f15212s;
                n.e eVar2 = nVar.f15201a;
                eVar2.getClass();
                ArrayList<n.d> arrayList = new ArrayList<>(eVar2.f15226a);
                nVar.d(arrayList.size() + 1);
                m mVar = (m) nVar.f15206f;
                synchronized (mVar) {
                    x2.g gVar = mVar.f15177a;
                    gVar.getClass();
                    if (nVar.f15216w) {
                        obj = gVar.f16905c;
                    } else {
                        obj = gVar.f16904b;
                    }
                    Map map = (Map) obj;
                    if (nVar.equals(map.get(eVar))) {
                        map.remove(eVar);
                    }
                }
                for (n.d dVar : arrayList) {
                    dVar.f15225b.execute(new n.a(dVar.f15224a));
                }
                nVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar3 = this.f15139n;
        synchronized (eVar3) {
            eVar3.f15159c = true;
            a10 = eVar3.a();
        }
        if (a10) {
            t();
        }
    }

    public final void t() {
        e eVar = this.f15139n;
        synchronized (eVar) {
            eVar.f15158b = false;
            eVar.f15157a = false;
            eVar.f15159c = false;
        }
        c<?> cVar = this.f15138f;
        cVar.f15154a = null;
        cVar.f15155b = null;
        cVar.f15156c = null;
        i<R> iVar = this.f15133a;
        iVar.f15117c = null;
        iVar.f15118d = null;
        iVar.f15128n = null;
        iVar.f15121g = null;
        iVar.f15125k = null;
        iVar.f15123i = null;
        iVar.f15129o = null;
        iVar.f15124j = null;
        iVar.f15130p = null;
        iVar.f15115a.clear();
        iVar.f15126l = false;
        iVar.f15116b.clear();
        iVar.f15127m = false;
        this.J = false;
        this.f15140o = null;
        this.f15141p = null;
        this.f15147v = null;
        this.f15142q = null;
        this.f15143r = null;
        this.f15148w = null;
        this.f15150y = null;
        this.I = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.K = false;
        this.B = null;
        this.f15134b.clear();
        this.f15137e.a(this);
    }

    public final void u() {
        this.C = Thread.currentThread();
        int i10 = o5.h.f13744a;
        SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.K && this.I != null && !(z10 = this.I.a())) {
            this.f15150y = p(this.f15150y);
            this.I = o();
            if (this.f15150y == f.SOURCE) {
                b();
                return;
            }
        }
        if ((this.f15150y == f.FINISHED || this.K) && !z10) {
            s();
        }
    }

    public final void v() {
        int g2 = v.g(this.f15151z);
        if (g2 == 0) {
            this.f15150y = p(f.INITIALIZE);
            this.I = o();
            u();
        } else if (g2 == 1) {
            u();
        } else if (g2 == 2) {
            n();
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Unrecognized run reason: ");
            q10.append(n0.l.v(this.f15151z));
            throw new IllegalStateException(q10.toString());
        }
    }

    public final void w() {
        Throwable th2;
        this.f15135c.a();
        if (this.J) {
            if (this.f15134b.isEmpty()) {
                th2 = null;
            } else {
                ArrayList arrayList = this.f15134b;
                th2 = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.J = true;
    }
}
