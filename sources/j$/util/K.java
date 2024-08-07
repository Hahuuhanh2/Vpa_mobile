package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

public final /* synthetic */ class K implements Spliterator.OfPrimitive {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ L f18340a;

    private /* synthetic */ K(L l10) {
        this.f18340a = l10;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(L l10) {
        if (l10 == null) {
            return null;
        }
        return l10 instanceof J ? ((J) l10).f18339a : new K(l10);
    }

    public final /* synthetic */ int characteristics() {
        return this.f18340a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18340a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18340a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18340a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18340a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18340a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18340a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18340a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f18340a.a(Consumer.VivifiedWrapper.convert(consumer));
    }
}
