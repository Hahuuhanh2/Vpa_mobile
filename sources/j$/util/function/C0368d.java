package j$.util.function;

import j$.util.function.BiFunction;
import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0368d implements C0372f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f18524a;

    private /* synthetic */ C0368d(BinaryOperator binaryOperator) {
        this.f18524a = binaryOperator;
    }

    public static /* synthetic */ C0372f b(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C0370e ? ((C0370e) binaryOperator).f18527a : new C0368d(binaryOperator);
    }

    public final /* synthetic */ BiFunction a(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.f18524a.andThen(E.a(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f18524a.apply(obj, obj2);
    }
}
