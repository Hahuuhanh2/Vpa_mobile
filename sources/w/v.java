package w;

import android.hardware.camera2.CameraDevice;
import w.y;

/* compiled from: CameraDeviceCompatApi23Impl */
public class v extends y {
    public v(CameraDevice cameraDevice, y.a aVar) {
        super(cameraDevice, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        throw new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        throw new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0040, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0031, B:10:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(x.l r5) {
        /*
            r4 = this;
            android.hardware.camera2.CameraDevice r0 = r4.f16256a
            w.y.b(r0, r5)
            w.f$c r0 = new w.f$c
            x.l$c r1 = r5.f16846a
            java.util.concurrent.Executor r1 = r1.d()
            x.l$c r2 = r5.f16846a
            android.hardware.camera2.CameraCaptureSession$StateCallback r2 = r2.b()
            r0.<init>(r1, r2)
            x.l$c r1 = r5.f16846a
            java.util.List r1 = r1.f()
            java.util.ArrayList r1 = w.y.c(r1)
            java.lang.Object r2 = r4.f16257b
            w.y$a r2 = (w.y.a) r2
            r2.getClass()
            android.os.Handler r2 = r2.f16258a
            x.l$c r3 = r5.f16846a
            x.e r3 = r3.a()
            if (r3 == 0) goto L_0x0042
            x.e$c r5 = r3.f16826a     // Catch:{ CameraAccessException -> 0x0040 }
            android.hardware.camera2.params.InputConfiguration r5 = r5.a()     // Catch:{ CameraAccessException -> 0x0040 }
            r5.getClass()     // Catch:{ CameraAccessException -> 0x0040 }
            android.hardware.camera2.CameraDevice r3 = r4.f16256a     // Catch:{ CameraAccessException -> 0x0040 }
            r3.createReprocessableCaptureSession(r5, r1, r0, r2)     // Catch:{ CameraAccessException -> 0x0040 }
            goto L_0x0056
        L_0x0040:
            r5 = move-exception
            goto L_0x005e
        L_0x0042:
            x.l$c r5 = r5.f16846a     // Catch:{ CameraAccessException -> 0x0040 }
            int r5 = r5.e()     // Catch:{ CameraAccessException -> 0x0040 }
            r3 = 1
            if (r5 != r3) goto L_0x0051
            android.hardware.camera2.CameraDevice r5 = r4.f16256a     // Catch:{ CameraAccessException -> 0x0040 }
            r5.createConstrainedHighSpeedCaptureSession(r1, r0, r2)     // Catch:{ CameraAccessException -> 0x0040 }
            goto L_0x0056
        L_0x0051:
            android.hardware.camera2.CameraDevice r5 = r4.f16256a     // Catch:{ CameraAccessException -> 0x0040 }
            r5.createCaptureSession(r1, r0, r2)     // Catch:{ CameraAccessException -> 0x0057 }
        L_0x0056:
            return
        L_0x0057:
            r5 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch:{ CameraAccessException -> 0x0040 }
            r0.<init>((android.hardware.camera2.CameraAccessException) r5)     // Catch:{ CameraAccessException -> 0x0040 }
            throw r0     // Catch:{ CameraAccessException -> 0x0040 }
        L_0x005e:
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r0 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat
            r0.<init>((android.hardware.camera2.CameraAccessException) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.v.a(x.l):void");
    }
}
