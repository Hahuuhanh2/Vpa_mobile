package j$.util;

public interface L extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    L trySplit();
}
