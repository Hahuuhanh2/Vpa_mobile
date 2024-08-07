package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Collection;

final class I0 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f18633a;

    I0(Collection collection) {
        this.f18633a = collection;
    }

    public final E0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f18633a.size();
    }

    public final void e(Object[] objArr, int i10) {
        for (Object obj : this.f18633a) {
            objArr[i10] = obj;
            i10++;
        }
    }

    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f18633a, consumer);
    }

    public final /* synthetic */ int j() {
        return 0;
    }

    public final Object[] o(IntFunction intFunction) {
        java.util.Collection collection = this.f18633a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.G0(this, j10, j11, intFunction);
    }

    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f18633a).spliterator();
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", new Object[]{Integer.valueOf(this.f18633a.size()), this.f18633a});
    }
}
