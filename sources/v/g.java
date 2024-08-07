package v;

import android.hardware.camera2.TotalCaptureResult;
import v.o;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements o.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f15683a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.a f15684b;

    public /* synthetic */ g(long j10, b.a aVar) {
        this.f15683a = j10;
        this.f15684b = aVar;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        long j10 = this.f15683a;
        b.a aVar = this.f15684b;
        if (!o.p(totalCaptureResult, j10)) {
            return false;
        }
        aVar.a(null);
        return true;
    }
}
