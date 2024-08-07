package p0;

import al.g0;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.k;
import c0.q0;
import i0.i;
import i0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n0.x;
import p0.a;

/* compiled from: VirtualCameraControl */
public final class g extends k {

    /* renamed from: c  reason: collision with root package name */
    public final a.C0174a f13901c;

    public g(CameraControlInternal cameraControlInternal, q0 q0Var) {
        super(cameraControlInternal);
        this.f13901c = q0Var;
    }

    public final v8.a e(int i10, int i11, List list) {
        boolean z10;
        v8.a<Void> aVar;
        if (list.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y("Only support one capture config.", z10);
        a.C0174a aVar2 = this.f13901c;
        Integer num = (Integer) ((androidx.camera.core.impl.g) list.get(0)).f1358b.e(androidx.camera.core.impl.g.f1356j, 100);
        Objects.requireNonNull(num);
        int intValue = num.intValue();
        Integer num2 = (Integer) ((androidx.camera.core.impl.g) list.get(0)).f1358b.e(androidx.camera.core.impl.g.f1355i, 0);
        Objects.requireNonNull(num2);
        int intValue2 = num2.intValue();
        x xVar = ((a) ((q0) aVar2).f4316b).f13885p;
        if (xVar != null) {
            aVar = xVar.f13419a.d(intValue, intValue2);
        } else {
            aVar = new i.a<>(new Exception("Failed to take picture: pipeline is not ready."));
        }
        return new m(new ArrayList(Collections.singletonList(aVar)), true, j7.a.x());
    }
}
