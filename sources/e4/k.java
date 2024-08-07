package e4;

import android.graphics.Path;
import android.graphics.PointF;
import d4.s;
import i4.l;
import java.util.ArrayList;
import java.util.List;
import n4.c;
import n4.f;
import o4.a;

/* compiled from: ShapeKeyframeAnimation */
public final class k extends a<l, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final l f9125i = new l();

    /* renamed from: j  reason: collision with root package name */
    public final Path f9126j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public List<s> f9127k;

    public k(List<a<l>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        boolean z10;
        a aVar2 = aVar;
        float f11 = f10;
        l lVar = (l) aVar2.f13704b;
        l lVar2 = (l) aVar2.f13705c;
        l lVar3 = this.f9125i;
        if (lVar3.f11130b == null) {
            lVar3.f11130b = new PointF();
        }
        if (lVar.f11131c || lVar2.f11131c) {
            z10 = true;
        } else {
            z10 = false;
        }
        lVar3.f11131c = z10;
        if (lVar.f11129a.size() != lVar2.f11129a.size()) {
            StringBuilder q10 = android.support.v4.media.a.q("Curves must have the same number of control points. Shape 1: ");
            q10.append(lVar.f11129a.size());
            q10.append("\tShape 2: ");
            q10.append(lVar2.f11129a.size());
            c.b(q10.toString());
        }
        int min = Math.min(lVar.f11129a.size(), lVar2.f11129a.size());
        if (lVar3.f11129a.size() < min) {
            for (int size = lVar3.f11129a.size(); size < min; size++) {
                lVar3.f11129a.add(new g4.a());
            }
        } else if (lVar3.f11129a.size() > min) {
            for (int size2 = lVar3.f11129a.size() - 1; size2 >= min; size2--) {
                ArrayList arrayList = lVar3.f11129a;
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = lVar.f11130b;
        PointF pointF2 = lVar2.f11130b;
        float f12 = pointF.x;
        float f13 = pointF2.x;
        PointF pointF3 = f.f13512a;
        float e10 = android.support.v4.media.a.e(f13, f12, f11, f12);
        float f14 = pointF.y;
        lVar3.a(e10, ((pointF2.y - f14) * f11) + f14);
        for (int size3 = lVar3.f11129a.size() - 1; size3 >= 0; size3--) {
            g4.a aVar3 = (g4.a) lVar.f11129a.get(size3);
            g4.a aVar4 = (g4.a) lVar2.f11129a.get(size3);
            PointF pointF4 = aVar3.f10338a;
            PointF pointF5 = aVar3.f10339b;
            PointF pointF6 = aVar3.f10340c;
            PointF pointF7 = aVar4.f10338a;
            PointF pointF8 = aVar4.f10339b;
            PointF pointF9 = aVar4.f10340c;
            float f15 = pointF4.x;
            float e11 = android.support.v4.media.a.e(pointF7.x, f15, f11, f15);
            float f16 = pointF4.y;
            ((g4.a) lVar3.f11129a.get(size3)).f10338a.set(e11, android.support.v4.media.a.e(pointF7.y, f16, f11, f16));
            float f17 = pointF5.x;
            float e12 = android.support.v4.media.a.e(pointF8.x, f17, f11, f17);
            float f18 = pointF5.y;
            ((g4.a) lVar3.f11129a.get(size3)).f10339b.set(e12, android.support.v4.media.a.e(pointF8.y, f18, f11, f18));
            float f19 = pointF6.x;
            float e13 = android.support.v4.media.a.e(pointF9.x, f19, f11, f19);
            float f20 = pointF6.y;
            ((g4.a) lVar3.f11129a.get(size3)).f10340c.set(e13, android.support.v4.media.a.e(pointF9.y, f20, f11, f20));
        }
        l lVar4 = this.f9125i;
        List<s> list = this.f9127k;
        if (list != null) {
            for (int size4 = list.size() - 1; size4 >= 0; size4--) {
                lVar4 = this.f9127k.get(size4).c(lVar4);
            }
        }
        Path path = this.f9126j;
        path.reset();
        PointF pointF10 = lVar4.f11130b;
        path.moveTo(pointF10.x, pointF10.y);
        f.f13512a.set(pointF10.x, pointF10.y);
        for (int i10 = 0; i10 < lVar4.f11129a.size(); i10++) {
            g4.a aVar5 = (g4.a) lVar4.f11129a.get(i10);
            PointF pointF11 = aVar5.f10338a;
            PointF pointF12 = aVar5.f10339b;
            PointF pointF13 = aVar5.f10340c;
            PointF pointF14 = f.f13512a;
            if (!pointF11.equals(pointF14) || !pointF12.equals(pointF13)) {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            } else {
                path.lineTo(pointF13.x, pointF13.y);
            }
            pointF14.set(pointF13.x, pointF13.y);
        }
        if (lVar4.f11131c) {
            path.close();
        }
        return this.f9126j;
    }
}
