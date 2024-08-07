package fk;

import j7.a;
import java.util.Collection;

/* compiled from: IteratorsJVM.kt */
public class j extends a {
    public static final int H0(Iterable iterable) {
        sk.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
