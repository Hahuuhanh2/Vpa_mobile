package j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0384l implements C0388n {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleConsumer f18538a;

    private /* synthetic */ C0384l(DoubleConsumer doubleConsumer) {
        this.f18538a = doubleConsumer;
    }

    public static /* synthetic */ C0388n a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C0386m ? ((C0386m) doubleConsumer).f18540a : new C0384l(doubleConsumer);
    }

    public final /* synthetic */ void accept(double d10) {
        this.f18538a.accept(d10);
    }

    public final /* synthetic */ C0388n m(C0388n nVar) {
        return a(this.f18538a.andThen(C0386m.a(nVar)));
    }
}
