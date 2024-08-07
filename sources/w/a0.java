package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import h0.g;
import v.u;
import w.d0;

/* compiled from: CameraManagerCompatApi28Impl */
public class a0 extends d0 {
    public a0(Context context) {
        super(context, (d0.a) null);
    }

    public static boolean f(RuntimeException runtimeException) {
        boolean z10;
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) {
            z10 = false;
        } else {
            z10 = "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final void a(u.b bVar) {
        this.f16196a.unregisterAvailabilityCallback(bVar);
    }

    public void b(String str, g gVar, CameraDevice.StateCallback stateCallback) {
        try {
            this.f16196a.openCamera(str, gVar, stateCallback);
        } catch (CameraAccessException e10) {
            throw new CameraAccessExceptionCompat(e10);
        } catch (IllegalArgumentException | SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (f(e12)) {
                throw new CameraAccessExceptionCompat(e12);
            }
            throw e12;
        }
    }

    public final void c(g gVar, u.b bVar) {
        this.f16196a.registerAvailabilityCallback(gVar, bVar);
    }

    public CameraCharacteristics d(String str) {
        try {
            return super.d(str);
        } catch (RuntimeException e10) {
            if (f(e10)) {
                throw new CameraAccessExceptionCompat(e10);
            }
            throw e10;
        }
    }
}
