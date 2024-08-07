package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import w.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.b f16213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16214b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f16215c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Surface f16216d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f16217e;

    public /* synthetic */ h(f.b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        this.f16213a = bVar;
        this.f16214b = cameraCaptureSession;
        this.f16215c = captureRequest;
        this.f16216d = surface;
        this.f16217e = j10;
    }

    public final void run() {
        f.b bVar = this.f16213a;
        c.a(bVar.f16205a, this.f16214b, this.f16215c, this.f16216d, this.f16217e);
    }
}
