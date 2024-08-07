package w;

import android.hardware.camera2.CameraCaptureSession;
import w.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.b f16218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16219b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16220c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f16221d;

    public /* synthetic */ i(f.b bVar, CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        this.f16218a = bVar;
        this.f16219b = cameraCaptureSession;
        this.f16220c = i10;
        this.f16221d = j10;
    }

    public final void run() {
        f.b bVar = this.f16218a;
        bVar.f16205a.onCaptureSequenceCompleted(this.f16219b, this.f16220c, this.f16221d);
    }
}
