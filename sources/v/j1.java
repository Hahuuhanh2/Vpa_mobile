package v;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import f0.f;
import f0.k;
import j7.a;
import z0.b;

/* compiled from: FocusMeteringControl */
public final class j1 extends f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f15717a;

    public j1(b.a aVar) {
        this.f15717a = aVar;
    }

    public final void a() {
        b.a aVar = this.f15717a;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException("Camera is closed"));
        }
    }

    public final void b(k kVar) {
        b.a aVar = this.f15717a;
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public final void c(a aVar) {
        b.a aVar2 = this.f15717a;
        if (aVar2 != null) {
            aVar2.b(new CameraControlInternal.CameraControlException());
        }
    }
}
