package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0375g0;

/* renamed from: j$.util.stream.g0  reason: case insensitive filesystem */
final class C0442g0 extends C0454j0 {
    C0442g0(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    public final void E(C0375g0 g0Var) {
        if (!isParallel()) {
            C0454j0.O1(K1()).b(g0Var);
        } else {
            super.E(g0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean H1() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ C0466m0 parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ C0466m0 sequential() {
        sequential();
        return this;
    }

    public final void x(C0375g0 g0Var) {
        if (!isParallel()) {
            C0454j0.O1(K1()).b(g0Var);
        } else {
            super.x(g0Var);
        }
    }
}
