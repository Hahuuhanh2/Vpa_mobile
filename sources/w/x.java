package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import w.y;
import x.l;

/* compiled from: CameraDeviceCompatApi28Impl */
public final class x extends w {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(CameraDevice cameraDevice) {
        super(cameraDevice, (y.a) null);
        cameraDevice.getClass();
    }

    public final void a(l lVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) lVar.f16846a.c();
        sessionConfiguration.getClass();
        try {
            this.f16256a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }
}
