package v;

import al.g0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.j;
import i0.c;
import i0.d;
import i0.f;
import i0.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v.a2;
import v.u1;
import w.f;
import w.u;
import x.l;
import z0.b;

/* compiled from: SynchronizedCaptureSessionBaseImpl */
public class x1 extends u1.a implements u1, a2.b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15924a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final b1 f15925b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f15926c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f15927d;

    /* renamed from: e  reason: collision with root package name */
    public final ScheduledExecutorService f15928e;

    /* renamed from: f  reason: collision with root package name */
    public u1.a f15929f;

    /* renamed from: g  reason: collision with root package name */
    public f f15930g;

    /* renamed from: h  reason: collision with root package name */
    public b.d f15931h;

    /* renamed from: i  reason: collision with root package name */
    public b.a<Void> f15932i;

    /* renamed from: j  reason: collision with root package name */
    public d f15933j;

    /* renamed from: k  reason: collision with root package name */
    public List<DeferrableSurface> f15934k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15935l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15936m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15937n = false;

    /* compiled from: SynchronizedCaptureSessionBaseImpl */
    public class a implements c<Void> {
        public a() {
        }

        public final void a(Throwable th2) {
            x1.this.t();
            x1 x1Var = x1.this;
            b1 b1Var = x1Var.f15925b;
            b1Var.a(x1Var);
            synchronized (b1Var.f15591b) {
                b1Var.f15594e.remove(x1Var);
            }
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    public x1(b1 b1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f15925b = b1Var;
        this.f15926c = handler;
        this.f15927d = executor;
        this.f15928e = scheduledExecutorService;
    }

    public final void a() {
        g0.D(this.f15930g, "Need to call openCaptureSession before using this API.");
        this.f15930g.f16204a.f16245a.stopRepeating();
    }

    public final x1 b() {
        return this;
    }

    public v8.a c(ArrayList arrayList) {
        synchronized (this.f15924a) {
            if (this.f15936m) {
                i.a aVar = new i.a(new CancellationException("Opener is disabled"));
                return aVar;
            }
            d d10 = d.a(j.c(arrayList, this.f15927d, this.f15928e)).d(new v1(this, arrayList), this.f15927d);
            this.f15933j = d10;
            v8.a d11 = i0.f.d(d10);
            return d11;
        }
    }

    public void close() {
        g0.D(this.f15930g, "Need to call openCaptureSession before using this API.");
        b1 b1Var = this.f15925b;
        synchronized (b1Var.f15591b) {
            b1Var.f15593d.add(this);
        }
        this.f15930g.f16204a.f16245a.close();
        this.f15927d.execute(new d.i(this, 3));
    }

    public final void d() {
        t();
    }

    public v8.a<Void> e(CameraDevice cameraDevice, l lVar, List<DeferrableSurface> list) {
        synchronized (this.f15924a) {
            if (this.f15936m) {
                i.a aVar = new i.a(new CancellationException("Opener is disabled"));
                return aVar;
            }
            b1 b1Var = this.f15925b;
            synchronized (b1Var.f15591b) {
                b1Var.f15594e.add(this);
            }
            b.d a10 = b.a(new w1(this, list, new u(cameraDevice, this.f15926c), lVar));
            this.f15931h = a10;
            a aVar2 = new a();
            a10.b(new f.b(a10, aVar2), j7.a.x());
            v8.a<Void> d10 = i0.f.d(this.f15931h);
            return d10;
        }
    }

    public final w.f f() {
        this.f15930g.getClass();
        return this.f15930g;
    }

    public final CameraDevice g() {
        this.f15930g.getClass();
        return this.f15930g.a().getDevice();
    }

    public int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        g0.D(this.f15930g, "Need to call openCaptureSession before using this API.");
        w.f fVar = this.f15930g;
        return fVar.f16204a.a(captureRequest, this.f15927d, captureCallback);
    }

    public v8.a<Void> i() {
        return i0.f.c((Object) null);
    }

    public final int j(ArrayList arrayList, n0 n0Var) {
        g0.D(this.f15930g, "Need to call openCaptureSession before using this API.");
        w.f fVar = this.f15930g;
        return fVar.f16204a.b(arrayList, this.f15927d, n0Var);
    }

    public final void k(x1 x1Var) {
        Objects.requireNonNull(this.f15929f);
        this.f15929f.k(x1Var);
    }

    public final void l(x1 x1Var) {
        Objects.requireNonNull(this.f15929f);
        this.f15929f.l(x1Var);
    }

    public void m(u1 u1Var) {
        b.d dVar;
        synchronized (this.f15924a) {
            try {
                if (!this.f15935l) {
                    this.f15935l = true;
                    g0.D(this.f15931h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f15931h;
                } else {
                    dVar = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        t();
        if (dVar != null) {
            dVar.f17803b.b(new n(3, this, u1Var), j7.a.x());
        }
    }

    public final void n(u1 u1Var) {
        Objects.requireNonNull(this.f15929f);
        t();
        b1 b1Var = this.f15925b;
        b1Var.a(this);
        synchronized (b1Var.f15591b) {
            b1Var.f15594e.remove(this);
        }
        this.f15929f.n(u1Var);
    }

    public void o(x1 x1Var) {
        Objects.requireNonNull(this.f15929f);
        b1 b1Var = this.f15925b;
        synchronized (b1Var.f15591b) {
            b1Var.f15592c.add(this);
            b1Var.f15594e.remove(this);
        }
        b1Var.a(this);
        this.f15929f.o(x1Var);
    }

    public final void p(x1 x1Var) {
        Objects.requireNonNull(this.f15929f);
        this.f15929f.p(x1Var);
    }

    public final void q(u1 u1Var) {
        b.d dVar;
        synchronized (this.f15924a) {
            try {
                if (!this.f15937n) {
                    this.f15937n = true;
                    g0.D(this.f15931h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f15931h;
                } else {
                    dVar = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (dVar != null) {
            dVar.f17803b.b(new f(2, this, u1Var), j7.a.x());
        }
    }

    public final void r(x1 x1Var, Surface surface) {
        Objects.requireNonNull(this.f15929f);
        this.f15929f.r(x1Var, surface);
    }

    public final void s(CameraCaptureSession cameraCaptureSession) {
        if (this.f15930g == null) {
            this.f15930g = new w.f(cameraCaptureSession, this.f15926c);
        }
    }

    public boolean stop() {
        boolean z10;
        boolean z11;
        d dVar = null;
        try {
            synchronized (this.f15924a) {
                if (!this.f15936m) {
                    d dVar2 = this.f15933j;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    this.f15936m = true;
                }
                synchronized (this.f15924a) {
                    z10 = false;
                    if (this.f15931h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (!z11) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            if (dVar != null) {
                dVar.cancel(true);
            }
        }
    }

    public final void t() {
        synchronized (this.f15924a) {
            List<DeferrableSurface> list = this.f15934k;
            if (list != null) {
                j.a(list);
                this.f15934k = null;
            }
        }
    }
}
