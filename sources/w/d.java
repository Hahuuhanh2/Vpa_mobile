package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* compiled from: ApiCompat */
public final class d {
    public static <T> OutputConfiguration a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    public static void b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
