package sk;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
public final class a<T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f22914a;

    /* renamed from: b  reason: collision with root package name */
    public int f22915b;

    public a(T[] tArr) {
        j.f(tArr, "array");
        this.f22914a = tArr;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        if (this.f22915b < this.f22914a.length) {
            return true;
        }
        return false;
    }

    public final T next() {
        try {
            T[] tArr = this.f22914a;
            int i10 = this.f22915b;
            this.f22915b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f22915b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
