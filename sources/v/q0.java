package v;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CameraDeviceStateCallbacks */
public final class q0 extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15804a = new ArrayList();

    public q0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof r0)) {
                this.f15804a.add(stateCallback);
            }
        }
    }

    public final void onClosed(CameraDevice cameraDevice) {
        Iterator it = this.f15804a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        Iterator it = this.f15804a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
        }
    }

    public final void onError(CameraDevice cameraDevice, int i10) {
        Iterator it = this.f15804a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i10);
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        Iterator it = this.f15804a.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
        }
    }
}
