package j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.p  reason: case insensitive filesystem */
public final /* synthetic */ class C0391p implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0392q f18544a;

    private /* synthetic */ C0391p(C0392q qVar) {
        this.f18544a = qVar;
    }

    public static /* synthetic */ DoubleFunction a(C0392q qVar) {
        if (qVar == null) {
            return null;
        }
        return qVar instanceof C0390o ? ((C0390o) qVar).f18542a : new C0391p(qVar);
    }

    public final /* synthetic */ Object apply(double d10) {
        return this.f18544a.apply(d10);
    }
}
