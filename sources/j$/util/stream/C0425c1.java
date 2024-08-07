package j$.util.stream;

import j$.util.F;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.L;

/* renamed from: j$.util.stream.c1  reason: case insensitive filesystem */
final class C0425c1 extends K2 implements B0, C0509x0 {
    C0425c1() {
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final void accept(int i10) {
        super.accept(i10);
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        g((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object b() {
        return (int[]) super.b();
    }

    public final B0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final E0 m40build() {
        return this;
    }

    public final void c(int i10, Object obj) {
        super.c(i10, (int[]) obj);
    }

    public final void d(Object obj) {
        super.d((L) obj);
    }

    public final void end() {
    }

    public final void f(long j10) {
        clear();
        u(j10);
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
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

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.E0(this, j10, j11);
    }

    public final j$.util.L spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m41spliterator() {
        return super.spliterator();
    }

    public final F x() {
        return super.spliterator();
    }

    /* renamed from: y */
    public final /* synthetic */ void e(Integer[] numArr, int i10) {
        C0501v0.y0(this, numArr, i10);
    }
}
