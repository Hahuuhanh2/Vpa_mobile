package tc;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public final class a0 extends AbstractList<String> implements k, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final k f14946a;

    /* compiled from: UnmodifiableLazyStringList */
    public class a implements ListIterator<String>, Iterator {

        /* renamed from: a  reason: collision with root package name */
        public ListIterator<String> f14947a;

        public a(a0 a0Var, int i10) {
            this.f14947a = a0Var.f14946a.listIterator(i10);
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
            return this.f14947a.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f14947a.hasPrevious();
        }

        public final Object next() {
            return this.f14947a.next();
        }

        public final int nextIndex() {
            return this.f14947a.nextIndex();
        }

        public final Object previous() {
            return this.f14947a.previous();
        }

        public final int previousIndex() {
            return this.f14947a.previousIndex();
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
        public java.util.Iterator<String> f14948a;

        public b(a0 a0Var) {
            this.f14948a = a0Var.f14946a.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f14948a.hasNext();
        }

        public final Object next() {
            return this.f14948a.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public a0(k kVar) {
        this.f14946a = kVar;
    }

    public final List<?> c() {
        return this.f14946a.c();
    }

    public final k d() {
        return this;
    }

    public final Object e(int i10) {
        return this.f14946a.e(i10);
    }

    public final Object get(int i10) {
        return (String) this.f14946a.get(i10);
    }

    public final java.util.Iterator<String> iterator() {
        return new b(this);
    }

    public final void j(c cVar) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    public final int size() {
        return this.f14946a.size();
    }
}
