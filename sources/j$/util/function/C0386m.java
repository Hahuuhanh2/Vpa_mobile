package j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.m  reason: case insensitive filesystem */
public final /* synthetic */ class C0386m implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0388n f18540a;

    private /* synthetic */ C0386m(C0388n nVar) {
        this.f18540a = nVar;
    }

    public static /* synthetic */ DoubleConsumer a(C0388n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar instanceof C0384l ? ((C0384l) nVar).f18538a : new C0386m(nVar);
    }

    public final /* synthetic */ void accept(double d10) {
        this.f18540a.accept(d10);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return a(this.f18540a.m(C0384l.a(doubleConsumer)));
    }
}
