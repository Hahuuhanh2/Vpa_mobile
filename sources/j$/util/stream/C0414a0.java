package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.L;

/* renamed from: j$.util.stream.a0  reason: case insensitive filesystem */
final class C0414a0 extends C0429d0 {
    C0414a0(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    /* access modifiers changed from: package-private */
    public final boolean H1() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        throw new UnsupportedOperationException();
    }

    public final void Q(L l10) {
        if (!isParallel()) {
            C0429d0.O1(K1()).c(l10);
        } else {
            super.Q(l10);
        }
    }

    public final void Y(L l10) {
        if (!isParallel()) {
            C0429d0.O1(K1()).c(l10);
        } else {
            super.Y(l10);
        }
    }

    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
