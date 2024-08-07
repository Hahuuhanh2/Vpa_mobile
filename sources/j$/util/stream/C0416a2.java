package j$.util.stream;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.a2  reason: case insensitive filesystem */
public abstract class C0416a2 implements C0436e2 {

    /* renamed from: a  reason: collision with root package name */
    protected final C0440f2 f18751a;

    public C0416a2(C0440f2 f2Var) {
        f2Var.getClass();
        this.f18751a = f2Var;
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public void end() {
        this.f18751a.end();
    }

    public boolean h() {
        return this.f18751a.h();
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }
}
