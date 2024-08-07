package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.y  reason: case insensitive filesystem */
public final /* synthetic */ class C0399y implements DoubleToLongFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0400z f18558a;

    private /* synthetic */ C0399y(C0400z zVar) {
        this.f18558a = zVar;
    }

    public static /* synthetic */ DoubleToLongFunction a(C0400z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar instanceof C0398x ? ((C0398x) zVar).f18556a : new C0399y(zVar);
    }

    public final /* synthetic */ long applyAsLong(double d10) {
        return this.f18558a.applyAsLong(d10);
    }
}
