package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import j9.c;
import j9.j;
import j9.y;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: CodedInputStreamReader */
public final class g implements y {

    /* renamed from: a  reason: collision with root package name */
    public final f f7380a;

    /* renamed from: b  reason: collision with root package name */
    public int f7381b;

    /* renamed from: c  reason: collision with root package name */
    public int f7382c;

    /* renamed from: d  reason: collision with root package name */
    public int f7383d = 0;

    public g(f fVar) {
        Charset charset = p.f7415a;
        if (fVar != null) {
            this.f7380a = fVar;
            fVar.f7347d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    public static void x(int i10) {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static void y(int i10) {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final int a() {
        int i10 = this.f7383d;
        if (i10 != 0) {
            this.f7381b = i10;
            this.f7383d = 0;
        } else {
            this.f7381b = this.f7380a.w();
        }
        int i11 = this.f7381b;
        if (i11 == 0 || i11 == this.f7382c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final <T> void b(T t10, c0<T> c0Var, i iVar) {
        int i10 = this.f7382c;
        this.f7382c = ((this.f7381b >>> 3) << 3) | 4;
        try {
            c0Var.h(t10, this, iVar);
            if (this.f7381b != this.f7382c) {
                throw InvalidProtocolBufferException.f();
            }
        } finally {
            this.f7382c = i10;
        }
    }

    public final <T> void c(T t10, c0<T> c0Var, i iVar) {
        int x10 = this.f7380a.x();
        f fVar = this.f7380a;
        if (fVar.f7344a < fVar.f7345b) {
            int g2 = fVar.g(x10);
            this.f7380a.f7344a++;
            c0Var.h(t10, this, iVar);
            this.f7380a.a(0);
            f fVar2 = this.f7380a;
            fVar2.f7344a--;
            fVar2.f(g2);
            return;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void d(List<Boolean> list) {
        int w9;
        int w10;
        if (list instanceof e) {
            e eVar = (e) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    eVar.i(this.f7380a.h());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    eVar.i(this.f7380a.h());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f7380a.h()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Boolean.valueOf(this.f7380a.h()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final c e() {
        v(2);
        return this.f7380a.i();
    }

    public final void f(List<c> list) {
        int w9;
        if ((this.f7381b & 7) == 2) {
            do {
                list.add(e());
                if (!this.f7380a.e()) {
                    w9 = this.f7380a.w();
                } else {
                    return;
                }
            } while (w9 == this.f7381b);
            this.f7383d = w9;
            return;
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void g(List<Double> list) {
        int w9;
        int w10;
        if (list instanceof h) {
            h hVar = (h) list;
            int i10 = this.f7381b & 7;
            if (i10 == 1) {
                do {
                    hVar.i(this.f7380a.j());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int x10 = this.f7380a.x();
                y(x10);
                int d10 = this.f7380a.d() + x10;
                do {
                    hVar.i(this.f7380a.j());
                } while (this.f7380a.d() < d10);
            } else {
                int i11 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        } else {
            int i12 = this.f7381b & 7;
            if (i12 == 1) {
                do {
                    list.add(Double.valueOf(this.f7380a.j()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i12 == 2) {
                int x11 = this.f7380a.x();
                y(x11);
                int d11 = this.f7380a.d() + x11;
                do {
                    list.add(Double.valueOf(this.f7380a.j()));
                } while (this.f7380a.d() < d11);
            } else {
                int i13 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    public final void h(List<Integer> list) {
        int w9;
        int w10;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f7380a.k());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    oVar.i(this.f7380a.k());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7380a.k()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Integer.valueOf(this.f7380a.k()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final void i(List<Integer> list) {
        int w9;
        int w10;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f7381b & 7;
            if (i10 == 2) {
                int x10 = this.f7380a.x();
                x(x10);
                int d10 = this.f7380a.d() + x10;
                do {
                    oVar.i(this.f7380a.l());
                } while (this.f7380a.d() < d10);
            } else if (i10 == 5) {
                do {
                    oVar.i(this.f7380a.l());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else {
                int i11 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        } else {
            int i12 = this.f7381b & 7;
            if (i12 == 2) {
                int x11 = this.f7380a.x();
                x(x11);
                int d11 = this.f7380a.d() + x11;
                do {
                    list.add(Integer.valueOf(this.f7380a.l()));
                } while (this.f7380a.d() < d11);
            } else if (i12 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7380a.l()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else {
                int i13 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    public final void j(List<Long> list) {
        int w9;
        int w10;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f7381b & 7;
            if (i10 == 1) {
                do {
                    uVar.i(this.f7380a.m());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int x10 = this.f7380a.x();
                y(x10);
                int d10 = this.f7380a.d() + x10;
                do {
                    uVar.i(this.f7380a.m());
                } while (this.f7380a.d() < d10);
            } else {
                int i11 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        } else {
            int i12 = this.f7381b & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(this.f7380a.m()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i12 == 2) {
                int x11 = this.f7380a.x();
                y(x11);
                int d11 = this.f7380a.d() + x11;
                do {
                    list.add(Long.valueOf(this.f7380a.m()));
                } while (this.f7380a.d() < d11);
            } else {
                int i13 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    public final void k(List<Float> list) {
        int w9;
        int w10;
        if (list instanceof m) {
            m mVar = (m) list;
            int i10 = this.f7381b & 7;
            if (i10 == 2) {
                int x10 = this.f7380a.x();
                x(x10);
                int d10 = this.f7380a.d() + x10;
                do {
                    mVar.i(this.f7380a.n());
                } while (this.f7380a.d() < d10);
            } else if (i10 == 5) {
                do {
                    mVar.i(this.f7380a.n());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else {
                int i11 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        } else {
            int i12 = this.f7381b & 7;
            if (i12 == 2) {
                int x11 = this.f7380a.x();
                x(x11);
                int d11 = this.f7380a.d() + x11;
                do {
                    list.add(Float.valueOf(this.f7380a.n()));
                } while (this.f7380a.d() < d11);
            } else if (i12 == 5) {
                do {
                    list.add(Float.valueOf(this.f7380a.n()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else {
                int i13 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    public final void l(List<Integer> list) {
        int w9;
        int w10;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f7380a.o());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    oVar.i(this.f7380a.o());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7380a.o()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Integer.valueOf(this.f7380a.o()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final void m(List<Long> list) {
        int w9;
        int w10;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    uVar.i(this.f7380a.p());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    uVar.i(this.f7380a.p());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7380a.p()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Long.valueOf(this.f7380a.p()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final void n(List<Integer> list) {
        int w9;
        int w10;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f7381b & 7;
            if (i10 == 2) {
                int x10 = this.f7380a.x();
                x(x10);
                int d10 = this.f7380a.d() + x10;
                do {
                    oVar.i(this.f7380a.q());
                } while (this.f7380a.d() < d10);
            } else if (i10 == 5) {
                do {
                    oVar.i(this.f7380a.q());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else {
                int i11 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        } else {
            int i12 = this.f7381b & 7;
            if (i12 == 2) {
                int x11 = this.f7380a.x();
                x(x11);
                int d11 = this.f7380a.d() + x11;
                do {
                    list.add(Integer.valueOf(this.f7380a.q()));
                } while (this.f7380a.d() < d11);
            } else if (i12 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7380a.q()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else {
                int i13 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    public final void o(List<Long> list) {
        int w9;
        int w10;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f7381b & 7;
            if (i10 == 1) {
                do {
                    uVar.i(this.f7380a.r());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int x10 = this.f7380a.x();
                y(x10);
                int d10 = this.f7380a.d() + x10;
                do {
                    uVar.i(this.f7380a.r());
                } while (this.f7380a.d() < d10);
            } else {
                int i11 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        } else {
            int i12 = this.f7381b & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(this.f7380a.r()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i12 == 2) {
                int x11 = this.f7380a.x();
                y(x11);
                int d11 = this.f7380a.d() + x11;
                do {
                    list.add(Long.valueOf(this.f7380a.r()));
                } while (this.f7380a.d() < d11);
            } else {
                int i13 = InvalidProtocolBufferException.f7324b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
        }
    }

    public final void p(List<Integer> list) {
        int w9;
        int w10;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f7380a.s());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    oVar.i(this.f7380a.s());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7380a.s()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Integer.valueOf(this.f7380a.s()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final void q(List<Long> list) {
        int w9;
        int w10;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    uVar.i(this.f7380a.t());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    uVar.i(this.f7380a.t());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7380a.t()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Long.valueOf(this.f7380a.t()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final void r(List<String> list, boolean z10) {
        String str;
        int w9;
        int w10;
        if ((this.f7381b & 7) != 2) {
            int i10 = InvalidProtocolBufferException.f7324b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        } else if (!(list instanceof j) || z10) {
            do {
                if (z10) {
                    v(2);
                    str = this.f7380a.v();
                } else {
                    v(2);
                    str = this.f7380a.u();
                }
                list.add(str);
                if (!this.f7380a.e()) {
                    w9 = this.f7380a.w();
                } else {
                    return;
                }
            } while (w9 == this.f7381b);
            this.f7383d = w9;
        } else {
            j jVar = (j) list;
            do {
                jVar.h(e());
                if (!this.f7380a.e()) {
                    w10 = this.f7380a.w();
                } else {
                    return;
                }
            } while (w10 == this.f7381b);
            this.f7383d = w10;
        }
    }

    public final void s(List<Integer> list) {
        int w9;
        int w10;
        if (list instanceof o) {
            o oVar = (o) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    oVar.i(this.f7380a.x());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    oVar.i(this.f7380a.x());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7380a.x()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Integer.valueOf(this.f7380a.x()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final void t(List<Long> list) {
        int w9;
        int w10;
        if (list instanceof u) {
            u uVar = (u) list;
            int i10 = this.f7381b & 7;
            if (i10 == 0) {
                do {
                    uVar.i(this.f7380a.y());
                    if (!this.f7380a.e()) {
                        w10 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w10 == this.f7381b);
                this.f7383d = w10;
            } else if (i10 == 2) {
                int d10 = this.f7380a.d() + this.f7380a.x();
                do {
                    uVar.i(this.f7380a.y());
                } while (this.f7380a.d() < d10);
                u(d10);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        } else {
            int i11 = this.f7381b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7380a.y()));
                    if (!this.f7380a.e()) {
                        w9 = this.f7380a.w();
                    } else {
                        return;
                    }
                } while (w9 == this.f7381b);
                this.f7383d = w9;
            } else if (i11 == 2) {
                int d11 = this.f7380a.d() + this.f7380a.x();
                do {
                    list.add(Long.valueOf(this.f7380a.y()));
                } while (this.f7380a.d() < d11);
                u(d11);
            } else {
                throw InvalidProtocolBufferException.c();
            }
        }
    }

    public final void u(int i10) {
        if (this.f7380a.d() != i10) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void v(int i10) {
        if ((this.f7381b & 7) != i10) {
            throw InvalidProtocolBufferException.c();
        }
    }

    public final boolean w() {
        int i10;
        if (this.f7380a.e() || (i10 = this.f7381b) == this.f7382c) {
            return false;
        }
        return this.f7380a.z(i10);
    }
}
