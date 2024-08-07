package w;

import android.hardware.camera2.CameraCaptureSession;
import w.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.b f16209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16210b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16211c;

    public /* synthetic */ g(f.b bVar, CameraCaptureSession cameraCaptureSession, int i10) {
        this.f16209a = bVar;
        this.f16210b = cameraCaptureSession;
        this.f16211c = i10;
    }

    public final void run() {
        f.b bVar = this.f16209a;
        bVar.f16205a.onCaptureSequenceAborted(this.f16210b, this.f16211c);
    }
}
