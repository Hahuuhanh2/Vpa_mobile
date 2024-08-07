package j$.util.stream;

/* renamed from: j$.util.stream.g2  reason: case insensitive filesystem */
final class C0444g2 extends C0421b2 {

    /* renamed from: b  reason: collision with root package name */
    long f18793b;

    /* renamed from: c  reason: collision with root package name */
    long f18794c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0448h2 f18795d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0444g2(C0448h2 h2Var, C0440f2 f2Var) {
        super(f2Var);
        this.f18795d = h2Var;
        this.f18793b = h2Var.f18799t;
        long j10 = h2Var.f18800u;
        this.f18794c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    public final void accept(Object obj) {
        long j10 = this.f18793b;
        if (j10 == 0) {
            long j11 = this.f18794c;
            if (j11 > 0) {
                this.f18794c = j11 - 1;
                this.f18754a.accept(obj);
                return;
            }
            return;
        }
        this.f18793b = j10 - 1;
    }

    public final void f(long j10) {
        this.f18754a.f(C0501v0.J0(j10, this.f18795d.f18799t, this.f18794c));
    }

    public final boolean h() {
        return this.f18794c == 0 || this.f18754a.h();
    }
}
