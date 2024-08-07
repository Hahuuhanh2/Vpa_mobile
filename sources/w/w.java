package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;
import w.f;
import w.y;
import x.e;
import x.l;

/* compiled from: CameraDeviceCompatApi24Impl */
public class w extends v {
    public w(CameraDevice cameraDevice, y.a aVar) {
        super(cameraDevice, aVar);
    }

    public void a(l lVar) {
        y.b(this.f16256a, lVar);
        f.c cVar = new f.c(lVar.f16846a.d(), lVar.f16846a.b());
        List<x.f> f10 = lVar.f16846a.f();
        y.a aVar = (y.a) this.f16257b;
        aVar.getClass();
        Handler handler = aVar.f16258a;
        e a10 = lVar.f16846a.a();
        if (a10 != null) {
            try {
                InputConfiguration a11 = a10.f16826a.a();
                a11.getClass();
                this.f16256a.createReprocessableCaptureSessionByConfigurations(a11, l.a(f10), cVar, handler);
            } catch (CameraAccessException e10) {
                throw new CameraAccessExceptionCompat(e10);
            }
        } else if (lVar.f16846a.e() == 1) {
            this.f16256a.createConstrainedHighSpeedCaptureSession(y.c(f10), cVar, handler);
        } else {
            this.f16256a.createCaptureSessionByOutputConfigurations(l.a(f10), cVar, handler);
        }
    }
}
