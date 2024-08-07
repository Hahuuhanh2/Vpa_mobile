package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import b0.f;
import c0.y;

/* compiled from: Camera2ImplConfig */
public final class a extends f {
    public static final c F = i.a.a(Integer.TYPE, "camera2.captureRequest.templateType");
    public static final c G = i.a.a(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");
    public static final c H = i.a.a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");
    public static final c I = i.a.a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");
    public static final c J = i.a.a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");
    public static final c K = i.a.a(c.class, "camera2.cameraEvent.callback");
    public static final c L = i.a.a(Object.class, "camera2.captureRequest.tag");
    public static final c M = i.a.a(String.class, "camera2.cameraCaptureSession.physicalCameraId");

    /* renamed from: u.a$a  reason: collision with other inner class name */
    /* compiled from: Camera2ImplConfig */
    public static final class C0199a implements y<a> {

        /* renamed from: a  reason: collision with root package name */
        public final q f15025a = q.L();

        public final p a() {
            throw null;
        }

        public final void c(CaptureRequest.Key key, Object obj) {
            this.f15025a.O(a.K(key), obj);
        }
    }

    public a(i iVar) {
        super(iVar);
    }

    public static c K(CaptureRequest.Key key) {
        StringBuilder q10 = android.support.v4.media.a.q("camera2.captureRequest.option.");
        q10.append(key.getName());
        return new c(q10.toString(), Object.class, key);
    }
}
