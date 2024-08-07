package l4;

import com.airbnb.lottie.i;
import e4.h;
import java.util.ArrayList;
import m4.c;
import o4.a;

/* compiled from: KeyframesParser */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f12683a = c.a.a("k");

    public static ArrayList a(c cVar, i iVar, float f10, c0 c0Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (cVar.K() == 6) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.h();
        while (cVar.v()) {
            if (cVar.N(f12683a) != 0) {
                cVar.S();
            } else if (cVar.K() == 1) {
                cVar.d();
                if (cVar.K() == 7) {
                    arrayList.add(n.b(cVar, iVar, f10, c0Var, false, z10));
                } else {
                    while (cVar.v()) {
                        arrayList.add(n.b(cVar, iVar, f10, c0Var, true, z10));
                    }
                }
                cVar.i();
            } else {
                arrayList.add(n.b(cVar, iVar, f10, c0Var, false, z10));
            }
        }
        cVar.q();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        T t10;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            a aVar = (a) arrayList.get(i11);
            i11++;
            a aVar2 = (a) arrayList.get(i11);
            aVar.f13710h = Float.valueOf(aVar2.f13709g);
            if (aVar.f13705c == null && (t10 = aVar2.f13704b) != null) {
                aVar.f13705c = t10;
                if (aVar instanceof h) {
                    ((h) aVar).d();
                }
            }
        }
        a aVar3 = (a) arrayList.get(i10);
        if ((aVar3.f13704b == null || aVar3.f13705c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
