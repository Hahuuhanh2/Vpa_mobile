package x;

import al.g0;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: OutputConfigurationCompatApi33Impl */
public final class j extends i {
    public j(int i10, Surface surface) {
        super(new OutputConfiguration(i10, surface));
    }

    public final void a(long j10) {
        if (j10 != -1) {
            ((OutputConfiguration) g()).setStreamUseCase(j10);
        }
    }

    public final void c(long j10) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j10);
    }

    public final Object g() {
        g0.z(this.f16838a instanceof OutputConfiguration);
        return this.f16838a;
    }

    public j(Object obj) {
        super(obj);
    }
}
