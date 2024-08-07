package v;

import al.g0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import f0.f;
import j7.a;

/* compiled from: CaptureCallbackAdapter */
public final class u0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final f f15899a;

    public u0(f fVar) {
        if (fVar != null) {
            this.f15899a = fVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        f0.u0 u0Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            g0.y("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof f0.u0);
            u0Var = (f0.u0) tag;
        } else {
            u0Var = f0.u0.f9604b;
        }
        this.f15899a.b(new e(u0Var, totalCaptureResult));
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f15899a.c(new a());
    }
}
