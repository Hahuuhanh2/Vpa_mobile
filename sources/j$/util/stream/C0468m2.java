package j$.util.stream;

/* renamed from: j$.util.stream.m2  reason: case insensitive filesystem */
final class C0468m2 extends Y1 {

    /* renamed from: b  reason: collision with root package name */
    long f18834b;

    /* renamed from: c  reason: collision with root package name */
    long f18835c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0472n2 f18836d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0468m2(C0472n2 n2Var, C0440f2 f2Var) {
        super(f2Var);
        this.f18836d = n2Var;
        this.f18834b = n2Var.f18845t;
        long j10 = n2Var.f18846u;
        this.f18835c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    public final void accept(double d10) {
        long j10 = this.f18834b;
        if (j10 == 0) {
            long j11 = this.f18835c;
            if (j11 > 0) {
                this.f18835c = j11 - 1;
                this.f18743a.accept(d10);
                return;
            }
            return;
        }
        this.f18834b = j10 - 1;
    }

    public final void f(long j10) {
        this.f18743a.f(C0501v0.J0(j10, this.f18836d.f18845t, this.f18835c));
    }

    public final boolean h() {
        return this.f18835c == 0 || this.f18743a.h();
    }
}
