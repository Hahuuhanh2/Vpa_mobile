package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.x  reason: case insensitive filesystem */
public final /* synthetic */ class C0398x implements C0400z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleToLongFunction f18556a;

    private /* synthetic */ C0398x(DoubleToLongFunction doubleToLongFunction) {
        this.f18556a = doubleToLongFunction;
    }

    public static /* synthetic */ C0400z a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof C0399y ? ((C0399y) doubleToLongFunction).f18558a : new C0398x(doubleToLongFunction);
    }

    public final /* synthetic */ long applyAsLong(double d10) {
        return this.f18556a.applyAsLong(d10);
    }
}
