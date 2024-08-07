package u4;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k5.h;
import k5.i;
import p5.a;
import p5.d;
import u4.j;
import u4.q;
import x2.g;

/* compiled from: EngineJob */
public final class n<R> implements j.a<R>, a.d {
    public static final c G = new c();
    public GlideException A;
    public boolean B;
    public q<?> C;
    public j<R> D;
    public volatile boolean E;
    public boolean F;

    /* renamed from: a  reason: collision with root package name */
    public final e f15201a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f15202b;

    /* renamed from: c  reason: collision with root package name */
    public final q.a f15203c;

    /* renamed from: d  reason: collision with root package name */
    public final v1.d<n<?>> f15204d;

    /* renamed from: e  reason: collision with root package name */
    public final c f15205e;

    /* renamed from: f  reason: collision with root package name */
    public final o f15206f;

    /* renamed from: n  reason: collision with root package name */
    public final x4.a f15207n;

    /* renamed from: o  reason: collision with root package name */
    public final x4.a f15208o;

    /* renamed from: p  reason: collision with root package name */
    public final x4.a f15209p;

    /* renamed from: q  reason: collision with root package name */
    public final x4.a f15210q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicInteger f15211r;

    /* renamed from: s  reason: collision with root package name */
    public s4.e f15212s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15213t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15214u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15215v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15216w;

    /* renamed from: x  reason: collision with root package name */
    public u<?> f15217x;

    /* renamed from: y  reason: collision with root package name */
    public s4.a f15218y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f15219z;

    /* compiled from: EngineJob */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final h f15220a;

        public a(h hVar) {
            this.f15220a = hVar;
        }

        public final void run() {
            i iVar = (i) this.f15220a;
            iVar.f12000a.a();
            synchronized (iVar.f12001b) {
                synchronized (n.this) {
                    if (n.this.f15201a.f15226a.contains(new d(this.f15220a, o5.e.f13741b))) {
                        n nVar = n.this;
                        h hVar = this.f15220a;
                        nVar.getClass();
                        try {
                            ((i) hVar).l(nVar.A, 5);
                        } catch (Throwable th2) {
                            throw new d(th2);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final h f15222a;

        public b(h hVar) {
            this.f15222a = hVar;
        }

        public final void run() {
            i iVar = (i) this.f15222a;
            iVar.f12000a.a();
            synchronized (iVar.f12001b) {
                synchronized (n.this) {
                    if (n.this.f15201a.f15226a.contains(new d(this.f15222a, o5.e.f13741b))) {
                        n.this.C.a();
                        n nVar = n.this;
                        h hVar = this.f15222a;
                        nVar.getClass();
                        try {
                            ((i) hVar).n(nVar.C, nVar.f15218y, nVar.F);
                            n.this.g(this.f15222a);
                        } catch (Throwable th2) {
                            throw new d(th2);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    public static class c {
    }

    /* compiled from: EngineJob */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final h f15224a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f15225b;

        public d(h hVar, Executor executor) {
            this.f15224a = hVar;
            this.f15225b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f15224a.equals(((d) obj).f15224a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15224a.hashCode();
        }
    }

    /* compiled from: EngineJob */
    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f15226a;

        public e(ArrayList arrayList) {
            this.f15226a = arrayList;
        }

        public final Iterator<d> iterator() {
            return this.f15226a.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(x4.a aVar, x4.a aVar2, x4.a aVar3, x4.a aVar4, o oVar, q.a aVar5, a.c cVar) {
        c cVar2 = G;
        this.f15201a = new e(new ArrayList(2));
        this.f15202b = new d.a();
        this.f15211r = new AtomicInteger();
        this.f15207n = aVar;
        this.f15208o = aVar2;
        this.f15209p = aVar3;
        this.f15210q = aVar4;
        this.f15206f = oVar;
        this.f15203c = aVar5;
        this.f15204d = cVar;
        this.f15205e = cVar2;
    }

    public final synchronized void a(h hVar, Executor executor) {
        this.f15202b.a();
        this.f15201a.f15226a.add(new d(hVar, executor));
        boolean z10 = true;
        if (this.f15219z) {
            d(1);
            executor.execute(new b(hVar));
        } else if (this.B) {
            d(1);
            executor.execute(new a(hVar));
        } else {
            if (this.E) {
                z10 = false;
            }
            j7.a.m("Cannot add callbacks to a cancelled EngineJob", z10);
        }
    }

    public final void b() {
        Object obj;
        if (!e()) {
            this.E = true;
            j<R> jVar = this.D;
            jVar.K = true;
            h hVar = jVar.I;
            if (hVar != null) {
                hVar.cancel();
            }
            o oVar = this.f15206f;
            s4.e eVar = this.f15212s;
            m mVar = (m) oVar;
            synchronized (mVar) {
                g gVar = mVar.f15177a;
                gVar.getClass();
                if (this.f15216w) {
                    obj = gVar.f16905c;
                } else {
                    obj = gVar.f16904b;
                }
                Map map = (Map) obj;
                if (equals(map.get(eVar))) {
                    map.remove(eVar);
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        q<?> qVar;
        synchronized (this) {
            this.f15202b.a();
            j7.a.m("Not yet complete!", e());
            int decrementAndGet = this.f15211r.decrementAndGet();
            if (decrementAndGet >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j7.a.m("Can't decrement below 0", z10);
            if (decrementAndGet == 0) {
                qVar = this.C;
                f();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.d();
        }
    }

    public final synchronized void d(int i10) {
        q<?> qVar;
        j7.a.m("Not yet complete!", e());
        if (this.f15211r.getAndAdd(i10) == 0 && (qVar = this.C) != null) {
            qVar.a();
        }
    }

    public final boolean e() {
        if (this.B || this.f15219z || this.E) {
            return true;
        }
        return false;
    }

    public final synchronized void f() {
        boolean a10;
        if (this.f15212s != null) {
            this.f15201a.f15226a.clear();
            this.f15212s = null;
            this.C = null;
            this.f15217x = null;
            this.B = false;
            this.E = false;
            this.f15219z = false;
            this.F = false;
            j<R> jVar = this.D;
            j.e eVar = jVar.f15139n;
            synchronized (eVar) {
                eVar.f15157a = true;
                a10 = eVar.a();
            }
            if (a10) {
                jVar.t();
            }
            this.D = null;
            this.A = null;
            this.f15218y = null;
            this.f15204d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void g(h hVar) {
        boolean z10;
        this.f15202b.a();
        this.f15201a.f15226a.remove(new d(hVar, o5.e.f13741b));
        if (this.f15201a.f15226a.isEmpty()) {
            b();
            if (!this.f15219z) {
                if (!this.B) {
                    z10 = false;
                    if (z10 && this.f15211r.get() == 0) {
                        f();
                    }
                }
            }
            z10 = true;
            f();
        }
    }

    public final d.a j() {
        return this.f15202b;
    }
}
