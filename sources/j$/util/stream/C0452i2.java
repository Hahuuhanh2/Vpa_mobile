package j$.util.stream;

/* renamed from: j$.util.stream.i2  reason: case insensitive filesystem */
final class C0452i2 extends Z1 {

    /* renamed from: b  reason: collision with root package name */
    long f18806b;

    /* renamed from: c  reason: collision with root package name */
    long f18807c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0456j2 f18808d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0452i2(C0456j2 j2Var, C0440f2 f2Var) {
        super(f2Var);
        this.f18808d = j2Var;
        this.f18806b = j2Var.f18815t;
        long j10 = j2Var.f18816u;
        this.f18807c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    public final void accept(int i10) {
        long j10 = this.f18806b;
        if (j10 == 0) {
            long j11 = this.f18807c;
            if (j11 > 0) {
                this.f18807c = j11 - 1;
                this.f18745a.accept(i10);
                return;
            }
            return;
        }
        this.f18806b = j10 - 1;
    }

    public final void f(long j10) {
        this.f18745a.f(C0501v0.J0(j10, this.f18808d.f18815t, this.f18807c));
    }

    public final boolean h() {
        return this.f18807c == 0 || this.f18745a.h();
    }
}
