package w;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.appcompat.app.p;
import h0.g;
import java.util.concurrent.Executor;
import q.e;
import v.f;
import v.n;
import w.y;
import x.l;

/* compiled from: CameraDeviceCompat */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final v f16253a;

    /* compiled from: CameraDeviceCompat */
    public interface a {
        void a(l lVar);
    }

    /* compiled from: CameraDeviceCompat */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        public final CameraDevice.StateCallback f16254a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f16255b;

        public b(g gVar, CameraDevice.StateCallback stateCallback) {
            this.f16255b = gVar;
            this.f16254a = stateCallback;
        }

        public final void onClosed(CameraDevice cameraDevice) {
            this.f16255b.execute(new n(4, this, cameraDevice));
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            this.f16255b.execute(new p(8, this, cameraDevice));
        }

        public final void onError(CameraDevice cameraDevice, int i10) {
            this.f16255b.execute(new e(this, cameraDevice, i10));
        }

        public final void onOpened(CameraDevice cameraDevice) {
            this.f16255b.execute(new f(3, this, cameraDevice));
        }
    }

    public u(CameraDevice cameraDevice, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f16253a = new x(cameraDevice);
        } else if (i10 >= 24) {
            this.f16253a = new w(cameraDevice, new y.a(handler));
        } else {
            this.f16253a = new v(cameraDevice, new y.a(handler));
        }
    }
}
