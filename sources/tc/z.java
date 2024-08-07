package tc;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.c0;
import com.google.protobuf.d0;
import com.google.protobuf.e;
import com.google.protobuf.i;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema */
public final class z extends c0<d0, d0> {
    public final d0 a(Object obj) {
        return ((i) obj).unknownFields;
    }

    public final int b(Object obj) {
        return ((d0) obj).b();
    }

    public final int c(Object obj) {
        d0 d0Var = (d0) obj;
        int i10 = d0Var.f7897d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < d0Var.f7894a; i12++) {
            i11 += CodedOutputStream.K(3, (c) d0Var.f7896c[i12]) + CodedOutputStream.c0(2, d0Var.f7895b[i12] >>> 3) + (CodedOutputStream.b0(1) * 2);
        }
        d0Var.f7897d = i11;
        return i11;
    }

    public final void d(Object obj) {
        ((i) obj).unknownFields.f7898e = false;
    }

    public final d0 e(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        d0 d0Var2 = (d0) obj2;
        d0 d0Var3 = d0.f7893f;
        if (d0Var3.equals(d0Var2)) {
            return d0Var;
        }
        if (d0Var3.equals(d0Var)) {
            int i10 = d0Var.f7894a + d0Var2.f7894a;
            int[] copyOf = Arrays.copyOf(d0Var.f7895b, i10);
            System.arraycopy(d0Var2.f7895b, 0, copyOf, d0Var.f7894a, d0Var2.f7894a);
            Object[] copyOf2 = Arrays.copyOf(d0Var.f7896c, i10);
            System.arraycopy(d0Var2.f7896c, 0, copyOf2, d0Var.f7894a, d0Var2.f7894a);
            return new d0(i10, copyOf, copyOf2, true);
        }
        d0Var.getClass();
        if (d0Var2.equals(d0Var3)) {
            return d0Var;
        }
        if (d0Var.f7898e) {
            int i11 = d0Var.f7894a + d0Var2.f7894a;
            d0Var.a(i11);
            System.arraycopy(d0Var2.f7895b, 0, d0Var.f7895b, d0Var.f7894a, d0Var2.f7894a);
            System.arraycopy(d0Var2.f7896c, 0, d0Var.f7896c, d0Var.f7894a, d0Var2.f7894a);
            d0Var.f7894a = i11;
            return d0Var;
        }
        throw new UnsupportedOperationException();
    }

    public final void f(Object obj, Object obj2) {
        ((i) obj).unknownFields = (d0) obj2;
    }

    public final void g(Object obj, e eVar) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        eVar.getClass();
        for (int i10 = 0; i10 < d0Var.f7894a; i10++) {
            eVar.l(d0Var.f7895b[i10] >>> 3, d0Var.f7896c[i10]);
        }
    }

    public final void h(Object obj, e eVar) {
        ((d0) obj).c(eVar);
    }
}
