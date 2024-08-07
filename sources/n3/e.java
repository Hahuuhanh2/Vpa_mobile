package n3;

import n0.l;
import sk.j;

/* compiled from: SpecificationComputer.kt */
public final class e<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f13487a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13488b = "n";

    /* renamed from: c  reason: collision with root package name */
    public final int f13489c;

    /* renamed from: d  reason: collision with root package name */
    public final c f13490d;

    public e(Object obj, int i10, c cVar) {
        j.f(obj, "value");
        l.o(i10, "verificationMode");
        this.f13487a = obj;
        this.f13489c = i10;
        this.f13490d = cVar;
    }

    public final T a() {
        return this.f13487a;
    }

    public final d<T> c(String str, rk.l<? super T, Boolean> lVar) {
        j.f(lVar, "condition");
        if (lVar.invoke(this.f13487a).booleanValue()) {
            return this;
        }
        return new b(this.f13487a, this.f13488b, str, this.f13490d, this.f13489c);
    }
}
