package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.q;
import j9.c;
import j9.d;
import j9.e0;
import j9.w;
import j9.y;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema */
public final class a0<T> implements c0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final x f7326a;

    /* renamed from: b  reason: collision with root package name */
    public final g0<?, ?> f7327b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7328c;

    /* renamed from: d  reason: collision with root package name */
    public final j<?> f7329d;

    public a0(g0<?, ?> g0Var, j<?> jVar, x xVar) {
        this.f7327b = g0Var;
        this.f7328c = jVar.e(xVar);
        this.f7329d = jVar;
        this.f7326a = xVar;
    }

    public final void a(T t10, T t11) {
        g0<?, ?> g0Var = this.f7327b;
        Class<?> cls = d0.f7338a;
        g0Var.o(t10, g0Var.k(g0Var.g(t10), g0Var.g(t11)));
        if (this.f7328c) {
            d0.B(this.f7329d, t10, t11);
        }
    }

    public final T b() {
        x xVar = this.f7326a;
        if (xVar instanceof n) {
            return (n) ((n) xVar).r();
        }
        return xVar.e().n0();
    }

    public final void c(T t10) {
        this.f7327b.j(t10);
        this.f7329d.f(t10);
    }

    public final boolean d(T t10) {
        return this.f7329d.c(t10).i();
    }

    public final boolean e(T t10, T t11) {
        if (!this.f7327b.g(t10).equals(this.f7327b.g(t11))) {
            return false;
        }
        if (this.f7328c) {
            return this.f7329d.c(t10).equals(this.f7329d.c(t11));
        }
        return true;
    }

    public final int f(T t10) {
        g0<?, ?> g0Var = this.f7327b;
        int i10 = g0Var.i(g0Var.g(t10)) + 0;
        if (!this.f7328c) {
            return i10;
        }
        l<?> c10 = this.f7329d.c(t10);
        int i11 = 0;
        for (int i12 = 0; i12 < c10.f7399a.e(); i12++) {
            i11 += l.f(c10.f7399a.d(i12));
        }
        for (Map.Entry<T, Object> f10 : c10.f7399a.f()) {
            i11 += l.f(f10);
        }
        return i10 + i11;
    }

    public final int g(T t10) {
        int hashCode = this.f7327b.g(t10).hashCode();
        if (this.f7328c) {
            return (hashCode * 53) + this.f7329d.c(t10).hashCode();
        }
        return hashCode;
    }

    public final void h(T t10, y yVar, i iVar) {
        g0<?, ?> g0Var = this.f7327b;
        j<?> jVar = this.f7329d;
        h0 f10 = g0Var.f(t10);
        l<?> d10 = jVar.d(t10);
        while (true) {
            try {
                g gVar = (g) yVar;
                if (gVar.a() != Integer.MAX_VALUE) {
                    if (!k(gVar, iVar, jVar, d10, g0Var, f10)) {
                        break;
                    }
                } else {
                    break;
                }
            } finally {
                g0Var.n(t10, f10);
            }
        }
    }

    public final void i(Object obj, d dVar) {
        Iterator<Map.Entry<?, Object>> k10 = this.f7329d.c(obj).k();
        while (k10.hasNext()) {
            Map.Entry next = k10.next();
            l.a aVar = (l.a) next.getKey();
            if (aVar.f() == e0.MESSAGE) {
                aVar.d();
                aVar.g();
                if (next instanceof q.a) {
                    aVar.a();
                    dVar.l(0, ((q.a) next).f7417a.getValue().b());
                } else {
                    aVar.a();
                    dVar.l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        g0<?, ?> g0Var = this.f7327b;
        g0Var.r(g0Var.g(obj), dVar);
    }

    public final void j(T t10, byte[] bArr, int i10, int i11, d.a aVar) {
        n nVar = (n) t10;
        h0 h0Var = nVar.unknownFields;
        if (h0Var == h0.f7386f) {
            h0Var = new h0();
            nVar.unknownFields = h0Var;
        }
        n.c cVar = (n.c) t10;
        l<n.d> lVar = cVar.extensions;
        if (lVar.f7400b) {
            cVar.extensions = lVar.clone();
        }
        n.e eVar = null;
        while (i10 < i11) {
            int G = d.G(bArr, i10, aVar);
            int i12 = aVar.f7334a;
            if (i12 == 11) {
                int i13 = 0;
                c cVar2 = null;
                while (G < i11) {
                    G = d.G(bArr, G, aVar);
                    int i14 = aVar.f7334a;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            if (eVar != null) {
                                w wVar = w.f11791c;
                                throw null;
                            } else if (i16 == 2) {
                                G = d.b(bArr, G, aVar);
                                cVar2 = (c) aVar.f7336c;
                            }
                        }
                    } else if (i16 == 0) {
                        G = d.G(bArr, G, aVar);
                        i13 = aVar.f7334a;
                        eVar = this.f7329d.b(aVar.f7337d, this.f7326a, i13);
                    }
                    if (i14 == 12) {
                        break;
                    }
                    G = d.M(i14, bArr, G, i11, aVar);
                }
                if (cVar2 != null) {
                    h0Var.c((i13 << 3) | 2, cVar2);
                }
                i10 = G;
            } else if ((i12 & 7) == 2) {
                eVar = this.f7329d.b(aVar.f7337d, this.f7326a, i12 >>> 3);
                if (eVar == null) {
                    i10 = d.E(i12, bArr, G, i11, h0Var, aVar);
                } else {
                    w wVar2 = w.f11791c;
                    throw null;
                }
            } else {
                i10 = d.M(i12, bArr, G, i11, aVar);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final <UT, UB, ET extends l.a<ET>> boolean k(y yVar, i iVar, j<ET> jVar, l<ET> lVar, g0<UT, UB> g0Var, UB ub2) {
        g gVar = (g) yVar;
        int i10 = gVar.f7381b;
        if (i10 == 11) {
            n.e eVar = null;
            c cVar = null;
            int i11 = 0;
            while (gVar.a() != Integer.MAX_VALUE) {
                int i12 = gVar.f7381b;
                if (i12 == 16) {
                    gVar.v(0);
                    i11 = gVar.f7380a.x();
                    eVar = jVar.b(iVar, this.f7326a, i11);
                } else if (i12 == 26) {
                    if (eVar != null) {
                        jVar.h(eVar);
                    } else {
                        cVar = gVar.e();
                    }
                } else if (!gVar.w()) {
                    break;
                }
            }
            if (gVar.f7381b == 12) {
                if (cVar != null) {
                    if (eVar != null) {
                        jVar.i(eVar);
                    } else {
                        g0Var.d(ub2, i11, cVar);
                    }
                }
                return true;
            }
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        } else if ((i10 & 7) != 2) {
            return gVar.w();
        } else {
            n.e b10 = jVar.b(iVar, this.f7326a, i10 >>> 3);
            if (b10 == null) {
                return g0Var.l(ub2, yVar);
            }
            jVar.h(b10);
            return true;
        }
    }
}
