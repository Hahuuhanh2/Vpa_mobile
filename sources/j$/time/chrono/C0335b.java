package j$.time.chrono;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: j$.time.chrono.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0335b implements Comparator, Serializable {
    public final int compare(Object obj, Object obj2) {
        C0341h hVar = (C0341h) obj;
        C0341h hVar2 = (C0341h) obj2;
        int i10 = C0337d.f18066c;
        int compare = Long.compare(hVar.f().I(), hVar2.f().I());
        return compare == 0 ? Long.compare(hVar.b().k0(), hVar2.b().k0()) : compare;
    }
}
