package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* compiled from: CameraManagerCompatApi30Impl */
public final class c0 extends b0 {
    public c0(Context context) {
        super(context);
    }

    public final Set<Set<String>> e() {
        try {
            return this.f16196a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }
}
