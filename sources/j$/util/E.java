package j$.util;

import j$.util.function.Consumer;
import j$.util.function.J;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public final /* synthetic */ class E implements Spliterator.OfInt {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ F f18336a;

    private /* synthetic */ E(F f10) {
        this.f18336a = f10;
    }

    public static /* synthetic */ Spliterator.OfInt a(F f10) {
        if (f10 == null) {
            return null;
        }
        return f10 instanceof D ? ((D) f10).f18329a : new E(f10);
    }

    public final /* synthetic */ int characteristics() {
        return this.f18336a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18336a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18336a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18336a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18336a.c(J.a(intConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18336a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18336a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18336a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18336a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f18336a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18336a.j(J.a(intConsumer));
    }
}
