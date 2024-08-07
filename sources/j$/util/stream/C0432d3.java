package j$.util.stream;

import j$.util.C;
import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.d3  reason: case insensitive filesystem */
final class C0432d3 extends U2 implements C {
    C0432d3(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        super(v0Var, spliterator, z10);
    }

    C0432d3(C0501v0 v0Var, C0413a aVar, boolean z10) {
        super(v0Var, aVar, z10);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.l(this, consumer);
    }

    /* renamed from: d */
    public final void forEachRemaining(C0388n nVar) {
        if (this.f18728h != null || this.f18729i) {
            do {
            } while (tryAdvance(nVar));
            return;
        }
        nVar.getClass();
        h();
        this.f18722b.u1(this.f18724d, new C0427c3(nVar, 1));
        this.f18729i = true;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.f(this, consumer);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        I2 i22 = new I2();
        this.f18728h = i22;
        this.f18725e = this.f18722b.v1(new C0427c3(i22, 0));
        this.f18726f = new C0413a(4, this);
    }

    /* access modifiers changed from: package-private */
    public final U2 k(Spliterator spliterator) {
        return new C0432d3(this.f18722b, spliterator, this.f18721a);
    }

    /* renamed from: o */
    public final boolean tryAdvance(C0388n nVar) {
        nVar.getClass();
        boolean f10 = f();
        if (f10) {
            I2 i22 = (I2) this.f18728h;
            long j10 = this.f18727g;
            int t10 = i22.t(j10);
            nVar.accept((i22.f18777c == 0 && t10 == 0) ? ((double[]) i22.f18671e)[(int) j10] : ((double[][]) i22.f18672f)[t10][(int) (j10 - i22.f18778d[t10])]);
        }
        return f10;
    }

    public final C trySplit() {
        return (C) super.trySplit();
    }
}
