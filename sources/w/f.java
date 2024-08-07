package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import v.n0;
import v.s;
import w.q;

/* compiled from: CameraCaptureSessionCompat */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final q f16204a;

    /* compiled from: CameraCaptureSessionCompat */
    public interface a {
        int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int b(ArrayList arrayList, Executor executor, n0 n0Var);
    }

    /* compiled from: CameraCaptureSessionCompat */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f16205a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f16206b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f16206b = executor;
            this.f16205a = captureCallback;
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            this.f16206b.execute(new h(this, cameraCaptureSession, captureRequest, surface, j10));
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f16206b.execute(new s(this, cameraCaptureSession, captureRequest, totalCaptureResult, 1));
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f16206b.execute(new j(this, cameraCaptureSession, captureRequest, captureFailure, 1));
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f16206b.execute(new j(this, cameraCaptureSession, captureRequest, captureResult, 0));
        }

        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f16206b.execute(new g(this, cameraCaptureSession, i10));
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f16206b.execute(new i(this, cameraCaptureSession, i10, j10));
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f16206b.execute(new k(this, cameraCaptureSession, captureRequest, j10, j11));
        }
    }

    /* compiled from: CameraCaptureSessionCompat */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f16207a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f16208b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f16208b = executor;
            this.f16207a = stateCallback;
        }

        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f16208b.execute(new l(this, cameraCaptureSession, 1));
        }

        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f16208b.execute(new n(this, cameraCaptureSession, 0));
        }

        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f16208b.execute(new m(this, cameraCaptureSession, 0));
        }

        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f16208b.execute(new m(this, cameraCaptureSession, 1));
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f16208b.execute(new l(this, cameraCaptureSession, 0));
        }

        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f16208b.execute(new n(this, cameraCaptureSession, 1));
        }

        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f16208b.execute(new o(0, this, cameraCaptureSession, surface));
        }
    }

    public f(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16204a = new p(cameraCaptureSession);
        } else {
            this.f16204a = new q(cameraCaptureSession, new q.a(handler));
        }
    }

    public final CameraCaptureSession a() {
        return this.f16204a.f16245a;
    }
}
