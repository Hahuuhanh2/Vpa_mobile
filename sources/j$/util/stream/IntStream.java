package j$.util.stream;

import j$.util.C0361f;
import j$.util.C0402h;
import j$.util.C0403i;
import j$.util.C0404j;
import j$.util.C0520t;
import j$.util.function.A0;
import j$.util.function.B0;
import j$.util.function.BiConsumer;
import j$.util.function.C0;
import j$.util.function.C0362a;
import j$.util.function.F;
import j$.util.function.G;
import j$.util.function.H;
import j$.util.function.I0;
import j$.util.function.IntFunction;
import j$.util.function.J;
import j$.util.function.J0;
import j$.util.function.K;
import j$.util.function.K0;
import j$.util.function.L;
import j$.util.function.M;
import j$.util.function.N;
import j$.util.function.O;
import j$.util.function.P;
import j$.util.function.Q;
import j$.util.function.S;
import j$.util.function.T;
import j$.util.function.U;
import j$.util.function.V;
import j$.util.function.W;
import j$.util.function.X;
import j$.util.function.Y;
import j$.util.function.Z;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public interface IntStream extends C0449i {

    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ java.util.stream.IntStream f18637a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f18637a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        public final /* synthetic */ Object A(K0 k02, C0 c02, BiConsumer biConsumer) {
            return this.f18637a.collect(J0.a(k02), B0.a(c02), C0362a.a(biConsumer));
        }

        public final /* synthetic */ boolean D(P p10) {
            return this.f18637a.anyMatch(O.a(p10));
        }

        public final /* synthetic */ void Q(L l10) {
            this.f18637a.forEachOrdered(K.a(l10));
        }

        public final /* synthetic */ Stream R(IntFunction intFunction) {
            return Q2.w(this.f18637a.mapToObj(M.a(intFunction)));
        }

        public final /* synthetic */ IntStream U(IntFunction intFunction) {
            return convert(this.f18637a.flatMap(M.a(intFunction)));
        }

        public final /* synthetic */ void Y(L l10) {
            this.f18637a.forEach(K.a(l10));
        }

        public final /* synthetic */ F Z(T t10) {
            return D.w(this.f18637a.mapToDouble(S.a(t10)));
        }

        public final /* synthetic */ F asDoubleStream() {
            return D.w(this.f18637a.asDoubleStream());
        }

        public final /* synthetic */ C0466m0 asLongStream() {
            return C0458k0.w(this.f18637a.asLongStream());
        }

        public final /* synthetic */ C0403i average() {
            return C0402h.b(this.f18637a.average());
        }

        public final /* synthetic */ Stream boxed() {
            return Q2.w(this.f18637a.boxed());
        }

        public final /* synthetic */ IntStream c0(P p10) {
            return convert(this.f18637a.filter(O.a(p10)));
        }

        public final /* synthetic */ void close() {
            this.f18637a.close();
        }

        public final /* synthetic */ long count() {
            return this.f18637a.count();
        }

        public final /* synthetic */ C0466m0 d(W w9) {
            return C0458k0.w(this.f18637a.mapToLong(V.a(w9)));
        }

        public final /* synthetic */ C0404j d0(H h10) {
            return C0402h.c(this.f18637a.reduce(G.a(h10)));
        }

        public final /* synthetic */ IntStream distinct() {
            return convert(this.f18637a.distinct());
        }

        public final /* synthetic */ IntStream e0(L l10) {
            return convert(this.f18637a.peek(K.a(l10)));
        }

        public final /* synthetic */ C0404j findAny() {
            return C0402h.c(this.f18637a.findAny());
        }

        public final /* synthetic */ C0404j findFirst() {
            return C0402h.c(this.f18637a.findFirst());
        }

        public final /* synthetic */ boolean isParallel() {
            return this.f18637a.isParallel();
        }

        public final /* synthetic */ IntStream k(Z z10) {
            return convert(this.f18637a.map(Y.a(z10)));
        }

        public final /* synthetic */ IntStream limit(long j10) {
            return convert(this.f18637a.limit(j10));
        }

        public final /* synthetic */ C0404j max() {
            return C0402h.c(this.f18637a.max());
        }

        public final /* synthetic */ C0404j min() {
            return C0402h.c(this.f18637a.min());
        }

        public final /* synthetic */ C0449i onClose(Runnable runnable) {
            return C0441g.w(this.f18637a.onClose(runnable));
        }

        public final /* synthetic */ int r(int i10, H h10) {
            return this.f18637a.reduce(i10, G.a(h10));
        }

        public final /* synthetic */ boolean s(P p10) {
            return this.f18637a.allMatch(O.a(p10));
        }

        public final /* synthetic */ IntStream skip(long j10) {
            return convert(this.f18637a.skip(j10));
        }

        public final /* synthetic */ IntStream sorted() {
            return convert(this.f18637a.sorted());
        }

        public final /* synthetic */ int sum() {
            return this.f18637a.sum();
        }

        public final C0361f summaryStatistics() {
            this.f18637a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        public final /* synthetic */ boolean t(P p10) {
            return this.f18637a.noneMatch(O.a(p10));
        }

        public final /* synthetic */ int[] toArray() {
            return this.f18637a.toArray();
        }

        public final /* synthetic */ C0449i unordered() {
            return C0441g.w(this.f18637a.unordered());
        }
    }

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f18637a : new Wrapper();
        }

        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.s(N.b(intPredicate));
        }

        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.D(N.b(intPredicate));
        }

        public final /* synthetic */ DoubleStream asDoubleStream() {
            return E.w(IntStream.this.asDoubleStream());
        }

        public final /* synthetic */ LongStream asLongStream() {
            return C0462l0.w(IntStream.this.asLongStream());
        }

        public final /* synthetic */ OptionalDouble average() {
            return C0402h.f(IntStream.this.average());
        }

        public final /* synthetic */ Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.A(I0.a(supplier), A0.a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.c0(N.b(intPredicate)));
        }

        public final /* synthetic */ OptionalInt findAny() {
            return C0402h.g(IntStream.this.findAny());
        }

        public final /* synthetic */ OptionalInt findFirst() {
            return C0402h.g(IntStream.this.findFirst());
        }

        public final /* synthetic */ java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
            return convert(IntStream.this.U(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.Y(J.a(intConsumer));
        }

        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.Q(J.a(intConsumer));
        }

        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        public final /* synthetic */ java.util.stream.IntStream limit(long j10) {
            return convert(IntStream.this.limit(j10));
        }

        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.k(X.d(intUnaryOperator)));
        }

        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return E.w(IntStream.this.Z(Q.b(intToDoubleFunction)));
        }

        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C0462l0.w(IntStream.this.d(U.a(intToLongFunction)));
        }

        public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.R(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        public final /* synthetic */ OptionalInt max() {
            return C0402h.g(IntStream.this.max());
        }

        public final /* synthetic */ OptionalInt min() {
            return C0402h.g(IntStream.this.min());
        }

        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.t(N.b(intPredicate));
        }

        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C0445h.w(IntStream.this.onClose(runnable));
        }

        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.e0(J.a(intConsumer)));
        }

        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.r(i10, F.a(intBinaryOperator));
        }

        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return C0402h.g(IntStream.this.d0(F.a(intBinaryOperator)));
        }

        public final /* synthetic */ java.util.stream.IntStream skip(long j10) {
            return convert(IntStream.this.skip(j10));
        }

        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        public final /* synthetic */ BaseStream unordered() {
            return C0445h.w(IntStream.this.unordered());
        }
    }

    Object A(K0 k02, C0 c02, BiConsumer biConsumer);

    boolean D(P p10);

    void Q(L l10);

    Stream R(IntFunction intFunction);

    IntStream U(IntFunction intFunction);

    void Y(L l10);

    F Z(T t10);

    F asDoubleStream();

    C0466m0 asLongStream();

    C0403i average();

    Stream boxed();

    IntStream c0(P p10);

    long count();

    C0466m0 d(W w9);

    C0404j d0(H h10);

    IntStream distinct();

    IntStream e0(L l10);

    C0404j findAny();

    C0404j findFirst();

    C0520t iterator();

    IntStream k(Z z10);

    IntStream limit(long j10);

    C0404j max();

    C0404j min();

    IntStream parallel();

    int r(int i10, H h10);

    boolean s(P p10);

    IntStream sequential();

    IntStream skip(long j10);

    IntStream sorted();

    j$.util.F spliterator();

    int sum();

    C0361f summaryStatistics();

    boolean t(P p10);

    int[] toArray();
}
