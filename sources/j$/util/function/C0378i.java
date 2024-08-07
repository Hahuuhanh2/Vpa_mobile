package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.i  reason: case insensitive filesystem */
public final /* synthetic */ class C0378i implements DoubleBinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0380j f18533a;

    private /* synthetic */ C0378i(C0380j jVar) {
        this.f18533a = jVar;
    }

    public static /* synthetic */ DoubleBinaryOperator a(C0380j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar instanceof C0376h ? ((C0376h) jVar).f18531a : new C0378i(jVar);
    }

    public final /* synthetic */ double applyAsDouble(double d10, double d11) {
        return this.f18533a.applyAsDouble(d10, d11);
    }
}
