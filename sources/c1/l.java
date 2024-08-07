package c1;

import a1.d;
import c1.d;

/* compiled from: Placeholder */
public final class l extends m {
    public final void V(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        int i14 = this.C0 + this.D0 + 0;
        int i15 = this.f4508y0 + this.f4509z0 + 0;
        if (this.f4506x0 > 0) {
            i14 += this.f4505w0[0].u();
            i15 += this.f4505w0[0].o();
        }
        int max = Math.max(this.f4428e0, i14);
        int max2 = Math.max(this.f4430f0, i15);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(max, i11);
            } else if (i10 == 0) {
                i11 = max;
            } else {
                i11 = 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(max2, i13);
            } else if (i12 == 0) {
                i13 = max2;
            } else {
                i13 = 0;
            }
        }
        this.F0 = i11;
        this.G0 = i13;
        R(i11);
        O(i13);
        if (this.f4506x0 > 0) {
            z10 = true;
        }
        this.E0 = z10;
    }

    public final void e(d dVar, boolean z10) {
        super.e(dVar, z10);
        if (this.f4506x0 > 0) {
            e eVar = this.f4505w0[0];
            eVar.H();
            eVar.f4434h0 = 0.5f;
            eVar.f4432g0 = 0.5f;
            d.a aVar = d.a.LEFT;
            eVar.h(aVar, this, aVar, 0);
            d.a aVar2 = d.a.RIGHT;
            eVar.h(aVar2, this, aVar2, 0);
            d.a aVar3 = d.a.TOP;
            eVar.h(aVar3, this, aVar3, 0);
            d.a aVar4 = d.a.BOTTOM;
            eVar.h(aVar4, this, aVar4, 0);
        }
    }
}
