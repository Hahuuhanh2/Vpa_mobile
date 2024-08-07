package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;

/* renamed from: j$.util.stream.h1  reason: case insensitive filesystem */
final class C0447h1 extends C0451i1 {
    C0447h1(E0 e02) {
        super(e02);
    }

    public final boolean a(Consumer consumer) {
        E0 f10;
        if (!h()) {
            return false;
        }
        boolean a10 = this.f18804d.a(consumer);
        if (!a10) {
            if (this.f18803c != null || (f10 = C0451i1.f(this.f18805e)) == null) {
                this.f18801a = null;
            } else {
                Spliterator spliterator = f10.spliterator();
                this.f18804d = spliterator;
                return spliterator.a(consumer);
            }
        }
        return a10;
    }

    public final void forEachRemaining(Consumer consumer) {
        if (this.f18801a != null) {
            if (this.f18804d == null) {
                Spliterator spliterator = this.f18803c;
                if (spliterator == null) {
                    ArrayDeque g2 = g();
                    while (true) {
                        E0 f10 = C0451i1.f(g2);
                        if (f10 != null) {
                            f10.forEach(consumer);
                        } else {
                            this.f18801a = null;
                            return;
                        }
                    }
                } else {
                    spliterator.forEachRemaining(consumer);
                }
            } else {
                do {
                } while (a(consumer));
            }
        }
    }
}
