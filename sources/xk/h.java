package xk;

import fk.r;
import j7.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sk.j;

public final class h extends k {
    public static final List q1(e eVar) {
        j.f(eVar, "<this>");
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return r.f20213a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a.c0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
