package d1;

import androidx.constraintlayout.widget.ConstraintLayout;
import c1.e;
import c1.f;
import java.util.ArrayList;

/* compiled from: BasicMeasure */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f8480a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f8481b = new a();

    /* renamed from: c  reason: collision with root package name */
    public f f8482c;

    /* compiled from: BasicMeasure */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.a f8483a;

        /* renamed from: b  reason: collision with root package name */
        public e.a f8484b;

        /* renamed from: c  reason: collision with root package name */
        public int f8485c;

        /* renamed from: d  reason: collision with root package name */
        public int f8486d;

        /* renamed from: e  reason: collision with root package name */
        public int f8487e;

        /* renamed from: f  reason: collision with root package name */
        public int f8488f;

        /* renamed from: g  reason: collision with root package name */
        public int f8489g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8490h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8491i;

        /* renamed from: j  reason: collision with root package name */
        public int f8492j;
    }

    /* renamed from: d1.b$b  reason: collision with other inner class name */
    /* compiled from: BasicMeasure */
    public interface C0085b {
    }

    public b(f fVar) {
        this.f8482c = fVar;
    }

    public final boolean a(int i10, e eVar, C0085b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        e.a aVar = e.a.FIXED;
        a aVar2 = this.f8481b;
        e.a[] aVarArr = eVar.V;
        aVar2.f8483a = aVarArr[0];
        boolean z14 = true;
        aVar2.f8484b = aVarArr[1];
        aVar2.f8485c = eVar.u();
        this.f8481b.f8486d = eVar.o();
        a aVar3 = this.f8481b;
        aVar3.f8491i = false;
        aVar3.f8492j = i10;
        e.a aVar4 = aVar3.f8483a;
        e.a aVar5 = e.a.MATCH_CONSTRAINT;
        if (aVar4 == aVar5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar3.f8484b == aVar5) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || eVar.Z <= 0.0f) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z11 || eVar.Z <= 0.0f) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z12 && eVar.f4459u[0] == 4) {
            aVar3.f8483a = aVar;
        }
        if (z13 && eVar.f4459u[1] == 4) {
            aVar3.f8484b = aVar;
        }
        ((ConstraintLayout.a) bVar).b(eVar, aVar3);
        eVar.R(this.f8481b.f8487e);
        eVar.O(this.f8481b.f8488f);
        a aVar6 = this.f8481b;
        eVar.F = aVar6.f8490h;
        int i11 = aVar6.f8489g;
        eVar.f4426d0 = i11;
        if (i11 <= 0) {
            z14 = false;
        }
        eVar.F = z14;
        aVar6.f8492j = 0;
        return aVar6.f8491i;
    }

    public final void b(f fVar, int i10, int i11, int i12) {
        int i13 = fVar.f4428e0;
        int i14 = fVar.f4430f0;
        fVar.f4428e0 = 0;
        fVar.f4430f0 = 0;
        fVar.R(i11);
        fVar.O(i12);
        if (i13 < 0) {
            fVar.f4428e0 = 0;
        } else {
            fVar.f4428e0 = i13;
        }
        if (i14 < 0) {
            fVar.f4430f0 = 0;
        } else {
            fVar.f4430f0 = i14;
        }
        f fVar2 = this.f8482c;
        fVar2.f4474z0 = i10;
        fVar2.U();
    }

    public final void c(f fVar) {
        this.f8480a.clear();
        int size = fVar.f4510w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = fVar.f4510w0.get(i10);
            e.a[] aVarArr = eVar.V;
            e.a aVar = aVarArr[0];
            e.a aVar2 = e.a.MATCH_CONSTRAINT;
            if (aVar == aVar2 || aVarArr[1] == aVar2) {
                this.f8480a.add(eVar);
            }
        }
        fVar.f4473y0.f8496b = true;
    }
}
