package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

final class S extends T {

    /* renamed from: b  reason: collision with root package name */
    final Consumer f18685b;

    S(Consumer consumer, boolean z10) {
        super(z10);
        this.f18685b = consumer;
    }

    public final void accept(Object obj) {
        this.f18685b.accept(obj);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    public final Object l0(C0501v0 v0Var, Spliterator spliterator) {
        v0Var.u1(spliterator, this);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object w(C0501v0 v0Var, Spliterator spliterator) {
        a(v0Var, spliterator);
        return null;
    }
}
