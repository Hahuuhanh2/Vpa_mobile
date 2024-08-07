package j2;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.n;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema */
public final class w extends j0<k0, k0> {
    public final void a(Object obj, int i10, int i11) {
        ((k0) obj).b((i10 << 3) | 5, Integer.valueOf(i11));
    }

    public final void b(Object obj, int i10, long j10) {
        ((k0) obj).b((i10 << 3) | 1, Long.valueOf(j10));
    }

    public final void c(int i10, Object obj, Object obj2) {
        ((k0) obj).b((i10 << 3) | 3, (k0) obj2);
    }

    public final void d(Object obj, int i10, c cVar) {
        ((k0) obj).b((i10 << 3) | 2, cVar);
    }

    public final void e(Object obj, int i10, long j10) {
        ((k0) obj).b((i10 << 3) | 0, Long.valueOf(j10));
    }

    public final k0 f(Object obj) {
        n nVar = (n) obj;
        k0 k0Var = nVar.unknownFields;
        if (k0Var != k0.f2293f) {
            return k0Var;
        }
        k0 k0Var2 = new k0();
        nVar.unknownFields = k0Var2;
        return k0Var2;
    }

    public final k0 g(Object obj) {
        return ((n) obj).unknownFields;
    }

    public final int h(Object obj) {
        return ((k0) obj).a();
    }

    public final int i(Object obj) {
        k0 k0Var = (k0) obj;
        int i10 = k0Var.f2297d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < k0Var.f2294a; i12++) {
            i11 += CodedOutputStream.K(3, (c) k0Var.f2296c[i12]) + CodedOutputStream.c0(2, k0Var.f2295b[i12] >>> 3) + (CodedOutputStream.b0(1) * 2);
        }
        k0Var.f2297d = i11;
        return i11;
    }

    public final void j(Object obj) {
        ((n) obj).unknownFields.f2298e = false;
    }

    public final k0 k(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (k0Var2.equals(k0.f2293f)) {
            return k0Var;
        }
        int i10 = k0Var.f2294a + k0Var2.f2294a;
        int[] copyOf = Arrays.copyOf(k0Var.f2295b, i10);
        System.arraycopy(k0Var2.f2295b, 0, copyOf, k0Var.f2294a, k0Var2.f2294a);
        Object[] copyOf2 = Arrays.copyOf(k0Var.f2296c, i10);
        System.arraycopy(k0Var2.f2296c, 0, copyOf2, k0Var.f2294a, k0Var2.f2294a);
        return new k0(i10, copyOf, copyOf2, true);
    }

    public final k0 m() {
        return new k0();
    }

    public final void n(Object obj, Object obj2) {
        ((n) obj).unknownFields = (k0) obj2;
    }

    public final void o(Object obj, Object obj2) {
        ((n) obj).unknownFields = (k0) obj2;
    }

    public final void p() {
    }

    public final k0 q(Object obj) {
        k0 k0Var = (k0) obj;
        k0Var.f2298e = false;
        return k0Var;
    }

    public final void r(Object obj, g gVar) {
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        gVar.getClass();
        for (int i10 = 0; i10 < k0Var.f2294a; i10++) {
            gVar.l(k0Var.f2295b[i10] >>> 3, k0Var.f2296c[i10]);
        }
    }

    public final void s(Object obj, g gVar) {
        ((k0) obj).c(gVar);
    }
}
