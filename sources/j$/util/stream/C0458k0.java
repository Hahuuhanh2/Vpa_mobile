package j$.util.stream;

import j$.util.C0401g;
import j$.util.C0402h;
import j$.util.C0403i;
import j$.util.C0405k;
import j$.util.function.BiConsumer;
import j$.util.function.C0362a;
import j$.util.function.C0365b0;
import j$.util.function.C0367c0;
import j$.util.function.C0373f0;
import j$.util.function.C0375g0;
import j$.util.function.C0379i0;
import j$.util.function.C0381j0;
import j$.util.function.C0385l0;
import j$.util.function.C0387m0;
import j$.util.function.E0;
import j$.util.function.F0;
import j$.util.function.J0;
import j$.util.function.K0;
import j$.util.function.o0;
import j$.util.function.p0;
import j$.util.function.r0;
import j$.util.function.s0;
import j$.util.function.v0;
import j$.util.function.w0;
import j$.util.stream.IntStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.k0  reason: case insensitive filesystem */
public final /* synthetic */ class C0458k0 implements C0466m0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongStream f18818a;

    private /* synthetic */ C0458k0(LongStream longStream) {
        this.f18818a = longStream;
    }

    public static /* synthetic */ C0466m0 w(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0462l0 ? ((C0462l0) longStream).f18824a : new C0458k0(longStream);
    }

    public final /* synthetic */ void E(C0375g0 g0Var) {
        this.f18818a.forEach(C0373f0.a(g0Var));
    }

    public final /* synthetic */ F K(p0 p0Var) {
        return D.w(this.f18818a.mapToDouble(o0.a(p0Var)));
    }

    public final /* synthetic */ C0466m0 O(w0 w0Var) {
        return w(this.f18818a.map(v0.a(w0Var)));
    }

    public final /* synthetic */ IntStream V(s0 s0Var) {
        return IntStream.VivifiedWrapper.convert(this.f18818a.mapToInt(r0.a(s0Var)));
    }

    public final /* synthetic */ Stream W(C0381j0 j0Var) {
        return Q2.w(this.f18818a.mapToObj(C0379i0.a(j0Var)));
    }

    public final /* synthetic */ boolean a(C0387m0 m0Var) {
        return this.f18818a.noneMatch(C0385l0.a(m0Var));
    }

    public final /* synthetic */ F asDoubleStream() {
        return D.w(this.f18818a.asDoubleStream());
    }

    public final /* synthetic */ C0403i average() {
        return C0402h.b(this.f18818a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return Q2.w(this.f18818a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f18818a.close();
    }

    public final /* synthetic */ long count() {
        return this.f18818a.count();
    }

    public final /* synthetic */ C0466m0 distinct() {
        return w(this.f18818a.distinct());
    }

    public final /* synthetic */ C0405k e(C0367c0 c0Var) {
        return C0402h.d(this.f18818a.reduce(C0365b0.a(c0Var)));
    }

    public final /* synthetic */ C0466m0 f(C0375g0 g0Var) {
        return w(this.f18818a.peek(C0373f0.a(g0Var)));
    }

    public final /* synthetic */ boolean f0(C0387m0 m0Var) {
        return this.f18818a.anyMatch(C0385l0.a(m0Var));
    }

    public final /* synthetic */ C0405k findAny() {
        return C0402h.d(this.f18818a.findAny());
    }

    public final /* synthetic */ C0405k findFirst() {
        return C0402h.d(this.f18818a.findFirst());
    }

    public final /* synthetic */ C0466m0 g(C0381j0 j0Var) {
        return w(this.f18818a.flatMap(C0379i0.a(j0Var)));
    }

    public final /* synthetic */ C0466m0 i0(C0387m0 m0Var) {
        return w(this.f18818a.filter(C0385l0.a(m0Var)));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f18818a.isParallel();
    }

    public final /* synthetic */ C0466m0 limit(long j10) {
        return w(this.f18818a.limit(j10));
    }

    public final /* synthetic */ long m(long j10, C0367c0 c0Var) {
        return this.f18818a.reduce(j10, C0365b0.a(c0Var));
    }

    public final /* synthetic */ C0405k max() {
        return C0402h.d(this.f18818a.max());
    }

    public final /* synthetic */ C0405k min() {
        return C0402h.d(this.f18818a.min());
    }

    public final /* synthetic */ C0449i onClose(Runnable runnable) {
        return C0441g.w(this.f18818a.onClose(runnable));
    }

    public final /* synthetic */ C0466m0 skip(long j10) {
        return w(this.f18818a.skip(j10));
    }

    public final /* synthetic */ C0466m0 sorted() {
        return w(this.f18818a.sorted());
    }

    public final /* synthetic */ long sum() {
        return this.f18818a.sum();
    }

    public final C0401g summaryStatistics() {
        this.f18818a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    public final /* synthetic */ long[] toArray() {
        return this.f18818a.toArray();
    }

    public final /* synthetic */ C0449i unordered() {
        return C0441g.w(this.f18818a.unordered());
    }

    public final /* synthetic */ void x(C0375g0 g0Var) {
        this.f18818a.forEachOrdered(C0373f0.a(g0Var));
    }

    public final /* synthetic */ Object y(K0 k02, F0 f02, BiConsumer biConsumer) {
        return this.f18818a.collect(J0.a(k02), E0.a(f02), C0362a.a(biConsumer));
    }

    public final /* synthetic */ boolean z(C0387m0 m0Var) {
        return this.f18818a.allMatch(C0385l0.a(m0Var));
    }
}
