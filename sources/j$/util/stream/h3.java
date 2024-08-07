package j$.util.stream;

import j$.util.C0407m;
import j$.util.I;
import j$.util.Spliterator;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

final class h3 extends U2 implements I {
    h3(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        super(v0Var, spliterator, z10);
    }

    h3(C0501v0 v0Var, C0413a aVar, boolean z10) {
        super(v0Var, aVar, z10);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.n(this, consumer);
    }

    /* renamed from: b */
    public final void forEachRemaining(C0375g0 g0Var) {
        if (this.f18728h != null || this.f18729i) {
            do {
            } while (tryAdvance(g0Var));
            return;
        }
        g0Var.getClass();
        h();
        this.f18722b.u1(this.f18724d, new g3(g0Var, 0));
        this.f18729i = true;
    }

    /* renamed from: e */
    public final boolean tryAdvance(C0375g0 g0Var) {
        g0Var.getClass();
        boolean f10 = f();
        if (f10) {
            M2 m22 = (M2) this.f18728h;
            long j10 = this.f18727g;
            int t10 = m22.t(j10);
            g0Var.accept((m22.f18777c == 0 && t10 == 0) ? ((long[]) m22.f18671e)[(int) j10] : ((long[][]) m22.f18672f)[t10][(int) (j10 - m22.f18778d[t10])]);
        }
        return f10;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.h(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        M2 m22 = new M2();
        this.f18728h = m22;
        this.f18725e = this.f18722b.v1(new g3(m22, 1));
        this.f18726f = new C0413a(6, this);
    }

    /* access modifiers changed from: package-private */
    public final U2 k(Spliterator spliterator) {
        return new h3(this.f18722b, spliterator, this.f18721a);
    }

    public final I trySplit() {
        return (I) super.trySplit();
    }
}
