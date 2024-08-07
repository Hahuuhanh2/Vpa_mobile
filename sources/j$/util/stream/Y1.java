package j$.util.stream;

import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

public abstract class Y1 implements C0426c2 {

    /* renamed from: a  reason: collision with root package name */
    protected final C0440f2 f18743a;

    public Y1(C0440f2 f2Var) {
        f2Var.getClass();
        this.f18743a = f2Var;
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

    public void end() {
        this.f18743a.end();
    }

    public boolean h() {
        return this.f18743a.h();
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }
}
