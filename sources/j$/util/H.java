package j$.util;

import j$.util.function.C0371e0;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

public final /* synthetic */ class H implements Spliterator.OfLong {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ I f18338a;

    private /* synthetic */ H(I i10) {
        this.f18338a = i10;
    }

    public static /* synthetic */ Spliterator.OfLong a(I i10) {
        if (i10 == null) {
            return null;
        }
        return i10 instanceof G ? ((G) i10).f18337a : new H(i10);
    }

    public final /* synthetic */ int characteristics() {
        return this.f18338a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18338a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18338a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18338a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18338a.b(C0371e0.a(longConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18338a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18338a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18338a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18338a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f18338a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f18338a.e(C0371e0.a(longConsumer));
    }
}
