package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.L;

public final /* synthetic */ class e3 implements C0431d2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L f18782b;

    public /* synthetic */ e3(L l10, int i10) {
        this.f18781a = i10;
        this.f18782b = l10;
    }

    public final /* synthetic */ void accept(double d10) {
        switch (this.f18781a) {
            case 0:
                C0501v0.n0();
                throw null;
            default:
                C0501v0.n0();
                throw null;
        }
    }

    public final void accept(int i10) {
        switch (this.f18781a) {
            case 0:
                ((K2) this.f18782b).accept(i10);
                return;
            default:
                this.f18782b.accept(i10);
                return;
        }
    }

    public final /* synthetic */ void accept(long j10) {
        switch (this.f18781a) {
            case 0:
                C0501v0.v0();
                throw null;
            default:
                C0501v0.v0();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f18781a) {
            case 0:
                g((Integer) obj);
                return;
            default:
                g((Integer) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18781a) {
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

    public final /* synthetic */ void g(Integer num) {
        switch (this.f18781a) {
            case 0:
                C0501v0.q0(this, num);
                return;
            default:
                C0501v0.q0(this, num);
                return;
        }
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final L n(L l10) {
        switch (this.f18781a) {
            case 0:
                l10.getClass();
                return new I(this, l10);
            default:
                l10.getClass();
                return new I(this, l10);
        }
    }
}
