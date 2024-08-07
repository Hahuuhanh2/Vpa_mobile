package j$.util;

import j$.util.function.C0374g;
import j$.util.function.Consumer;
import j$.util.function.K;
import j$.util.function.L;
import java.util.Comparator;
import java.util.Spliterator;

public final /* synthetic */ class D implements F {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spliterator.OfInt f18329a;

    private /* synthetic */ D(Spliterator.OfInt ofInt) {
        this.f18329a = ofInt;
    }

    public static /* synthetic */ F f(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof E ? ((E) ofInt).f18336a : new D(ofInt);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f18329a.tryAdvance(C0374g.a(consumer));
    }

    public final /* synthetic */ void c(L l10) {
        this.f18329a.forEachRemaining(K.a(l10));
    }

    public final /* synthetic */ int characteristics() {
        return this.f18329a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18329a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18329a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18329a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18329a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18329a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18329a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean j(L l10) {
        return this.f18329a.tryAdvance(K.a(l10));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18329a.tryAdvance(obj);
    }
}
