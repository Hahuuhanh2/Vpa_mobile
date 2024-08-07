package bc;

import hc.a;
import hc.b;

/* compiled from: Gson */
public final class e extends u<Number> {
    public final Object a(a aVar) {
        if (aVar.k0() != 9) {
            return Float.valueOf((float) aVar.S());
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
        float floatValue = number.floatValue();
        h.a((double) floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        bVar.S(number);
    }
}
