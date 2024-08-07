package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

abstract class T implements A3, B3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18688a;

    protected T(boolean z10) {
        this.f18688a = z10;
    }

    public final int N() {
        if (this.f18688a) {
            return 0;
        }
        return T2.f18703r;
    }

    public final void a(C0501v0 v0Var, Spliterator spliterator) {
        (this.f18688a ? new U(v0Var, spliterator, (C0440f2) this) : new V(v0Var, spliterator, v0Var.v1(this))).invoke();
    }

    public /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final /* synthetic */ void f(long j10) {
    }

    public final /* synthetic */ boolean h() {
        return false;
    }
}
