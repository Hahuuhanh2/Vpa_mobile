package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0388n;

/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
final class C0516z extends C {
    C0516z(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    public final void H(C0388n nVar) {
        if (!isParallel()) {
            C.O1(K1()).d(nVar);
        } else {
            super.H(nVar);
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

    public final void k0(C0388n nVar) {
        if (!isParallel()) {
            C.O1(K1()).d(nVar);
        } else {
            super.k0(nVar);
        }
    }

    public final /* bridge */ /* synthetic */ F parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ F sequential() {
        sequential();
        return this;
    }
}
