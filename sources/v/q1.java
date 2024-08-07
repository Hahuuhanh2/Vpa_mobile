package v;

import al.g0;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.j;
import androidx.camera.core.impl.u;
import c0.b0;
import c0.j0;
import c0.p0;
import c0.t0;
import d.h;
import f0.c;
import i0.a;
import i0.f;
import i0.i;
import java.util.List;
import java.util.Objects;
import v.r1;
import x.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q1 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15805a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f15806b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15807c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f15808d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f15809e;

    public /* synthetic */ q1(ca.a aVar, CameraDevice cameraDevice, l lVar, List list) {
        this.f15807c = aVar;
        this.f15806b = cameraDevice;
        this.f15808d = lVar;
        this.f15809e = list;
    }

    public /* synthetic */ q1(r1 r1Var, u uVar, CameraDevice cameraDevice, a2 a2Var) {
        this.f15807c = r1Var;
        this.f15808d = uVar;
        this.f15806b = cameraDevice;
        this.f15809e = a2Var;
    }

    public final v8.a apply(Object obj) {
        v8.a d10;
        switch (this.f15805a) {
            case 0:
                r1 r1Var = (r1) this.f15807c;
                u uVar = (u) this.f15808d;
                CameraDevice cameraDevice = this.f15806b;
                a2 a2Var = (a2) this.f15809e;
                List list = (List) obj;
                r1Var.getClass();
                p0.a("ProcessingCaptureSession");
                if (r1Var.f15824h == 5) {
                    return new i.a(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                if (list.contains((Object) null)) {
                    d10 = new i.a(new DeferrableSurface.SurfaceClosedException(uVar.b().get(list.indexOf((Object) null)), "Surface closed"));
                } else {
                    boolean z10 = false;
                    for (int i10 = 0; i10 < uVar.b().size(); i10++) {
                        DeferrableSurface deferrableSurface = uVar.b().get(i10);
                        if (Objects.equals(deferrableSurface.f1322j, t0.class)) {
                            new c(deferrableSurface.c().get(), new Size(deferrableSurface.f1320h.getWidth(), deferrableSurface.f1320h.getHeight()), deferrableSurface.f1321i);
                        } else if (Objects.equals(deferrableSurface.f1322j, j0.class)) {
                            new c(deferrableSurface.c().get(), new Size(deferrableSurface.f1320h.getWidth(), deferrableSurface.f1320h.getHeight()), deferrableSurface.f1321i);
                        } else if (Objects.equals(deferrableSurface.f1322j, b0.class)) {
                            new c(deferrableSurface.c().get(), new Size(deferrableSurface.f1320h.getWidth(), deferrableSurface.f1320h.getHeight()), deferrableSurface.f1321i);
                        }
                    }
                    r1Var.f15824h = 2;
                    try {
                        j.b(r1Var.f15821e);
                        p0.g("ProcessingCaptureSession");
                        try {
                            u f10 = r1Var.f15817a.f();
                            r1Var.f15823g = f10;
                            f10.b().get(0).d().b(new p1(r1Var, 1), j7.a.x());
                            for (DeferrableSurface next : r1Var.f15823g.b()) {
                                r1.f15815l.add(next);
                                next.d().b(new h(next, 5), r1Var.f15818b);
                            }
                            u.f fVar = new u.f();
                            fVar.a(uVar);
                            fVar.f1398a.clear();
                            fVar.f1399b.f1365a.clear();
                            fVar.a(r1Var.f15823g);
                            if (fVar.f1408j && fVar.f1407i) {
                                z10 = true;
                            }
                            g0.y("Cannot transform the SessionConfig", z10);
                            u b10 = fVar.b();
                            y0 y0Var = r1Var.f15820d;
                            cameraDevice.getClass();
                            d10 = y0Var.d(b10, cameraDevice, a2Var);
                            d10.b(new f.b(d10, new r1.a()), r1Var.f15818b);
                        } catch (Throwable th2) {
                            j.a(r1Var.f15821e);
                            throw th2;
                        }
                    } catch (DeferrableSurface.SurfaceClosedException e10) {
                        return new i.a(e10);
                    }
                }
                return d10;
            default:
                List list2 = (List) obj;
                return q1.super.e(this.f15806b, (l) this.f15808d, (List) this.f15809e);
        }
    }
}
