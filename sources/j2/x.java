package j2;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public final class x extends AbstractList<String> implements i, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final i f11523a;

    /* compiled from: UnmodifiableLazyStringList */
    public class a implements ListIterator<String>, Iterator {

        /* renamed from: a  reason: collision with root package name */
        public ListIterator<String> f11524a;

        public a(x xVar, int i10) {
            this.f11524a = xVar.f11523a.listIterator(i10);
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
            return this.f11524a.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f11524a.hasPrevious();
        }

        public final Object next() {
            return this.f11524a.next();
        }

        public final int nextIndex() {
            return this.f11524a.nextIndex();
        }

        public final Object previous() {
            return this.f11524a.previous();
        }

        public final int previousIndex() {
            return this.f11524a.previousIndex();
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
        public java.util.Iterator<String> f11525a;

        public b(x xVar) {
            this.f11525a = xVar.f11523a.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f11525a.hasNext();
        }

        public final Object next() {
            return this.f11525a.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public x(i iVar) {
        this.f11523a = iVar;
    }

    public final List<?> c() {
        return this.f11523a.c();
    }

    public final i d() {
        return this;
    }

    public final Object e(int i10) {
        return this.f11523a.e(i10);
    }

    public final Object get(int i10) {
        return (String) this.f11523a.get(i10);
    }

    public final java.util.Iterator<String> iterator() {
        return new b(this);
    }

    public final void k(c cVar) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    public final int size() {
        return this.f11523a.size();
    }
}
