package bc;

import hc.a;
import hc.b;

/* compiled from: Gson */
public final class d extends u<Number> {
    public final Object a(a aVar) {
        if (aVar.k0() != 9) {
            return Double.valueOf(aVar.S());
        }
        aVar.d0();
        return null;
    }

    public final void b(b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.B();
            return;
        }
        double doubleValue = number.doubleValue();
        h.a(doubleValue);
        bVar.L(doubleValue);
    }
}
