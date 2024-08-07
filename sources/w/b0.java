package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import h0.g;

/* compiled from: CameraManagerCompatApi29Impl */
public class b0 extends a0 {
    public b0(Context context) {
        super(context);
    }

    public final void b(String str, g gVar, CameraDevice.StateCallback stateCallback) {
        try {
            this.f16196a.openCamera(str, gVar, stateCallback);
        } catch (CameraAccessException e10) {
            throw new CameraAccessExceptionCompat(e10);
        }
    }

    public final CameraCharacteristics d(String str) {
        try {
            return this.f16196a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }
}
