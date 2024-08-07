package j$.util.function;

/* renamed from: j$.util.function.d0  reason: case insensitive filesystem */
public final /* synthetic */ class C0369d0 implements C0375g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0375g0 f18525a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0375g0 f18526b;

    public /* synthetic */ C0369d0(C0375g0 g0Var, C0375g0 g0Var2) {
        this.f18525a = g0Var;
        this.f18526b = g0Var2;
    }

    public final void accept(long j10) {
        C0375g0 g0Var = this.f18525a;
        C0375g0 g0Var2 = this.f18526b;
        g0Var.accept(j10);
        g0Var2.accept(j10);
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }
}
