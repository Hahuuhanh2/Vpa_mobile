package j$.util;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;

/* renamed from: j$.util.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0521u implements C0375g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f18947a;

    public /* synthetic */ C0521u(Consumer consumer) {
        this.f18947a = consumer;
    }

    public final void accept(long j10) {
        this.f18947a.accept(Long.valueOf(j10));
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }
}
