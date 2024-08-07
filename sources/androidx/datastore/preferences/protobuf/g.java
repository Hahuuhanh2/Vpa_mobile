package androidx.datastore.preferences.protobuf;

import j2.c;
import j2.u;
import java.nio.charset.Charset;

/* compiled from: CodedOutputStreamWriter */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f2264a;

    public g(CodedOutputStream codedOutputStream) {
        Charset charset = p.f2318a;
        if (codedOutputStream != null) {
            this.f2264a = codedOutputStream;
            codedOutputStream.f2203b = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i10, boolean z10) {
        this.f2264a.i0(i10, z10);
    }

    public final void b(int i10, c cVar) {
        this.f2264a.k0(i10, cVar);
    }

    public final void c(int i10, double d10) {
        CodedOutputStream codedOutputStream = this.f2264a;
        codedOutputStream.getClass();
        codedOutputStream.o0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) {
        this.f2264a.q0(i10, i11);
    }

    public final void e(int i10, int i11) {
        this.f2264a.m0(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f2264a.o0(i10, j10);
    }

    public final void g(int i10, float f10) {
        CodedOutputStream codedOutputStream = this.f2264a;
        codedOutputStream.getClass();
        codedOutputStream.m0(i10, Float.floatToRawIntBits(f10));
    }

    public final void h(int i10, u uVar, Object obj) {
        CodedOutputStream codedOutputStream = this.f2264a;
        codedOutputStream.y0(i10, 3);
        uVar.i((z) obj, codedOutputStream.f2203b);
        codedOutputStream.y0(i10, 4);
    }

    public final void i(int i10, int i11) {
        this.f2264a.q0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f2264a.B0(i10, j10);
    }

    public final void k(int i10, u uVar, Object obj) {
        this.f2264a.s0(i10, (z) obj, uVar);
    }

    public final void l(int i10, Object obj) {
        if (obj instanceof c) {
            this.f2264a.v0(i10, (c) obj);
        } else {
            this.f2264a.u0(i10, (z) obj);
        }
    }

    public final void m(int i10, int i11) {
        this.f2264a.m0(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f2264a.o0(i10, j10);
    }

    public final void o(int i10, int i11) {
        this.f2264a.z0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(int i10, long j10) {
        this.f2264a.B0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i10, int i11) {
        this.f2264a.z0(i10, i11);
    }

    public final void r(int i10, long j10) {
        this.f2264a.B0(i10, j10);
    }
}
