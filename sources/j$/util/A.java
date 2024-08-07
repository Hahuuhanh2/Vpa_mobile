package j$.util;

import j$.util.function.C0374g;
import j$.util.function.C0386m;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

public final /* synthetic */ class A implements C {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spliterator.OfDouble f18327a;

    private /* synthetic */ A(Spliterator.OfDouble ofDouble) {
        this.f18327a = ofDouble;
    }

    public static /* synthetic */ C f(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof B ? ((B) ofDouble).f18328a : new A(ofDouble);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f18327a.tryAdvance(C0374g.a(consumer));
    }

    public final /* synthetic */ int characteristics() {
        return this.f18327a.characteristics();
    }

    public final /* synthetic */ void d(C0388n nVar) {
        this.f18327a.forEachRemaining(C0386m.a(nVar));
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18327a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18327a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18327a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18327a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18327a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18327a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean o(C0388n nVar) {
        return this.f18327a.tryAdvance(C0386m.a(nVar));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18327a.tryAdvance(obj);
    }
}
