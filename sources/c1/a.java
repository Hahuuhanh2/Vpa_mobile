package c1;

import a1.b;
import a1.g;
import c1.d;
import c1.e;
import f0.b0;
import java.util.HashMap;

/* compiled from: Barrier */
public final class a extends j {
    public int A0 = 0;
    public boolean B0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public int f4382y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f4383z0 = true;

    public final boolean E() {
        return this.B0;
    }

    public final boolean F() {
        return this.B0;
    }

    public final boolean V() {
        int i10;
        int i11;
        int i12;
        d.a aVar = d.a.BOTTOM;
        d.a aVar2 = d.a.TOP;
        d.a aVar3 = d.a.RIGHT;
        d.a aVar4 = d.a.LEFT;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.f4506x0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f4505w0[i13];
            if ((this.f4383z0 || eVar.f()) && ((((i11 = this.f4382y0) == 0 || i11 == 1) && !eVar.E()) || (((i12 = this.f4382y0) == 2 || i12 == 3) && !eVar.F()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f4506x0; i15++) {
            e eVar2 = this.f4505w0[i15];
            if (this.f4383z0 || eVar2.f()) {
                if (!z11) {
                    int i16 = this.f4382y0;
                    if (i16 == 0) {
                        i14 = eVar2.m(aVar4).d();
                    } else if (i16 == 1) {
                        i14 = eVar2.m(aVar3).d();
                    } else if (i16 == 2) {
                        i14 = eVar2.m(aVar2).d();
                    } else if (i16 == 3) {
                        i14 = eVar2.m(aVar).d();
                    }
                    z11 = true;
                }
                int i17 = this.f4382y0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.m(aVar4).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.m(aVar3).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.m(aVar2).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.m(aVar).d());
                }
            }
        }
        int i18 = i14 + this.A0;
        int i19 = this.f4382y0;
        if (i19 == 0 || i19 == 1) {
            M(i18, i18);
        } else {
            N(i18, i18);
        }
        this.B0 = true;
        return true;
    }

    public final int W() {
        int i10 = this.f4382y0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        return -1;
    }

    public final void e(a1.d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        e.a aVar = e.a.MATCH_CONSTRAINT;
        d[] dVarArr2 = this.S;
        dVarArr2[0] = this.K;
        dVarArr2[2] = this.L;
        dVarArr2[1] = this.M;
        dVarArr2[3] = this.N;
        int i13 = 0;
        while (true) {
            dVarArr = this.S;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f4409i = dVar.k(dVar2);
            i13++;
        }
        int i14 = this.f4382y0;
        if (i14 >= 0 && i14 < 4) {
            d dVar3 = dVarArr[i14];
            if (!this.B0) {
                V();
            }
            if (this.B0) {
                this.B0 = false;
                int i15 = this.f4382y0;
                if (i15 == 0 || i15 == 1) {
                    dVar.d(this.K.f4409i, this.f4422b0);
                    dVar.d(this.M.f4409i, this.f4422b0);
                } else if (i15 == 2 || i15 == 3) {
                    dVar.d(this.L.f4409i, this.f4424c0);
                    dVar.d(this.N.f4409i, this.f4424c0);
                }
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= this.f4506x0) {
                        z11 = false;
                        break;
                    }
                    e eVar = this.f4505w0[i16];
                    if ((this.f4383z0 || eVar.f()) && ((((i12 = this.f4382y0) == 0 || i12 == 1) && eVar.V[0] == aVar && eVar.K.f4406f != null && eVar.M.f4406f != null) || ((i12 == 2 || i12 == 3) && eVar.V[1] == aVar && eVar.L.f4406f != null && eVar.N.f4406f != null))) {
                        z11 = true;
                    } else {
                        i16++;
                    }
                }
                if (this.K.g() || this.M.g()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.L.g() || this.N.g()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z11 || (((i11 = this.f4382y0) != 0 || !z12) && ((i11 != 2 || !z13) && ((i11 != 1 || !z12) && (i11 != 3 || !z13))))) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                int i17 = 5;
                if (!z14) {
                    i17 = 4;
                }
                for (int i18 = 0; i18 < this.f4506x0; i18++) {
                    e eVar2 = this.f4505w0[i18];
                    if (this.f4383z0 || eVar2.f()) {
                        g k10 = dVar.k(eVar2.S[this.f4382y0]);
                        d[] dVarArr3 = eVar2.S;
                        int i19 = this.f4382y0;
                        d dVar4 = dVarArr3[i19];
                        dVar4.f4409i = k10;
                        d dVar5 = dVar4.f4406f;
                        if (dVar5 == null || dVar5.f4404d != this) {
                            i10 = 0;
                        } else {
                            i10 = dVar4.f4407g + 0;
                        }
                        if (i19 == 0 || i19 == 2) {
                            b l10 = dVar.l();
                            g m10 = dVar.m();
                            m10.f57d = 0;
                            l10.d(dVar3.f4409i, k10, m10, this.A0 - i10);
                            dVar.c(l10);
                        } else {
                            b l11 = dVar.l();
                            g m11 = dVar.m();
                            m11.f57d = 0;
                            l11.c(dVar3.f4409i, k10, m11, this.A0 + i10);
                            dVar.c(l11);
                        }
                        dVar.e(dVar3.f4409i, k10, this.A0 + i10, i17);
                    }
                }
                int i20 = this.f4382y0;
                if (i20 == 0) {
                    dVar.e(this.M.f4409i, this.K.f4409i, 0, 8);
                    dVar.e(this.K.f4409i, this.W.M.f4409i, 0, 4);
                    dVar.e(this.K.f4409i, this.W.K.f4409i, 0, 0);
                } else if (i20 == 1) {
                    dVar.e(this.K.f4409i, this.M.f4409i, 0, 8);
                    dVar.e(this.K.f4409i, this.W.K.f4409i, 0, 4);
                    dVar.e(this.K.f4409i, this.W.M.f4409i, 0, 0);
                } else if (i20 == 2) {
                    dVar.e(this.N.f4409i, this.L.f4409i, 0, 8);
                    dVar.e(this.L.f4409i, this.W.N.f4409i, 0, 4);
                    dVar.e(this.L.f4409i, this.W.L.f4409i, 0, 0);
                } else if (i20 == 3) {
                    dVar.e(this.L.f4409i, this.N.f4409i, 0, 8);
                    dVar.e(this.L.f4409i, this.W.L.f4409i, 0, 4);
                    dVar.e(this.L.f4409i, this.W.N.f4409i, 0, 0);
                }
            }
        }
    }

    public final boolean f() {
        return true;
    }

    public final void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        a aVar = (a) eVar;
        this.f4382y0 = aVar.f4382y0;
        this.f4383z0 = aVar.f4383z0;
        this.A0 = aVar.A0;
    }

    public final String toString() {
        String o10 = android.support.v4.media.a.o(android.support.v4.media.a.q("[Barrier] "), this.f4442l0, " {");
        for (int i10 = 0; i10 < this.f4506x0; i10++) {
            e eVar = this.f4505w0[i10];
            if (i10 > 0) {
                o10 = b0.r(o10, ", ");
            }
            StringBuilder q10 = android.support.v4.media.a.q(o10);
            q10.append(eVar.f4442l0);
            o10 = q10.toString();
        }
        return b0.r(o10, "}");
    }
}
