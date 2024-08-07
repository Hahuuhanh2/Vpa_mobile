package kd;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import ld.e;
import md.c;
import uc.a;
import uc.b;
import uc.h;

/* compiled from: MultiFormatOneDReader */
public final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    public static final q[] f12495b = new q[0];

    /* renamed from: a  reason: collision with root package name */
    public final q[] f12496a;

    public o(Map<b, ?> map) {
        Collection collection;
        boolean z10;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(b.POSSIBLE_FORMATS);
        }
        if (map == null || map.get(b.ASSUME_CODE_39_CHECK_DIGIT) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13) || collection.contains(a.UPC_A) || collection.contains(a.EAN_8) || collection.contains(a.UPC_E)) {
                arrayList.add(new p(map));
            }
            if (collection.contains(a.CODE_39)) {
                arrayList.add(new e(z10));
            }
            if (collection.contains(a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(a.ITF)) {
                arrayList.add(new m());
            }
            if (collection.contains(a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.RSS_14)) {
                arrayList.add(new e());
            }
            if (collection.contains(a.RSS_EXPANDED)) {
                arrayList.add(new c());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new p(map));
            arrayList.add(new e(false));
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new m());
            arrayList.add(new e());
            arrayList.add(new c());
        }
        this.f12496a = (q[]) arrayList.toArray(f12495b);
    }

    public final h c(int i10, cd.a aVar, Map<b, ?> map) {
        q[] qVarArr = this.f12496a;
        int i11 = 0;
        while (i11 < qVarArr.length) {
            try {
                return qVarArr[i11].c(i10, aVar, map);
            } catch (ReaderException unused) {
                i11++;
            }
        }
        throw NotFoundException.f7967c;
    }

    public final void reset() {
        for (q reset : this.f12496a) {
            reset.reset();
        }
    }
}
