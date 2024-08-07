package uc;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kd.o;
import td.a;
import vc.b;
import vl.d;

/* compiled from: MultiFormatReader */
public final class e implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final g[] f15464c = new g[0];

    /* renamed from: a  reason: collision with root package name */
    public Map<b, ?> f15465a;

    /* renamed from: b  reason: collision with root package name */
    public g[] f15466b;

    public final h a(d dVar) {
        d((Map<b, ?>) null);
        return c(dVar);
    }

    public final h b(d dVar, Map<b, ?> map) {
        d(map);
        return c(dVar);
    }

    public final h c(d dVar) {
        g[] gVarArr = this.f15466b;
        if (gVarArr != null) {
            int length = gVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                try {
                    return gVarArr[i10].b(dVar, this.f15465a);
                } catch (ReaderException unused) {
                    i10++;
                }
            }
        }
        throw NotFoundException.f7967c;
    }

    public final void d(Map<b, ?> map) {
        boolean z10;
        Collection collection;
        this.f15465a = map;
        boolean z11 = true;
        if (map == null || !map.containsKey(b.TRY_HARDER)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(b.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z11 = false;
            }
            if (z11 && !z10) {
                arrayList.add(new o(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new fd.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new od.a());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new id.a());
            }
            if (z11 && z10) {
                arrayList.add(new o(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z10) {
                arrayList.add(new o(map));
            }
            arrayList.add(new a());
            arrayList.add(new fd.a());
            arrayList.add(new b());
            arrayList.add(new od.a());
            arrayList.add(new id.a());
            if (z10) {
                arrayList.add(new o(map));
            }
        }
        this.f15466b = (g[]) arrayList.toArray(f15464c);
    }

    public final void reset() {
        g[] gVarArr = this.f15466b;
        if (gVarArr != null) {
            for (g reset : gVarArr) {
                reset.reset();
            }
        }
    }
}
