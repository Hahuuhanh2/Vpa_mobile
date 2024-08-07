package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.i;
import f0.b0;
import java.util.Map;
import o.b;
import r2.l;
import r2.q;

/* compiled from: LiveData */
public abstract class p<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2794k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2795a;

    /* renamed from: b  reason: collision with root package name */
    public o.b<q<? super T>, p<T>.d> f2796b;

    /* renamed from: c  reason: collision with root package name */
    public int f2797c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2798d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2799e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2800f;

    /* renamed from: g  reason: collision with root package name */
    public int f2801g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2802h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2803i;

    /* renamed from: j  reason: collision with root package name */
    public final a f2804j;

    /* compiled from: LiveData */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Object obj;
            synchronized (p.this.f2795a) {
                obj = p.this.f2800f;
                p.this.f2800f = p.f2794k;
            }
            p.this.j(obj);
        }
    }

    /* compiled from: LiveData */
    public class b extends p<T>.d {
        public b(p pVar, q<? super T> qVar) {
            super(qVar);
        }

        public final boolean d() {
            return true;
        }
    }

    /* compiled from: LiveData */
    public class c extends p<T>.d implements n {

        /* renamed from: e  reason: collision with root package name */
        public final l f2806e;

        public c(l lVar, q<? super T> qVar) {
            super(qVar);
            this.f2806e = lVar;
        }

        public final void b() {
            this.f2806e.B().c(this);
        }

        public final boolean c(l lVar) {
            if (this.f2806e == lVar) {
                return true;
            }
            return false;
        }

        public final boolean d() {
            if (this.f2806e.B().f2785d.compareTo(i.b.STARTED) >= 0) {
                return true;
            }
            return false;
        }

        public final void q(l lVar, i.a aVar) {
            i.b bVar = this.f2806e.B().f2785d;
            if (bVar == i.b.DESTROYED) {
                p.this.i(this.f2808a);
                return;
            }
            i.b bVar2 = null;
            while (bVar2 != bVar) {
                a(d());
                bVar2 = bVar;
                bVar = this.f2806e.B().f2785d;
            }
        }
    }

    /* compiled from: LiveData */
    public abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public final q<? super T> f2808a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2809b;

        /* renamed from: c  reason: collision with root package name */
        public int f2810c = -1;

        public d(q<? super T> qVar) {
            this.f2808a = qVar;
        }

        public final void a(boolean z10) {
            int i10;
            boolean z11;
            boolean z12;
            if (z10 != this.f2809b) {
                this.f2809b = z10;
                p pVar = p.this;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                int i11 = pVar.f2797c;
                pVar.f2797c = i10 + i11;
                if (!pVar.f2798d) {
                    pVar.f2798d = true;
                    while (true) {
                        try {
                            int i12 = pVar.f2797c;
                            if (i11 == i12) {
                                break;
                            }
                            if (i11 != 0 || i12 <= 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (i11 <= 0 || i12 != 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z11) {
                                pVar.g();
                            } else if (z12) {
                                pVar.h();
                            }
                            i11 = i12;
                        } finally {
                            pVar.f2798d = false;
                        }
                    }
                }
                if (this.f2809b) {
                    p.this.c(this);
                }
            }
        }

        public void b() {
        }

        public boolean c(l lVar) {
            return false;
        }

        public abstract boolean d();
    }

    public p(T t10) {
        this.f2795a = new Object();
        this.f2796b = new o.b<>();
        this.f2797c = 0;
        this.f2800f = f2794k;
        this.f2804j = new a();
        this.f2799e = t10;
        this.f2801g = 0;
    }

    public static void a(String str) {
        boolean z10;
        n.c.J().f13298b.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalStateException(b0.s("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(p<T>.d dVar) {
        if (dVar.f2809b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f2810c;
            int i11 = this.f2801g;
            if (i10 < i11) {
                dVar.f2810c = i11;
                dVar.f2808a.b(this.f2799e);
            }
        }
    }

    public final void c(p<T>.d dVar) {
        if (this.f2802h) {
            this.f2803i = true;
            return;
        }
        this.f2802h = true;
        do {
            this.f2803i = false;
            if (dVar == null) {
                o.b<q<? super T>, p<T>.d> bVar = this.f2796b;
                bVar.getClass();
                b.d dVar2 = new b.d();
                bVar.f13602c.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.f2803i) {
                        break;
                    }
                }
            } else {
                b(dVar);
                dVar = null;
            }
        } while (this.f2803i);
        this.f2802h = false;
    }

    public T d() {
        T t10 = this.f2799e;
        if (t10 != f2794k) {
            return t10;
        }
        return null;
    }

    public final void e(l lVar, q<? super T> qVar) {
        a("observe");
        if (lVar.B().f2785d != i.b.DESTROYED) {
            c cVar = new c(lVar, qVar);
            d i10 = this.f2796b.i(qVar, cVar);
            if (i10 != null && !i10.c(lVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (i10 == null) {
                lVar.B().a(cVar);
            }
        }
    }

    public final void f(q<? super T> qVar) {
        a("observeForever");
        b bVar = new b(this, qVar);
        d i10 = this.f2796b.i(qVar, bVar);
        if (i10 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (i10 == null) {
            bVar.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(q<? super T> qVar) {
        a("removeObserver");
        d l10 = this.f2796b.l(qVar);
        if (l10 != null) {
            l10.b();
            l10.a(false);
        }
    }

    public void j(T t10) {
        a("setValue");
        this.f2801g++;
        this.f2799e = t10;
        c((p<T>.d) null);
    }

    public p() {
        this.f2795a = new Object();
        this.f2796b = new o.b<>();
        this.f2797c = 0;
        Object obj = f2794k;
        this.f2800f = obj;
        this.f2804j = new a();
        this.f2799e = obj;
        this.f2801g = -1;
    }
}
