package d1;

import c1.d;
import c1.e;
import c1.h;
import c1.j;
import java.util.ArrayList;

/* compiled from: Grouping */
public final class i {
    public static o a(e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            i11 = eVar.f4460u0;
        } else {
            i11 = eVar.f4462v0;
        }
        int i13 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f8524b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i14);
                if (oVar2.f8524b == i11) {
                    if (oVar != null) {
                        oVar.d(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof j) {
                j jVar = (j) eVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= jVar.f4506x0) {
                        i12 = -1;
                        break;
                    }
                    e eVar2 = jVar.f4505w0[i15];
                    if ((i10 == 0 && (i12 = eVar2.f4460u0) != -1) || (i10 == 1 && (i12 = eVar2.f4462v0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i16);
                        if (oVar3.f8524b == i12) {
                            oVar = oVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                d dVar = hVar.f4504z0;
                if (hVar.A0 == 0) {
                    i13 = 1;
                }
                dVar.c(i13, oVar, arrayList);
            }
            if (i10 == 0) {
                eVar.f4460u0 = oVar.f8524b;
                eVar.K.c(i10, oVar, arrayList);
                eVar.M.c(i10, oVar, arrayList);
            } else {
                eVar.f4462v0 = oVar.f8524b;
                eVar.L.c(i10, oVar, arrayList);
                eVar.O.c(i10, oVar, arrayList);
                eVar.N.c(i10, oVar, arrayList);
            }
            eVar.R.c(i10, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4) {
        boolean z10;
        boolean z11;
        e.a aVar5 = e.a.MATCH_PARENT;
        e.a aVar6 = e.a.WRAP_CONTENT;
        e.a aVar7 = e.a.FIXED;
        if (aVar3 == aVar7 || aVar3 == aVar6 || (aVar3 == aVar5 && aVar != aVar6)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar4 == aVar7 || aVar4 == aVar6 || (aVar4 == aVar5 && aVar2 != aVar6)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }
}
