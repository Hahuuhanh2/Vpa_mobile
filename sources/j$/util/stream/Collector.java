package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0372f;
import j$.util.function.Function;
import j$.util.function.K0;
import java.util.Set;

public interface Collector<T, A, R> {
    BiConsumer accumulator();

    Set characteristics();

    C0372f combiner();

    Function finisher();

    K0 supplier();
}
