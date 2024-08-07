package w;

import android.hardware.camera2.CameraCaptureSession;
import w.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16232a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.c f16233b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16234c;

    public /* synthetic */ l(f.c cVar, CameraCaptureSession cameraCaptureSession, int i10) {
        this.f16232a = i10;
        this.f16233b = cVar;
        this.f16234c = cameraCaptureSession;
    }

    public final void run() {
        switch (this.f16232a) {
            case 0:
                f.c cVar = this.f16233b;
                cVar.f16207a.onConfigured(this.f16234c);
                return;
            default:
                f.c cVar2 = this.f16233b;
                cVar2.f16207a.onActive(this.f16234c);
                return;
        }
    }
}
