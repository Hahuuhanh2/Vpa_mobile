package j$.util.stream;

import j$.util.C0407m;
import j$.util.I;
import j$.util.Spliterator;
import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

final class t3 extends u3 implements I, C0375g0 {

    /* renamed from: e  reason: collision with root package name */
    long f18901e;

    t3(I i10, long j10, long j11) {
        super(i10, j10, j11);
    }

    t3(I i10, t3 t3Var) {
        super(i10, t3Var);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.n(this, consumer);
    }

    public final void accept(long j10) {
        this.f18901e = j10;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.h(this, consumer);
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    /* access modifiers changed from: protected */
    public final Spliterator r(Spliterator spliterator) {
        return new t3((I) spliterator, this);
    }

    /* access modifiers changed from: protected */
    public final void t(Object obj) {
        ((C0375g0) obj).accept(this.f18901e);
    }

    /* access modifiers changed from: protected */
    public final Y2 u() {
        return new X2();
    }
}
