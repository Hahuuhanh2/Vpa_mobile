package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0369d0;
import j$.util.function.C0375g0;

/* renamed from: j$.util.stream.o1  reason: case insensitive filesystem */
final class C0475o1 extends C0483q1 implements C0436e2 {

    /* renamed from: h  reason: collision with root package name */
    private final long[] f18851h;

    C0475o1(Spliterator spliterator, C0501v0 v0Var, long[] jArr) {
        super(jArr.length, spliterator, v0Var);
        this.f18851h = jArr;
    }

    C0475o1(C0475o1 o1Var, Spliterator spliterator, long j10, long j11) {
        super(o1Var, spliterator, j10, j11, o1Var.f18851h.length);
        this.f18851h = o1Var.f18851h;
    }

    /* access modifiers changed from: package-private */
    public final C0483q1 a(Spliterator spliterator, long j10, long j11) {
        return new C0475o1(this, spliterator, j10, j11);
    }

    public final void accept(long j10) {
        int i10 = this.f18872f;
        if (i10 < this.f18873g) {
            long[] jArr = this.f18851h;
            this.f18872f = i10 + 1;
            jArr[i10] = j10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18872f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }
}
