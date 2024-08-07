package f0;

import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.k;
import i0.i;
import java.util.ArrayList;
import java.util.Set;
import v8.a;

/* compiled from: RestrictedCameraControl */
public final class n0 extends k {

    /* renamed from: c  reason: collision with root package name */
    public final CameraControlInternal f9565c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f9566d = false;

    /* renamed from: e  reason: collision with root package name */
    public volatile Set<Integer> f9567e;

    public n0(CameraControlInternal cameraControlInternal) {
        super(cameraControlInternal);
        this.f9565c = cameraControlInternal;
    }

    public final a<Void> f(boolean z10) {
        if (!i(6)) {
            return new i.a(new IllegalStateException("Torch is not supported"));
        }
        return this.f9565c.f(z10);
    }

    public final boolean i(int... iArr) {
        if (!this.f9566d || this.f9567e == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return this.f9567e.containsAll(arrayList);
    }
}
