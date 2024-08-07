package u8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import m9.b;
import u8.d;

/* compiled from: AbstractIndexedListIterator */
public abstract class a<E> extends n<Object> implements ListIterator<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final int f15309a;

    /* renamed from: b  reason: collision with root package name */
    public int f15310b;

    public a(int i10, int i11) {
        b.j(i11, i10);
        this.f15309a = i10;
        this.f15310b = i11;
    }

    @Deprecated
    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    @Deprecated
    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        if (this.f15310b < this.f15309a) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.f15310b > 0) {
            return true;
        }
        return false;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.f15310b;
            this.f15310b = i10 + 1;
            return ((d.a) this).f15313c.get(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f15310b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f15310b - 1;
            this.f15310b = i10;
            return ((d.a) this).f15313c.get(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f15310b - 1;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        b(obj);
        throw null;
    }
}
