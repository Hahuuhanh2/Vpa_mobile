package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import v.n0;
import w.q;

/* compiled from: CameraCaptureSessionCompatApi28Impl */
public final class p extends q {
    public p(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, (q.a) null);
    }

    public final int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f16245a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    public final int b(ArrayList arrayList, Executor executor, n0 n0Var) {
        return this.f16245a.captureBurstRequests(arrayList, executor, n0Var);
    }
}
