package v;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import b0.f;
import f0.i0;
import f0.k;
import f0.u0;
import java.util.ArrayList;
import java.util.HashSet;
import u.a;

/* compiled from: Camera2CaptureOptionUnpacker */
public class a0 implements g.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f15574a = new a0();

    public void a(x<?> xVar, g.a aVar) {
        g C = xVar.C();
        i iVar = r.G;
        c cVar = g.f1355i;
        HashSet hashSet = new HashSet();
        q L = q.L();
        Range<Integer> range = v.f1409a;
        ArrayList arrayList = new ArrayList();
        i0 c10 = i0.c();
        ArrayList arrayList2 = new ArrayList(hashSet);
        r K = r.K(L);
        ArrayList arrayList3 = new ArrayList(arrayList);
        u0 u0Var = u0.f9604b;
        ArrayMap arrayMap = new ArrayMap();
        for (String next : c10.b()) {
            arrayMap.put(next, c10.a(next));
        }
        u0 u0Var2 = new u0(arrayMap);
        int i10 = -1;
        new g(arrayList2, K, -1, range, arrayList3, false, u0Var2, (k) null);
        if (C != null) {
            i10 = C.f1359c;
            aVar.a(C.f1361e);
            iVar = C.f1358b;
        }
        aVar.f1366b = q.M(iVar);
        aVar.f1367c = ((Integer) xVar.e(a.F, Integer.valueOf(i10))).intValue();
        aVar.b(new v0((CameraCaptureSession.CaptureCallback) xVar.e(a.J, new z())));
        aVar.c(f.a.d(xVar).c());
    }
}
