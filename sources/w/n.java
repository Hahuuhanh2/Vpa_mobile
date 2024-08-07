package w;

import android.hardware.camera2.CameraCaptureSession;
import w.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.c f16239b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16240c;

    public /* synthetic */ n(f.c cVar, CameraCaptureSession cameraCaptureSession, int i10) {
        this.f16238a = i10;
        this.f16239b = cVar;
        this.f16240c = cameraCaptureSession;
    }

    public final void run() {
        switch (this.f16238a) {
            case 0:
                f.c cVar = this.f16239b;
                d.b(cVar.f16207a, this.f16240c);
                return;
            default:
                f.c cVar2 = this.f16239b;
                cVar2.f16207a.onReady(this.f16240c);
                return;
        }
    }
}
