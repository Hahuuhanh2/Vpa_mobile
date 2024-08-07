package l4;

import android.graphics.PointF;
import g4.a;
import i4.l;
import java.util.ArrayList;
import java.util.Collections;
import m4.c;
import n4.f;

/* compiled from: ShapeDataParser */
public final class w implements c0<l> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f12696a = new w();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f12697b = c.a.a("c", "v", "i", "o");

    public final Object b(c cVar, float f10) {
        if (cVar.K() == 1) {
            cVar.d();
        }
        cVar.h();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (cVar.v()) {
            int N = cVar.N(f12697b);
            if (N == 0) {
                z10 = cVar.x();
            } else if (N == 1) {
                arrayList = m.c(cVar, f10);
            } else if (N == 2) {
                arrayList2 = m.c(cVar, f10);
            } else if (N != 3) {
                cVar.R();
                cVar.S();
            } else {
                arrayList3 = m.c(cVar, f10);
            }
        }
        cVar.q();
        if (cVar.K() == 2) {
            cVar.i();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new l(new PointF(), false, Collections.emptyList());
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) arrayList.get(i10);
                int i11 = i10 - 1;
                arrayList4.add(new a(f.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), f.a(pointF2, (PointF) arrayList2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i12 = size - 1;
                arrayList4.add(new a(f.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new l(pointF, z10, arrayList4);
        }
    }
}
