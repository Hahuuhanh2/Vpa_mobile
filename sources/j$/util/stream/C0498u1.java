package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.u1  reason: case insensitive filesystem */
abstract class C0498u1 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    protected final E0 f18905a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f18906b;

    C0498u1(E0 e02) {
        this.f18905a = e02;
        this.f18906b = 0;
    }

    C0498u1(C0498u1 u1Var, E0 e02, int i10) {
        super(u1Var);
        this.f18905a = e02;
        this.f18906b = i10;
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public abstract C0494t1 b(int i10, int i11);

    public final void compute() {
        C0498u1 u1Var = this;
        while (u1Var.f18905a.j() != 0) {
            u1Var.setPendingCount(u1Var.f18905a.j() - 1);
            int i10 = 0;
            int i11 = 0;
            while (i10 < u1Var.f18905a.j() - 1) {
                C0494t1 b10 = u1Var.b(i10, u1Var.f18906b + i11);
                i11 = (int) (((long) i11) + b10.f18905a.count());
                b10.fork();
                i10++;
            }
            u1Var = u1Var.b(i10, u1Var.f18906b + i11);
        }
        u1Var.a();
        u1Var.propagateCompletion();
    }
}
