package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import w.f;

/* compiled from: SynchronizedCaptureSession */
public interface u1 {

    /* compiled from: SynchronizedCaptureSession */
    public static abstract class a {
        public void k(x1 x1Var) {
        }

        public void l(x1 x1Var) {
        }

        public void m(u1 u1Var) {
        }

        public void n(u1 u1Var) {
        }

        public void o(x1 x1Var) {
        }

        public void p(x1 x1Var) {
        }

        public void q(u1 u1Var) {
        }

        public void r(x1 x1Var, Surface surface) {
        }
    }

    void a();

    x1 b();

    void close();

    void d();

    f f();

    CameraDevice g();

    int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    v8.a<Void> i();

    int j(ArrayList arrayList, n0 n0Var);
}
