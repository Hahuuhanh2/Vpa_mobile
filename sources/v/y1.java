package v;

import al.g0;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import z0.b;

/* compiled from: SynchronizedCaptureSessionBaseImpl */
public final class y1 extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x1 f15960a;

    public y1(x1 x1Var) {
        this.f15960a = x1Var;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f15960a.s(cameraCaptureSession);
        x1 x1Var = this.f15960a;
        x1Var.k(x1Var);
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f15960a.s(cameraCaptureSession);
        x1 x1Var = this.f15960a;
        x1Var.l(x1Var);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f15960a.s(cameraCaptureSession);
        x1 x1Var = this.f15960a;
        x1Var.m(x1Var);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        b.a<Void> aVar;
        try {
            this.f15960a.s(cameraCaptureSession);
            x1 x1Var = this.f15960a;
            x1Var.n(x1Var);
            synchronized (this.f15960a.f15924a) {
                g0.D(this.f15960a.f15932i, "OpenCaptureSession completer should not null");
                x1 x1Var2 = this.f15960a;
                aVar = x1Var2.f15932i;
                x1Var2.f15932i = null;
            }
            aVar.b(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th2) {
            synchronized (this.f15960a.f15924a) {
                g0.D(this.f15960a.f15932i, "OpenCaptureSession completer should not null");
                x1 x1Var3 = this.f15960a;
                b.a<Void> aVar2 = x1Var3.f15932i;
                x1Var3.f15932i = null;
                aVar2.b(new IllegalStateException("onConfigureFailed"));
                throw th2;
            }
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        b.a<Void> aVar;
        try {
            this.f15960a.s(cameraCaptureSession);
            x1 x1Var = this.f15960a;
            x1Var.o(x1Var);
            synchronized (this.f15960a.f15924a) {
                g0.D(this.f15960a.f15932i, "OpenCaptureSession completer should not null");
                x1 x1Var2 = this.f15960a;
                aVar = x1Var2.f15932i;
                x1Var2.f15932i = null;
            }
            aVar.a(null);
        } catch (Throwable th2) {
            synchronized (this.f15960a.f15924a) {
                g0.D(this.f15960a.f15932i, "OpenCaptureSession completer should not null");
                x1 x1Var3 = this.f15960a;
                b.a<Void> aVar2 = x1Var3.f15932i;
                x1Var3.f15932i = null;
                aVar2.a(null);
                throw th2;
            }
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f15960a.s(cameraCaptureSession);
        x1 x1Var = this.f15960a;
        x1Var.p(x1Var);
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f15960a.s(cameraCaptureSession);
        x1 x1Var = this.f15960a;
        x1Var.r(x1Var, surface);
    }
}
