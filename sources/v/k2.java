package v;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;

/* compiled from: ZslControlImpl */
public final class k2 extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l2 f15732a;

    public k2(l2 l2Var) {
        this.f15732a = l2Var;
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            this.f15732a.f15745j = ImageWriter.newInstance(inputSurface, 1);
        }
    }
}
