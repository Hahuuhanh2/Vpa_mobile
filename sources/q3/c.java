package q3;

import a4.b;
import al.g0;
import al.i1;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import o3.j;
import p3.h0;
import p3.i0;
import p3.r;
import p3.t;
import p3.w;
import t3.b;
import t3.d;
import t3.e;
import v3.l;
import x3.s;
import y0.h;
import y3.o;

/* compiled from: GreedyScheduler */
public final class c implements t, d, p3.d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14297a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f14298b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public b f14299c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14300d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f14301e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final h f14302f = new h(1);

    /* renamed from: n  reason: collision with root package name */
    public final r f14303n;

    /* renamed from: o  reason: collision with root package name */
    public final h0 f14304o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.work.a f14305p;

    /* renamed from: q  reason: collision with root package name */
    public final HashMap f14306q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    public Boolean f14307r;

    /* renamed from: s  reason: collision with root package name */
    public final e f14308s;

    /* renamed from: t  reason: collision with root package name */
    public final b f14309t;

    /* renamed from: u  reason: collision with root package name */
    public final d f14310u;

    /* compiled from: GreedyScheduler */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f14311a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14312b;

        public a(int i10, long j10) {
            this.f14311a = i10;
            this.f14312b = j10;
        }
    }

    static {
        j.b("GreedyScheduler");
    }

    public c(Context context, androidx.work.a aVar, l lVar, r rVar, i0 i0Var, b bVar) {
        this.f14297a = context;
        p3.c cVar = aVar.f3746f;
        this.f14299c = new b(this, cVar, aVar.f3743c);
        this.f14310u = new d(cVar, i0Var);
        this.f14309t = bVar;
        this.f14308s = new e(lVar);
        this.f14305p = aVar;
        this.f14303n = rVar;
        this.f14304o = i0Var;
    }

    public final boolean a() {
        return false;
    }

    public final void b(String str) {
        Runnable runnable;
        if (this.f14307r == null) {
            this.f14307r = Boolean.valueOf(o.a(this.f14297a, this.f14305p));
        }
        if (!this.f14307r.booleanValue()) {
            j.a().getClass();
            return;
        }
        if (!this.f14300d) {
            this.f14303n.a(this);
            this.f14300d = true;
        }
        j.a().getClass();
        b bVar = this.f14299c;
        if (!(bVar == null || (runnable = (Runnable) bVar.f14296d.remove(str)) == null)) {
            bVar.f14294b.b(runnable);
        }
        for (w wVar : this.f14302f.h(str)) {
            this.f14310u.a(wVar);
            this.f14304o.d(wVar);
        }
    }

    public final void c(x3.l lVar, boolean z10) {
        i1 i1Var;
        w i10 = this.f14302f.i(lVar);
        if (i10 != null) {
            this.f14310u.a(i10);
        }
        synchronized (this.f14301e) {
            i1Var = (i1) this.f14298b.remove(lVar);
        }
        if (i1Var != null) {
            j a10 = j.a();
            Objects.toString(lVar);
            a10.getClass();
            i1Var.cancel((CancellationException) null);
        }
        if (!z10) {
            synchronized (this.f14301e) {
                this.f14306q.remove(lVar);
            }
        }
    }

    public final void d(s... sVarArr) {
        long max;
        if (this.f14307r == null) {
            this.f14307r = Boolean.valueOf(o.a(this.f14297a, this.f14305p));
        }
        if (!this.f14307r.booleanValue()) {
            j.a().getClass();
            return;
        }
        if (!this.f14300d) {
            this.f14303n.a(this);
            this.f14300d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (s sVar : sVarArr) {
            if (!this.f14302f.c(g0.Q(sVar))) {
                synchronized (this.f14301e) {
                    x3.l Q = g0.Q(sVar);
                    a aVar = (a) this.f14306q.get(Q);
                    if (aVar == null) {
                        int i10 = sVar.f17029k;
                        this.f14305p.f3743c.getClass();
                        aVar = new a(i10, System.currentTimeMillis());
                        this.f14306q.put(Q, aVar);
                    }
                    max = (((long) Math.max((sVar.f17029k - aVar.f14311a) - 5, 0)) * 30000) + aVar.f14312b;
                }
                long max2 = Math.max(sVar.a(), max);
                this.f14305p.f3743c.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (sVar.f17020b == o3.o.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        b bVar = this.f14299c;
                        if (bVar != null) {
                            Runnable runnable = (Runnable) bVar.f14296d.remove(sVar.f17019a);
                            if (runnable != null) {
                                bVar.f14294b.b(runnable);
                            }
                            a aVar2 = new a(bVar, sVar);
                            bVar.f14296d.put(sVar.f17019a, aVar2);
                            bVar.f14294b.a(aVar2, max2 - bVar.f14295c.a());
                        }
                    } else if (sVar.b()) {
                        int i11 = Build.VERSION.SDK_INT;
                        o3.c cVar = sVar.f17028j;
                        if (cVar.f13668c) {
                            j a10 = j.a();
                            sVar.toString();
                            a10.getClass();
                        } else if (i11 < 24 || !cVar.a()) {
                            hashSet.add(sVar);
                            hashSet2.add(sVar.f17019a);
                        } else {
                            j a11 = j.a();
                            sVar.toString();
                            a11.getClass();
                        }
                    } else if (!this.f14302f.c(g0.Q(sVar))) {
                        j.a().getClass();
                        h hVar = this.f14302f;
                        hVar.getClass();
                        w m10 = hVar.m(g0.Q(sVar));
                        this.f14310u.b(m10);
                        this.f14304o.c(m10);
                    }
                }
            }
        }
        synchronized (this.f14301e) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                j.a().getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    s sVar2 = (s) it.next();
                    x3.l Q2 = g0.Q(sVar2);
                    if (!this.f14298b.containsKey(Q2)) {
                        this.f14298b.put(Q2, t3.h.a(this.f14308s, sVar2, this.f14309t.a(), this));
                    }
                }
            }
        }
    }

    public final void e(s sVar, t3.b bVar) {
        x3.l Q = g0.Q(sVar);
        if (!(bVar instanceof b.a)) {
            j a10 = j.a();
            Q.toString();
            a10.getClass();
            w i10 = this.f14302f.i(Q);
            if (i10 != null) {
                this.f14310u.a(i10);
                this.f14304o.b(i10, ((b.C0193b) bVar).f14804a);
            }
        } else if (!this.f14302f.c(Q)) {
            j a11 = j.a();
            Q.toString();
            a11.getClass();
            w m10 = this.f14302f.m(Q);
            this.f14310u.b(m10);
            this.f14304o.c(m10);
        }
    }
}
