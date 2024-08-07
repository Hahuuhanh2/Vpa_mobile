package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import c0.x;
import n0.o;
import w.f;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16222a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16223b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f16224c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f16225d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f16226e;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16222a = i10;
        this.f16223b = obj;
        this.f16224c = obj2;
        this.f16225d = obj3;
        this.f16226e = obj4;
    }

    public final void run() {
        switch (this.f16222a) {
            case 0:
                ((f.b) this.f16223b).f16205a.onCaptureProgressed((CameraCaptureSession) this.f16224c, (CaptureRequest) this.f16225d, (CaptureResult) this.f16226e);
                return;
            case 1:
                ((f.b) this.f16223b).f16205a.onCaptureFailed((CameraCaptureSession) this.f16224c, (CaptureRequest) this.f16225d, (CaptureFailure) this.f16226e);
                return;
            default:
                n0.j jVar = (n0.j) this.f16223b;
                x xVar = (x) this.f16224c;
                o oVar = (o) this.f16225d;
                b.a aVar = (b.a) this.f16226e;
                jVar.getClass();
                try {
                    jVar.f13338a.l(xVar, oVar);
                    aVar.a(null);
                    return;
                } catch (RuntimeException e10) {
                    aVar.b(e10);
                    return;
                }
        }
    }
}
