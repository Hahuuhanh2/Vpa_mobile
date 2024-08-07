package j$.util.stream;

import j$.util.I;
import j$.util.L;
import j$.util.Spliterator;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
final class C0463l1 extends M2 implements C0, C0513y0 {
    C0463l1() {
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final void accept(long j10) {
        super.accept(j10);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object b() {
        return (long[]) super.b();
    }

    public final C0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final E0 m43build() {
        return this;
    }

    public final void c(int i10, Object obj) {
        super.c(i10, (long[]) obj);
    }

    public final void d(Object obj) {
        super.d((C0375g0) obj);
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

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }

    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0501v0.w0(this, intFunction);
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.F0(this, j10, j11);
    }

    public final L spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m44spliterator() {
        return super.spliterator();
    }

    public final I x() {
        return super.spliterator();
    }

    /* renamed from: y */
    public final /* synthetic */ void e(Long[] lArr, int i10) {
        C0501v0.z0(this, lArr, i10);
    }
}
