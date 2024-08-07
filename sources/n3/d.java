package n3;

import n0.l;
import p3.l0;
import sk.j;

/* compiled from: SpecificationComputer.kt */
public abstract class d<T> {

    /* compiled from: SpecificationComputer.kt */
    public static final class a {
        public static e a(Object obj, int i10) {
            l0 l0Var = l0.f13961s;
            j.f(obj, "<this>");
            l.o(i10, "verificationMode");
            return new e(obj, i10, l0Var);
        }
    }

    static {
        new a();
    }

    public static String b(Object obj, String str) {
        j.f(obj, "value");
        j.f(str, "message");
        return str + " value: " + obj;
    }

    public abstract T a();

    public abstract d<T> c(String str, rk.l<? super T, Boolean> lVar);
}
