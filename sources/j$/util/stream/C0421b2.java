package j$.util.stream;

import j$.util.function.Consumer;

/* renamed from: j$.util.stream.b2  reason: case insensitive filesystem */
public abstract class C0421b2 implements C0440f2 {

    /* renamed from: a  reason: collision with root package name */
    protected final C0440f2 f18754a;

    public C0421b2(C0440f2 f2Var) {
        f2Var.getClass();
        this.f18754a = f2Var;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public void end() {
        this.f18754a.end();
    }

    public boolean h() {
        return this.f18754a.h();
    }
}
