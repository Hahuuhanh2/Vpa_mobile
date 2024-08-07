package j$.util.function;

import j$.util.concurrent.u;
import j$.util.function.Predicate;
import java.util.Comparator;

/* renamed from: j$.util.function.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0366c implements C0372f, Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18522a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18523b;

    public /* synthetic */ C0366c(int i10, Object obj) {
        this.f18522a = i10;
        this.f18523b = obj;
    }

    public final BiFunction a(Function function) {
        switch (this.f18522a) {
            case 0:
                function.getClass();
                return new u(this, function);
            default:
                function.getClass();
                return new u(this, function);
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f18522a) {
            case 0:
                return ((Comparator) this.f18523b).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) this.f18523b).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return !((Predicate) this.f18523b).test(obj);
    }
}
