package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0366c;
import j$.util.function.C0372f;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;
import java.util.Iterator;

abstract class X1 extends C0423c implements Stream {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f18740s = 0;

    X1(Spliterator spliterator, int i10, boolean z10) {
        super(spliterator, i10, z10);
    }

    X1(C0423c cVar, int i10) {
        super(cVar, i10);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1(j$.util.Spliterator r2, j$.util.stream.C0440f2 r3) {
        /*
            r1 = this;
        L_0x0000:
            boolean r0 = r3.h()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.a(r3)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.X1.A1(j$.util.Spliterator, j$.util.stream.f2):void");
    }

    /* access modifiers changed from: package-private */
    public final int B1() {
        return 1;
    }

    public final boolean C(Predicate predicate) {
        return ((Boolean) x1(C0501v0.q1(predicate, C0489s0.ANY))).booleanValue();
    }

    public void F(Consumer consumer) {
        consumer.getClass();
        x1(new S(consumer, true));
    }

    public final Object G(K0 k02, BiConsumer biConsumer, BiConsumer biConsumer2) {
        k02.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return x1(new C0502v1(1, biConsumer2, biConsumer, k02, 3));
    }

    public final IntStream I(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C0504w(this, T2.f18701p | T2.f18699n, toIntFunction, 6);
    }

    public final Stream J(Function function) {
        function.getClass();
        return new T1(this, T2.f18701p | T2.f18699n, function, 0);
    }

    public final Stream L(Function function) {
        function.getClass();
        return new T1(this, T2.f18701p | T2.f18699n | T2.f18705t, function, 1);
    }

    /* access modifiers changed from: package-private */
    public final Spliterator L1(C0501v0 v0Var, C0413a aVar, boolean z10) {
        return new y3(v0Var, aVar, z10);
    }

    public final Optional M(C0372f fVar) {
        fVar.getClass();
        return (Optional) x1(new C0518z1(1, fVar, 1));
    }

    /* renamed from: N1 */
    public final Stream unordered() {
        return !D1() ? this : new S1(this, T2.f18703r);
    }

    public final boolean a0(Predicate predicate) {
        return ((Boolean) x1(C0501v0.q1(predicate, C0489s0.ALL))).booleanValue();
    }

    public final C0466m0 b0(Function function) {
        function.getClass();
        return new C0508x(this, T2.f18701p | T2.f18699n | T2.f18705t, function, 6);
    }

    public final IntStream c(Function function) {
        function.getClass();
        return new C0504w(this, T2.f18701p | T2.f18699n | T2.f18705t, function, 7);
    }

    public final Object collect(Collector collector) {
        Object obj;
        if (!isParallel() || !collector.characteristics().contains(C0453j.CONCURRENT) || (D1() && !collector.characteristics().contains(C0453j.UNORDERED))) {
            collector.getClass();
            obj = x1(new E1(1, collector.combiner(), collector.accumulator(), collector.supplier(), collector));
        } else {
            obj = collector.supplier().get();
            forEach(new C0469n(5, collector.accumulator(), obj));
        }
        return collector.characteristics().contains(C0453j.IDENTITY_FINISH) ? obj : collector.finisher().apply(obj);
    }

    public final long count() {
        return ((C0454j0) h0(new J0(7))).sum();
    }

    public final Stream distinct() {
        return new C0481q(this, T2.f18698m | T2.f18705t);
    }

    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0500v(this, T2.f18705t, predicate, 4);
    }

    public final Optional findAny() {
        return (Optional) x1(new H(false, 1, Optional.a(), new J0(29), new C0418b(14)));
    }

    public final Optional findFirst() {
        return (Optional) x1(new H(true, 1, Optional.a(), new J0(29), new C0418b(14)));
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        x1(new S(consumer, false));
    }

    public final boolean g0(Predicate predicate) {
        return ((Boolean) x1(C0501v0.q1(predicate, C0489s0.NONE))).booleanValue();
    }

    public final C0466m0 h0(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C0508x(this, T2.f18701p | T2.f18699n, toLongFunction, 7);
    }

    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    public final F j0(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C0496u(this, T2.f18701p | T2.f18699n, toDoubleFunction, 6);
    }

    public final Object l(Object obj, BiFunction biFunction, C0372f fVar) {
        biFunction.getClass();
        fVar.getClass();
        return x1(new C0502v1(1, fVar, biFunction, obj, 2));
    }

    public final Stream limit(long j10) {
        if (j10 >= 0) {
            return C0501v0.r1(this, 0, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final Object m0(Object obj, C0372f fVar) {
        fVar.getClass();
        return x1(new C0502v1(1, fVar, fVar, obj, 2));
    }

    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return M(new C0366c(0, comparator));
    }

    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return M(new C0366c(1, comparator));
    }

    public final F n(Function function) {
        function.getClass();
        return new C0496u(this, T2.f18701p | T2.f18699n | T2.f18705t, function, 7);
    }

    /* access modifiers changed from: package-private */
    public final C0517z0 p1(long j10, IntFunction intFunction) {
        return C0501v0.N0(j10, intFunction);
    }

    public final Stream skip(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : C0501v0.r1(this, j10, -1);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    public final Stream sorted() {
        return new A2(this);
    }

    public final Stream sorted(Comparator comparator) {
        return new A2(this, comparator);
    }

    public final Object[] toArray() {
        return toArray(new J0(6));
    }

    public final Object[] toArray(IntFunction intFunction) {
        return C0501v0.a1(y1(intFunction), intFunction).o(intFunction);
    }

    public final Stream u(Consumer consumer) {
        consumer.getClass();
        return new C0500v(this, 0, consumer, 3);
    }

    /* access modifiers changed from: package-private */
    public final E0 z1(C0501v0 v0Var, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return C0501v0.O0(v0Var, spliterator, z10, intFunction);
    }
}
