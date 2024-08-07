package d1;

import java.util.Iterator;

/* compiled from: DimensionDependency */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f8515m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f8507e = 2;
        } else {
            this.f8507e = 3;
        }
    }

    public final void d(int i10) {
        if (!this.f8512j) {
            this.f8512j = true;
            this.f8509g = i10;
            Iterator it = this.f8513k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }
}
