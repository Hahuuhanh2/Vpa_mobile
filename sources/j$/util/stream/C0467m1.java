package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0382k;
import j$.util.function.C0388n;

/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
final class C0467m1 extends C0483q1 implements C0426c2 {

    /* renamed from: h  reason: collision with root package name */
    private final double[] f18833h;

    C0467m1(Spliterator spliterator, C0501v0 v0Var, double[] dArr) {
        super(dArr.length, spliterator, v0Var);
        this.f18833h = dArr;
    }

    C0467m1(C0467m1 m1Var, Spliterator spliterator, long j10, long j11) {
        super(m1Var, spliterator, j10, j11, m1Var.f18833h.length);
        this.f18833h = m1Var.f18833h;
    }

    /* access modifiers changed from: package-private */
    public final C0483q1 a(Spliterator spliterator, long j10, long j11) {
        return new C0467m1(this, spliterator, j10, j11);
    }

    public final void accept(double d10) {
        int i10 = this.f18872f;
        if (i10 < this.f18873g) {
            double[] dArr = this.f18833h;
            this.f18872f = i10 + 1;
            dArr[i10] = d10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18872f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }
}
