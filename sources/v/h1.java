package v;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import v.o;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h1 implements o.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k1 f15697a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15698b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f15699c;

    public /* synthetic */ h1(k1 k1Var, int i10, long j10) {
        this.f15697a = k1Var;
        this.f15698b = i10;
        this.f15699c = j10;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        k1 k1Var = this.f15697a;
        int i10 = this.f15698b;
        long j10 = this.f15699c;
        k1Var.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !o.p(totalCaptureResult, j10)) {
            return false;
        }
        b.a<Void> aVar = k1Var.f15731h;
        if (aVar != null) {
            aVar.a(null);
            k1Var.f15731h = null;
        }
        return true;
    }
}
