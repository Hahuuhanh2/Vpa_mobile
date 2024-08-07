package c1;

import d1.i;
import d1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget */
public class j extends e implements i {

    /* renamed from: w0  reason: collision with root package name */
    public e[] f4505w0 = new e[4];

    /* renamed from: x0  reason: collision with root package name */
    public int f4506x0 = 0;

    public final void U(int i10, o oVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f4506x0; i11++) {
            oVar.a(this.f4505w0[i11]);
        }
        for (int i12 = 0; i12 < this.f4506x0; i12++) {
            i.a(this.f4505w0[i12], i10, arrayList, oVar);
        }
    }

    public final void a() {
        this.f4506x0 = 0;
        Arrays.fill(this.f4505w0, (Object) null);
    }

    public final void b(e eVar) {
        if (eVar != this && eVar != null) {
            int i10 = this.f4506x0 + 1;
            e[] eVarArr = this.f4505w0;
            if (i10 > eVarArr.length) {
                this.f4505w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.f4505w0;
            int i11 = this.f4506x0;
            eVarArr2[i11] = eVar;
            this.f4506x0 = i11 + 1;
        }
    }

    public void c() {
    }

    public void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        j jVar = (j) eVar;
        this.f4506x0 = 0;
        int i10 = jVar.f4506x0;
        for (int i11 = 0; i11 < i10; i11++) {
            b(hashMap.get(jVar.f4505w0[i11]));
        }
    }
}
