package w8;

import i9.c0;
import i9.d0;
import i9.i0;
import i9.z;
import java.nio.charset.Charset;

/* compiled from: Util */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f16749a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static d0 a(c0 c0Var) {
        d0.a H = d0.H();
        int J = c0Var.J();
        H.o();
        d0.E((d0) H.f7405b, J);
        for (c0.b next : c0Var.I()) {
            d0.b.a J2 = d0.b.J();
            String J3 = next.I().J();
            J2.o();
            d0.b.E((d0.b) J2.f7405b, J3);
            z L = next.L();
            J2.o();
            d0.b.G((d0.b) J2.f7405b, L);
            i0 K = next.K();
            J2.o();
            d0.b.F((d0.b) J2.f7405b, K);
            int J4 = next.J();
            J2.o();
            d0.b.H((d0.b) J2.f7405b, J4);
            H.o();
            d0.F((d0) H.f7405b, (d0.b) J2.build());
        }
        return (d0) H.build();
    }
}
