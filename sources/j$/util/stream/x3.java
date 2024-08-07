package j$.util.stream;

import j$.util.function.Consumer;

public final /* synthetic */ class x3 implements C0440f2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18937a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Consumer f18938b;

    public /* synthetic */ x3(Consumer consumer, int i10) {
        this.f18937a = i10;
        this.f18938b = consumer;
    }

    public final /* synthetic */ void accept(double d10) {
        switch (this.f18937a) {
            case 0:
                C0501v0.n0();
                throw null;
            default:
                C0501v0.n0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(int i10) {
        switch (this.f18937a) {
            case 0:
                C0501v0.u0();
                throw null;
            default:
                C0501v0.u0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(long j10) {
        switch (this.f18937a) {
            case 0:
                C0501v0.v0();
                throw null;
            default:
                C0501v0.v0();
                throw null;
        }
    }

    public final void accept(Object obj) {
        switch (this.f18937a) {
            case 0:
                ((P2) this.f18938b).accept(obj);
                return;
            default:
                this.f18938b.accept(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18937a) {
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
}
