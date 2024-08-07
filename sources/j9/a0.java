package j9;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.n;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema */
public final class a0 extends g0<h0, h0> {
    public final void a(Object obj, int i10, int i11) {
        ((h0) obj).c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    public final void b(Object obj, int i10, long j10) {
        ((h0) obj).c((i10 << 3) | 1, Long.valueOf(j10));
    }

    public final void c(int i10, Object obj, Object obj2) {
        ((h0) obj).c((i10 << 3) | 3, (h0) obj2);
    }

    public final void d(Object obj, int i10, c cVar) {
        ((h0) obj).c((i10 << 3) | 2, cVar);
    }

    public final void e(Object obj, int i10, long j10) {
        ((h0) obj).c((i10 << 3) | 0, Long.valueOf(j10));
    }

    public final h0 f(Object obj) {
        n nVar = (n) obj;
        h0 h0Var = nVar.unknownFields;
        if (h0Var != h0.f7386f) {
            return h0Var;
        }
        h0 h0Var2 = new h0();
        nVar.unknownFields = h0Var2;
        return h0Var2;
    }

    public final h0 g(Object obj) {
        return ((n) obj).unknownFields;
    }

    public final int h(Object obj) {
        return ((h0) obj).b();
    }

    public final int i(Object obj) {
        h0 h0Var = (h0) obj;
        int i10 = h0Var.f7390d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < h0Var.f7387a; i12++) {
            i11 += CodedOutputStream.K(3, (c) h0Var.f7389c[i12]) + CodedOutputStream.c0(2, h0Var.f7388b[i12] >>> 3) + (CodedOutputStream.b0(1) * 2);
        }
        h0Var.f7390d = i11;
        return i11;
    }

    public final void j(Object obj) {
        ((n) obj).unknownFields.f7391e = false;
    }

    public final h0 k(Object obj, Object obj2) {
        h0 h0Var = (h0) obj;
        h0 h0Var2 = (h0) obj2;
        h0 h0Var3 = h0.f7386f;
        if (h0Var3.equals(h0Var2)) {
            return h0Var;
        }
        if (h0Var3.equals(h0Var)) {
            int i10 = h0Var.f7387a + h0Var2.f7387a;
            int[] copyOf = Arrays.copyOf(h0Var.f7388b, i10);
            System.arraycopy(h0Var2.f7388b, 0, copyOf, h0Var.f7387a, h0Var2.f7387a);
            Object[] copyOf2 = Arrays.copyOf(h0Var.f7389c, i10);
            System.arraycopy(h0Var2.f7389c, 0, copyOf2, h0Var.f7387a, h0Var2.f7387a);
            return new h0(i10, copyOf, copyOf2, true);
        }
        h0Var.getClass();
        if (h0Var2.equals(h0Var3)) {
            return h0Var;
        }
        if (h0Var.f7391e) {
            int i11 = h0Var.f7387a + h0Var2.f7387a;
            h0Var.a(i11);
            System.arraycopy(h0Var2.f7388b, 0, h0Var.f7388b, h0Var.f7387a, h0Var2.f7387a);
            System.arraycopy(h0Var2.f7389c, 0, h0Var.f7389c, h0Var.f7387a, h0Var2.f7387a);
            h0Var.f7387a = i11;
            return h0Var;
        }
        throw new UnsupportedOperationException();
    }

    public final h0 m() {
        return new h0();
    }

    public final void n(Object obj, Object obj2) {
        ((n) obj).unknownFields = (h0) obj2;
    }

    public final void o(Object obj, Object obj2) {
        ((n) obj).unknownFields = (h0) obj2;
    }

    public final void p() {
    }

    public final h0 q(Object obj) {
        h0 h0Var = (h0) obj;
        h0Var.f7391e = false;
        return h0Var;
    }

    public final void r(Object obj, d dVar) {
        h0 h0Var = (h0) obj;
        h0Var.getClass();
        dVar.getClass();
        for (int i10 = 0; i10 < h0Var.f7387a; i10++) {
            dVar.l(h0Var.f7388b[i10] >>> 3, h0Var.f7389c[i10]);
        }
    }

    public final void s(Object obj, d dVar) {
        ((h0) obj).d(dVar);
    }
}
