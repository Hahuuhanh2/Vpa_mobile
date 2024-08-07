package j$.util.stream;

import j$.util.C0360e;
import j$.util.C0403i;
import j$.util.C0410p;
import j$.util.function.BiConsumer;
import j$.util.function.C;
import j$.util.function.C0380j;
import j$.util.function.C0388n;
import j$.util.function.C0392q;
import j$.util.function.C0394t;
import j$.util.function.C0397w;
import j$.util.function.C0400z;
import j$.util.function.K0;
import j$.util.function.z0;

public interface F extends C0449i {
    IntStream B(C0397w wVar);

    void H(C0388n nVar);

    C0403i P(C0380j jVar);

    double S(double d10, C0380j jVar);

    boolean T(C0394t tVar);

    boolean X(C0394t tVar);

    C0403i average();

    F b(C0388n nVar);

    Stream boxed();

    long count();

    F distinct();

    C0403i findAny();

    C0403i findFirst();

    F h(C0394t tVar);

    F i(C0392q qVar);

    C0410p iterator();

    C0466m0 j(C0400z zVar);

    void k0(C0388n nVar);

    F limit(long j10);

    C0403i max();

    C0403i min();

    Object o(K0 k02, z0 z0Var, BiConsumer biConsumer);

    F p(C c10);

    F parallel();

    Stream q(C0392q qVar);

    F sequential();

    F skip(long j10);

    F sorted();

    j$.util.C spliterator();

    double sum();

    C0360e summaryStatistics();

    double[] toArray();

    boolean v(C0394t tVar);
}
