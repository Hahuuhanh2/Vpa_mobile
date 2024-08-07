package d4;

import android.graphics.PointF;
import com.airbnb.lottie.c0;
import e4.a;
import i4.k;
import i4.l;
import j4.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent */
public final class q implements s, a.C0097a {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f8722a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Float, Float> f8723b;

    /* renamed from: c  reason: collision with root package name */
    public l f8724c;

    public q(c0 c0Var, b bVar, k kVar) {
        this.f8722a = c0Var;
        kVar.getClass();
        a<Float, Float> a10 = kVar.f11128a.a();
        this.f8723b = a10;
        bVar.e(a10);
        a10.a(this);
    }

    public static int e(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i11 * i12 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    public final void a() {
        this.f8722a.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
    }

    public final l c(l lVar) {
        PointF pointF;
        PointF pointF2;
        boolean z10;
        int i10;
        ArrayList arrayList;
        PointF pointF3;
        PointF pointF4;
        boolean z11;
        l lVar2 = lVar;
        ArrayList arrayList2 = lVar2.f11129a;
        if (arrayList2.size() <= 2) {
            return lVar2;
        }
        float floatValue = this.f8723b.f().floatValue();
        if (floatValue == 0.0f) {
            return lVar2;
        }
        ArrayList arrayList3 = lVar2.f11129a;
        boolean z12 = lVar2.f11131c;
        int size = arrayList3.size() - 1;
        int i11 = 0;
        int i12 = 0;
        while (size >= 0) {
            g4.a aVar = (g4.a) arrayList3.get(size);
            int i13 = size - 1;
            g4.a aVar2 = (g4.a) arrayList3.get(e(i13, arrayList3.size()));
            if (size != 0 || z12) {
                pointF3 = aVar2.f10340c;
            } else {
                pointF3 = lVar2.f11130b;
            }
            if (size != 0 || z12) {
                pointF4 = aVar2.f10339b;
            } else {
                pointF4 = pointF3;
            }
            PointF pointF5 = aVar.f10338a;
            if (!lVar2.f11131c && size == 0 && size == arrayList3.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!pointF4.equals(pointF3) || !pointF5.equals(pointF3) || z11) {
                i12++;
            } else {
                i12 += 2;
            }
            size = i13;
        }
        l lVar3 = this.f8724c;
        if (lVar3 == null || lVar3.f11129a.size() != i12) {
            ArrayList arrayList4 = new ArrayList(i12);
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList4.add(new g4.a());
            }
            this.f8724c = new l(new PointF(0.0f, 0.0f), false, arrayList4);
        }
        l lVar4 = this.f8724c;
        lVar4.f11131c = z12;
        PointF pointF6 = lVar2.f11130b;
        lVar4.a(pointF6.x, pointF6.y);
        ArrayList arrayList5 = lVar4.f11129a;
        boolean z13 = lVar2.f11131c;
        int i15 = 0;
        while (i11 < arrayList2.size()) {
            g4.a aVar3 = (g4.a) arrayList2.get(i11);
            g4.a aVar4 = (g4.a) arrayList2.get(e(i11 - 1, arrayList2.size()));
            g4.a aVar5 = (g4.a) arrayList2.get(e(i11 - 2, arrayList2.size()));
            if (i11 != 0 || z13) {
                pointF = aVar4.f10340c;
            } else {
                pointF = lVar2.f11130b;
            }
            if (i11 != 0 || z13) {
                pointF2 = aVar4.f10339b;
            } else {
                pointF2 = pointF;
            }
            PointF pointF7 = aVar3.f10338a;
            PointF pointF8 = aVar5.f10340c;
            PointF pointF9 = aVar3.f10340c;
            if (!lVar2.f11131c && i11 == 0 && i11 == arrayList2.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!pointF2.equals(pointF) || !pointF7.equals(pointF) || z10) {
                arrayList = arrayList2;
                i10 = i11;
                g4.a aVar6 = (g4.a) arrayList5.get(e(i15 - 1, arrayList5.size()));
                PointF pointF10 = aVar4.f10340c;
                aVar6.f10339b.set(pointF10.x, pointF10.y);
                PointF pointF11 = aVar4.f10340c;
                aVar6.f10340c.set(pointF11.x, pointF11.y);
                PointF pointF12 = aVar3.f10340c;
                ((g4.a) arrayList5.get(i15)).f10338a.set(pointF12.x, pointF12.y);
            } else {
                float f10 = pointF.x;
                float f11 = f10 - pointF8.x;
                float f12 = pointF.y;
                float f13 = pointF9.x - f10;
                arrayList = arrayList2;
                i10 = i11;
                float min = Math.min(floatValue / ((float) Math.hypot((double) f11, (double) (f12 - pointF8.y))), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot((double) f13, (double) (pointF9.y - f12))), 0.5f);
                float f14 = pointF.x;
                float e10 = android.support.v4.media.a.e(pointF8.x, f14, min, f14);
                float f15 = pointF.y;
                float e11 = android.support.v4.media.a.e(pointF8.y, f15, min, f15);
                float e12 = android.support.v4.media.a.e(pointF9.x, f14, min2, f14);
                float e13 = android.support.v4.media.a.e(pointF9.y, f15, min2, f15);
                float f16 = e10 - ((e10 - f14) * 0.5519f);
                float f17 = e11 - ((e11 - f15) * 0.5519f);
                float f18 = e12 - ((e12 - f14) * 0.5519f);
                float f19 = e13 - ((e13 - f15) * 0.5519f);
                g4.a aVar7 = (g4.a) arrayList5.get(e(i15 - 1, arrayList5.size()));
                g4.a aVar8 = (g4.a) arrayList5.get(i15);
                aVar7.f10339b.set(e10, e11);
                aVar7.f10340c.set(e10, e11);
                if (i10 == 0) {
                    lVar4.a(e10, e11);
                }
                aVar8.f10338a.set(f16, f17);
                i15++;
                aVar8.f10339b.set(f18, f19);
                aVar8.f10340c.set(e12, e13);
                ((g4.a) arrayList5.get(i15)).f10338a.set(e12, e13);
            }
            i15++;
            i11 = i10 + 1;
            lVar2 = lVar;
            arrayList2 = arrayList;
        }
        return lVar4;
    }
}
