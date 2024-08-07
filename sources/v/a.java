package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import u.a;
import v.g2;
import w.t;

/* compiled from: AndroidRZoomImpl */
public final class a implements g2.b {

    /* renamed from: a  reason: collision with root package name */
    public final Range<Float> f15572a;

    /* renamed from: b  reason: collision with root package name */
    public float f15573b = 1.0f;

    public a(t tVar) {
        this.f15572a = (Range) tVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    public final void a(TotalCaptureResult totalCaptureResult) {
    }

    public final float b() {
        return this.f15572a.getUpper().floatValue();
    }

    public final float c() {
        return this.f15572a.getLower().floatValue();
    }

    public final void d(a.C0199a aVar) {
        aVar.c(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f15573b));
    }

    public final void e() {
        this.f15573b = 1.0f;
    }
}
