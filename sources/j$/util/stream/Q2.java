package j$.util.stream;

import j$.util.C0402h;
import j$.util.M;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0362a;
import j$.util.function.C0364b;
import j$.util.function.C0370e;
import j$.util.function.C0372f;
import j$.util.function.C0374g;
import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.function.Function;
import j$.util.function.H0;
import j$.util.function.IntFunction;
import j$.util.function.J0;
import j$.util.function.K0;
import j$.util.function.L0;
import j$.util.function.M0;
import j$.util.function.N0;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;

public final /* synthetic */ class Q2 implements Stream {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Stream f18679a;

    private /* synthetic */ Q2(Stream stream) {
        this.f18679a = stream;
    }

    public static /* synthetic */ Stream w(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new Q2(stream);
    }

    public final /* synthetic */ boolean C(Predicate predicate) {
        return this.f18679a.anyMatch(H0.a(predicate));
    }

    public final /* synthetic */ void F(Consumer consumer) {
        this.f18679a.forEachOrdered(C0374g.a(consumer));
    }

    public final /* synthetic */ Object G(K0 k02, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f18679a.collect(J0.a(k02), C0362a.a(biConsumer), C0362a.a(biConsumer2));
    }

    public final /* synthetic */ IntStream I(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f18679a.mapToInt(M0.a(toIntFunction)));
    }

    public final /* synthetic */ Stream J(Function function) {
        return w(this.f18679a.map(E.a(function)));
    }

    public final /* synthetic */ Stream L(Function function) {
        return w(this.f18679a.flatMap(E.a(function)));
    }

    public final /* synthetic */ Optional M(C0372f fVar) {
        return C0402h.a(this.f18679a.reduce(C0370e.a(fVar)));
    }

    public final /* synthetic */ boolean a0(Predicate predicate) {
        return this.f18679a.allMatch(H0.a(predicate));
    }

    public final /* synthetic */ C0466m0 b0(Function function) {
        return C0458k0.w(this.f18679a.flatMapToLong(E.a(function)));
    }

    public final /* synthetic */ IntStream c(Function function) {
        return IntStream.VivifiedWrapper.convert(this.f18679a.flatMapToInt(E.a(function)));
    }

    public final /* synthetic */ void close() {
        this.f18679a.close();
    }

    public final /* synthetic */ Object collect(Collector collector) {
        return this.f18679a.collect(C0461l.a(collector));
    }

    public final /* synthetic */ long count() {
        return this.f18679a.count();
    }

    public final /* synthetic */ Stream distinct() {
        return w(this.f18679a.distinct());
    }

    public final /* synthetic */ Stream filter(Predicate predicate) {
        return w(this.f18679a.filter(H0.a(predicate)));
    }

    public final /* synthetic */ Optional findAny() {
        return C0402h.a(this.f18679a.findAny());
    }

    public final /* synthetic */ Optional findFirst() {
        return C0402h.a(this.f18679a.findFirst());
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f18679a.forEach(C0374g.a(consumer));
    }

    public final /* synthetic */ boolean g0(Predicate predicate) {
        return this.f18679a.noneMatch(H0.a(predicate));
    }

    public final /* synthetic */ C0466m0 h0(ToLongFunction toLongFunction) {
        return C0458k0.w(this.f18679a.mapToLong(N0.a(toLongFunction)));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f18679a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f18679a.iterator();
    }

    public final /* synthetic */ F j0(ToDoubleFunction toDoubleFunction) {
        return D.w(this.f18679a.mapToDouble(L0.a(toDoubleFunction)));
    }

    public final /* synthetic */ Object l(Object obj, BiFunction biFunction, C0372f fVar) {
        return this.f18679a.reduce(obj, C0364b.a(biFunction), C0370e.a(fVar));
    }

    public final /* synthetic */ Stream limit(long j10) {
        return w(this.f18679a.limit(j10));
    }

    public final /* synthetic */ Object m0(Object obj, C0372f fVar) {
        return this.f18679a.reduce(obj, C0370e.a(fVar));
    }

    public final /* synthetic */ Optional max(Comparator comparator) {
        return C0402h.a(this.f18679a.max(comparator));
    }

    public final /* synthetic */ Optional min(Comparator comparator) {
        return C0402h.a(this.f18679a.min(comparator));
    }

    public final /* synthetic */ F n(Function function) {
        return D.w(this.f18679a.flatMapToDouble(E.a(function)));
    }

    public final /* synthetic */ C0449i onClose(Runnable runnable) {
        return C0441g.w(this.f18679a.onClose(runnable));
    }

    public final /* synthetic */ C0449i parallel() {
        return C0441g.w(this.f18679a.parallel());
    }

    public final /* synthetic */ C0449i sequential() {
        return C0441g.w(this.f18679a.sequential());
    }

    public final /* synthetic */ Stream skip(long j10) {
        return w(this.f18679a.skip(j10));
    }

    public final /* synthetic */ Stream sorted() {
        return w(this.f18679a.sorted());
    }

    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return w(this.f18679a.sorted(comparator));
    }

    public final /* synthetic */ Spliterator spliterator() {
        return M.f(this.f18679a.spliterator());
    }

    public final /* synthetic */ Object[] toArray() {
        return this.f18679a.toArray();
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f18679a.toArray(j$.util.function.M.a(intFunction));
    }

    public final /* synthetic */ Stream u(Consumer consumer) {
        return w(this.f18679a.peek(C0374g.a(consumer)));
    }

    public final /* synthetic */ C0449i unordered() {
        return C0441g.w(this.f18679a.unordered());
    }
}
