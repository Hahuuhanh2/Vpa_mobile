package c1;

import a1.d;
import c1.e;

/* compiled from: Optimizer */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f4507a = new boolean[3];

    public static void a(f fVar, d dVar, e eVar) {
        e.a aVar = e.a.MATCH_PARENT;
        eVar.f4449p = -1;
        eVar.f4451q = -1;
        e.a aVar2 = fVar.V[0];
        e.a aVar3 = e.a.WRAP_CONTENT;
        if (aVar2 != aVar3 && eVar.V[0] == aVar) {
            int i10 = eVar.K.f4407g;
            int u10 = fVar.u() - eVar.M.f4407g;
            d dVar2 = eVar.K;
            dVar2.f4409i = dVar.k(dVar2);
            d dVar3 = eVar.M;
            dVar3.f4409i = dVar.k(dVar3);
            dVar.d(eVar.K.f4409i, i10);
            dVar.d(eVar.M.f4409i, u10);
            eVar.f4449p = 2;
            eVar.f4422b0 = i10;
            int i11 = u10 - i10;
            eVar.X = i11;
            int i12 = eVar.f4428e0;
            if (i11 < i12) {
                eVar.X = i12;
            }
        }
        if (fVar.V[1] != aVar3 && eVar.V[1] == aVar) {
            int i13 = eVar.L.f4407g;
            int o10 = fVar.o() - eVar.N.f4407g;
            d dVar4 = eVar.L;
            dVar4.f4409i = dVar.k(dVar4);
            d dVar5 = eVar.N;
            dVar5.f4409i = dVar.k(dVar5);
            dVar.d(eVar.L.f4409i, i13);
            dVar.d(eVar.N.f4409i, o10);
            if (eVar.f4426d0 > 0 || eVar.f4438j0 == 8) {
                d dVar6 = eVar.O;
                dVar6.f4409i = dVar.k(dVar6);
                dVar.d(eVar.O.f4409i, eVar.f4426d0 + i13);
            }
            eVar.f4451q = 2;
            eVar.f4424c0 = i13;
            int i14 = o10 - i13;
            eVar.Y = i14;
            int i15 = eVar.f4430f0;
            if (i14 < i15) {
                eVar.Y = i15;
            }
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
