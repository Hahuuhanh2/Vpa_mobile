package j$.util.stream;

import j$.util.C0402h;
import j$.util.function.A;
import j$.util.function.BiConsumer;
import j$.util.function.C0376h;
import j$.util.function.C0384l;
import j$.util.function.C0390o;
import j$.util.function.C0395u;
import j$.util.function.C0398x;
import j$.util.function.I0;
import j$.util.function.r;
import j$.util.function.x0;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final /* synthetic */ class E implements DoubleStream {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ F f18598a;

    private /* synthetic */ E(F f10) {
        this.f18598a = f10;
    }

    public static /* synthetic */ DoubleStream w(F f10) {
        if (f10 == null) {
            return null;
        }
        return f10 instanceof D ? ((D) f10).f18591a : new E(f10);
    }

    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.f18598a.X(r.b(doublePredicate));
    }

    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.f18598a.v(r.b(doublePredicate));
    }

    public final /* synthetic */ OptionalDouble average() {
        return C0402h.f(this.f18598a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f18598a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f18598a.close();
    }

    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f18598a.o(I0.a(supplier), x0.a(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ long count() {
        return this.f18598a.count();
    }

    public final /* synthetic */ DoubleStream distinct() {
        return w(this.f18598a.distinct());
    }

    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return w(this.f18598a.h(r.b(doublePredicate)));
    }

    public final /* synthetic */ OptionalDouble findAny() {
        return C0402h.f(this.f18598a.findAny());
    }

    public final /* synthetic */ OptionalDouble findFirst() {
        return C0402h.f(this.f18598a.findFirst());
    }

    public final /* synthetic */ DoubleStream flatMap(DoubleFunction doubleFunction) {
        return w(this.f18598a.i(C0390o.a(doubleFunction)));
    }

    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f18598a.H(C0384l.a(doubleConsumer));
    }

    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f18598a.k0(C0384l.a(doubleConsumer));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f18598a.isParallel();
    }

    public final /* synthetic */ DoubleStream limit(long j10) {
        return w(this.f18598a.limit(j10));
    }

    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return w(this.f18598a.p(A.d(doubleUnaryOperator)));
    }

    public final /* synthetic */ IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return IntStream.Wrapper.convert(this.f18598a.B(C0395u.b(doubleToIntFunction)));
    }

    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C0462l0.w(this.f18598a.j(C0398x.a(doubleToLongFunction)));
    }

    public final /* synthetic */ java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.Wrapper.convert(this.f18598a.q(C0390o.a(doubleFunction)));
    }

    public final /* synthetic */ OptionalDouble max() {
        return C0402h.f(this.f18598a.max());
    }

    public final /* synthetic */ OptionalDouble min() {
        return C0402h.f(this.f18598a.min());
    }

    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.f18598a.T(r.b(doublePredicate));
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0445h.w(this.f18598a.onClose(runnable));
    }

    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return w(this.f18598a.b(C0384l.a(doubleConsumer)));
    }

    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f18598a.S(d10, C0376h.a(doubleBinaryOperator));
    }

    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return C0402h.f(this.f18598a.P(C0376h.a(doubleBinaryOperator)));
    }

    public final /* synthetic */ DoubleStream skip(long j10) {
        return w(this.f18598a.skip(j10));
    }

    public final /* synthetic */ DoubleStream sorted() {
        return w(this.f18598a.sorted());
    }

    public final /* synthetic */ double sum() {
        return this.f18598a.sum();
    }

    public final DoubleSummaryStatistics summaryStatistics() {
        this.f18598a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    public final /* synthetic */ double[] toArray() {
        return this.f18598a.toArray();
    }

    public final /* synthetic */ BaseStream unordered() {
        return C0445h.w(this.f18598a.unordered());
    }
}
