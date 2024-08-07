package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.core.impl.DeferrableSurface;
import c0.p0;
import d.i;
import i0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v8.a;
import x.l;
import z.f;
import z.g;
import z.s;

/* compiled from: SynchronizedCaptureSessionImpl */
public final class z1 extends x1 {

    /* renamed from: o  reason: collision with root package name */
    public final Object f15962o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public List<DeferrableSurface> f15963p;

    /* renamed from: q  reason: collision with root package name */
    public d f15964q;

    /* renamed from: r  reason: collision with root package name */
    public final g f15965r;

    /* renamed from: s  reason: collision with root package name */
    public final s f15966s;

    /* renamed from: t  reason: collision with root package name */
    public final f f15967t;

    public z1(Handler handler, b1 b1Var, z.d dVar, z.d dVar2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(b1Var, executor, scheduledExecutorService, handler);
        this.f15965r = new g(dVar, dVar2);
        this.f15966s = new s(dVar);
        this.f15967t = new f(dVar2);
    }

    public static /* synthetic */ void u(z1 z1Var) {
        z1Var.w("Session call super.close()");
        super.close();
    }

    public final a c(ArrayList arrayList) {
        a c10;
        synchronized (this.f15962o) {
            this.f15963p = arrayList;
            c10 = super.c(arrayList);
        }
        return c10;
    }

    public final void close() {
        w("Session call close()");
        s sVar = this.f15966s;
        synchronized (sVar.f17768b) {
            if (sVar.f17767a && !sVar.f17771e) {
                sVar.f17769c.cancel(true);
            }
        }
        i0.f.d(this.f15966s.f17769c).b(new i(this, 4), this.f15927d);
    }

    public final a<Void> e(CameraDevice cameraDevice, l lVar, List<DeferrableSurface> list) {
        ArrayList arrayList;
        a<Void> d10;
        synchronized (this.f15962o) {
            s sVar = this.f15966s;
            b1 b1Var = this.f15925b;
            synchronized (b1Var.f15591b) {
                arrayList = new ArrayList(b1Var.f15593d);
            }
            ca.a aVar = new ca.a(this, 3);
            sVar.getClass();
            d a10 = s.a(cameraDevice, lVar, aVar, list, arrayList);
            this.f15964q = a10;
            d10 = i0.f.d(a10);
        }
        return d10;
    }

    public final int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int h10;
        s sVar = this.f15966s;
        synchronized (sVar.f17768b) {
            if (sVar.f17767a) {
                y yVar = new y(Arrays.asList(new CameraCaptureSession.CaptureCallback[]{sVar.f17772f, captureCallback}));
                sVar.f17771e = true;
                captureCallback = yVar;
            }
            h10 = super.h(captureRequest, captureCallback);
        }
        return h10;
    }

    public final a<Void> i() {
        return i0.f.d(this.f15966s.f17769c);
    }

    public final void m(u1 u1Var) {
        synchronized (this.f15962o) {
            this.f15965r.a(this.f15963p);
        }
        w("onClosed()");
        super.m(u1Var);
    }

    public final void o(x1 x1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        u1 u1Var;
        u1 u1Var2;
        w("Session onConfigured()");
        f fVar = this.f15967t;
        b1 b1Var = this.f15925b;
        synchronized (b1Var.f15591b) {
            arrayList = new ArrayList(b1Var.f15594e);
        }
        b1 b1Var2 = this.f15925b;
        synchronized (b1Var2.f15591b) {
            arrayList2 = new ArrayList(b1Var2.f15592c);
        }
        boolean z11 = true;
        if (fVar.f17747a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            LinkedHashSet<u1> linkedHashSet = new LinkedHashSet<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (u1Var2 = (u1) it.next()) != x1Var) {
                linkedHashSet.add(u1Var2);
            }
            for (u1 u1Var3 : linkedHashSet) {
                u1Var3.b().n(u1Var3);
            }
        }
        super.o(x1Var);
        if (fVar.f17747a == null) {
            z11 = false;
        }
        if (z11) {
            LinkedHashSet<u1> linkedHashSet2 = new LinkedHashSet<>();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext() && (u1Var = (u1) it2.next()) != x1Var) {
                linkedHashSet2.add(u1Var);
            }
            for (u1 u1Var4 : linkedHashSet2) {
                u1Var4.b().m(u1Var4);
            }
        }
    }

    public final boolean stop() {
        boolean z10;
        boolean stop;
        synchronized (this.f15962o) {
            synchronized (this.f15924a) {
                if (this.f15931h != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f15965r.a(this.f15963p);
            } else {
                d dVar = this.f15964q;
                if (dVar != null) {
                    dVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }

    public final void w(String str) {
        p0.a("SyncCaptureSessionImpl");
    }
}
