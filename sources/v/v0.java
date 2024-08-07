package v;

import android.hardware.camera2.CameraCaptureSession;
import f0.f;

/* compiled from: CaptureCallbackContainer */
public final class v0 extends f {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f15901a;

    public v0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f15901a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
