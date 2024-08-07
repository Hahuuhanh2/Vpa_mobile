package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.I;
import j$.util.function.L;

/* renamed from: j$.util.stream.n1  reason: case insensitive filesystem */
final class C0471n1 extends C0483q1 implements C0431d2 {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f18843h;

    C0471n1(Spliterator spliterator, C0501v0 v0Var, int[] iArr) {
        super(iArr.length, spliterator, v0Var);
        this.f18843h = iArr;
    }

    C0471n1(C0471n1 n1Var, Spliterator spliterator, long j10, long j11) {
        super(n1Var, spliterator, j10, j11, n1Var.f18843h.length);
        this.f18843h = n1Var.f18843h;
    }

    /* access modifiers changed from: package-private */
    public final C0483q1 a(Spliterator spliterator, long j10, long j11) {
        return new C0471n1(this, spliterator, j10, j11);
    }

    public final void accept(int i10) {
        int i11 = this.f18872f;
        if (i11 < this.f18873g) {
            int[] iArr = this.f18843h;
            this.f18872f = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18872f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        g((Integer) obj);
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
