package j$.util;

import j$.util.function.C0374g;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

public final /* synthetic */ class J implements L {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spliterator.OfPrimitive f18339a;

    private /* synthetic */ J(Spliterator.OfPrimitive ofPrimitive) {
        this.f18339a = ofPrimitive;
    }

    public static /* synthetic */ L f(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof K ? ((K) ofPrimitive).f18340a : new J(ofPrimitive);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f18339a.tryAdvance(C0374g.a(consumer));
    }

    public final /* synthetic */ int characteristics() {
        return this.f18339a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18339a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18339a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18339a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18339a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18339a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18339a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18339a.tryAdvance(obj);
    }
}
