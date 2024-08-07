package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.q;
import j2.a0;
import j2.c;
import j2.u;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema */
public final class c0<T> implements u<T> {

    /* renamed from: a  reason: collision with root package name */
    public final z f2232a;

    /* renamed from: b  reason: collision with root package name */
    public final j0<?, ?> f2233b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2234c;

    /* renamed from: d  reason: collision with root package name */
    public final j<?> f2235d;

    public c0(j0<?, ?> j0Var, j<?> jVar, z zVar) {
        this.f2233b = j0Var;
        this.f2234c = jVar.e(zVar);
        this.f2235d = jVar;
        this.f2232a = zVar;
    }

    public final void a(T t10, T t11) {
        j0<?, ?> j0Var = this.f2233b;
        Class<?> cls = g0.f2265a;
        j0Var.o(t10, j0Var.k(j0Var.g(t10), j0Var.g(t11)));
        if (this.f2234c) {
            g0.B(this.f2235d, t10, t11);
        }
    }

    public final T b() {
        return this.f2232a.e().l();
    }

    public final void c(T t10) {
        this.f2233b.j(t10);
        this.f2235d.f(t10);
    }

    public final boolean d(T t10) {
        return this.f2235d.c(t10).i();
    }

    public final boolean e(T t10, T t11) {
        if (!this.f2233b.g(t10).equals(this.f2233b.g(t11))) {
            return false;
        }
        if (this.f2234c) {
            return this.f2235d.c(t10).equals(this.f2235d.c(t11));
        }
        return true;
    }

    public final int f(T t10) {
        j0<?, ?> j0Var = this.f2233b;
        int i10 = j0Var.i(j0Var.g(t10)) + 0;
        if (!this.f2234c) {
            return i10;
        }
        l<?> c10 = this.f2235d.c(t10);
        int i11 = 0;
        for (int i12 = 0; i12 < c10.f2300a.e(); i12++) {
            i11 += l.f(c10.f2300a.d(i12));
        }
        for (Map.Entry<T, Object> f10 : c10.f2300a.f()) {
            i11 += l.f(f10);
        }
        return i10 + i11;
    }

    public final int g(T t10) {
        int hashCode = this.f2233b.g(t10).hashCode();
        if (this.f2234c) {
            return (hashCode * 53) + this.f2235d.c(t10).hashCode();
        }
        return hashCode;
    }

    public final void h(T t10, f0 f0Var, i iVar) {
        j0<?, ?> j0Var = this.f2233b;
        j<?> jVar = this.f2235d;
        k0 f10 = j0Var.f(t10);
        l<?> d10 = jVar.d(t10);
        while (true) {
            try {
                if (f0Var.A() != Integer.MAX_VALUE) {
                    if (!j(f0Var, iVar, jVar, d10, j0Var, f10)) {
                        break;
                    }
                } else {
                    break;
                }
            } finally {
                j0Var.n(t10, f10);
            }
        }
    }

    public final void i(Object obj, g gVar) {
        Iterator<Map.Entry<?, Object>> k10 = this.f2235d.c(obj).k();
        while (k10.hasNext()) {
            Map.Entry next = k10.next();
            l.a aVar = (l.a) next.getKey();
            if (aVar.f() == a0.MESSAGE) {
                aVar.d();
                aVar.g();
                if (next instanceof q.a) {
                    aVar.a();
                    gVar.l(0, ((q.a) next).f2320a.getValue().b());
                } else {
                    aVar.a();
                    gVar.l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        j0<?, ?> j0Var = this.f2233b;
        j0Var.r(j0Var.g(obj), gVar);
    }

    public final <UT, UB, ET extends l.a<ET>> boolean j(f0 f0Var, i iVar, j<ET> jVar, l<ET> lVar, j0<UT, UB> j0Var, UB ub2) {
        int a10 = f0Var.a();
        if (a10 == 11) {
            int i10 = 0;
            n.e eVar = null;
            c cVar = null;
            while (f0Var.A() != Integer.MAX_VALUE) {
                int a11 = f0Var.a();
                if (a11 == 16) {
                    i10 = f0Var.m();
                    eVar = jVar.b(iVar, this.f2232a, i10);
                } else if (a11 == 26) {
                    if (eVar != null) {
                        jVar.h(eVar);
                    } else {
                        cVar = f0Var.E();
                    }
                } else if (!f0Var.H()) {
                    break;
                }
            }
            if (f0Var.a() == 12) {
                if (cVar != null) {
                    if (eVar != null) {
                        jVar.i(eVar);
                    } else {
                        j0Var.d(ub2, i10, cVar);
                    }
                }
                return true;
            }
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        } else if ((a10 & 7) != 2) {
            return f0Var.H();
        } else {
            n.e b10 = jVar.b(iVar, this.f2232a, a10 >>> 3);
            if (b10 == null) {
                return j0Var.l(ub2, f0Var);
            }
            jVar.h(b10);
            return true;
        }
    }
}
