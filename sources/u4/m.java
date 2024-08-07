package u4;

import al.g0;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k5.i;
import o5.i;
import p5.a;
import u4.c;
import u4.j;
import u4.q;
import w4.a;
import w4.e;
import w4.h;
import x2.g;

/* compiled from: Engine */
public final class m implements o, h.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f15176h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final g f15177a;

    /* renamed from: b  reason: collision with root package name */
    public final a.a f15178b;

    /* renamed from: c  reason: collision with root package name */
    public final h f15179c;

    /* renamed from: d  reason: collision with root package name */
    public final b f15180d;

    /* renamed from: e  reason: collision with root package name */
    public final x f15181e;

    /* renamed from: f  reason: collision with root package name */
    public final a f15182f;

    /* renamed from: g  reason: collision with root package name */
    public final c f15183g;

    /* compiled from: Engine */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.d f15184a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f15185b = p5.a.a(150, new C0204a());

        /* renamed from: c  reason: collision with root package name */
        public int f15186c;

        /* renamed from: u4.m$a$a  reason: collision with other inner class name */
        /* compiled from: Engine */
        public class C0204a implements a.b<j<?>> {
            public C0204a() {
            }

            public final Object a() {
                a aVar = a.this;
                return new j(aVar.f15184a, aVar.f15185b);
            }
        }

        public a(c cVar) {
            this.f15184a = cVar;
        }
    }

    /* compiled from: Engine */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final x4.a f15188a;

        /* renamed from: b  reason: collision with root package name */
        public final x4.a f15189b;

        /* renamed from: c  reason: collision with root package name */
        public final x4.a f15190c;

        /* renamed from: d  reason: collision with root package name */
        public final x4.a f15191d;

        /* renamed from: e  reason: collision with root package name */
        public final o f15192e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f15193f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f15194g = p5.a.a(150, new a());

        /* compiled from: Engine */
        public class a implements a.b<n<?>> {
            public a() {
            }

            public final Object a() {
                b bVar = b.this;
                return new n(bVar.f15188a, bVar.f15189b, bVar.f15190c, bVar.f15191d, bVar.f15192e, bVar.f15193f, bVar.f15194g);
            }
        }

        public b(x4.a aVar, x4.a aVar2, x4.a aVar3, x4.a aVar4, o oVar, q.a aVar5) {
            this.f15188a = aVar;
            this.f15189b = aVar2;
            this.f15190c = aVar3;
            this.f15191d = aVar4;
            this.f15192e = oVar;
            this.f15193f = aVar5;
        }
    }

    /* compiled from: Engine */
    public static class c implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0214a f15196a;

        /* renamed from: b  reason: collision with root package name */
        public volatile w4.a f15197b;

        public c(a.C0214a aVar) {
            this.f15196a = aVar;
        }

        public final w4.a a() {
            if (this.f15197b == null) {
                synchronized (this) {
                    if (this.f15197b == null) {
                        w4.c cVar = (w4.c) this.f15196a;
                        e eVar = (e) cVar.f16465b;
                        File cacheDir = eVar.f16471a.getCacheDir();
                        w4.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (eVar.f16472b != null) {
                            cacheDir = new File(cacheDir, eVar.f16472b);
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                dVar = new w4.d(cacheDir, cVar.f16464a);
                            }
                        }
                        this.f15197b = dVar;
                    }
                    if (this.f15197b == null) {
                        this.f15197b = new g0();
                    }
                }
            }
            return this.f15197b;
        }
    }

    /* compiled from: Engine */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<?> f15198a;

        /* renamed from: b  reason: collision with root package name */
        public final k5.h f15199b;

        public d(k5.h hVar, n<?> nVar) {
            this.f15199b = hVar;
            this.f15198a = nVar;
        }
    }

    public m(h hVar, a.C0214a aVar, x4.a aVar2, x4.a aVar3, x4.a aVar4, x4.a aVar5) {
        this.f15179c = hVar;
        c cVar = new c(aVar);
        c cVar2 = new c();
        this.f15183g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f15097d = this;
            }
        }
        this.f15178b = new a.a();
        this.f15177a = new g(1);
        this.f15180d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f15182f = new a(cVar);
        this.f15181e = new x();
        ((w4.g) hVar).f16473d = this;
    }

    public static void d(u uVar) {
        if (uVar instanceof q) {
            ((q) uVar).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final void a(s4.e eVar, q<?> qVar) {
        c cVar = this.f15183g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f15095b.remove(eVar);
            if (aVar != null) {
                aVar.f15100c = null;
                aVar.clear();
            }
        }
        if (qVar.f15236a) {
            u uVar = (u) ((w4.g) this.f15179c).d(eVar, qVar);
        } else {
            this.f15181e.a(qVar, false);
        }
    }

    public final d b(com.bumptech.glide.h hVar, Object obj, s4.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.j jVar, l lVar, o5.b bVar, boolean z10, boolean z11, s4.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, k5.h hVar3, Executor executor) {
        long j10;
        if (f15176h) {
            int i12 = o5.h.f13744a;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f15178b.getClass();
        p pVar = new p(obj, eVar, i10, i11, bVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                q<?> c10 = c(pVar, z12, j11);
                if (c10 == null) {
                    d e10 = e(hVar, obj, eVar, i10, i11, cls, cls2, jVar, lVar, bVar, z10, z11, hVar2, z12, z13, z14, z15, hVar3, executor, pVar, j11);
                    return e10;
                }
                ((i) hVar3).n(c10, s4.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final q<?> c(p pVar, boolean z10, long j10) {
        q<?> qVar;
        Y y10;
        q<?> qVar2;
        if (!z10) {
            return null;
        }
        c cVar = this.f15183g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f15095b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = (q) aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (f15176h) {
                int i10 = o5.h.f13744a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return qVar;
        }
        w4.g gVar = (w4.g) this.f15179c;
        synchronized (gVar) {
            i.a aVar2 = (i.a) gVar.f13745a.remove(pVar);
            if (aVar2 == null) {
                y10 = null;
            } else {
                gVar.f13747c -= (long) aVar2.f13749b;
                y10 = aVar2.f13748a;
            }
        }
        u uVar = (u) y10;
        if (uVar == null) {
            qVar2 = null;
        } else if (uVar instanceof q) {
            qVar2 = (q) uVar;
        } else {
            qVar2 = new q<>(uVar, true, true, pVar, this);
        }
        if (qVar2 != null) {
            qVar2.a();
            this.f15183g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f15176h) {
            int i11 = o5.h.f13744a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return qVar2;
    }

    public final d e(com.bumptech.glide.h hVar, Object obj, s4.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.j jVar, l lVar, o5.b bVar, boolean z10, boolean z11, s4.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, k5.h hVar3, Executor executor, p pVar, long j10) {
        x4.a aVar;
        com.bumptech.glide.h hVar4 = hVar;
        Object obj2 = obj;
        s4.e eVar2 = eVar;
        int i12 = i10;
        int i13 = i11;
        com.bumptech.glide.j jVar2 = jVar;
        l lVar2 = lVar;
        s4.h hVar5 = hVar2;
        boolean z16 = z15;
        k5.h hVar6 = hVar3;
        Executor executor2 = executor;
        p pVar2 = pVar;
        g gVar = this.f15177a;
        n nVar = (n) ((Map) (z16 ? gVar.f16905c : gVar.f16904b)).get(pVar2);
        if (nVar != null) {
            nVar.a(hVar6, executor2);
            if (f15176h) {
                int i14 = o5.h.f13744a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return new d(hVar6, nVar);
        }
        n nVar2 = (n) this.f15180d.f15194g.b();
        j7.a.r(nVar2);
        synchronized (nVar2) {
            nVar2.f15212s = pVar2;
            nVar2.f15213t = z12;
            nVar2.f15214u = z13;
            nVar2.f15215v = z14;
            nVar2.f15216w = z16;
        }
        a aVar2 = this.f15182f;
        j<R> jVar3 = (j) aVar2.f15185b.b();
        j7.a.r(jVar3);
        int i15 = aVar2.f15186c;
        aVar2.f15186c = i15 + 1;
        i<R> iVar = jVar3.f15133a;
        j.d dVar = jVar3.f15136d;
        iVar.f15117c = hVar4;
        iVar.f15118d = obj2;
        iVar.f15128n = eVar2;
        iVar.f15119e = i12;
        iVar.f15120f = i13;
        iVar.f15130p = lVar2;
        iVar.f15121g = cls;
        iVar.f15122h = dVar;
        iVar.f15125k = cls2;
        iVar.f15129o = jVar2;
        iVar.f15123i = hVar5;
        iVar.f15124j = bVar;
        iVar.f15131q = z10;
        iVar.f15132r = z11;
        jVar3.f15140o = hVar4;
        jVar3.f15141p = eVar2;
        jVar3.f15142q = jVar2;
        jVar3.f15143r = pVar2;
        jVar3.f15144s = i12;
        jVar3.f15145t = i13;
        jVar3.f15146u = lVar2;
        jVar3.A = z16;
        jVar3.f15147v = hVar5;
        jVar3.f15148w = nVar2;
        jVar3.f15149x = i15;
        boolean z17 = true;
        jVar3.f15151z = 1;
        jVar3.B = obj2;
        g gVar2 = this.f15177a;
        gVar2.getClass();
        ((Map) (nVar2.f15216w ? gVar2.f16905c : gVar2.f16904b)).put(pVar2, nVar2);
        k5.h hVar7 = hVar3;
        nVar2.a(hVar7, executor);
        synchronized (nVar2) {
            nVar2.D = jVar3;
            j.f p10 = jVar3.p(j.f.INITIALIZE);
            if (p10 != j.f.RESOURCE_CACHE) {
                if (p10 != j.f.DATA_CACHE) {
                    z17 = false;
                }
            }
            if (z17) {
                aVar = nVar2.f15207n;
            } else if (nVar2.f15214u) {
                aVar = nVar2.f15209p;
            } else {
                aVar = nVar2.f15215v ? nVar2.f15210q : nVar2.f15208o;
            }
            aVar.execute(jVar3);
        }
        if (f15176h) {
            int i16 = o5.h.f13744a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return new d(hVar7, nVar2);
    }
}
