package j$.util.stream;

import j$.util.function.Consumer;

abstract class M implements B3 {

    /* renamed from: a  reason: collision with root package name */
    boolean f18655a;

    /* renamed from: b  reason: collision with root package name */
    Object f18656b;

    M() {
    }

    public /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    /* renamed from: accept */
    public final void p(Object obj) {
        if (!this.f18655a) {
            this.f18655a = true;
            this.f18656b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ void end() {
    }

    public final /* synthetic */ void f(long j10) {
    }

    public final boolean h() {
        return this.f18655a;
    }
}
