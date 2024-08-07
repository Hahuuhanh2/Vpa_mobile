package c1;

import androidx.constraintlayout.widget.ConstraintLayout;
import c1.e;
import d1.b;

/* compiled from: VirtualLayout */
public class m extends j {
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public boolean E0 = false;
    public int F0 = 0;
    public int G0 = 0;
    public b.a H0 = new b.a();
    public b.C0085b I0 = null;

    /* renamed from: y0  reason: collision with root package name */
    public int f4508y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f4509z0 = 0;

    public void V(int i10, int i11, int i12, int i13) {
    }

    public final void W(e eVar, e.a aVar, int i10, e.a aVar2, int i11) {
        b.C0085b bVar;
        boolean z10;
        e eVar2;
        while (true) {
            bVar = this.I0;
            if (bVar != null || (eVar2 = this.W) == null) {
                b.a aVar3 = this.H0;
                aVar3.f8483a = aVar;
                aVar3.f8484b = aVar2;
                aVar3.f8485c = i10;
                aVar3.f8486d = i11;
                ((ConstraintLayout.a) bVar).b(eVar, aVar3);
                eVar.R(this.H0.f8487e);
                eVar.O(this.H0.f8488f);
                b.a aVar4 = this.H0;
                eVar.F = aVar4.f8490h;
                int i12 = aVar4.f8489g;
                eVar.f4426d0 = i12;
            } else {
                this.I0 = ((f) eVar2).A0;
            }
        }
        b.a aVar32 = this.H0;
        aVar32.f8483a = aVar;
        aVar32.f8484b = aVar2;
        aVar32.f8485c = i10;
        aVar32.f8486d = i11;
        ((ConstraintLayout.a) bVar).b(eVar, aVar32);
        eVar.R(this.H0.f8487e);
        eVar.O(this.H0.f8488f);
        b.a aVar42 = this.H0;
        eVar.F = aVar42.f8490h;
        int i122 = aVar42.f8489g;
        eVar.f4426d0 = i122;
        if (i122 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.F = z10;
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f4506x0; i10++) {
            e eVar = this.f4505w0[i10];
            if (eVar != null) {
                eVar.H = true;
            }
        }
    }
}
