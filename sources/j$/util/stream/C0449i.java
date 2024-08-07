package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.i  reason: case insensitive filesystem */
public interface C0449i extends AutoCloseable {
    void close();

    boolean isParallel();

    Iterator iterator();

    C0449i onClose(Runnable runnable);

    C0449i parallel();

    C0449i sequential();

    Spliterator spliterator();

    C0449i unordered();
}
