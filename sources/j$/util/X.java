package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

final class X extends C0407m implements Spliterator {
    X() {
    }

    public final boolean a(Consumer consumer) {
        consumer.getClass();
        return false;
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }
}
