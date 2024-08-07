package j$.util.stream;

import j$.util.C0360e;
import j$.util.C0403i;
import j$.util.C0410p;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.C0380j;
import j$.util.function.C0388n;
import j$.util.function.C0392q;
import j$.util.function.C0394t;
import j$.util.function.C0397w;
import j$.util.function.C0400z;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import j$.util.function.z0;
import java.util.Set;

abstract class C extends C0423c implements F {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f18584s = 0;

    C(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    C(C0423c cVar, int i10) {
        super(cVar, i10);
    }

    /* access modifiers changed from: private */
    public static j$.util.C O1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.C) {
            return (j$.util.C) spliterator;
        }
        if (D3.f18597a) {
            D3.a(C0423c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1(j$.util.Spliterator r3, j$.util.stream.C0440f2 r4) {
        /*
            r2 = this;
            j$.util.C r3 = O1(r3)
            boolean r0 = r4 instanceof j$.util.function.C0388n
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.n r0 = (j$.util.function.C0388n) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = j$.util.stream.D3.f18597a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.s r0 = new j$.util.stream.s
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.h()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.o(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = j$.util.stream.C0423c.class
            java.lang.String r4 = "using DoubleStream.adapt(Sink<Double> s)"
            j$.util.stream.D3.a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C.A1(j$.util.Spliterator, j$.util.stream.f2):void");
    }

    public final IntStream B(C0397w wVar) {
        wVar.getClass();
        return new C0504w(this, T2.f18701p | T2.f18699n, wVar, 0);
    }

    /* access modifiers changed from: package-private */
    public final int B1() {
        return 4;
    }

    public void H(C0388n nVar) {
        nVar.getClass();
        x1(new O(nVar, false));
    }

    /* access modifiers changed from: package-private */
    public final Spliterator L1(C0501v0 v0Var, C0413a aVar, boolean z10) {
        return new C0432d3(v0Var, aVar, z10);
    }

    public final C0403i P(C0380j jVar) {
        jVar.getClass();
        return (C0403i) x1(new C0518z1(4, jVar, 0));
    }

    /* renamed from: P1 */
    public final F unordered() {
        return !D1() ? this : new C0512y(this, T2.f18703r, 0);
    }

    public final double S(double d10, C0380j jVar) {
        jVar.getClass();
        return ((Double) x1(new C0510x1(4, jVar, d10))).doubleValue();
    }

    public final boolean T(C0394t tVar) {
        return ((Boolean) x1(C0501v0.k1(tVar, C0489s0.NONE))).booleanValue();
    }

    public final boolean X(C0394t tVar) {
        return ((Boolean) x1(C0501v0.k1(tVar, C0489s0.ALL))).booleanValue();
    }

    public final C0403i average() {
        double[] dArr = (double[]) o(new C0418b(7), new C0418b(8), new C0418b(9));
        if (dArr[2] <= 0.0d) {
            return C0403i.a();
        }
        Set set = Collectors.f18590a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        if (Double.isNaN(d10) && Double.isInfinite(d11)) {
            d10 = d11;
        }
        return C0403i.d(d10 / dArr[2]);
    }

    public final F b(C0388n nVar) {
        nVar.getClass();
        return new C0496u(this, 0, nVar, 3);
    }

    public final Stream boxed() {
        return q(new J0(24));
    }

    public final long count() {
        return ((C0454j0) j(new C0418b(6))).sum();
    }

    public final F distinct() {
        return ((X1) ((X1) boxed()).distinct()).j0(new C0418b(10));
    }

    public final C0403i findAny() {
        return (C0403i) x1(new H(false, 4, C0403i.a(), new J0(27), new C0418b(12)));
    }

    public final C0403i findFirst() {
        return (C0403i) x1(new H(true, 4, C0403i.a(), new J0(27), new C0418b(12)));
    }

    public final F h(C0394t tVar) {
        tVar.getClass();
        return new C0496u(this, T2.f18705t, tVar, 2);
    }

    public final F i(C0392q qVar) {
        return new C0496u(this, T2.f18701p | T2.f18699n | T2.f18705t, qVar, 1);
    }

    public final C0410p iterator() {
        return Spliterators.f(spliterator());
    }

    public final C0466m0 j(C0400z zVar) {
        zVar.getClass();
        return new C0508x(this, T2.f18701p | T2.f18699n, zVar, 0);
    }

    public void k0(C0388n nVar) {
        nVar.getClass();
        x1(new O(nVar, true));
    }

    public final F limit(long j10) {
        if (j10 >= 0) {
            return C0501v0.j1(this, 0, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final C0403i max() {
        return P(new J0(23));
    }

    public final C0403i min() {
        return P(new J0(22));
    }

    public final Object o(K0 k02, z0 z0Var, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 0);
        k02.getClass();
        z0Var.getClass();
        return x1(new C0502v1(4, rVar, z0Var, k02, 1));
    }

    public final F p(j$.util.function.C c10) {
        c10.getClass();
        return new C0496u(this, T2.f18701p | T2.f18699n, c10, 0);
    }

    /* access modifiers changed from: package-private */
    public final C0517z0 p1(long j10, IntFunction intFunction) {
        return C0501v0.V0(j10);
    }

    public final Stream q(C0392q qVar) {
        qVar.getClass();
        return new C0500v(this, T2.f18701p | T2.f18699n, qVar, 0);
    }

    public final F skip(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : C0501v0.j1(this, j10, -1);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final F sorted() {
        return new C0511x2(this);
    }

    public final j$.util.C spliterator() {
        return O1(super.spliterator());
    }

    public final double sum() {
        double[] dArr = (double[]) o(new C0418b(11), new C0418b(4), new C0418b(5));
        Set set = Collectors.f18590a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (!Double.isNaN(d10) || !Double.isInfinite(d11)) ? d10 : d11;
    }

    public final C0360e summaryStatistics() {
        return (C0360e) o(new J0(14), new J0(25), new J0(26));
    }

    public final double[] toArray() {
        return (double[]) C0501v0.b1((A0) y1(new C0418b(3))).b();
    }

    public final boolean v(C0394t tVar) {
        return ((Boolean) x1(C0501v0.k1(tVar, C0489s0.ANY))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final E0 z1(C0501v0 v0Var, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return C0501v0.P0(v0Var, spliterator, z10);
    }
}
