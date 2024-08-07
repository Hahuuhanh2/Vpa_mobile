package d1;

import c1.d;
import c1.e;
import c1.f;
import d1.b;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Direct */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f8516a = new b.a();

    public static boolean a(e eVar) {
        f fVar;
        boolean z10;
        boolean z11;
        e.a aVar = e.a.MATCH_CONSTRAINT;
        e.a aVar2 = e.a.WRAP_CONTENT;
        e.a aVar3 = e.a.FIXED;
        e.a[] aVarArr = eVar.V;
        e.a aVar4 = aVarArr[0];
        e.a aVar5 = aVarArr[1];
        e eVar2 = eVar.W;
        if (eVar2 != null) {
            fVar = (f) eVar2;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            e.a aVar6 = fVar.V[0];
        }
        if (fVar != null) {
            e.a aVar7 = fVar.V[1];
        }
        if (aVar4 == aVar3 || eVar.E() || aVar4 == aVar2 || ((aVar4 == aVar && eVar.f4455s == 0 && eVar.Z == 0.0f && eVar.x(0)) || (aVar4 == aVar && eVar.f4455s == 1 && eVar.y(0, eVar.u())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar5 == aVar3 || eVar.F() || aVar5 == aVar2 || ((aVar5 == aVar && eVar.f4457t == 0 && eVar.Z == 0.0f && eVar.x(1)) || (aVar5 == aVar && eVar.f4457t == 1 && eVar.y(1, eVar.o())))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (eVar.Z > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public static void b(int i10, e eVar, b.C0085b bVar, boolean z10) {
        boolean z11;
        d dVar;
        d dVar2;
        boolean z12;
        d dVar3;
        d dVar4;
        e eVar2 = eVar;
        b.C0085b bVar2 = bVar;
        boolean z13 = z10;
        e.a aVar = e.a.MATCH_CONSTRAINT;
        if (!eVar2.f4445n) {
            if (!(eVar2 instanceof f) && eVar.D() && a(eVar)) {
                f.Y(eVar2, bVar2, new b.a());
            }
            d m10 = eVar2.m(d.a.LEFT);
            d m11 = eVar2.m(d.a.RIGHT);
            int d10 = m10.d();
            int d11 = m11.d();
            HashSet<d> hashSet = m10.f4401a;
            if (hashSet != null && m10.f4403c) {
                Iterator<d> it = hashSet.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    e eVar3 = next.f4404d;
                    int i11 = i10 + 1;
                    boolean a10 = a(eVar3);
                    if (eVar3.D() && a10) {
                        f.Y(eVar3, bVar2, new b.a());
                    }
                    d dVar5 = eVar3.K;
                    if ((next != dVar5 || (dVar4 = eVar3.M.f4406f) == null || !dVar4.f4403c) && (next != eVar3.M || (dVar3 = dVar5.f4406f) == null || !dVar3.f4403c)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    e.a aVar2 = eVar3.V[0];
                    if (aVar2 != aVar || a10) {
                        if (!eVar3.D()) {
                            d dVar6 = eVar3.K;
                            if (next == dVar6 && eVar3.M.f4406f == null) {
                                int e10 = dVar6.e() + d10;
                                eVar3.M(e10, eVar3.u() + e10);
                                b(i11, eVar3, bVar2, z13);
                            } else {
                                d dVar7 = eVar3.M;
                                if (next == dVar7 && dVar6.f4406f == null) {
                                    int e11 = d10 - dVar7.e();
                                    eVar3.M(e11 - eVar3.u(), e11);
                                    b(i11, eVar3, bVar2, z13);
                                } else if (z12 && !eVar3.B()) {
                                    c(i11, eVar3, bVar2, z13);
                                }
                            }
                        }
                    } else if (aVar2 == aVar && eVar3.f4463w >= 0 && eVar3.f4461v >= 0) {
                        if ((eVar3.f4438j0 == 8 || (eVar3.f4455s == 0 && eVar3.Z == 0.0f)) && !eVar3.B() && !eVar3.H && z12 && !eVar3.B()) {
                            d(i11, eVar2, bVar2, eVar3, z13);
                        }
                    }
                }
            }
            if (!(eVar2 instanceof c1.h)) {
                HashSet<d> hashSet2 = m11.f4401a;
                if (hashSet2 != null && m11.f4403c) {
                    Iterator<d> it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        d next2 = it2.next();
                        e eVar4 = next2.f4404d;
                        int i12 = i10 + 1;
                        boolean a11 = a(eVar4);
                        if (eVar4.D() && a11) {
                            f.Y(eVar4, bVar2, new b.a());
                        }
                        d dVar8 = eVar4.K;
                        if ((next2 != dVar8 || (dVar2 = eVar4.M.f4406f) == null || !dVar2.f4403c) && (next2 != eVar4.M || (dVar = dVar8.f4406f) == null || !dVar.f4403c)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        e.a aVar3 = eVar4.V[0];
                        if (aVar3 != aVar || a11) {
                            if (!eVar4.D()) {
                                d dVar9 = eVar4.K;
                                if (next2 == dVar9 && eVar4.M.f4406f == null) {
                                    int e12 = dVar9.e() + d11;
                                    eVar4.M(e12, eVar4.u() + e12);
                                    b(i12, eVar4, bVar2, z13);
                                } else {
                                    d dVar10 = eVar4.M;
                                    if (next2 == dVar10 && dVar9.f4406f == null) {
                                        int e13 = d11 - dVar10.e();
                                        eVar4.M(e13 - eVar4.u(), e13);
                                        b(i12, eVar4, bVar2, z13);
                                    } else if (z11 && !eVar4.B()) {
                                        c(i12, eVar4, bVar2, z13);
                                    }
                                }
                            }
                        } else if (aVar3 == aVar && eVar4.f4463w >= 0 && eVar4.f4461v >= 0) {
                            if (eVar4.f4438j0 != 8) {
                                if (eVar4.f4455s == 0) {
                                    if (eVar4.Z != 0.0f) {
                                    }
                                }
                            }
                            if (!eVar4.B() && !eVar4.H && z11 && !eVar4.B()) {
                                d(i12, eVar2, bVar2, eVar4, z13);
                            }
                        }
                    }
                }
                eVar2.f4445n = true;
            }
        }
    }

    public static void c(int i10, e eVar, b.C0085b bVar, boolean z10) {
        float f10;
        float f11 = eVar.f4432g0;
        int d10 = eVar.K.f4406f.d();
        int d11 = eVar.M.f4406f.d();
        int e10 = eVar.K.e() + d10;
        int e11 = d11 - eVar.M.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int u10 = eVar.u();
        int i11 = (d11 - d10) - u10;
        if (d10 > d11) {
            i11 = (d10 - d11) - u10;
        }
        if (i11 > 0) {
            f10 = (f11 * ((float) i11)) + 0.5f;
        } else {
            f10 = f11 * ((float) i11);
        }
        int i12 = ((int) f10) + d10;
        int i13 = i12 + u10;
        if (d10 > d11) {
            i13 = i12 - u10;
        }
        eVar.M(i12, i13);
        b(i10 + 1, eVar, bVar, z10);
    }

    public static void d(int i10, e eVar, b.C0085b bVar, e eVar2, boolean z10) {
        int i11;
        float f10 = eVar2.f4432g0;
        int e10 = eVar2.K.e() + eVar2.K.f4406f.d();
        int d10 = eVar2.M.f4406f.d() - eVar2.M.e();
        if (d10 >= e10) {
            int u10 = eVar2.u();
            if (eVar2.f4438j0 != 8) {
                int i12 = eVar2.f4455s;
                if (i12 == 2) {
                    if (eVar instanceof f) {
                        i11 = eVar.u();
                    } else {
                        i11 = eVar.W.u();
                    }
                    u10 = (int) (eVar2.f4432g0 * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    u10 = d10 - e10;
                }
                u10 = Math.max(eVar2.f4461v, u10);
                int i13 = eVar2.f4463w;
                if (i13 > 0) {
                    u10 = Math.min(i13, u10);
                }
            }
            int i14 = e10 + ((int) ((f10 * ((float) ((d10 - e10) - u10))) + 0.5f));
            eVar2.M(i14, u10 + i14);
            b(i10 + 1, eVar2, bVar, z10);
        }
    }

    public static void e(int i10, e eVar, b.C0085b bVar) {
        float f10;
        float f11 = eVar.f4434h0;
        int d10 = eVar.L.f4406f.d();
        int d11 = eVar.N.f4406f.d();
        int e10 = eVar.L.e() + d10;
        int e11 = d11 - eVar.N.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int o10 = eVar.o();
        int i11 = (d11 - d10) - o10;
        if (d10 > d11) {
            i11 = (d10 - d11) - o10;
        }
        if (i11 > 0) {
            f10 = (f11 * ((float) i11)) + 0.5f;
        } else {
            f10 = f11 * ((float) i11);
        }
        int i12 = (int) f10;
        int i13 = d10 + i12;
        int i14 = i13 + o10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - o10;
        }
        eVar.N(i13, i14);
        g(i10 + 1, eVar, bVar);
    }

    public static void f(int i10, e eVar, b.C0085b bVar, e eVar2) {
        int i11;
        float f10 = eVar2.f4434h0;
        int e10 = eVar2.L.e() + eVar2.L.f4406f.d();
        int d10 = eVar2.N.f4406f.d() - eVar2.N.e();
        if (d10 >= e10) {
            int o10 = eVar2.o();
            if (eVar2.f4438j0 != 8) {
                int i12 = eVar2.f4457t;
                if (i12 == 2) {
                    if (eVar instanceof f) {
                        i11 = eVar.o();
                    } else {
                        i11 = eVar.W.o();
                    }
                    o10 = (int) (f10 * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    o10 = d10 - e10;
                }
                o10 = Math.max(eVar2.f4465y, o10);
                int i13 = eVar2.f4466z;
                if (i13 > 0) {
                    o10 = Math.min(i13, o10);
                }
            }
            int i14 = e10 + ((int) ((f10 * ((float) ((d10 - e10) - o10))) + 0.5f));
            eVar2.N(i14, o10 + i14);
            g(i10 + 1, eVar2, bVar);
        }
    }

    public static void g(int i10, e eVar, b.C0085b bVar) {
        boolean z10;
        d dVar;
        d dVar2;
        boolean z11;
        d dVar3;
        d dVar4;
        e eVar2 = eVar;
        b.C0085b bVar2 = bVar;
        e.a aVar = e.a.MATCH_CONSTRAINT;
        if (!eVar2.f4447o) {
            if (!(eVar2 instanceof f) && eVar.D() && a(eVar)) {
                f.Y(eVar2, bVar2, new b.a());
            }
            d m10 = eVar2.m(d.a.TOP);
            d m11 = eVar2.m(d.a.BOTTOM);
            int d10 = m10.d();
            int d11 = m11.d();
            HashSet<d> hashSet = m10.f4401a;
            if (hashSet != null && m10.f4403c) {
                Iterator<d> it = hashSet.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    e eVar3 = next.f4404d;
                    int i11 = i10 + 1;
                    boolean a10 = a(eVar3);
                    if (eVar3.D() && a10) {
                        f.Y(eVar3, bVar2, new b.a());
                    }
                    d dVar5 = eVar3.L;
                    if ((next != dVar5 || (dVar4 = eVar3.N.f4406f) == null || !dVar4.f4403c) && (next != eVar3.N || (dVar3 = dVar5.f4406f) == null || !dVar3.f4403c)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    e.a aVar2 = eVar3.V[1];
                    if (aVar2 != aVar || a10) {
                        if (!eVar3.D()) {
                            d dVar6 = eVar3.L;
                            if (next == dVar6 && eVar3.N.f4406f == null) {
                                int e10 = dVar6.e() + d10;
                                eVar3.N(e10, eVar3.o() + e10);
                                g(i11, eVar3, bVar2);
                            } else {
                                d dVar7 = eVar3.N;
                                if (next == dVar7 && dVar6.f4406f == null) {
                                    int e11 = d10 - dVar7.e();
                                    eVar3.N(e11 - eVar3.o(), e11);
                                    g(i11, eVar3, bVar2);
                                } else if (z11 && !eVar3.C()) {
                                    e(i11, eVar3, bVar2);
                                }
                            }
                        }
                    } else if (aVar2 == aVar && eVar3.f4466z >= 0 && eVar3.f4465y >= 0) {
                        if ((eVar3.f4438j0 == 8 || (eVar3.f4457t == 0 && eVar3.Z == 0.0f)) && !eVar3.C() && !eVar3.H && z11 && !eVar3.C()) {
                            f(i11, eVar2, bVar2, eVar3);
                        }
                    }
                }
            }
            if (!(eVar2 instanceof c1.h)) {
                HashSet<d> hashSet2 = m11.f4401a;
                if (hashSet2 != null && m11.f4403c) {
                    Iterator<d> it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        d next2 = it2.next();
                        e eVar4 = next2.f4404d;
                        int i12 = i10 + 1;
                        boolean a11 = a(eVar4);
                        if (eVar4.D() && a11) {
                            f.Y(eVar4, bVar2, new b.a());
                        }
                        d dVar8 = eVar4.L;
                        if ((next2 != dVar8 || (dVar2 = eVar4.N.f4406f) == null || !dVar2.f4403c) && (next2 != eVar4.N || (dVar = dVar8.f4406f) == null || !dVar.f4403c)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e.a aVar3 = eVar4.V[1];
                        if (aVar3 != aVar || a11) {
                            if (!eVar4.D()) {
                                d dVar9 = eVar4.L;
                                if (next2 == dVar9 && eVar4.N.f4406f == null) {
                                    int e12 = dVar9.e() + d11;
                                    eVar4.N(e12, eVar4.o() + e12);
                                    g(i12, eVar4, bVar2);
                                } else {
                                    d dVar10 = eVar4.N;
                                    if (next2 == dVar10 && dVar9.f4406f == null) {
                                        int e13 = d11 - dVar10.e();
                                        eVar4.N(e13 - eVar4.o(), e13);
                                        g(i12, eVar4, bVar2);
                                    } else if (z10 && !eVar4.C()) {
                                        e(i12, eVar4, bVar2);
                                    }
                                }
                            }
                        } else if (aVar3 == aVar && eVar4.f4466z >= 0 && eVar4.f4465y >= 0) {
                            if ((eVar4.f4438j0 == 8 || (eVar4.f4457t == 0 && eVar4.Z == 0.0f)) && !eVar4.C() && !eVar4.H && z10 && !eVar4.C()) {
                                f(i12, eVar2, bVar2, eVar4);
                            }
                        }
                    }
                }
                d m12 = eVar2.m(d.a.BASELINE);
                if (m12.f4401a != null && m12.f4403c) {
                    int d12 = m12.d();
                    Iterator<d> it3 = m12.f4401a.iterator();
                    while (it3.hasNext()) {
                        d next3 = it3.next();
                        e eVar5 = next3.f4404d;
                        int i13 = i10 + 1;
                        boolean a12 = a(eVar5);
                        if (eVar5.D() && a12) {
                            f.Y(eVar5, bVar2, new b.a());
                        }
                        if ((eVar5.V[1] != aVar || a12) && !eVar5.D() && next3 == eVar5.O) {
                            int e14 = next3.e() + d12;
                            if (eVar5.F) {
                                int i14 = e14 - eVar5.f4426d0;
                                int i15 = eVar5.Y + i14;
                                eVar5.f4424c0 = i14;
                                eVar5.L.l(i14);
                                eVar5.N.l(i15);
                                eVar5.O.l(e14);
                                eVar5.f4443m = true;
                            }
                            try {
                                g(i13, eVar5, bVar2);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                eVar2.f4447o = true;
            }
        }
    }
}
