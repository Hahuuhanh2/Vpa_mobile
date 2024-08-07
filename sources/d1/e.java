package d1;

import android.support.v4.media.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import c1.d;
import c1.e;
import c1.f;
import c1.h;
import c1.j;
import d1.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public f f8495a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8496b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8497c = true;

    /* renamed from: d  reason: collision with root package name */
    public f f8498d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f8499e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0085b f8500f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f8501g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<m> f8502h;

    public e(f fVar) {
        new ArrayList();
        this.f8500f = null;
        this.f8501g = new b.a();
        this.f8502h = new ArrayList<>();
        this.f8495a = fVar;
        this.f8498d = fVar;
    }

    public final void a(f fVar, int i10, int i11, ArrayList arrayList, m mVar) {
        p pVar = fVar.f8506d;
        if (pVar.f8530c == null) {
            f fVar2 = this.f8495a;
            if (pVar != fVar2.f4425d && pVar != fVar2.f4427e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f8530c = mVar;
                mVar.f8519b.add(pVar);
                Iterator it = pVar.f8535h.f8513k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i10, 0, arrayList, mVar);
                    }
                }
                Iterator it2 = pVar.f8536i.f8513k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i10, 1, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f8520k.f8513k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i10, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = pVar.f8535h.f8514l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i10, 0, arrayList, mVar);
                }
                Iterator it5 = pVar.f8536i.f8514l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i10, 1, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f8520k.f8514l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i10, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    public final void b(f fVar) {
        e.a aVar;
        e.a aVar2;
        int i10;
        e.a aVar3;
        f fVar2 = fVar;
        e.a aVar4 = e.a.MATCH_CONSTRAINT;
        e.a aVar5 = e.a.WRAP_CONTENT;
        e.a aVar6 = e.a.FIXED;
        Iterator<c1.e> it = fVar2.f4510w0.iterator();
        while (it.hasNext()) {
            c1.e next = it.next();
            e.a[] aVarArr = next.V;
            e.a aVar7 = aVarArr[0];
            e.a aVar8 = aVarArr[1];
            if (next.f4438j0 == 8) {
                next.f4419a = true;
            } else {
                float f10 = next.f4464x;
                if (f10 < 1.0f && aVar7 == aVar4) {
                    next.f4455s = 2;
                }
                float f11 = next.A;
                if (f11 < 1.0f && aVar8 == aVar4) {
                    next.f4457t = 2;
                }
                if (next.Z > 0.0f) {
                    if (aVar7 == aVar4 && (aVar8 == aVar5 || aVar8 == aVar6)) {
                        next.f4455s = 3;
                    } else if (aVar8 == aVar4 && (aVar7 == aVar5 || aVar7 == aVar6)) {
                        next.f4457t = 3;
                    } else if (aVar7 == aVar4 && aVar8 == aVar4) {
                        if (next.f4455s == 0) {
                            next.f4455s = 3;
                        }
                        if (next.f4457t == 0) {
                            next.f4457t = 3;
                        }
                    }
                }
                if (aVar7 == aVar4 && next.f4455s == 1 && (next.K.f4406f == null || next.M.f4406f == null)) {
                    aVar7 = aVar5;
                }
                if (aVar8 == aVar4 && next.f4457t == 1 && (next.L.f4406f == null || next.N.f4406f == null)) {
                    aVar = aVar5;
                } else {
                    aVar = aVar8;
                }
                l lVar = next.f4425d;
                lVar.f8531d = aVar7;
                int i11 = next.f4455s;
                lVar.f8528a = i11;
                n nVar = next.f4427e;
                nVar.f8531d = aVar;
                int i12 = next.f4457t;
                nVar.f8528a = i12;
                e.a aVar9 = e.a.MATCH_PARENT;
                if ((aVar7 == aVar9 || aVar7 == aVar6 || aVar7 == aVar5) && (aVar == aVar9 || aVar == aVar6 || aVar == aVar5)) {
                    int u10 = next.u();
                    if (aVar7 == aVar9) {
                        u10 = (fVar.u() - next.K.f4407g) - next.M.f4407g;
                        aVar2 = aVar6;
                    } else {
                        aVar2 = aVar7;
                    }
                    int o10 = next.o();
                    if (aVar == aVar9) {
                        i10 = (fVar.o() - next.L.f4407g) - next.N.f4407g;
                        aVar3 = aVar6;
                    } else {
                        i10 = o10;
                        aVar3 = aVar;
                    }
                    int i13 = u10;
                    c1.e eVar = next;
                    f(next, aVar2, i13, aVar3, i10);
                    eVar.f4425d.f8532e.d(eVar.u());
                    eVar.f4427e.f8532e.d(eVar.o());
                    eVar.f4419a = true;
                } else {
                    if (aVar7 == aVar4 && (aVar == aVar5 || aVar == aVar6)) {
                        if (i11 == 3) {
                            if (aVar == aVar5) {
                                f(next, aVar5, 0, aVar5, 0);
                            }
                            int o11 = next.o();
                            f(next, aVar6, (int) ((((float) o11) * next.Z) + 0.5f), aVar6, o11);
                            next.f4425d.f8532e.d(next.u());
                            next.f4427e.f8532e.d(next.o());
                            next.f4419a = true;
                        } else if (i11 == 1) {
                            f(next, aVar5, 0, aVar, 0);
                            next.f4425d.f8532e.f8515m = next.u();
                        } else if (i11 == 2) {
                            e.a aVar10 = fVar2.V[0];
                            if (aVar10 == aVar6 || aVar10 == aVar9) {
                                f(next, aVar6, (int) ((f10 * ((float) fVar.u())) + 0.5f), aVar, next.o());
                                next.f4425d.f8532e.d(next.u());
                                next.f4427e.f8532e.d(next.o());
                                next.f4419a = true;
                            }
                        } else {
                            d[] dVarArr = next.S;
                            if (dVarArr[0].f4406f == null || dVarArr[1].f4406f == null) {
                                f(next, aVar5, 0, aVar, 0);
                                next.f4425d.f8532e.d(next.u());
                                next.f4427e.f8532e.d(next.o());
                                next.f4419a = true;
                            }
                        }
                    }
                    if (aVar == aVar4 && (aVar7 == aVar5 || aVar7 == aVar6)) {
                        if (i12 == 3) {
                            if (aVar7 == aVar5) {
                                f(next, aVar5, 0, aVar5, 0);
                            }
                            int u11 = next.u();
                            float f12 = next.Z;
                            if (next.f4420a0 == -1) {
                                f12 = 1.0f / f12;
                            }
                            f(next, aVar6, u11, aVar6, (int) ((((float) u11) * f12) + 0.5f));
                            next.f4425d.f8532e.d(next.u());
                            next.f4427e.f8532e.d(next.o());
                            next.f4419a = true;
                        } else if (i12 == 1) {
                            f(next, aVar7, 0, aVar5, 0);
                            next.f4427e.f8532e.f8515m = next.o();
                        } else if (i12 == 2) {
                            e.a aVar11 = fVar2.V[1];
                            if (aVar11 == aVar6 || aVar11 == aVar9) {
                                f(next, aVar7, next.u(), aVar6, (int) ((f11 * ((float) fVar.o())) + 0.5f));
                                next.f4425d.f8532e.d(next.u());
                                next.f4427e.f8532e.d(next.o());
                                next.f4419a = true;
                            }
                        } else {
                            d[] dVarArr2 = next.S;
                            if (dVarArr2[2].f4406f == null || dVarArr2[3].f4406f == null) {
                                f(next, aVar5, 0, aVar, 0);
                                next.f4425d.f8532e.d(next.u());
                                next.f4427e.f8532e.d(next.o());
                                next.f4419a = true;
                            }
                        }
                    }
                    if (aVar7 == aVar4 && aVar == aVar4) {
                        if (i11 == 1 || i12 == 1) {
                            f(next, aVar5, 0, aVar5, 0);
                            next.f4425d.f8532e.f8515m = next.u();
                            next.f4427e.f8532e.f8515m = next.o();
                        } else if (i12 == 2 && i11 == 2) {
                            e.a[] aVarArr2 = fVar2.V;
                            if (aVarArr2[0] == aVar6 && aVarArr2[1] == aVar6) {
                                c1.e eVar2 = next;
                                e.a aVar12 = aVar6;
                                f(eVar2, aVar12, (int) ((f10 * ((float) fVar.u())) + 0.5f), aVar6, (int) ((f11 * ((float) fVar.o())) + 0.5f));
                                next.f4425d.f8532e.d(next.u());
                                next.f4427e.f8532e.d(next.o());
                                next.f4419a = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = this.f8499e;
        arrayList.clear();
        this.f8498d.f4425d.f();
        this.f8498d.f4427e.f();
        arrayList.add(this.f8498d.f4425d);
        arrayList.add(this.f8498d.f4427e);
        Iterator<c1.e> it = this.f8498d.f4510w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            c1.e next = it.next();
            if (next instanceof h) {
                arrayList.add(new j(next));
            } else {
                if (next.B()) {
                    if (next.f4421b == null) {
                        next.f4421b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f4421b);
                } else {
                    arrayList.add(next.f4425d);
                }
                if (next.C()) {
                    if (next.f4423c == null) {
                        next.f4423c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f4423c);
                } else {
                    arrayList.add(next.f4427e);
                }
                if (next instanceof j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f8529b != this.f8498d) {
                next2.d();
            }
        }
        this.f8502h.clear();
        e(this.f8495a.f4425d, 0, this.f8502h);
        e(this.f8495a.f4427e, 1, this.f8502h);
        this.f8496b = false;
    }

    public final int d(f fVar, int i10) {
        p pVar;
        p pVar2;
        float f10;
        long j10;
        e eVar = this;
        f fVar2 = fVar;
        int i11 = i10;
        int size = eVar.f8502h.size();
        long j11 = 0;
        int i12 = 0;
        long j12 = 0;
        while (i12 < size) {
            m mVar = eVar.f8502h.get(i12);
            p pVar3 = mVar.f8518a;
            if (pVar3 instanceof c) {
                if (((c) pVar3).f8533f != i11) {
                    j11 = Math.max(j11, j12);
                    i12++;
                    j12 = 0;
                    eVar = this;
                    fVar2 = fVar;
                }
            } else if (i11 == 0) {
                if (!(pVar3 instanceof l)) {
                    j11 = Math.max(j11, j12);
                    i12++;
                    j12 = 0;
                    eVar = this;
                    fVar2 = fVar;
                }
            } else if (!(pVar3 instanceof n)) {
                j11 = Math.max(j11, j12);
                i12++;
                j12 = 0;
                eVar = this;
                fVar2 = fVar;
            }
            if (i11 == 0) {
                pVar = fVar2.f4425d;
            } else {
                pVar = fVar2.f4427e;
            }
            f fVar3 = pVar.f8535h;
            if (i11 == 0) {
                pVar2 = fVar2.f4425d;
            } else {
                pVar2 = fVar2.f4427e;
            }
            f fVar4 = pVar2.f8536i;
            boolean contains = pVar3.f8535h.f8514l.contains(fVar3);
            boolean contains2 = mVar.f8518a.f8536i.f8514l.contains(fVar4);
            long j13 = mVar.f8518a.j();
            if (!contains || !contains2) {
                if (contains) {
                    f fVar5 = mVar.f8518a.f8535h;
                    j12 = Math.max(m.b(fVar5, (long) fVar5.f8508f), ((long) mVar.f8518a.f8535h.f8508f) + j13);
                } else if (contains2) {
                    f fVar6 = mVar.f8518a.f8536i;
                    j12 = Math.max(-m.a(fVar6, (long) fVar6.f8508f), ((long) (-mVar.f8518a.f8536i.f8508f)) + j13);
                } else {
                    p pVar4 = mVar.f8518a;
                    j12 = (pVar4.j() + ((long) pVar4.f8535h.f8508f)) - ((long) mVar.f8518a.f8536i.f8508f);
                }
                j11 = Math.max(j11, j12);
                i12++;
                j12 = 0;
                eVar = this;
                fVar2 = fVar;
            } else {
                long b10 = m.b(mVar.f8518a.f8535h, j12);
                long a10 = m.a(mVar.f8518a.f8536i, j12);
                long j14 = b10 - j13;
                p pVar5 = mVar.f8518a;
                int i13 = pVar5.f8536i.f8508f;
                if (j14 >= ((long) (-i13))) {
                    j14 += (long) i13;
                }
                long j15 = (long) pVar5.f8535h.f8508f;
                long j16 = ((-a10) - j13) - j15;
                if (j16 >= j15) {
                    j16 -= j15;
                }
                c1.e eVar2 = pVar5.f8529b;
                if (i11 == 0) {
                    f10 = eVar2.f4432g0;
                } else if (i11 == 1) {
                    f10 = eVar2.f4434h0;
                } else {
                    eVar2.getClass();
                    f10 = -1.0f;
                }
                if (f10 > 0.0f) {
                    j10 = (long) ((((float) j14) / (1.0f - f10)) + (((float) j16) / f10));
                } else {
                    j10 = 0;
                }
                float f11 = (float) j10;
                long e10 = ((long) ((f11 * f10) + 0.5f)) + j13 + ((long) a.e(1.0f, f10, f11, 0.5f));
                p pVar6 = mVar.f8518a;
                j12 = (((long) pVar6.f8535h.f8508f) + e10) - ((long) pVar6.f8536i.f8508f);
                j11 = Math.max(j11, j12);
                i12++;
                j12 = 0;
                eVar = this;
                fVar2 = fVar;
            }
        }
        return (int) j11;
    }

    public final void e(p pVar, int i10, ArrayList<m> arrayList) {
        Iterator it = pVar.f8535h.f8513k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, arrayList, (m) null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f8535h, i10, 0, arrayList, (m) null);
            }
        }
        Iterator it2 = pVar.f8536i.f8513k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, arrayList, (m) null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f8536i, i10, 1, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((n) pVar).f8520k.f8513k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, arrayList, (m) null);
                }
            }
        }
    }

    public final void f(c1.e eVar, e.a aVar, int i10, e.a aVar2, int i11) {
        boolean z10;
        b.a aVar3 = this.f8501g;
        aVar3.f8483a = aVar;
        aVar3.f8484b = aVar2;
        aVar3.f8485c = i10;
        aVar3.f8486d = i11;
        ((ConstraintLayout.a) this.f8500f).b(eVar, aVar3);
        eVar.R(this.f8501g.f8487e);
        eVar.O(this.f8501g.f8488f);
        b.a aVar4 = this.f8501g;
        eVar.F = aVar4.f8490h;
        int i12 = aVar4.f8489g;
        eVar.f4426d0 = i12;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.F = z10;
    }

    public final void g() {
        boolean z10;
        a aVar;
        e.a aVar2 = e.a.FIXED;
        e.a aVar3 = e.a.MATCH_CONSTRAINT;
        Iterator<c1.e> it = this.f8495a.f4510w0.iterator();
        while (it.hasNext()) {
            c1.e next = it.next();
            if (!next.f4419a) {
                e.a[] aVarArr = next.V;
                boolean z11 = false;
                e.a aVar4 = aVarArr[0];
                e.a aVar5 = aVarArr[1];
                int i10 = next.f4455s;
                int i11 = next.f4457t;
                e.a aVar6 = e.a.WRAP_CONTENT;
                if (aVar4 == aVar6 || (aVar4 == aVar3 && i10 == 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (aVar5 == aVar6 || (aVar5 == aVar3 && i11 == 1)) {
                    z11 = true;
                }
                g gVar = next.f4425d.f8532e;
                boolean z12 = gVar.f8512j;
                g gVar2 = next.f4427e.f8532e;
                boolean z13 = gVar2.f8512j;
                if (z12 && z13) {
                    f(next, aVar2, gVar.f8509g, aVar2, gVar2.f8509g);
                    next.f4419a = true;
                } else if (z12 && z11) {
                    f(next, aVar2, gVar.f8509g, aVar6, gVar2.f8509g);
                    if (aVar5 == aVar3) {
                        next.f4427e.f8532e.f8515m = next.o();
                    } else {
                        next.f4427e.f8532e.d(next.o());
                        next.f4419a = true;
                    }
                } else if (z13 && z10) {
                    f(next, aVar6, gVar.f8509g, aVar2, gVar2.f8509g);
                    if (aVar4 == aVar3) {
                        next.f4425d.f8532e.f8515m = next.u();
                    } else {
                        next.f4425d.f8532e.d(next.u());
                        next.f4419a = true;
                    }
                }
                if (next.f4419a && (aVar = next.f4427e.f8521l) != null) {
                    aVar.d(next.f4426d0);
                }
            }
        }
    }
}
