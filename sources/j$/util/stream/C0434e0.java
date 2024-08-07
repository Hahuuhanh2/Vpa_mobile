package j$.util.stream;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;

/* renamed from: j$.util.stream.e0  reason: case insensitive filesystem */
public final /* synthetic */ class C0434e0 implements C0375g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0440f2 f18780b;

    public /* synthetic */ C0434e0(int i10, C0440f2 f2Var) {
        this.f18779a = i10;
        this.f18780b = f2Var;
    }

    public final void accept(long j10) {
        switch (this.f18779a) {
            case 0:
                this.f18780b.accept(j10);
                return;
            default:
                ((C0438f0) this.f18780b).f18751a.accept(j10);
                return;
        }
    }

    public final C0375g0 i(C0375g0 g0Var) {
        switch (this.f18779a) {
            case 0:
                g0Var.getClass();
                return new C0369d0(this, g0Var);
            default:
                g0Var.getClass();
                return new C0369d0(this, g0Var);
        }
    }
}
