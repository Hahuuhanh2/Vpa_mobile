package j$.util.stream;

import j$.time.b;
import j$.util.C;
import j$.util.F;
import j$.util.I;
import j$.util.Spliterator;
import j$.util.function.C0375g0;
import j$.util.function.C0387m0;
import j$.util.function.C0388n;
import j$.util.function.C0394t;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.L;
import j$.util.function.P;
import j$.util.function.Predicate;

/* renamed from: j$.util.stream.v0  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0501v0 implements A3 {

    /* renamed from: a  reason: collision with root package name */
    private static final X0 f18910a = new X0();

    /* renamed from: b  reason: collision with root package name */
    private static final B0 f18911b = new V0();

    /* renamed from: c  reason: collision with root package name */
    private static final C0 f18912c = new W0();

    /* renamed from: d  reason: collision with root package name */
    private static final A0 f18913d = new U0();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18914e = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long[] f18915f = new long[0];
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final double[] f18916g = new double[0];

    public /* synthetic */ C0501v0() {
    }

    public /* synthetic */ C0501v0(int i10) {
    }

    public static void A0(A0 a02, Consumer consumer) {
        if (consumer instanceof C0388n) {
            a02.d((C0388n) consumer);
        } else if (!D3.f18597a) {
            ((C) a02.spliterator()).forEachRemaining(consumer);
        } else {
            D3.a(a02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void B0(B0 b02, Consumer consumer) {
        if (consumer instanceof L) {
            b02.d((L) consumer);
        } else if (!D3.f18597a) {
            ((F) b02.spliterator()).forEachRemaining(consumer);
        } else {
            D3.a(b02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void C0(C0 c02, Consumer consumer) {
        if (consumer instanceof C0375g0) {
            c02.d((C0375g0) consumer);
        } else if (!D3.f18597a) {
            ((I) c02.spliterator()).forEachRemaining(consumer);
        } else {
            D3.a(c02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static A0 D0(A0 a02, long j10, long j11) {
        if (j10 == 0 && j11 == a02.count()) {
            return a02;
        }
        long j12 = j11 - j10;
        C c10 = (C) a02.spliterator();
        C0505w0 V0 = V0(j12);
        V0.f(j12);
        for (int i10 = 0; ((long) i10) < j10 && c10.o(new i3(1)); i10++) {
        }
        for (int i11 = 0; ((long) i11) < j12 && c10.o(V0); i11++) {
        }
        V0.end();
        return V0.build();
    }

    public static B0 E0(B0 b02, long j10, long j11) {
        if (j10 == 0 && j11 == b02.count()) {
            return b02;
        }
        long j12 = j11 - j10;
        F f10 = (F) b02.spliterator();
        C0509x0 f12 = f1(j12);
        f12.f(j12);
        for (int i10 = 0; ((long) i10) < j10 && f10.j(new k3(1)); i10++) {
        }
        for (int i11 = 0; ((long) i11) < j12 && f10.j(f12); i11++) {
        }
        f12.end();
        return f12.build();
    }

    public static C0 F0(C0 c02, long j10, long j11) {
        if (j10 == 0 && j11 == c02.count()) {
            return c02;
        }
        long j12 = j11 - j10;
        I i10 = (I) c02.spliterator();
        C0513y0 h12 = h1(j12);
        h12.f(j12);
        for (int i11 = 0; ((long) i11) < j10 && i10.e(new m3(1)); i11++) {
        }
        for (int i12 = 0; ((long) i12) < j12 && i10.e(h12); i12++) {
        }
        h12.end();
        return h12.build();
    }

    public static E0 G0(E0 e02, long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == e02.count()) {
            return e02;
        }
        Spliterator spliterator = e02.spliterator();
        long j12 = j11 - j10;
        C0517z0 N0 = N0(j12, intFunction);
        N0.f(j12);
        for (int i10 = 0; ((long) i10) < j10 && spliterator.a(new G(13)); i10++) {
        }
        for (int i11 = 0; ((long) i11) < j12 && spliterator.a(N0); i11++) {
        }
        N0.end();
        return N0.build();
    }

    static long H0(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    static Spliterator I0(int i10, Spliterator spliterator, long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        int[] iArr = C0476o2.f18852a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return new p3(spliterator, j10, j13);
            }
            if (i11 == 2) {
                return new l3((F) spliterator, j10, j13);
            }
            if (i11 == 3) {
                return new n3((I) spliterator, j10, j13);
            }
            if (i11 == 4) {
                return new j3((C) spliterator, j10, j13);
            }
            StringBuilder b10 = b.b("Unknown shape ");
            b10.append(b.d(i10));
            throw new IllegalStateException(b10.toString());
        }
        throw null;
    }

    static long J0(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1, Math.min(j10 - j11, j12));
        }
        return -1;
    }

    static C0517z0 N0(long j10, IntFunction intFunction) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0486r1() : new Z0(j10, intFunction);
    }

    public static E0 O0(C0501v0 v0Var, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        long Y0 = v0Var.Y0(spliterator);
        if (Y0 < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e02 = (E0) new K0(spliterator, intFunction, v0Var).invoke();
            return z10 ? a1(e02, intFunction) : e02;
        } else if (Y0 < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) Y0);
            new C0479p1(spliterator, v0Var, objArr).invoke();
            return new H0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static A0 P0(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        long Y0 = v0Var.Y0(spliterator);
        if (Y0 < 0 || !spliterator.hasCharacteristics(16384)) {
            A0 a02 = (A0) new K0(0, spliterator, v0Var).invoke();
            return z10 ? b1(a02) : a02;
        } else if (Y0 < 2147483639) {
            double[] dArr = new double[((int) Y0)];
            new C0467m1(spliterator, v0Var, dArr).invoke();
            return new R0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static B0 Q0(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        long Y0 = v0Var.Y0(spliterator);
        if (Y0 < 0 || !spliterator.hasCharacteristics(16384)) {
            B0 b02 = (B0) new K0(1, spliterator, v0Var).invoke();
            return z10 ? c1(b02) : b02;
        } else if (Y0 < 2147483639) {
            int[] iArr = new int[((int) Y0)];
            new C0471n1(spliterator, v0Var, iArr).invoke();
            return new C0415a1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static C0 R0(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        long Y0 = v0Var.Y0(spliterator);
        if (Y0 < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c02 = (C0) new K0(2, spliterator, v0Var).invoke();
            return z10 ? d1(c02) : c02;
        } else if (Y0 < 2147483639) {
            long[] jArr = new long[((int) Y0)];
            new C0475o1(spliterator, v0Var, jArr).invoke();
            return new C0455j1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    static G0 S0(int i10, E0 e02, E0 e03) {
        int[] iArr = F0.f18605a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return new Q0(e02, e03);
            }
            if (i11 == 2) {
                return new N0((B0) e02, (B0) e03);
            }
            if (i11 == 3) {
                return new O0((C0) e02, (C0) e03);
            }
            if (i11 == 4) {
                return new M0((A0) e02, (A0) e03);
            }
            StringBuilder b10 = b.b("Unknown shape ");
            b10.append(b.d(i10));
            throw new IllegalStateException(b10.toString());
        }
        throw null;
    }

    static C0505w0 V0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new T0() : new S0(j10);
    }

    public static F W0(C c10) {
        return new C0516z(c10, T2.o(c10));
    }

    static Y0 X0(int i10) {
        Object obj;
        int[] iArr = F0.f18605a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return f18910a;
            }
            if (i11 == 2) {
                obj = f18911b;
            } else if (i11 == 3) {
                obj = f18912c;
            } else if (i11 == 4) {
                obj = f18913d;
            } else {
                StringBuilder b10 = b.b("Unknown shape ");
                b10.append(b.d(i10));
                throw new IllegalStateException(b10.toString());
            }
            return (Y0) obj;
        }
        throw null;
    }

    private static int Z0(long j10) {
        return (j10 != -1 ? T2.f18706u : 0) | T2.f18705t;
    }

    public static E0 a1(E0 e02, IntFunction intFunction) {
        if (e02.j() <= 0) {
            return e02;
        }
        long count = e02.count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            new C0494t1(e02, objArr).invoke();
            return new H0(objArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static A0 b1(A0 a02) {
        if (a02.j() <= 0) {
            return a02;
        }
        long count = a02.count();
        if (count < 2147483639) {
            double[] dArr = new double[((int) count)];
            new C0490s1(a02, dArr).invoke();
            return new R0(dArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static B0 c1(B0 b02) {
        if (b02.j() <= 0) {
            return b02;
        }
        long count = b02.count();
        if (count < 2147483639) {
            int[] iArr = new int[((int) count)];
            new C0490s1(b02, iArr).invoke();
            return new C0415a1(iArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static C0 d1(C0 c02) {
        if (c02.j() <= 0) {
            return c02;
        }
        long count = c02.count();
        if (count < 2147483639) {
            long[] jArr = new long[((int) count)];
            new C0490s1(c02, jArr).invoke();
            return new C0455j1(jArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    static C0509x0 f1(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0425c1() : new C0420b1(j10);
    }

    public static IntStream g1(F f10) {
        return new C0414a0(f10, T2.o(f10));
    }

    static C0513y0 h1(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0463l1() : new C0459k1(j10);
    }

    public static C0466m0 i1(I i10) {
        return new C0442g0(i10, T2.o(i10));
    }

    public static F j1(C0423c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0472n2(cVar, Z0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static C0493t0 k1(C0394t tVar, C0489s0 s0Var) {
        tVar.getClass();
        s0Var.getClass();
        return new C0493t0(4, s0Var, new C0469n(3, s0Var, tVar));
    }

    public static IntStream l1(C0423c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0456j2(cVar, Z0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static C0493t0 m1(P p10, C0489s0 s0Var) {
        p10.getClass();
        s0Var.getClass();
        return new C0493t0(2, s0Var, new C0469n(1, s0Var, p10));
    }

    public static void n0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C0466m0 n1(C0423c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0464l2(cVar, Z0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static void o0(C0426c2 c2Var, Double d10) {
        if (!D3.f18597a) {
            c2Var.accept(d10.doubleValue());
        } else {
            D3.a(c2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public static C0493t0 o1(C0387m0 m0Var, C0489s0 s0Var) {
        m0Var.getClass();
        s0Var.getClass();
        return new C0493t0(3, s0Var, new C0469n(4, s0Var, m0Var));
    }

    public static void q0(C0431d2 d2Var, Integer num) {
        if (!D3.f18597a) {
            d2Var.accept(num.intValue());
        } else {
            D3.a(d2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static C0493t0 q1(Predicate predicate, C0489s0 s0Var) {
        predicate.getClass();
        s0Var.getClass();
        return new C0493t0(1, s0Var, new C0469n(2, s0Var, predicate));
    }

    public static Stream r1(C0423c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0448h2(cVar, Z0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static void s0(C0436e2 e2Var, Long l10) {
        if (!D3.f18597a) {
            e2Var.accept(l10.longValue());
        } else {
            D3.a(e2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    public static Stream t1(Spliterator spliterator, boolean z10) {
        spliterator.getClass();
        return new U1(spliterator, T2.o(spliterator), z10);
    }

    public static void u0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void v0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] w0(D0 d02, IntFunction intFunction) {
        if (D3.f18597a) {
            D3.a(d02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (d02.count() < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) d02.count());
            d02.e(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static void x0(A0 a02, Double[] dArr, int i10) {
        if (!D3.f18597a) {
            double[] dArr2 = (double[]) a02.b();
            for (int i11 = 0; i11 < dArr2.length; i11++) {
                dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
            }
            return;
        }
        D3.a(a02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    public static void y0(B0 b02, Integer[] numArr, int i10) {
        if (!D3.f18597a) {
            int[] iArr = (int[]) b02.b();
            for (int i11 = 0; i11 < iArr.length; i11++) {
                numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
            }
            return;
        }
        D3.a(b02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    public static void z0(C0 c02, Long[] lArr, int i10) {
        if (!D3.f18597a) {
            long[] jArr = (long[]) c02.b();
            for (int i11 = 0; i11 < jArr.length; i11++) {
                lArr[i10 + i11] = Long.valueOf(jArr[i11]);
            }
            return;
        }
        D3.a(c02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    public /* synthetic */ int N() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public abstract void T0(Spliterator spliterator, C0440f2 f2Var);

    /* access modifiers changed from: package-private */
    public abstract void U0(Spliterator spliterator, C0440f2 f2Var);

    /* access modifiers changed from: package-private */
    public abstract long Y0(Spliterator spliterator);

    /* access modifiers changed from: package-private */
    public abstract int e1();

    public Object l0(C0501v0 v0Var, Spliterator spliterator) {
        O1 s12 = s1();
        v0Var.u1(spliterator, s12);
        return s12.get();
    }

    /* access modifiers changed from: package-private */
    public abstract C0517z0 p1(long j10, IntFunction intFunction);

    public abstract O1 s1();

    /* access modifiers changed from: package-private */
    public abstract C0440f2 u1(Spliterator spliterator, C0440f2 f2Var);

    /* access modifiers changed from: package-private */
    public abstract C0440f2 v1(C0440f2 f2Var);

    public Object w(C0501v0 v0Var, Spliterator spliterator) {
        return ((O1) new Q1(this, v0Var, spliterator).invoke()).get();
    }
}
