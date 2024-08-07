package y4;

import java.util.ArrayDeque;
import o5.i;
import y4.m;

/* compiled from: ModelCache */
public final class l extends i<m.a<Object>, Object> {
    public l() {
        super(500);
    }

    public final void c(Object obj, Object obj2) {
        m.a aVar = (m.a) obj;
        aVar.getClass();
        ArrayDeque arrayDeque = m.a.f17481d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar);
        }
    }
}
