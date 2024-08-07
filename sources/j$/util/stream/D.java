package j$.util.stream;

import j$.util.C0360e;
import j$.util.C0402h;
import j$.util.C0403i;
import j$.util.function.B;
import j$.util.function.BiConsumer;
import j$.util.function.C;
import j$.util.function.C0362a;
import j$.util.function.C0378i;
import j$.util.function.C0380j;
import j$.util.function.C0386m;
import j$.util.function.C0388n;
import j$.util.function.C0391p;
import j$.util.function.C0392q;
import j$.util.function.C0393s;
import j$.util.function.C0394t;
import j$.util.function.C0396v;
import j$.util.function.C0397w;
import j$.util.function.C0399y;
import j$.util.function.C0400z;
import j$.util.function.J0;
import j$.util.function.K0;
import j$.util.function.y0;
import j$.util.function.z0;
import j$.util.stream.IntStream;
import java.util.stream.DoubleStream;

public final /* synthetic */ class D implements F {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleStream f18591a;

    private /* synthetic */ D(DoubleStream doubleStream) {
        this.f18591a = doubleStream;
    }

    public static /* synthetic */ F w(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof E ? ((E) doubleStream).f18598a : new D(doubleStream);
    }

    public final /* synthetic */ IntStream B(C0397w wVar) {
        return IntStream.VivifiedWrapper.convert(this.f18591a.mapToInt(C0396v.a(wVar)));
    }

    public final /* synthetic */ void H(C0388n nVar) {
        this.f18591a.forEach(C0386m.a(nVar));
    }

    public final /* synthetic */ C0403i P(C0380j jVar) {
        return C0402h.b(this.f18591a.reduce(C0378i.a(jVar)));
    }

    public final /* synthetic */ double S(double d10, C0380j jVar) {
        return this.f18591a.reduce(d10, C0378i.a(jVar));
    }

    public final /* synthetic */ boolean T(C0394t tVar) {
        return this.f18591a.noneMatch(C0393s.a(tVar));
    }

    public final /* synthetic */ boolean X(C0394t tVar) {
        return this.f18591a.allMatch(C0393s.a(tVar));
    }

    public final /* synthetic */ C0403i average() {
        return C0402h.b(this.f18591a.average());
    }

    public final /* synthetic */ F b(C0388n nVar) {
        return w(this.f18591a.peek(C0386m.a(nVar)));
    }

    public final /* synthetic */ Stream boxed() {
        return Q2.w(this.f18591a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f18591a.close();
    }

    public final /* synthetic */ long count() {
        return this.f18591a.count();
    }

    public final /* synthetic */ F distinct() {
        return w(this.f18591a.distinct());
    }

    public final /* synthetic */ C0403i findAny() {
        return C0402h.b(this.f18591a.findAny());
    }

    public final /* synthetic */ C0403i findFirst() {
        return C0402h.b(this.f18591a.findFirst());
    }

    public final /* synthetic */ F h(C0394t tVar) {
        return w(this.f18591a.filter(C0393s.a(tVar)));
    }

    public final /* synthetic */ F i(C0392q qVar) {
        return w(this.f18591a.flatMap(C0391p.a(qVar)));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f18591a.isParallel();
    }

    public final /* synthetic */ C0466m0 j(C0400z zVar) {
        return C0458k0.w(this.f18591a.mapToLong(C0399y.a(zVar)));
    }

    public final /* synthetic */ void k0(C0388n nVar) {
        this.f18591a.forEachOrdered(C0386m.a(nVar));
    }

    public final /* synthetic */ F limit(long j10) {
        return w(this.f18591a.limit(j10));
    }

    public final /* synthetic */ C0403i max() {
        return C0402h.b(this.f18591a.max());
    }

    public final /* synthetic */ C0403i min() {
        return C0402h.b(this.f18591a.min());
    }

    public final /* synthetic */ Object o(K0 k02, z0 z0Var, BiConsumer biConsumer) {
        return this.f18591a.collect(J0.a(k02), y0.a(z0Var), C0362a.a(biConsumer));
    }

    public final /* synthetic */ C0449i onClose(Runnable runnable) {
        return C0441g.w(this.f18591a.onClose(runnable));
    }

    public final /* synthetic */ F p(C c10) {
        return w(this.f18591a.map(B.a(c10)));
    }

    public final /* synthetic */ Stream q(C0392q qVar) {
        return Q2.w(this.f18591a.mapToObj(C0391p.a(qVar)));
    }

    public final /* synthetic */ F skip(long j10) {
        return w(this.f18591a.skip(j10));
    }

    public final /* synthetic */ F sorted() {
        return w(this.f18591a.sorted());
    }

    public final /* synthetic */ double sum() {
        return this.f18591a.sum();
    }

    public final C0360e summaryStatistics() {
        this.f18591a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    public final /* synthetic */ double[] toArray() {
        return this.f18591a.toArray();
    }

    public final /* synthetic */ C0449i unordered() {
        return C0441g.w(this.f18591a.unordered());
    }

    public final /* synthetic */ boolean v(C0394t tVar) {
        return this.f18591a.anyMatch(C0393s.a(tVar));
    }
}
