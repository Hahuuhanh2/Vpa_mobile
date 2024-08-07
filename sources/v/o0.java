package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.b;
import w.d;

/* compiled from: CameraCaptureSessionStateCallbacks */
public final class o0 extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15784a = new ArrayList();

    public o0(List<CameraCaptureSession.StateCallback> list) {
        for (CameraCaptureSession.StateCallback next : list) {
            if (!(next instanceof p0)) {
                this.f15784a.add(next);
            }
        }
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f15784a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
        }
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f15784a.iterator();
        while (it.hasNext()) {
            d.b((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
        }
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f15784a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f15784a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f15784a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f15784a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
        }
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        Iterator it = this.f15784a.iterator();
        while (it.hasNext()) {
            b.a((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession, surface);
        }
    }
}
