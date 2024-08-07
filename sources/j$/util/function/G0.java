package j$.util.function;

import j$.util.function.Predicate;

public final /* synthetic */ class G0 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18490a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Predicate f18491b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Predicate f18492c;

    public /* synthetic */ G0(Predicate predicate, Predicate predicate2, int i10) {
        this.f18490a = i10;
        this.f18491b = predicate;
        this.f18492c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f18490a) {
            case 0:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f18490a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f18490a) {
            case 0:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    public final boolean test(Object obj) {
        switch (this.f18490a) {
            case 0:
                return this.f18491b.test(obj) && this.f18492c.test(obj);
            default:
                return this.f18491b.test(obj) || this.f18492c.test(obj);
        }
    }
}
