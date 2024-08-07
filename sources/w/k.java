package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import w.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.b f16227a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f16228b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f16229c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f16230d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f16231e;

    public /* synthetic */ k(f.b bVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        this.f16227a = bVar;
        this.f16228b = cameraCaptureSession;
        this.f16229c = captureRequest;
        this.f16230d = j10;
        this.f16231e = j11;
    }

    public final void run() {
        f.b bVar = this.f16227a;
        bVar.f16205a.onCaptureStarted(this.f16228b, this.f16229c, this.f16230d, this.f16231e);
    }
}
