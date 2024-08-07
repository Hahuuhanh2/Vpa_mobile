package j$.util.function;

import j$.util.function.Predicate;
import java.util.function.Predicate;

public final /* synthetic */ class H0 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Predicate f18493a;

    private /* synthetic */ H0(Predicate predicate) {
        this.f18493a = predicate;
    }

    public static /* synthetic */ Predicate a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof Predicate.VivifiedWrapper ? ((Predicate.VivifiedWrapper) predicate).f18507a : new H0(predicate);
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return a(this.f18493a.and(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ java.util.function.Predicate negate() {
        return a(this.f18493a.negate());
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return a(this.f18493a.or(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ boolean test(Object obj) {
        return this.f18493a.test(obj);
    }
}
