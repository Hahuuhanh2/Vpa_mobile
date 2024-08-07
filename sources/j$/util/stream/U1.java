package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

final class U1 extends X1 {
    U1(Spliterator spliterator, int i10, boolean z10) {
        super(spliterator, i10, z10);
    }

    public final void F(Consumer consumer) {
        if (!isParallel()) {
            K1().forEachRemaining(consumer);
        } else {
            super.F(consumer);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean H1() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        throw new UnsupportedOperationException();
    }

    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            K1().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }
}
