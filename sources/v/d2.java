package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import v.o;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d2 implements o.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f2 f15656a;

    public /* synthetic */ d2(f2 f2Var) {
        this.f15656a = f2Var;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        boolean z10;
        f2 f2Var = this.f15656a;
        if (f2Var.f15681f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if (num == null || num.intValue() != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 == f2Var.f15682g) {
                f2Var.f15681f.a(null);
                f2Var.f15681f = null;
            }
        }
        return false;
    }
}
