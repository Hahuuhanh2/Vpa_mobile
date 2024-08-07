package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import j2.c;
import j2.i;
import j2.s;
import j2.u;
import j2.z;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: CodedInputStreamReader */
public final class f implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f2260a;

    /* renamed from: b  reason: collision with root package name */
    public int f2261b;

    /* renamed from: c  reason: collision with root package name */
    public int f2262c;

    /* renamed from: d  reason: collision with root package name */
    public int f2263d = 0;

    public f(e eVar) {
        Charset charset = p.f2318a;
        if (eVar != null) {
            this.f2260a = eVar;
            eVar.f2241d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    public final int A() {
        int i10 = this.f2263d;
        if (i10 != 0) {
            this.f2261b = i10;
            this.f2263d = 0;
        } else {
            this.f2261b = this.f2260a.u();
        }
        int i11 = this.f2261b;
        if (i11 == 0 || i11 == this.f2262c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final void B(List<String> list) {
        R(list, false);
    }

    public final void C(List<String> list) {
        R(list, true);
    }

    public final <T> void D(List<T> list, u<T> uVar, i iVar) {
        int u10;
        int i10 = this.f2261b;
        if ((i10 & 7) == 3) {
            do {
                list.add(P(uVar, iVar));
                if (!this.f2260a.c() && this.f2263d == 0) {
                    u10 = this.f2260a.u();
                } else {
                    return;
                }
            } while (u10 == i10);
            this.f2263d = u10;
            return;
        }
        int i11 = InvalidProtocolBufferException.f2211a;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    public final c E() {
        T(2);
        return this.f2260a.g();
    }

    public final void F(List<Float> list) {
        int u10;
        int u11;
        if (list instanceof m) {
            m mVar = (m) list;
            int i10 = this.f2261b & 7;
            if (i10 == 2) {
                int v2 = this.f2260a.v();
                U(v2);
                int b10 = this.f2260a.b() + v2;
                do {
                    mVar.i(this.f2260a.l());
                } while (this.f2260a.b() < b10);
            } else if (i10 == 5) {
                do {
                    mVar.i(this.f2260a.l());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 2) {
                int v10 = this.f2260a.v();
                U(v10);
                int b11 = this.f2260a.b() + v10;
                do {
                    list.add(Float.valueOf(this.f2260a.l()));
                } while (this.f2260a.b() < b11);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(this.f2260a.l()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final int G() {
        T(0);
        return this.f2260a.m();
    }

    public final boolean H() {
        int i10;
        if (this.f2260a.c() || (i10 = this.f2261b) == this.f2262c) {
            return false;
        }
        return this.f2260a.x(i10);
    }

    public final int I() {
        T(5);
        return this.f2260a.o();
    }

    public final void J(List<c> list) {
        int u10;
        if ((this.f2261b & 7) == 2) {
            do {
                list.add(E());
                if (!this.f2260a.c()) {
                    u10 = this.f2260a.u();
                } else {
                    return;
                }
            } while (u10 == this.f2261b);
            this.f2263d = u10;
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void K(List<Double> list) {
        int u10;
        int u11;
        if (list instanceof h) {
            h hVar = (h) list;
            int i10 = this.f2261b & 7;
            if (i10 == 1) {
                do {
                    hVar.i(this.f2260a.h());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int v2 = this.f2260a.v();
                V(v2);
                int b10 = this.f2260a.b() + v2;
                do {
                    hVar.i(this.f2260a.h());
                } while (this.f2260a.b() < b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(this.f2260a.h()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int v10 = this.f2260a.v();
                V(v10);
                int b11 = this.f2260a.b() + v10;
                do {
                    list.add(Double.valueOf(this.f2260a.h()));
                } while (this.f2260a.b() < b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final long L() {
        T(0);
        return this.f2260a.n();
    }

    public final String M() {
        T(2);
        return this.f2260a.t();
    }

    public final void N(List<Long> list) {
        int u10;
        int u11;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f2261b & 7;
            if (i10 == 1) {
                do {
                    uVar.i(this.f2260a.k());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int v2 = this.f2260a.v();
                V(v2);
                int b10 = this.f2260a.b() + v2;
                do {
                    uVar.i(this.f2260a.k());
                } while (this.f2260a.b() < b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.f2260a.k()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int v10 = this.f2260a.v();
                V(v10);
                int b11 = this.f2260a.b() + v10;
                do {
                    list.add(Long.valueOf(this.f2260a.k()));
                } while (this.f2260a.b() < b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final Object O(z zVar, Class<?> cls, i iVar) {
        switch (zVar.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(L());
            case 3:
                return Long.valueOf(d());
            case 4:
                return Integer.valueOf(G());
            case 5:
                return Long.valueOf(e());
            case 6:
                return Integer.valueOf(i());
            case 7:
                return Boolean.valueOf(j());
            case 8:
                return M();
            case 10:
                T(2);
                return Q(s.f11516c.a(cls), iVar);
            case 11:
                return E();
            case 12:
                return Integer.valueOf(m());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Integer.valueOf(I());
            case 15:
                return Long.valueOf(k());
            case 16:
                return Integer.valueOf(v());
            case 17:
                return Long.valueOf(x());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final <T> T P(u<T> uVar, i iVar) {
        int i10 = this.f2262c;
        this.f2262c = ((this.f2261b >>> 3) << 3) | 4;
        try {
            T b10 = uVar.b();
            uVar.h(b10, this, iVar);
            uVar.c(b10);
            if (this.f2261b == this.f2262c) {
                return b10;
            }
            throw InvalidProtocolBufferException.e();
        } finally {
            this.f2262c = i10;
        }
    }

    public final <T> T Q(u<T> uVar, i iVar) {
        int v2 = this.f2260a.v();
        e eVar = this.f2260a;
        if (eVar.f2238a < eVar.f2239b) {
            int e10 = eVar.e(v2);
            T b10 = uVar.b();
            this.f2260a.f2238a++;
            uVar.h(b10, this, iVar);
            uVar.c(b10);
            this.f2260a.a(0);
            e eVar2 = this.f2260a;
            eVar2.f2238a--;
            eVar2.d(e10);
            return b10;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void R(List<String> list, boolean z10) {
        String str;
        int u10;
        int u11;
        if ((this.f2261b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        } else if (!(list instanceof i) || z10) {
            do {
                if (z10) {
                    str = M();
                } else {
                    str = z();
                }
                list.add(str);
                if (!this.f2260a.c()) {
                    u10 = this.f2260a.u();
                } else {
                    return;
                }
            } while (u10 == this.f2261b);
            this.f2263d = u10;
        } else {
            i iVar = (i) list;
            do {
                iVar.k(E());
                if (!this.f2260a.c()) {
                    u11 = this.f2260a.u();
                } else {
                    return;
                }
            } while (u11 == this.f2261b);
            this.f2263d = u11;
        }
    }

    public final void S(int i10) {
        if (this.f2260a.b() != i10) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final void T(int i10) {
        if ((this.f2261b & 7) != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void U(int i10) {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void V(int i10) {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final int a() {
        return this.f2261b;
    }

    public final void b(List<Integer> list) {
        int u10;
        int u11;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f2260a.q());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    oVar.i(this.f2260a.q());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2260a.q()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Integer.valueOf(this.f2260a.q()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final <T> void c(List<T> list, u<T> uVar, i iVar) {
        int u10;
        int i10 = this.f2261b;
        if ((i10 & 7) == 2) {
            do {
                list.add(Q(uVar, iVar));
                if (!this.f2260a.c() && this.f2263d == 0) {
                    u10 = this.f2260a.u();
                } else {
                    return;
                }
            } while (u10 == i10);
            this.f2263d = u10;
            return;
        }
        int i11 = InvalidProtocolBufferException.f2211a;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    public final long d() {
        T(0);
        return this.f2260a.w();
    }

    public final long e() {
        T(1);
        return this.f2260a.k();
    }

    public final void f(List<Integer> list) {
        int u10;
        int u11;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f2261b & 7;
            if (i10 == 2) {
                int v2 = this.f2260a.v();
                U(v2);
                int b10 = this.f2260a.b() + v2;
                do {
                    oVar.i(this.f2260a.o());
                } while (this.f2260a.b() < b10);
            } else if (i10 == 5) {
                do {
                    oVar.i(this.f2260a.o());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 2) {
                int v10 = this.f2260a.v();
                U(v10);
                int b11 = this.f2260a.b() + v10;
                do {
                    list.add(Integer.valueOf(this.f2260a.o()));
                } while (this.f2260a.b() < b11);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f2260a.o()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final void g(List<Long> list) {
        int u10;
        int u11;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    uVar.i(this.f2260a.r());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    uVar.i(this.f2260a.r());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f2260a.r()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Long.valueOf(this.f2260a.r()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final void h(List<Integer> list) {
        int u10;
        int u11;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f2260a.v());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    oVar.i(this.f2260a.v());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2260a.v()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Integer.valueOf(this.f2260a.v()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final int i() {
        T(5);
        return this.f2260a.j();
    }

    public final boolean j() {
        T(0);
        return this.f2260a.f();
    }

    public final long k() {
        T(1);
        return this.f2260a.p();
    }

    public final void l(List<Long> list) {
        int u10;
        int u11;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    uVar.i(this.f2260a.w());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    uVar.i(this.f2260a.w());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f2260a.w()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Long.valueOf(this.f2260a.w()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final int m() {
        T(0);
        return this.f2260a.v();
    }

    public final void n(List<Long> list) {
        int u10;
        int u11;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    uVar.i(this.f2260a.n());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    uVar.i(this.f2260a.n());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f2260a.n()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Long.valueOf(this.f2260a.n()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final void o(List<Long> list) {
        int u10;
        int u11;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f2261b & 7;
            if (i10 == 1) {
                do {
                    uVar.i(this.f2260a.p());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int v2 = this.f2260a.v();
                V(v2);
                int b10 = this.f2260a.b() + v2;
                do {
                    uVar.i(this.f2260a.p());
                } while (this.f2260a.b() < b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.f2260a.p()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int v10 = this.f2260a.v();
                V(v10);
                int b11 = this.f2260a.b() + v10;
                do {
                    list.add(Long.valueOf(this.f2260a.p()));
                } while (this.f2260a.b() < b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final void p(List<Integer> list) {
        int u10;
        int u11;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f2260a.m());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    oVar.i(this.f2260a.m());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2260a.m()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Integer.valueOf(this.f2260a.m()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final void q(List<Integer> list) {
        int u10;
        int u11;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f2260a.i());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    oVar.i(this.f2260a.i());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2260a.i()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Integer.valueOf(this.f2260a.i()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (H() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void r(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.v.a<K, V> r9, androidx.datastore.preferences.protobuf.i r10) {
        /*
            r7 = this;
            r0 = 2
            r7.T(r0)
            androidx.datastore.preferences.protobuf.e r1 = r7.f2260a
            int r1 = r1.v()
            androidx.datastore.preferences.protobuf.e r2 = r7.f2260a
            int r1 = r2.e(r1)
            K r2 = r9.f2334b
            V r3 = r9.f2336d
        L_0x0014:
            int r4 = r7.A()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            androidx.datastore.preferences.protobuf.e r5 = r7.f2260a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.c()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.H()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            j2.z r4 = r9.f2335c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f2336d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.O(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            j2.z r4 = r9.f2333a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.O(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.H()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            androidx.datastore.preferences.protobuf.e r8 = r7.f2260a
            r8.d(r1)
            return
        L_0x0065:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.e r9 = r7.f2260a
            r9.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.f.r(java.util.Map, androidx.datastore.preferences.protobuf.v$a, androidx.datastore.preferences.protobuf.i):void");
    }

    public final double readDouble() {
        T(1);
        return this.f2260a.h();
    }

    public final float readFloat() {
        T(5);
        return this.f2260a.l();
    }

    public final int s() {
        T(0);
        return this.f2260a.i();
    }

    public final void t(List<Integer> list) {
        int u10;
        int u11;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f2261b & 7;
            if (i10 == 2) {
                int v2 = this.f2260a.v();
                U(v2);
                int b10 = this.f2260a.b() + v2;
                do {
                    oVar.i(this.f2260a.j());
                } while (this.f2260a.b() < b10);
            } else if (i10 == 5) {
                do {
                    oVar.i(this.f2260a.j());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 2) {
                int v10 = this.f2260a.v();
                U(v10);
                int b11 = this.f2260a.b() + v10;
                do {
                    list.add(Integer.valueOf(this.f2260a.j()));
                } while (this.f2260a.b() < b11);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f2260a.j()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final <T> T u(u<T> uVar, i iVar) {
        T(2);
        return Q(uVar, iVar);
    }

    public final int v() {
        T(0);
        return this.f2260a.q();
    }

    public final <T> T w(u<T> uVar, i iVar) {
        T(3);
        return P(uVar, iVar);
    }

    public final long x() {
        T(0);
        return this.f2260a.r();
    }

    public final void y(List<Boolean> list) {
        int u10;
        int u11;
        if (list instanceof d) {
            d dVar = (d) list;
            int i10 = this.f2261b & 7;
            if (i10 == 0) {
                do {
                    dVar.i(this.f2260a.f());
                    if (!this.f2260a.c()) {
                        u11 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u11 == this.f2261b);
                this.f2263d = u11;
            } else if (i10 == 2) {
                int b10 = this.f2260a.b() + this.f2260a.v();
                do {
                    dVar.i(this.f2260a.f());
                } while (this.f2260a.b() < b10);
                S(b10);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        } else {
            int i11 = this.f2261b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2260a.f()));
                    if (!this.f2260a.c()) {
                        u10 = this.f2260a.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f2261b);
                this.f2263d = u10;
            } else if (i11 == 2) {
                int b11 = this.f2260a.b() + this.f2260a.v();
                do {
                    list.add(Boolean.valueOf(this.f2260a.f()));
                } while (this.f2260a.b() < b11);
                S(b11);
            } else {
                throw InvalidProtocolBufferException.b();
            }
        }
    }

    public final String z() {
        T(2);
        return this.f2260a.s();
    }
}
