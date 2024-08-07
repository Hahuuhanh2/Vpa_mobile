package n4;

import android.graphics.PointF;
import d4.k;
import g4.e;
import java.util.ArrayList;

/* compiled from: MiscUtils */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f13512a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(float f10, float f11) {
        boolean z10;
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        if ((i10 ^ i11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = i10 % i11;
        if (!z10 && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static void d(e eVar, int i10, ArrayList arrayList, e eVar2, k kVar) {
        if (eVar.a(i10, kVar.getName())) {
            String name = kVar.getName();
            eVar2.getClass();
            e eVar3 = new e(eVar2);
            eVar3.f10360a.add(name);
            e eVar4 = new e(eVar3);
            eVar4.f10361b = kVar;
            arrayList.add(eVar4);
        }
    }
}
