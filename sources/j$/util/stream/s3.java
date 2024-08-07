package j$.util.stream;

import j$.util.C0407m;
import j$.util.F;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.L;

final class s3 extends u3 implements F, L {

    /* renamed from: e  reason: collision with root package name */
    int f18892e;

    s3(F f10, long j10, long j11) {
        super(f10, j10, j11);
    }

    s3(F f10, s3 s3Var) {
        super(f10, s3Var);
    }

    public final /* synthetic */ boolean a(Consumer consumer) {
        return C0407m.m(this, consumer);
    }

    public final void accept(int i10) {
        this.f18892e = i10;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0407m.g(this, consumer);
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }

    /* access modifiers changed from: protected */
    public final Spliterator r(Spliterator spliterator) {
        return new s3((F) spliterator, this);
    }

    /* access modifiers changed from: protected */
    public final void t(Object obj) {
        ((L) obj).accept(this.f18892e);
    }

    /* access modifiers changed from: protected */
    public final Y2 u() {
        return new W2();
    }
}
