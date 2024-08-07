package j$.util.stream;

import j$.util.C0361f;
import j$.util.C0403i;
import j$.util.C0404j;
import j$.util.C0520t;
import j$.util.F;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.C0;
import j$.util.function.H;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import j$.util.function.L;
import j$.util.function.P;
import j$.util.function.T;
import j$.util.function.W;
import j$.util.function.Z;

/* renamed from: j$.util.stream.d0  reason: case insensitive filesystem */
abstract class C0429d0 extends C0423c implements IntStream {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f18774s = 0;

    C0429d0(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    C0429d0(C0423c cVar, int i10) {
        super(cVar, i10);
    }

    /* access modifiers changed from: private */
    public static F O1(Spliterator spliterator) {
        if (spliterator instanceof F) {
            return (F) spliterator;
        }
        if (D3.f18597a) {
            D3.a(C0423c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    public final Object A(K0 k02, C0 c02, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 1);
        k02.getClass();
        c02.getClass();
        return x1(new C0502v1(2, rVar, c02, k02, 4));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1(j$.util.Spliterator r3, j$.util.stream.C0440f2 r4) {
        /*
            r2 = this;
            j$.util.F r3 = O1(r3)
            boolean r0 = r4 instanceof j$.util.function.L
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.L r0 = (j$.util.function.L) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = j$.util.stream.D3.f18597a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.W r0 = new j$.util.stream.W
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.h()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.j(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = j$.util.stream.C0423c.class
            java.lang.String r4 = "using IntStream.adapt(Sink<Integer> s)"
            j$.util.stream.D3.a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0429d0.A1(j$.util.Spliterator, j$.util.stream.f2):void");
    }

    /* access modifiers changed from: package-private */
    public final int B1() {
        return 2;
    }

    public final boolean D(P p10) {
        return ((Boolean) x1(C0501v0.m1(p10, C0489s0.ANY))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final Spliterator L1(C0501v0 v0Var, C0413a aVar, boolean z10) {
        return new f3(v0Var, aVar, z10);
    }

    /* renamed from: P1 */
    public final IntStream unordered() {
        return !D1() ? this : new Z(this, T2.f18703r);
    }

    public void Q(L l10) {
        l10.getClass();
        x1(new P(l10, true));
    }

    public final Stream R(IntFunction intFunction) {
        intFunction.getClass();
        return new C0500v(this, T2.f18701p | T2.f18699n, intFunction, 1);
    }

    public final IntStream U(IntFunction intFunction) {
        return new C0504w(this, T2.f18701p | T2.f18699n | T2.f18705t, intFunction, 3);
    }

    public void Y(L l10) {
        l10.getClass();
        x1(new P(l10, false));
    }

    public final F Z(T t10) {
        t10.getClass();
        return new C0496u(this, T2.f18701p | T2.f18699n, t10, 4);
    }

    public final F asDoubleStream() {
        return new C0512y(this, T2.f18701p | T2.f18699n, 1);
    }

    public final C0466m0 asLongStream() {
        return new Y(this, T2.f18701p | T2.f18699n, 0);
    }

    public final C0403i average() {
        long[] jArr = (long[]) A(new C0418b(19), new C0418b(20), new C0418b(21));
        long j10 = jArr[0];
        return j10 > 0 ? C0403i.d(((double) jArr[1]) / ((double) j10)) : C0403i.a();
    }

    public final Stream boxed() {
        return R(new G(5));
    }

    public final IntStream c0(P p10) {
        p10.getClass();
        return new C0504w(this, T2.f18705t, p10, 4);
    }

    public final long count() {
        return ((C0454j0) d(new C0418b(18))).sum();
    }

    public final C0466m0 d(W w9) {
        w9.getClass();
        return new C0508x(this, T2.f18701p | T2.f18699n, w9, 1);
    }

    public final C0404j d0(H h10) {
        h10.getClass();
        return (C0404j) x1(new C0518z1(2, h10, 2));
    }

    public final IntStream distinct() {
        return ((X1) ((X1) boxed()).distinct()).I(new C0418b(17));
    }

    public final IntStream e0(L l10) {
        l10.getClass();
        return new C0504w(this, 0, l10, 1);
    }

    public final C0404j findAny() {
        return (C0404j) x1(new H(false, 2, C0404j.a(), new G(0), new C0418b(15)));
    }

    public final C0404j findFirst() {
        return (C0404j) x1(new H(true, 2, C0404j.a(), new G(0), new C0418b(15)));
    }

    public final C0520t iterator() {
        return Spliterators.g(spliterator());
    }

    public final IntStream k(Z z10) {
        z10.getClass();
        return new C0504w(this, T2.f18701p | T2.f18699n, z10, 2);
    }

    public final IntStream limit(long j10) {
        if (j10 >= 0) {
            return C0501v0.l1(this, 0, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final C0404j max() {
        return d0(new G(6));
    }

    public final C0404j min() {
        return d0(new G(1));
    }

    /* access modifiers changed from: package-private */
    public final C0517z0 p1(long j10, IntFunction intFunction) {
        return C0501v0.f1(j10);
    }

    public final int r(int i10, H h10) {
        h10.getClass();
        return ((Integer) x1(new H1(2, h10, i10))).intValue();
    }

    public final boolean s(P p10) {
        return ((Boolean) x1(C0501v0.m1(p10, C0489s0.ALL))).booleanValue();
    }

    public final IntStream skip(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : C0501v0.l1(this, j10, -1);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final IntStream sorted() {
        return new C0515y2(this);
    }

    public final F spliterator() {
        return O1(super.spliterator());
    }

    public final int sum() {
        return r(0, new G(2));
    }

    public final C0361f summaryStatistics() {
        return (C0361f) A(new J0(15), new G(3), new G(4));
    }

    public final boolean t(P p10) {
        return ((Boolean) x1(C0501v0.m1(p10, C0489s0.NONE))).booleanValue();
    }

    public final int[] toArray() {
        return (int[]) C0501v0.c1((B0) y1(new C0418b(22))).b();
    }

    /* access modifiers changed from: package-private */
    public final E0 z1(C0501v0 v0Var, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return C0501v0.Q0(v0Var, spliterator, z10);
    }
}
