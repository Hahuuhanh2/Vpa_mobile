package j$.util.stream;

/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
final class C0473o extends C0421b2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f18847b;

    /* renamed from: c  reason: collision with root package name */
    Object f18848c;

    C0473o(C0440f2 f2Var) {
        super(f2Var);
    }

    public final void accept(Object obj) {
        if (obj != null) {
            Object obj2 = this.f18848c;
            if (obj2 == null || !obj.equals(obj2)) {
                C0440f2 f2Var = this.f18754a;
                this.f18848c = obj;
                f2Var.accept(obj);
            }
        } else if (!this.f18847b) {
            this.f18847b = true;
            C0440f2 f2Var2 = this.f18754a;
            this.f18848c = null;
            f2Var2.accept(null);
        }
    }

    public final void end() {
        this.f18847b = false;
        this.f18848c = null;
        this.f18754a.end();
    }

    public final void f(long j10) {
        this.f18847b = false;
        this.f18848c = null;
        this.f18754a.f(-1);
    }
}
