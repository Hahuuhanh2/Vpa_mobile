package j$.util.stream;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

public final /* synthetic */ class g3 implements C0436e2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18796a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0375g0 f18797b;

    public /* synthetic */ g3(C0375g0 g0Var, int i10) {
        this.f18796a = i10;
        this.f18797b = g0Var;
    }

    public final /* synthetic */ void accept(double d10) {
        switch (this.f18796a) {
            case 0:
                C0501v0.n0();
                throw null;
            default:
                C0501v0.n0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(int i10) {
        switch (this.f18796a) {
            case 0:
                C0501v0.u0();
                throw null;
            default:
                C0501v0.u0();
                throw null;
        }
    }

    public final void accept(long j10) {
        switch (this.f18796a) {
            case 0:
                this.f18797b.accept(j10);
                return;
            default:
                ((M2) this.f18797b).accept(j10);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f18796a) {
            case 0:
                l((Long) obj);
                return;
            default:
                l((Long) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18796a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ void end() {
    }

    public final /* synthetic */ void f(long j10) {
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        switch (this.f18796a) {
            case 0:
                g0Var.getClass();
                return new C0369d0(this, g0Var);
            default:
                g0Var.getClass();
                return new C0369d0(this, g0Var);
        }
    }

    public final /* synthetic */ void l(Long l10) {
        switch (this.f18796a) {
            case 0:
                C0501v0.s0(this, l10);
                return;
            default:
                C0501v0.s0(this, l10);
                return;
        }
    }
}
