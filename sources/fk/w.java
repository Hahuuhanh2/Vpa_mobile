package fk;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j7.a;
import java.util.Iterator;
import sk.j;

/* compiled from: Iterators.kt */
public final class w<T> implements Iterator<u<? extends T>>, j$.util.Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator<T> f20219a;

    /* renamed from: b  reason: collision with root package name */
    public int f20220b;

    public w(Iterator<? extends T> it) {
        j.f(it, "iterator");
        this.f20219a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.f20219a.hasNext();
    }

    public final Object next() {
        int i10 = this.f20220b;
        this.f20220b = i10 + 1;
        if (i10 >= 0) {
            return new u(i10, this.f20219a.next());
        }
        a.x0();
        throw null;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
