package w;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.appcompat.app.p;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import d.d;
import h0.g;
import java.util.Set;
import java.util.concurrent.Executor;
import v.n;
import v.u;
import w.d0;

/* compiled from: CameraManagerCompat */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final b f16259a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap f16260b = new ArrayMap(4);

    /* compiled from: CameraManagerCompat */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f16261a;

        /* renamed from: b  reason: collision with root package name */
        public final CameraManager.AvailabilityCallback f16262b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f16263c = new Object();

        /* renamed from: d  reason: collision with root package name */
        public boolean f16264d = false;

        public a(g gVar, u.b bVar) {
            this.f16261a = gVar;
            this.f16262b = bVar;
        }

        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f16263c) {
                if (!this.f16264d) {
                    this.f16261a.execute(new d(this, 7));
                }
            }
        }

        public final void onCameraAvailable(String str) {
            synchronized (this.f16263c) {
                if (!this.f16264d) {
                    this.f16261a.execute(new p(9, this, str));
                }
            }
        }

        public final void onCameraUnavailable(String str) {
            synchronized (this.f16263c) {
                if (!this.f16264d) {
                    this.f16261a.execute(new n(5, this, str));
                }
            }
        }
    }

    /* compiled from: CameraManagerCompat */
    public interface b {
        void a(u.b bVar);

        void b(String str, g gVar, CameraDevice.StateCallback stateCallback);

        void c(g gVar, u.b bVar);

        CameraCharacteristics d(String str);

        Set<Set<String>> e();
    }

    public z(d0 d0Var) {
        this.f16259a = d0Var;
    }

    public static z a(Context context, Handler handler) {
        d0 d0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d0Var = new c0(context);
        } else if (i10 >= 29) {
            d0Var = new b0(context);
        } else if (i10 >= 28) {
            d0Var = new a0(context);
        } else {
            d0Var = new d0(context, new d0.a(handler));
        }
        return new z(d0Var);
    }

    public final t b(String str) {
        t tVar;
        synchronized (this.f16260b) {
            tVar = (t) this.f16260b.get(str);
            if (tVar == null) {
                try {
                    t tVar2 = new t(this.f16259a.d(str), str);
                    this.f16260b.put(str, tVar2);
                    tVar = tVar2;
                } catch (AssertionError e10) {
                    throw new CameraAccessExceptionCompat(e10.getMessage(), e10);
                }
            }
        }
        return tVar;
    }
}
