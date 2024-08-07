package j$.util.function;

import j$.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* renamed from: j$.util.function.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0370e implements BinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0372f f18527a;

    private /* synthetic */ C0370e(C0372f fVar) {
        this.f18527a = fVar;
    }

    public static /* synthetic */ BinaryOperator a(C0372f fVar) {
        if (fVar == null) {
            return null;
        }
        return fVar instanceof C0368d ? ((C0368d) fVar).f18524a : new C0370e(fVar);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return C0364b.a(this.f18527a.a(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f18527a.apply(obj, obj2);
    }
}
