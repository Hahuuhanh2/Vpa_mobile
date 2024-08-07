package j$.util;

import j$.util.function.C0373f0;
import j$.util.function.C0374g;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

public final /* synthetic */ class G implements I {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spliterator.OfLong f18337a;

    private /* synthetic */ G(Spliterator.OfLong ofLong) {
        this.f18337a = ofLong;
    }

    public static /* synthetic */ I f(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof H ? ((H) ofLong).f18338a : new G(ofLong);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f18337a.tryAdvance(C0374g.a(consumer));
    }

    public final /* synthetic */ void b(C0375g0 g0Var) {
        this.f18337a.forEachRemaining(C0373f0.a(g0Var));
    }

    public final /* synthetic */ int characteristics() {
        return this.f18337a.characteristics();
    }

    public final /* synthetic */ boolean e(C0375g0 g0Var) {
        return this.f18337a.tryAdvance(C0373f0.a(g0Var));
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18337a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18337a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18337a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18337a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18337a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18337a.hasCharacteristics(i10);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18337a.tryAdvance(obj);
    }
}
