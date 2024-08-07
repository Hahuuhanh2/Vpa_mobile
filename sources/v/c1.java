package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import u.a;
import v.g2;
import w.t;

/* compiled from: CropRegionZoomImpl */
public final class c1 implements g2.b {

    /* renamed from: a  reason: collision with root package name */
    public final t f15642a;

    public c1(t tVar) {
        this.f15642a = tVar;
    }

    public final void a(TotalCaptureResult totalCaptureResult) {
    }

    public final float b() {
        Float f10 = (Float) this.f15642a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null && f10.floatValue() >= 1.0f) {
            return f10.floatValue();
        }
        return 1.0f;
    }

    public final float c() {
        return 1.0f;
    }

    public final void d(a.C0199a aVar) {
    }

    public final void e() {
    }
}
