package j$.util.stream;

import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.Comparator;

/* renamed from: j$.util.stream.b3  reason: case insensitive filesystem */
final class C0422b3 implements Spliterator, Consumer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f18755d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spliterator f18756a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f18757b;

    /* renamed from: c  reason: collision with root package name */
    private Object f18758c;

    C0422b3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C0422b3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f18756a = spliterator;
        this.f18757b = concurrentHashMap;
    }

    public final boolean a(Consumer consumer) {
        while (this.f18756a.a(this)) {
            ConcurrentHashMap concurrentHashMap = this.f18757b;
            Object obj = this.f18758c;
            if (obj == null) {
                obj = f18755d;
            }
            if (concurrentHashMap.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f18758c);
                this.f18758c = null;
                return true;
            }
        }
        return false;
    }

    public final void accept(Object obj) {
        this.f18758c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final int characteristics() {
        return (this.f18756a.characteristics() & -16469) | 1;
    }

    public final long estimateSize() {
        return this.f18756a.estimateSize();
    }

    public final void forEachRemaining(Consumer consumer) {
        this.f18756a.forEachRemaining(new C0469n(6, this, consumer));
    }

    public final Comparator getComparator() {
        return this.f18756a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    /* access modifiers changed from: package-private */
    public final void i(Consumer consumer, Object obj) {
        if (this.f18757b.putIfAbsent(obj != null ? obj : f18755d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    public final Spliterator trySplit() {
        Spliterator trySplit = this.f18756a.trySplit();
        if (trySplit != null) {
            return new C0422b3(trySplit, this.f18757b);
        }
        return null;
    }
}
