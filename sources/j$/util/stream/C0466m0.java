package j$.util.stream;

import j$.util.C0401g;
import j$.util.C0403i;
import j$.util.C0405k;
import j$.util.C0524x;
import j$.util.I;
import j$.util.function.BiConsumer;
import j$.util.function.C0367c0;
import j$.util.function.C0375g0;
import j$.util.function.C0381j0;
import j$.util.function.C0387m0;
import j$.util.function.F0;
import j$.util.function.K0;
import j$.util.function.p0;
import j$.util.function.s0;
import j$.util.function.w0;

/* renamed from: j$.util.stream.m0  reason: case insensitive filesystem */
public interface C0466m0 extends C0449i {
    void E(C0375g0 g0Var);

    F K(p0 p0Var);

    C0466m0 O(w0 w0Var);

    IntStream V(s0 s0Var);

    Stream W(C0381j0 j0Var);

    boolean a(C0387m0 m0Var);

    F asDoubleStream();

    C0403i average();

    Stream boxed();

    long count();

    C0466m0 distinct();

    C0405k e(C0367c0 c0Var);

    C0466m0 f(C0375g0 g0Var);

    boolean f0(C0387m0 m0Var);

    C0405k findAny();

    C0405k findFirst();

    C0466m0 g(C0381j0 j0Var);

    C0466m0 i0(C0387m0 m0Var);

    C0524x iterator();

    C0466m0 limit(long j10);

    long m(long j10, C0367c0 c0Var);

    C0405k max();

    C0405k min();

    C0466m0 parallel();

    C0466m0 sequential();

    C0466m0 skip(long j10);

    C0466m0 sorted();

    I spliterator();

    long sum();

    C0401g summaryStatistics();

    long[] toArray();

    void x(C0375g0 g0Var);

    Object y(K0 k02, F0 f02, BiConsumer biConsumer);

    boolean z(C0387m0 m0Var);
}
