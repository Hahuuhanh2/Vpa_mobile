package j$.util;

import j$.util.function.UnaryOperator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public interface List<E> extends Collection<E> {

    /* renamed from: j$.util.List$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            if (DesugarCollections.f18331b.isInstance(list)) {
                DesugarCollections.e(list, unaryOperator);
                return;
            }
            unaryOperator.getClass();
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(unaryOperator.apply(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, Comparator comparator) {
            if (DesugarCollections.f18331b.isInstance(list)) {
                DesugarCollections.f(list, comparator);
                return;
            }
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }

    /* renamed from: j$.util.List$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ void sort(java.util.List list, Comparator comparator) {
            if (list instanceof List) {
                ((List) list).sort(comparator);
            } else {
                CC.$default$sort(list, comparator);
            }
        }
    }

    void add(int i10, E e10);

    boolean add(E e10);

    boolean addAll(int i10, Collection<? extends E> collection);

    boolean addAll(Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    boolean equals(Object obj);

    E get(int i10);

    int hashCode();

    int indexOf(Object obj);

    boolean isEmpty();

    Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i10);

    E remove(int i10);

    boolean remove(Object obj);

    boolean removeAll(Collection<?> collection);

    void replaceAll(UnaryOperator<E> unaryOperator);

    boolean retainAll(Collection<?> collection);

    E set(int i10, E e10);

    int size();

    void sort(Comparator<? super E> comparator);

    Spliterator<E> spliterator();

    java.util.List<E> subList(int i10, int i11);

    Object[] toArray();

    <T> T[] toArray(T[] tArr);
}
