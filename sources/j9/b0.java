package j9;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public final class b0 extends AbstractList<String> implements j, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final j f11732a;

    /* compiled from: UnmodifiableLazyStringList */
    public class a implements ListIterator<String>, Iterator {

        /* renamed from: a  reason: collision with root package name */
        public ListIterator<String> f11733a;

        public a(b0 b0Var, int i10) {
            this.f11733a = b0Var.f11732a.listIterator(i10);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f11733a.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f11733a.hasPrevious();
        }

        public final Object next() {
            return this.f11733a.next();
        }

        public final int nextIndex() {
            return this.f11733a.nextIndex();
        }

        public final Object previous() {
            return this.f11733a.previous();
        }

        public final int previousIndex() {
            return this.f11733a.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList */
    public class b implements java.util.Iterator<String>, Iterator {

        /* renamed from: a  reason: collision with root package name */
        public java.util.Iterator<String> f11734a;

        public b(b0 b0Var) {
            this.f11734a = b0Var.f11732a.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f11734a.hasNext();
        }

        public final Object next() {
            return this.f11734a.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public b0(j jVar) {
        this.f11732a = jVar;
    }

    public final List<?> c() {
        return this.f11732a.c();
    }

    public final j d() {
        return this;
    }

    public final Object e(int i10) {
        return this.f11732a.e(i10);
    }

    public final Object get(int i10) {
        return (String) this.f11732a.get(i10);
    }

    public final void h(c cVar) {
        throw new UnsupportedOperationException();
    }

    public final java.util.Iterator<String> iterator() {
        return new b(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    public final int size() {
        return this.f11732a.size();
    }
}
