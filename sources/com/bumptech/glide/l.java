package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.Log;
import f5.c;
import h5.b;
import h5.d;
import h5.e;
import h5.h;
import h5.i;
import h5.j;
import h5.m;
import h5.q;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k5.f;
import k5.g;

/* compiled from: RequestManager */
public final class l implements ComponentCallbacks2, i {

    /* renamed from: r  reason: collision with root package name */
    public static final g f4947r;

    /* renamed from: a  reason: collision with root package name */
    public final b f4948a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4949b;

    /* renamed from: c  reason: collision with root package name */
    public final h f4950c;

    /* renamed from: d  reason: collision with root package name */
    public final m f4951d;

    /* renamed from: e  reason: collision with root package name */
    public final h5.l f4952e;

    /* renamed from: f  reason: collision with root package name */
    public final q f4953f = new q();

    /* renamed from: n  reason: collision with root package name */
    public final a f4954n;

    /* renamed from: o  reason: collision with root package name */
    public final h5.b f4955o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList<f<Object>> f4956p;

    /* renamed from: q  reason: collision with root package name */
    public g f4957q;

    /* compiled from: RequestManager */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l lVar = l.this;
            lVar.f4950c.d(lVar);
        }
    }

    /* compiled from: RequestManager */
    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final m f4959a;

        public b(m mVar) {
            this.f4959a = mVar;
        }

        public final void a(boolean z10) {
            if (z10) {
                synchronized (l.this) {
                    this.f4959a.b();
                }
            }
        }
    }

    static {
        g gVar = (g) new g().c(Bitmap.class);
        gVar.A = true;
        f4947r = gVar;
        ((g) new g().c(c.class)).A = true;
        g gVar2 = (g) ((g) ((g) new g().e(u4.l.f15174c)).m()).r();
    }

    public l(b bVar, h hVar, h5.l lVar, Context context) {
        boolean z10;
        h5.b bVar2;
        g gVar;
        m mVar = new m();
        h5.c cVar = bVar.f4922n;
        a aVar = new a();
        this.f4954n = aVar;
        this.f4948a = bVar;
        this.f4950c = hVar;
        this.f4952e = lVar;
        this.f4951d = mVar;
        this.f4949b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar3 = new b(mVar);
        ((e) cVar).getClass();
        if (k1.a.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Log.isLoggable("ConnectivityMonitor", 3);
        if (z10) {
            bVar2 = new d(applicationContext, bVar3);
        } else {
            bVar2 = new j();
        }
        this.f4955o = bVar2;
        if (o5.l.h()) {
            o5.l.f().post(aVar);
        } else {
            hVar.d(this);
        }
        hVar.d(bVar2);
        this.f4956p = new CopyOnWriteArrayList<>(bVar.f4918c.f4929e);
        h hVar2 = bVar.f4918c;
        synchronized (hVar2) {
            if (hVar2.f4934j == null) {
                ((c) hVar2.f4928d).getClass();
                g gVar2 = new g();
                gVar2.A = true;
                hVar2.f4934j = gVar2;
            }
            gVar = hVar2.f4934j;
        }
        synchronized (this) {
            g gVar3 = (g) gVar.clone();
            if (gVar3.A) {
                if (!gVar3.C) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            gVar3.C = true;
            gVar3.A = true;
            this.f4957q = gVar3;
        }
        synchronized (bVar.f4923o) {
            if (!bVar.f4923o.contains(this)) {
                bVar.f4923o.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final synchronized void a() {
        this.f4953f.a();
        Iterator it = o5.l.e(this.f4953f.f10605a).iterator();
        while (it.hasNext()) {
            l((l5.g) it.next());
        }
        this.f4953f.f10605a.clear();
        m mVar = this.f4951d;
        Iterator it2 = o5.l.e(mVar.f10576a).iterator();
        while (it2.hasNext()) {
            mVar.a((k5.d) it2.next());
        }
        mVar.f10577b.clear();
        this.f4950c.a(this);
        this.f4950c.a(this.f4955o);
        o5.l.f().removeCallbacks(this.f4954n);
        this.f4948a.d(this);
    }

    public final synchronized void b() {
        n();
        this.f4953f.b();
    }

    public final synchronized void f() {
        m();
        this.f4953f.f();
    }

    public final void l(l5.g<?> gVar) {
        boolean z10;
        if (gVar != null) {
            boolean o10 = o(gVar);
            k5.d i10 = gVar.i();
            if (!o10) {
                b bVar = this.f4948a;
                synchronized (bVar.f4923o) {
                    Iterator it = bVar.f4923o.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((l) it.next()).o(gVar)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (!z10 && i10 != null) {
                    gVar.d((k5.d) null);
                    i10.clear();
                }
            }
        }
    }

    public final synchronized void m() {
        m mVar = this.f4951d;
        mVar.f10578c = true;
        Iterator it = o5.l.e(mVar.f10576a).iterator();
        while (it.hasNext()) {
            k5.d dVar = (k5.d) it.next();
            if (dVar.isRunning()) {
                dVar.c();
                mVar.f10577b.add(dVar);
            }
        }
    }

    public final synchronized void n() {
        m mVar = this.f4951d;
        mVar.f10578c = false;
        Iterator it = o5.l.e(mVar.f10576a).iterator();
        while (it.hasNext()) {
            k5.d dVar = (k5.d) it.next();
            if (!dVar.j() && !dVar.isRunning()) {
                dVar.i();
            }
        }
        mVar.f10577b.clear();
    }

    public final synchronized boolean o(l5.g<?> gVar) {
        k5.d i10 = gVar.i();
        if (i10 == null) {
            return true;
        }
        if (!this.f4951d.a(i10)) {
            return false;
        }
        this.f4953f.f10605a.remove(gVar);
        gVar.d((k5.d) null);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f4951d + ", treeNode=" + this.f4952e + "}";
    }
}
