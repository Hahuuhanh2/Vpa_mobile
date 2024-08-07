package j$.util.stream;

import j$.util.C;
import j$.util.L;
import j$.util.Spliterator;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

final class T0 extends I2 implements A0, C0505w0 {
    T0() {
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final void accept(double d10) {
        super.accept(d10);
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object b() {
        return (double[]) super.b();
    }

    public final A0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final E0 m33build() {
        return this;
    }

    public final void c(int i10, Object obj) {
        super.c(i10, (double[]) obj);
    }

    public final void d(Object obj) {
        super.d((C0388n) obj);
    }

    public final void end() {
    }

    public final void f(long j10) {
        clear();
        u(j10);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final /* synthetic */ int j() {
        return 0;
    }

    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0501v0.w0(this, intFunction);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.D0(this, j10, j11);
    }

    public final L spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m34spliterator() {
        return super.spliterator();
    }

    public final C x() {
        return super.spliterator();
    }

    /* renamed from: y */
    public final /* synthetic */ void e(Double[] dArr, int i10) {
        C0501v0.x0(this, dArr, i10);
    }
}
