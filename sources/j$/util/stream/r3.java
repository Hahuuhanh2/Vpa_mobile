package j$.util.stream;

import j$.util.C;
import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

final class r3 extends u3 implements C, C0388n {

    /* renamed from: e  reason: collision with root package name */
    double f18885e;

    r3(C c10, long j10, long j11) {
        super(c10, j10, j11);
    }

    r3(C c10, r3 r3Var) {
        super(c10, r3Var);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.l(this, consumer);
    }

    public final void accept(double d10) {
        this.f18885e = d10;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.f(this, consumer);
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    /* access modifiers changed from: protected */
    public final Spliterator r(Spliterator spliterator) {
        return new r3((C) spliterator, this);
    }

    /* access modifiers changed from: protected */
    public final void t(Object obj) {
        ((C0388n) obj).accept(this.f18885e);
    }

    /* access modifiers changed from: protected */
    public final Y2 u() {
        return new V2();
    }
}
