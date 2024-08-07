package j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.o  reason: case insensitive filesystem */
public final /* synthetic */ class C0390o implements C0392q {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleFunction f18542a;

    private /* synthetic */ C0390o(DoubleFunction doubleFunction) {
        this.f18542a = doubleFunction;
    }

    public static /* synthetic */ C0392q a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C0391p ? ((C0391p) doubleFunction).f18544a : new C0390o(doubleFunction);
    }

    public final /* synthetic */ Object apply(double d10) {
        return this.f18542a.apply(d10);
    }
}
