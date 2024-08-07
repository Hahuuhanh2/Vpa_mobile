package j$.util.stream;

import j$.util.C0402h;
import j$.util.function.BiConsumer;
import j$.util.function.C0363a0;
import j$.util.function.C0371e0;
import j$.util.function.C0377h0;
import j$.util.function.C0383k0;
import j$.util.function.C0389n0;
import j$.util.function.D0;
import j$.util.function.I0;
import j$.util.function.q0;
import j$.util.function.u0;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* renamed from: j$.util.stream.l0  reason: case insensitive filesystem */
public final /* synthetic */ class C0462l0 implements LongStream {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0466m0 f18824a;

    private /* synthetic */ C0462l0(C0466m0 m0Var) {
        this.f18824a = m0Var;
    }

    public static /* synthetic */ LongStream w(C0466m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        return m0Var instanceof C0458k0 ? ((C0458k0) m0Var).f18818a : new C0462l0(m0Var);
    }

    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f18824a.z(C0383k0.b(longPredicate));
    }

    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f18824a.f0(C0383k0.b(longPredicate));
    }

    public final /* synthetic */ DoubleStream asDoubleStream() {
        return E.w(this.f18824a.asDoubleStream());
    }

    public final /* synthetic */ OptionalDouble average() {
        return C0402h.f(this.f18824a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return Stream.Wrapper.convert(this.f18824a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f18824a.close();
    }

    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f18824a.y(I0.a(supplier), D0.a(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ long count() {
        return this.f18824a.count();
    }

    public final /* synthetic */ LongStream distinct() {
        return w(this.f18824a.distinct());
    }

    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return w(this.f18824a.i0(C0383k0.b(longPredicate)));
    }

    public final /* synthetic */ OptionalLong findAny() {
        return C0402h.h(this.f18824a.findAny());
    }

    public final /* synthetic */ OptionalLong findFirst() {
        return C0402h.h(this.f18824a.findFirst());
    }

    public final /* synthetic */ LongStream flatMap(LongFunction longFunction) {
        return w(this.f18824a.g(C0377h0.a(longFunction)));
    }

    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f18824a.E(C0371e0.a(longConsumer));
    }

    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f18824a.x(C0371e0.a(longConsumer));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f18824a.isParallel();
    }

    public final /* synthetic */ LongStream limit(long j10) {
        return w(this.f18824a.limit(j10));
    }

    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return w(this.f18824a.O(u0.a(longUnaryOperator)));
    }

    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return E.w(this.f18824a.K(C0389n0.b(longToDoubleFunction)));
    }

    public final /* synthetic */ IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return IntStream.Wrapper.convert(this.f18824a.V(q0.b(longToIntFunction)));
    }

    public final /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return Stream.Wrapper.convert(this.f18824a.W(C0377h0.a(longFunction)));
    }

    public final /* synthetic */ OptionalLong max() {
        return C0402h.h(this.f18824a.max());
    }

    public final /* synthetic */ OptionalLong min() {
        return C0402h.h(this.f18824a.min());
    }

    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f18824a.a(C0383k0.b(longPredicate));
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0445h.w(this.f18824a.onClose(runnable));
    }

    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return w(this.f18824a.f(C0371e0.a(longConsumer)));
    }

    public final /* synthetic */ long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return this.f18824a.m(j10, C0363a0.a(longBinaryOperator));
    }

    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return C0402h.h(this.f18824a.e(C0363a0.a(longBinaryOperator)));
    }

    public final /* synthetic */ LongStream skip(long j10) {
        return w(this.f18824a.skip(j10));
    }

    public final /* synthetic */ LongStream sorted() {
        return w(this.f18824a.sorted());
    }

    public final /* synthetic */ long sum() {
        return this.f18824a.sum();
    }

    public final LongSummaryStatistics summaryStatistics() {
        this.f18824a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    public final /* synthetic */ long[] toArray() {
        return this.f18824a.toArray();
    }

    public final /* synthetic */ BaseStream unordered() {
        return C0445h.w(this.f18824a.unordered());
    }
}
