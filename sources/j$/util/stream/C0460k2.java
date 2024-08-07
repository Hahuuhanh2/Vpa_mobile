package j$.util.stream;

/* renamed from: j$.util.stream.k2  reason: case insensitive filesystem */
final class C0460k2 extends C0416a2 {

    /* renamed from: b  reason: collision with root package name */
    long f18819b;

    /* renamed from: c  reason: collision with root package name */
    long f18820c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0464l2 f18821d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0460k2(C0464l2 l2Var, C0440f2 f2Var) {
        super(f2Var);
        this.f18821d = l2Var;
        this.f18819b = l2Var.f18826t;
        long j10 = l2Var.f18827u;
        this.f18820c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    public final void accept(long j10) {
        long j11 = this.f18819b;
        if (j11 == 0) {
            long j12 = this.f18820c;
            if (j12 > 0) {
                this.f18820c = j12 - 1;
                this.f18751a.accept(j10);
                return;
            }
            return;
        }
        this.f18819b = j11 - 1;
    }

    public final void f(long j10) {
        this.f18751a.f(C0501v0.J0(j10, this.f18821d.f18826t, this.f18820c));
    }

    public final boolean h() {
        return this.f18820c == 0 || this.f18751a.h();
    }
}
