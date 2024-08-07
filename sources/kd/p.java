package kd;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import uc.a;
import uc.b;
import uc.h;

/* compiled from: MultiFormatUPCEANReader */
public final class p extends q {

    /* renamed from: b  reason: collision with root package name */
    public static final u[] f12497b = new u[0];

    /* renamed from: a  reason: collision with root package name */
    public final u[] f12498a;

    public p(Map<b, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(b.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(a.UPC_A)) {
                arrayList.add(new k(1));
            }
            if (collection.contains(a.EAN_8)) {
                arrayList.add(new k(0));
            }
            if (collection.contains(a.UPC_E)) {
                arrayList.add(new w());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k(0));
            arrayList.add(new w());
        }
        this.f12498a = (u[]) arrayList.toArray(f12497b);
    }

    public final h c(int i10, cd.a aVar, Map<b, ?> map) {
        boolean z10;
        Collection collection;
        boolean z11;
        a aVar2 = a.UPC_A;
        int[] o10 = u.o(aVar);
        u[] uVarArr = this.f12498a;
        int i11 = 0;
        while (i11 < uVarArr.length) {
            try {
                h m10 = uVarArr[i11].m(i10, aVar, o10, map);
                if (m10.f15475d == a.EAN_13 && m10.f15472a.charAt(0) == '0') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(b.POSSIBLE_FORMATS);
                }
                if (collection != null) {
                    if (!collection.contains(aVar2)) {
                        z11 = false;
                        if (z10 || !z11) {
                            return m10;
                        }
                        h hVar = new h(m10.f15472a.substring(1), m10.f15473b, m10.f15474c, aVar2);
                        hVar.a(m10.f15476e);
                        return hVar;
                    }
                }
                z11 = true;
                if (z10) {
                }
                return m10;
            } catch (ReaderException unused) {
                i11++;
            }
        }
        throw NotFoundException.f7967c;
    }

    public final void reset() {
        for (u uVar : this.f12498a) {
            uVar.getClass();
        }
    }
}
