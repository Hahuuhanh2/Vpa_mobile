package w;

import android.hardware.camera2.CameraCaptureSession;
import w.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16235a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.c f16236b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16237c;

    public /* synthetic */ m(f.c cVar, CameraCaptureSession cameraCaptureSession, int i10) {
        this.f16235a = i10;
        this.f16236b = cVar;
        this.f16237c = cameraCaptureSession;
    }

    public final void run() {
        switch (this.f16235a) {
            case 0:
                f.c cVar = this.f16236b;
                cVar.f16207a.onClosed(this.f16237c);
                return;
            default:
                f.c cVar2 = this.f16236b;
                cVar2.f16207a.onConfigureFailed(this.f16237c);
                return;
        }
    }
}
