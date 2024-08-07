package j$.util.stream;

import j$.util.C0405k;
import j$.util.function.C0367c0;
import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

final class N1 implements O1, C0436e2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18661a;

    /* renamed from: b  reason: collision with root package name */
    private long f18662b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0367c0 f18663c;

    N1(C0367c0 c0Var) {
        this.f18663c = c0Var;
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
        if (this.f18661a) {
            this.f18661a = false;
        } else {
            j10 = this.f18663c.applyAsLong(this.f18662b, j10);
        }
        this.f18662b = j10;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final void f(long j10) {
        this.f18661a = true;
        this.f18662b = 0;
    }

    public final Object get() {
        return this.f18661a ? C0405k.a() : C0405k.d(this.f18662b);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final void k(O1 o12) {
        N1 n12 = (N1) o12;
        if (!n12.f18661a) {
            accept(n12.f18662b);
        }
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }
}
