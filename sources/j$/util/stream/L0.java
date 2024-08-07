package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0372f;
import j$.util.function.C0381j0;
import java.util.concurrent.CountedCompleter;

class L0 extends C0437f {

    /* renamed from: h  reason: collision with root package name */
    protected final C0501v0 f18649h;

    /* renamed from: i  reason: collision with root package name */
    protected final C0381j0 f18650i;

    /* renamed from: j  reason: collision with root package name */
    protected final C0372f f18651j;

    L0(L0 l02, Spliterator spliterator) {
        super((C0437f) l02, spliterator);
        this.f18649h = l02.f18649h;
        this.f18650i = l02.f18650i;
        this.f18651j = l02.f18651j;
    }

    L0(C0501v0 v0Var, Spliterator spliterator, C0381j0 j0Var, J0 j02) {
        super(v0Var, spliterator);
        this.f18649h = v0Var;
        this.f18650i = j0Var;
        this.f18651j = j02;
    }

    /* access modifiers changed from: protected */
    public C0437f d(Spliterator spliterator) {
        return new L0(this, spliterator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final E0 a() {
        C0517z0 z0Var = (C0517z0) this.f18650i.apply(this.f18649h.Y0(this.f18785b));
        this.f18649h.u1(this.f18785b, z0Var);
        return z0Var.build();
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C0437f fVar = this.f18787d;
        if (!(fVar == null)) {
            e((E0) this.f18651j.apply((E0) ((L0) fVar).b(), (E0) ((L0) this.f18788e).b()));
        }
        super.onCompletion(countedCompleter);
    }
}
