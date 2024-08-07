package j$.util.stream;

import j$.util.C0401g;
import j$.util.C0403i;
import j$.util.C0405k;
import j$.util.C0524x;
import j$.util.I;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.C0367c0;
import j$.util.function.C0375g0;
import j$.util.function.C0381j0;
import j$.util.function.C0387m0;
import j$.util.function.F0;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import j$.util.function.p0;
import j$.util.function.s0;
import j$.util.function.w0;

/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
abstract class C0454j0 extends C0423c implements C0466m0 {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f18811s = 0;

    C0454j0(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    C0454j0(C0423c cVar, int i10) {
        super(cVar, i10);
    }

    /* access modifiers changed from: private */
    public static I O1(Spliterator spliterator) {
        if (spliterator instanceof I) {
            return (I) spliterator;
        }
        if (D3.f18597a) {
            D3.a(C0423c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1(j$.util.Spliterator r3, j$.util.stream.C0440f2 r4) {
        /*
            r2 = this;
            j$.util.I r3 = O1(r3)
            boolean r0 = r4 instanceof j$.util.function.C0375g0
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.g0 r0 = (j$.util.function.C0375g0) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = j$.util.stream.D3.f18597a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.e0 r0 = new j$.util.stream.e0
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.h()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.e(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = j$.util.stream.C0423c.class
            java.lang.String r4 = "using LongStream.adapt(Sink<Long> s)"
            j$.util.stream.D3.a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0454j0.A1(j$.util.Spliterator, j$.util.stream.f2):void");
    }

    /* access modifiers changed from: package-private */
    public final int B1() {
        return 3;
    }

    public void E(C0375g0 g0Var) {
        g0Var.getClass();
        x1(new Q(g0Var, false));
    }

    public final F K(p0 p0Var) {
        p0Var.getClass();
        return new C0496u(this, T2.f18701p | T2.f18699n, p0Var, 5);
    }

    /* access modifiers changed from: package-private */
    public final Spliterator L1(C0501v0 v0Var, C0413a aVar, boolean z10) {
        return new h3(v0Var, aVar, z10);
    }

    public final C0466m0 O(w0 w0Var) {
        w0Var.getClass();
        return new C0508x(this, T2.f18701p | T2.f18699n, w0Var, 2);
    }

    /* renamed from: P1 */
    public final C0466m0 unordered() {
        return !D1() ? this : new Y(this, T2.f18703r, 1);
    }

    public final IntStream V(s0 s0Var) {
        s0Var.getClass();
        return new C0504w(this, T2.f18701p | T2.f18699n, s0Var, 5);
    }

    public final Stream W(C0381j0 j0Var) {
        j0Var.getClass();
        return new C0500v(this, T2.f18701p | T2.f18699n, j0Var, 2);
    }

    public final boolean a(C0387m0 m0Var) {
        return ((Boolean) x1(C0501v0.o1(m0Var, C0489s0.NONE))).booleanValue();
    }

    public final F asDoubleStream() {
        return new C0512y(this, T2.f18701p | T2.f18699n, 2);
    }

    public final C0403i average() {
        long[] jArr = (long[]) y(new C0418b(26), new C0418b(27), new C0418b(28));
        long j10 = jArr[0];
        return j10 > 0 ? C0403i.d(((double) jArr[1]) / ((double) j10)) : C0403i.a();
    }

    public final Stream boxed() {
        return W(new G(9));
    }

    public final long count() {
        return ((C0454j0) O(new C0418b(23))).sum();
    }

    public final C0466m0 distinct() {
        return ((X1) ((X1) boxed()).distinct()).h0(new C0418b(24));
    }

    public final C0405k e(C0367c0 c0Var) {
        c0Var.getClass();
        return (C0405k) x1(new C0518z1(3, c0Var, 3));
    }

    public final C0466m0 f(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0508x(this, 0, g0Var, 5);
    }

    public final boolean f0(C0387m0 m0Var) {
        return ((Boolean) x1(C0501v0.o1(m0Var, C0489s0.ANY))).booleanValue();
    }

    public final C0405k findAny() {
        return (C0405k) x1(new H(false, 3, C0405k.a(), new J0(28), new C0418b(13)));
    }

    public final C0405k findFirst() {
        return (C0405k) x1(new H(true, 3, C0405k.a(), new J0(28), new C0418b(13)));
    }

    public final C0466m0 g(C0381j0 j0Var) {
        return new C0508x(this, T2.f18701p | T2.f18699n | T2.f18705t, j0Var, 3);
    }

    public final C0466m0 i0(C0387m0 m0Var) {
        m0Var.getClass();
        return new C0508x(this, T2.f18705t, m0Var, 4);
    }

    public final C0524x iterator() {
        return Spliterators.h(spliterator());
    }

    public final C0466m0 limit(long j10) {
        if (j10 >= 0) {
            return C0501v0.n1(this, 0, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final long m(long j10, C0367c0 c0Var) {
        c0Var.getClass();
        return ((Long) x1(new L1(3, c0Var, j10))).longValue();
    }

    public final C0405k max() {
        return e(new G(8));
    }

    public final C0405k min() {
        return e(new G(7));
    }

    /* access modifiers changed from: package-private */
    public final C0517z0 p1(long j10, IntFunction intFunction) {
        return C0501v0.h1(j10);
    }

    public final C0466m0 skip(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : C0501v0.n1(this, j10, -1);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final C0466m0 sorted() {
        return new C0519z2(this);
    }

    public final I spliterator() {
        return O1(super.spliterator());
    }

    public final long sum() {
        return m(0, new G(10));
    }

    public final C0401g summaryStatistics() {
        return (C0401g) y(new J0(18), new G(11), new G(12));
    }

    public final long[] toArray() {
        return (long[]) C0501v0.d1((C0) y1(new C0418b(25))).b();
    }

    public void x(C0375g0 g0Var) {
        g0Var.getClass();
        x1(new Q(g0Var, true));
    }

    public final Object y(K0 k02, F0 f02, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 2);
        k02.getClass();
        f02.getClass();
        return x1(new C0502v1(3, rVar, f02, k02, 0));
    }

    public final boolean z(C0387m0 m0Var) {
        return ((Boolean) x1(C0501v0.o1(m0Var, C0489s0.ALL))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final E0 z1(C0501v0 v0Var, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return C0501v0.R0(v0Var, spliterator, z10);
    }
}
