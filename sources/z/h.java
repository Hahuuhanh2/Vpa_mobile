package z;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import u.a;
import y.k;
import y.t;

/* compiled from: ImageCapturePixelHDRPlus */
public final class h {
    @SuppressLint({"NewApi"})
    public static void a(int i10, a.C0199a aVar) {
        if (((t) k.a(t.class)) != null) {
            if (i10 == 0) {
                aVar.c(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else if (i10 == 1) {
                aVar.c(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }
}
