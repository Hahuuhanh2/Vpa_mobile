package ka;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList */
public final class c0<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final List<E> f12282a;

    public c0(List<E> list) {
        this.f12282a = Collections.unmodifiableList(list);
    }

    public final boolean add(E e10) {
        return this.f12282a.add(e10);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.f12282a.addAll(collection);
    }

    public final void clear() {
        this.f12282a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f12282a.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f12282a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f12282a.equals(obj);
    }

    public final E get(int i10) {
        return this.f12282a.get(i10);
    }

    public final int hashCode() {
        return this.f12282a.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.f12282a.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f12282a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f12282a.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f12282a.lastIndexOf(obj);
    }

    public final ListIterator<E> listIterator() {
        return this.f12282a.listIterator();
    }

    public final boolean remove(Object obj) {
        return this.f12282a.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f12282a.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f12282a.retainAll(collection);
    }

    public final E set(int i10, E e10) {
        return this.f12282a.set(i10, e10);
    }

    public final int size() {
        return this.f12282a.size();
    }

    public final List<E> subList(int i10, int i11) {
        return this.f12282a.subList(i10, i11);
    }

    public final Object[] toArray() {
        return this.f12282a.toArray();
    }

    public final void add(int i10, E e10) {
        this.f12282a.add(i10, e10);
    }

    public final boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f12282a.addAll(i10, collection);
    }

    public final ListIterator<E> listIterator(int i10) {
        return this.f12282a.listIterator(i10);
    }

    public final E remove(int i10) {
        return this.f12282a.remove(i10);
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f12282a.toArray(tArr);
    }
}
