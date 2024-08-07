package j$.util.stream;

import j$.util.C0407m;
import j$.util.F;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.L;

final class f3 extends U2 implements F {
    f3(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        super(v0Var, spliterator, z10);
    }

    f3(C0501v0 v0Var, C0413a aVar, boolean z10) {
        super(v0Var, aVar, z10);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.m(this, consumer);
    }

    /* renamed from: c */
    public final void forEachRemaining(L l10) {
        if (this.f18728h != null || this.f18729i) {
            do {
            } while (tryAdvance(l10));
            return;
        }
        l10.getClass();
        h();
        this.f18722b.u1(this.f18724d, new e3(l10, 1));
        this.f18729i = true;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.g(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        K2 k22 = new K2();
        this.f18728h = k22;
        this.f18725e = this.f18722b.v1(new e3(k22, 0));
        this.f18726f = new C0413a(5, this);
    }

    /* renamed from: j */
    public final boolean tryAdvance(L l10) {
        l10.getClass();
        boolean f10 = f();
        if (f10) {
            K2 k22 = (K2) this.f18728h;
            long j10 = this.f18727g;
            int t10 = k22.t(j10);
            l10.accept((k22.f18777c == 0 && t10 == 0) ? ((int[]) k22.f18671e)[(int) j10] : ((int[][]) k22.f18672f)[t10][(int) (j10 - k22.f18778d[t10])]);
        }
        return f10;
    }

    /* access modifiers changed from: package-private */
    public final U2 k(Spliterator spliterator) {
        return new f3(this.f18722b, spliterator, this.f18721a);
    }

    public final F trySplit() {
        return (F) super.trySplit();
    }
}
