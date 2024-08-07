package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import java.util.ArrayDeque;

/* renamed from: j$.util.stream.g1  reason: case insensitive filesystem */
abstract class C0443g1 extends C0451i1 implements L {
    C0443g1(D0 d02) {
        super(d02);
    }

    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        if (this.f18801a != null) {
            if (this.f18804d == null) {
                Spliterator spliterator = this.f18803c;
                if (spliterator == null) {
                    ArrayDeque g2 = g();
                    while (true) {
                        D0 d02 = (D0) C0451i1.f(g2);
                        if (d02 != null) {
                            d02.d(obj);
                        } else {
                            this.f18801a = null;
                            return;
                        }
                    }
                } else {
                    ((L) spliterator).forEachRemaining(obj);
                }
            } else {
                do {
                } while (o(obj));
            }
        }
    }

    /* renamed from: tryAdvance */
    public final boolean o(Object obj) {
        D0 d02;
        if (!h()) {
            return false;
        }
        boolean tryAdvance = ((L) this.f18804d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f18803c != null || (d02 = (D0) C0451i1.f(this.f18805e)) == null) {
                this.f18801a = null;
            } else {
                L spliterator = d02.spliterator();
                this.f18804d = spliterator;
                return spliterator.tryAdvance(obj);
            }
        }
        return tryAdvance;
    }
}
