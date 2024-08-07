package fk;

import j7.a;
import java.util.ArrayList;
import java.util.List;
import sk.j;

/* compiled from: ReversedViews.kt */
public class l extends k {
    public static final void I0(List list, List list2) {
        j.f(list2, "<this>");
        j.f(list, "elements");
        list2.addAll(list);
    }

    public static final Object J0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.remove(0);
    }

    public static final Object K0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.remove(a.I(arrayList));
    }
}
