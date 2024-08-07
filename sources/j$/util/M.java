package j$.util;

import j$.util.Spliterator;
import j$.util.function.C0374g;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

public final /* synthetic */ class M implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spliterator f18341a;

    private /* synthetic */ M(Spliterator spliterator) {
        this.f18341a = spliterator;
    }

    public static /* synthetic */ Spliterator f(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : new M(spliterator);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f18341a.tryAdvance(C0374g.a(consumer));
    }

    public final /* synthetic */ int characteristics() {
        return this.f18341a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f18341a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18341a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f18341a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18341a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18341a.hasCharacteristics(i10);
    }

    public final /* synthetic */ Spliterator trySplit() {
        return f(this.f18341a.trySplit());
    }
}
