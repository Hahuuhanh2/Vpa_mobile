package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* compiled from: ApiCompat */
public final class b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
