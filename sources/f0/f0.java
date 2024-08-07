package f0;

import al.g0;
import c0.n;
import c0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LensFacingCameraFilter */
public final class f0 implements n {

    /* renamed from: b  reason: collision with root package name */
    public final int f9532b;

    public f0(int i10) {
        this.f9532b = i10;
    }

    public final b a() {
        return n.f4310a;
    }

    public final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            g0.y("The camera info doesn't contain internal implementation.", oVar instanceof q);
            if (oVar.f() == this.f9532b) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }
}
