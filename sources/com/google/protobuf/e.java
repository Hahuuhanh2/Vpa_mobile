package com.google.protobuf;

import java.nio.charset.Charset;
import tc.c;
import tc.x;

/* compiled from: CodedOutputStreamWriter */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f7899a;

    public e(CodedOutputStream codedOutputStream) {
        Charset charset = k.f7917a;
        if (codedOutputStream != null) {
            this.f7899a = codedOutputStream;
            codedOutputStream.f7865b = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i10, boolean z10) {
        this.f7899a.h0(i10, z10);
    }

    public final void b(int i10, c cVar) {
        this.f7899a.j0(i10, cVar);
    }

    public final void c(int i10, double d10) {
        CodedOutputStream codedOutputStream = this.f7899a;
        codedOutputStream.getClass();
        codedOutputStream.n0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) {
        this.f7899a.p0(i10, i11);
    }

    public final void e(int i10, int i11) {
        this.f7899a.l0(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f7899a.n0(i10, j10);
    }

    public final void g(int i10, float f10) {
        CodedOutputStream codedOutputStream = this.f7899a;
        codedOutputStream.getClass();
        codedOutputStream.l0(i10, Float.floatToRawIntBits(f10));
    }

    public final void h(int i10, x xVar, Object obj) {
        CodedOutputStream codedOutputStream = this.f7899a;
        codedOutputStream.x0(i10, 3);
        xVar.h((u) obj, codedOutputStream.f7865b);
        codedOutputStream.x0(i10, 4);
    }

    public final void i(int i10, int i11) {
        this.f7899a.p0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f7899a.A0(i10, j10);
    }

    public final void k(int i10, x xVar, Object obj) {
        this.f7899a.r0(i10, (u) obj, xVar);
    }

    public final void l(int i10, Object obj) {
        if (obj instanceof c) {
            this.f7899a.u0(i10, (c) obj);
        } else {
            this.f7899a.t0(i10, (u) obj);
        }
    }

    public final void m(int i10, int i11) {
        this.f7899a.l0(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f7899a.n0(i10, j10);
    }

    public final void o(int i10, int i11) {
        this.f7899a.y0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(int i10, long j10) {
        this.f7899a.A0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i10, int i11) {
        this.f7899a.y0(i10, i11);
    }

    public final void r(int i10, long j10) {
        this.f7899a.A0(i10, j10);
    }
}
