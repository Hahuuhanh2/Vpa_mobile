package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import v.n0;
import w.f;

/* compiled from: CameraCaptureSessionCompatBaseImpl */
public class q implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession f16245a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16246b;

    /* compiled from: CameraCaptureSessionCompatBaseImpl */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f16247a;

        public a(Handler handler) {
            this.f16247a = handler;
        }
    }

    public q(CameraCaptureSession cameraCaptureSession, a aVar) {
        cameraCaptureSession.getClass();
        this.f16245a = cameraCaptureSession;
        this.f16246b = aVar;
    }

    public int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f16245a.setRepeatingRequest(captureRequest, new f.b(executor, captureCallback), ((a) this.f16246b).f16247a);
    }

    public int b(ArrayList arrayList, Executor executor, n0 n0Var) {
        return this.f16245a.captureBurst(arrayList, new f.b(executor, n0Var), ((a) this.f16246b).f16247a);
    }
}
