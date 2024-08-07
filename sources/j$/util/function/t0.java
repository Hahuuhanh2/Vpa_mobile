package j$.util.function;

public final /* synthetic */ class t0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w0 f18550b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w0 f18551c;

    public /* synthetic */ t0(w0 w0Var, w0 w0Var2, int i10) {
        this.f18549a = i10;
        this.f18550b = w0Var;
        this.f18551c = w0Var2;
    }

    public final long applyAsLong(long j10) {
        switch (this.f18549a) {
            case 0:
                return this.f18551c.applyAsLong(this.f18550b.applyAsLong(j10));
            default:
                return this.f18550b.applyAsLong(this.f18551c.applyAsLong(j10));
        }
    }

    public final w0 b(w0 w0Var) {
        switch (this.f18549a) {
            case 0:
                w0Var.getClass();
                return new t0(this, w0Var, 1);
            default:
                w0Var.getClass();
                return new t0(this, w0Var, 1);
        }
    }

    public final w0 e(w0 w0Var) {
        switch (this.f18549a) {
            case 0:
                w0Var.getClass();
                return new t0(this, w0Var, 0);
            default:
                w0Var.getClass();
                return new t0(this, w0Var, 0);
        }
    }
}
