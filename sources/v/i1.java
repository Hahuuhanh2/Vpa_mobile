package v;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import f0.f;
import f0.k;
import j7.a;
import z0.b;

/* compiled from: FocusMeteringControl */
public final class i1 extends f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f15708a = null;

    public final void a() {
        b.a aVar = this.f15708a;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException("Camera is closed"));
        }
    }

    public final void b(k kVar) {
        b.a aVar = this.f15708a;
        if (aVar != null) {
            aVar.a(kVar);
        }
    }

    public final void c(a aVar) {
        b.a aVar2 = this.f15708a;
        if (aVar2 != null) {
            aVar2.b(new CameraControlInternal.CameraControlException());
        }
    }
}
