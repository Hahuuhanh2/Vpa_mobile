package c1;

import a1.b;
import a1.d;
import a1.g;
import c1.d;
import c1.e;
import java.util.HashMap;

/* compiled from: Guideline */
public final class h extends e {
    public int A0;
    public boolean B0;

    /* renamed from: w0  reason: collision with root package name */
    public float f4501w0 = -1.0f;

    /* renamed from: x0  reason: collision with root package name */
    public int f4502x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    public int f4503y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public d f4504z0 = this.L;

    public h() {
        this.A0 = 0;
        this.T.clear();
        this.T.add(this.f4504z0);
        int length = this.S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.S[i10] = this.f4504z0;
        }
    }

    public final boolean E() {
        return this.B0;
    }

    public final boolean F() {
        return this.B0;
    }

    public final void T(d dVar, boolean z10) {
        if (this.W != null) {
            d dVar2 = this.f4504z0;
            dVar.getClass();
            int n10 = d.n(dVar2);
            if (this.A0 == 1) {
                this.f4422b0 = n10;
                this.f4424c0 = 0;
                O(this.W.o());
                R(0);
                return;
            }
            this.f4422b0 = 0;
            this.f4424c0 = n10;
            R(this.W.u());
            O(0);
        }
    }

    public final void U(int i10) {
        this.f4504z0.l(i10);
        this.B0 = true;
    }

    public final void V(int i10) {
        if (this.A0 != i10) {
            this.A0 = i10;
            this.T.clear();
            if (this.A0 == 1) {
                this.f4504z0 = this.K;
            } else {
                this.f4504z0 = this.L;
            }
            this.T.add(this.f4504z0);
            int length = this.S.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.S[i11] = this.f4504z0;
            }
        }
    }

    public final void e(d dVar, boolean z10) {
        boolean z11;
        e.a aVar = e.a.WRAP_CONTENT;
        f fVar = (f) this.W;
        if (fVar != null) {
            d m10 = fVar.m(d.a.LEFT);
            d m11 = fVar.m(d.a.RIGHT);
            e eVar = this.W;
            boolean z12 = true;
            if (eVar == null || eVar.V[0] != aVar) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.A0 == 0) {
                m10 = fVar.m(d.a.TOP);
                m11 = fVar.m(d.a.BOTTOM);
                e eVar2 = this.W;
                if (eVar2 == null || eVar2.V[1] != aVar) {
                    z12 = false;
                }
                z11 = z12;
            }
            if (this.B0) {
                d dVar2 = this.f4504z0;
                if (dVar2.f4403c) {
                    g k10 = dVar.k(dVar2);
                    dVar.d(k10, this.f4504z0.d());
                    if (this.f4502x0 != -1) {
                        if (z11) {
                            dVar.f(dVar.k(m11), k10, 0, 5);
                        }
                    } else if (this.f4503y0 != -1 && z11) {
                        g k11 = dVar.k(m11);
                        dVar.f(k10, dVar.k(m10), 0, 5);
                        dVar.f(k11, k10, 0, 5);
                    }
                    this.B0 = false;
                    return;
                }
            }
            if (this.f4502x0 != -1) {
                g k12 = dVar.k(this.f4504z0);
                dVar.e(k12, dVar.k(m10), this.f4502x0, 8);
                if (z11) {
                    dVar.f(dVar.k(m11), k12, 0, 5);
                }
            } else if (this.f4503y0 != -1) {
                g k13 = dVar.k(this.f4504z0);
                g k14 = dVar.k(m11);
                dVar.e(k13, k14, -this.f4503y0, 8);
                if (z11) {
                    dVar.f(k13, dVar.k(m10), 0, 5);
                    dVar.f(k14, k13, 0, 5);
                }
            } else if (this.f4501w0 != -1.0f) {
                g k15 = dVar.k(this.f4504z0);
                g k16 = dVar.k(m11);
                float f10 = this.f4501w0;
                b l10 = dVar.l();
                l10.f22d.j(k15, -1.0f);
                l10.f22d.j(k16, f10);
                dVar.c(l10);
            }
        }
    }

    public final boolean f() {
        return true;
    }

    public final void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        h hVar = (h) eVar;
        this.f4501w0 = hVar.f4501w0;
        this.f4502x0 = hVar.f4502x0;
        this.f4503y0 = hVar.f4503y0;
        V(hVar.A0);
    }

    public final d m(d.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.A0 == 0) {
                return this.f4504z0;
            }
            return null;
        }
        if (this.A0 == 1) {
            return this.f4504z0;
        }
        return null;
    }
}
