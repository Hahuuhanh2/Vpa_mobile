package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

final class Q1 extends C0437f {

    /* renamed from: h  reason: collision with root package name */
    private final C0501v0 f18678h;

    Q1(Q1 q12, Spliterator spliterator) {
        super((C0437f) q12, spliterator);
        this.f18678h = q12.f18678h;
    }

    Q1(C0501v0 v0Var, C0501v0 v0Var2, Spliterator spliterator) {
        super(v0Var2, spliterator);
        this.f18678h = v0Var;
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        C0501v0 v0Var = this.f18784a;
        O1 s12 = this.f18678h.s1();
        v0Var.u1(this.f18785b, s12);
        return s12;
    }

    /* access modifiers changed from: protected */
    public final C0437f d(Spliterator spliterator) {
        return new Q1(this, spliterator);
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C0437f fVar = this.f18787d;
        if (!(fVar == null)) {
            O1 o12 = (O1) ((Q1) fVar).b();
            o12.k((O1) ((Q1) this.f18788e).b());
            e(o12);
        }
        super.onCompletion(countedCompleter);
    }
}
