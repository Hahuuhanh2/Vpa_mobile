package j$.util.concurrent;

import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

final class g extends q implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f18420i;

    /* renamed from: j  reason: collision with root package name */
    long f18421j;

    g(m[] mVarArr, int i10, int i11, int i12, long j10, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, i11, i12);
        this.f18420i = concurrentHashMap;
        this.f18421j = j10;
    }

    public final boolean a(Consumer consumer) {
        consumer.getClass();
        m f10 = f();
        if (f10 == null) {
            return false;
        }
        consumer.accept(new l(f10.f18430b, f10.f18431c, this.f18420i));
        return true;
    }

    public final int characteristics() {
        return 4353;
    }

    public final long estimateSize() {
        return this.f18421j;
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            m f10 = f();
            if (f10 != null) {
                consumer.accept(new l(f10.f18430b, f10.f18431c, this.f18420i));
            } else {
                return;
            }
        }
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    public final Spliterator trySplit() {
        int i10 = this.f18442f;
        int i11 = this.f18443g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        m[] mVarArr = this.f18437a;
        int i13 = this.f18444h;
        this.f18443g = i12;
        long j10 = this.f18421j >>> 1;
        this.f18421j = j10;
        return new g(mVarArr, i13, i12, i11, j10, this.f18420i);
    }
}
