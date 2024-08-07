package pd;

/* compiled from: DetectionResultRowIndicatorColumn */
public final class g extends x2.g {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14168d;

    public g(c cVar, boolean z10) {
        super(cVar);
        this.f14168d = z10;
    }

    public final a f() {
        d[] dVarArr = (d[]) this.f16905c;
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : dVarArr) {
            if (dVar != null) {
                int i10 = dVar.f14158d;
                int i11 = (dVar.f14157c / 3) + ((i10 / 30) * 3);
                dVar.f14159e = i11;
                int i12 = i10 % 30;
                if (!this.f14168d) {
                    i11 += 2;
                }
                int i13 = i11 % 3;
                if (i13 == 0) {
                    bVar2.b((i12 * 3) + 1);
                } else if (i13 == 1) {
                    bVar4.b(i12 / 3);
                    bVar3.b(i12 % 3);
                } else if (i13 == 2) {
                    bVar.b(i12 + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
        g(dVarArr, aVar);
        return aVar;
    }

    public final void g(d[] dVarArr, a aVar) {
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d dVar = dVarArr[i10];
            if (dVar != null) {
                int i11 = dVar.f14158d % 30;
                int i12 = dVar.f14159e;
                if (i12 > aVar.f14144e) {
                    dVarArr[i10] = null;
                } else {
                    if (!this.f14168d) {
                        i12 += 2;
                    }
                    int i13 = i12 % 3;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2 && i11 + 1 != aVar.f14140a) {
                                dVarArr[i10] = null;
                            }
                        } else if (i11 / 3 != aVar.f14141b || i11 % 3 != aVar.f14143d) {
                            dVarArr[i10] = null;
                        }
                    } else if ((i11 * 3) + 1 != aVar.f14142c) {
                        dVarArr[i10] = null;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "IsLeft: " + this.f14168d + 10 + super.toString();
    }
}
