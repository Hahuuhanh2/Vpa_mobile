package f0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: SurfaceCombination */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9581a = new ArrayList();

    public static void b(ArrayList arrayList, int i10, int[] iArr, int i11) {
        boolean z10;
        if (i11 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    z10 = false;
                    break;
                } else if (i12 == iArr[i13]) {
                    z10 = true;
                    break;
                } else {
                    i13++;
                }
            }
            if (!z10) {
                iArr[i11] = i12;
                b(arrayList, i10, iArr, i11 + 1);
            }
        }
    }

    public final void a(d dVar) {
        this.f9581a.add(dVar);
    }

    public final List<s0> c(List<s0> list) {
        boolean z10;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f9581a.size()) {
            return null;
        }
        int size = this.f9581a.size();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        b(arrayList, size, new int[size], 0);
        s0[] s0VarArr = new s0[list.size()];
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z12 = true;
            for (int i10 = 0; i10 < this.f9581a.size(); i10++) {
                if (iArr[i10] < list.size()) {
                    s0 s0Var = (s0) this.f9581a.get(i10);
                    s0 s0Var2 = list.get(iArr[i10]);
                    s0Var.getClass();
                    int c10 = s0Var2.c();
                    if (s0Var2.b().f9593a > s0Var.b().f9593a || c10 != s0Var.c()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z12 &= z10;
                    if (!z12) {
                        continue;
                        break;
                    }
                    s0VarArr[iArr[i10]] = (s0) this.f9581a.get(i10);
                }
            }
            if (z12) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            return Arrays.asList(s0VarArr);
        }
        return null;
    }
}
