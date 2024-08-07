package l4;

import com.airbnb.lottie.i;
import e4.h;
import h4.b;
import h4.e;
import h4.f;
import java.util.ArrayList;
import m4.c;
import m4.d;
import n4.g;
import p3.l0;

/* compiled from: AnimatablePathValueParser */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f12649a = c.a.a("k", "x", "y");

    public static e a(d dVar, i iVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (dVar.K() == 1) {
            dVar.d();
            while (dVar.v()) {
                if (dVar.K() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new h(iVar, n.b(dVar, iVar, g.c(), l0.f13955f, z10, false)));
            }
            dVar.i();
            o.b(arrayList);
        } else {
            arrayList.add(new o4.a(m.b(dVar, g.c())));
        }
        return new e(arrayList);
    }

    public static h4.h b(d dVar, i iVar) {
        dVar.h();
        e eVar = null;
        b bVar = null;
        boolean z10 = false;
        b bVar2 = null;
        while (dVar.K() != 4) {
            int N = dVar.N(f12649a);
            if (N != 0) {
                if (N != 1) {
                    if (N != 2) {
                        dVar.R();
                        dVar.S();
                    } else if (dVar.K() == 6) {
                        dVar.S();
                    } else {
                        bVar = j7.a.i0(dVar, iVar, true);
                    }
                } else if (dVar.K() == 6) {
                    dVar.S();
                } else {
                    bVar2 = j7.a.i0(dVar, iVar, true);
                }
                z10 = true;
            } else {
                eVar = a(dVar, iVar);
            }
        }
        dVar.q();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new f(bVar2, bVar);
    }
}
