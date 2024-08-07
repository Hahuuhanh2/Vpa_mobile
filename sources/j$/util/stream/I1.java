package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.H;
import j$.util.function.I;
import j$.util.function.L;

final class I1 implements O1, C0431d2 {

    /* renamed from: a  reason: collision with root package name */
    private int f18634a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f18635b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ H f18636c;

    I1(int i10, H h10) {
        this.f18635b = i10;
        this.f18636c = h10;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final void accept(int i10) {
        this.f18634a = this.f18636c.applyAsInt(this.f18634a, i10);
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

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18634a = this.f18635b;
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public final Object get() {
        return Integer.valueOf(this.f18634a);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final void k(O1 o12) {
        accept(((I1) o12).f18634a);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
