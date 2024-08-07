package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.L;

public abstract class Z1 implements C0431d2 {

    /* renamed from: a  reason: collision with root package name */
    protected final C0440f2 f18745a;

    public Z1(C0440f2 f2Var) {
        f2Var.getClass();
        this.f18745a = f2Var;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
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

    public void end() {
        this.f18745a.end();
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public boolean h() {
        return this.f18745a.h();
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
