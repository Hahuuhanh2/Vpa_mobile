package v;

import android.hardware.camera2.TotalCaptureResult;
import i0.a;
import v.c0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0.c f15645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15646b;

    public /* synthetic */ d0(c0.c cVar, int i10) {
        this.f15645a = cVar;
        this.f15646b = i10;
    }

    public final v8.a apply(Object obj) {
        c0.c cVar = this.f15645a;
        int i10 = this.f15646b;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        cVar.getClass();
        if (c0.b(i10, totalCaptureResult)) {
            cVar.f15627f = c0.c.f15620j;
        }
        return cVar.f15629h.a(totalCaptureResult);
    }
}
