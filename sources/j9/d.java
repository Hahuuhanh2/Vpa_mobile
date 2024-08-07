package j9;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import java.nio.charset.Charset;

/* compiled from: CodedOutputStreamWriter */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f11749a;

    public d(CodedOutputStream codedOutputStream) {
        Charset charset = p.f7415a;
        if (codedOutputStream != null) {
            this.f11749a = codedOutputStream;
            codedOutputStream.f7320b = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i10, boolean z10) {
        this.f11749a.h0(i10, z10);
    }

    public final void b(int i10, c cVar) {
        this.f11749a.i0(i10, cVar);
    }

    public final void c(int i10, double d10) {
        CodedOutputStream codedOutputStream = this.f11749a;
        codedOutputStream.getClass();
        codedOutputStream.l0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) {
        this.f11749a.n0(i10, i11);
    }

    public final void e(int i10, int i11) {
        this.f11749a.j0(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f11749a.l0(i10, j10);
    }

    public final void g(int i10, float f10) {
        CodedOutputStream codedOutputStream = this.f11749a;
        codedOutputStream.getClass();
        codedOutputStream.j0(i10, Float.floatToRawIntBits(f10));
    }

    public final void h(int i10, c0 c0Var, Object obj) {
        CodedOutputStream codedOutputStream = this.f11749a;
        codedOutputStream.t0(i10, 3);
        c0Var.i((x) obj, codedOutputStream.f7320b);
        codedOutputStream.t0(i10, 4);
    }

    public final void i(int i10, int i11) {
        this.f11749a.n0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f11749a.w0(i10, j10);
    }

    public final void k(int i10, c0 c0Var, Object obj) {
        this.f11749a.p0(i10, (x) obj, c0Var);
    }

    public final void l(int i10, Object obj) {
        if (obj instanceof c) {
            this.f11749a.r0(i10, (c) obj);
        } else {
            this.f11749a.q0(i10, (x) obj);
        }
    }

    public final void m(int i10, int i11) {
        this.f11749a.j0(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f11749a.l0(i10, j10);
    }

    public final void o(int i10, int i11) {
        this.f11749a.u0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(int i10, long j10) {
        this.f11749a.w0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i10, int i11) {
        this.f11749a.u0(i10, i11);
    }

    public final void r(int i10, long j10) {
        this.f11749a.w0(i10, j10);
    }
}
