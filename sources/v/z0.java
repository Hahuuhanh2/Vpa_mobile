package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.u;
import c0.p0;
import java.util.Collections;
import z.q;

/* compiled from: CaptureSession */
public final class z0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y0 f15961a;

    public z0(y0 y0Var) {
        this.f15961a = y0Var;
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.f15961a.f15940a) {
            u uVar = this.f15961a.f15946g;
            if (uVar != null) {
                g gVar = uVar.f1396f;
                p0.a("CaptureSession");
                y0 y0Var = this.f15961a;
                y0Var.f15956q.getClass();
                y0Var.f(Collections.singletonList(q.a(gVar)));
            }
        }
    }
}
