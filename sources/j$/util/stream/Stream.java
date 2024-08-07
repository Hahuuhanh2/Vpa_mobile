package j$.util.stream;

import j$.util.C0402h;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0368d;
import j$.util.function.C0372f;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.I0;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.stream.IntStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public interface Stream<T> extends C0449i {

    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return stream instanceof Q2 ? ((Q2) stream).f18679a : new Wrapper();
        }

        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.a0(Predicate.VivifiedWrapper.convert(predicate));
        }

        public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
            return Stream.this.C(Predicate.VivifiedWrapper.convert(predicate));
        }

        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.G(I0.a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
        }

        public final /* synthetic */ Object collect(Collector collector) {
            return Stream.this.collect(C0457k.a(collector));
        }

        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
            return convert(Stream.this.filter(Predicate.VivifiedWrapper.convert(predicate)));
        }

        public final /* synthetic */ Optional findAny() {
            return C0402h.e(Stream.this.findAny());
        }

        public final /* synthetic */ Optional findFirst() {
            return C0402h.e(Stream.this.findFirst());
        }

        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.L(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
            return E.w(Stream.this.n(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
            return IntStream.Wrapper.convert(Stream.this.c(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
            return C0462l0.w(Stream.this.b0(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
            Stream.this.F(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        public final /* synthetic */ java.util.stream.Stream limit(long j10) {
            return convert(Stream.this.limit(j10));
        }

        public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
            return convert(Stream.this.J(Function.VivifiedWrapper.convert(function)));
        }

        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return E.w(Stream.this.j0(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
        }

        public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
            return IntStream.Wrapper.convert(Stream.this.I(ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
        }

        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return C0462l0.w(Stream.this.h0(ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
        }

        public final /* synthetic */ Optional max(Comparator comparator) {
            return C0402h.e(Stream.this.max(comparator));
        }

        public final /* synthetic */ Optional min(Comparator comparator) {
            return C0402h.e(Stream.this.min(comparator));
        }

        public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
            return Stream.this.g0(Predicate.VivifiedWrapper.convert(predicate));
        }

        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C0445h.w(Stream.this.onClose(runnable));
        }

        public final /* synthetic */ BaseStream parallel() {
            return C0445h.w(Stream.this.parallel());
        }

        public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
            return convert(Stream.this.u(Consumer.VivifiedWrapper.convert(consumer)));
        }

        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.l(obj, BiFunction.VivifiedWrapper.convert(biFunction), C0368d.b(binaryOperator));
        }

        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.m0(obj, C0368d.b(binaryOperator));
        }

        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return C0402h.e(Stream.this.M(C0368d.b(binaryOperator)));
        }

        public final /* synthetic */ BaseStream sequential() {
            return C0445h.w(Stream.this.sequential());
        }

        public final /* synthetic */ java.util.stream.Stream skip(long j10) {
            return convert(Stream.this.skip(j10));
        }

        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.toArray(IntFunction.VivifiedWrapper.convert(intFunction));
        }

        public final /* synthetic */ BaseStream unordered() {
            return C0445h.w(Stream.this.unordered());
        }
    }

    boolean C(j$.util.function.Predicate predicate);

    void F(j$.util.function.Consumer consumer);

    Object G(K0 k02, j$.util.function.BiConsumer biConsumer, j$.util.function.BiConsumer biConsumer2);

    IntStream I(j$.util.function.ToIntFunction toIntFunction);

    Stream J(j$.util.function.Function function);

    Stream L(j$.util.function.Function function);

    j$.util.Optional M(C0372f fVar);

    boolean a0(j$.util.function.Predicate predicate);

    C0466m0 b0(j$.util.function.Function function);

    IntStream c(j$.util.function.Function function);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream distinct();

    Stream<T> filter(j$.util.function.Predicate<? super T> predicate);

    j$.util.Optional findAny();

    j$.util.Optional findFirst();

    void forEach(j$.util.function.Consumer consumer);

    boolean g0(j$.util.function.Predicate predicate);

    C0466m0 h0(j$.util.function.ToLongFunction toLongFunction);

    F j0(j$.util.function.ToDoubleFunction toDoubleFunction);

    Object l(Object obj, j$.util.function.BiFunction biFunction, C0372f fVar);

    Stream limit(long j10);

    Object m0(Object obj, C0372f fVar);

    j$.util.Optional max(Comparator comparator);

    j$.util.Optional min(Comparator comparator);

    F n(j$.util.function.Function function);

    Stream skip(long j10);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Object[] toArray();

    Object[] toArray(j$.util.function.IntFunction intFunction);

    Stream u(j$.util.function.Consumer consumer);
}
