package j$.util;

import j$.util.function.C0384l;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public final /* synthetic */ class B implements Spliterator.OfDouble {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C f18328a;

    private /* synthetic */ B(C c10) {
        this.f18328a = c10;
    }

    public static /* synthetic */ Spliterator.OfDouble a(C c10) {
        if (c10 == null) {
            return null;
        }
        return c10 instanceof A ? ((A) c10).f18327a : new B(c10);
    }

    public final /* synthetic */ int characteristics() {
        return this.f18328a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18328a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18328a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18328a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18328a.d(C0384l.a(doubleConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18328a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18328a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18328a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18328a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f18328a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f18328a.o(C0384l.a(doubleConsumer));
    }
}
